
package Question_1;

public class Person {
    private String name;
    private int yearOfBirth;
    public Person(String name, int yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public String toString(){
        return "Name: "+getName()+" \nYear of Birth: "+getYearOfBirth();
    }

}
class Student extends Person{
    private String major;
    public Student(String name, int yearOfBirth, String major){
        super(name, yearOfBirth);
        this.major = major;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String toString(){
        return super.toString()+" \nMajor: "+getMajor();
    }
}
class Instructor extends Person{
    private int salary;
    public Instructor(String name, int yearOfBirth, int salary){
        super(name, yearOfBirth);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString(){
        return super.toString()+" \nMajor: "+getSalary();
    }
}

