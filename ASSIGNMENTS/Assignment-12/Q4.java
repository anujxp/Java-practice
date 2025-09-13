//  NullPointerException

// 👉 Declare a String = null. Try to call length() on it. Handle the exception.

// // Expected
// java.lang.NullPointerException 
// caughtc
class Main {
    public static void main(String[] args) {
        String a = null;
        try{
            a.length();
        }
        catch(NullPointerException e )
        {
            e.printStackTrace();
        }

    }
}
