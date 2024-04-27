package advent2015_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Advent2015_05 {
	static boolean condicion1(String linea) {
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
	static boolean condicion2(String linea) {
		for(int i=0;i<linea.length()-1;i++) {
			for(int j=1;j<linea.length();j++) {
				if(linea.charAt(i)==linea.charAt(j)) {
					return true;
				}
			}
		}
		return true;
	}
	static boolean condicion3(String linea) {
			for(int i=0;i<linea.length()-1;i++) {
				for(int j=1;j<linea.length();j++) {
					if(linea.charAt(i)=='a' && linea.charAt(j)=='b'||
						linea.charAt(i)=='c' && linea.charAt(j)=='d'||
						linea.charAt(i)=='p' && linea.charAt(j)=='q'||
						linea.charAt(i)=='x' && linea.charAt(j)=='y') {
						return false;
					}
				}	
			}
		return true;
	}
	public static void main(String [] args) {
		int cc=0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("stringsBonitos.txt"));
			boolean condicion=false;
			String linea="";
			
			while((linea=br.readLine())!=null) {
				if(condicion1(linea)&&condicion2(linea)&&condicion3(linea)) {
					cc++;
				}
			}
		}catch(IOException e) {}
		System.out.println(cc);
	}
}
