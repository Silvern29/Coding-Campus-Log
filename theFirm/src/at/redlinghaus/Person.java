package at.redlinghaus;

import static at.redlinghaus.PersonalManagement.*;

public class Person {
    private String firstName;
    private String lastName;
    private String adress = "";
    private int age = 0;

    private String companyAdress = "";
    private String fullName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }
    public Person(String firstName, String lastName, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.fullName = firstName + " " + lastName;
    }

    public Person(String firstName, String lastName, String adress, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this. age = age;
        this.fullName = firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress() {
        this.companyAdress = String.format("Firma: %s%n       %s, %d %s%n       %s%n", company, compStreet, compZip, compCity, compEmail);
    }

    public void printPersonData(){
        System.out.printf("Name: %s%nAdresse: %s%n", this.fullName, this.adress);
    }

    public void printPersonData(int age){
        System.out.printf("Name: %s%nAdresse: %s%nAlter: %d%n", this.fullName, this.adress, this.age);
    }

    public void printPersonData(String companyName){
        System.out.printf("Name: %s%nAdresse: %s%nAlter: %d%n", this.fullName, this.adress, this.age);
        System.out.println(this.getCompanyAdress());
    }
}
