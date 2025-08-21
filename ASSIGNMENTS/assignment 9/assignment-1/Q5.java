// // 5) Write a java program to reverse each word of String.
// // 	Sample Input: “Java Is Plateform Independent”
// // 	Output: “avaJ sI mrofetalP tnednepednI”
class Test{
//     // public static void reverse(String str ){
//     //     String rev = "";
//     //     for (int i = str.length()-1; i >=0; i--) {
//     //         rev += str.charAt(i);
//     //     }
//     // }
    public static void main(String[] args) {
        String str = "Java Is Plateform Independent";
        int length = str.length();
        int start = 0;
        for (int i = 0; i <=str.length(); i++) {
            if(i==length|| str.charAt(i)==' '){
            for (int j = i-1; j >= start; j--) {
                System.out.print(str.charAt(j));
            }
            if (i!=length) {
                System.out.print(" ");
            }
            start= i+1;
        }
            // System.out.print(s);
    }
}
}