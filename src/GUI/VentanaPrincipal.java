
package GUI;

import AnalisisLexico.TS;
import com.formdev.flatlaf.icons.FlatTabbedPaneCloseIcon;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.IntConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.fife.ui.autocomplete.*;
import org.fife.ui.rsyntaxtextarea.*;
import org.fife.ui.rtextarea.*;
import AnalisisLexico.Tokens;
import AnalisisLexico.Lexer;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Component;
import java.io.File;

/**
 *
 * @author cesar
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    public ArrayList<TS> simbolos = new ArrayList<TS>();
    private Directory directorio;
    
    public VentanaPrincipal() {
        initComponents();
        //Inicializacion de una ventana para el jTabbedPane con un RSyntaxTextArea
        RSyntax();
        //Para centrar la ventana
        setLocationRelativeTo(null);
        setTitle("GCK Compiler");
        
        //Para navegar por las pestañas con Ctrl+tab, pero no funciona correctamente aún
        setupTabTraversalKeys(panelContenedorPestañas);
        //Establecer icono para la ventana
        setIconImage(new FlatSVGIcon("assets/GCK.svg").getImage());
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaLexico = new javax.swing.JFrame();
        contenedorBaseLexico = new javax.swing.JPanel();
        scrollLexico = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ventanaTS = new javax.swing.JFrame();
        contenedorBaseTS = new javax.swing.JPanel();
        scrollTS = new javax.swing.JScrollPane();
        jTableTS = new javax.swing.JTable();
        panelContenedorPrincipal = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        panelBaseIzquierdo = new javax.swing.JPanel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree2 = new javax.swing.JTree();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        panelBaseDerecho = new javax.swing.JPanel();
        panelBasePestañas = new javax.swing.JPanel();
        panelContenedorPestañas = new javax.swing.JTabbedPane();
        pantalla = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextPane();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        ventanaLexico.setTitle("Análisis Léxico");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Lexema", "Componente Léxico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollLexico.setViewportView(jTable1);

        javax.swing.GroupLayout contenedorBaseLexicoLayout = new javax.swing.GroupLayout(contenedorBaseLexico);
        contenedorBaseLexico.setLayout(contenedorBaseLexicoLayout);
        contenedorBaseLexicoLayout.setHorizontalGroup(
            contenedorBaseLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollLexico, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        contenedorBaseLexicoLayout.setVerticalGroup(
            contenedorBaseLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollLexico, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        ventanaLexico.setSize(new java.awt.Dimension(400, 450));
        ventanaLexico.setLocationRelativeTo(null);
        ventanaLexico.setType(java.awt.Window.Type.POPUP);

        javax.swing.GroupLayout ventanaLexicoLayout = new javax.swing.GroupLayout(ventanaLexico.getContentPane());
        ventanaLexico.getContentPane().setLayout(ventanaLexicoLayout);
        ventanaLexicoLayout.setHorizontalGroup(
            ventanaLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLexicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorBaseLexico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ventanaLexicoLayout.setVerticalGroup(
            ventanaLexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaLexicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorBaseLexico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ventanaTS.setTitle("Tabla de símbolos");

        jTableTS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Identificador", "Tipo", "Referencias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTS.setViewportView(jTableTS);

        javax.swing.GroupLayout contenedorBaseTSLayout = new javax.swing.GroupLayout(contenedorBaseTS);
        contenedorBaseTS.setLayout(contenedorBaseTSLayout);
        contenedorBaseTSLayout.setHorizontalGroup(
            contenedorBaseTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTS, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );
        contenedorBaseTSLayout.setVerticalGroup(
            contenedorBaseTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTS, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        ventanaTS.setSize(new java.awt.Dimension(436, 448));
        ventanaTS.setLocationRelativeTo(null);
        ventanaTS.setType(java.awt.Window.Type.POPUP);

        javax.swing.GroupLayout ventanaTSLayout = new javax.swing.GroupLayout(ventanaTS.getContentPane());
        ventanaTS.getContentPane().setLayout(ventanaTSLayout);
        ventanaTSLayout.setHorizontalGroup(
            ventanaTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaTSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorBaseTS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ventanaTSLayout.setVerticalGroup(
            ventanaTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaTSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contenedorBaseTS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jScrollPane2.setViewportView(jTree2);

        jTabbedPane2.addTab("Escenas", jScrollPane2);

        jSplitPane3.setLeftComponent(jTabbedPane2);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(128, 200));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("res://");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("gráficos");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("blue");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("violet");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("red");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("yellow");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("scripts");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("basketball");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("soccer");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("football");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hockey");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("iconos");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hot dogs");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("pizza");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ravioli");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("bananas");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        jTabbedPane1.addTab("Sistema de archivos", jScrollPane1);

        jSplitPane3.setRightComponent(jTabbedPane1);

        javax.swing.GroupLayout panelBaseIzquierdoLayout = new javax.swing.GroupLayout(panelBaseIzquierdo);
        panelBaseIzquierdo.setLayout(panelBaseIzquierdoLayout);
        panelBaseIzquierdoLayout.setHorizontalGroup(
            panelBaseIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseIzquierdoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jSplitPane3)
                .addGap(0, 0, 0))
        );
        panelBaseIzquierdoLayout.setVerticalGroup(
            panelBaseIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(panelBaseIzquierdo);

        panelBasePestañas.setLayout(new java.awt.CardLayout());
        panelBasePestañas.add(panelContenedorPestañas, "card2");

        pantalla.setBorder(null);
        pantalla.setClosable(true);
        pantalla.setIconifiable(true);
        pantalla.setResizable(true);
        pantalla.setFrameIcon(null);
        pantalla.setVisible(true);

        txtResultado.setEditable(false);
        txtResultado.setBorder(null);
        txtResultado.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jScrollPane3.setViewportView(txtResultado);

        javax.swing.GroupLayout pantallaLayout = new javax.swing.GroupLayout(pantalla.getContentPane());
        pantalla.getContentPane().setLayout(pantallaLayout);
        pantallaLayout.setHorizontalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        pantallaLayout.setVerticalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBaseDerechoLayout = new javax.swing.GroupLayout(panelBaseDerecho);
        panelBaseDerecho.setLayout(panelBaseDerechoLayout);
        panelBaseDerechoLayout.setHorizontalGroup(
            panelBaseDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseDerechoLayout.createSequentialGroup()
                .addGroup(panelBaseDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBasePestañas, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
                    .addComponent(pantalla))
                .addContainerGap())
        );
        panelBaseDerechoLayout.setVerticalGroup(
            panelBaseDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseDerechoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelBasePestañas, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        try {
            pantalla.setIcon(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jSplitPane2.setRightComponent(panelBaseDerecho);

        jToolBar1.setRollover(true);

        jButton1.setText("Análisis Léxico");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("Tabla de símbolos");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        javax.swing.GroupLayout panelContenedorPrincipalLayout = new javax.swing.GroupLayout(panelContenedorPrincipal);
        panelContenedorPrincipal.setLayout(panelContenedorPrincipalLayout);
        panelContenedorPrincipalLayout.setHorizontalGroup(
            panelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelContenedorPrincipalLayout.setVerticalGroup(
            panelContenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContenedorPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Nuevo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Abrir...");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Guardar como...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setText("Cerrar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);
        jMenu1.add(jSeparator2);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setText("Salir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Deshacer");
        jMenu2.add(jMenuItem2);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem10.setText("Rehacer");
        jMenu2.add(jMenuItem10);
        jMenu2.add(jSeparator3);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem11.setText("Cortar");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem12.setText("Copiar");
        jMenu2.add(jMenuItem12);

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem13.setText("Pegar");
        jMenu2.add(jMenuItem13);
        jMenu2.add(jSeparator4);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        jMenuItem14.setText("Eliminar");
        jMenu2.add(jMenuItem14);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ver");

        jMenuItem9.setText("jMenuItem9");
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Fuente");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Opciones");
        jMenuBar1.add(jMenu5);

        jMenu7.setText("Ayuda");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedorPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        directorio.SaveAs();
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    private static void setupTabTraversalKeys(JTabbedPane tabbedPane) {
        KeyStroke ctrlTab = KeyStroke.getKeyStroke("ctrl TAB");
        KeyStroke ctrlShiftTab = KeyStroke.getKeyStroke("ctrl shift TAB");

        // Remove ctrl-tab from normal focus traversal
        Set<AWTKeyStroke> forwardKeys = new HashSet<AWTKeyStroke>(tabbedPane.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        forwardKeys.remove(ctrlTab);
        tabbedPane.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardKeys);

        // Remove ctrl-shift-tab from normal focus traversal
        Set<AWTKeyStroke> backwardKeys = new HashSet<AWTKeyStroke>(tabbedPane.getFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS));
        backwardKeys.remove(ctrlShiftTab);
        tabbedPane.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, backwardKeys);

        // Add keys to the tab's input map
        InputMap inputMap = tabbedPane.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(ctrlTab, "navigateNext");
        inputMap.put(ctrlShiftTab, "navigatePrevious");
    }
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        RSyntaxTextArea textArea = new RSyntaxTextArea(); // Crea una nueva instancia de RSyntaxTextArea
        directorio = new Directory(this, textArea, "GCKKKK", ".gck");
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_GO);
        textArea.setCodeFoldingEnabled(true);
        textArea.setAntiAliasingEnabled(true);
        changeStyleViaThemeXml(textArea);
        textArea.setAnimateBracketMatching(true);
        textArea.setFont(new Font("Segoe UI", Font.BOLD, 14));
        CompletionProvider provider = createCompletionProvider();
        AutoCompletion ac = new AutoCompletion(provider);
        ac.install(textArea);
        
        RTextScrollPane scrollPane = new RTextScrollPane(textArea);
        
        panelContenedorPestañas.add("Sin título", scrollPane);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    
    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        directorio.Open();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        if (panelContenedorPestañas.getTabCount() >= 0) {
            Object[] options = {"Sí", "No"};
            int option = JOptionPane.showOptionDialog(this, "¿Guardar antes de cerrar la pestaña?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (option == 0) { // 0 representa "Sí" en el array de opciones
                directorio.Save();
                panelContenedorPestañas.removeTabAt(panelContenedorPestañas.getSelectedIndex());
            } else {
                panelContenedorPestañas.removeTabAt(panelContenedorPestañas.getSelectedIndex());
            }
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel Tabla = (DefaultTableModel) jTableTS.getModel();
        vaciarTabla(Tabla,jTableTS);
        Object [] row = new Object[3];
        ventanaTS.setVisible(true);
        
        Iterator<TS>itrSimbolos = simbolos.iterator();
        while(itrSimbolos.hasNext()){
            TS simbolo = itrSimbolos.next();
            row[0]=simbolo.getId();
            row[1]="";//Tipo
            row[2]=simbolo.getReferencias();
            Tabla.addRow(row);           
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        simbolos.clear();
        File archivo = new File("codigo.txt");
        PrintWriter escribir;
        DefaultTableModel Tabla = (DefaultTableModel) jTable1.getModel();
        vaciarTabla(Tabla,jTable1);
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(((RSyntaxTextArea) panelContenedorPestañas.getComponentAt(panelContenedorPestañas.getSelectedIndex())).getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Reader lector = new BufferedReader(new FileReader("codigo.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            txtResultado.setForeground(Color.green);
            
            Object [] row = new Object[2];
            pantalla.setVisible(true);
            ventanaLexico.setVisible(true);
            
            while (true) {
                Tokens tokens = lexer.yylex();
                if (tokens == null) {
                    if(txtResultado.getForeground()==Color.red){
                        resultado += "\n"+"-> COMPILACIÓN COMPLETADA CON ERRORES";
                        txtResultado.setText(resultado);
                        return;
                    }
                    else{
                        resultado += "\n"+"-> COMPILACIÓN COMPLETADA SIN ERRORES";
                        txtResultado.setText(resultado);
                        return; 
                    }
                    
                }
                switch (tokens) {
                    case ERROR1:
                        txtResultado.setForeground(Color.red);
                        resultado += "ERROR LÉXICO 1 en la línea "+ lexer.linea+" - Símbolo no reconocido" + "\n";
                        txtResultado.setText(resultado);
                    break;
                    case ERROR2:
                        txtResultado.setForeground(Color.red);
                        resultado += "ERROR LÉXICO 2 en la línea "+ lexer.linea+" - Un identificador no puede comenzar con un digito" + "\n";
                        txtResultado.setText(resultado);
                    break;
                    
                    case Identificador:
                        boolean repetido=false;
                        Iterator<TS>itrSimbolos = simbolos.iterator();
                        while(itrSimbolos.hasNext()){
                            TS simbolo = itrSimbolos.next();
                            if(simbolo.getId().equals(lexer.lexeme)){
                                String r = simbolo.getReferencias();
                                r+=", "+lexer.linea;
                                simbolo.setReferencias(r);
                                repetido=true;
                            }              
                        }
                        
                        if(!repetido){
                            TS simbolo = new TS();
                            simbolo.setId(lexer.lexeme);
                            simbolo.setReferencias(""+lexer.linea);
                            simbolos.add(simbolo);
                        }
                    default:
                        
                        row[0]=lexer.lexeme;
                        row[1]=tokens;
                        Tabla.addRow(row);
                        
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        directorio.Save();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    private CompletionProvider createCompletionProvider() {

      // A DefaultCompletionProvider is the simplest concrete implementation
      // of CompletionProvider. This provider has no understanding of
      // language semantics. It simply checks the text entered up to the
      // caret position for a match against known completions. This is all
      // that is needed in the majority of cases.
      DefaultCompletionProvider provider = new DefaultCompletionProvider();

      // Add completions for all Java keywords. A BasicCompletion is just
      // a straightforward word completion.
      provider.addCompletion(new BasicCompletion(provider, "abstract"));
      provider.addCompletion(new BasicCompletion(provider, "assert"));
      provider.addCompletion(new BasicCompletion(provider, "break"));
      provider.addCompletion(new BasicCompletion(provider, "case"));
      // ... etc ...
      provider.addCompletion(new BasicCompletion(provider, "transient"));
      provider.addCompletion(new BasicCompletion(provider, "try"));
      provider.addCompletion(new BasicCompletion(provider, "void"));
      provider.addCompletion(new BasicCompletion(provider, "volatile"));
      provider.addCompletion(new BasicCompletion(provider, "while"));

      // Add a couple of "shorthand" completions. These completions don't
      // require the input text to be the same thing as the replacement text.
      provider.addCompletion(new ShorthandCompletion(provider, "sysout",
            "System.out.println(", "System.out.println("));
      provider.addCompletion(new ShorthandCompletion(provider, "syserr",
            "System.err.println(", "System.err.println("));

      return provider;

   }
    
    private void changeStyleViaThemeXml(RSyntaxTextArea textArea) {
      try {
         Theme theme = Theme.load(new FileInputStream("byMe.xml"));
         theme.apply(textArea);
      } catch (IOException ioe) { // Never happens
         ioe.printStackTrace();
      }
    }
    
    public void RSyntax(){   
        RSyntaxTextArea textArea = new RSyntaxTextArea();
        directorio = new Directory(this, textArea, "GCKKKK", ".gck");
        
        changeStyleViaThemeXml(textArea);    
        panelContenedorPestañas.add(new RTextScrollPane(textArea));
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_GO);
        textArea.setCodeFoldingEnabled(true); //Para contraer partes del codigo
        
        CompletionProvider provider = createCompletionProvider();
        AutoCompletion ac = new AutoCompletion(provider);
        ac.install(textArea);
        textArea.setAntiAliasingEnabled(true);
        textArea.setAnimateBracketMatching(true);
        textArea.setFont(new Font("Segoe UI", Font.BOLD, 18));
        
        panelContenedorPestañas.setTitleAt(0, "Sin título");
        panelContenedorPestañas.putClientProperty("JTabbedPane.tabClosable", true);
        panelContenedorPestañas.putClientProperty( "JTabbedPane.tabCloseCallback",(IntConsumer) tabIndex -> {
            if (tabIndex >= 0) {
                Object[] options = {"Sí", "No"};
                int option = JOptionPane.showOptionDialog(this, "¿Desea guardar antes de cerrar la pestaña?", "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (option == 0) { // 0 representa "Sí" en el array de opciones
                    directorio.Save();
                    panelContenedorPestañas.removeTabAt(tabIndex);
                }else{
                    panelContenedorPestañas.removeTabAt(tabIndex);
                }
            }
        });
        setupTabTraversalKeys(panelContenedorPestañas);
    }
    
    
    public static void main(String args[]) {
        try{
            FlatMaterialDeepOceanIJTheme.setup();
            //Boton circular Cerrar pestaña 
            UIManager.put("TabbedPane.closeArc", Integer.valueOf(999));
            UIManager.put("TabbedPane.closeCrossFilledSize", Float.valueOf(5.5F));
            UIManager.put("TabbedPane.closeIcon", new FlatTabbedPaneCloseIcon());
            
            //Estilo underlined para los menuItems
            UIManager.put("MenuItem.selectionType", "underline");
            
            //Botones redondeados
            UIManager.put( "Button.arc", 999 );
            
            //Grosor de los bordes de focus de los componentes
            UIManager.put( "Component.focusWidth", 0 );
            UIManager.put( "Component.innerFocusWidth", 0 );
            
            //Barra de scroll redondeada
            UIManager.put( "ScrollBar.thumbArc", 999 );
            UIManager.put( "ScrollBar.thumbInsets", new Insets( 2, 2, 2, 2 ) );
            
            
        } catch (Exception e){
            e.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    public static void vaciarTabla(DefaultTableModel Modelo, JTable JT){
        //Inicializamos la tabla con un modelo
        Modelo = (DefaultTableModel) JT.getModel();
        int i = 0;
        while(i < Modelo.getRowCount()){
            Modelo.removeRow(i);
        }//metodo while para remover los renglones de la tabla
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorBaseLexico;
    private javax.swing.JPanel contenedorBaseTS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableTS;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTree jTree1;
    private javax.swing.JTree jTree2;
    private javax.swing.JPanel panelBaseDerecho;
    private javax.swing.JPanel panelBaseIzquierdo;
    private javax.swing.JPanel panelBasePestañas;
    private javax.swing.JTabbedPane panelContenedorPestañas;
    private javax.swing.JPanel panelContenedorPrincipal;
    private javax.swing.JInternalFrame pantalla;
    private javax.swing.JScrollPane scrollLexico;
    private javax.swing.JScrollPane scrollTS;
    private javax.swing.JTextPane txtResultado;
    private javax.swing.JFrame ventanaLexico;
    private javax.swing.JFrame ventanaTS;
    // End of variables declaration//GEN-END:variables
}
