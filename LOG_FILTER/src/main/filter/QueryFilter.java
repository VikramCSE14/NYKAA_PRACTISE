package main.filter;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import main.utils.BufferReaderUtil;

public class QueryFilter {

	public static void getParticularQueryStringCount(String queryString, String logFilePath, String uniqueStringToIdentifyQueryLine) throws Exception {

		getQueryStringCount(queryString, queryString.length(), logFilePath, uniqueStringToIdentifyQueryLine);
	}

	
	
	
	public static void getQueryStringCount(String stringQueryStartsFrom, int queryStartingCharactersCount, String logFilePath, String uniqueStringToIdentifyQueryLine) throws Exception {

		Map<String, Integer> queryMap = new HashMap<>();
		
		BufferedReader f_reader = BufferReaderUtil.readFile(logFilePath);
		String line;
		while ((line = f_reader.readLine()) != null) {

			if (line.contains(uniqueStringToIdentifyQueryLine)) {
				int index = line.toUpperCase().indexOf(stringQueryStartsFrom.toUpperCase());
				if (index != -1) {
					String query = line.substring(index, index + queryStartingCharactersCount);
					queryMap.put(query, (queryMap.get(query) == null ? 1 : queryMap.get(query) + 1));
				}
			}
		}
		f_reader.close();
		
		Map<String, Integer> sortedMap = queryMap.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("\'" + stringQueryStartsFrom + "\' string occurence are as follows:\n");
		
		for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " =  " + entry.getValue());
		}
		
		System.out.println("\n\n");
		
	}

}
