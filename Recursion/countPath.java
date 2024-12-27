public class countPath {
    public static int CountPath(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        int downpath = CountPath(i+1, j, n, m);
        int rightpath = CountPath(i, j+1, n, m);
        return downpath + rightpath;
    }
    public static void main(String arg[]){
        int n = 3, m = 3;
        int totalPath = CountPath(0 ,0 ,n,m);
        System.out.println(totalPath);
    }
    
}
