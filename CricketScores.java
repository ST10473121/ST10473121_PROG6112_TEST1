/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cricketscores;

import java.util.Scanner;

/**
 *
 * @author kiaan
 */
public class CricketScores 
        //RunApplication
        //step 4:main class to run the application
{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("The cricketer name: ");
        String name = sc.nextLine();

        System.out.print("Enter the stadium: ");
        String stadium = sc.nextLine();

        System.out.print("Enter the total runs scored by " + name + " at " + stadium + ": ");
        int runs = sc.nextInt();

        CricketRunsScored crs = new CricketRunsScored(name, stadium, runs);
        crs.printReport();

        sc.close();
    }
}

