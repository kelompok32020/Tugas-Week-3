import java.util.Scanner ;
public class FAKTORIAL {
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("FAKTORIAL");
        int i=1; int n=1; 
        System.out.println("Masukkan nilai f =  ");
     int f = input.nextInt();
        do{
         n=n*i;
         i++;
     }
     while(i<f);
     n=n*i;
     System.out.println(n);
}
}