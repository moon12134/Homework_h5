import java.io.*;
public class Sample5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
			
			String str1 =br.readLine();
			String str2 =br.readLine();
			System.out.println("�g�J���ɮפ�����Ӧr��O");
			System.out.println(str1);
			System.out.println(str2);
			
			br.close();
		}
		
		catch(IOException e) 
		{
			System.out.println("��X�J���~");
		}

	}

}
