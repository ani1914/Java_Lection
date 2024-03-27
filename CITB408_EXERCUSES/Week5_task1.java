//Task1
Да се реализира процесът на записване и обучение на студенти в университет. Процесът изисква реализирането на минимум 3 класа: 
Курс (Course)
Програма (Program)
Студент (Student)
Всеки Курс има име, пореден номер и брой кредити., като може да бъде задължителен (REQUIRED) или избираем (ELECTIVE). Необходимо е поредният номер на курса да се задава автоматично, като всеки следващ номер е с 1 > от предходния.
курсове. От това дали програмата е MAJOR или MINOR, се определя колко е броя на кредитите, които са необходими за завършване на програмата.
В клас Програма е необходимо да се реализират минимум следните методи:
Метод за добавяне на курс
Метод за премахване на курс
Метод за показване на курсовете в програмата
Метод за показване на задължителните или избираемите курсове, в зависимост от параметъра, който се предава на метода
Студентът има факултетен номер и име. Всеки студент може да се запише в една MAJOR и една MINOR програма. Освен това той се записва в курсове, които се предлагат от програмите, в които е записан. Пази се информация за курсовете, които студентът е завършил и дали студентът се е дипломирал.
Необходимо да се реализират минимум следните методи:
Метод за записване на студент в програма.
Метод за записване на студент в курс – необходимо е да се направи проверка за това, дали курсът, който се предава като аргумент на метода се предлага от програмите, в които се записан студентът.
Метод за „отписване“ от курс.
Метод за „завършване“ на курс (добавяне на курс в списъка със завършените курсове)
Метод, който връща броя на кредитите, които студентът е взел до момента
Метод, който връща колко кредита остават на студента, за да се дипломира (всеки студент трябва да събере броя на кредитите в MAJOR програмата, за да се дипломира)
Метод, който променя състоянието на студента в дипломиран.


public class Course {

    private String name;
    private int numberOfCredits;
    private CourseType courseType;
    private int id;
    private static int numberOfCourses = 0;

    public Course() {
        numberOfCourses++;
        this.id = numberOfCourses;
    }

    public Course(String name, int numberOfCredits, CourseType courseType) {
        numberOfCourses++;
        this.name = name;
        this.id = numberOfCourses;
        this.numberOfCredits = numberOfCredits;
        this.courseType = courseType;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public static int getNumberOfCourses() {
        return numberOfCourses;
    }

    public static void setNumberOfCourses(int numberOfCourses) {
        Course.numberOfCourses = numberOfCourses;
    }

    @Override
    public String toString() {
        return "enrollment.Course{" + "name=" + name + ", id=" + id + ", numberOfCredits=" + numberOfCredits + ", courseType=" + courseType + '}';
    }

}

public enum CourseType {
    REQUIRED, ELECTIVE
}

public class Program {

    private String name;
    private ProgramType programType;
    private List<Course> courseList;

    public Program() {
        this.courseList = new ArrayList();
    }

    public Program(String name, ProgramType programType, List<Course> courseList) {
        this.name = name;
        this.programType = programType;
        this.courseList = courseList;
    }

    public Program(String name, ProgramType programType) {
        this.name = name;
        this.programType = programType;
        this.courseList = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProgramType getProgramType() {
        return programType;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setProgramType(ProgramType programType) {
        this.programType = programType;
    }

    public void addCourse(Course course) {
        if (!this.courseList.contains(course)) {
            this.courseList.add(course);
        }
    }

    public void removeCourse(Course course) {
        this.courseList.remove(course);
    }

    public void displayCourses() {
        for (Course course : courseList) {
            System.out.println(course);
        }
    }

    public void displayCoursesByType(CourseType courseType) {
        for (Course course : courseList) {
            if (course.getCourseType() == courseType) {
                System.out.println(course);
            }
        }
    }

    @Override
    public String toString() {
        return "enrollment.Program{" + "name=" + name + ", programType=" + programType + '}';
    }
}


public enum ProgramType {
    MAJOR(240), MINOR(120);

    private int numberOfCredits;

    private ProgramType(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

}


public class Student {

    private String name;
    private final String facultyNumber;
    private boolean graduated;
    private List<Program> programs;
    private List<Course> courses;
    private List<Course> graduatedCourses;

    public Student(String facultyNumber) {
        this.facultyNumber = facultyNumber;
        this.programs = new ArrayList();
        this.courses = new ArrayList();
        this.graduatedCourses = new ArrayList();
    }

    public Student(String name, String facultyNumber) {
        this.name = name;
        this.facultyNumber = facultyNumber;
        this.graduated = false;
        this.programs = new ArrayList();
        this.courses = new ArrayList();
        this.graduatedCourses = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setIsGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public boolean isProgramTypeEnrolled(ProgramType programType) {
        for (Program program : this.programs) {
            if (program.getProgramType() == programType) {
                return true;
            }
        }
        return false;
    }

    public void addProgram(Program program) {
        if (!isProgramTypeEnrolled(program.getProgramType())) {
            this.programs.add(program);
        }
    }

    public void removeProgram(Program program) {
        this.programs.remove(program);
    }

    public void addCourse(Course course) {
        boolean isCourseAdded = false;
        for (Program program : this.programs) {
            if (program.getCourseList().contains(course)) {
                this.courses.add(course);
                isCourseAdded = true;
                break;
            }
        }
        System.out.println("The course is added: " + isCourseAdded);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }

    public void graduateCourse(Course course) {
        boolean isCourseGraduated = false;
        if (this.courses.contains(course)) {
            this.graduatedCourses.add(course);
            isCourseGraduated = true;
        }
        System.out.println("The course is graduated: " + isCourseGraduated);
    }

    public void removeGraduatedCourse(Course course) {
        this.graduatedCourses.remove(course);
    }

    public int numberOfCreditsGot() {
        int numberOfCredits = 0;
        for (Course course : this.graduatedCourses) {
            numberOfCredits += course.getNumberOfCredits();
        }
        return numberOfCredits;
    }

    public int numberOfCreditsToGet() {
        return ProgramType.MAJOR.getNumberOfCredits() - numberOfCreditsGot();
    }

    public void graduateStudent() {
        if (numberOfCreditsToGet() == 0) {
            this.graduated = true;
        }
    }

    @Override
    public String toString() {
        return "enrollment.Student{" + "name=" + name + ", facultyNumber=" + facultyNumber + ", isGraduated=" + graduated + '}';
    }

}

public class Main {
    private int test;

    public static void main(String[] args) {
        // Task 1
        {
            ProgramType programTypeMajor = ProgramType.MAJOR;
            System.out.println("Number of credits in " + programTypeMajor + " " + programTypeMajor.getNumberOfCredits());
            programTypeMajor.setNumberOfCredits(6);
            System.out.println("Number of credits in " + programTypeMajor + " " + programTypeMajor.getNumberOfCredits());

            ProgramType programTypeMinor = ProgramType.MINOR;
            System.out.println("Number of credits in " + programTypeMinor + " " + programTypeMinor.getNumberOfCredits());

            Program computerScience = new Program("Computer Science", ProgramType.MAJOR);
            Program gameDevelopment = new Program("Game Development", ProgramType.MINOR);

            Course citb408 = new Course("CITB408", 3, CourseType.REQUIRED);
            System.out.println(citb408);
            System.out.println("Number of courses: " + Course.getNumberOfCourses());
            Course citb509 = new Course("CITB509", 3, CourseType.REQUIRED);
            System.out.println(citb509);
            System.out.println("Number of courses: " + Course.getNumberOfCourses());
            Course citb415 = new Course("CSCB415", 3, CourseType.ELECTIVE);
            System.out.println(citb415);
            System.out.println("Number of courses: " + Course.getNumberOfCourses());
            Course citb869 = new Course("CSCB869", 3, CourseType.ELECTIVE);

            System.out.println(citb408);
            System.out.println(citb509);
            System.out.println(citb415);
            System.out.println(citb869);

            computerScience.addCourse(citb408);
            computerScience.addCourse(citb509);
            computerScience.addCourse(citb415);

            System.out.println(computerScience);
            computerScience.displayCourses();
            System.out.println("--------------------------------");
            computerScience.displayCoursesByType(CourseType.REQUIRED);


            Student pesho = new Student("Pesho", "F12345");
            Student maria = new Student("Maria", "F67890");

            pesho.addProgram(computerScience);
            pesho.addProgram(gameDevelopment);

            pesho.addCourse(citb408);
            pesho.addCourse(citb509);
//      pesho.addCourse(citb415);
            pesho.addCourse(citb869);

            pesho.graduateCourse(citb408);
            pesho.graduateCourse(citb509);
            pesho.graduateCourse(citb415);

            System.out.println(pesho + " got " + pesho.numberOfCreditsGot() + " number of credits");
            System.out.println(pesho + " has to get " + pesho.numberOfCreditsToGet() + " number of credits");
            System.out.println(pesho);

            pesho.graduateStudent();

            System.out.println(pesho);

            System.out.println(maria);
            maria.graduateStudent();
            System.out.println(maria);
        }

       

        }
    }
}

