import java.util.Date;

public class PhdStudent  extends GraduateStudent{
    protected boolean qualityingExamTaken;
    public PhdStudent(int no,
                      String name,
                      int year,
                      Date dob,
                      String major,
                      String advisor,
                      String thesis,
                     boolean qualityingExamTaken) {

        super(no, name, year, dob, major, advisor, thesis);
        this.qualityingExamTaken = qualityingExamTaken;

    }

    @Override
    public void study() {
        System.out.println("Phd student are studying");
    }

    @Override
    public void register() {
        System.out.println("new create Phd Students");
    }

    @Override
    public String toString() {
        return super.name;
    }

    @Override
    public void writeThesis() {
        System.out.println("Phd students "+super.name +  " wrtier thesis");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Phd student " + super.name + " meet with adivsor");
    }


    public void writePaper()
    {
        System.out.println("Phd students" + super.name + " write paper");
    }


}
