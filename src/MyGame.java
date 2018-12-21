

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Timer;


/**
 *
 * @author seeds5015
 */
public class MyGame extends JComponent implements ActionListener {

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
    


BufferedImage background01 = loadImage("GameClassBackground01.png");

BufferedImage background02 = loadImage("B02.png");
BufferedImage background03 = loadImage("B03.png");

 int gravity = 1;
    Rectangle playerface = new Rectangle(50,500,80,150);
    Rectangle player = new Rectangle(50,500,100,150);
    Rectangle floor = new Rectangle (0,550,250,100);
    Rectangle block = new Rectangle(250,400,10000,150);
    
    boolean left = false;
    boolean right = false;
    boolean jump = false;
    boolean onGround = true;
    
    int camX = 0;
    
    int yVal = 0;
int face = 0;
    long fireTime = System.currentTimeMillis() + 200;
    
BufferedImage character = loadImage("characterface.png");
BufferedImage characterR1 = loadImage("charcterwalkright.png");
BufferedImage characterR2 = loadImage("charcterwalkright6.png");
BufferedImage characterL1 = loadImage("charcterwalkleft.png");
BufferedImage characterL2 = loadImage("charcterwalkleft8.png");
BufferedImage characterjump = loadImage("charcterwalkleft8.png");
BufferedImage characterjump2 = loadImage("charcterwalkleft8.png");




//int face = g.drawImage(character, player.x-camX, player.y,player.width,player.height, null);

    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public MyGame(){
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
    
    public BufferedImage loadImage (String Filename){ 
              BufferedImage img = null;
              try{
    img = ImageIO.read(new File(Filename));
}catch(Exception e){
    e.printStackTrace();
}return img;
    }
    
    

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        














 g.drawImage(background01,0-camX,0,700,600,null);
g.drawImage(background02,800-camX,0,800,600,null);
g.drawImage(background03,16000-camX,0,800,600,null);


 
       
       // draw the floor
       g.setColor(Color.white);
       g.fillRect(floor.x-camX,floor.y,floor.width,floor.height);
       g.fillRect(block.x-camX,block.y,10000,block.height);
       
       
       
       
       
       
       
       
       

       //draw the player
//       g.setColor(Color.RED);
//       g.fillRect(player.x,player.y,player.width,player.height);

//        g.drawImage(character, player.x-camX, player.y,player.width,player.height, null);


    
        
    long time = System.currentTimeMillis();
//characters movement  while walking right
    if(time > fireTime){
        
        fireTime = time + 200;
        if(face == 0){
            face = 1;
        }else{
            face = 0;
        }
    }
    
if(right ){
    if(face == 0){
g.drawImage(characterR1, player.x-camX, player.y,player.width,player.height, null);
    }else if(face == 1){
        g.drawImage(characterR2, player.x-camX, player.y,player.width,player.height, null);
    }
}
else if(left){
    if (face == 0){
 g.drawImage(characterL1, player.x-camX, player.y,player.width,player.height, null);       
    }else if(face ==1){
 g.drawImage(characterL2, player.x-camX, player.y,player.width,player.height, null);   
    }
    
}else if(jump&&right){
    g.drawImage(characterL1, player.x-camX, player.y,player.width,player.height, null);
}
else{
   g.drawImage(character, player.x-camX, player.y,playerface.width,playerface.height, null);     
    }







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
        if(right){
            player.x = player.x + 3;
            camX = camX + 3;
        } else if (left){
            player.x = player.x - 3;
            camX = camX - 3;
        }
        
        //jumping stuff
        if(jump && onGround){
            yVal = - 19;
            onGround = false;
        }
        //gravity changes Y veloeity
        yVal = yVal + gravity;
        // veloeity changes y position
        player.y = player.y + yVal;
        
        // is player on the floor
       // if(player.y + player.height > floor.y && player.x > floor.x && player.x < floor.x + floor.width){
           if(player.intersects(floor)){
       //stop moving up or down
            yVal = 0;
            // correct the position
            player.y = floor.y - player.height;
            // set on ground
            onGround = true;
        }
            if(player.intersects(block)){
            Rectangle overLap = player.intersection(block);
            if(overLap .height < overLap.width){
            //stop moving up or down
            yVal = 0;
            // correct the position
            player.y = block.y - player.height;
            // set on ground
            onGround = true;
            }else{
                // if the player is on the right
                if(player.x < block.x){
                    player.x = player.x - overLap.width;
                } else {
                    player.x = player.x + overLap.width;
                }
            }
        }
    
    }

//    private BufferedImage loadImage(String GameClassBackground01(1)){
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

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
int Key = e.getKeyCode();
            if(Key == KeyEvent.VK_RIGHT){
                right = true;
                
            } else if(Key == KeyEvent.VK_LEFT){
                left = true;
            } else if(Key == KeyEvent.VK_SPACE){
                jump = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
int Key = e.getKeyCode();
            if(Key == KeyEvent.VK_RIGHT){
                right = false;
            } else if(Key == KeyEvent.VK_LEFT){
                left = false;
            } else if(Key == KeyEvent.VK_SPACE){
                jump = false;
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
        MyGame game = new MyGame();
    }
}





