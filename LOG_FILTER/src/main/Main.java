package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import main.filter.TaskIDFilter;

public class Main {

	public static void main(String[] args){

	try {		//Comment added for main branch
			//QueryFilter.getQueryCount("SELECT " , 30 , "C:/Users/vikram.yadav/Downloads/eRetailWeblog.txt", "Hibernate:");
			//QueryFilter.getParticularQueryStringCount("SELECT  COUNT(DISTINCT obd.ObC" , "SELECT  COUNT(DISTINCT obd.ObC".length() , "C:/Users/vikram.yadav/Downloads/eRetailWeblog.txt", "Hibernate:");
			//QueryFilter.getQueryCount("UPDATE " , 30 , "C:/Users/vikram.yadav/Downloads/eRetailWeblog.txt", "Hibernate:");
			//QueryFilter.getQueryCount("INSERT " , 30 , "C:/Users/vikram.yadav/Downloads/eRetailWeblog.txt", "Hibernate:");
			//QueryFilter.getParticularQueryStringCount("SELECT  COUNT(DISTINCT obd.ObC " , 30 , "C:/Users/vikram.yadav/Downloads/eRetailWeblog.txt", "Hibernate:");
			//QueryFilter.getQueryStringCount("SELECT " , 30 , "C:/Users/vikram.yadav/Downloads/logtest.txt" , "Hibernate:");
			//QueryFilter.getParticularQueryStringCount("SELECT  COUNT(DISTINCT obd.ObC"  , "C:/Users/vikram.yadav/Downloads/logtest.txt" , "Hibernate:");
			//TaskIDFilter.getLogsOfTaskID("154" ,"C:/Users/vikram.yadav/Downloads/eRetailWeblog.txt");
			  TaskIDFilter.saveLogsOfTaskID("154" ,"C:/Users/vikram.yadav/Downloads/eRetailWeblog.txt", "z:/Users/vikram.yadav/Downloads/taskId_154_logs_1.txt");
	 
	} catch (Exception e) {
		 System.out.println(e.getMessage());
	 }

	
	
	}
	

		
}
