import java.util.Arrays;
import java.util.Scanner;

public class Pract3_1 {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        System.out.println("Enter numbers of the first array : ");
        for (int i = 0; i < 3; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter numbers of the second array : ");
        for (int j = 0; j < 3; j++)
        {
            b[j] = sc.nextInt();
        }

        int[]result = middleWay(a,b);
        System.out.println("middleWay("+Arrays.toString(a)+","+Arrays.toString(b)+ ") --> " + Arrays.toString(result));

    }
    public static int [] middleWay(int[] a, int[] b){
        int[]array = {a[1], b[1]};
        return array;
    }

}
