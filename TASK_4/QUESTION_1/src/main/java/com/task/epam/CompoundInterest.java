package com.task.epam;
import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class CompoundInterest {
	private static  final Logger logger  = Logger.getLogger("CompoundInterest.class");
    protected  void calculateCompoundInterest() throws IOException {

        Scanner scannerObject = new Scanner(System.in);
        //Input values to Calculate Compound Interest
        logger.info("Input to Calculate Compound Interest");
        logger.info("Input Principal Amount");
        double principalAmount = scannerObject.nextDouble();

        logger.info("Input Interest Rate");
        double interestRate = scannerObject.nextDouble();

        logger.info("Input time period");
        double timePeriod =  scannerObject.nextDouble();


        double temporaryVariable = Math.pow((1+(interestRate/100)), timePeriod);

        double compoundInterest = principalAmount * temporaryVariable;


        logger.info("The Compound Interest is = "+compoundInterest);
    }
}
