import java.util.Date;

public class MasterStudent extends GraduateStudent{

    public MasterStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis) {
        super(no, name, year, dob, major, advisor, thesis);
    }

    @Override
    public void study() {
        System.out.println("Master Student" + super.name + " are studying");
    }

    @Override
    public void register() {
        System.out.println("new create Master student");
    }
    @Override
    public String toString() {
        return super.name;
    }

    @Override
    public void writeThesis() {
        System.out.println("Master Student "+ super.name + " write thesis");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Master students "+ super.name + " meet with advisor");
    }

}
