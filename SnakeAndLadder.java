package com.sl.game;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int StartPosition =0;
        int CheckNumber = (int) (Math.random()*6) +1;
        System.out.println("Single player Start position is " +StartPosition);
        System.out.println("Roll dice number is " +CheckNumber);

        int FindPlayOption =(int)(Math.random() * 2);
        if (FindPlayOption==0){
            System.out.println("player no move stay in the same becouse " +FindPlayOption +" position");
        }
        else if (FindPlayOption==1){
            System.out.println("player move ahead because " +FindPlayOption +" position");
        }
        else{
            System.out.println("player moves behind because " +FindPlayOption +" position");
        }

    }
}
