import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int deler, teller = 0, posGetal = -1;
         
        Scanner invoer = new Scanner(System.in);

        do {
            System.out.print("Geef een strikt positieve deler in: ");
            deler = invoer.nextInt();
        } while (deler <= 0);
        
        do {
            if(posGetal >= 0){
                if (posGetal%deler == 0){
                    teller++;
                }
            }
            System.out.print("Geef een postief getal in (of stop met -1): ");
            posGetal = invoer.nextInt();
        } while (posGetal != -1);
        
        invoer.close();

        if (teller == 1){
            System.out.printf("Er is %d getal deelbaar door %d%n", teller, deler);
        }
        else {
            System.out.printf("Er zijn %d getallen deelbaar door %d%n", teller, deler);
        }
    }
}
