import java.util.Scanner;
class LowerUpperCase{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(Character.isUpperCase(a)){
            char c=Character.toLowerCase(a);
            System.out.println(c);
        }
        else if(Character.isLowerCase(a)){
            char l=Character.toUpperCase(a);
            System.out.println(l);
        }
    }
}