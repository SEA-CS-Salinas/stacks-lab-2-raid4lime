//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Casey Martinez

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp; // expression to check
	private Stack<Character> symbols; //stack the holds opening symbols

    // default constructor
	public SyntaxChecker()
	{
		exp = "";
		symbols = new Stack<>();
		
	}
	
    // constructor with parameter
	public SyntaxChecker(String s)
	{
		exp = s;
		symbols = new Stack<>();
	}
	
	//method to set expression
	public void setExpression(String s)
	{
	    exp = s;
		symbols = new Stack<>();
	}

    // Method to check if the expression has balanced symbols
	public boolean checkExpression()
	{
	    String opening = "{([<"; // opening symbols
	    String closing = "})]>"; // closing symbols
	    
	    for(char ch : exp.toCharArray()) 
	    {
	       if (opening.indexOf(ch) != -1) // if theres an opening symbol add to the stack
	       {
	           symbols.push(ch);
	       }
	       else if (closing.indexOf(ch) != -1) // if theres an closing symbol add to the stack
	       {
	           if (symbols.isEmpty())
	           {
	               return false; // if theres no symbol doesnt work
	           }
	           
	           char top = symbols.pop(); // Get the last opened symbol and checks if they match
	           if (opening.indexOf(top) != closing.indexOf(ch)) 
	           {
	               return false;
	           }
	       }
	}
	return symbols.isEmpty(); // if the stack is empty its correct
	
}
	
	// returns the the result
	public String toString()
	{
	    
	    if (checkExpression())
	    {
	        return exp + " is correct.\n";
	    }
	    else
	    {
	       return exp + " is incorrect.\n";
	    }
	}
}
