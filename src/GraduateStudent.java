import java.util.Date;

public class GraduateStudent extends Student{

    protected String advisor;
    protected String thesis;

    public GraduateStudent(int no , String name, int year, Date dob, String major,String advisor,String thesis){
        super(no,name,year,dob,major);
        this.advisor = advisor;
        this.thesis = thesis;
    }

    @Override
    public void study() {
        System.out.println("GraduateStudent are studying");
    }

    @Override
    public void register() {
        System.out.println("new create Greaduate Student");
    }

    @Override
    public String toString() {
        return super.name.toString();
    }

    public void writeThesis()
    {
        System.out.println(super.name + " write thesis");
    }
    public void meetWithAdvisor()
    {
        System.out.println(super.name + " meet with adivsor");
    }
}
