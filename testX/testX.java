import java.util.Scanner;
public class testX{
    public static void main(String[] args){
        System.out.println(validateEmail("www.email.com"));
       
    }

    public static void name(String a) {
        System.out.println(a);
    }

    public static void asdqaw() {
        int s[][] = {{1, 2, 3, 4, 6, 7, 8, 9, 10}, {7, 2, 3, 6, 5, 9, 1, 4, 8}, {7, 2, 3, 9, 4, 5, 6, 8, 10}, {10, 5, 1, 2, 4, 6, 8, 3, 9}, {1, 7, 2, 4, 8, 10, 5, 6, 9}};
        for(int i = 0 ; i < 5; i++){
            System.out.println(missingNum(s[i]));
        }
    }
    public static int missingNum(int[] nums) {
        int temp = 0;
        int a[] = nums;
        for(int i = 0; i < 9; i++){
            for(int j = i + 1; j < 9; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0; i < 9; i++){
            if(a[i] != i+1){
                temp = i+1;
                break;
            }
            temp = 10;
        }
        return temp;
    }
    
    public static boolean isPrime(int num) {
        if(num == 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        for(int i = 2; i <= (num/2) ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static String reverseCase(String str) {
		char[] temp = str.toCharArray();
		int l = str.length();
		for(int i = 0; i < l; i++){
			if(temp[i] >= 'A' && temp[i] <= 'Z'){
				temp[i] = Character.toLowerCase(temp[i]);
            }
			else if(temp[i] >= 'a' && temp[i] <= 'z'){
				temp[i] = Character.toUpperCase(temp[i]);
			}
        }
        String s = String.valueOf(temp);
		return s;
    }

    public static boolean validateEmail(String s) {
        int l = s.length();
        int atCheck = 0;
        int dotCheck = 0;
        for(int i = 0; i < l; i++){
            if(s.charAt(i) == '@'){
                atCheck = 1 + dotCheck;
                if(i == 0){
                    System.out.println("@");
                    return false;
                }
            }
            if(s.charAt(i) == '.'){
                dotCheck = 1 + atCheck;
                if(i == 0){
                    System.out.println(".");
                    return false;
                }
            }
        }
        if(atCheck >= dotCheck || atCheck != 0){
            System.out.println("<>");
            return false;
        }
        return true;
    }
    
}