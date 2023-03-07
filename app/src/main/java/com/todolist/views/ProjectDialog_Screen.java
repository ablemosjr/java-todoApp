
package com.todolist.views;

import com.todolist.controller.ProjectController;
import com.todolist.model.Project;
import javax.swing.JOptionPane;

public class ProjectDialog_Screen extends javax.swing.JDialog {

    ProjectController controller;
    
    public ProjectDialog_Screen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        controller = new ProjectController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Project = new javax.swing.JPanel();
        Project_Title = new javax.swing.JLabel();
        btnConfirm_Project = new javax.swing.JLabel();
        Panel_Info = new javax.swing.JPanel();
        lbl_ProjectName = new javax.swing.JLabel();
        lbl_ProjectDescription = new javax.swing.JLabel();
        input_ProjectName = new javax.swing.JTextField();
        jsp_TextArea_Description = new javax.swing.JScrollPane();
        input_ProjectDescription = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel_Project.setBackground(new java.awt.Color(0, 153, 102));

        Project_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Project_Title.setForeground(new java.awt.Color(255, 255, 255));
        Project_Title.setText("Projeto");

        btnConfirm_Project.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConfirm_Project.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        btnConfirm_Project.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfirm_Project.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirm_ProjectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_ProjectLayout = new javax.swing.GroupLayout(Panel_Project);
        Panel_Project.setLayout(Panel_ProjectLayout);
        Panel_ProjectLayout.setHorizontalGroup(
            Panel_ProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProjectLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Project_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm_Project, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_ProjectLayout.setVerticalGroup(
            Panel_ProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_ProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirm_Project, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(Project_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Panel_Info.setBackground(new java.awt.Color(255, 255, 255));

        lbl_ProjectName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_ProjectName.setForeground(new java.awt.Color(102, 102, 102));
        lbl_ProjectName.setText("Nome:");

        lbl_ProjectDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_ProjectDescription.setForeground(new java.awt.Color(102, 102, 102));
        lbl_ProjectDescription.setText("Descrição:");

        input_ProjectName.setBackground(new java.awt.Color(255, 255, 255));
        input_ProjectName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_ProjectName.setForeground(new java.awt.Color(51, 51, 51));
        input_ProjectName.setCaretColor(new java.awt.Color(0, 153, 102));
        input_ProjectName.setSelectionColor(new java.awt.Color(0, 153, 102));
        input_ProjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_ProjectNameActionPerformed(evt);
            }
        });

        input_ProjectDescription.setBackground(new java.awt.Color(255, 255, 255));
        input_ProjectDescription.setColumns(20);
        input_ProjectDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_ProjectDescription.setForeground(new java.awt.Color(51, 51, 51));
        input_ProjectDescription.setRows(5);
        input_ProjectDescription.setSelectionColor(new java.awt.Color(0, 153, 102));
        jsp_TextArea_Description.setViewportView(input_ProjectDescription);

        javax.swing.GroupLayout Panel_InfoLayout = new javax.swing.GroupLayout(Panel_Info);
        Panel_Info.setLayout(Panel_InfoLayout);
        Panel_InfoLayout.setHorizontalGroup(
            Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jsp_TextArea_Description)
                    .addComponent(lbl_ProjectName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_ProjectDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_ProjectName))
                .addContainerGap())
        );
        Panel_InfoLayout.setVerticalGroup(
            Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InfoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl_ProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_ProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_ProjectDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsp_TextArea_Description, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Project, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Project, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_ProjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_ProjectNameActionPerformed

    }//GEN-LAST:event_input_ProjectNameActionPerformed

    private void btnConfirm_ProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirm_ProjectMouseClicked
        // TODO
        try {
            Project project = new Project();    
            project.setName(input_ProjectName.getText());
            project.setDescription(input_ProjectDescription.getText());

            controller.save(project);

            JOptionPane.showMessageDialog(Panel_Info, "Projeto salvo com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Panel_Info, e.getMessage());
        }
        
        this.dispose();
    }//GEN-LAST:event_btnConfirm_ProjectMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectDialog_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectDialog_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectDialog_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectDialog_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProjectDialog_Screen dialog = new ProjectDialog_Screen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Info;
    private javax.swing.JPanel Panel_Project;
    private javax.swing.JLabel Project_Title;
    private javax.swing.JLabel btnConfirm_Project;
    private javax.swing.JTextArea input_ProjectDescription;
    private javax.swing.JTextField input_ProjectName;
    private javax.swing.JScrollPane jsp_TextArea_Description;
    private javax.swing.JLabel lbl_ProjectDescription;
    private javax.swing.JLabel lbl_ProjectName;
    // End of variables declaration//GEN-END:variables
}
