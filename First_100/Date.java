package First_100;

public class Date {
    public static void main(String[] args) {

        String day ;
        String month;
        int year;
        String date ;
        

        // declare a varibles.

        day = "Friday, ";
        month = "September ";
        year = 2024;

        //instanse the vars.
        
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
        System.out.println("Start from here: ");
        System.out.println();


        // printing the vars to make sure uts working fine.



        date = month + 6 ;
        

        System.out.print("Saudi Arabia format");
        System.out.println(": ");
        System.out.print(day);
        System.out.print(date);
        System.out.print(", ");
        System.out.println(year);
        System.out.println();

        System.out.print("Eroup format ");
        System.out.println(":");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(day + " ");
        System.out.print(year);
        System.out.println();


        




    }
}
