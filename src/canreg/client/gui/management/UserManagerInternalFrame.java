/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UserManagerInternalFrame.java
 *
 * Created on 05-May-2009, 16:55:02
 */

package canreg.client.gui.management;

import canreg.common.Globals;
import canreg.server.User;
import java.rmi.RemoteException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.jdesktop.application.Action;

/**
 *
 * @author ervikm
 */
public class UserManagerInternalFrame extends javax.swing.JInternalFrame {
    private Vector<User> users;
    private DefaultListModel usersListModel;

    /** Creates new form UserManagerInternalFrame */
    public UserManagerInternalFrame() {
        initComponents();
        initData();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        currentUserPanel = new javax.swing.JPanel();
        passwordPanel = new javax.swing.JPanel();
        currentPasswordLabel = new javax.swing.JLabel();
        newPasswordLabel = new javax.swing.JLabel();
        confirmNewPasswordLabel = new javax.swing.JLabel();
        currentPasswordField = new javax.swing.JPasswordField();
        newPasswordField = new javax.swing.JPasswordField();
        confirmNewPasswordField = new javax.swing.JPasswordField();
        changePasswordButton = new javax.swing.JButton();
        lockedRecordsPanel = new javax.swing.JPanel();
        userManagerPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        userRightLevelComboBox = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(canreg.client.CanRegClientApp.class).getContext().getResourceMap(UserManagerInternalFrame.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        currentUserPanel.setName("currentUserPanel"); // NOI18N

        passwordPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("passwordPanel.border.title"))); // NOI18N
        passwordPanel.setName("passwordPanel"); // NOI18N

        currentPasswordLabel.setText(resourceMap.getString("currentPasswordLabel.text")); // NOI18N
        currentPasswordLabel.setName("currentPasswordLabel"); // NOI18N

        newPasswordLabel.setText(resourceMap.getString("newPasswordLabel.text")); // NOI18N
        newPasswordLabel.setName("newPasswordLabel"); // NOI18N

        confirmNewPasswordLabel.setText(resourceMap.getString("confirmNewPasswordLabel.text")); // NOI18N
        confirmNewPasswordLabel.setName("confirmNewPasswordLabel"); // NOI18N

        currentPasswordField.setText(resourceMap.getString("currentPasswordField.text")); // NOI18N
        currentPasswordField.setName("currentPasswordField"); // NOI18N

        newPasswordField.setText(resourceMap.getString("newPasswordField.text")); // NOI18N
        newPasswordField.setName("newPasswordField"); // NOI18N

        confirmNewPasswordField.setText(resourceMap.getString("confirmNewPasswordField.text")); // NOI18N
        confirmNewPasswordField.setName("confirmNewPasswordField"); // NOI18N

        changePasswordButton.setText(resourceMap.getString("changePasswordButton.text")); // NOI18N
        changePasswordButton.setName("changePasswordButton"); // NOI18N

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmNewPasswordLabel)
                    .addComponent(newPasswordLabel)
                    .addComponent(currentPasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(newPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(confirmNewPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(changePasswordButton))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currentPasswordLabel)
                    .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPasswordLabel)
                    .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmNewPasswordLabel)
                    .addComponent(confirmNewPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changePasswordButton))
        );

        javax.swing.GroupLayout currentUserPanelLayout = new javax.swing.GroupLayout(currentUserPanel);
        currentUserPanel.setLayout(currentUserPanelLayout);
        currentUserPanelLayout.setHorizontalGroup(
            currentUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        currentUserPanelLayout.setVerticalGroup(
            currentUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(currentUserPanelLayout.createSequentialGroup()
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("currentUserPanel.TabConstraints.tabTitle"), currentUserPanel); // NOI18N

        lockedRecordsPanel.setName("lockedRecordsPanel"); // NOI18N

        javax.swing.GroupLayout lockedRecordsPanelLayout = new javax.swing.GroupLayout(lockedRecordsPanel);
        lockedRecordsPanel.setLayout(lockedRecordsPanelLayout);
        lockedRecordsPanelLayout.setHorizontalGroup(
            lockedRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        lockedRecordsPanelLayout.setVerticalGroup(
            lockedRecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab(resourceMap.getString("lockedRecordsPanel.TabConstraints.tabTitle"), lockedRecordsPanel); // NOI18N

        userManagerPanel.setName("userManagerPanel"); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel4.border.title"))); // NOI18N
        jPanel4.setName("jPanel4"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        usersList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        usersList.setName("usersList"); // NOI18N
        usersList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                usersListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(usersList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        usernameTextField.setEditable(false);
        usernameTextField.setText(resourceMap.getString("usernameTextField.text")); // NOI18N
        usernameTextField.setName("usernameTextField"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        userRightLevelComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        userRightLevelComboBox.setName("userRightLevelComboBox"); // NOI18N

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N

        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(canreg.client.CanRegClientApp.class).getContext().getActionMap(UserManagerInternalFrame.class, this);
        jButton5.setAction(actionMap.get("addUserAction")); // NOI18N
        jButton5.setName("jButton5"); // NOI18N

        javax.swing.GroupLayout userManagerPanelLayout = new javax.swing.GroupLayout(userManagerPanel);
        userManagerPanel.setLayout(userManagerPanelLayout);
        userManagerPanelLayout.setHorizontalGroup(
            userManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(userManagerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(userRightLevelComboBox, 0, 298, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(userManagerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        userManagerPanelLayout.setVerticalGroup(
            userManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userManagerPanelLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(userRightLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userManagerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("userManagerPanel.TabConstraints.tabTitle"), userManagerPanel); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initData() {
        refreshUsersList();
        DefaultComboBoxModel userLevelsModel = new DefaultComboBoxModel(Globals.UserRightLevels.values());
        userRightLevelComboBox.setModel(userLevelsModel);
        usersList.setSelectedIndex(0);
    }

    private void usersListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_usersListValueChanged
        User user = (User) usersList.getSelectedValue();
        usernameTextField.setText(user.getUserName());
        userRightLevelComboBox.setSelectedItem(user.getUserRightLevel());
    }//GEN-LAST:event_usersListValueChanged

    @Action
    public void addUserAction() {
        User user = new User();
        String userName = JOptionPane.showInputDialog("User name:");
        user.setUserName(userName);
        user.setUserRightLevel(Globals.UserRightLevels.REGISTRAR);

        // TODO: add user to the server

        usersListModel.addElement(user);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JPasswordField confirmNewPasswordField;
    private javax.swing.JLabel confirmNewPasswordLabel;
    private javax.swing.JPasswordField currentPasswordField;
    private javax.swing.JLabel currentPasswordLabel;
    private javax.swing.JPanel currentUserPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel lockedRecordsPanel;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPanel userManagerPanel;
    private javax.swing.JComboBox userRightLevelComboBox;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JList usersList;
    // End of variables declaration//GEN-END:variables

    private void refreshUsersList() {
        try {
            users = canreg.client.CanRegClientApp.getApplication().listUsers();
            usersListModel = new DefaultListModel();
            for (User user:users){
                usersListModel.addElement(user);
            }
            usersList.setModel(usersListModel);
        } catch (SecurityException ex) {
            Logger.getLogger(UserManagerInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(UserManagerInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}