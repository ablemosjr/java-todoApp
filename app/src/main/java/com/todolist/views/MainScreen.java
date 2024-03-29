
package com.todolist.views;

import com.todolist.controller.ProjectController;
import com.todolist.controller.TaskController;
import com.todolist.model.Project;
import com.todolist.model.Task;
import com.todolist.util.ButtonColumnCellRenderer;
import com.todolist.util.DeadlineColumnCellRenderer;
import com.todolist.util.TaskTableModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;

public class MainScreen extends javax.swing.JFrame {

    ProjectController projectController;
    TaskController taskController;
    
    DefaultListModel projectsModel;
    TaskTableModel taskModel;
    
    public MainScreen() {
        initComponents();
                
        initDataController();
        initComponentsModel();
        
        decorateTableTask();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Table_Tasks = new javax.swing.JScrollPane();
        Table_Tasks = new javax.swing.JTable();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        panelListProjects = new javax.swing.JList<>();
        Panel_LocalTasks = new javax.swing.JPanel();
        Empty_List = new javax.swing.JPanel();
        EmptyList_Icon = new javax.swing.JLabel();
        EmptyList_Title = new javax.swing.JLabel();
        EmptyList_Subtitle = new javax.swing.JLabel();

        Table_Tasks.setBackground(new java.awt.Color(255, 255, 255));
        Table_Tasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Table_Tasks.setForeground(new java.awt.Color(51, 51, 51));
        Table_Tasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descri��o", "Prazo", "Tarefa Conclu�da"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table_Tasks.setGridColor(new java.awt.Color(255, 255, 255));
        Table_Tasks.setRowHeight(40);
        Table_Tasks.setSelectionBackground(new java.awt.Color(153, 255, 153));
        Table_Tasks.setSelectionForeground(new java.awt.Color(51, 51, 51));
        Table_Tasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        Table_Tasks.setShowHorizontalLines(true);
        Table_Tasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_TasksMouseClicked(evt);
            }
        });
        Panel_Table_Tasks.setViewportView(Table_Tasks);

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
        btnAdd_Projects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdd_ProjectsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Panel_ProjectsLayout = new javax.swing.GroupLayout(Panel_Projects);
        Panel_Projects.setLayout(Panel_ProjectsLayout);
        Panel_ProjectsLayout.setHorizontalGroup(
            Panel_ProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProjectsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Projects_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
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
        btnAdd_Tasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdd_TasksMouseClicked(evt);
            }
        });

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

        panelListProjects.setBackground(new java.awt.Color(255, 255, 255));
        panelListProjects.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        panelListProjects.setForeground(new java.awt.Color(102, 102, 102));
        panelListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        panelListProjects.setFixedCellHeight(40);
        panelListProjects.setSelectionBackground(new java.awt.Color(0, 153, 102));
        panelListProjects.setSelectionForeground(new java.awt.Color(255, 255, 255));
        panelListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelListProjectsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(panelListProjects);

        javax.swing.GroupLayout Panel_ProjectsListLayout = new javax.swing.GroupLayout(Panel_ProjectsList);
        Panel_ProjectsList.setLayout(Panel_ProjectsListLayout);
        Panel_ProjectsListLayout.setHorizontalGroup(
            Panel_ProjectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProjectsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        Panel_ProjectsListLayout.setVerticalGroup(
            Panel_ProjectsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProjectsListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        Panel_LocalTasks.setBackground(new java.awt.Color(255, 255, 255));
        Panel_LocalTasks.setLayout(new java.awt.BorderLayout());

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
            .addComponent(EmptyList_Subtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );
        Empty_ListLayout.setVerticalGroup(
            Empty_ListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Empty_ListLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(EmptyList_Icon)
                .addGap(12, 12, 12)
                .addComponent(EmptyList_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmptyList_Subtitle)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        Panel_LocalTasks.add(Empty_List, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Panel_ProjectsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Projects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_LocalTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(Panel_LocalTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd_ProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdd_ProjectsMouseClicked
        // TODO
        ProjectDialog_Screen projectDialog_Screen = new ProjectDialog_Screen(this, rootPaneCheckingEnabled);
        projectDialog_Screen.setVisible(true);
        
        projectDialog_Screen.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                loadProjects();
            }
        });
    }//GEN-LAST:event_btnAdd_ProjectsMouseClicked

    private void btnAdd_TasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdd_TasksMouseClicked
        // TODO
        TaskDialog_Screen taskDialog_Screen = new TaskDialog_Screen(this, rootPaneCheckingEnabled); 
        
        int projectIndex = panelListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        taskDialog_Screen.setProject(project);
        
        taskDialog_Screen.setVisible(true);
        
        taskDialog_Screen.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                int projectIndex = panelListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
            }
        });
    }//GEN-LAST:event_btnAdd_TasksMouseClicked

    private void Table_TasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_TasksMouseClicked
        // TODO
        int rowIndex = Table_Tasks.rowAtPoint(evt.getPoint());
        int columnIndex = Table_Tasks.columnAtPoint(evt.getPoint());
        
        Task task = taskModel.getTasks().get(rowIndex);
        
        switch (columnIndex) {
            case 3:
                taskController.update(task);
                break;
            case 5:
                taskController.removeById(task.getId());
                taskModel.getTasks().remove(task);
                
                int projectIndex = panelListProjects.getSelectedIndex();
                Project project = (Project) projectsModel.get(projectIndex);
                loadTasks(project.getId());
                break;
        }
    }//GEN-LAST:event_Table_TasksMouseClicked

    private void panelListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelListProjectsMouseClicked
        // TODO
        int projectIndex = panelListProjects.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);      
        loadTasks(project.getId());
    }//GEN-LAST:event_panelListProjectsMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
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
    private javax.swing.JPanel Panel_LocalTasks;
    private javax.swing.JPanel Panel_Projects;
    private javax.swing.JPanel Panel_ProjectsList;
    private javax.swing.JScrollPane Panel_Table_Tasks;
    private javax.swing.JPanel Panel_Tasks;
    private javax.swing.JPanel Panel_Toolbar;
    private javax.swing.JLabel Projects_Title;
    private javax.swing.JTable Table_Tasks;
    private javax.swing.JLabel Tasks_Title;
    private javax.swing.JLabel Toolbar_Subtitle;
    private javax.swing.JLabel Toolbar_Title;
    private javax.swing.JLabel btnAdd_Projects;
    private javax.swing.JLabel btnAdd_Tasks;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> panelListProjects;
    // End of variables declaration//GEN-END:variables

    public void decorateTableTask() {
        Table_Tasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        Table_Tasks.getTableHeader().setBackground(new Color(0, 153, 102));
        Table_Tasks.getTableHeader().setForeground(new Color(255, 255, 255));
        Table_Tasks.setAutoCreateRowSorter(true);
        
        Table_Tasks.getColumnModel().getColumn(2).setCellRenderer(new DeadlineColumnCellRenderer());
        Table_Tasks.getColumnModel().getColumn(4).setCellRenderer(new ButtonColumnCellRenderer("edit"));
        Table_Tasks.getColumnModel().getColumn(5).setCellRenderer(new ButtonColumnCellRenderer("delete"));
    }
    
    public void initDataController() {
        projectController = new ProjectController();
        taskController = new TaskController();
    }
    
    public void initComponentsModel() {
        projectsModel = new DefaultListModel();
        loadProjects();
        
        taskModel = new TaskTableModel();
        Table_Tasks.setModel(taskModel);
        loadTasks(1);
        
        if (!projectsModel.isEmpty()) {
            panelListProjects.setSelectedIndex(0);
            Project project = (Project) projectsModel.get(0);
            loadTasks(project.getId());
        }
    }
    
    public void loadProjects() {
        List<Project> projects = projectController.getAll();
        projectsModel.clear();
        
        for (int i = 0; i < projects.size(); i++) {
            Project project = projects.get(i);
            projectsModel.addElement(project);
        }
        
        panelListProjects.setModel(projectsModel);
    }
    
    public void loadTasks(int idProject) {
        List<Task> tasks = taskController.getAll(idProject);
        taskModel.setTasks(tasks);
        
        showTable_Tasks(!tasks.isEmpty());
    }
    
    private void showTable_Tasks(boolean hasTasks) {
        if (hasTasks) {
            if (Empty_List.isVisible()) {
                Empty_List.setVisible(false);
                Panel_LocalTasks.remove(Empty_List);
            }
            
            Panel_LocalTasks.add(Panel_Table_Tasks);
            Panel_Table_Tasks.setVisible(true);
            Panel_Table_Tasks.setSize(Panel_LocalTasks.getWidth(), Panel_LocalTasks.getHeight());
        } else {
            if (Panel_Table_Tasks.isVisible()) {
                Panel_Table_Tasks.setVisible(false);
                Panel_LocalTasks.remove(Panel_Table_Tasks);
            }
            
            Panel_LocalTasks.add(Empty_List);
            Empty_List.setVisible(true);
            Empty_List.setSize(Panel_LocalTasks.getWidth(), Panel_LocalTasks.getHeight());
        }
    }
}
