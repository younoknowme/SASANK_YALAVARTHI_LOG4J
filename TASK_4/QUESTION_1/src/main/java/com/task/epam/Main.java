package com.task.epam;
import java.io.IOException;

import org.apache.log4j.Logger;

public class Main {
	private static  final Logger logger  = Logger.getLogger("Main.class");
    public static void main(String[] args) throws IOException {

        //simple Interest Class Object Creation
        SimpleInterest simpleInterestObject = new SimpleInterest();

        //method that prints simple Interest
        simpleInterestObject.calculateSimpleInterest();

        //Compound Interest Class Object Creation
        CompoundInterest compoundInterestObject = new CompoundInterest();

        //Method that prints Compound Interest
        compoundInterestObject.calculateCompoundInterest();
    }
}
