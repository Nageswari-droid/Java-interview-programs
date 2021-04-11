package com;

import java.io.IOException;
import java.util.*;

public class TaskCard {

	List<TaskDataBase> list = TaskListClass.taskList;
	static List<TaskDataBase> completedList = new ArrayList<>();

	Scanner obj = new Scanner(System.in);

	public void changePriority() throws IOException {
		System.out.println("Enter task id : ");
		int id = obj.nextInt();
		int flag = 0;

		for (int i = 0; i < list.size(); i++) {
			TaskDataBase objVar = list.get(i);

			if (objVar.getTaskId() == id) {
				flag = 1;
				System.out.println("Do you want to change the priority?(Y/N)");
				char choice = obj.next().charAt(0);

				if (choice == 'Y' || choice == 'y') {
					System.out.println("Enter new priority:");
					int priority = obj.nextInt();

					objVar.setPriority(priority);
					System.out.println("Updated!!");

					Collections.sort(list);

					ChoicesClass.displayMethod();
				}

				else if (choice == 'N' || choice == 'n') {
					System.out.println("Choose some other option based on your need!");
					ChoicesClass.displayMethod();
				} else {
					System.out.println("Invalid choice!");
					ChoicesClass.displayMethod();
				}
			}
		}

		if (flag == 0) {
			System.out.println("Task id not found!");
			ChoicesClass.displayMethod();
		}
	}

	public void taskStatusMethod() throws IOException {

		System.out.println("Enter task id : ");
		int id = obj.nextInt();
		int flag = 0;

		for (int i = 0; i < list.size(); i++) {
			TaskDataBase objVar = list.get(i);

			if (objVar.getTaskId() == id) {
				flag = 1;
				System.out.println("Do you want to change the status to completed?(Y/N)");
				char choice = obj.next().charAt(0);

				if (choice == 'Y' || choice == 'y') {
					objVar.setStatus("Completed");
					completedList.add(objVar);
					list.remove(i);

					System.out.println("Status completed successfully!!");

					ChoicesClass.displayMethod();
				} else if (choice == 'N' || choice == 'n') {
					System.out.println("Choose some other option based on your need!");
					ChoicesClass.displayMethod();
				}
			}
		}

		if (flag == 0) {
			System.out.println("Task id not found!");
			ChoicesClass.displayMethod();
		}
	}

	public void getAllTask() throws IOException {
		if (list.size() > 0 || completedList.size() > 0) {
			System.out.println("Task Cards....");
			if (list.size() > 0) {
				System.out.println("In progress tasks : ");
				for (int i = 0; i < list.size(); i++) {
					TaskDataBase objVar = list.get(i);
					System.out.println("");
					System.out.println("Task Id : " + objVar.getTaskId());
					System.out.println("Task Name : " + objVar.getTask());
					System.out.println("Task Created by " + objVar.getCreator());
					System.out.println("Task Assigned to " + objVar.getAssignee());
					System.out.println("Task status : " + objVar.getStatus());
					System.out.println("Task priority : " + objVar.getPriority());
					System.out.println("");
				}
				
				if(completedList.size() == 0) {
					ChoicesClass.displayMethod();
				}
			}
			if (completedList.size() > 0) {
				getAllCompletedTask();
			}
		} else {
			System.out.println("No tasks found!!");
			ChoicesClass.displayMethod();
		}
	}

	public void getAllCompletedTask() throws IOException {		
		if (completedList.size() > 0) {
			System.out.println("Completed tasks : ");
			for (int i = 0; i < completedList.size(); i++) {
				TaskDataBase objVar = completedList.get(i);
				System.out.println("");
				System.out.println("Task Id : " + objVar.getTaskId());
				System.out.println("Task Name : " + objVar.getTask());
				System.out.println("Task Created by " + objVar.getCreator());
				System.out.println("Task Assigned to " + objVar.getAssignee());
				System.out.println("Task status : " + objVar.getStatus());
				System.out.println("Task priority : " + objVar.getPriority());
				System.out.println("");
			}

			ChoicesClass.displayMethod();
		} else {
			System.out.println("No task is completed!");
			ChoicesClass.displayMethod();
		}
	}

	public void deleteCompletedTask() throws IOException {
		System.out.println("Enter task id:");
		int id = obj.nextInt();
		int flag = 0;

		if (completedList.size() > 0) {
			for (int i = 0; i < completedList.size(); i++) {
				TaskDataBase objVar = completedList.get(i);

				if (objVar.getTaskId() == id) {
					flag = 1;
					completedList.remove(i);
					System.out.print("Deleted Successfully!!");
					
					ChoicesClass.displayMethod();
				}
			}

			if (flag == 0) {
				System.out.println("Task id not found in completed card... Check in progress card");
				System.out.println("Do you want to continue?(Y/N)");
				char choice = obj.next().charAt(0);

				if (choice == 'Y' || choice == 'y') {
					deleteTaskMethod();
				} else if (choice == 'N' || choice == 'n') {
					System.out.println("Thank you!");
					ChoicesClass.displayMethod();
				} else {
					System.out.println("Invalid choice!");
					ChoicesClass.displayMethod();
				}
			}
		} else {
			System.out.println("No task is found in completed card!");
			System.out.println("Do you want to change?(Y/N)");

			char choice = obj.next().charAt(0);

			if (choice == 'Y' || choice == 'y') {
				deleteTaskMethod();
			} else if (choice == 'N' || choice == 'n') {
				System.out.println("Thank you!");
				ChoicesClass.displayMethod();
			} else {
				System.out.println("Invalid choice!");
				ChoicesClass.displayMethod();
			}
		}
	}

	public void deleteProgressTask() throws IOException {
		System.out.println("Enter task id:");
		int id = obj.nextInt();
		int flag = 0;

		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				TaskDataBase objVar = list.get(i);

				if (objVar.getTaskId() == id) {
					flag = 1;
					list.remove(i);
					System.out.print("Deleted Successfully!!");
					
					ChoicesClass.displayMethod();
				}
			}

			if (flag == 0) {
				System.out.println("Task id not found in progress card... Check in completed card");
				System.out.println("Do you want to continue?(Y/N)");
				char choice = obj.next().charAt(0);

				if (choice == 'Y' || choice == 'y') {
					deleteTaskMethod();
				} else if (choice == 'N' || choice == 'n') {
					System.out.println("Thank you!");
					ChoicesClass.displayMethod();
				} else {
					System.out.println("Invalid choice!");
					ChoicesClass.displayMethod();
				}
			}
		} else {
			System.out.println("No task is found in progess card!");
			System.out.println("Do you want to change?(Y/N)");

			char choice = obj.next().charAt(0);

			if (choice == 'Y' || choice == 'y') {
				deleteTaskMethod();
			} else if (choice == 'N' || choice == 'n') {
				System.out.println("Thank you!");
				ChoicesClass.displayMethod();
			} else {
				System.out.println("Invalid choice!");
				ChoicesClass.displayMethod();
			}
		}

	}

	public void deleteTaskMethod() throws IOException {
		if (completedList.size() > 0 || list.size() > 0) {
			System.out.println("Select any one of the options..(Completed tasks / Progress tasks)");
			System.out.println("1. In progress tasks");
			System.out.println("2. Completed tasks");

			int choice = obj.nextInt();

			switch (choice) {
				case 1: {
					deleteProgressTask();
					break;
				}
				case 2: {
					deleteCompletedTask();
					break;
				}
				default: {
					System.out.println("Invalid choice");
					ChoicesClass.displayMethod();
				}
			}
		}
		else {
			System.out.println("Task cards are empty... Create new task!!");
			ChoicesClass.displayMethod();
		}
	}

}
