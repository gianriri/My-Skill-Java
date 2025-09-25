package PartTwo;
import java.util.Scanner;

public class Branch2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        
        int nilai = scanner.nextInt();
        String grade;
        
        if(nilai > 90){
            grade = "A";
        } else if (nilai > 80) {
            grade = "B+";
        } else if (nilai > 70) {
            grade = "B";
        } else {
            grade = "F";
        } System.out.print("Grade adalah: " + grade);
    }
}
