package com.example.demo;

import java.io.IOException;

public class CloseApplicationExample {
    public static void main(String[] args) {
        // Name of the application process to close (e.g., "notepad.exe")
        String processName = "chrome.exe";

        try {
            // Execute the taskkill command to terminate the process
            Process process = Runtime.getRuntime().exec("taskkill /F /IM " + processName);
            process.waitFor();

            int exitCode = process.exitValue();
            if (exitCode == 0) {
                System.out.println("Application closed successfully!");
            } else {
                System.err.println("Failed to close the application. Exit code: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Failed to close the application: " + e.getMessage());
        }
    }
}






