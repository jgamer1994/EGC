package org.egc;

/**
 * Hello world!
 *
 */
public class App 
{
	public void bar() {
		
        //FIXME: error PMD de variable local no usada
		/* Unused local variable. */
		String foo = "";
		String bar = "";

        //FIXME: error PMD de los bloques try y catch vacios
		try{
        	/* Empty try blocks */
        }catch(Exception e){
        	/* Empty catch blocks */
        }

        if (bar == "foo") bar = "bar";

        //FIXME: error PMD del if
        /* If statement that is always true or always false */
        if (true)
        	bar = "IfStmtsMustUseBraces";
        else
        	bar = "bar";
	}

    //TODO:metodo para controlar el mundo
	
    public static void main( String[] args ) {
        System.out.println("alemurrod");
    }
}
