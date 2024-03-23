package Demo1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DemoFile{
	public static void main(String[] args) throws Exception
	{
		FileOutputStream obj=new FileOutputStream("/home/student/Desktop/Salma/hello1/myfile.txt");
		System.out.println("File created");
	}
}


