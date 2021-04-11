package com;

import java.io.IOException;
import java.util.*;

public class ChoicesClass {
	public static void displayMethod() throws IOException {
		
		System.out.println();
		
		System.out.println("Enter your choice below...(1 - 5)");

		System.out.println("1. Add new task");
		System.out.println("2. Change task's priority");
		System.out.println("3. Display all task");
		System.out.println("4. Mark it as completed");
		System.out.println("5. Display all completed tasks");
		System.out.println("6. Delete task");

		System.out.println();
		
		Scanner obj = new Scanner(System.in);
		int choice = obj.nextInt();

		switch (choice) {
		case 1: {
			OutputClass op = new OutputClass();
			op.createTask();
			break;
		}
		case 2: {
			TaskCard taskObj = new TaskCard();
			taskObj.changePriority();
			break;
		}
		case 3: {
			TaskCard taskObj = new TaskCard();
			taskObj.getAllTask();
			break;
		}
		case 4: {
			TaskCard taskObj = new TaskCard();
			taskObj.taskStatusMethod();
			break;
		}
		case 5: {
			TaskCard taskObj = new TaskCard();
			taskObj.getAllCompletedTask();
			break;
		}
		case 6: {
			TaskCard taskObj = new TaskCard();
			taskObj.deleteTaskMethod();
			break;
		}
		default:{
			System.out.println("Invalid choice!");
			displayMethod();
			break;
		}
		}
	}
}
