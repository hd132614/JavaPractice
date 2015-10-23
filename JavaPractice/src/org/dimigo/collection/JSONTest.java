/**
 * 
 */
package org.dimigo.collection;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * <pre>
 * org.dimigo.collection
 *   |_ JSONTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 12.
 * </pre>
 *
 * @author		: 이름
 * @version		: 1.0
 */
public class JSONTest {

	private static final String FILE_PATH = "C:/java_workspace/JavaClass/src/org/dimigo/collection/json_input.txt";
	
	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
					
			String result;
			StringBuilder jsonString = new StringBuilder();
					
			// 1 라인씩 읽어오기
			while((result = br.readLine()) != null) {
				jsonString.append(result);
			}
			
			System.out.println(jsonString);
			
			// JSON String을 Parsing하여 Person 객체에 담기
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}	

}
