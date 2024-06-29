/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author svv
 */
public class Clock1 extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
	/**
     * Creates new form Clock
     */
    public static int i=0;
    Timer t=new Timer();
    Date obj=new Date();
    String date=obj.toString();
    String hour=date.charAt(11)+""+date.charAt(12);
    int h=Integer.parseInt(hour);
    public Clock1() 
    {
       initComponents();
       jLabel2.setVisible(false);
       TimerTask time=new TimerTask()
       {
           public void run()
           {
               if(i==0 || i==1)
               {
                   if(h>=5 && h<12)
                   {
                        jLabel1.setText( "Good Morning!");
                   }
                   if(h>=12 && h<17)
                   {
                        jLabel1.setText( "Good Afternoon!");
                   }
                   if(h>=17 && h<20)
                   {
                        jLabel1.setText( "Good Evening!");
                   }
                   if(h>=20 && h<23)
                   {
                        jLabel1.setText( "Good Night!");
                   }
                   if(h>=0 && h<5)
                   {
                        jLabel1.setText( "Good Night!");
                   }
               }
               if(i==2)
               {
                   jLabel1.setText("");
                   jLabel2.setVisible(true);
               }
               else
               {
                   Date d1=new Date();
                   String d2=d1.toString();
                   String d3="";
                   for(int i=11;i<=18;i++)
                   {
                       d3=d3+d2.charAt(i);
                   }
                   jLabel2.setText(""+d3);
               }
               i++;
           }
       };
       t.scheduleAtFixedRate(time, 0, 1*1000);
    }

 
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setAlignmentX(45.0F);
        jLabel1.setAlignmentY(80.0F);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 410, 80));

        jLabel2.setFont(new java.awt.Font("Let's go Digital", 0, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 80));
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 450, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Clock().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
