import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program {

    private static StringBuilder returnString(int n, String c1, String c2) {
        StringBuilder result = new StringBuilder();
        while (result.length() < n) {
            result.append(c1);
            if (result.length() < n){
                result.append(c2);
            }
        }
        return result;
    }

    private static void createFile() {
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

    private static void writeIntoFile(String file_name, String text, int number_of_repeats) {
        File file = new File(file_name);
        FileWriter fr = null;
        BufferedWriter br = null;
        String textWithNewLine=text+System.getProperty("line.separator");
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = 0; i < number_of_repeats; ++i) {
                br.write(textWithNewLine);
            }
            System.out.println("file was updated");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            System.out.println("enter the number of repeats");
            int n = scanner.nextInt();
            System.out.println("enter the symbols c1 and c2");
            scanner.nextLine();
            String c1 = scanner.nextLine();
            String c2 = scanner.nextLine();
            System.out.println(returnString(n, c1, c2));
        }

        {
            String text = "text";
            int repeats = 1000;
            createFile();
            writeIntoFile("TEXT.txt", text, repeats);
        }
        scanner.close();
    }
    
    

}