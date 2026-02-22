package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class GameWorld extends World {

    // ====== ATRIBUTOS ======
    private Student student;

    // ====== CONSTRUCTOR ======
    public GameWorld() {

        // Gravedad
        super();
        setGravity(20);

        // ----- SUELO -----
        Shape groundShape = new BoxShape(11.5f, 0.5f);
        StaticBody ground = new StaticBody(this, groundShape);
        ground.setPosition(new Vec2(0f, -11.5f));

        // ----- PLATAFORMA 1 -----
        Shape platformShape1 = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape1);
        platform1.setPosition(new Vec2(-5f, -5f));

        // ----- PLATAFORMA 2 -----
        Shape platformShape2 = new BoxShape(4f, 0.5f);
        StaticBody platform2 = new StaticBody(this, platformShape2);
        platform2.setPosition(new Vec2(4f, -7f));

        // ----- CREAR STUDENT -----
        student = new Student(this);
        student.setPosition(new Vec2(7f, -9f));
    }

    // ====== GETTER ======
    public Student getStudent() {
        return student;
    }
}





