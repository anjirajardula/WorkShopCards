package com.bridgelabz.deckcards;

import java.util.Scanner;

public class Players {



        public void addPlayers() {
            System.out.println("Add No.of Players Between 2 and 4");
            Scanner sc = new Scanner(System.in);
            int playerCount = sc.nextInt();
            if(playerCount >= 2 && playerCount <= 4){
                System.out.println("No.of Players are : " + playerCount);
            }else{
                System.out.println("Invalid input # Enter between 2 to 4 #");
                addPlayers();
            }
        }
    }


