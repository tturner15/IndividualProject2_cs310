package edu.jsu.mcis.cs310.dbtest;


import static edu.jsu.mcis.cs310.dbtest.DatabaseTest.getJSONData;
import org.json.simple.JSONArray;


public class Main {
     
        public static void main(String[] args) {
                // Convert DataBase to JSON; 
        
        System.out.println("CONVERSION RESULTS (DataBase to JSON)");
        System.out.println("================================");

        //String json = Converter.csvToJson(csvFileString);
        JSONArray json = getJSONData();
        System.out.println(json);
    }
}

