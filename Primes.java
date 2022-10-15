/*основная функция, которая проходится циклом 
по всем числам <= 100 и выводит на экран простые*/
public class Primes { 
    public static void main(String[] args) {
    	for(int i = 2; i < 101; i++) {
    		if(isPrime(i) == true) {
    			System.out.println(i);
    		}
    	}
    }
    public static boolean isPrime(int n) { //Проверка, является ли число простым
    	boolean flag = true;
    	for(int i = 2; i < n; i++) {
    		   if(n % i == 0) {
    			   flag = false;
    		   }
    		}
    	return flag;
    }
}