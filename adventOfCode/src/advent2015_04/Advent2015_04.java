package advent2015_04;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Advent2015_04 {
	

	public static String getMD5(String input) {
	        try {
	            MessageDigest md = MessageDigest.getInstance("MD5");
	            byte[] messageDigest = md.digest(input.getBytes());
	            BigInteger number = new BigInteger(1, messageDigest);
	            String hashtext = number.toString(16);
	
	            while (hashtext.length() < 32) {
	                hashtext = "0" + hashtext;
	            }
	            return hashtext;
	        } catch (NoSuchAlgorithmException e) {
	            throw new RuntimeException(e);
	        }
	    }
		
		public static void main(String []args) {
			String input = "yzbqklnj";
			int numero=0;
			String compuesto="";
			while(!getMD5(compuesto).substring(0,5).equals("00000")) {
				compuesto=input+numero;
				numero++;
			}
			System.out.println("parte 1: "+numero);
			numero=0;
			while(!getMD5(compuesto).substring(0,6).equals("000000")) {
				compuesto=input+numero;
				numero++;
			}
			System.out.println("parte 2: "+numero);
		}
	}

