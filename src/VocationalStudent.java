import java.util.Date;
import java.util.SortedMap;

public class VocationalStudent extends Student{

    public VocationalStudent(int no , String name, int year, Date dob, String major)
    {
        super(no,name,year,dob,major);
    }

    @Override
    public void study() {
        System.out.println(super.name + " are studying");
    }

    @Override
    public void register() {
        System.out.println("create new Vocational Students");
    }

    @Override
    public String toString() {
        return super.name;
    }

}
