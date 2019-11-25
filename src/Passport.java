import java.util.Scanner;
public class Passport {
    public static void main (String[] args){
    Scanner in = new Scanner(System.in);
     System.out.print("Input your name: ");//ввод имени
        String name = in.nextLine();
            System.out.print("Input your surname: ");//ввод фамилии
        String surname = in.nextLine();
                System.out.print("Input your age: ");//ввод возраста
                 int age = in.nextInt();
                    System.out.print("Input your city of birth ");//город рождения
        String citybirth = in.nextLine();
               System.out.print("Input your current city ");//город  проживания
        String curcity = in.nextLine();
        System.out.print("Input your gender ");//пол5
        String gender = in.nextLine();
    System.out.println ("-------------------- PASSPORT --------------------" + "\n" +
            "---------------------------------------" + "\n"+"-----"+"\n"+
            "----- Gender:"+ gender +" age: "+ age + "\n"+ "-----"+
"----- Location: from - " + citybirth + " current - "+ curcity + "\n" +
            "--------------------------------------------" );


    }
}
