//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Casey Martinez
/*Lab Description :   Read in a group of symbols and check to see if the appropriate opening symbol correctly matches up with the appropriate closing symbol.  
The opening symbols are “{(<[“ and the appropriate closing symbols are “})>]“.

You must read in and analyze each group.  

If you were to read in {[]}, you would have a correct balance of opening and closing symbols.
If you were to read in {[}], you would not have a correct balance of opening and closing symbols.


Sample Data : 
(abc(*def) 
[{}]
[
[{<()>}]
{<html[value=4]*(12)>{$x}}
[one]<two>{three}(four)
car(cdr(a)(b)))
car(cdr(a)(b))


Sample Output :
(abc(*def) is incorrect.

[{}] is correct.

[ is incorrect.

[{<()>}] is correct.

{<html[value=4]*(12)>{$x}} is correct.

[one]<two>{three}(four) is correct.

car(cdr(a)(b))) is incorrect.

car(cdr(a)(b)) is correct.
*/


import java.util.Stack;
import static java.lang.System.*;

public class SyntaxCheckRunner
{
	public static void main ( String[] args )
	{
	
	// testCases we are checking for
         String[] testCases = {
            "(abc(*def)", 
            "[{}]", 
            "[", 
            "[{<()>}]", 
            "{<html[value=4]*(12)>{$x}}", 
            "[one]<two>{three}(four)", 
            "car(cdr(a)(b)))", 
            "car(cdr(a)(b))"
        };
        
        //Loops through each test and checks it
        for(String test : testCases)
        {
            SyntaxChecker checker = new SyntaxChecker(test); // makes an object
            System.out.println(checker); // prints result
        }
    }
}
