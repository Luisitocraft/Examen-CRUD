/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.syscenterlife.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author ACER
 */
public class GUIMain extends JFrame {
    JTabbedPane jtpane;
    JScrollPane scrollPane;
    ConfigurableApplicationContext ctx;

   

    public GUIMain() {
        this.setTitle("SystemMain@DMP");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(new Dimension(screenSize.width, (screenSize.height) - 36));
        MainProducto mp = new MainProducto(); 
     
        mp.setPreferredSize(new Dimension(1024, 600));}
}

