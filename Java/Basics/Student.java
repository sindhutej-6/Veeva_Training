class Student {

    String name;
    int age;
    double cgpa;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Tejaswi";
        s1.age = 21;
        s1.cgpa = 9.18;

        s1.displayDetails();
    }
}
