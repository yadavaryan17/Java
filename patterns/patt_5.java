public class patt_5 {
    public static void main(String str[]){
        int count = 1;
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int sum = i+j;
                if(sum%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
                count++;
            }
            System.out.println();
        }
    }
    
}
