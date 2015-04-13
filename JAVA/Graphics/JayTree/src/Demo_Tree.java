
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.*;

public class Demo_Tree extends JFrame{
   
    
    public static void main(String []args){
    
        DefaultMutableTreeNode HouseNation=new DefaultMutableTreeNode("HOUSE NATION");
        DefaultTreeModel model=new DefaultTreeModel(HouseNation);
        JTree myTree=new JTree(model);
        
        DefaultMutableTreeNode Music=new DefaultMutableTreeNode("Music");
        DefaultMutableTreeNode DJs=new DefaultMutableTreeNode("Place4DJs");
        model.insertNodeInto(Music, HouseNation, 0);
        model.insertNodeInto(DJs, HouseNation, 1);
        
        DefaultMutableTreeNode Soulful=new DefaultMutableTreeNode("Soulful House");
        DefaultMutableTreeNode Deep=new DefaultMutableTreeNode("Deep House");
        DefaultMutableTreeNode Tempo=new DefaultMutableTreeNode("MidTempo");
        DefaultMutableTreeNode Afro=new DefaultMutableTreeNode("Afro House");
        model.insertNodeInto(Soulful, Music, 0);
        model.insertNodeInto(Deep, Music, 1);
        model.insertNodeInto(Tempo, Music, 2);
        model.insertNodeInto(Afro,Music,3);
        
        DefaultMutableTreeNode Lars=new DefaultMutableTreeNode("Lars Behrenroth");
        DefaultMutableTreeNode TrevorD=new DefaultMutableTreeNode("Trevor Deep");
        DefaultMutableTreeNode Shades=new DefaultMutableTreeNode("Shades of grey");
        DefaultMutableTreeNode Culoe=new DefaultMutableTreeNode("Culoe De Song");
        model.insertNodeInto(Lars,DJs,0);
        model.insertNodeInto(TrevorD,DJs,1);
        model.insertNodeInto(Shades,DJs,2);
        model.insertNodeInto(Culoe,DJs,3);
        
        JScrollPane pane=new JScrollPane(myTree);
        
        JFrame mainwindow=new JFrame();
        mainwindow.setTitle("Demo Tree");
        mainwindow.getContentPane().add(pane);
        mainwindow.setSize(150, 250);
        mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainwindow.setVisible(true);   
    }
}