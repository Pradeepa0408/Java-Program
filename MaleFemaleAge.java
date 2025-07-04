import java.util.Scanner;
class MaleFemalAge{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String gender = sc.next();
        int age=sc.nextInt();
        if(gender.equalsIgnoreCase("Female")){
            if(age>=1 && age<=58){
                System.out.println("Interest rate is 8.2%");
            }
            else if(age>=59 && age<=100){
                System.out.println("Interest rate is 9.2%");
            }
        }
        else if(gender.equalsIgnoreCase("Male")){
            if(age>=1 && age<=58){
                System.out.println("Interest rate is 8.4%");
            }
            else if(age<=59 && age<=100){
                System.out.println("Interest rate is 10.5%");
            }
        }
    }
}