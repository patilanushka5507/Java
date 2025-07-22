
class BasicArray {

    public static void main(String[] args) {
        //int [] variablname={}
        int[] data = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println(data[i]);
        }
        System.out.println("\nusing while loop\n");
        int i = 0;
        while (i < 5) {
            System.out.println(data[i]);
            i++;
        }


    }
