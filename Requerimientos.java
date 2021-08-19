package Vista;

import Vista.Requerimiento1;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VistaRequerimientos;
import java.sql.SQLException;
 
public class Requerimientos {
    
    public static boolean RIGHT_TO_LEFT = false;
    
    public static void addComponentsToPane(Container pane) {
        
        if (!(pane.getLayout() instanceof BorderLayout)) {
            pane.add(new JLabel("Container doesn't use BorderLayout!"));
            return;
        }
        
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(
                    java.awt.ComponentOrientation.RIGHT_TO_LEFT);
        }
        
        JButton button1 = new JButton("EMPRESA CONSTRUCTORA");
        pane.add(button1, BorderLayout.PAGE_START);
        
        //Make the center component big, since that's the
        //typical usage of BorderLayout.
        JButton button2 = new JButton("Requerimientos- 2");
        button2.setPreferredSize(new Dimension(200, 100));
        pane.add(button2, BorderLayout.CENTER);
        
        JButton button3 = new JButton("Requerimientos- 1");
        pane.add(button3, BorderLayout.LINE_START);
        
        JButton button4 = new JButton("By: Lina Ayala");
        pane.add(button4, BorderLayout.PAGE_END);
        
        JButton button5 = new JButton("Requerimiento- 3");
        pane.add(button5, BorderLayout.LINE_END);
            
        ActionListener escuchador = new ActionListener(){
        
            public void actionPerformed(ActionEvent e) {
            
                System.out.println("Requerimiento 1");
                VistaRequerimientos.requerimiento1();
                try {
                    Requerimiento1 OBJ1 = new Requerimiento1();
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }
        };
        button3.addActionListener(escuchador);
    
    ActionListener escuchador1 = new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
        
            System.out.println("\nRequerimiento 2");
            VistaRequerimientos.requerimiento2();
            try {
                Requerimiento2 OBJ2 = new Requerimiento2();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

        }
    };
        button2.addActionListener(escuchador1);
    
    ActionListener escuchador2 = new ActionListener(){
        
            public void actionPerformed(ActionEvent e){
            
              System.out.println("\nRequerimiento 3");
              VistaRequerimientos.requerimiento3();
              try {
                Requerimiento3 OBJ3 = new Requerimiento3();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

    
            }
        };
            button5.addActionListener(escuchador2);
    
}
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        
        //Create and set up the window.
        JFrame frame = new JFrame("BorderLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        //Use the content pane's default BorderLayout. No need for
        //setLayout(new BorderLayout());
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

