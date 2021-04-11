package com;

public interface TaskDB {
	 
	String name = "";
	String creator = "";
	String status = "";
	String assignee = "";
	int priority = 0;
	long taskId = 0;
	
	public static void setTaskId(long taskId) {}
	
	public static long getTaskId() {
		return taskId;
	}
	
	public static void setTask(String name) {}
	
	public static String getTask() {
		return name;
	}
	
	public static void setPriority(int priority) {}
	
	public static int getPriority() {
		return priority;
	}
	
	public static void setCreator(String creator) {}
	
	public static String getCreator() {
		return creator;
	}
	
	public static void setAssignee(String assignee) {}
	
	public static String getAssignee() {
		return assignee;
	}
	
	public static void setStatus(String status) {}
	
	public static String getStatus() {
		return status;
	}
}
