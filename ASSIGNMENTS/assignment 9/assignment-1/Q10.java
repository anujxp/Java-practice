// WAP to count the word whose first letter is  vowel.

class Main {
    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
        String s = "Anuj is a very good Artist";
        int count = 0 ;
        boolean newword  = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ')
            newword =  true;
            else{
            if(newword&& isVowel(s.charAt(i)))
                count++;
                newword = false;
            }
        }
        System.out.println(count);
    }
}