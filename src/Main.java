import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the height: ");
        Scanner s = new Scanner(System.in);
        Float heightRyb = s.nextFloat();
float index;

        System.out.println("Enter the weight: ");
        Scanner sc = new Scanner(System.in);
        Float weightRyb = sc.nextFloat();
        index= (float) (heightRyb/(Math.pow(weightRyb, 2)));
        System.out.println(index);


        if (index==16.00){
            System.out.println("starvation");
        }
        else if (index<=16.99&&index>16.00) {
            System.out.println("emaciation");
        }
        else if (index>=17.00&&index<=18.49) {
            System.out.println("underweight");
        }
        else if (index>=18.50&&index<=22.99) {
            System.out.println("normal,low range");
        }
        else if (index>=23.00&&index<=24.99) {
            System.out.println("normal, high range");
        }
        else if (index>=25.00&&index<=27.49) {
            System.out.println("overweight,low range");
        }
        else if (index>=27.50&&index<=29.99) {
            System.out.println("overweight,high range");
        }
        else if (index>=30.00&&index<=34.90) {
            System.out.println("1st degree obesity");
        }
        else if (index>=35.00&&index<=39.90) {
            System.out.println("2nd degree obesity");
        }
        else if (index>=40) {
            System.out.println("3rd degree obesity");
        }



    }
}