package com.Run_Main;

//importing other packages
import com.Abs_win_toolkit.*;
import com.Area.*;
import com.Voting_Sys.*;
import com.simple_Interest.*;
import java.util.Scanner;

public class Run_Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("========== OPTION ==========");
        System.out.println("1. Simple Interest");
        System.out.println("2. Area");
        System.out.println("3. Voting Validation System");
        System.out.println("4. Temperature Conversion (AWT)\n");


//        // option
//        System.out.print("\nEnter the option : ");
//        int op = scan.nextInt();

        switch(4) {
            case 1:
                // ==================== Simple Interest ====================
                System.out.println("\n========== Simple Interest ==========");
                // for principal
                System.out.print("Enter the principal: ");
                int p = scan.nextInt();
                // for time
                System.out.print("Enter the time: ");
                int t = scan.nextInt();
                // for rate
                System.out.print("Enter the rate: ");
                float r = scan.nextFloat();
                
                new SimpleInterest(p, t, r);
                break;

            case 2:
                // ==================== Area ====================
                System.out.println("\n========== Area ==========");
                System.out.print("Enter the length: ");
                float l = scan.nextFloat();
                System.out.print("Enter the breadth: ");
                float b = scan.nextFloat();

                // Creating object for class Area
                Area area = new Area(l,b);
                area.check();
                area.calculate();
                area.display();
                break;

            case 3:
                // ========== Voting Validation System ==========
                System.out.println("\n========== Voting Validation System ==========\n");
                System.out.print("Enter your age : ");
                int age = scan.nextInt();
                new VotingSystem(age).check();
                break;
            
            case 4:
                // ========== Tep4reatureConversion (AWT) ==========
                System.out.println("\n========== TepreatureConversion (AWT) ==========\n");
//                System.out.print("Enter the width of the frame: ");
//                int width = scan.nextInt();
//                System.out.print("Enter the height of the frame: ");
//                int height = scan.nextInt();
                new TemperatureConversion(300, 200).createFrame();
        }
    }
}