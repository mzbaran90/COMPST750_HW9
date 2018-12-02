import static org.junit.Assert.*;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnit {
	
	String numInfile, numOutfile, numInfile2, numOutfile2;  
	Scanner scr1, scr2;
	PrintWriter pw1, pw2;
	
	
	@Before
	
	public void setUp() throws Exception {
		numInfile = "numberSortInfile.txt";
		numOutfile = "numbersSortOutfile.txt";
		numInfile2 = "numberSortInfile2.txt";
		numOutfile2 = "numbersSortOutfile2.txt";
		scr1 = new Scanner(new File(numOutfile));
		scr2 = new Scanner(new File(numOutfile2));
		
		
		
				
	}
	
	@After
	
	public void tearDown() {
		numInfile = null;
		numOutfile = null;
		numInfile2 = null;
		numOutfile2 = null;
		scr1 = null;
		scr2 = null;
		
	}
	
	
	
	@Test
	public void sortNumbers() {
		
		String projectedContents1 = "-6\n1\n2\n7\n10\n99\n";
		String outputContents1 = "";
		String outputContents2 = "";
		
		FileIO.sortNumbers(numInfile, numOutfile);
		
		while(scr1.hasNextLine()) {
			String line = scr1.nextLine();
			outputContents1 = outputContents1 + line +"\n";
			
			
		}
		assertTrue(projectedContents1.equals(outputContents1));
		
		
		
		String projectedContents2 = "-3\n50\n100\n102\n300\n1001\n";
		
		FileIO.sortNumbers(numInfile2, numOutfile2);
		
		while(scr2.hasNextLine()) {
			String line = scr2.nextLine();
			outputContents2 = outputContents2 + line +"\n";
			
			
		}
		
		assertTrue(projectedContents2.equals(outputContents2));
		
		
		
		
		
	}

}

