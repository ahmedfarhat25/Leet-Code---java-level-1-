import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        int [] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        for (int i = 0; i < n-2; i++)
        {
            if(Math.abs(nums[i]-nums[i+1])<=a)
            {
                arr[i] = nums[i];
            }
            if(Math.abs(nums[i+1]-nums[i+2])<=b)
            {
                arr[i+1] = nums[i+1];
            }
            if(Math.abs(nums[i]-nums[i+2])<=c)
            {
                arr[i+2] = nums[i];
            }
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}