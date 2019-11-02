/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package catalogador;

import BibliotecaRIGU.JSimpleDialog;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 * Clase de la pantalla del selector de imagen.
 * @author DiegoBergondo
 */
public class pantallaSeleccionImagen extends JSimpleDialog { 
    
    private boolean hayImagen = false;
    private String direccionImagen;
    private Image imagen;
    
    /**
     * Creates new form pantallaSeleccionImagen
     */
    public pantallaSeleccionImagen() {
        super();
        initComponents();      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(700, 450));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(), new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel1.setMaximumSize(new java.awt.Dimension(460, 318));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/no-image-icon1.png"))); // NOI18N
        jPanel1.add(jLabel2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 6, 0, 3);
        add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("Selecciona imagen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 6, 36, 6);
        jPanel2.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 146, 9, 0);
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            JFileChooser archivoImagen = new JFileChooser();
            if(archivoImagen.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                File archivo=archivoImagen.getSelectedFile();
                direccionImagen=archivo.getAbsolutePath();
                try {
                    BufferedImage image = ImageIO.read(new File(direccionImagen)); 
                    this.imagen = image.getScaledInstance(445, 300, Image.SCALE_DEFAULT);
                    jLabel2.setIcon(new javax.swing.ImageIcon(this.imagen));
                    this.hayImagen=true;
                } catch (IOException ex) {
                    Logger.getLogger(pantallaSeleccionImagen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    /**
     * Devuelve la imagen.
     * @return
     */
    public Image getImage(){
    if (hayImagen)       
        return this.imagen;
    else
        return ((ImageIcon)jLabel2.getIcon()).getImage();
}

    /**
     * Asigna a la dirección de la imagen el valor introducido por parámetro.
     * @param dImagen
     */
    public void setDireccionImage(String dImagen){
    this.direccionImagen=dImagen;
}

    /**
     * Devuelve un String con la dirección de la imagen.
     * @return
     */
    public String getDireccionImage(){
    if(this.direccionImagen!=null)
        return this.direccionImagen;
    else
        return "false";
}

    /**
     * Asigna una imagen.
     * @param imagen
     */
    public void setImagen(Image imagen) {
    this.imagen = imagen.getScaledInstance(445, 300, Image.SCALE_DEFAULT);
    this.jLabel2.setIcon(new javax.swing.ImageIcon(this.imagen));
    this.hayImagen=true;
 }

    /**
     * Devuelve el valor del boolean que indica si se ha introducido una imagen.
     * @return
     */
    public boolean hayImagen(){
    return this.hayImagen;
}

}

