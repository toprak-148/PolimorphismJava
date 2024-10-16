import java.util.Date;

public class Student {
    protected int no;
    protected  String name;
    protected int year;
    protected Date dob;
    protected String major;

    public Student(int no , String name,int year,Date dob, String major)
    {
        this.no = no;
        this.name = name;
        this.year = year;
        this.dob = dob;
        this.major = major;
    }

    public void study()
    {
        System.out.println("students are studying ");

    }
    public void register()
    {
        System.out.println("new create students user...");

    }

    @Override
    public String toString() {
        return "this is : "+this.name;
    }

}
