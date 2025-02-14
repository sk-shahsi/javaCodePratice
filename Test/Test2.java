package Test;

public class Test2 {
   // Remove the adjacent duplicate characters from the input string
    //{"abbccdd" -> "a", "bccb" -> "", "xwxx" -> "xw" , "xwxw" -> "xwxw"}


    public static String removereptid(String s){
        StringBuilder res= new StringBuilder();
        for (int i=0;i<s.length();i++){
            char current=s.charAt(i);
            if(res.length()>0 && res.charAt(res.length()-1) == current){
                res.deleteCharAt(res.length()-1);
            }else {
                res.append(current);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String[] testcases={"abbccdd","bccb","xwxx","xwxw" };
        for (String testcase:testcases){
            System.out.println(removereptid("testcase"+testcase));
        }
    }
}
