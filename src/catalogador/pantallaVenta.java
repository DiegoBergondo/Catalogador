/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package catalogador;

import BibliotecaRIGU.JSimpleDialog;

/**
 * Clase de la pantalla de datos de venta.
 * @author murphy
 */
public class pantallaVenta extends JSimpleDialog {
    
    /**
     * Creates new form pantallaVenta
     */
    public pantallaVenta() {
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
        jPanel6 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jSlider2 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jSlider3 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(470, 440));
        setPreferredSize(new java.awt.Dimension(700, 450));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(335, 250));
        jPanel1.setPreferredSize(new java.awt.Dimension(335, 250));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Lugar de la venta"));
        jPanel6.setMinimumSize(new java.awt.Dimension(245, 52));
        jPanel6.setPreferredSize(new java.awt.Dimension(245, 52));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ebay", "Wallapop", "Todocoleccion", "Milanuncios", "Foros" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel6.add(jComboBox3, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 41, 0, 0);
        jPanel1.add(jPanel6, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de puesta en venta"));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        jPanel5.add(jComboBox1, gridBagConstraints);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -41;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 6, 0, 0);
        jPanel5.add(jComboBox2, gridBagConstraints);

        jSpinner1.setMinimumSize(new java.awt.Dimension(60, 26));
        jSpinner1.setPreferredSize(new java.awt.Dimension(60, 26));
        jSpinner1.setValue(2000);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        jPanel5.add(jSpinner1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 41, 0, 0);
        jPanel1.add(jPanel5, gridBagConstraints);

        jPanel3.setMinimumSize(new java.awt.Dimension(200, 120));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 120));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_ebay.png"))); // NOI18N
        jLabel2.setMinimumSize(new java.awt.Dimension(180, 100));
        jLabel2.setPreferredSize(new java.awt.Dimension(180, 100));
        jPanel3.add(jLabel2, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 47;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 41, 0, 0);
        jPanel1.add(jPanel3, gridBagConstraints);

        jPanel2.setMinimumSize(new java.awt.Dimension(323, 160));
        jPanel2.setPreferredSize(new java.awt.Dimension(323, 160));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Subasta", "Compra directa" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 86, 0, 0);
        jPanel2.add(jComboBox4, gridBagConstraints);

        jTextField1.setText("Precio inicial venta");
        jTextField1.setMinimumSize(new java.awt.Dimension(118, 26));
        jTextField1.setPreferredSize(new java.awt.Dimension(125, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 31, 31, 0);
        jPanel2.add(jTextField1, gridBagConstraints);

        jTextField2.setText("Precio final venta");
        jTextField2.setPreferredSize(new java.awt.Dimension(125, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 115;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 31, 30);
        jPanel2.add(jTextField2, gridBagConstraints);

        jTextField3.setText("Enlace a venta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 252;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 31, 0, 30);
        jPanel2.add(jTextField3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 4);
        jPanel1.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -2;
        gridBagConstraints.ipady = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(jPanel1, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio medio de venta de cuadros final"));
        jPanel7.setMinimumSize(new java.awt.Dimension(350, 120));
        jPanel7.setPreferredSize(new java.awt.Dimension(350, 120));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jSlider1.setMaximum(1000);
        jSlider1.setValue(500);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 290;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 12, 0, 0);
        jPanel7.add(jSlider1, gridBagConstraints);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setMinimumSize(new java.awt.Dimension(130, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 112, 18, 0);
        jPanel7.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 6);
        jPanel4.add(jPanel7, gridBagConstraints);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio medio de venta de cuadros inicial"));
        jPanel8.setMinimumSize(new java.awt.Dimension(350, 120));
        jPanel8.setPreferredSize(new java.awt.Dimension(350, 120));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jSlider2.setMaximum(1000);
        jSlider2.setValue(500);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 290;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 12, 0, 0);
        jPanel8.add(jSlider2, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setMinimumSize(new java.awt.Dimension(130, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 112, 18, 0);
        jPanel8.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 6, 0, 6);
        jPanel4.add(jPanel8, gridBagConstraints);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad de cuadros a la venta"));
        jPanel9.setMinimumSize(new java.awt.Dimension(350, 120));
        jPanel9.setPreferredSize(new java.awt.Dimension(350, 120));
        jPanel9.setLayout(new java.awt.GridBagLayout());

        jSlider3.setMaximum(1000);
        jSlider3.setValue(500);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 290;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 12, 0, 0);
        jPanel9.add(jSlider3, gridBagConstraints);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setMinimumSize(new java.awt.Dimension(130, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 112, 18, 0);
        jPanel9.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 45, 6);
        jPanel4.add(jPanel9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        add(jPanel4, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if(this.getLugarVenta().getSelectedItem().toString().equalsIgnoreCase("Ebay"))
        this.cambiarIcon(0);
        else if(this.getLugarVenta().getSelectedItem().toString().equalsIgnoreCase("Wallapop"))
        this.cambiarIcon(1);
        else if(this.getLugarVenta().getSelectedItem().toString().equalsIgnoreCase("Todocoleccion"))
        this.cambiarIcon(2);
        else if(this.getLugarVenta().getSelectedItem().toString().equalsIgnoreCase("Milanuncios"))
        this.cambiarIcon(3);
        else
        this.cambiarIcon(4);
    }//GEN-LAST:event_jComboBox3ActionPerformed

//

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables

    /**
     * Asigna al borde del primer recuadro el String introducido como parámetro.
     * @param titulo
     */
    public void setTitulo1(String titulo){
        this.jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(titulo));
    }

    /**
     * Asigna al borde del segundo recuadro el String introducido como parámetro.
     * @param titulo
     */
    public void setTitulo2(String titulo){
        this.jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(titulo));
    }

    /**
     * Asigna al borde del tercer recuadro el String introducido como parámetro.
     * @param titulo
     */
    public void setTitulo3(String titulo){
        this.jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(titulo));
    }
    
    /**
     * Devuelve el jTextField3.
     * @return
     */
    public javax.swing.JTextField getEnlace(){
        return this.jTextField3;
    }
    
    /**
     * Asigna a jTextField3 el String que le entra como parámetro
     * @param enlace
     */
    public void setEnlace(String enlace){
        this.jTextField3.setText(enlace);
    }

    /**
     * Asigna a jLabel3 y jSlider2 el valor que le entra como parámetro
     * @param media
     */
    public void setMediaPrecioInicial(int media){
        this.jLabel3.setText(String.valueOf(media));
        this.jSlider2.setValue(media);
    }

    /**
     * Asigna a jLabel1 y jSlider1 el valor que le entra como parámetro
     * @param media
     */
    public void setMediaPrecioVenta(int media){
        this.jLabel1.setText(String.valueOf(media));
        this.jSlider1.setValue(media);
    }

    /**
     * Asigna a jLabel4 y jSlider3 el valor que le entra como parámetro
     * @param media
     */
    public void setMediaVenta(int media){
        this.jLabel4.setText(String.valueOf(media));
        this.jSlider3.setValue(media);
    }
    
    /**
     * Devuelve el jTextField1.
     * @return
     */
    public javax.swing.JTextField getPrecioInicial(){
        return this.jTextField1;
    }
    
    /**
     * Asigna a jTextField1 el valor que le entra como parámetro
     * @param precioI
     */
    public void setPrecioInicial(int precioI){
        this.jTextField1.setText(String.valueOf(precioI));
    }

    /**
     * Asigna a jTextField1 el String que le entra como parámetro
     * @param tDefault
     */
    public void setPrecioInicial(String tDefault){
        this.jTextField1.setText(tDefault);
    }
    
    /**
     * Devuelve el valor de jTextField2.
     * @return
     */
    public javax.swing.JTextField getPrecioFinal(){
        return this.jTextField2;
    }
    
    /**
     * Asigna a jTextField2 el valor que le entra como parámetro
     * @param precioF
     */
    public void setPrecioFinal(int precioF){
        this.jTextField2.setText(String.valueOf(precioF));
    }
    
    /**
     * Asigna a jTextField2 el String que le entra como parámetro
     * @param tDefault
     */
    public void setPrecioFinal(String tDefault){
        this.jTextField2.setText(tDefault);
    }

    /**
     * Devuelve el valor de jComboBox4.
     * @return
     */
    public javax.swing.JComboBox getTipoVenta(){
        return this.jComboBox4;
    }
    
    /**
     * Selecciona una opción del jComboBox4 dependiendo del valor del String que llega como parámetro.
     * @param tVenta
     */
    public void setTipoVenta(String tVenta){
        int i=0;
        if(tVenta.equals("Compra directa"))
            i=1;
        this.jComboBox4.setSelectedIndex(i);    
    }
    
    /**
     * Devuelve el jComboBox3.
     * @return
     */
    public javax.swing.JComboBox getLugarVenta(){
        return this.jComboBox3;
    }
    
    /**
     * Selecciona una opción del jComboBox3 dependiendo del valor del String que llega como parámetro.
     * @param lVenta
     */
    public void setLugarVenta(String lVenta){
        int i=0;
        if(lVenta.equals("Wallapop"))
            i=1;
        if(lVenta.equals("Todocoleccion"))
            i=2;
        if(lVenta.equals("Milanuncios"))
            i=3; 
        if(lVenta.equals("Foros"))
            i=4;        
        this.jComboBox3.setSelectedIndex(i); 
        cambiarIcon(i);    
    }
    
    /**
     * Devuelve el jComboBox1.
     * @return
     */
    public javax.swing.JComboBox getFechaDiaPV(){
        return this.jComboBox1; 
    }
        
    /**
     * Devuelve el jComboBox2.
     * @return
     */
    public javax.swing.JComboBox getFechaMesPV(){
        return this.jComboBox2; 
    }
            
    /**
     * Devuelve el jSpinner1.
     * @return
     */
    public javax.swing.JSpinner getFechaAnoPV(){
        return this.jSpinner1;
    }
    
    /**
     * Selecciona una opción del jComboBox1 dependiendo del valor que llega como parámetro.
     * @param dia
     */
    public void setFechaDiaPV(int dia){
        jComboBox1.setSelectedIndex(dia-1);
    }
    
    /**
     * Selecciona una opción del jComboBox2 dependiendo del valor que llega como parámetro.
     * @param mes
     */
    public void setFechaMesPV(int mes){
        jComboBox2.setSelectedIndex(mes);
    }
    
    /**
     * Asigna al jSpinner1 el valor que le llega como parámetro.
     * @param ano
     */
    public void setFechaAnoPV(int ano){
        this.jSpinner1.setValue(ano); 
    }
    
    /**
     * Asigna al jLabel2 una imagen dependiendo del valor que llega como parámetro.
     * @param i
     */    
    private void cambiarIcon(int i){
        if(i==0)
            this.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_ebay.png")));
        else if(i==1)
            this.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_wallapop.png")));
        else if(i==2)
            this.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_todocoleccion.png")));
        else if(i==3)
            this.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_milanuncios.png")));
        else
            this.jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_foros.png")));
    }

}
