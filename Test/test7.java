package Test;

public class test7 {
    public static void main(String[] args) {
        System.out.println(decodeBencode("4:hello"));
    }

    static String decodeBencode(String bencodedString) {
        if (Character.isDigit(bencodedString.charAt(0))) {
            int firstColonIndex = 0;
            for(int i = 0; i < bencodedString.length(); i++) {
                if(bencodedString.charAt(i) == ':') {
                    firstColonIndex = i;
                    break;
                }
            }
            int length = Integer.parseInt(bencodedString.substring(0, firstColonIndex));
            return bencodedString.substring(firstColonIndex+1, firstColonIndex+1+length);
        } else {
            throw new RuntimeException("Only strings are supported at the moment");
        }
    }
}
