import java.util.Scanner;
public class Simple2DArray{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        
        int [] [] arr=new int[2][2];

        System.out.println("Enter 4 elements: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("2D Array: ");
    for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
}
System.out.println();
    }
    sc.close();
    }
}