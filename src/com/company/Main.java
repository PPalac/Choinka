package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        String orientation;
        int height;
        Scanner scan = new Scanner(System.in);
        // write your code here
    while(true)
    {
        System.out.print("Podaj orientacje:");
        orientation = scan.next();
        System.out.print("Podaj wysokosc:");
        try
        {
            height = scan.nextInt();
            drawTree(height, orientation);
        }
        catch (Exception e)
        {
            System.out.print("Bledna wysokosc!\n");
            scan.next();
        }

    }


    }
     static void drawTree(int height, String orientation)
    {




            switch (orientation)
            {
                case "UP":
                case "up":

                    for (int i = 0; i < height; i++)
                    {
                        drawBranch(i, height);
                        System.out.print('\n');
                    }
                    break;

                case "DOWN":
                case "down":

                        for (int i = height - 1; i >= 0; i--)
                        {
                            drawBranch(i, height);
                            System.out.print('\n');
                        }
                    break;

                case "LEFT":
                case "left":

                        for (int i = 0; i <= height; i++)
                        {
                            drawBranchSide(i, height);
                            System.out.print('\n');

                        }
                        for (int i = height - 1; i >= 0; i--) {
                            drawBranchSide(i, height);
                            System.out.print('\n');

                        }
                    break;

                case "RIGHT":
                case "right":


                        for (int i = 0; i <= height; i++) {
                            drawBranchSide(i, 0);
                            System.out.print('\n');

                        }
                        for (int i = height - 1; i >= 0; i--) {
                            drawBranchSide(i, 0);
                            System.out.print('\n');

                        }
                    break;
                        default:
                            System.out.print("Zla orientacja");
                            break;
            }

        }


    static void drawBranch(int branchSize, int height)
    {
        Random rand = new Random();
        int random;
        int hanged = 0;
        for(int i = 0; i<height-branchSize; i++)
        {
            System.out.print(" ");
        }
        for (int i = 0; i<=branchSize*2; i++)
        {
            if(branchSize == 0)
                System.out.print("☼");
            else
            {
                random = rand.nextInt(5)+1;
                if(hanged <5 && random%4 == 0)
                {
                    System.out.print("o");
                    hanged++;
                }
                else
                    System.out.print("♦");
            }
        }
    }
    static void drawBranchSide(int branchSize, int height)
    {

        for(int i = 0; i<height-branchSize; i++)
        {
            System.out.print(" ");
        }


        for (int i = 0; i<branchSize; i++)
        {
            if(branchSize == height && i == 0)
               System.out.print("☼");
            else
            System.out.print("*");

        }

    }
}
