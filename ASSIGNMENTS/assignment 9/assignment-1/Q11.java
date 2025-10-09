// 11) Input name of a person and count how many vowels it contains. Use String class methods.

class Test{

    static int checkCharVowel(String str ){
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            count++;
        }
        System.out.println(" in your string there are "+ count + "vowel charecter ");
        return count;
    }
    public static void main(String[] args) {
        String s = " Anuj is very selfish guy";
        int n = checkCharVowel(s);
        // System.out.println(n);

    }
}