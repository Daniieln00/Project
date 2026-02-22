package game;

import city.cs.engine.Walker;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StudentController extends KeyAdapter {

    private final Walker student;

    private static final float WALK_SPEED = 6.0f;
    private static final float JUMP_SPEED = 18.0f;

    public StudentController(Walker student) {
        this.student = student;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT) {
            student.startWalking(-WALK_SPEED);
        } else if (code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT) {
            student.startWalking(WALK_SPEED);
        } else if (code == KeyEvent.VK_W || code == KeyEvent.VK_SPACE || code == KeyEvent.VK_UP) {
            student.jump(JUMP_SPEED);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_A || code == KeyEvent.VK_LEFT ||
                code == KeyEvent.VK_D || code == KeyEvent.VK_RIGHT) {
            student.stopWalking();
        }
    }
}