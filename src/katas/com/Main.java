package katas.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LightningGrid lightningGrid = new LightningGrid();
        int n;
        System.out.println("No of instructions: ");
        n = sc.nextInt();
        for(int i =0 ;i<n;i++){
            System.out.println("Enter 1st row :");
            int row1 = sc.nextInt();
            System.out.println("Enter 1st column :");
            int column1= sc.nextInt();
            System.out.println("Enter 2nd row :");
            int row2 = sc.nextInt();
            System.out.println("Enter 2nd column :");
            int column2 = sc.nextInt();

            System.out.println("Specify 1 for Turn on or 2 for Turn off or 3 for Toggle");
            int operation = sc.nextInt();

            lightningGrid.performProcedure(row1, column1, row2, column2, operation);


        }
        System.out.println(lightningGrid.countNoOfLights());

    }
}

