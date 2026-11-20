
class Employee{
    int id;
    int age;
    String name;
    double salary;
    void display(){
        System.out.println("Id - "+id+" Name - "+name+" Age - "+age+" Salary "+salary);
    }
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.id = 204;
        e1.age = 27;
        e1.name = "Raj";
        e1.salary = 200000;
        
        e2.id = 205;
        e2.age = 27;
        e2.name = "Tej";
        e2.salary = 300000;

        e1.display();
        e2.display();
        
    }
}
