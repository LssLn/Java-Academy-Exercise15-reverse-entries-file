import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class main_specchiatxt {
//Creare un file.txt che stampi all'interno il contenuto di nomi_italiani.txt al contrario
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		String myFile="";
		//Scrittura
		try {
            File file = new File(myFile);
            FileReader fr=new FileReader(file); 
            BufferedReader br=new BufferedReader(fr);  
            String fileContent = "";
            while((fileContent=br.readLine())!=null) {  list.add(fileContent);	}
        }catch(IOException e) {
        	System.out.println("\nFile non trovato: \n"+e.getStackTrace());
        }
		
		//Collections.reverse(list);
		
		myFile="";
		try {
            File file = new File(myFile);
    		file.createNewFile();

            FileWriter fw=new FileWriter(file); 
            BufferedWriter bw=new BufferedWriter(fw);  
            
            for(String l: list) {
            	String inversa= new StringBuffer(l).reverse().toString();
                bw.write(inversa+"\n");
                bw.flush();
            }
        }catch(IOException e) {
        	System.out.println("\nFile non trovato: \n"+e.getStackTrace());
        }
		
	}

}
