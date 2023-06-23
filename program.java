import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // {
        //     System.out.println("enter the number of repeats");
        //     int n = scanner.nextInt();
        //     System.out.println("enter the symbols c1 and c2");
        //     scanner.nextLine();
        //     String c1 = scanner.nextLine();
        //     String c2 = scanner.nextLine();
        //     System.out.println(returnString(n, c1, c2));
        // }

        {
            try {
                File myObj = new File("TEXT.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } 
            catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        scanner.close();
    }
    
    private static String returnString(int n, String c1, String c2) {
        String result = "";
        while (result.length() < n) {
            result += c1;
            if (result.length() < n){
                result += c2;
            }
        }
        return result;
    }

}