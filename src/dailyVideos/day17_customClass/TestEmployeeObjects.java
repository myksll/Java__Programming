package dailyVideos.day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        //object

        Employee employee1 = new Employee();
        employee1.setInfo("sumeye",28,'F',"Java Developer", 95000," A12");


        Employee employee2 = new Employee();
        employee2.setInfo("Khashayar",29,'M',"Back-end Developer", 98000," B13");


        Employee employee3 = new Employee();
        employee3.setInfo("Abidullah",30,'M',"Front-end Developer", 99000," C14");

//if there is a mistake in one line ,or we want to call only one method
        employee1.age=39; // we can change the value as 39 instead of 29



        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();


    }


}
