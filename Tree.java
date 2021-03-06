
/**
 * Creates an instance of a Tree.
 *
 * @author Joe Huang
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle leaf1;
    private Triangle leaf2;
    private Triangle leaf3;
    private Square trunk;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        leaf1 = new Triangle();
        leaf2 = new Triangle();
        leaf3 = new Triangle();
        trunk = new Square();
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        leaf1.moveHorizontal(x);
        leaf1.moveVertical(y);
        leaf2.moveHorizontal(x);
        leaf2.moveVertical(y);
        leaf3.moveHorizontal(x);
        leaf3.moveVertical(y);
        trunk.moveHorizontal(x);
        trunk.moveVertical(y);
        
        leaf2.moveVertical(20);
        leaf3.moveVertical(40);
        leaf1.changeSize(30, 60);
        leaf1.makeVisible();
        leaf2.changeSize(30, 60);
        leaf2.makeVisible();
        leaf3.changeSize(30, 70);
        leaf3.makeVisible();
        trunk.moveHorizontal(-20);
        trunk.moveVertical(35);
        trunk.changeSize(20);
        trunk.makeVisible();
       
        
        
        
    }
    
}