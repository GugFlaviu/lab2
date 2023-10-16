import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introdu numele");

        String userName = myObj.nextLine();
        System.out.println("Hello "+userName);

    }
}
