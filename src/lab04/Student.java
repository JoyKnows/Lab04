package lab04;

public class Student extends Person {
    private long UniRollNumber;
    private double currentCPI;


    public Student(String name, int age, char gender, long uniRollNumber, double currentCPI) {
        super(name, age, gender);
        this.UniRollNumber = uniRollNumber;
        this.currentCPI = currentCPI;
    }

    public long getUniRollNumber() {
        return UniRollNumber;
    }

    public void setUniRollNumber(long uniRollNumber) {
        this.UniRollNumber = uniRollNumber;
    }

    public double getCurrentCPI() {
        return currentCPI;
    }

    public void setCurrentCPI(double currentCPI) {
        this.currentCPI = currentCPI;
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("Hello, my name is " + getName() + " I am a " + getGender() + " and I am " + getAge() + " years old.My University Roll Number is " + getUniRollNumber() + " and my CPI is " + getCurrentCPI());
        return response.toString();
    }

}
