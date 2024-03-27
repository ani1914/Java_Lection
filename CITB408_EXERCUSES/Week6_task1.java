//Task1
Направете UML диаграма и имплементация на модела (класове, абстрактни класове и интерфейси), който е описани по-долу:
Филм (Movie) има име и списък с актьори.
Занятие (Class) има тема.
ObjectWithDuration - обект, който има продължителност
Практическо упражнение (PracticalClass) има тема и брой задачи, които трябва да се решат.
Филмът, занятието и практическото упражнение могат да се заснемат.

public class Actor {
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class Lecture extends ObjectWithDuration {
    private String topic;

    public Lecture(int duration, String topic) {
        super(duration);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public void record() {
        System.out.println(this.topic);
        super.record();
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "topic='" + topic + '\'' +
                '}';
    }
}

public class Movie extends ObjectWithDuration {
    private String name;
    private List<Actor> actorList;

    public Movie(int duration, String name) {
        super(duration);
        this.name = name;
        this.actorList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void addActor(Actor actor) {
        this.actorList.add(actor);
    }

    @Override
    public void record() {
        System.out.println(this.name);
        super.record();
    }


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }
}


public class ObjectWithDuration implements Recordable{
    private int duration;

    public ObjectWithDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public void record() {
        for (int i = 1; i <= this.duration; i++) {
            System.out.println("Recording " + i + " minute!");
        }
    }

    @Override
    public String toString() {
        return "ObjectWithDuration{" +
                "duration=" + duration +
                '}';
    }
}

public class PracticalLecture extends Lecture {
    private int numberOfTasks;

    public PracticalLecture(int duration, String topic, int numberOfTasks) {
        super(duration, topic);
        this.numberOfTasks = numberOfTasks;
    }

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    @Override
    public String toString() {
        return "PracticalLecture{" +
                "numberOfTasks=" + numberOfTasks +
                '}';
    }
}

public interface Recordable {
    void record();
}

public class Main {

    public static void main(String[] args) {

        // Recordable Task
        System.out.println("-------------------------- Task 1 ------------------------");
        {
            Actor actor = new Actor("Johny Depp");
            Lecture lecture = new Lecture(40, "Arrays");
            PracticalLecture practicalLecture = new PracticalLecture(30, "Interfaces", 10);
            Movie movie = new Movie(90, "Pirates of the Caribbean");

            movie.addActor(actor);

            System.out.println(lecture);
            System.out.println(practicalLecture);
            System.out.println(movie);
            System.out.println(movie.getActorList());

            movie.record();
            lecture.record();
            practicalLecture.record();



        }

        
    }
}