
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class Jaytree{
    
    public static void main(String args[]){
        DefaultMutableTreeNode DJU=new DefaultMutableTreeNode("DJ's");
        DefaultTreeModel model=new DefaultTreeModel(DJU);
        JTree tree=new JTree(model);
        
        DefaultMutableTreeNode local=new DefaultMutableTreeNode("Local");
        DefaultMutableTreeNode international=new DefaultMutableTreeNode("International");
        model.insertNodeInto(local, DJU, 0);
        model.insertNodeInto(international, DJU, 1);
        
        DefaultMutableTreeNode culoe=new DefaultMutableTreeNode("Culoe De Song");
        DefaultMutableTreeNode vinny=new DefaultMutableTreeNode("Vinny Da Vinci");
        DefaultMutableTreeNode christoz=new DefaultMutableTreeNode("Christos");
        DefaultMutableTreeNode kanunu=new DefaultMutableTreeNode("Kanunu");
        DefaultMutableTreeNode trancemicsoul=new DefaultMutableTreeNode("Trancemicsoul");
        DefaultMutableTreeNode c9ine=new DefaultMutableTreeNode("C9ine");
        DefaultMutableTreeNode jullian =new DefaultMutableTreeNode("Jullian Gomes");
        DefaultMutableTreeNode ralf=new DefaultMutableTreeNode("Ralf Gum");
        DefaultMutableTreeNode sai=new DefaultMutableTreeNode("Sai n Ribatone");
        DefaultMutableTreeNode dxcape=new DefaultMutableTreeNode("Deep Xcape");
        model.insertNodeInto(culoe, local, 0);
        model.insertNodeInto(vinny, local, 1);
        model.insertNodeInto(christoz, local, 2);
        model.insertNodeInto(kanunu, local, 3);
        model.insertNodeInto(trancemicsoul, local, 4);
        model.insertNodeInto(c9ine, local, 5);
        model.insertNodeInto(jullian, local, 6); 
        model.insertNodeInto(ralf, local, 7); 
        model.insertNodeInto(sai, local, 8); 
        model.insertNodeInto(dxcape,local, 9); 
        
        DefaultMutableTreeNode rocco=new DefaultMutableTreeNode("Rocco");
        DefaultMutableTreeNode glenn=new DefaultMutableTreeNode("Glenn Underground");
        DefaultMutableTreeNode atjazz=new DefaultMutableTreeNode("Atjazz");
        DefaultMutableTreeNode lars=new DefaultMutableTreeNode("Lars Behrenroth");
        DefaultMutableTreeNode jimster=new DefaultMutableTreeNode("Jimster");
        DefaultMutableTreeNode layabouts=new DefaultMutableTreeNode("The Layabouts");
        DefaultMutableTreeNode charles =new DefaultMutableTreeNode("Charles Website");
        DefaultMutableTreeNode louie=new DefaultMutableTreeNode("Louie Vega");
        DefaultMutableTreeNode osunlade=new DefaultMutableTreeNode("Osunlade");
        DefaultMutableTreeNode stimming=new DefaultMutableTreeNode("Stimming");
        model.insertNodeInto(rocco, international, 0);
        model.insertNodeInto(glenn, international, 1);
        model.insertNodeInto(atjazz, international, 2); 
        model.insertNodeInto(lars, international, 3); 
        model.insertNodeInto(jimster, international, 4);
        model.insertNodeInto(charles, international, 5);
        model.insertNodeInto(louie, international, 6);
        model.insertNodeInto(osunlade, international, 7);
        model.insertNodeInto(stimming, international, 8); 
        model.insertNodeInto(layabouts, international, 9); 
        
        JScrollPane pane=new JScrollPane(tree);
        
        JFrame mainwindow=new JFrame();
        mainwindow.setTitle("Tree Demo");
        mainwindow.setSize(350, 350);
        mainwindow.getContentPane().add(pane);
        mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainwindow.setVisible(true);
        
    }
}