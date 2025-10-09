// to uppercase
class UpperCase{
    static String s = "";
    
    public static void toUpperCase(String str){
        s= "";
        // char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='A'&& str.charAt(i)<='Z') {
                
               char  ch = str.charAt(i);
                s+= (char)(ch+32);
                // System.out.print(ch);
            }else
            s+=str.charAt(i);           
        }        

        System.out.println(s);

    }
public static void toLowerCase(String str){
    s= "";
        // char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a'&& str.charAt(i)<='z') {
                
               char  ch = str.charAt(i);
                s+= (char)(ch-32);
                // System.out.print(ch);
            }else
            s+=str.charAt(i);
            
        }
        System.out.println(s);



    }

}
class TestMain{
    public static void main(String[] args) {
        UpperCase obj1  = new UpperCase();

        UpperCase.toUpperCase(args[0]);
        UpperCase.toLowerCase(args[0]);

    }
}
