//Write showDate() to print current date (e.g., "2025-03-08").
//Call it once.


import java.time.LocalDate;

public class JavaTime {
    public static void main(String[] args) {
        //This is where I will be calling my Methods
        showDate();
        nextWeek();

    }
    public static void showDate(){
        LocalDate today = LocalDate.now();
        System.out.println(today);
    }
//    Medium: Return Method
//    Write nextWeek() to return date 7 days from now.
//    Call it, print result.

    public static LocalDate nextWeek(){
        return LocalDate.now().plusDays(7);
    }

}
