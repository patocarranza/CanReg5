/*
 * OptionsFrame.java
 *
 * Created on 28 February 2008, 09:34
 */
package canreg.client.gui;

import canreg.client.CanRegClientApp;
import canreg.client.LocalSettings;
import canreg.client.gui.tools.BareBonesBrowserLaunch;
import canreg.common.Globals;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdesktop.application.Action;

/**
 *
 * @author  morten
 */
public class OptionsFrame extends javax.swing.JInternalFrame {

    private CanRegClientView crcv;
    private LocalSettings localSettings;
    private Locale[] locales;
    private Properties appInfoProperties;

    /** Creates new form OptionsFrame
     * @param crcv 
     */
    public OptionsFrame(CanRegClientView crcv) {
        this.crcv = crcv;
        InputStream in = null;
        appInfoProperties = new Properties();
        //
        // load properties file
        //
        try {
            //
            // get Application information
            //
            in = getClass().getResourceAsStream(Globals.APPINFO_PROPERTIES_PATH);
            appInfoProperties.load(in);
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } // end-try-catch
        initComponents();
        initValues();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        generalPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        fontSizeLabel = new javax.swing.JLabel();
        fontSizeComboBox = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        languageLabel = new javax.swing.JLabel();
        languageComboBox = new javax.swing.JComboBox();
        systemPanel = new javax.swing.JPanel();
        automaticBackupPanel = new javax.swing.JPanel();
        automaticbackupCheckBox = new javax.swing.JCheckBox();
        everyLabel = new javax.swing.JLabel();
        numberOfDaysTextField = new javax.swing.JTextField();
        daysLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backUpPerformedTextField = new javax.swing.JTextField();
        advancedPanel = new javax.swing.JPanel();
        versionPanel = new javax.swing.JPanel();
        versionInstalledLabel = new javax.swing.JLabel();
        versionInstalledTextField = new javax.swing.JTextField();
        latestVersionLabel = new javax.swing.JLabel();
        latestVersionTextField = new javax.swing.JTextField();
        downloadLatestButton = new javax.swing.JButton();
        checkButton = new javax.swing.JButton();
        lookAndFeelPanel = new javax.swing.JPanel();
        showOutlineCheckBox = new javax.swing.JCheckBox();

        setClosable(true);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(canreg.client.CanRegClientApp.class).getContext().getResourceMap(OptionsFrame.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setFrameIcon(resourceMap.getIcon("Form.frameIcon")); // NOI18N
        setName("Form"); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(canreg.client.CanRegClientApp.class).getContext().getActionMap(OptionsFrame.class, this);
        jButton1.setAction(actionMap.get("okAction")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jButton2.setAction(actionMap.get("cancelAction")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        generalPanel.setName("generalPanel"); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel4.border.title"))); // NOI18N
        jPanel4.setToolTipText(resourceMap.getString("jPanel4.toolTipText")); // NOI18N
        jPanel4.setEnabled(false);
        jPanel4.setFocusable(false);
        jPanel4.setName("jPanel4"); // NOI18N

        fontSizeLabel.setText(resourceMap.getString("fontSizeLabel.text")); // NOI18N
        fontSizeLabel.setEnabled(false);
        fontSizeLabel.setName("fontSizeLabel"); // NOI18N

        fontSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Medium", "Big", "Small" }));
        fontSizeComboBox.setToolTipText(resourceMap.getString("fontSizeComboBox.toolTipText")); // NOI18N
        fontSizeComboBox.setEnabled(false);
        fontSizeComboBox.setName("fontSizeComboBox"); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fontSizeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fontSizeComboBox, 0, 316, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontSizeLabel)
                    .addComponent(fontSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("jPanel1.border.title"))); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        languageLabel.setText(resourceMap.getString("languageLabel.text")); // NOI18N
        languageLabel.setName("languageLabel"); // NOI18N

        languageComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Arabic", "Spanish", "Persian" }));
        languageComboBox.setToolTipText(resourceMap.getString("languageComboBox.toolTipText")); // NOI18N
        languageComboBox.setName("languageComboBox"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(languageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(languageComboBox, 0, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(languageLabel)
                    .addComponent(languageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout generalPanelLayout = new javax.swing.GroupLayout(generalPanel);
        generalPanel.setLayout(generalPanelLayout);
        generalPanelLayout.setHorizontalGroup(
            generalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        generalPanelLayout.setVerticalGroup(
            generalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("generalPanel.TabConstraints.tabTitle"), generalPanel); // NOI18N

        systemPanel.setName("systemPanel"); // NOI18N

        automaticBackupPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("automaticBackupPanel.border.title"))); // NOI18N
        automaticBackupPanel.setName("automaticBackupPanel"); // NOI18N

        automaticbackupCheckBox.setSelected(true);
        automaticbackupCheckBox.setText(resourceMap.getString("automaticbackupCheckBox.text")); // NOI18N
        automaticbackupCheckBox.setName("automaticbackupCheckBox"); // NOI18N

        everyLabel.setText(resourceMap.getString("everyLabel.text")); // NOI18N
        everyLabel.setName("everyLabel"); // NOI18N

        numberOfDaysTextField.setText(resourceMap.getString("numberOfDaysTextField.text")); // NOI18N
        numberOfDaysTextField.setName("numberOfDaysTextField"); // NOI18N

        daysLabel.setText(resourceMap.getString("daysLabel.text")); // NOI18N
        daysLabel.setName("daysLabel"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        backUpPerformedTextField.setEditable(false);
        backUpPerformedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        backUpPerformedTextField.setText(resourceMap.getString("backUpPerformedTextField.text")); // NOI18N
        backUpPerformedTextField.setFocusable(false);
        backUpPerformedTextField.setName("backUpPerformedTextField"); // NOI18N

        javax.swing.GroupLayout automaticBackupPanelLayout = new javax.swing.GroupLayout(automaticBackupPanel);
        automaticBackupPanel.setLayout(automaticBackupPanelLayout);
        automaticBackupPanelLayout.setHorizontalGroup(
            automaticBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(automaticBackupPanelLayout.createSequentialGroup()
                .addGroup(automaticBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(automaticBackupPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(automaticbackupCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE))
                    .addGroup(automaticBackupPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(automaticBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(automaticBackupPanelLayout.createSequentialGroup()
                        .addComponent(everyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberOfDaysTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daysLabel))
                    .addComponent(backUpPerformedTextField)))
        );
        automaticBackupPanelLayout.setVerticalGroup(
            automaticBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(automaticBackupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(automaticBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(automaticbackupCheckBox)
                    .addComponent(numberOfDaysTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(daysLabel)
                    .addComponent(everyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(automaticBackupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backUpPerformedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout systemPanelLayout = new javax.swing.GroupLayout(systemPanel);
        systemPanel.setLayout(systemPanelLayout);
        systemPanelLayout.setHorizontalGroup(
            systemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, systemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(automaticBackupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        systemPanelLayout.setVerticalGroup(
            systemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(automaticBackupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("systemPanel.TabConstraints.tabTitle"), systemPanel); // NOI18N

        advancedPanel.setName("advancedPanel"); // NOI18N

        versionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("versionPanel.border.title"))); // NOI18N
        versionPanel.setName("versionPanel"); // NOI18N

        versionInstalledLabel.setText(resourceMap.getString("versionInstalledLabel.text")); // NOI18N
        versionInstalledLabel.setName("versionInstalledLabel"); // NOI18N

        versionInstalledTextField.setEditable(false);
        versionInstalledTextField.setText(resourceMap.getString("versionInstalledTextField.text")); // NOI18N
        versionInstalledTextField.setName("versionInstalledTextField"); // NOI18N

        latestVersionLabel.setText(resourceMap.getString("latestVersionLabel.text")); // NOI18N
        latestVersionLabel.setName("latestVersionLabel"); // NOI18N

        latestVersionTextField.setEditable(false);
        latestVersionTextField.setText(resourceMap.getString("latestVersionTextField.text")); // NOI18N
        latestVersionTextField.setEnabled(false);
        latestVersionTextField.setName("latestVersionTextField"); // NOI18N

        downloadLatestButton.setAction(actionMap.get("downloadLatestVersionAction")); // NOI18N
        downloadLatestButton.setForeground(resourceMap.getColor("downloadLatestButton.foreground")); // NOI18N
        downloadLatestButton.setBorder(null);
        downloadLatestButton.setBorderPainted(false);
        downloadLatestButton.setContentAreaFilled(false);
        downloadLatestButton.setName("downloadLatestButton"); // NOI18N

        checkButton.setAction(actionMap.get("checkLatestVersionAction")); // NOI18N
        checkButton.setText(resourceMap.getString("checkButton.text")); // NOI18N
        checkButton.setName("checkButton"); // NOI18N

        javax.swing.GroupLayout versionPanelLayout = new javax.swing.GroupLayout(versionPanel);
        versionPanel.setLayout(versionPanelLayout);
        versionPanelLayout.setHorizontalGroup(
            versionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(versionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(versionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(latestVersionLabel)
                    .addComponent(versionInstalledLabel))
                .addGap(8, 8, 8)
                .addGroup(versionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(versionPanelLayout.createSequentialGroup()
                        .addComponent(downloadLatestButton)
                        .addContainerGap())
                    .addGroup(versionPanelLayout.createSequentialGroup()
                        .addGroup(versionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(latestVersionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(versionInstalledTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkButton))))
        );
        versionPanelLayout.setVerticalGroup(
            versionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(versionPanelLayout.createSequentialGroup()
                .addGroup(versionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(versionInstalledLabel)
                    .addComponent(versionInstalledTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(versionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(latestVersionLabel)
                    .addComponent(checkButton)
                    .addComponent(latestVersionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(downloadLatestButton))
        );

        lookAndFeelPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("lookAndFeelPanel.border.title"))); // NOI18N
        lookAndFeelPanel.setToolTipText(resourceMap.getString("lookAndFeelPanel.toolTipText")); // NOI18N
        lookAndFeelPanel.setName("lookAndFeelPanel"); // NOI18N

        showOutlineCheckBox.setSelected(true);
        showOutlineCheckBox.setText(resourceMap.getString("showOutlineCheckBox.text")); // NOI18N
        showOutlineCheckBox.setToolTipText(resourceMap.getString("showOutlineCheckBox.toolTipText")); // NOI18N
        showOutlineCheckBox.setName("showOutlineCheckBox"); // NOI18N

        javax.swing.GroupLayout lookAndFeelPanelLayout = new javax.swing.GroupLayout(lookAndFeelPanel);
        lookAndFeelPanel.setLayout(lookAndFeelPanelLayout);
        lookAndFeelPanelLayout.setHorizontalGroup(
            lookAndFeelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lookAndFeelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showOutlineCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );
        lookAndFeelPanelLayout.setVerticalGroup(
            lookAndFeelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lookAndFeelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showOutlineCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout advancedPanelLayout = new javax.swing.GroupLayout(advancedPanel);
        advancedPanel.setLayout(advancedPanelLayout);
        advancedPanelLayout.setHorizontalGroup(
            advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advancedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(versionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lookAndFeelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        advancedPanelLayout.setVerticalGroup(
            advancedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(advancedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(versionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lookAndFeelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("advancedPanel.TabConstraints.tabTitle"), advancedPanel); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     */
    @Action
    public void cancelAction() {
        this.dispose();
    }

    /**
     * 
     */
    @Action
    public void okAction() {
        // First test filds that can be tested
        if (valuesOK()) {
            // store all info
            saveValues();
            // apply new settings
            crcv.applyPreferences();
            //and close
            this.dispose();
        } else {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel advancedPanel;
    private javax.swing.JPanel automaticBackupPanel;
    private javax.swing.JCheckBox automaticbackupCheckBox;
    private javax.swing.JTextField backUpPerformedTextField;
    private javax.swing.JButton checkButton;
    private javax.swing.JLabel daysLabel;
    private javax.swing.JButton downloadLatestButton;
    private javax.swing.JLabel everyLabel;
    private javax.swing.JComboBox fontSizeComboBox;
    private javax.swing.JLabel fontSizeLabel;
    private javax.swing.JPanel generalPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox languageComboBox;
    private javax.swing.JLabel languageLabel;
    private javax.swing.JLabel latestVersionLabel;
    private javax.swing.JTextField latestVersionTextField;
    private javax.swing.JPanel lookAndFeelPanel;
    private javax.swing.JTextField numberOfDaysTextField;
    private javax.swing.JCheckBox showOutlineCheckBox;
    private javax.swing.JPanel systemPanel;
    private javax.swing.JLabel versionInstalledLabel;
    private javax.swing.JTextField versionInstalledTextField;
    private javax.swing.JPanel versionPanel;
    // End of variables declaration//GEN-END:variables
    private void initValues() {
        localSettings = CanRegClientApp.getApplication().getLocalSettings();
        // Languages
        locales = Locale.getAvailableLocales();
        Arrays.sort(locales, new Comparator<Locale>() {

            public int compare(Locale o1, Locale o2) {
                return o1.getDisplayName(o1).compareToIgnoreCase(o2.getDisplayName(o2));
            }
        });
        String[] localeNames = new String[locales.length];
        Locale currentLocale = localSettings.getLocale();
        int currentLocaleIndex = 0;
        int numberOfElementsAdded = 0;
        LinkedList localesList = new LinkedList();
        LinkedList localesNamesList = new LinkedList();
        for (int i = 0; i < locales.length; i++) {

            String country = locales[i].getDisplayCountry(locales[i]);
            localeNames[i] = locales[i].getDisplayName(locales[i]);

            if (country.trim().length() > 0) {
                //skip it
            } else {
                if (locales[i].equals(currentLocale)) {
                    currentLocaleIndex = numberOfElementsAdded;
                }
                localesList.add(locales[i]);
                localesNamesList.add(locales[i].getDisplayName(locales[i]));
                numberOfElementsAdded++;
            }

        }
        locales = (Locale[]) localesList.toArray(locales);
        languageComboBox.setModel(new javax.swing.DefaultComboBoxModel(localesNamesList.toArray()));
        languageComboBox.setSelectedIndex(currentLocaleIndex);

        showOutlineCheckBox.setSelected(localSettings.isOutlineDragMode());
        // CanReg verison
        String versionString = "";
        for (String part:Globals.versionStringParts){
            versionString += appInfoProperties.getProperty(part);
        }
        versionInstalledTextField.setText(versionString);
        try {
            // Backup
            Date backUpDate = CanRegClientApp.getApplication().getDateOfLastBackUp();
            if (backUpDate != null) {
                backUpPerformedTextField.setText(DateFormat.getDateInstance().format(backUpDate));
            }
        } catch (SecurityException ex) {
            Logger.getLogger(OptionsFrame.class.getName()).log(Level.INFO, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(OptionsFrame.class.getName()).log(Level.INFO, null, ex);
        }
        String backUpEvery = localSettings.getProperty(LocalSettings.BACKUP_EVERY_KEY);

        numberOfDaysTextField.setText(backUpEvery);
        automaticbackupCheckBox.setSelected(localSettings.isAutoBackup());
    }

    private String getNewestVersionNumber() {
        String latestVersionString = canreg.common.Tools.getFileFromURL(Globals.newestVersionURLString);
        return latestVersionString;
    }

    private boolean valuesOK() {
        boolean valuesOK = true;
        if (automaticbackupCheckBox.isSelected()) {
            try {
                int numberOfDays = Integer.parseInt(numberOfDaysTextField.getText());
                if (numberOfDays < 1) {
                    JOptionPane.showInternalMessageDialog(
                            CanRegClientApp.getApplication().getMainFrame().getContentPane(),
                            "Number too low.",
                            "Error in automatic backup options.", JOptionPane.ERROR_MESSAGE);
                    valuesOK = false;
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showInternalMessageDialog(
                        CanRegClientApp.getApplication().getMainFrame().getContentPane(),
                        numberOfDaysTextField.getText() + " is not a number.",
                        "Error in automatic backup options.", JOptionPane.ERROR_MESSAGE);
                valuesOK = false;
            }
        }
        return valuesOK;
    }

    private void saveValues() {
        // save values
        // localSettings.setLocale(Globals.LANGUAGES_AVAILABLE[languageComboBox.getSelectedIndex()]);
        localSettings.setLocale(locales[languageComboBox.getSelectedIndex()].getLanguage());

        if (showOutlineCheckBox.isSelected()) {
            localSettings.setOutlineDragMode(true);
        } else {
            localSettings.setOutlineDragMode(false);
        }

        if (automaticbackupCheckBox.isSelected()) {
            localSettings.setAutomaticBackup(true);
            localSettings.setProperty(LocalSettings.BACKUP_EVERY_KEY, numberOfDaysTextField.getText());
        } else {
            localSettings.setAutomaticBackup(false);
        }
        // write settings to file
        localSettings.writeSettings();
    }

    /**
     * 
     */
    @Action
    public void downloadLatestVersionAction() {
        //  BareBonesBrowserLaunch.openURL(java.util.ResourceBundle.getBundle("canreg/client/gui/resources/CanRegClientView").getString("http://www.iacr.com.fr/"));
        BareBonesBrowserLaunch.openURL(Globals.downloadCanRegURL);
    }

    /**
     * 
     */
    @Action
    public void checkLatestVersionAction() {
        String lv = getNewestVersionNumber();
        if (lv != null && lv.trim().length() > 0) {
            latestVersionTextField.setText(lv);
            latestVersionTextField.setEnabled(true);
            if (!lv.trim().equalsIgnoreCase(versionInstalledTextField.getText())) {
                JOptionPane.showInternalMessageDialog(CanRegClientApp.getApplication().getMainFrame().getContentPane(), "You do not have the latest official version of CanReg5 installed.", "Message", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showInternalMessageDialog(CanRegClientApp.getApplication().getMainFrame().getContentPane(), "You have the latest official version of CanReg5 installed.", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showInternalMessageDialog(CanRegClientApp.getApplication().getMainFrame().getContentPane(), "Could not find information on latest version.", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
}
