package GUI;

import ProjectLibs.ClientTools;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.Vector;

public class Homepage extends javax.swing.JFrame {

    // the account in question - the one that logged in
    private String userid;
    private boolean isClosedByUser = true;
    //<editor-fold defaultstate="collapsed" desc=" All the frame components ">
    private javax.swing.JList accs;
    private javax.swing.JButton selectAcc;
    private javax.swing.JPanel jPanel;
    private javax.swing.JButton linkAcc;
    private javax.swing.JButton unlinkAcc;
    private javax.swing.JButton addBio;
    private javax.swing.JButton rmBio;
    private javax.swing.JButton chgName;
    private javax.swing.JButton chgPwd;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    //</editor-fold>

    /**
     * Creates new form AccSelect
     */
    public Homepage(String userid) {
        this.userid = userid;
        initComponents();
    }

    public Homepage() {
        initComponents();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Homepage().setVisible(true));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel = new javax.swing.JPanel();
        selectAcc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        accs = new javax.swing.JList();
        linkAcc = new javax.swing.JButton();
        addBio = new javax.swing.JButton();
        chgName = new javax.swing.JButton();
        unlinkAcc = new javax.swing.JButton();
        rmBio = new javax.swing.JButton();
        chgPwd = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                if (isClosedByUser)
                    formWindowClosed(evt);
            }

            @Override
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened();
            }
        });
        setTitle("Homepage");

        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
                "Select account for netbanking session", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Source Code Pro",
                        3, 12))); // NOI18N

        selectAcc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectAcc.setText("Proceed");
        selectAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAccActionPerformed(evt);
            }
        });

        accs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        accs.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ((DefaultListCellRenderer) accs.getCellRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        jScrollPane1.setViewportView(accs);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
                jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(selectAcc)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addContainerGap(49, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
        );
        jPanelLayout.setVerticalGroup(
                jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectAcc)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        linkAcc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linkAcc.setText("Link Account");
        linkAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkAccActionPerformed(evt);
            }
        });

        unlinkAcc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unlinkAcc.setText("Unlink Account");
        unlinkAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unlinkAccActionPerformed(evt);
            }
        });

        addBio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBio.setText("Add Biometric");
        addBio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBioActionPerformed(evt);
            }
        });

        rmBio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rmBio.setText("Remove Biometric");
        rmBio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmBioActionPerformed(evt);
            }
        });

        chgName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chgName.setText("Change Name");
        chgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgNameActionPerformed(evt);
            }
        });

        chgPwd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chgPwd.setText("Change Password");
        chgPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chgPwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(188, 188, 188)
                                                .addComponent(rmBio))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(linkAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(addBio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(chgName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(unlinkAcc)
                                                        .addComponent(chgPwd)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(linkAcc)
                                        .addComponent(unlinkAcc))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addBio)
                                        .addComponent(rmBio))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(chgName)
                                        .addComponent(chgPwd))
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }
    // </editor-fold>

    private void formWindowClosed(WindowEvent evt) {
        (new Login()).setVisible(true); // go back to login
    }

    private void chgPwdActionPerformed(ActionEvent evt) {
        JPasswordField pwd = new JPasswordField();
        JOptionPane.showMessageDialog(rootPane, pwd,
                "Enter new password", JOptionPane.QUESTION_MESSAGE);
        JSONObject request = new JSONObject(), response;
        request.put("operation", "change pwd");
        request.put("userid", userid);
        request.put("pwd", pwd.getText());

        try (ClientTools client = new ClientTools("localhost", 8000)) {
            client.out.writeUTF(request.toJSONString());
            response = (JSONObject) (new JSONParser()).parse(client.in.readUTF());

            if ((boolean) response.get("result")) {
                JOptionPane.showMessageDialog(rootPane, "Password Changed!", "Success", 1);
            } else {  // in case of error
                JOptionPane.showMessageDialog(rootPane, response.get("msg"), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void chgNameActionPerformed(ActionEvent evt) {
        String name = JOptionPane.showInputDialog(rootPane, "Enter new name",
                "Change Name", JOptionPane.QUESTION_MESSAGE);
        JSONObject request = new JSONObject(), response;
        request.put("operation", "change name");
        request.put("userid", userid);
        request.put("name", name);

        try (ClientTools client = new ClientTools("localhost", 8000)) {
            client.out.writeUTF(request.toJSONString());
            response = (JSONObject) (new JSONParser()).parse(client.in.readUTF());

            if ((boolean) response.get("result")) {
                JOptionPane.showMessageDialog(rootPane, "Name Changed!", "Success", 1);
            } else {  // in case of error
                JOptionPane.showMessageDialog(rootPane, response.get("msg"), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void rmBioActionPerformed(ActionEvent evt) {
        JSONObject request = new JSONObject(), response;

        //<editor-fold defaultstate="collapsed" desc=" display all current biometrics ">
        request.put("operation", "get bios");
        request.put("userid", userid);
        JList<String> bios = new JList<>();

        try (ClientTools client = new ClientTools("localhost", 8000)) {
            client.out.writeUTF(request.toJSONString());
            response = (JSONObject) (new JSONParser()).parse(client.in.readUTF());

            if ((boolean) response.get("result")) {
                bios.setListData(new Vector((JSONArray) response.get("bios")));
            } else {  // in case of error
                JOptionPane.showMessageDialog(rootPane, response.get("msg"), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        // get which biometric to remove from the user
        String bioToRemove;
        try {
            JOptionPane.showMessageDialog(rootPane, bios, "Select a biometric to remove",
                    JOptionPane.QUESTION_MESSAGE);
            bioToRemove = bios.getSelectedValue().replace(" recognition", "");
        } catch (NullPointerException e) { // if no account is selected
            JOptionPane.showMessageDialog(rootPane, "Please select a biometric", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //<editor-fold defaultstate="collapsed" desc=" Remove selected biometric ">
        request.put("operation", "rm bio");
        request.put("type", bioToRemove);

        try (ClientTools client = new ClientTools("localhost", 8000)) {
            client.out.writeUTF(request.toJSONString());
            response = (JSONObject) (new JSONParser()).parse(client.in.readUTF());

            if ((boolean) response.get("result")) {
                JOptionPane.showMessageDialog(rootPane, "Biometric removed!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {  // in case of error
                JOptionPane.showMessageDialog(rootPane, response.get("msg"), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

    }

    void addBioActionPerformed(ActionEvent evt) {
        //<editor-fold defaultstate="collapsed" desc=" Create the stuff to display in dialog ">
        ButtonGroup bio = new ButtonGroup();

        JRadioButton ecg = new JRadioButton();
        ecg.setActionCommand("ecg");
        ecg.setText("ECG Recognition");
        bio.add(ecg);

        JRadioButton face = new JRadioButton();
        face.setActionCommand("face");
        face.setText("Facial Recognition");
        bio.add(face);

        JRadioButton finger = new JRadioButton();
        finger.setActionCommand("fingerprint");
        finger.setText("Fingerprint Recognition");
        bio.add(finger);

        JPanel disp = new JPanel();
        disp.setLayout(new BoxLayout(disp, BoxLayout.Y_AXIS));
        disp.add(ecg);
        disp.add(face);
        disp.add(finger);
        //</editor-fold>

        // get type from user
        JOptionPane.showMessageDialog(rootPane, disp, "Choose Type of Biometric", JOptionPane.PLAIN_MESSAGE);
        if (bio.getSelection() == null) {
            JOptionPane.showMessageDialog(rootPane, "Please select atleast one type of biometric",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String type = bio.getSelection().getActionCommand();

        //get value of biometric
        String val = JOptionPane.showInputDialog(rootPane, "Enter value of biometric :",
                "Value", JOptionPane.QUESTION_MESSAGE);
        if (val.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Please select atleast one type of biometric",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //<editor-fold defaultstate="collapsed" desc=" Add biometric to database ">
        JSONObject request = new JSONObject(), response;
        request.put("operation", "add bio");
        request.put("userid", userid);
        request.put("type", type);
        request.put("value", val);

        try (ClientTools client = new ClientTools("localhost", 8000)) {
            client.out.writeUTF(request.toJSONString());
            response = (JSONObject) (new JSONParser()).parse(client.in.readUTF());

            if ((boolean) response.get("result")) {  // if request was successful
                JOptionPane.showMessageDialog(rootPane, "Biometric added!", "Success",
                        JOptionPane.PLAIN_MESSAGE);
            } else {  // in case of error
                JOptionPane.showMessageDialog(rootPane, response.get("msg"), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>
    }

    private void unlinkAccActionPerformed(ActionEvent evt) {
        JSONObject request = new JSONObject(), response;

        int acc = Integer.parseInt(
                JOptionPane.showInputDialog(rootPane, "Enter account number",
                        "Unlink Account", JOptionPane.QUESTION_MESSAGE)
        );  // get acc no. to unlink

        //<editor-fold defaultstate="collapsed" desc=" unlink account from user ">
        request.put("operation", "unlink acc");
        request.put("userid", userid);
        request.put("acc", acc);

        try (ClientTools client = new ClientTools("localhost", 8000)) {
            client.out.writeUTF(request.toJSONString());
            response = (JSONObject) (new JSONParser()).parse(client.in.readUTF());

            if ((boolean) response.get("result")) {   // if request was successful
                JOptionPane.showMessageDialog(rootPane, "Account removed!", "Success",
                        JOptionPane.PLAIN_MESSAGE);
                formWindowOpened();
            } else {  // in case of error
                JOptionPane.showMessageDialog(rootPane, response.get("msg"), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>
    }

    void linkAccActionPerformed(ActionEvent evt) {
        JSONObject request = new JSONObject(), response;

        int acc = Integer.parseInt(
                JOptionPane.showInputDialog(rootPane, "Enter account number",
                        "Link Account", JOptionPane.QUESTION_MESSAGE)
        );  // get acc no. to add

        //<editor-fold defaultstate="collapsed" desc=" send a 'get otp' request to bank ">
        request.put("operation", "get otp");
        request.put("acc", acc);
        int otp = 0;
        try (ClientTools client = new ClientTools("localhost", 8000)) {
            client.out.writeUTF(request.toJSONString());
            response = (JSONObject) (new JSONParser()).parse(client.in.readUTF());

            if ((boolean) response.get("result")) {   // if request was successful
                otp = Integer.parseInt(response.get("otp").toString());
            } else {  // in case of error
                JOptionPane.showMessageDialog(rootPane, response.get("msg"), "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        if (
                otp == Integer.parseInt(
                        JOptionPane.showInputDialog(rootPane, "Enter otp sent to registered phone number",
                                "Link Account", JOptionPane.QUESTION_MESSAGE)
                )  // get otp from user
        ) {
            //<editor-fold defaultstate="collapsed" desc=" link account to user ">
            request.put("operation", "link acc");
            request.put("userid", userid);

            try (ClientTools client = new ClientTools("localhost", 8000)) {
                client.out.writeUTF(request.toJSONString());
                response = (JSONObject) (new JSONParser()).parse(client.in.readUTF());

                if ((boolean) response.get("result")) {   // if request was successful
                    JOptionPane.showMessageDialog(rootPane, "Account added!", "Success",
                            JOptionPane.PLAIN_MESSAGE);
                    formWindowOpened();
                } else {  // in case of error
                    JOptionPane.showMessageDialog(rootPane, response.get("msg"), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            //</editor-fold>
        } else {
            JOptionPane.showMessageDialog(rootPane, "incorrect otp", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    private void formWindowOpened() {
        JSONObject request = new JSONObject();
        request.put("operation", "get accounts");
        request.put("userid", userid);

        try (ClientTools client = new ClientTools("localhost", 8000)) {
            client.out.writeUTF(request.toJSONString());
            JSONObject response = (JSONObject) (new JSONParser()).parse(client.in.readUTF()); // get response

            if ((Boolean) response.get("result")) {   // if request was successful
                accs.setListData(new Vector((JSONArray) response.get("accounts"))); // show accs in the list
            } else {    // in case of error
                JOptionPane.showMessageDialog(rootPane, response.get("msg"), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void selectAccActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            new Account(userid, Integer.parseInt(accs.getSelectedValue().toString())).setVisible(true);   // pass acc no. to next
            isClosedByUser = false;
            this.dispose();
        } catch (NullPointerException e) { // if no account is selected
            JOptionPane.showMessageDialog(rootPane, "Please select an account", "Error", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("test");
    }
}
