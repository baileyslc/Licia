import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
        int n,x, flag=1, loc=0;
        Scanner s= new Scanner(System.in);

        System.out.print("Enter no. of elements you wnat in the array");
        n=s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements");
        for(int i=0;i<n;i++) {
            a[i]=s.nextInt();
        }
        System.out.println("enter the element you want to delete");
        x=s.nextInt();
        for(int i=0;i<n;i++) {
            if(a[i]==x) {
                flag=1;
                loc=i;
                break;
            }
            else {
                flag=0;
            }
        }
        if (flag==1) {    }
}
