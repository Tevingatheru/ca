package gui;

public class Student {

    private String firstName;
    private String surname;
    private String getStudentDetails;

    public Student(String x, String y) {
        firstName = x;
        surname = y;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the getStudentDetails
     */
    public String getGetStudentDetails() {
        return "student is " + firstName + surname;
    }

}
