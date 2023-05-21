import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner((System.in));
        String main = in.nextLine();
        String blended = in.nextLine();
        String spies = "";
        int k = 0 ;   
        for(int i = 0 ; i < blended.length() ; i++){
            if(main.charAt(k) != blended.charAt(i)){
                spies += blended.charAt(i);                            
            }
            else k++;
        }
        if(spies.length()== 0){
            System.out.println("No spies were found!");
        }
        else System.out.println(spies);
    }
}