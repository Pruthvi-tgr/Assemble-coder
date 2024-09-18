import java.util.*;

public class DemoPractice{
      public static int getFactorSum(int N){
     int sum = 0;
     for(int i = 1;i<=Math.sqrt(N);i++){
        if(N%i==0){
            if(i==N/i){
             sum = sum + i;
            }else{
             sum = sum + i + N/i;
            }
        }
     }
     return sum;
    }
    public static boolean isPerfectNumber(int N){
     int sum =  getFactorSum(N) - N;
     if(N == sum){
        return true;
     }
     return false ;
    }
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int number =s.nextInt();
       boolean isNumber = isPerfectNumber(number);

    }
}