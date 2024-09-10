import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("Input a number: ");
        Scanner in = new Scanner(System.in);
        int sword = in.nextInt();
        int head = in.nextInt();
        int regen = in.nextInt();
        int count = 0;
        int headAfter = head - sword;
        if (headAfter != 0 && headAfter + regen >= head)
            System.out.printf("такого дракона убить нельзя и волшебник - шарлотан");
        if (headAfter == 0 )
        {count++;
        System.out.printf("дракон повержен за " + count);}
        else {

            while (head >= sword){
                head = head - sword + regen;
                count++;
            }
            System.out.printf("дракон повержен за " + count);
        }




    }


}
