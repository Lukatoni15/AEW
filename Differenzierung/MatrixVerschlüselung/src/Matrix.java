
public class Matrix 
{
	private static String [][] matrix = new String[6][5];
	
	public static void main(String args[])
	{
		String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String data = "Das ist ein Test";
		encode(data);
	}
	
	public static void decode()
	{
		
	}
	
	public static void encode(String data)
	{
		System.out.print(createMatrix(data));
	}
	
	public static int[] createMatrix(String data)
	{
		int[] encodeCode 	= new int[data.length()];
		int currentLength 	= 0;
		for(char c : data.toCharArray())
		{
			
			for(int i = 0; i < matrix.length; i++)
			{
				
				for(int j = 0; j < matrix[i].length; j++)
				{
					System.out.print("vsdzub");
					if(contains(c))
					{
						j--;
					}
					else
					{
						matrix[i][j] = Character.toString(c);
						encodeCode[currentLength] = Integer.parseInt(i + "" + j);
						currentLength++;
					}
				}
			}
		}
		
		return encodeCode;
	}
	
	public static boolean contains(char c)
	{
		for(String[] ele : matrix)
		{
			
			for(String mc : ele)
			{
				if(mc != null && mc.contains(Character.toString(c)))
				{
					return true;
				}
			}
		}
		return false;
	}
	
}
