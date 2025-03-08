//Task 1 (Easy): Write a method sayGoodbye() that prints "Goodbye!" and call it in main.
//
//        Task 2 (Medium): Create a method printDate() that prints "Today is March 08, 2025"
//        (use the current date I gave you). Call it twice in main.
//
//        Task 3 (Hard): Write a method countToTen() that uses a for loop to print numbers 1 to 10, one per line.
//Call it in main.


import java.time.LocalDate;

public class SimpleMethod {


    public static void main(String[] args) {
sayGoodbye();
printDate();
printDate();
countToTen();
    }

        private static void sayGoodbye() {
            System.out.println("Goodbye!");
    }

    private static void printDate(){
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);
    }

    private static void countToTen(){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);

        }

    }
    }



