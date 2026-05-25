import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
    
        // code here
        if(ch =='a'||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
            System.out.println(true);
            
        }else{
          System.out.println(false);

        }
    }
}