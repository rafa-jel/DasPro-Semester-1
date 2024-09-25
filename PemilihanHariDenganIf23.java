import java.util.Scanner;
public class PemilihanHariDenganIf23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dayNum;
        String dayType;

        System.out.print("Input day name : ");
        dayNum = sc.nextInt();

        switch (dayNum) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "weekday";
                break;
            case 6:
            case 7:
                dayType = "weekend";
                break;
        
            default:
                dayType = "Invalid day Number";
                break;
            }
         System.out.println("Day " + dayNum + " is a " + dayType);
    }
    
}

