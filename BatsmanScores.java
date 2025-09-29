/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.batsmanscores;

/**
 *
 * @author kiaan
 */
public class BatsmanScores  {
    public static void main(String[] args) {
         // Single array for batsmen
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
      // single array for stadiums
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};
// Two-dimensional array for runs
        int[][] runs = {
            {5000, 3800, 4200}, //kingsmead
            {3500, 3700, 3900}, //st georges
            {6200, 5000, 5200}  //Wanderers
        };
        //Print table of runs
        System.out.println("Batsman Runs Report\n");
        System.out.printf("%-12s %-15s %-15s %-15s\n", "Stadium", batsmen[0], batsmen[1], batsmen[2]);
        for (int i = 0; i < stadiums.length; i++) {
            System.out.printf("%-12s %-15d %-15d %-15d\n", stadiums[i], runs[i][0], runs[i][1], runs[i][2]);
        }
        //Calculate total runs by each batsman
        System.out.println("\nTotal Runs by Each Batsman:");
        for (int j = 0; j < batsmen.length; j++) {
            int total = 0;
            for (int i = 0; i < stadiums.length; i++) {
                total += runs[i][j];
            }
            System.out.println(batsmen[j] + ": " + total);
        }
        //Highest runs per stadium
        System.out.println("\nHighest Runs Per Stadium:");
        for (int i = 0; i < stadiums.length; i++) {
            int max = runs[i][0];
            int index = 0;
            for (int j = 1; j < batsmen.length; j++) {
                if (runs[i][j] > max) {
                    max = runs[i][j];
                    index = j;
                }
            }
            System.out.println(stadiums[i] + ": " + batsmen[index] + " (" + max + ")");
        }

       //Stadium with the most total runs
        int maxStadiumRuns = 0;
        int maxStadiumIndex = 0;
        for (int i = 0; i < stadiums.length; i++) {
            int total = 0;
            for (int j = 0; j < batsmen.length; j++) {
                total += runs[i][j];
            }
            if (total > maxStadiumRuns) {
                maxStadiumRuns = total;
                maxStadiumIndex = i;
            }
        }

        System.out.println("\nStadium with the Most Runs: " + stadiums[maxStadiumIndex] + " (" + maxStadiumRuns + ")");
    }
}

   
    
    
    
    

