public class characterClass {
    public static void main(String[] args) {
        char c[]={'a','Z','b','C','P',' ','9','?'};
        for(int i=0;i<c.length;i++){
            if(Character.isUpperCase(c[i])){
                System.out.println("UpperCase is :"+c[i]);
            }
            else if(Character.isLowerCase(c[i])){
                 System.out.println("LowerCase is :"+c[i]);
            }
            else if(Character.isDigit(c[i])){
                 System.out.println("Digit is :"+ c[i]);
            }
            else if(Character.isWhitespace(c[i])){
                 System.out.println("Whitespace is :"+ c[i]);
            }
            else if(Character.isAlphabetic(c[i])){
                 System.out.println("Alphabet is: "+c[i]);
            }
        }
    }
}
