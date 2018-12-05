
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
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
public class GameClassExamplePong extends JComponent implements ActionListener {

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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    Rectangle paddle1 = new Rectangle(20, 250, 25, 100);
    Rectangle paddle2 = new Rectangle(WIDTH - 45, 250, 25, 100);

    Rectangle ball = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
//control variables for paddle
    boolean paddle1Up = false;
    boolean paddle1Down = false;

    boolean paddle2Up = false;
    boolean paddle2Down = false;

    
    
    //control variables for ball
    int ballx =1;
    int bally =1;
    int ballSpeed = 7;
    
   //score         
    int score1 =0;
    int score2 = 0;
    
    //font
    Font scoreFont = new Font("arial",Font.BOLD, 36);
    
    
    
    
    
    
    
    
    
    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public GameClassExamplePong() {
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
        gameTimer = new Timer(desiredTime, this);
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






















//draw the black background
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 800, 600);

// draw paddles
        g.setColor(Color.WHITE);
        g.fillRect(paddle1.x, paddle1.y, paddle1.width, paddle1.height);

        g.fillRect(paddle2.x, paddle2.y, paddle2.width, paddle2.height);

//draw the ball
        g.fillOval(ball.x, ball.y, ball.width, ball.height);

 //draw the score
 g.setFont(scoreFont);
 g.drawString("" + score1,WIDTH/4,50);
 g.drawString("" + score2,3*WIDTH/4,50);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
  }
    
    public void resetBall(){
            ball.x = WIDTH/2 -10;
            ball.y = WIDTH/2 -10;
        }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        
        //move ball
        ball.x =ball.x + ballx*ballSpeed;
        ball.y =ball.y + bally*ballSpeed ;
        
        //ball hits bottom
        if(ball.y +ball.height > HEIGHT) {
            bally =-1;
        }
        //if it hits the top
        if (ball.y < 0) {
            bally = 1 ;
        }
        //ball hits right side player1 +1
        if(ball.x + ball.width > WIDTH){
            score1++;
            resetBall();
        }
        //did ball hit left side
        if (ball.x < 0){
            //add to player2 score
            score2++;
            resetBall();
        }
        
        
        
        //move paddles
        if (paddle1Up && paddle1.y >0){
            paddle1.y = paddle1.y -5;    
        }else if(paddle1Down && paddle1.y + paddle1.height < HEIGHT){
            paddle1.y = paddle1.y +5;
        }
        if (paddle2Up && paddle2.y >0){
            paddle2.y = paddle2.y -5;    
        }else if(paddle2Down && paddle2.y + paddle2.height < HEIGHT){
            paddle2.y = paddle2.y +5;
        }
        
        
        //did ball hit paddle 2?
        if (ball.intersects(paddle2)) {
            ballx =-1;
        }if (ball.intersects(paddle1)) {
            ballx =1;
        
//        }if (ball.intersects(paddle1)){
//            ballx = ballSpeed + 1;
//        }if(ball.intersects(paddle2)){
//            bally = ballSpeed + 1;
        }
        
        //DIID SOMEONE WIN?
        if (score1 == 10 || score2 ==10){
        gameTimer.stop();
            System.out.println("GAME OVER");
    }
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

            //determines which key is pressed
            int key = e.getKeyCode();
            //set control variables
            if (key == KeyEvent.VK_W) {
                paddle1Up = true;

            } else if (key == KeyEvent.VK_S) {
                paddle1Down = true;
            } else if (key == KeyEvent.VK_UP) {
                paddle2Up = true;
            } else if (key == KeyEvent.VK_DOWN) {
                paddle2Down = true;
            }

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
//determines which key is pressed
            int key = e.getKeyCode();
            //set control variables
            if (key == KeyEvent.VK_W) {
                paddle1Up = false;

            } else if (key == KeyEvent.VK_S) {
                paddle1Down = false;
            } else if (key == KeyEvent.VK_UP) {
                paddle2Up = false;
            } else if (key == KeyEvent.VK_DOWN) {
                paddle2Down = false;
            }
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
        GameClassExamplePong game = new GameClassExamplePong();
    }
}
