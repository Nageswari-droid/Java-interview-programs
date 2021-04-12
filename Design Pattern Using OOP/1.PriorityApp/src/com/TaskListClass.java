package com;

import java.util.*;

public class TaskListClass {

	static List<TaskDataBase> taskList = new ArrayList<>();

	public static void addList(TaskDataBase db) {
		taskList.add(db);
		Collections.sort(taskList);
	}
}