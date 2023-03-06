/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.todolist.views;

/**
 *
 * @author ablem
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
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

        Panel_Toolbar = new javax.swing.JPanel();
        Toolbar_Title = new javax.swing.JLabel();
        Toolbar_Subtitle = new javax.swing.JLabel();
        Panel_Projects = new javax.swing.JPanel();
        Projects_Title = new javax.swing.JLabel();
        btnAdd_Projects = new javax.swing.JLabel();
        Panel_Tasks = new javax.swing.JPanel();
        Tasks_Title = new javax.swing.JLabel();
        btnAdd_Tasks = new javax.swing.JLabel();
        Panel_ProjectsList = new javax.swing.JPanel();
        Scrollpanel_Projects = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        Empty_List = new javax.swing.JPanel();
        EmptyList_Icon = new javax.swing.JLabel();
        EmptyList_Title = new javax.swing.JLabel();
        EmptyList_Subtitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 600));

        Panel_Toolbar.setBackground(new java.awt.Color(0, 153, 102));

        Toolbar_Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Toolbar_Title.setForeground(new java.awt.Color(255, 255, 255));
        Toolbar_Title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tick.png"))); // NOI18N
        Toolbar_Title.setText(" Todo App");
        Toolbar_Title.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        Toolbar_Subtitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Toolbar_Subtitle.setForeground(new java.awt.Color(255, 255, 255));
        Toolbar_Subtitle.setText("  Anote tudo, n�o esque�a nada");

        javax.swing.GroupLayout Panel_ToolbarLayout = new javax.swing.GroupLayout(Panel_Toolbar);
        Panel_Toolbar.setLayout(Panel_ToolbarLayout);
        Panel_ToolbarLayout.setHorizontalGroup(
            Panel_ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ToolbarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(Panel_ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Toolbar_Subtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Toolbar_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Panel_ToolbarLayout.setVerticalGroup(
            Panel_ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ToolbarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Toolbar_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Toolbar_Subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        Panel_Projects.setBackground(new java.awt.Color(255, 255, 255));

        Projects_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Projects_Title.setForeground(new java.awt.Color(0, 153, 102));
        Projects_Title.setText("Projetos");

        btnAdd_Projects.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N

        javax.swing.GroupLayout Panel_ProjectsLayout = new javax.swing.GroupLayout(Panel_Projects);
        Panel_Projects.setLayout(Panel_ProjectsLayout);
        Panel_ProjectsLayout.setHorizontalGroup(
            Panel_ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Projects_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd_Projects)
                .addGap(20, 20, 20))
        );
        Panel_ProjectsLayout.setVerticalGroup(
            Panel_ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ProjectsLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(Panel_ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd_Projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Projects_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        Panel_Tasks.setBackground(new java.awt.Color(255, 255, 255));

        Tasks_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Tasks_Title.setForeground(new java.awt.Color(0, 153, 102));
        Tasks_Title.setText("Tarefas");

        btnAdd_Tasks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N

        javax.swing.GroupLayout Panel_TasksLayout = new javax.swing.GroupLayout(Panel_Tasks);
        Panel_Tasks.setLayout(Panel_TasksLayout);
        Panel_TasksLayout.setHorizontalGroup(
            Panel_TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TasksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tasks_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd_Tasks)
                .addGap(20, 20, 20))
        );
        Panel_TasksLayout.setVerticalGroup(
            Panel_TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_TasksLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_TasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd_Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tasks_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        Panel_ProjectsList.setBackground(new java.awt.Color(255, 255, 255));

        jList1.setBackground(new java.awt.Color(255, 255, 255));
        jList1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jList1.setForeground(new java.awt.Color(102, 102, 102));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setFixedCellHeight(40);
        jList1.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jList1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Scrollpanel_Projects.setViewportView(jList1);

        javax.swing.GroupLayout Panel_ProjectsListLayout = new javax.swing.GroupLayout(Panel_ProjectsList);
        Panel_ProjectsList.setLayout(Panel_ProjectsListLayout);
        Panel_ProjectsListLayout.setHorizontalGroup(
            Panel_ProjectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProjectsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Scrollpanel_Projects)
                .addContainerGap())
        );
        Panel_ProjectsListLayout.setVerticalGroup(
            Panel_ProjectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProjectsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Scrollpanel_Projects, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        Empty_List.setBackground(new java.awt.Color(255, 255, 255));

        EmptyList_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmptyList_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lists.png"))); // NOI18N
        EmptyList_Icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        EmptyList_Title.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EmptyList_Title.setForeground(new java.awt.Color(0, 153, 102));
        EmptyList_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmptyList_Title.setText("Nenhuma tarefa por aqui :D");

        EmptyList_Subtitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        EmptyList_Subtitle.setForeground(new java.awt.Color(153, 153, 153));
        EmptyList_Subtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmptyList_Subtitle.setText("Clique no bot�o \"+\" para adicionar uma nova tarefa");

        javax.swing.GroupLayout Empty_ListLayout = new javax.swing.GroupLayout(Empty_List);
        Empty_List.setLayout(Empty_ListLayout);
        Empty_ListLayout.setHorizontalGroup(
            Empty_ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EmptyList_Icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EmptyList_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(EmptyList_Subtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );
        Empty_ListLayout.setVerticalGroup(
            Empty_ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Empty_ListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EmptyList_Icon)
                .addGap(12, 12, 12)
                .addComponent(EmptyList_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmptyList_Subtitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Empty_List, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Empty_List, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_Projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_ProjectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_Projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Tasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_ProjectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmptyList_Icon;
    private javax.swing.JLabel EmptyList_Subtitle;
    private javax.swing.JLabel EmptyList_Title;
    private javax.swing.JPanel Empty_List;
    private javax.swing.JPanel Panel_Projects;
    private javax.swing.JPanel Panel_ProjectsList;
    private javax.swing.JPanel Panel_Tasks;
    private javax.swing.JPanel Panel_Toolbar;
    private javax.swing.JLabel Projects_Title;
    private javax.swing.JScrollPane Scrollpanel_Projects;
    private javax.swing.JLabel Tasks_Title;
    private javax.swing.JLabel Toolbar_Subtitle;
    private javax.swing.JLabel Toolbar_Title;
    private javax.swing.JLabel btnAdd_Projects;
    private javax.swing.JLabel btnAdd_Tasks;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}