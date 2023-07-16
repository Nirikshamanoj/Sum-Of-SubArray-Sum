import java.util.Scanner;
public class SumOfSubArraySum {
    static int findSum(int[] array,int size)
    {
        int sum=0,temp;
        for (int i=0;i<size;i++) {
            temp=0;
            for (int j=i;j<size;j++) {
                temp += array[j];
                sum += temp;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int A[]=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int sum=findSum(A,n);
        System.out.println(sum);
    }
}
