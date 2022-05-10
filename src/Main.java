/*
/*
Generic Wildcards - 01
Exercise: generics-wildcards-1

considering that:
there are two types of marks for the students:
a List of 2 Double elements for individual marks
a List of 2 Integer elements for project marks
Lisa Stuart has a List called individualMarksListLisa of individual marks
Jeremy Green has a List called projectMarksListJeremy of project marks
define a testing class with a method main() where you:
create the individualMarksListLisa list
add two random double values to the list using the .add() built-in method of the List
create the projectMarksListJeremy list
add two random int values to the list using the .add() built-in method of the List
calculate (using the static method Student.getAverageMark()) the marks average double values for lisaAvg and jeremyAvg
create a listOfStudents
add the two new Student objects (Lisa and Jeremy) to the list, using the add() method and the Student's constructor
print in console the details of the two Students inside the listOfStudents using:
the override method
the get() built-in method from List
 */



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student lisa;
        Student jeremy;

        List<Double> individualMarksListLisa = new ArrayList<>();
        List<Integer> projectMarksListJeremy = new ArrayList<>();
        individualMarksListLisa.add(25.8);
        individualMarksListLisa.add(87.2);
        projectMarksListJeremy.add(54);
        projectMarksListJeremy.add(24);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        List<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(lisa = new Student("Lisa","Occhiblu",lisaAvg));
        listOfStudent.add(jeremy = new Student("Jeremy", "Irons", jeremyAvg));

        System.out.println(listOfStudent.get(0).toString());
        System.out.println(listOfStudent.get(1).toString());
    }
}
