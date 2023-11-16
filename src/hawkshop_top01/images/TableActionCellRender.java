/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hawkshop_top01.images;

import hawkshop_top01.view.Action_voucher;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author khuat
 */
public class TableActionCellRender extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        
        Action_voucher action = new Action_voucher();
        if (isSelected==false&& row%2==0) {
            action.setBackground(Color.WHITE);
        } else{
            action.setBackground(com.getBackground());
        }
        return action;
    }
    
}
