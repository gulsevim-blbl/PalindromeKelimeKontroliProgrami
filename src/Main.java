
import java.util.Scanner;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        //baştan okunusu ile sondan okunusu aynı olan kelimelere palindom denir.
        
        Scanner scanner = new Scanner(System.in);
        System.err.println("Cumleyi Giriniz..");
        String cumle = scanner.nextLine();
        
        
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < cumle.length()/2; i++) {
            
            stack.push(cumle.charAt(i)); 
            
        }
        if (isPalindom(cumle, stack)) {
            
            System.out.println("Bu cumle Palindomdur...");
        }else{
            System.out.println("Bu cumle Palindom degildir...");
        }
   
    }
    public  static boolean isPalindom(String cumle, Stack<Character> stack){
        
        for (int i =(cumle.length() /2) +1; i < cumle.length(); i++){
            
            if (cumle.charAt(i) != stack.pop()) {
                
                return  false;
            }
            
        }
        return true;
        
        
    }
    
    
}
