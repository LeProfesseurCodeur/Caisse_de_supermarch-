
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		FruitLegume a = new FruitLegume("cerise", 4.5f, 500f);
		System.out.println(a);
		
		Emballe e = new Emballe("gateau", "AAAA", 1.25f);
		System.out.println(e);
		
		 List<String[]> csvRead = readFromCsvFile(";","");
		            System.out.println(csvRead.size());
		            
		            for(Iterator it=csvRead.iterator(); it.hasNext();)
		            	
		            	
		
	}
	 public static List<String[]> readFromCsvFile(String separator, String fileName){
         try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
             List<String[]> list = new ArrayList<>();
             String line = "";
             while((line = reader.readLine()) != null){
                 String[] array = line.split(separator);
                 list.add(array);
             }
             return list;
         } catch (IOException e) {
             e.printStackTrace();
             return null;
         } 
     }
   

}
