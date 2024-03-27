//Task2
Направете UML диаграма и имплементация на модела (класове, абстрактни класове и интерфейси), който е описани по-долу:
Филм (Movie) има име, продължителност и жанр.
Занятие (Lecture) има тема и продължителност.
ObjectWithDuration - обект, който има продължителност
Практическо упражнение (PracticalClass) има тема, продължителност и брой задачи, които трябва да се решат.
Филмът, занятието и практическото упражнение могат да се заснемат.

public class Lecture extends ObjectWithDuration {
}
public class Movie extends ObjectWithDuration {
}
public class ObjectWithDuration implements Recordable {
    private double duration;

    @Override
    public void record() {
        System.out.println("Recording" + duration);
    }
}
public class PracticalClass extends Lecture {
}
public interface Recordable {
    void record();
}

