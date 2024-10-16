import java.util.Date;

public class UndergradusateStudent extends Student {

    protected  String minor;
    public UndergradusateStudent(int no , String name, int year, Date dob, String major,String minor)
    {
        super(no,name,year,dob,major);
        this.minor = minor;
    }

    @Override
    public void study() {
        System.out.println(super.name + " are studing");
    }

    @Override
    public void register() {
        System.out.println("new create UndergradusateStudent");
    }

    @Override
    public String toString() {
        return super.name.toString();

    }
}
