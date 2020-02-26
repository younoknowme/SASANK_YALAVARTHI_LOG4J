package com.task.epam1;

import java.io.IOException;

import org.apache.log4j.Logger;

public class Main {
	private static final Logger logger = Logger.getLogger("Main.class");
    public static void main(String[] args) throws IOException {

        //Initializing ConstructionCost Object
        ConstructionCost constructionCostObject = new ConstructionCost();

        //Calling the construction cost calculator Method
        constructionCostObject.constructionCostCalculator();

    }
}

