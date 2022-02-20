/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculadora;

import java.awt.Toolkit;

/**
 *
 * @author PC
 */
public class Formulario extends javax.swing.JFrame {

    int xMouse,yMouse;
    double nota1; 
    double nota2; 
    double nota3; 
    
    Boolean active = false;
    public Formulario() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/logoverde.png")));
    }
    
    public static String faltante(String numero1,String numero2){
    
    float a = Float.valueOf(numero1);
    float b = Float.valueOf(numero2);   
    
    float total = (float) ((float) (3 -(a*0.3 + b*0.3))/0.4);
        
    String texto= String.valueOf(total);   
    return texto;
    
    }
    public static String calculadora(String numero1,String numero2, String numero3){
        float a = Float.valueOf(numero1);
        float b = Float.valueOf(numero2); 
        
        float c = Float.valueOf(numero3);
        
        float resultado = (float) (((a*0.3)+(b*0.3)+(c*0.4)));
        
        String texto= String.valueOf(resultado);
    
        return texto;
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        calcular = new javax.swing.JPanel();
        calculartext = new javax.swing.JLabel();
        Tercero = new javax.swing.JLabel();
        separador3 = new javax.swing.JSeparator();
        corte3 = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        corte2 = new javax.swing.JTextField();
        separador2 = new javax.swing.JSeparator();
        corte1 = new javax.swing.JTextField();
        resultado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Segundo = new javax.swing.JLabel();
        segundaopcion = new javax.swing.JToggleButton();
        Primer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        barra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcular.setBackground(new java.awt.Color(0, 102, 102));
        calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcularMouseExited(evt);
            }
        });

        calculartext.setBackground(new java.awt.Color(51, 255, 0));
        calculartext.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        calculartext.setForeground(new java.awt.Color(255, 255, 255));
        calculartext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculartext.setText("CALCULAR");
        calculartext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout calcularLayout = new javax.swing.GroupLayout(calcular);
        calcular.setLayout(calcularLayout);
        calcularLayout.setHorizontalGroup(
            calcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calculartext, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        calcularLayout.setVerticalGroup(
            calcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calculartext, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 140, 30));

        Tercero.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Tercero.setForeground(new java.awt.Color(0, 102, 102));
        Tercero.setText("Nota tercer  corte: ");
        jPanel1.add(Tercero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 180, 30));

        separador3.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 180, 30));

        corte3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        corte3.setForeground(new java.awt.Color(0, 102, 102));
        corte3.setBorder(null);
        corte3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corte3ActionPerformed(evt);
            }
        });
        jPanel1.add(corte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 180, 30));

        separador1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 180, 30));

        corte2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        corte2.setForeground(new java.awt.Color(0, 102, 102));
        corte2.setBorder(null);
        jPanel1.add(corte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 180, 30));

        separador2.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 180, 30));

        corte1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        corte1.setForeground(new java.awt.Color(0, 102, 102));
        corte1.setBorder(null);
        jPanel1.add(corte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 180, 30));

        resultado.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        resultado.setForeground(new java.awt.Color(0, 102, 102));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultado.setText("0");
        jPanel1.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 140, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 100, 20));

        Segundo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Segundo.setForeground(new java.awt.Color(0, 102, 102));
        Segundo.setText("Nota Segundo corte: ");
        jPanel1.add(Segundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 180, 30));

        segundaopcion.setBackground(new java.awt.Color(0, 102, 102));
        segundaopcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundaopcionActionPerformed(evt);
            }
        });
        jPanel1.add(segundaopcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 20, 30));

        Primer.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Primer.setForeground(new java.awt.Color(0, 102, 102));
        Primer.setText("Nota primer corte: ");
        jPanel1.add(Primer, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 150, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calcular nota final");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 210, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadro.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 650, 380));

        cerrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar2.png"))); // NOI18N
        cerrar.setText("X");
        cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cerrarMouseMoved(evt);
            }
        });
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerrarMousePressed(evt);
            }
        });
        jPanel1.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 40, 40));

        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });
        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 30));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Version 2.0 ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 140, 30));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("@Jhoger Olmos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 110, -1));

        Fondo.setBackground(new java.awt.Color(0, 102, 51));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
     xMouse = evt.getX();
     yMouse = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
    int x = evt.getXOnScreen();
    int y = evt.getYOnScreen();
    this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_barraMouseDragged

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
       
       
       System.exit(0);
       
    }//GEN-LAST:event_cerrarMouseClicked

    private void cerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseMoved
    
    }//GEN-LAST:event_cerrarMouseMoved

    private void cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMousePressed
      cerrar.setForeground(new java.awt.Color(100, 0, 0));
    }//GEN-LAST:event_cerrarMousePressed

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
       cerrar.setForeground(new java.awt.Color(255, 0, 0));
      
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
      cerrar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_cerrarMouseExited

    private void calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularMouseClicked
        if(segundaopcion.isSelected()){
        String m = corte1.getText();
        String n = corte2.getText();
        String re = faltante(m,n);
        resultado.setText(re);
        
        
        }else{
       
        String m = corte1.getText();
        String n = corte2.getText();
        String b = corte3.getText();
        String re = calculadora(m,n,b);
        resultado.setText(re);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_calcularMouseClicked

    private void calcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularMouseExited
       calcular.setBackground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_calcularMouseExited

    private void calcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularMouseEntered
        calcular.setBackground(new java.awt.Color(44, 115, 111));
    }//GEN-LAST:event_calcularMouseEntered

    private void corte3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corte3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_corte3ActionPerformed

    private void segundaopcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundaopcionActionPerformed

      
    if(segundaopcion.isSelected()){
    corte3.setText("Calcular nota minima.");
    }else{
    corte3.setText("");
    
    }
    }//GEN-LAST:event_segundaopcionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Primer;
    private javax.swing.JLabel Segundo;
    private javax.swing.JLabel Tercero;
    private javax.swing.JLabel barra;
    private javax.swing.JPanel calcular;
    private javax.swing.JLabel calculartext;
    private javax.swing.JLabel cerrar;
    private javax.swing.JTextField corte1;
    private javax.swing.JTextField corte2;
    private javax.swing.JTextField corte3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel resultado;
    private javax.swing.JToggleButton segundaopcion;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    // End of variables declaration//GEN-END:variables
}
