package main.filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import exceptions.ReadAndWriteExceptions;
import main.utils.BufferReaderUtil;

public class TaskIDFilter {

	public static void getLogsOfTaskID(String taskID, String logFilePath) throws Exception
	{

		Map<String, Integer> queryMap = new HashMap<>();

		BufferedReader br = BufferReaderUtil.readFile(logFilePath);
		
		
		String line;
		while ((line = br.readLine()) != null) {

			if (line.contains("task-"+taskID)) 
				System.out.println(line);
		}
	
	}
	
	public static void saveLogsOfTaskID(String taskID, String sourceLogFilePath , String destinationLogFilePath) throws Exception
	{

		if(!Files.exists(Paths.get(sourceLogFilePath)) && !Files.exists(Paths.get(destinationLogFilePath)))		
			throw new ReadAndWriteExceptions("The source and destination log file paths provided by you do not exist in the system. Please provide  valid paths. ");
		else if(!Files.exists(Paths.get(sourceLogFilePath)))
			throw new ReadAndWriteExceptions("The source log file path provided by you does not exist in the system. Please provide a valid path. ");
		else if(!Files.exists(Paths.get(destinationLogFilePath))) 
			throw new ReadAndWriteExceptions("The destination log file paths provided by you does not exist in the system. Please provide a valid path. ");
		
		Map<String, Integer> queryMap = new HashMap<>();
		
		BufferedReader f_reader = BufferReaderUtil.readFile(sourceLogFilePath);
		BufferedWriter f_writer = new BufferedWriter(new FileWriter(destinationLogFilePath));
		
		
		String line;
		while ((line = f_reader.readLine()) != null) {

			if (line.contains("task-"+taskID))
			{
				f_writer.write(line);
				f_writer.newLine();
			}	
				
		}
		System.out.println("Logs for task-" + taskID + " saved successfully in mentioned destination folder path.");
		f_reader.close();
		f_writer.close();
		
	}

	
}
