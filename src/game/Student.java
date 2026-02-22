package game;

import city.cs.engine.*;

public class Student extends Walker {

    private static final Shape SHAPE = new BoxShape(1f, 2f);
    private static final BodyImage IMAGE = new BodyImage("data/student.png", 4f);

    public Student(World world) {
        super(world, SHAPE);
        addImage(IMAGE);
    }
}