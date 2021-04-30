package com;

import java.io.IOException;

public class MainClass {
	public static void main(String args[]) throws IOException{
		OutputClass output = new OutputClass();
		InputClass input = new InputClass();
		output.printUserChoices();
		input.choiceMethod();
	}
}
