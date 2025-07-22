
class Approch3 {

    public static void main(String[] args) {
        int[] second_array = new int[args.length];
        for (int i = 0; i < a.length / 2; i++) {
            int t1 = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t1;
        }
        System.out.println("reverse array:");
    }
}
