import java.util.Date;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        RegistrationOffice registrationOffice = new RegistrationOffice();
        Student student = new PhdStudent(1,"Nuri",1,date,"PC","Ahmet Alaz","Algorithms",false);
        registrationOffice.registredStudent(student);
        Student student2 = new MasterStudent(1,"Nuri",1,date,"PC","Ahmet Alaz","Algorithms");
        registrationOffice.registredStudent(student2);

        Student student3 = registrationOffice.getAStudent();

        if(student3 instanceof  Student ){

            System.out.println(student3.toString());
        }
        else if(student3 instanceof VocationalStudent){

            System.out.println("2");
            System.out.println(student3.toString());
        }
        else if(student3 instanceof  UndergradusateStudent){

            System.out.println("3");
            System.out.println(student3.toString());
        }
        else if(student3 instanceof PhdStudent){

            System.out.println("4");
            System.out.println(student3.toString());
        }
        else if(student3 instanceof MasterStudent){

            System.out.println("5");
            System.out.println(student3.toString());
        }
        else if(student3 instanceof GraduateStudent){

            System.out.println("6");
            System.out.println(student3.toString());
        }


    }
}