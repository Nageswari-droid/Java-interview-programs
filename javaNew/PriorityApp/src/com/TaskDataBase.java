package com;

public class TaskDataBase implements TaskDB, Comparable<TaskDataBase>{
	
	String name;
	String creator;
	String status;
	String assignee;
	int priority;
	long taskId;

	public TaskDataBase(String name, int priority, String creator, String assignee, String status, long taskId) {
		this.name = name;
		this.priority = priority;
		this.assignee = assignee;
		this.creator = creator;
		this.status = status;
		this.taskId = taskId;
	}
	
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}
	
	public long getTaskId() {
		return taskId;
	}
	
	public void setTask(String name) {
		this.name = name;
	}
	
	public String getTask() {
		return name;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	public String getCreator() {
		return creator;
	}
	
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	
	public String getAssignee() {
		return assignee;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public int compareTo(TaskDataBase compareTask) {
	    
        int comparePriority = ((TaskDataBase) compareTask).getPriority(); 
        return this.priority - comparePriority;
        
    }
}
