import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class CalorieCounting{
    public static void main(String[] args){
        int mostCalories = Integer.MIN_VALUE;
        String line = "";
        int currentTotal = 0;
        try{
            File calFile = new File("ElfCalories.txt");
            Scanner input = new Scanner(calFile);
            while(input.hasNextLine()){
                line = input.nextLine();
                if(line.equals("")){
                    currentTotal = 0;
                    continue;
                }
                currentTotal += Integer.parseInt(line);
                if(currentTotal > mostCalories){
                    mostCalories = currentTotal;
                }      
            }
            input.close();
        }catch(FileNotFoundException e){
            System.out.println("A file was not found");  
        }
        System.out.println("The elf carrying food with the most calories has: " + mostCalories + " calories worth of food.");
    }
}