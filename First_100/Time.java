package First_100;

public class Time {
    public static void main(String[] args) {
        
        int hour = 14; 
        int time = 24;
        int minute = 59;
        int second = 59;

        int result = (hour* minute) * second;
        int result1 = ((time - hour) * minute ) * second;
        // its represnet the seconds in the 14 hours
        // and the second one will calculate the rest of hour so its will be 24 - 14(hour) = 10
        System.out.println(result);
        System.out.println(result1);
        
        
        System.out.println((time * minute) * second);
        System.out.println(result + result1);
        // here we make sure the program its work fine by compine them to gather
    }
}
