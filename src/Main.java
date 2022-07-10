import javax.swing.JFrame;

/*
 * @author Thomas Haller
 * date: 3/9/17
 */

public class Main {

  public static void main(String[] args) {

    JFrame obj = new JFrame();
    Gameplay gamePlay = new Gameplay();
    obj.setBounds(10, 10, 700, 600);
    obj.setTitle("Game");
    obj.setResizable(false);
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    obj.add(gamePlay);
    obj.setLocationRelativeTo(null);


  }

}
