import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class WorkWithFiles {

		public static void FindCharWordWspase(String fileNameFrom) throws FileNotFoundException {
		File file = new File(fileNameFrom);
		Scanner in = new Scanner(file);
		int charsCount=0;
		int wordsCount=0;
		int whitespasesCount=0;
		int countLines=-1;
		
		while(in.hasNextLine()) {
			
			String line=in.nextLine();
			String ReplaceAll=line.replaceAll("\\s+", "");
			charsCount+=ReplaceAll.length();
			wordsCount+=line.split(" ").length;

		for(char c : line.toCharArray()) {
				if(Character.isWhitespace(c)) whitespasesCount++;
			}
		countLines++;
		
		}
		if(countLines>0) {
			whitespasesCount+=countLines;
		}
		in.close();
	
		System.out.println("Number of chars: "+charsCount);
		System.out.println("Number of words: "+wordsCount);
		System.out.println("Number of whitespases: "+whitespasesCount);
	
		
	}
		public static void Search(String fileNameFrom, String fileNameTo, String foundword) throws IOException {
			File file = new File(fileNameFrom);
			Scanner in = new Scanner(file);
			ArrayList<String> lines = new ArrayList<String>();
		
			while(in.hasNextLine()) {
				lines.add(in.nextLine());
			}

			in.close();
			
			try(FileWriter writer = new FileWriter(fileNameTo, false))
	        {
	         
				for (int i = 0; i < lines.size(); i++) {
					if(lines.get(i).contains(foundword)) {
						 writer.write(i+1+"."+lines.get(i));writer.append('\n');
					}
					
				}
	            writer.flush();
	        }
	        catch(IOException ex){
	             
	            System.out.println(ex.getMessage());
	        }
	
			
		}
	public static void main(String[] args) throws IOException {
		String fileNameFrom="C://Users//38067//Desktop//ZrobioneZadanieSamodzielne//java//testFrom.txt";
		String fileNameTo="C://Users//38067//Desktop//ZrobioneZadanieSamodzielne//java//testTo.txt";
		String word="egzamin";
		FindCharWordWspase(fileNameFrom);
		Search(fileNameFrom,fileNameTo,word);

	}

		
	}


