public class Student extends Person {
    private int gpa;
    private static final double STIPEND_AMOUNT = 36660.00;

    public Student() {
        super();
    }

    public Student(String name, String surname, int gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public String getPosition() {
        return "Student";
    }

    public String toString() {
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? STIPEND_AMOUNT : 0.00;
    }
}
