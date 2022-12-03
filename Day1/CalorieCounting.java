import java.util.Scanner;
public class CalorieCounting{

    //public static int mostCalories()
    public static void main(String[] args){
        int mostCalories = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Paste calorie list for elves: ");
        
        
        int currentCalorie = 0;
        int currentTotal = 0;
        
        while(input.hasNextInt()){
            currentCalorie = input.nextInt();
            System.out.println("CurrentCalorie is now: " + currentCalorie);
            currentTotal += currentCalorie;
            System.out.println("CurrentTotal is now: " + currentTotal);
            if(currentTotal > mostCalories){
                mostCalories = currentTotal;
                System.out.println("MostCalories is now: " + mostCalories);
            }

            if(input.findInLine("(?=\\S)") == null){
                //input.nextLine();
                currentTotal = 0;
                System.out.println("currentTotal has been set to 0. MostCalories is still " + mostCalories + "\n");
            }
            
        }
        input.close();
        
        System.out.println("The elf with the most calories has: " + mostCalories + " calories.");


    }


}
