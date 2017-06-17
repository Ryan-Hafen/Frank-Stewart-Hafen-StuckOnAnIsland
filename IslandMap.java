/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260homework;

import java.util.Scanner;

/**
 *
 * @author germa_000
 */
public class IslandMap {
    public static void main(String[] args) {
        //Map of island on screen
        System.out.println("Reef\tBeachA\tBeachB\n\tBamboA\tBamboB\tCave\n\tJungle\tMountn\tCliff\n\tRaft\tLagoon\tWaterfall\nBeachC\tCamp\tBamboC\tBeachD\nWreckage\n");
        
        //Create a Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to explore the island?");
        System.out.println("What do you want to do? Enter 1 for Yes and 2 for No.");
        int goodIdea = input.nextInt();
        if (goodIdea == 1) {
        System.out.println("You begin to explore.");
        }else {
        System.out.println("You sit down on the white sand beach.");
        }
    }
}
