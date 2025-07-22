class RuntimeArray{
    public static void main(String[] args)
    {
        int [] data=new int[5];
        Scanner s1=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            data[i]=s1.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println([i]+"");
        }
        int add=0;
        for(int i=0; i<data.length; i++)
        {
            add=add+data[i]
        }
        System.out.println("Addition of number is: " +add);
    }
}