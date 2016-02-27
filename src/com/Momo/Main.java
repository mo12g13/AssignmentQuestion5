package com.Momo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner  input = new Scanner(System.in);
        ArrayList <String> mynew = new ArrayList<>();
        int j =0;
        FileReader readThisFile = new FileReader("coffee.txt");
        BufferedReader report = new BufferedReader(readThisFile);
        String line = report.readLine();
        while (line != null){
            mynew.add(line);
            line = report.readLine();
        }
        System.out.println("How many cappuccino drinks were sold today?");
        int cappuccinoDrink = input.nextInt();
        double capexpenses = cappuccinoDrink*1.56;
        double capRevenue = cappuccinoDrink*3.50;
        double capProfit = capRevenue-capexpenses;

        System.out.println("How many espresso drinks were sold today?");
        int espressoDrink = input.nextInt();
        double espExpenses = espressoDrink*0.95;
        double  espRevenue = espressoDrink*1.50;
        double espProfit = espRevenue-espExpenses;

        System.out.println("How many latte drinks were sold today?");
        int latte = input.nextInt();
        double lattExpenses = latte*1.67;
        double latteRevenue = latte*3.75;
        double lattProfit = latteRevenue-lattExpenses;

        System.out.println("How many black tea drinks were sold today?");
        int  blackTea = input.nextInt();
        double blackExpenses = blackTea*0.35;
        double blackRevenues = blackTea*1.79;
        double blackProfit = blackRevenues-blackExpenses;

        System.out.println("How many herbal tea drinks were sold today?");
        int herbTea = input.nextInt();
        double herbExpenses = herbTea*0.35;
        double herbRevenue = herbTea*2.09;
        double herbProfit = herbRevenue-herbExpenses;

        System.out.println("How many macchiato drinks were sold today?");
        int macchiatoTea = input.nextInt();
        double maccExpenses = macchiatoTea*1.45;
        double maccRevenue = macchiatoTea*2.75;
        double maccProfit = maccRevenue-maccExpenses;
        System.out.println("How many americano drinks were sold today?");

        int americano = input.nextInt();
        double ameriExpenses = americano* 0.70;
        double ameriRevenue = macchiatoTea*2.65;
        double ameriProfit = ameriRevenue-ameriExpenses;

        System.out.println("How many cold press drinks were sold today?");
        int  coldPress = input.nextInt();
        double coldExpenses = coldPress*0.50;
        double coldRevenue = coldPress*2.50;
        double coldProfit = coldRevenue-coldExpenses;

        System.out.println("How many hot chocolate drinks were sold today?");
        int hotchololate = input.nextInt();
        double hotExpenses = hotchololate*0.65;
        double hotRevenue = herbTea*2.25;
        double hotProfit = hotRevenue-hotExpenses;

        System.out.println("How many coffee drinks were sold today?");
        int cofee = input.nextInt();
        double coffeeExpenses = cofee*0.25;
        double coffeeRevenue = cofee*1.65;
        double coffeeProfit = coffeeRevenue-coffeeExpenses;

        System.out.println("How many chai tea were sold today?");
        int  chaiTea = input.nextInt();
        double chaiExpenses = chaiTea*1.23;
        double chaiRevenue = chaiTea* 3.50;
        double chaiProfit = chaiRevenue-chaiExpenses;

        System.out.println("How many mocha were sold today?");
        int mocha = input.nextInt();
        double mochaExpenses = mocha*1.45;
        double mochaRevenue = mocha*3.70;
        double mochProfit = mochaRevenue-mochaExpenses;
        


        FileWriter salereport = new FileWriter("sale.txt");
        salereport.write(String.format("Cappuccino: Sold %d, Expenses, $%.2f, Revenue $%.2f, Profit $%.2f%n", cappuccinoDrink
                ,capexpenses, capRevenue, capProfit));
        salereport.write(String.format("Espresso: Sold %d Expenses $%.2f, Revenue %.2f, Profit $%.2f%n", espressoDrink, espExpenses,
                espRevenue, espProfit));

        salereport.write(String.format("Latte: Sold %d, Expenses $%.2f, Revenue $%.2f, Profit $%.2f%n", latte,
                lattExpenses,latteRevenue, lattProfit ));

        salereport.write(String.format("Black Tea: Sold %d, Expenses $ %.2f, Revenue $%.2f, Profit $%.2f%n",blackTea
                ,blackExpenses, blackRevenues, blackProfit));

        salereport.write(String.format("Herbal tea: Sold %d, Expenses $ %,2f, Revenue $  %.2f" +
                "Profit $%.2f%n", herbTea,herbExpenses, herbRevenue,  herbProfit));

        salereport.write(String.format("Macchiato: Sold %d, Expenses $%.2f, Revenue $ %.2f, Profit $ %.2f%n",
                macchiatoTea, maccExpenses, maccRevenue ,maccProfit));

        salereport.write(String.format("Americano: Sold %d, Expenses $%.2f, Revenue $ %.2f, Profit $ %.2f%n",
                americano, ameriExpenses, ameriRevenue ,ameriProfit));

        salereport.write(String.format("Cold press: Sold %d, Expenses $%.2f, Revenue, $%.2f, Profit $%.2f%n",
                coldPress,coldExpenses, coldRevenue,  coldProfit));

        salereport.write(String.format("Hot chocolate: Sold %d, Expenses $ %.2f, Revenue $ %.2f, Profit $ %.2f%n"
                , hotchololate, hotExpenses, hotRevenue, hotProfit));

        salereport.write(String.format("Coffee : Sold %d, Expenses $ %.2f, Revenue $ %.2f, Profit $ %.2f%n",cofee,
                coffeeExpenses, coffeeRevenue, coffeeProfit));

        salereport.write(String.format("Chai tea : Sold %d, Expenses $%.2f, Revenue $%.2f, Profit $%.2f%n"
                ,chaiTea, chaiExpenses,chaiRevenue, chaiRevenue));

        salereport.write(String.format("Mocha : Sold %d, Expenses $.2%f, Revenue $%.2f, Profit $%.2f%n "
                , mocha ,mochaExpenses, mochaRevenue, mochProfit));
        salereport.close();



















    }
}

