import java.util.*;
class p1maxandmincount
{
    public static void main(String[]args)
     {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        System.out.println("Enter the size :");
        int n = sc.nextInt();
        int arr[] = new int[n];
    for(int i = 0 ; i < n ; i++)
    {
        System.out.println("Enter the elements : ");
        arr[i] = sc.nextInt();
    }
    int max = arr[0];
    int min = arr[0];
    for(int i = 0 ; i < n ; i++)
    {
     if(arr[i] > max )
     max = arr[i] ;
     if(arr[i] < min )
     min = arr[i] ;
    }
    System.out.println("Max is " + max + "Min is" + min);
}
}







