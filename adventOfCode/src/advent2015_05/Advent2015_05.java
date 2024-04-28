package advent2015_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Advent2015_05 {
	static boolean condicion1(String linea) {//que haya al menos tres vocales en el String
		int cc=0;
		for(int i=0;i<linea.length();i++) {
			if(linea.charAt(i)=='a'||linea.charAt(i)=='e'||linea.charAt(i)=='i'||linea.charAt(i)=='o'||linea.charAt(i)=='u') {
				cc++;
				if(cc==3)
					return true;
			}
		}
		return false;
	}
	static boolean condicion2(String linea) {//que haya al menos una letra que se repita en el caracter siguiente
		for(int i=0;i<linea.length()-1;i++) {
			if(linea.charAt(i)==linea.charAt(i+1))
				return true;
			}
		return false;
	}
	static boolean condicion3(String linea) {//que no se den las combinaciones "ab", "cd","pq" o "xy"
			for(int i=0;i<linea.length()-1;i++) {
				if(linea.charAt(i)=='a' && linea.charAt(i+1)=='b'||
					linea.charAt(i)=='c' && linea.charAt(i+1)=='d'||
					linea.charAt(i)=='p' && linea.charAt(i+1)=='q'||
					linea.charAt(i)=='x' && linea.charAt(i+1)=='y') {
					return false;
				}
			}	
		return true;
	}
	public static void main(String [] args) {
		int cc=0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("cadenas.txt"));
			String linea="";	
			while((linea=br.readLine())!=null) {
				if(condicion1(linea)&&condicion2(linea)&&condicion3(linea)) {
					cc++;
					System.out.println(linea+"\t"+cc);
				}
			}
		}catch(IOException e) {}
		System.out.println(cc);
	}
}
