public class Palindrome{
    public static void main(String[] args){
        String str="Racecar";
        boolean isPalindrome=true;

        int length=str.length();

        for(int i=0; i<length/2; i++){
            if(str.charAt(i)!=str.charAt(length-1-i)){
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }
}