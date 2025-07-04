import java.util.Scanner;
class DataType{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char b=sc.next().charAt(0);
        if((b>='A'&&b<='Z')||(b>='a'&&b<='z')){
            System.out.println("Alphabhet");
        }
        else if(b>='0'&&b<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
}