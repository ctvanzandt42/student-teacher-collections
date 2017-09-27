public class Teacher extends Student {

    @Override
    public String toString() {
        return "Teacher " +
                "Name: '" + getFirstName() + " " + getLastName() + "'\n" +
                "Id: " + getId() + "\n" +
                "Grade: " + getGrade() + "\n";
    }
}
