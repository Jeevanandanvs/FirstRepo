package com.example.demo;

import java.io.*;
public class OpenApp {

public static void main(String[] args) throws IOException, InterruptedException {
	
	Runtime run = Runtime.getRuntime();
	String browser = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
	String[] pName = {"chrome.exe","calc.exe","notepad.exe","explorer.exe"};
	for(int i=0;i<5;i++) {
		run.exec(new String[]{browser,"youtube.com","google.com","spring.io"});
	    Thread.sleep(5000);
	    Process process = Runtime.getRuntime().exec("taskkill /F /IM " + pName[0]);
        process.waitFor();
        Thread.sleep(10000);
        
		run.exec("calc");
		Thread.sleep(5000);
		Process process1 = Runtime.getRuntime().exec("taskkill /F /IM " + pName[1]);
        process1.waitFor();
        Thread.sleep(10000);

	    run.exec("notepad");
	    Thread.sleep(5000);
	    Process process2 = Runtime.getRuntime().exec("taskkill /F /IM " + pName[2]);
        process2.waitFor();
        Thread.sleep(10000);
	    
	    run.exec("Explorer");
	    Thread.sleep(5000);
	    Process process3= Runtime.getRuntime().exec("taskkill /F /IM " + pName[3]);
        process3.waitFor();
        Thread.sleep(10000);	    

	}
   }
}