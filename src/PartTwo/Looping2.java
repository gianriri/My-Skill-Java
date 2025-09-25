package PartTwo;
import java.util.Scanner;

public class Looping2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you ready? (yes/1): ");
        String ulangi = scanner.nextLine();
        System.out.println("Start");
        int counter = 0;

        while (ulangi.equalsIgnoreCase("1") || ulangi.equalsIgnoreCase("yes")){
            counter++;
            System.out.println("Pengulangan ke- " + counter);

            System.out.println("Apakah anda mau mengulang? (yes/no): ");
            String jawab = scanner.nextLine();

            if (!jawab.equalsIgnoreCase("yes") && !jawab.equals("1")){
                ulangi = "0";
            } else {
                ulangi = jawab;
            }
        }
    }
}
