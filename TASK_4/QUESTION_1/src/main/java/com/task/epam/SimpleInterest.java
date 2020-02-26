package com.task.epam;
import java.io.*;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class SimpleInterest {
	private static  final Logger logger  = Logger.getLogger("SimpleInterest.class");
    public void calculateSimpleInterest() throws IOException {

       //Scanner Object
        Scanner scannerObject = new Scanner(System.in);

        //Input values to Calculate Simple Interest
        logger.info("Input to Calculate Simple Interest");
        logger.info(" what is principal Income");
        double principalIncome = scannerObject.nextDouble();

        logger.info("Input rateOfInterest");
        double rateOfInterest = scannerObject.nextDouble();

        logger.info("Input Number Of Years");
        double numberOfYears =  scannerObject.nextDouble();

        double simpleInterest = (principalIncome * rateOfInterest * numberOfYears)/100.0;

        logger.info("The Simple Interest is ="+simpleInterest);

    }

}
