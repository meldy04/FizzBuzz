public class Reduce {
    public static void main(String[] args) {
        for(int n = 2; n>=0; n--){
            if(n % 2 == 0) {
                n = n/2;
            }
            else {
                n--;
            }
            System.out.println(n);
        }
    }
}