
package com.todolist.controller;

import com.todolist.model.Task;
import com.todolist.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TaskController {
    
    public void save(Task task) {
        String sql = "INSERT INTO tasks ("
                + "idProject,"
                + "name,"
                + "description, "
                + "completed, "
                + "notes, "
                + "deadline, "
                + "createdAt, "
                + "updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new java.sql.Date(task.getDeadline().getTime()));
            statement.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new java.sql.Date(task.getUpdatedAt().getTime()));
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar a tarefa " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
    }
    
    public void update(Task task) {
            String sql = "UPDATE tasks SET "
            + "idProject = ?, "
            + "name = ?, "
            + "description = ?,  "
            + "completed = ?, "
            + "notes = ?, "
            + "deadline = ?, "
            + "createdAt = ?, "
            + "updatedAt = ?"
            + "WHERE id = ?";
            
            Connection conn = null;
            PreparedStatement statement = null;
            
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setBoolean(4, task.isCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6, new java.sql.Date(task.getDeadline().getTime()));
            statement.setDate(7, new java.sql.Date(task.getCreatedAt().getTime()));
            statement.setDate(8, new java.sql.Date(task.getUpdatedAt().getTime()));
            statement.setInt(9, task.getId());
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar a tarefa" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
    }
    
    public void removeById(int taskId) {
        String sql = "DELETE FROM tasks WHERE id = ?";
        
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar a tarefa" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement);
        }
    }
    
    public List<Task> getAll(int idProject) {
        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        
        List<Task> tasks = new ArrayList<Task>();
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql);
            statement.setInt(1, idProject);            
            rs = statement.executeQuery();
            
            while (rs.next()) {
                Task task = new Task();               
                
                task.setId(rs.getInt("id"));
                task.setIdProject(rs.getInt("idProject"));
                task.setName(rs.getString("name"));
                task.setDescription(rs.getString("description"));
                task.setIsCompleted(rs.getBoolean("completed"));
                task.setNotes(rs.getString("notes"));
                task.setDeadline(rs.getDate("deadline"));
                task.setCreatedAt(rs.getDate("createdAt"));
                task.setUpdatedAt(rs.getDate("updatedAt"));
                
                tasks.add(task);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar tarefas" + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(conn, statement, rs);
        }
        
        return tasks;
    }
    
}
