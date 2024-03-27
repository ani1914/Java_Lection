//Task2
В университет работят служители в администрация и преподаватели. Служителите и преподавателите имат  имена, трудов стаж в брой години и работят в определен департамент в университета. Служителите и преподавателите имат следните особености:
Служители – получават фиксирана заплата на месец
Преподавателите имат длъжност (професор, доцент, асистент). В зависимост от длъжността, се определя възнаграждението на преподавателя.
Всеки от работещите в университета за всяка година трудов стаж получава процент върху възнаграждението си.
Да се реализират методите за определяне на възнаграждението на работещите в университета.


    public AdminEmployee(String name, Department department, int workExperience) {
        super(name, department, workExperience);
    }

    @Override
    public BigDecimal salary() {

        return this.getDepartment().getUniversity().getBaseAdminSalary();
    }
}

    private String name;
    private University university;

    public Department(String name, University university) {
        this.name = name;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public University getUniversity() {
        return university;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}

public abstract class Employee {
    private String name;
    private Department department;
    private int workExperience;

    public Employee(String name, Department department, int workExperience) {
        this.name = name;
        this.department = department;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public abstract BigDecimal salary();

    public BigDecimal totalSalaryIncludingWorkExperience() {
        return salary().multiply (BigDecimal.valueOf(1 + workExperience * department.getUniversity().getWorkingExperiencePercentage() / 100));
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", workExperience=" + workExperience +
                '}';
    }
}


public enum Position {
    PROFESSOR(BigDecimal.valueOf(2000)), ASSOCIATE_PROFESSOR(BigDecimal.valueOf(1800)), ASSISTANT_PROFESSOR(BigDecimal.valueOf(1600));
    private BigDecimal salary;

    Position(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}

public class Teacher extends Employee {
    private Position position;

    public Teacher(String name, Department department, int workExperience, Position position) {
        super(name, department, workExperience);
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public BigDecimal salary() {
        return position.getSalary();
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "position=" + position +
                '}';
    }
}


public class University {
    private String name;
    private BigDecimal baseAdminSalary;
    private double workingExperiencePercentage;

    public University(String name, BigDecimal baseAdminSalary, double workingExperiencePercentage) {
        this.name = name;
        this.baseAdminSalary = baseAdminSalary;
        this.workingExperiencePercentage = workingExperiencePercentage;
    }

    public String getName() {
        return name;
    }

    public double getWorkingExperiencePercentage() {
        return workingExperiencePercentage;
    }

    public BigDecimal getBaseAdminSalary() {
        return baseAdminSalary;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", baseAdminSalary=" + baseAdminSalary +
                ", workingExperiencePercentage=" + workingExperiencePercentage +
                '}';
    }
}
