/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hawkshop_top01.images;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
public class XImage {
    public static Image getAppIcon(){
       URL url = XImage.class.getResource("/icon/fpt.png");
       return new ImageIcon(url).getImage();
    }
}
