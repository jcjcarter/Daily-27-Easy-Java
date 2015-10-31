import java.util.Scanner;

public class Main {



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Year year = new Year();

        System.out.println("Enter the year: ");

        year.computeYearInfo(Integer.parseInt(scanner.next()));

        System.out.println("Leap year: " + year.leapYear);
        System.out.println("Century: " + year.century);

    }
}
