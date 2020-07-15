import java.util.Scanner;
public class ConverterTemperature {
    private double x = 0;
    private double convertTem (double temperature, char convTo){
        x = temperature ;
        if (convTo ==  'F' || convTo =='f')
            return  x*9/5+32;
        else if (convTo ==  'C' || convTo == 'c')
            return   (x-32)*5/9;
        else
            System.out.println( "Enter other symbol of temperature. F or C");
        return 0;
    }
    public static void main(String[] args) {
    System.out.println( "Enter dimention of temperature.");
    Scanner sc = new Scanner(System.in);
        double  y = sc.nextDouble();
    System.out.println( "What temperature do you want convert to. F or C");
        char   ch = sc.next().charAt(0);
    ConverterTemperature ct = new ConverterTemperature();
    ct.convertTem(y, ch);
    }

}
