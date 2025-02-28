package Test;

public class Test25 {
    public static boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        String Palindrome="";
        for(int i=s.length()-1;i>=0;i--){
            char ss=s.charAt(i);
            Palindrome=String.valueOf(ss);
        }
        if(s==Palindrome){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int input=525;
        System.out.println(isPalindrome(input));
    }
}
