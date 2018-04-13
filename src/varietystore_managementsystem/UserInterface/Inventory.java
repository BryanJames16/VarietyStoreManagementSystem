/*
 * Copyright (C) 2016 Ilaga_Family
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package varietystore_managementsystem.UserInterface;

import java.awt.*;
import java.text.*;
import static java.awt.GraphicsDevice.WindowTranslucency.TRANSLUCENT;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.Calendar;

/**
 *
 * @author Ilaga_Family
 */
public class Inventory extends javax.swing.JFrame {

    protected Connection connection;
    protected static int UID = 0;
    
    private final String inventoryTable     =   "inventory_tbl";
    private final String productTable       =   "product_tbl"; 
    private final String logsTable          =   "logs_tbl";
    
    private final String productIDField     =   "ProductID";
    private final String productNameField   =   "ProductName";
    private final String productPriceField  =   "Price";
    private final String productTypeCode    =   "TypeCode";
    private final String productVisibility  =   "ProductVisibility";
    
    private final String inventoryIDField   =   "InventoryID";
    private final String itemQuantityField  =   "ItemQuantity";
    
    private final String logIDField         =   "LogID";
    private final String logItemIDField     =   "ItemID";
    private final String logNameField       =   "ItemName";
    private final String logQuantityField   =   "ItemQuantity";
    private final String logDateField       =   "Date";
    
    private InventoryTableModel model;
    
    /**
     * Creates new form Inventory
     * @param connection
     * @param UID
     */
    public Inventory(Connection connection, int UID) {
        setUndecorated (true);
        this.connection = connection;
        Inventory.UID = UID;
        initComponents();
        userInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlButtons = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        pnlTable = new javax.swing.JPanel();
        tableScroll = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnMin = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(660, 471));
        setPreferredSize(new java.awt.Dimension(660, 471));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        pnlButtons.setBackground(new java.awt.Color (0, 0, 0, 0));
        pnlButtons.setOpaque(false);

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnAdd.setText("Add Product");
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorderPainted(false);
        btnDelete.setContentAreaFilled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnSearch.setText("Search Product");
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(0, 0, 0));
        btnEdit.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorderPainted(false);
        btnSave.setContentAreaFilled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlButtons);
        pnlButtons.setBounds(490, 130, 150, 310);

        pnlTable.setBackground(new java.awt.Color (0, 0, 0, 0));
        pnlTable.setOpaque(false);

        tableScroll.setBackground(new java.awt.Color (0, 0, 0, 0));
        tableScroll.setOpaque(false);

        tblData.setFont(new java.awt.Font("Berlin Sans FB", 0, 11)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Code", "Product Name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblData.setToolTipText("Products present on database");
        tableScroll.setViewportView(tblData);

        javax.swing.GroupLayout pnlTableLayout = new javax.swing.GroupLayout(pnlTable);
        pnlTable.setLayout(pnlTableLayout);
        pnlTableLayout.setHorizontalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTableLayout.setVerticalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnlTable);
        pnlTable.setBounds(20, 130, 460, 310);

        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/varietystore_managementsystem/ELEMENTS/INVENTORY_ELEMENTS/MinimizeButton.png"))); // NOI18N
        btnMin.setBorderPainted(false);
        btnMin.setContentAreaFilled(false);
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });
        getContentPane().add(btnMin);
        btnMin.setBounds(600, 10, 20, 20);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/varietystore_managementsystem/ELEMENTS/INVENTORY_ELEMENTS/CloseButton.png"))); // NOI18N
        btnClose.setBorderPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose);
        btnClose.setBounds(630, 10, 20, 20);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/varietystore_managementsystem/ELEMENTS/INVENTORY_ELEMENTS/InventoryBG.png"))); // NOI18N
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, 0, 660, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        CashRegister cr = new CashRegister (connection, UID);
        cr.launchFrame ();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int noOfEntries = 0;
        String viewedConfirm = "Are you sure you want to delete this product? \n Once deleted, it can never be irreverisble!\nContinue?";
        int choice = JOptionPane.showConfirmDialog (null, viewedConfirm, "Confirm", JOptionPane.YES_NO_OPTION);
        
        if (choice == JOptionPane.YES_OPTION) {
            
            try {
                Statement stmt = connection.createStatement ();
                String sql = "UPDATE " + productTable + " "
                        + "SET " + productVisibility + " = 0 "
                        + "WHERE " + productIDField + " = " + tblData.getModel().getValueAt(tblData.getSelectedRow(), 0).toString().trim();
                boolean isSent = stmt.execute (sql);
                
                if (!isSent) {
                    JOptionPane.showMessageDialog (null, "Product has been deleted from the inventory!", "Success!", JOptionPane.INFORMATION_MESSAGE);
                }
                
                model.setRowCount (0);
                sql = "SELECT " + "p." + productIDField + ", p." + productNameField + ", i." + itemQuantityField + ", p." + productPriceField + " "
                    + "FROM  " + productTable + " p INNER JOIN " + inventoryTable + " i "
                    + "ON i." + inventoryIDField + " = p." + productIDField + " "
                    + "WHERE " + productVisibility + " = 1;";
                ResultSet rs = stmt.executeQuery (sql);
                while (rs.next()) {
                Object [] row = {rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("ItemQuantity"), rs.getDouble ("Price")};
                    model.addRow (row);
                    noOfEntries++;
                }
                
                if (noOfEntries == 0) {
                    JOptionPane.showMessageDialog (null, "There are no data in database!", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
                
            } catch (SQLException sqle) {
                System.err.println ("Problem in database:\n" + sqle);
            }
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        setOpacity (1.0f);
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        setOpacity (0.7f);
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int choose = JOptionPane.showConfirmDialog (null, "Do you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (choose == JOptionPane.YES_OPTION) {
            dispose ();
            CashRegister cr = new CashRegister (connection, UID);
            cr.launchFrame ();
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        // TODO add your handling code here:
        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        dispose();
        CashRegister cr = new CashRegister(connection, UID);
        cr.launchFrame();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        CreateNew cn = new CreateNew (connection, UID);
        cn.launchFrame ();
        dispose ();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int row = tblData.getSelectedRow();
        for (int count = 0; count < 999; count++) {
            if (count != 0) {
                model.setCellEditable (row, count, true);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int row = tblData.getSelectedRow();
        boolean isCorrect = true;
        
        int productID = 0;
        String editProductName = "";
        int editQuantity = 0;
        double editPrice = 0.00;
        
        try {
            if (tblData.getModel().getValueAt(row, 1).toString().trim().equals("") || tblData.getModel().getValueAt(row, 2).toString().trim().equals ("")
                || tblData.getModel().getValueAt(row, 3).toString().trim().equals("")) {
                JOptionPane.showMessageDialog (null, "Please enter valid credentials!", "Error", JOptionPane.ERROR_MESSAGE);
                isCorrect = false;
            } else {
                productID = Integer.parseInt (tblData.getModel().getValueAt(row, 0).toString().trim());
                editProductName = tblData.getModel().getValueAt(row, 1).toString().trim();
                editQuantity = Integer.parseInt (tblData.getModel().getValueAt(row, 2).toString());
                editPrice = Double.parseDouble (tblData.getModel().getValueAt(row, 3).toString());
            }
        } catch (NullPointerException npe) {
            isCorrect = false;
            System.err.println (npe);
            JOptionPane.showMessageDialog (null, "Please enter valid credentials!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException nfe) {
            isCorrect = false;
            System.err.println (nfe);
            JOptionPane.showMessageDialog (null, "Please enter valid credentials!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        if (isCorrect) {
            try {
                String sql = "UPDATE " + inventoryTable
                        + " SET " + itemQuantityField + " = " + editQuantity + " "
                        + "WHERE " + inventoryIDField + " = " + productID;
                Statement stmt = connection.createStatement();
                boolean isSent = stmt.execute (sql);
                
                sql = "UPDATE " + productTable
                        + " SET " + productNameField + " = '" + editProductName + "', "
                        + productPriceField + " = " + editPrice + " "
                        + "WHERE " + productIDField + " = " + productID;
                boolean isSent2 = stmt.execute (sql);
                
                Calendar cal = Calendar.getInstance();
                
                sql = "INSERT INTO " + logsTable
                        + " (" + logItemIDField + ", " + logNameField + ", " + logQuantityField + ", " + logDateField + ") "
                        + "VALUES (" + productID + ", '" + editProductName + "', " + editQuantity + ", " + "STR_TO_DATE('" + cal.get(Calendar.DATE) + "-" +
                        + (cal.get(Calendar.MONTH) + 1) + "-" + cal.get(Calendar.YEAR) + "', '%d-%m-%Y'));";
                
                boolean isSent3 = stmt.execute (sql);
                if (!isSent && !isSent2 && !isSent3) {
                    JOptionPane.showMessageDialog (null, "Changes has been saved!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException sqle) {
                System.err.println ("Error in database: " + sqle);
            }

            for (int count = 0; count < 999; count++) {
                model.setCellEditable (row, count, false);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String productNameGiven = JOptionPane.showInputDialog (null, "Enter Product Name", "Product Search", JOptionPane.INFORMATION_MESSAGE);
        int resultCount = 0;
        
        try {
            String sql = "";
            if (productNameGiven.equals ("*")) {
                sql = "SELECT " + "p." + productIDField + ", p." + productNameField + ", i." + itemQuantityField + ", p." + productPriceField + " "
                    + "FROM  " + productTable + " p INNER JOIN " + inventoryTable + " i "
                    + "ON i." + inventoryIDField + " = p." + productIDField + " "
                    + "WHERE " + productVisibility + " = 1;";
            } else {
                sql = "SELECT p." + productIDField + ", p." + productNameField + ", i." + itemQuantityField + ", p." + productPriceField + " "
                    + "FROM  " + productTable + " p INNER JOIN " + inventoryTable + " i "
                    + "ON i." + inventoryIDField + " = p." + productIDField + " "
                    + "WHERE " + productVisibility + " = 1 AND " + productNameField + " LIKE '%" + productNameGiven + "%';";
            }
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery (sql);
            
            while (rs.next()) {
                resultCount++;
                if (resultCount == 1) {
                    model.setRowCount (0);
                }
                Object row [] = {rs.getInt ("ProductID"), rs.getString ("ProductName"), rs.getInt ("ItemQuantity"), rs.getDouble ("Price")};
                model.addRow (row);
            }
            
            if (resultCount == 0) {
                JOptionPane.showMessageDialog (null, "No product(s) found with matching queries.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (SQLException sqle) {
            System.err.println ("Problem in database: " + sqle);
        }
    }//GEN-LAST:event_btnSearchActionPerformed
    
    public void 
        userInit()
    {
        model = new InventoryTableModel (new Object [][] {}, new String [] {"Product Code", "Product Name", "Quantity", "Price"}) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        };
        
        tblData.setModel (model);
        
        setLocationRelativeTo (null);
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        
        if (!gd.isWindowTranslucencySupported(TRANSLUCENT)) {
            System.err.println ("Translucensy not supported.");
        }
        
        int noOfEntries = 0;
        
        try {
            String sql = "SELECT " + "p." + productIDField + ", p." + productNameField + ", i." + itemQuantityField + ", p." + productPriceField + " "
                    + "FROM  " + productTable + " p INNER JOIN " + inventoryTable + " i "
                    + "ON i." + inventoryIDField + " = p." + productIDField + " "
                    + "WHERE " + productVisibility + " = 1;";
            Statement stmt = connection.createStatement ();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Object [] row = {rs.getInt("ProductID"), rs.getString("ProductName"), rs.getInt("ItemQuantity"), rs.getDouble ("Price")};
                model.addRow (row);
                noOfEntries++;
            }
            
            if (noOfEntries == 0) {
                JOptionPane.showMessageDialog (null, "There are no data in database!", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            
        } catch (SQLException sqle) {
            System.out.println ("Problem in database:\n" + sqle);
        }
    }
    
    public void launchFrame() {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            setOpacity (1.0f);
            new Inventory(connection, UID).setVisible(true);
        });
    }
    
    //private javax.swing.JTable tblData;
    
    class InventoryTableModel extends DefaultTableModel {
        boolean [][] editableCells = new boolean [999][999];
        
        private InventoryTableModel (int rows, int cols) {
            super(rows, cols);
            this.editableCells = new boolean[rows][cols];
        }
        
        private InventoryTableModel (Object [][] obj, String [] str) {
            super (obj, str);
        }
        
        private InventoryTableModel () {
            for (int count = 0; count < 999; count++) {
                for (int count2 = 0; count2 < 999; count2++) {
                    this.editableCells [count][count2] = false;
                }
            }
        }
        
        @Override
        public boolean isCellEditable(int row, int column) { // custom isCellEditable function
            return this.editableCells[row][column];
        }
        
        /*
        @Override
        public void addRow (Object[] rowData) {
            addRow(convertToVector(rowData));
        }
        
        @Override
        public void addRow(java.util.Vector rowData) {
            insertRow(getRowCount(), rowData);
        }
        */

        public void setCellEditable(int row, int col, boolean value) {
            this.editableCells[row][col] = value; // set cell true/false
            this.fireTableCellUpdated(row, col);
        }
        
        public boolean [][] assignNewArray (boolean [][] collection) {
            boolean [][] newCollection = new boolean [collection.length][collection[0].length];
            for (int count = 0; count < collection.length; count++) {
                
            }
            
            return (newCollection);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JTable tblData;
    // End of variables declaration//GEN-END:variables
}