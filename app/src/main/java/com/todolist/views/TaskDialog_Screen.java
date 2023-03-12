
package com.todolist.views;

import com.todolist.controller.TaskController;
import com.todolist.model.Project;
import com.todolist.model.Task;

import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class TaskDialog_Screen extends javax.swing.JDialog {
    
    TaskController controller;
    Project project;

    public TaskDialog_Screen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        controller = new TaskController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Panel_Task = new javax.swing.JPanel();
        Task_Title = new javax.swing.JLabel();
        btnConfirm_Task = new javax.swing.JLabel();
        Panel_Info = new javax.swing.JPanel();
        lbl_TaskName = new javax.swing.JLabel();
        input_TaskName = new javax.swing.JTextField();
        lbl_TaskDescription = new javax.swing.JLabel();
        jsp_TextArea_Description = new javax.swing.JScrollPane();
        input_TaskDescription = new javax.swing.JTextArea();
        lbl_TaskDeadline = new javax.swing.JLabel();
        lbl_TaskNotes = new javax.swing.JLabel();
        jsp_TextArea_Notes = new javax.swing.JScrollPane();
        input_TaskNotes = new javax.swing.JTextArea();
        input_TaskDeadline = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Panel_Task.setBackground(new java.awt.Color(0, 153, 102));

        Task_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Task_Title.setForeground(new java.awt.Color(255, 255, 255));
        Task_Title.setText("Tarefa");

        btnConfirm_Task.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnConfirm_Task.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        btnConfirm_Task.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfirm_Task.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirm_TaskMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_TaskLayout = new javax.swing.GroupLayout(Panel_Task);
        Panel_Task.setLayout(Panel_TaskLayout);
        Panel_TaskLayout.setHorizontalGroup(
            Panel_TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TaskLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Task_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirm_Task, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Panel_TaskLayout.setVerticalGroup(
            Panel_TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TaskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirm_Task, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(Task_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Panel_Info.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TaskName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TaskName.setForeground(new java.awt.Color(102, 102, 102));
        lbl_TaskName.setText("Nome:");

        input_TaskName.setBackground(new java.awt.Color(255, 255, 255));
        input_TaskName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_TaskNameActionPerformed(evt);
            }
        });

        lbl_TaskDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TaskDescription.setForeground(new java.awt.Color(102, 102, 102));
        lbl_TaskDescription.setText("Descrição:");

        input_TaskDescription.setBackground(new java.awt.Color(255, 255, 255));
        input_TaskDescription.setColumns(20);
        input_TaskDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_TaskDescription.setForeground(new java.awt.Color(51, 51, 51));
        input_TaskDescription.setRows(5);
        jsp_TextArea_Description.setViewportView(input_TaskDescription);

        lbl_TaskDeadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TaskDeadline.setForeground(new java.awt.Color(102, 102, 102));
        lbl_TaskDeadline.setText("Prazo");

        lbl_TaskNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TaskNotes.setForeground(new java.awt.Color(102, 102, 102));
        lbl_TaskNotes.setText("Notas:");

        input_TaskNotes.setBackground(new java.awt.Color(255, 255, 255));
        input_TaskNotes.setColumns(20);
        input_TaskNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        input_TaskNotes.setForeground(new java.awt.Color(51, 51, 51));
        input_TaskNotes.setRows(5);
        jsp_TextArea_Notes.setViewportView(input_TaskNotes);

        input_TaskDeadline.setBackground(new java.awt.Color(255, 255, 255));
        input_TaskDeadline.setForeground(new java.awt.Color(51, 51, 51));
        input_TaskDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        input_TaskDeadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout Panel_InfoLayout = new javax.swing.GroupLayout(Panel_Info);
        Panel_Info.setLayout(Panel_InfoLayout);
        Panel_InfoLayout.setHorizontalGroup(
            Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TaskName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(input_TaskName)
                    .addComponent(lbl_TaskDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jsp_TextArea_Description)
                    .addComponent(lbl_TaskDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_TaskNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jsp_TextArea_Notes)
                    .addComponent(input_TaskDeadline))
                .addContainerGap())
        );
        Panel_InfoLayout.setVerticalGroup(
            Panel_InfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_InfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TaskName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_TaskName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_TaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsp_TextArea_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_TaskDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_TaskDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_TaskNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jsp_TextArea_Notes, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Task, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Task, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel_Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void input_TaskNameActionPerformed(java.awt.event.ActionEvent evt) {                                               

    }                                              

    private void btnConfirm_TaskMouseClicked(java.awt.event.MouseEvent evt) {                                             
        // TODO
        try {
            if (!input_TaskName.getText().isEmpty() && !input_TaskDeadline.getText().isEmpty()) {
                Task task = new Task();   

                task.setIdProject(project.getId());

                task.setName(input_TaskName.getText());
                task.setDescription(input_TaskDescription.getText());
                task.setIsCompleted(false);
                task.setNotes(input_TaskNotes.getText());

                SimpleDateFormat df = new SimpleDateFormat("dd/MM/y");
                Date deadline = df.parse(input_TaskDeadline.getText());
                task.setDeadline(deadline);

                controller.save(task);

                JOptionPane.showMessageDialog(Panel_Info, "Tarefa salva com sucesso");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(Panel_Info, "Os campos de nome e prazo são obrigatórios");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Panel_Info, e.getMessage());
        }
    }                                            

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialog_Screen dialog = new TaskDialog_Screen(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Panel_Info;
    private javax.swing.JPanel Panel_Task;
    private javax.swing.JLabel Task_Title;
    private javax.swing.JLabel btnConfirm_Task;
    private javax.swing.JFormattedTextField input_TaskDeadline;
    private javax.swing.JTextArea input_TaskDescription;
    private javax.swing.JTextField input_TaskName;
    private javax.swing.JTextArea input_TaskNotes;
    private javax.swing.JScrollPane jsp_TextArea_Description;
    private javax.swing.JScrollPane jsp_TextArea_Notes;
    private javax.swing.JLabel lbl_TaskDeadline;
    private javax.swing.JLabel lbl_TaskDescription;
    private javax.swing.JLabel lbl_TaskName;
    private javax.swing.JLabel lbl_TaskNotes;
    // End of variables declaration                   

    public void setProject(Project project) {
        this.project = project;
    }
}
