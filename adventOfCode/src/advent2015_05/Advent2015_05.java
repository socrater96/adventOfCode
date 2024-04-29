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
	static boolean condicion4(String linea){
		for(int i=0;i<linea.length()-3;i++) {
			for(int j=i+2;j<linea.length()-1;j++){
				if(linea.charAt(i)==linea.charAt(j)&&linea.charAt(i+1)==linea.charAt(j+1))
					return true;
			}
		}
		return false;
	}
	
	static boolean condicion5(String linea) {
		for(int i=0;i<linea.length()-2;i++) {
			if(linea.charAt(i)==linea.charAt(i+2)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String [] args) {
		int cc=0;
		int cc2=0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("cadenas.txt"));
			String linea="";	
			while((linea=br.readLine())!=null) {
				if(condicion1(linea)&&condicion2(linea)&&condicion3(linea)) {
					cc++;
					System.out.println(linea+"\t"+cc);
				}
				if(condicion4(linea)&&condicion5(linea)) {
					cc2++;
					System.out.println(linea+"\t"+cc2);
				}
			}
			br.close();
		}catch(IOException e) {}
		System.out.println("primera parte: "+cc);
		System.out.println("segunda parte: "+cc2);
	}
}
