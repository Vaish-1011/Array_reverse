import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in an array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the elements of array A:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the value of B:");
        int B=sc.nextInt();
        System.out.println("Enter the value of C:");
        int C=sc.nextInt();
        reverse(A,B,C);
    }
    public static void reverse(int[] A,int B,int C) {
        while (B < C) {
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;
            C--;
        }
        System.out.println("Reversed array:");
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
