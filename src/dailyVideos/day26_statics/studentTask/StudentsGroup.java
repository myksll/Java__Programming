package dailyVideos.day26_statics.studentTask;

import dailyVideos.day26_statics.studentTask.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {//StudentsGroup has a student

    public String groupName;
    public int groupId;
    public ArrayList<Student> students= new ArrayList<>(); // 1.way

    public StudentsGroup(String groupName, int groupId) { //creates the StudentsGroup object by setting the groupName add groupId
        this.groupName = groupName;
        this.groupId = groupId;
        //2.way  --> students = new ArrayList<>(); --->  for Arraylist  size : 0
    }

    public void addStudent(Student student){ // takes one student object , and adds it to the arraylist of students
        students.add(student);
    }

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }



    public void addStudent(String name, int age, char gender , String id){ //takes name,age,gender,id of student object , and adds it to the arraylist of student
      //  Student student = new Student(name ,age,gender,id); 1.
        students.add(new Student(name ,age,gender,id));  //2.
   //takes name,age,gender,id of student object , and creates student object by using the given info,then adds the students object to tht arraylist
}

    public void removeStudent(String id){
        students.removeIf(p-> p.id.equals(id));
    //Takes the id and then removes the student object with the specified id from arraylist of students
}
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", students=" + students+
                ", number of students=" + students.size()+
                '}';
    }
}
/*
2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement


 */