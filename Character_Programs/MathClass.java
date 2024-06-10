public class MathClass {
    public static void main(String[] args) {


        char c[]={'a','Z','b','C','P',' ','9','/'};
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
            
                 System.out.println("Alphabet is:"+ Character.isAlphabetic('a'));
    
        }
       System.out.println("------------------------------------------");
        
        double A=36;
        double B=6;

        System.out.println("Minimum number of A and B:"+Math.min(A,B));

        System.out.println("Maximum number of Aand B:"+Math.max(A,B));
        
        System.out.println("Square root of A:"+Math.sqrt(A));

       // System.out.println(Math.abs(A));
        
        System.out.println("power of A and B:"+Math.pow(A,B));
        
        System.out.println("Logiritham of A:"+Math.log(A));
        System.out.println("Logiritham of B:"+Math.log(B));
        
        System.out.println("log10 of A:"+Math.log10(A));
        System.out.println("log10 of B:"+Math.log10(B));
        
        System.out.println("log1p of A:"+Math.log1p(A));
        System.out.println("log1p of B:"+Math.log1p(B));
       
        System.out.println("expm1 of B:"+Math.expm1(A));
        
        System.out.println("Sine of a:"+Math.sin(A));
        System.out.println("Cosine of a:"+Math.cos(A));
        System.out.println("Tagnet of a:"+Math.tan(A));
       
        System.out.println("Sine value of a:"+Math.asin(A));
        System.out.println("Cosine value of a:"+Math.acos(A));
        System.out.println("Tagnet value of a:"+Math.atan(A));
        
        System.out.println("Sine value of a:"+Math.sinh(A));
        System.out.println("Cosine value of a:"+Math.cosh(A));
        System.out.println("Tagnet value of a:"+Math.tanh(A));
        
        System.out.println("Round of value:"+Math.round(A));
        
        System.out.println("Random value of print:"+Math.random());


        System.out.println("-----------------------------------------");





    }
    
}
