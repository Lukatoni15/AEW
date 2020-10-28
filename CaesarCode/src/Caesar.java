import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Caesar 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		dataNoFile();
	}
	
	public static void dataFromFile() throws FileNotFoundException
	{
		File myObj = new File("H:\\Desktop\\Input.txt");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) 
		{
			String data = myReader.nextLine();
			data = data.toLowerCase();
			System.out.println(decode(7, data));
		}
		myReader.close();
	}
	
	public static void dataNoFile()
	{
		String data = "DPY NYLPMLU TVYNLU HU!";
		data = data.toLowerCase();
		System.out.println(decode(7, data));
	}
	
	public static String decode(int move, String data)
	{
		int max = 122;
		int min = 97;		
		String dec = "";
		for(char ch: data.toCharArray()) 
		{
			int ascii = (int) ch;
			if(ascii <= max && ascii >= min)
			{
				ascii -= move;
				while(ascii < min)
				{
					ascii += 26;
				}
				dec += Character.toString((char) ascii);
			}
			else
			{
				dec += ch; 
			}
		}
		return dec;
	}
}