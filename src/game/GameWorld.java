package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

    public class GameWorld extends World {

        private DynamicBody student;

        public GameWorld() {
            super();

            // Ground
            Shape groundShape = new BoxShape(11f, 0.5f);
            StaticBody ground = new StaticBody(this, groundShape);
            ground.setPosition(new Vec2(0f, -11.5f));

            // Platform
            Shape platformShape = new BoxShape(3.5f, 0.5f);
            StaticBody platform1 = new StaticBody(this, platformShape);
            platform1.setPosition(new Vec2(-8f, -5.5f));

            // Student
            Shape studentShape = new BoxShape(1f, 2f);
            student = new DynamicBody(this, studentShape);
            student.setPosition(new Vec2(7f, -9f));
            student.addImage(new BodyImage("data/student.png", 4f));
        }

        public DynamicBody getStudent() {
            return student;
        }
    }








