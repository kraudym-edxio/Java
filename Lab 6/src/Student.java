public class Student extends Person {

    private String programName;
    private int programYear;
    private Level level;

    public Student() {
        super();
        this.programName = "";
        this.programYear = 0;
        this.level = Level.undergraduate;
    }

    public Student(String name, int age, String gender, String programName, int programYear, Level level) {
        super(name, age, gender);
        this.programName = programName;
        this.programYear = programYear;
        this.level = level;
    }

    public String getProgramName() {
        return programName;
    }

    public int getProgramYear() {
        return programYear;
    }

    public Level getLevel() {
        return level;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public void setProgramYear(int programYear) {
        this.programYear = programYear;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() + ", Program: " + this.getProgramName() + ", Level: " + this.getLevel() + ", Year: " + this.getProgramYear();
    }

    enum Level {
        undergraduate,
        graduate
    }

}