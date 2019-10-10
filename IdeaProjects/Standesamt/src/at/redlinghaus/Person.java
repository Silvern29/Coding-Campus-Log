package at.redlinghaus;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMarried;

    Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMarried = false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                '}';
    }

    public int getAge(){
        return this.age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
