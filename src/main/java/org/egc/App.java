package org.egc;

/**
 * Hello world!
 *
 */
public class App 
{
	public void bar() {
		
		/* Unused local variable. */
		String foo = "";
		String bar = "";

		try{
        	/* Empty try blocks */
        }catch(Exception e){
        	/* Empty catch blocks */
        }

        if (bar == "foo") bar = "bar";

        /* If statement that is always true or always false */
        if (true)
        	bar = "IfStmtsMustUseBraces";
        else
        	bar = "bar";
	}
	
    public static void main( String[] args ) {
        System.out.println("alemurrod");
    }
}
