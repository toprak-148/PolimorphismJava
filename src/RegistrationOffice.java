import java.util.Date;

public class RegistrationOffice {


    public RegistrationOffice(){}
    public Student getAStudent()
    {
        Student student =null ;
        int sayi = ( int )(Math.random()*6);
        Date date = new Date();

        if(sayi == 0)
        {
            student = new Student(1,"Toprak",5,date,"CENG");
        }
        else if(sayi == 1){
            student = new PhdStudent(2,"Gamze",10,date,"ES","Zehra Doğan","ES Tecnical Systems",true);

        }
        else if(sayi == 2)
        {
            student = new MasterStudent(3,"Doğa",6,date,"IK","Zehra Doğan","IK social Analsy");

        }
        else if(sayi == 3)
        {
            student = new UndergradusateStudent(4,"Zehra",20,date,"Home","Gamze");

        }
        else if(sayi == 4){
            student = new VocationalStudent(5,"Erdal",20,date,"Coffe");

        }
        else if(sayi == 5){
            student = new MasterStudent(6,"Zeynep",50,date,"Village","God","Human Rights");

        }
        else if(sayi == 6){
            student = new GraduateStudent(7,"Nazige",50,date,"Cafe","Halil","Good Coffy");

        }
        return student;
    }

    public void registredStudent(Student student){
        student.register();
    }

}
