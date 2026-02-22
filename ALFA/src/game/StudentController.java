package game;

import city.cs.engine.DynamicBody;
import org.jbox2d.common.Vec2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StudentController extends KeyAdapter {

    private final DynamicBody student;

    // Ajustes (puedes afinarlos luego)
    private static final float WALK_SPEED = 6.0f;
    private static final float JUMP_SPEED = 12.0f;

    public StudentController(DynamicBody student) {
        this.student = student;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT) {
            student.setLinearVelocity(new Vec2(-WALK_SPEED, student.getLinearVelocity().y));
        } else if (code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT) {
            student.setLinearVelocity(new Vec2(WALK_SPEED, student.getLinearVelocity().y));
        } else if (code == KeyEvent.VK_W || code == KeyEvent.VK_SPACE || code == KeyEvent.VK_UP) {
            // salto simple
            student.setLinearVelocity(new Vec2(student.getLinearVelocity().x, JUMP_SPEED));
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT ||
                code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT) {

            // parar movimiento horizontal al soltar
            student.setLinearVelocity(new Vec2(0, student.getLinearVelocity().y));
        }
    }
}