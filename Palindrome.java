public class Palindrome {
	public static void main(String[] args) {
		Boolean Flag = true;
		/* Проверка всех введённых слов */
		for(int i=0;i<args.length;i++) {
			String S = args[i];
		/* Реверс строки и проверка, равняется ли реверсированная строка исходной */
			String RS = (reverseString(S));
			if(!S.equals(RS)){
				Flag = false;
			}
		}
		if(Flag){
			System.out.println("Палиндром");
		} else{
			System.out.println("Не палиндром");
		}
	}
/* Реверс строки */
	public static String reverseString(String str) {
  		char[] array = str.toCharArray();
  		String result = "";
  		for (int i = array.length - 1; i >= 0; i--) {
     			result = result + array[i];
  		}
  		return result;
	}
	
}