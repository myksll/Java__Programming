package dailyVideos.day26_statics;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee employee1= new Employee("Adrian",'M',"Java Developer", 120000);
        System.out.println(employee1);

        Employee employee2= new Employee("Mark","project manager", 120000);
        System.out.println(employee2);

        Employee employee3= new Employee("Mark","project manager");
        System.out.println(employee3);




    }
}
