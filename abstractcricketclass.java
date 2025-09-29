/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cricketscores;

/**
 *
 * @author kiaan
 */
// step2: abstract class implementing the interface
 abstract class Cricket implements ICricket {
    private String batsmanName;
    private String stadiumName;
    private int runsScored;

    public Cricket(String batsmanName, String stadiumName, int runsScored) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.runsScored = runsScored;
    }

    @Override
    public String getBatsman() {
        return batsmanName;
    }

    @Override
    public String getStadium() {
        return stadiumName;
    }

   @Override
    public int getRunsScored() {
        return runsScored;
    }
}

    
    
    
    
    
    
    
    

