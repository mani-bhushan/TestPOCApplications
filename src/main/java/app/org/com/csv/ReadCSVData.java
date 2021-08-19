package app.org.com.csv;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class ReadCSVData {
	

    private static final String CSV_FILE_PATH = "C:\\Users\\root@manish\\Workspace\\eclipse-workspace\\TestPOCApplications\\src\\main\\resources\\results_comma_seperator.csv";
    private static final String CSV_FILE_CUSTOM_SEPARATOR = "C:\\Users\\root@manish\\Workspace\\eclipse-workspace\\TestPOCApplications\\src\\main\\resources\\results_semicolon_Separator.csv";
 
	public static void main(String[] args) {

		System.out.println("Read Data Line by Line With Header \n");
		readDataLineByLine(CSV_FILE_PATH);
		System.out.println("_______________________________________________");

		System.out.println("Read All Data at Once and Hide the Header also \n");
		readAllDataAtOnce(CSV_FILE_PATH);
		System.out.println("_______________________________________________");

		System.out.println("Custom Separator here semi-colon\n");
		readDataFromCustomSeparator(CSV_FILE_CUSTOM_SEPARATOR);
		System.out.println("_______________________________________________");
	}
 
	public static void readDataLineByLine(String file) {

		try {

			// Create an object of filereader class
			// with CSV file as a parameter.
			FileReader filereader = new FileReader(file);

			// create csvReader object passing
			// filereader as parameter
			CSVReader csvReader = new CSVReader(filereader);
			String[] nextRecord;

			// we are going to read data line by line
			while ((nextRecord = csvReader.readNext()) != null) {
				for (String cell : nextRecord) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
			csvReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
 
	public static void readAllDataAtOnce(String file) {
		try {

			// Create an object of filereader class
			// with CSV file as a parameter.
			FileReader filereader = new FileReader(file);

			// create csvReader object
			// and skip first Line
			CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
			List<String[]> allData = csvReader.readAll();

			// print Data
			for (String[] row : allData) {
				for (String cell : row) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	public static void readDataFromCustomSeparator(String file) {
		try {
			// Create object of filereader
			// class with csv file as parameter.
			FileReader filereader = new FileReader(file);

			// create csvParser object with
			// custom separator semi-colon
			CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

			// create csvReader object with
			// parameter filereader and parser
			CSVReader csvReader = new CSVReaderBuilder(filereader).withCSVParser(parser).build();

			// Read all data at once
			List<String[]> allData = csvReader.readAll();

			// print Data
			for (String[] row : allData) {
				for (String cell : row) {
					String tabs =  getTabs(cell);
					System.out.print(cell + tabs);
				}
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getTabs(String str) {
		int tab = str.length()/4;
		String tabs = "\t";
		//if (tab == 0) {return "\t";}
		for (int i=0; i<tab; i++) {
			tabs += "\t";
		}
		return tabs;
	}

}
