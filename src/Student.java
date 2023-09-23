public class Student {
    private double gpaa;
    private int age;
    private int grade;
    private String namee;


    public Student(String name, int age, int grade, double gpa) {
        namee = name;
        gpaa = gpa;
        System.out.println("This student's name is " + name + ". They are " + age + " years old.");
        System.out.println("They are in grade " + grade + ". Their GPA is " + gpa);
    }

    public void honors() {
        if(gpaa>85) {
            System.out.println("Their GPA is " + gpaa + ". " + namee + " is an honors student.");
        } else  {
            System.out.println("Their GPA is " + gpaa + ". " + namee + " is not an honors student.");
        }
    }
}
