package org.alemurrod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App 
{
	public void bar() {
		
		String bar = "";		

        if (bar == "foo"){
        	bar = "bar";
        }
    } 

    //TODO:metodo para controlar el mundo
	
    public static void main( String[] args ) {

    	/* Uso de la libreria SLF4J */
        Logger slf4jLogger = LoggerFactory.getLogger(App.class);
        slf4jLogger.info("Hello world");

        System.out.println("alemurrod");
    }
}
