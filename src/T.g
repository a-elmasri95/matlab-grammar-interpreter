grammar T;

options{
language = Java;
backtrack = true;
}

@header{    //note that the MathObject class files of assignment 1 are in the assignment3 Folder
import java.util.HashMap;
import java.util.Vector;
}

@members{
int variableCount = 0;
Map memory  =  new HashMap<String,MathObject>();

//method for assigning MathObject to a String
public void AssignVar(String var,MathObject b)
{
  memory.put(var,b);
}

//method that returns value of Variable
public MathObject retVarVal(String var)
{ 
  return (MathObject)(memory.get(var));
}

}

//note that the parser is predicting starting at rule prog and matching from  left to right
//note that I did not utilize the MathFunctions because it was more difficult to implement semantic wise...

prog	: 		stat+ EOF
	;
stat	:		assignment
	|		sequenceassignment 
	|		soloexpr
	|		matrixassignment
	|		function
	;

assignment:		ex1=ID '=' ex2=expr assignmenttail
			{
				System.out.println($ex1.text + "=\n\t" + $ex2.value); //just testing 
				if (!(memory.containsKey($ex1.text)))
				{	
					MathScalar sc = new MathScalar($ex2.value); //USING MATHSCALAR since assignment is for  scalars
					AssignVar($ex1.text,sc); 
					variableCount++;
				}			
				//otherwise update key's object
				//else{//not needed for input}
			} 	

	;

sequenceassignment:	ex1=ID '=' ex2=expr ':' ex3=expr assignmenttail		
			{
		//	  System.out.print($ex1.text + "=\n\t");
		//	  for(double i=$ex2.value;i<=$ex3.value;i++)
		//	  {
		//	    System.out.print(i+"\t");
		//	  }
			  MathScalar m1 = new MathScalar($ex2.value);
			  MathScalar m2 = new MathScalar($ex3.value);
			  MathMatrix mx = MathOp.createSequence(m1,m2);
			  AssignVar($ex1.text,mx);
			  variableCount++;
			}	
	;

matrixassignment:	idd=ID '=' '[' d1=Digit d2=Digit ';' d3=Digit d4=Digit ']' NEWLINE
			{ 
				if (!(memory.containsKey($idd.text)))
				{	
					double D1 = new Double($d1.text).doubleValue();
					double D2 = new Double($d2.text).doubleValue();
					double D3 = new Double($d3.text).doubleValue();
					double D4 = new Double($d4.text).doubleValue();
					double[][] arr = {{D1,D2},{D3,D4}};
					MathMatrix mxx = new MathMatrix(arr);
					AssignVar($idd.text,mxx); 
					variableCount++;
					System.out.print($idd.text+"=");
				  	for(int i=0;i<mxx.getMatrix().length;i++)
					  {
					      System.out.print("\n\t");
					      for(int j=0;j<mxx.getMatrix()[0].length;j++)
					    {
					       System.out.print(mxx.getMatrix()[j][i] +" ");
					    }
					  }
					System.out.println();
				}				  
			}

	|		i1=ID '=' '[' b1=Digit b2=Digit ';' b3=Digit b4=Digit ']' ';' NEWLINE
			{
					double B1 = new Double($b1.text).doubleValue();
					double B2 = new Double($b2.text).doubleValue();
					double B3 = new Double($b3.text).doubleValue();
					double B4 = new Double($b4.text).doubleValue();
					double[][] arrr = {{B1,B2},{B3,B4}};
					MathMatrix mxx = new MathMatrix(arrr);
					AssignVar($i1.text,mxx); 
					variableCount++;			  
			}
	;

soloexpr:		/*expr instead*/ID NEWLINE 
			{
			  if(memory.get($ID.text) instanceof MathMatrix)
			{
			  MathMatrix m = (MathMatrix)memory.get($ID.text);
			  System.out.print("Ans "+"=\n\t");
			  for(int i=0;i<m.getMatrix().length;i++)
			  {
			      for(int j=0;j<m.getMatrix()[0].length;j++)
			    {
			       System.out.print(m.getMatrix()[j][i] +"\t");
			    }
			  }
			  System.out.println("\n");
			}
			}
	|		ID ';' NEWLINE
	;		

function:		// idf=ID '(' (atom) (',' atom)* ')' assignmenttail //recheck if this is correct form
			idf=ID '(' d1=Digit ',' d2=Digit ')' assignmenttail
			{
			  if(memory.containsKey($idf.text))
			    {
			      if(retVarVal($idf.text) instanceof MathMatrix)
				{
				    int D1 = new Integer($d1.text).intValue();
				    int D2 = new Integer($d2.text).intValue();
				    MathMatrix mxm = (MathMatrix)retVarVal($idf.text);
				    System.out.print("Ans "+"=\n\t" + mxm.getMatrix()[D1][D2] +"\n");
				}
			    }
			}	

	|		'size' '(' idff=ID ',' dg=Digit ')' assignmenttail	
			{
			  if(memory.containsKey($idff.text))
			    {
			        if(memory.get($idff.text) instanceof MathMatrix)
				{
				    int D1 = new Integer($dg.text).intValue();
				    MathMatrix mxm = (MathMatrix)memory.get($idff.text);
				    if(mxm!=null)
				    System.out.println("Ans "+"=\n\t" + (double)mxm.getMatrix()[D1-1].length +"\n");
				}
			    }
			}

	|		'size' '(' idfff=ID ')' assignmenttail
			{
			  if(memory.containsKey($idfff.text))
			    {
			        if(memory.get($idfff.text) instanceof MathMatrix)
				{
				    MathMatrix mxmx = (MathMatrix)memory.get($idfff.text);
				    if(mxmx!=null)
				    System.out.println("Ans "+"=\n\t" + (double)mxmx.rowsize +"  " + (double)mxmx.columnsize + "\n");
				}
			    }
			}

	|		'disp' '(' idffff=ID ')' assignmenttail
			{
			  if(memory.containsKey($idffff.text))
			    {
			        if(memory.get($idffff.text) instanceof MathMatrix)
				{
				    MathMatrix mxmxm = (MathMatrix)memory.get($idffff.text);
				    if(mxmxm!=null)
				    System.out.println($idffff.text + "=\n" + mxmxm);
				}
			    }
			}	
	;


assignmenttail:		NEWLINE //print value of expression
	|		';' NEWLINE
	;	

		


expr returns [double value]: 	t1=term '+' e1=expr
				{
				  $value = $t1.value + $e1.value;
				}

	|			t2=term '-' e2=expr
				{
				  $value = $t2.value - $e2.value;
				}
	|			t3=term
				{
				  $value = $t3.value;
				}


	;


term returns [double value]:	a1=atom '*' t1=term
				{
				  $value = $a1.value * $t1.value;
				}
	
	|			 a2=atom '/' t2=term
				{
				  $value = $a1.value / $t2.value;
				}

	|			atom 
				{
				  $value = $atom.value;
				}

	;

//should return [MathObject MA] and then use MathFunctions
atom returns [double value]:	d=Digit    
				{$value = new Double($d.text).doubleValue();}
	|			d1=Digit d2=Digit
				{
				  $value = new Double($d1.text+$d2.text).doubleValue();
				}
	|			ID	
	|			'(' e1=expr ')'
				{
				  $value = $e1.value;
				}
	|			';' //CAN REMOVE!!!! dunno why i put
	;


ID returns [double value]:		/*id1=*/Letter+(Digit)*
//					{
//					  if (memory.containsKey($id1.text))
//				            {
//						if(memory.get($id1.text) instanceof MathScalar)
//						{
//						  MathScalar msc = (MathScalar)retVarVal($id1.text);	
//					  	  $value = msc.getScalar();
//						}
//						else if(memory.get($id1.text) instanceof MathMatrix)
//						{
//						  MathMatrix msc = (MathMatrix)retVarVal($id1.text);	
//					  	  $value = msc.getScalar();
//						}
//
//					    }
//					  else {$value = null;}
//						
//					}
	;


Letter	:		('a'..'z' | 'A'..'Z')
	;


Digit	:		('0'..'9')
	;


WS  	:   		(' '|'\t')+ {skip();} 
	;

CR	:		'\r'		
	;
LF	:		'\n'
	;
NEWLINE	:		(CR | LF)+		
	;
