package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output.txt");
		
		try(fos) {
			
			byte[] bs = new byte[26];
			
			byte data = 65;
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data++;
			}
			
			fos.write(bs, 2, 9);
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		System.out.println("end");
		
	}

}
