package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OutputClass {

	Scanner obj = new Scanner(System.in);

	String taskName = "";
	String creatorName = "";
	String assigneeName = "";
	String status = "In progress";
	int priority = 0;
	long taskId;

	long min = 1000;
	long max = 10000;
	Random random = new Random();

	public void createTask() throws IOException {

		taskId = min + ((long) (random.nextDouble() * (max - min)));

		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your Task, Priority, Creator name, Assignee...");
		System.out.print("Task : ");
		taskName = stdin.readLine();
		System.out.println("Priority : (1 - 3)");
		priority = obj.nextInt();
		System.out.print("Creator Name : ");
		creatorName = stdin.readLine();
		System.out.print("Assignee : ");
		assigneeName = stdin.readLine();

		TaskDataBase db = new TaskDataBase(taskName, priority, creatorName, assigneeName, status, taskId);
		db.setTaskId(taskId);
		db.setTask(taskName);
		db.setPriority(priority);
		db.setCreator(creatorName);
		db.setAssignee(assigneeName);
		db.setStatus(status);
		TaskListClass.addList(db);

		System.out.println("Task stored successfully! Stored task card id is " + taskId);

		System.out.println("Do you want to add one more task?(Y/N)");
		char choice = obj.next().charAt(0);

		if (choice == 'Y' || choice == 'y') {
			createTask();
		} else if (choice == 'N' || choice == 'n') {
			ChoicesClass.displayMethod();
		}

		stdin.close();
	}
}
