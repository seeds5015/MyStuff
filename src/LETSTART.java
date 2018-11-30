

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author seeds5015
 */
public class LETSTART extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "My Game";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    


    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public LETSTART(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        

        // Set things up for the game at startup

        preSetup();


       // Start the game loop
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
          // draw some grass
          
          
         //draw the sky
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 800, 400); 
          
         g.setColor(Color.ORANGE);
        g.fillRect(400,300,10,10);
        g.fillRect(401,300,10,10); 
        g.fillRect(410,300,10,10);
        g.fillRect(420,300,10,10);
        g.fillRect(430,300,10,10);
        g.fillRect(440,310,10,10);
        g.fillRect(450,320,10,10);
        g.fillRect(450,330,10,10);
        g.fillRect(450,340,10,10);
        g.fillRect(440,350,10,10);
        g.fillRect(430,360,10,10);
        g.fillRect(420,360,10,10);
        g.fillRect(410,360,10,10);
        g.fillRect(400,360,10,10);
        g.fillRect(390,350,10,10);
        g.fillRect(380,340,10,10);
        g.fillRect(380,330,10,10);
        g.fillRect(380,320,10,10);
        g.fillRect(390,310,10,10);
        g.fillRect(400,310,10,10);
        g.fillRect(400,320,10,10);
        g.fillRect(400,330,10,10);
        g.fillRect(400,340,10,10);
        g.fillRect(400,350,10,10);
        g.fillRect(390,350,10,10);
        g.fillRect(390,320,10,10);
        g.fillRect(390,330,10,10);
     g.fillRect(390,340,10,10);
        g.fillRect(410,350,10,10);
          g.fillRect(410,340,10,10);
        g.fillRect(410,330,10,10);
        g.fillRect(410,320,10,10);
        g.fillRect(410,310,10,10);
        g.fillRect(420,350,10,10);
        g.fillRect(420,340,10,10);
          g.fillRect(420,330,10,10);
        g.fillRect(420,320,10,10);
        g.fillRect(420,310,10,10);
        g.fillRect(420,320,10,10);
        g.fillRect(430,350,10,10);
        g.fillRect(430,340,10,10);
        g.fillRect(430,330,10,10);
        g.fillRect(430,320,10,10);
        g.fillRect(430,310,10,10);
        g.fillRect(440,330,10,10);
        g.fillRect(440,340,10,10);
        g.fillRect(440,350,10,10);
        g.fillRect(440,320,10,10);
        g.fillRect(400,320,10,10);
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
//        g.setColor(Color.GREEN);
//        g.fillRect(0, 50, 50, 50);
//       
//        
//        //draw the sky
//        g.setColor(Color.BLUE);
//        g.fillRect(0, 0, 800, 400);
//        
//        //draw the sun
//        g.setColor(Color.YELLOW);
//        g.fillOval(700, 30, 70, 70);
//        
//        //house
//        Color brown = new Color(207,136,80);
//        g.setColor(brown);
//        g.fillRect(200, 200, 400, 300);
//        
//        //roof
//        g.setColor(Color.RED);
//        int[] xpoints = {150, 400, 650};
//        int[] ypoints = {200, 100, 200};
//        g.fillPolygon(xpoints, ypoints, 3);
//        
//        //door and windows
//        g.setColor(Color.BLACK);
//        g.fillRect(375,400,50,100);
//        g.fillRect(250,400,50,50);
//        g.fillRect(500,400,50,50);
//        g.fillRect(250,270,50,50);
//        g.fillRect(500,270,50,50);
//        g.fillRect(375,270,50,50);

        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        LETSTART game = new LETSTART();
    }
}





