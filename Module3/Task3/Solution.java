package Module3.Task3;


import java.util.Date;

public class Solution {

    Course course1 = new Course(new Date(2017, 9, 1), "Math");
    Course course2 = new Course(55, "Music", "John Black");
    Course course3 = new Course(60, "Philosophy", "Tamara White");
    Course course4 = new Course(70, "Literature", "Tony Robbins");
    Course course5 = new Course(87, "Programming", "Super Man");

    Student student1 = new Student("Anton", "Bob", 25);
    Student student2 = new Student("Lozova", new Course[]{course1, course2});

    SpecialStudent student3 = new SpecialStudent(6532846);
    SpecialStudent student7 = new SpecialStudent("Intelect", 6, 374);
    SpecialStudent student8 = new SpecialStudent("Olga", "Popova", 45);

    CollegeStudent student4 = new CollegeStudent("Clever", 49, 394);
    CollegeStudent student5 = new CollegeStudent("Alla", "Hloba", 5);
    CollegeStudent student6 = new CollegeStudent("Smith", new Course[]{course1, course5});

}






