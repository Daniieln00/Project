package game;


import javax.swing.*;

public class Game {

    public Game() {
        GameWorld world = new GameWorld();

        GameView view = new GameView(world, 1200, 750);

        JFrame frame = new JFrame("City Game");
        frame.add(view);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

        frame.addKeyListener(new StudentController(world.getStudent()));

        world.start();
    }

    public static void main(String[] args) {
        new Game();
    }
}