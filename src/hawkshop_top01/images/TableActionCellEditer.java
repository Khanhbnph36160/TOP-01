/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hawkshop_top01.images;

import hawkshop_top01.view.Action_voucher;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

   
/**
 *
 * @author khuat
 */
  
public class TableActionCellEditer extends DefaultCellEditor{

    private TableAcitionEvent event;
    public TableActionCellEditer(TableAcitionEvent event) {
        super(new JCheckBox());
        this.event = event;
    }
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
       Action_voucher acition = new Action_voucher();
       acition.initEvent(event, row);
       acition.setBackground(table.getSelectionBackground());
       return acition;
        
    }
    
   
    
}
