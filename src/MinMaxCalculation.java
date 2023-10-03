import java.util.Scanner;

class MinMaxCalculation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of numbers you want to enter");
        int n=sc.nextInt();
        int min=Integer.MAX_VALUE;int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int t=sc.nextInt();
            min=Math.min(t,min);
            max=Math.max(t,max);
        }
        System.out.println("Minimum of the numbers is "+min);
        System.out.println("Maximum of the numebers is "+max);
    }
}