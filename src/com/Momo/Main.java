package com.Momo;

import com.sun.xml.internal.ws.api.WSService;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(System.in);
        int cappuccinoDrink = 0, espressoDrink=0, latte=0, blackTea=0, herbTea=0, macchiatoTea=0, americano=0, coldPress=0, hotchololate =0;
        double capexpenses=0, capRevenue=0, capProfit=0, espExpenses=0, espRevenue=0, espProfit=0, herbExpenses=0, herbRevenue=0;
        double lattExpenses=0, latteRevenue=0, lattProfit=0, blackExpenses=0, blackRevenues=0, blackProfit=0, herbProfit=0, coldProfit=0;
        double maccExpenses=0, maccRevenue=0, maccProfit=0, ameriExpenses=0, ameriProfit=0, ameriRevenue=0, coldExpenses=0, coldRevenue=0;
        int coffee=0, chaiTea=0, mocha=0;
        double hotExpenses=0, hotRevenue=0, hotProfit=0, coffeeExpenses=0, coffeeRevenue=0, coffeeProfit=0, chaiExpenses=0, chaiRevenue=0, chaiProfit=0, mochaExpenses=0, mochProfit=0, mochaRevenue=0;
        int count = -1;

        ArrayList<String> mynew = new ArrayList<>();
        boolean bool1 = true, bool2=true, bool3 = true, bool4 = true, bool5=true, bool6 =true, bool7=true;
        boolean bool8 =  true, bool9=true, bool10=true, bool11 = true, bool12 = true;
        try {

            FileReader readThisFile = new FileReader("coffee.txt");
            BufferedReader report = new BufferedReader(readThisFile);
            String line = report.readLine();
            while (line != null) {
                mynew.add(line);
                line = report.readLine();
            }
        } catch (IOException e) {
            System.out.println("File Not Found!");
        }


do {
    try{

    System.out.println("How many cappuccino drinks were sold today?");

        cappuccinoDrink = input.nextInt();
        if(cappuccinoDrink>0) {
            capexpenses = cappuccinoDrink * 1.56;
            capRevenue = cappuccinoDrink * 3.50;
            capProfit = capRevenue - capexpenses;
           bool1 = false;
        }
    }catch (InputMismatchException e) {


        input.nextLine();
        System.out.println("Please enter integer");
       }
}while (bool1);

        do {
            try {
                System.out.println("How many espresso drinks were sold today?");
                espressoDrink=input.nextInt();
                if(espressoDrink>0) {
                    espExpenses = espressoDrink * 0.95;
                    espRevenue = espressoDrink * 1.50;
                    espProfit = espRevenue - espExpenses;
                    bool2 = false;
                }
            }catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Please enter an Integer");

            }


        }while (bool2);

do {
    try {


        System.out.println("How many latte drinks were sold today?");
        latte = input.nextInt();
        if(latte>0) {
            lattExpenses = latte * 1.67;
            latteRevenue = latte * 3.75;
            lattProfit = latteRevenue - lattExpenses;
            bool3 = false;
        }
    }catch (InputMismatchException e){
        input.nextLine();
        System.out.println("Please enter an Integer");

    }
}while(bool3);

        do { try {


            System.out.println("How many black tea drinks were sold today?");
            blackTea = input.nextInt();
            if(blackTea>0){
            blackExpenses = blackTea * 0.35;
            blackRevenues = blackTea * 1.79;
            blackProfit = blackRevenues - blackExpenses;
            bool4 = false;
            }
        }catch (InputMismatchException e){
            input.nextLine();
            System.out.println("Please enter an integer");
        }
        }while(bool4);

        do {
            try {

                System.out.println("How many herbal tea drinks were sold today?");
                herbTea = input.nextInt();
                if(herbTea>0) {
                    herbExpenses = herbTea * 0.35;
                    herbRevenue = herbTea * 2.09;
                    herbProfit = herbRevenue - herbExpenses;
                    bool5 = false;
                }
            }
            catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Please enter intger");
            }
        }while(bool5);

        do {
            try {

                System.out.println("How many macchiato drinks were sold today?");
                macchiatoTea = input.nextInt();
                if(macchiatoTea >0) {
                    maccExpenses = macchiatoTea * 1.45;
                    maccRevenue = macchiatoTea * 2.75;
                    maccProfit = maccRevenue - maccExpenses;
                    bool6= false;
                }

            }catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Please enter an integer");
            }
        }while (bool6);

        do {
            try {
                System.out.println("How many americano drinks were sold today?");
                americano = input.nextInt();
                if(americano>0) {
                    ameriExpenses = americano * 0.70;
                    ameriRevenue = americano * 2.65;
                    ameriProfit = ameriRevenue - ameriExpenses;
                    bool7 = false;
                }
            }catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Please enter an integer");
            }
        }while (bool7);
        do {
            try {

                System.out.println("How many cold press drinks were sold today?");
                coldPress = input.nextInt();
                if(coldPress >0) {
                    coldExpenses = coldPress * 0.50;
                    coldRevenue = coldPress * 2.50;
                    coldProfit = coldRevenue - coldExpenses;
                    bool8 = false;
                }
            }catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Please enter an integer");
            }
        }while (bool8);

        do {
            try {

                System.out.println("How many hot chocolate drinks were sold today?");

                hotchololate = input.nextInt();
                if(hotchololate>0) {
                    hotExpenses = hotchololate * 0.65;
                    hotRevenue = herbTea * 2.25;
                    hotProfit = hotRevenue - hotExpenses;
                    bool9=false;
                }
            }catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Please enter integer");
            }
        }while (bool9);

        do {
            try {

                System.out.println("How many coffee drinks were sold today?");

                    coffee = input.nextInt();
                    if(coffee>0) {
                        coffeeExpenses = coffee * 0.25;
                        coffeeRevenue = coffee * 1.65;
                        coffeeProfit = coffeeRevenue - coffeeExpenses;
                        bool10 = false;
                    }

            }catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Please enter an integer");
            }
        }while (bool10);

        do {try {


            System.out.println("How many chai tea were sold today?");
            chaiTea = input.nextInt();
            if(chaiTea>0) {
                chaiExpenses = chaiTea * 1.23;
                chaiRevenue = chaiTea * 3.50;
                chaiProfit = chaiRevenue - chaiExpenses;
                bool11 = false;
            }
        }catch (InputMismatchException e){
            input.nextLine();
            System.out.println("Please enter an integer");
        }
        }while (bool11);

        do {
            try {


                System.out.println("How many mocha were sold today?");

                mocha = input.nextInt();
                if(mocha>0){
                    mochaExpenses = mocha * 1.45;
                    mochaRevenue = mocha * 3.70;
                    mochProfit = mochaRevenue - mochaExpenses;
                    bool12 = false;
                }
            }catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Please enter an integer");
            }
        }while (bool12);


                FileWriter salereport = new FileWriter("sale.txt");
                salereport.write(String.format("Cappuccino: Sold %d, Expenses, $%.2f, Revenue $%.2f, Profit $%.2f%n", cappuccinoDrink
                        , capexpenses, capRevenue, capProfit));
                salereport.write(String.format("Espresso: Sold %d Expenses $%.2f, Revenue %.2f, Profit $%.2f%n", espressoDrink, espExpenses,
                        espRevenue, espProfit));

                salereport.write(String.format("Latte: Sold %d, Expenses $%.2f, Revenue $%.2f, Profit $%.2f%n", latte,
                        lattExpenses, latteRevenue, lattProfit));

                salereport.write(String.format("Black Tea: Sold %d, Expenses $ %.2f, Revenue $%.2f, Profit $%.2f%n", blackTea
                        , blackExpenses, blackRevenues, blackProfit));

                salereport.write(String.format("Herbal tea: Sold %d, Expenses $ %,2f, Revenue $  %.2f" +
                        "Profit $%.2f%n", herbTea, herbExpenses, herbRevenue, herbProfit));

                salereport.write(String.format("Macchiato: Sold %d, Expenses $%.2f, Revenue $ %.2f, Profit $ %.2f%n",
                        macchiatoTea, maccExpenses, maccRevenue, maccProfit));

                salereport.write(String.format("Americano: Sold %d, Expenses $%.2f, Revenue $ %.2f, Profit $ %.2f%n",
                        americano, ameriExpenses, ameriRevenue, ameriProfit));

                salereport.write(String.format("Cold press: Sold %d, Expenses $%.2f, Revenue, $%.2f, Profit $%.2f%n",
                        coldPress, coldExpenses, coldRevenue, coldProfit));

                salereport.write(String.format("Hot chocolate: Sold %d, Expenses $ %.2f, Revenue $ %.2f, Profit $ %.2f%n"
                        , hotchololate, hotExpenses, hotRevenue, hotProfit));

                salereport.write(String.format("Coffee : Sold %d, Expenses $ %.2f, Revenue $ %.2f, Profit $ %.2f%n", coffee,
                        coffeeExpenses, coffeeRevenue, coffeeProfit));

                salereport.write(String.format("Chai tea : Sold %d, Expenses $%.2f, Revenue $%.2f, Profit $%.2f%n"
                        , chaiTea, chaiExpenses, chaiRevenue, chaiRevenue));

                salereport.write(String.format("Mocha : Sold %d, Expenses $.2%f, Revenue $%.2f, Profit $%.2f%n "
                        , mocha, mochaExpenses, mochaRevenue, mochProfit));
                salereport.close();




    }
}

