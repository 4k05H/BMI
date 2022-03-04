package bmi_kalkuláto;

import java.util.Scanner;

public class BMI_kalkuláto {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Adja meg a magasságát: ");
        String magassag = sc.nextLine();

        System.out.println("Adja meg a testsúlyát: ");
        String suly = sc.nextLine();

        int bmi = suly / (magassag * magassag);
        
    }
    
}
