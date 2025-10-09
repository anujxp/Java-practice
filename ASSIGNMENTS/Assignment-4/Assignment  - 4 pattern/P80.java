//    *
//   *_*
//  *_*_*
// *_*_*_*
//  *_*_*
//   *_*
//    *
class Test{
    public static void main(String[] args) {
        int n = 7;
        int nh = (n/2)+1;
        for (int i = 1; i <= nh; i++) {
            for(int j = 1;j<=nh-i;j++){
                System.out.print(" ");
            }          
            for(int k = 1;k<=(i*2)-1;k++){
                if(k%2!=0)
                System.out.print("*");
                else
                System.out.print("_");

            }
            System.out.println();
            
        }
        for(int i = nh-1;i>0;i--){
             for(int j = 1;j<=nh-i;j++){
                System.out.print(" ");
            }          
            for(int k = (i*2)-1;k>0;k--){
                if(k%2!=0)
                System.out.print("*");
                else
                System.out.print("_");

            }
            System.out.println();
        }
    }
}