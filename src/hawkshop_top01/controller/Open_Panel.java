/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hawkshop_top01.controller;

import hawkshop_top01.Beans.List_Beans;
import hawkshop_top01.view.Bill_Panel;
import hawkshop_top01.view.Customer_Panel;
import hawkshop_top01.view.Employee_Panel;
import hawkshop_top01.view.Main_Frame;
import hawkshop_top01.view.Product_Panel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author tuantq148
 */
public class Open_Panel {
    private JPanel root;
    private String kindSelect = "";
    
    private List<List_Beans> listItem = null;
    
    public Open_Panel(JPanel jpnroot){
        this.root = jpnroot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelect = "SanPham";
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new Main_Frame());
    }
    
//    public void setEvent(List<List_Beans> listItem){
//        this.listItem = listItem;
//        
//        for (List_Beans item : listItem) {
//            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
//        }
//    }
    
    
    public void setEvent(List<List_Beans> listItem){
        this.listItem = listItem;
        
        for (List_Beans item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "SanPham":
                    node = new Product_Panel();
                    break;
                case "NhanVien":
                    node = new Employee_Panel();
                    break;
                case "KhachHang":
                    node = new Customer_Panel();
                    break; 
                case "HoaDon":
                    node = new Bill_Panel();
                    break;
                default:
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
//            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelect = kind;
            jpnItem.setBackground(new Color(255, 255, 255));
            jlbItem.setBackground(new Color(255, 255, 255));
            jlbItem.setForeground(Color.yellow);
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(Color.white);
        }

        @Override
        public void mouseExited(MouseEvent e) { //khi thoát rê chuột ở menu
            if (!kindSelect.equalsIgnoreCase(kind)) {
                jpnItem.setBackground( new Color(246,185,59));
                jlbItem.setBackground(Color.black);
            }
        }
        
        private void setChangeBackground(String kind){
            for (List_Beans item : listItem) {
                if (item.getKind().equalsIgnoreCase(kind)) {
                    item.getJlb().setBackground(Color.white);
                    item.getJpn().setBackground(Color.white); 
                    jlbItem.setForeground(Color.black);
                }else{
                    item.getJlb().setBackground(new Color(153,153,255)); 
                    item.getJpn().setBackground(new Color(153,153,255));
                }
            }
        }
    
    }
    
}
