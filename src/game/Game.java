package game;

import javax.swing.JFrame;

public class Game {

    public Game() {
        // 1) Mundo
        GameWorld world = new GameWorld();

        // 2) Vista
        GameView view = new GameView(world, 1200, 750);

        // 3) Ventana
        JFrame frame = new JFrame("City Game");
        frame.add(view);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

        // 4) Controles (IMPORTANTE)
        // Mejor enganchar el listener a la VIEW para que el foco sea el correcto
        view.addKeyListener(new StudentController(world.getStudent()));
        view.setFocusable(true);
        view.requestFocus();

        // 5) Arrancar simulación
        world.start();
    }

    public static void main(String[] args) {
        new Game();
    }
}