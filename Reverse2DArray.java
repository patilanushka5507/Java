public class Reverse2DArray{
    public static void main(String[] args){
        int [][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("Original Matrix:");
        for(int[] row:matrix){
             for(int num:row){
                System.out.print(num+" ");
             }
             System.out.println();
        }
        for (int[] row:matrix){
            int left=0;
            int right=row.length-1;
            while(left<right){
                int temp=row[left];
                row[left]=row[right];
                row[right]=temp;
                left++;
                right--;
            }
        }
        int top=0;
        int bottom=matrix.length-1;
            while(top<bottom){
                int[] temp=matrix[top];
                matrix[top]=matrix[bottom];
                matrix[bottom]=temp;
                top++;
                bottom--;
    }
    System.out.println("Reversed Matrix:");
    for(int[] row:matrix){
        for(int num:row){
            System.out.print(num+" ");
    }
    System.out.println();
}
}
}