package main.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReaderUtil {

	public static BufferedReader readFile(String filePath) throws Exception 
	{	
		File file = new File(filePath);

		BufferedReader br = new BufferedReader(new FileReader(file));
		
		return br ;
	}
}
