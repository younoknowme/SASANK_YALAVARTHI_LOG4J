package com.task.epam1;

import java.io.*;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class ConstructionCost {

	private static final Logger logger  = Logger.getLogger("ConstructionCost.class");
    protected void constructionCostCalculator() throws IOException {

        //Scanner Object
        Scanner scannerObject = new Scanner(System.in);

        //input prompt
        logger.info("Enter the material Standard you want to use to construct the house");

        logger.info("1. Standard Material"+"\n"+
                    "2. Above Standard Material"+"\n"+
                    "3. High Standard Material"+"\n"+
                    "4. High Standard Material and Fully Automated Home"+"\n"
        );
        int variableToUseInSwitchCase = Integer.parseInt(scannerObject.next());

        //input for total area
        logger.info("Input the total Area");
        double totalArea  = Double.parseDouble(scannerObject.next());

        //initializing cost for total area variable
        double costForTotalArea = 0;

        switch (variableToUseInSwitchCase){
            case 1:
                costForTotalArea = 1200 * totalArea;
                break;
            case 2:
                costForTotalArea = 1500 * totalArea;
                break;
            case 3:
                costForTotalArea = 1800 * totalArea;
                break;
            case 4:
                costForTotalArea = 2500 * totalArea;
                break;

        }
        logger.info(costForTotalArea);


        //closing input stream
        scannerObject.close();

    }
}
