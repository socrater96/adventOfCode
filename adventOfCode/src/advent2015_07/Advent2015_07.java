package advent2015_07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Advent2015_07 {
	static String input(){
		String input="NOT dq -> dr\n"
				+ "kg OR kf -> kh\n"
				+ "ep OR eo -> eq\n"
				+ "44430 -> b\n"
				+ "NOT gs -> gt\n"
				+ "dd OR do -> dp\n"
				+ "eg AND ei -> ej\n"
				+ "y AND ae -> ag\n"
				+ "jx AND jz -> ka\n"
				+ "lf RSHIFT 2 -> lg\n"
				+ "z AND aa -> ac\n"
				+ "dy AND ej -> el\n"
				+ "bj OR bi -> bk\n"
				+ "kk RSHIFT 3 -> km\n"
				+ "NOT cn -> co\n"
				+ "gn AND gp -> gq\n"
				+ "cq AND cs -> ct\n"
				+ "eo LSHIFT 15 -> es\n"
				+ "lg OR lm -> ln\n"
				+ "dy OR ej -> ek\n"
				+ "NOT di -> dj\n"
				+ "1 AND fi -> fj\n"
				+ "kf LSHIFT 15 -> kj\n"
				+ "NOT jy -> jz\n"
				+ "NOT ft -> fu\n"
				+ "fs AND fu -> fv\n"
				+ "NOT hr -> hs\n"
				+ "ck OR cl -> cm\n"
				+ "jp RSHIFT 5 -> js\n"
				+ "iv OR jb -> jc\n"
				+ "is OR it -> iu\n"
				+ "ld OR le -> lf\n"
				+ "NOT fc -> fd\n"
				+ "NOT dm -> dn\n"
				+ "bn OR by -> bz\n"
				+ "aj AND al -> am\n"
				+ "cd LSHIFT 15 -> ch\n"
				+ "jp AND ka -> kc\n"
				+ "ci OR ct -> cu\n"
				+ "gv AND gx -> gy\n"
				+ "de AND dk -> dm\n"
				+ "x RSHIFT 5 -> aa\n"
				+ "et RSHIFT 2 -> eu\n"
				+ "x RSHIFT 1 -> aq\n"
				+ "ia OR ig -> ih\n"
				+ "bk LSHIFT 1 -> ce\n"
				+ "y OR ae -> af\n"
				+ "NOT ca -> cb\n"
				+ "e AND f -> h\n"
				+ "ia AND ig -> ii\n"
				+ "ck AND cl -> cn\n"
				+ "NOT jh -> ji\n"
				+ "z OR aa -> ab\n"
				+ "1 AND en -> eo\n"
				+ "ib AND ic -> ie\n"
				+ "NOT eh -> ei\n"
				+ "iy AND ja -> jb\n"
				+ "NOT bb -> bc\n"
				+ "ha OR gz -> hb\n"
				+ "1 AND cx -> cy\n"
				+ "NOT ax -> ay\n"
				+ "ev OR ew -> ex\n"
				+ "bn RSHIFT 2 -> bo\n"
				+ "er OR es -> et\n"
				+ "eu OR fa -> fb\n"
				+ "jp OR ka -> kb\n"
				+ "ea AND eb -> ed\n"
				+ "k AND m -> n\n"
				+ "et RSHIFT 3 -> ev\n"
				+ "et RSHIFT 5 -> ew\n"
				+ "hz RSHIFT 1 -> is\n"
				+ "ki OR kj -> kk\n"
				+ "NOT h -> i\n"
				+ "lv LSHIFT 15 -> lz\n"
				+ "as RSHIFT 1 -> bl\n"
				+ "hu LSHIFT 15 -> hy\n"
				+ "iw AND ix -> iz\n"
				+ "lf RSHIFT 1 -> ly\n"
				+ "fp OR fv -> fw\n"
				+ "1 AND am -> an\n"
				+ "ap LSHIFT 1 -> bj\n"
				+ "u LSHIFT 1 -> ao\n"
				+ "b RSHIFT 5 -> f\n"
				+ "jq AND jw -> jy\n"
				+ "iu RSHIFT 3 -> iw\n"
				+ "ih AND ij -> ik\n"
				+ "NOT iz -> ja\n"
				+ "de OR dk -> dl\n"
				+ "iu OR jf -> jg\n"
				+ "as AND bd -> bf\n"
				+ "b RSHIFT 3 -> e\n"
				+ "jq OR jw -> jx\n"
				+ "iv AND jb -> jd\n"
				+ "cg OR ch -> ci\n"
				+ "iu AND jf -> jh\n"
				+ "lx -> a\n"
				+ "1 AND cc -> cd\n"
				+ "ly OR lz -> ma\n"
				+ "NOT el -> em\n"
				+ "1 AND bh -> bi\n"
				+ "fb AND fd -> fe\n"
				+ "lf OR lq -> lr\n"
				+ "bn RSHIFT 3 -> bp\n"
				+ "bn AND by -> ca\n"
				+ "af AND ah -> ai\n"
				+ "cf LSHIFT 1 -> cz\n"
				+ "dw OR dx -> dy\n"
				+ "gj AND gu -> gw\n"
				+ "jg AND ji -> jj\n"
				+ "jr OR js -> jt\n"
				+ "bl OR bm -> bn\n"
				+ "gj RSHIFT 2 -> gk\n"
				+ "cj OR cp -> cq\n"
				+ "gj OR gu -> gv\n"
				+ "b OR n -> o\n"
				+ "o AND q -> r\n"
				+ "bi LSHIFT 15 -> bm\n"
				+ "dy RSHIFT 1 -> er\n"
				+ "cu AND cw -> cx\n"
				+ "iw OR ix -> iy\n"
				+ "hc OR hd -> he\n"
				+ "0 -> c\n"
				+ "db OR dc -> dd\n"
				+ "kk RSHIFT 2 -> kl\n"
				+ "eq LSHIFT 1 -> fk\n"
				+ "dz OR ef -> eg\n"
				+ "NOT ed -> ee\n"
				+ "lw OR lv -> lx\n"
				+ "fw AND fy -> fz\n"
				+ "dz AND ef -> eh\n"
				+ "jp RSHIFT 3 -> jr\n"
				+ "lg AND lm -> lo\n"
				+ "ci RSHIFT 2 -> cj\n"
				+ "be AND bg -> bh\n"
				+ "lc LSHIFT 1 -> lw\n"
				+ "hm AND ho -> hp\n"
				+ "jr AND js -> ju\n"
				+ "1 AND io -> ip\n"
				+ "cm AND co -> cp\n"
				+ "ib OR ic -> id\n"
				+ "NOT bf -> bg\n"
				+ "fo RSHIFT 5 -> fr\n"
				+ "ip LSHIFT 15 -> it\n"
				+ "jt AND jv -> jw\n"
				+ "jc AND je -> jf\n"
				+ "du OR dt -> dv\n"
				+ "NOT fx -> fy\n"
				+ "aw AND ay -> az\n"
				+ "ge LSHIFT 15 -> gi\n"
				+ "NOT ak -> al\n"
				+ "fm OR fn -> fo\n"
				+ "ff AND fh -> fi\n"
				+ "ci RSHIFT 5 -> cl\n"
				+ "cz OR cy -> da\n"
				+ "NOT ey -> ez\n"
				+ "NOT ju -> jv\n"
				+ "NOT ls -> lt\n"
				+ "kk AND kv -> kx\n"
				+ "NOT ii -> ij\n"
				+ "kl AND kr -> kt\n"
				+ "jk LSHIFT 15 -> jo\n"
				+ "e OR f -> g\n"
				+ "NOT bs -> bt\n"
				+ "hi AND hk -> hl\n"
				+ "hz OR ik -> il\n"
				+ "ek AND em -> en\n"
				+ "ao OR an -> ap\n"
				+ "dv LSHIFT 1 -> ep\n"
				+ "an LSHIFT 15 -> ar\n"
				+ "fo RSHIFT 1 -> gh\n"
				+ "NOT im -> in\n"
				+ "kk RSHIFT 1 -> ld\n"
				+ "hw LSHIFT 1 -> iq\n"
				+ "ec AND ee -> ef\n"
				+ "hb LSHIFT 1 -> hv\n"
				+ "kb AND kd -> ke\n"
				+ "x AND ai -> ak\n"
				+ "dd AND do -> dq\n"
				+ "aq OR ar -> as\n"
				+ "iq OR ip -> ir\n"
				+ "dl AND dn -> do\n"
				+ "iu RSHIFT 5 -> ix\n"
				+ "as OR bd -> be\n"
				+ "NOT go -> gp\n"
				+ "fk OR fj -> fl\n"
				+ "jm LSHIFT 1 -> kg\n"
				+ "NOT cv -> cw\n"
				+ "dp AND dr -> ds\n"
				+ "dt LSHIFT 15 -> dx\n"
				+ "et RSHIFT 1 -> fm\n"
				+ "dy RSHIFT 3 -> ea\n"
				+ "fp AND fv -> fx\n"
				+ "NOT p -> q\n"
				+ "dd RSHIFT 2 -> de\n"
				+ "eu AND fa -> fc\n"
				+ "ba AND bc -> bd\n"
				+ "dh AND dj -> dk\n"
				+ "lr AND lt -> lu\n"
				+ "he RSHIFT 1 -> hx\n"
				+ "ex AND ez -> fa\n"
				+ "df OR dg -> dh\n"
				+ "fj LSHIFT 15 -> fn\n"
				+ "NOT kx -> ky\n"
				+ "gk OR gq -> gr\n"
				+ "dy RSHIFT 2 -> dz\n"
				+ "gh OR gi -> gj\n"
				+ "lj AND ll -> lm\n"
				+ "x OR ai -> aj\n"
				+ "bz AND cb -> cc\n"
				+ "1 AND lu -> lv\n"
				+ "as RSHIFT 3 -> au\n"
				+ "ce OR cd -> cf\n"
				+ "il AND in -> io\n"
				+ "dd RSHIFT 1 -> dw\n"
				+ "NOT lo -> lp\n"
				+ "c LSHIFT 1 -> t\n"
				+ "dd RSHIFT 3 -> df\n"
				+ "dd RSHIFT 5 -> dg\n"
				+ "lh AND li -> lk\n"
				+ "lf RSHIFT 5 -> li\n"
				+ "dy RSHIFT 5 -> eb\n"
				+ "NOT kt -> ku\n"
				+ "at OR az -> ba\n"
				+ "x RSHIFT 3 -> z\n"
				+ "NOT lk -> ll\n"
				+ "lb OR la -> lc\n"
				+ "1 AND r -> s\n"
				+ "lh OR li -> lj\n"
				+ "ln AND lp -> lq\n"
				+ "kk RSHIFT 5 -> kn\n"
				+ "ea OR eb -> ec\n"
				+ "ci AND ct -> cv\n"
				+ "b RSHIFT 2 -> d\n"
				+ "jp RSHIFT 1 -> ki\n"
				+ "NOT cr -> cs\n"
				+ "NOT jd -> je\n"
				+ "jp RSHIFT 2 -> jq\n"
				+ "jn OR jo -> jp\n"
				+ "lf RSHIFT 3 -> lh\n"
				+ "1 AND ds -> dt\n"
				+ "lf AND lq -> ls\n"
				+ "la LSHIFT 15 -> le\n"
				+ "NOT fg -> fh\n"
				+ "at AND az -> bb\n"
				+ "au AND av -> ax\n"
				+ "kw AND ky -> kz\n"
				+ "v OR w -> x\n"
				+ "kk OR kv -> kw\n"
				+ "ks AND ku -> kv\n"
				+ "kh LSHIFT 1 -> lb\n"
				+ "1 AND kz -> la\n"
				+ "NOT kc -> kd\n"
				+ "x RSHIFT 2 -> y\n"
				+ "et OR fe -> ff\n"
				+ "et AND fe -> fg\n"
				+ "NOT ac -> ad\n"
				+ "jl OR jk -> jm\n"
				+ "1 AND jj -> jk\n"
				+ "bn RSHIFT 1 -> cg\n"
				+ "NOT kp -> kq\n"
				+ "ci RSHIFT 3 -> ck\n"
				+ "ev AND ew -> ey\n"
				+ "1 AND ke -> kf\n"
				+ "cj AND cp -> cr\n"
				+ "ir LSHIFT 1 -> jl\n"
				+ "NOT gw -> gx\n"
				+ "as RSHIFT 2 -> at\n"
				+ "iu RSHIFT 1 -> jn\n"
				+ "cy LSHIFT 15 -> dc\n"
				+ "hg OR hh -> hi\n"
				+ "ci RSHIFT 1 -> db\n"
				+ "au OR av -> aw\n"
				+ "km AND kn -> kp\n"
				+ "gj RSHIFT 1 -> hc\n"
				+ "iu RSHIFT 2 -> iv\n"
				+ "ab AND ad -> ae\n"
				+ "da LSHIFT 1 -> du\n"
				+ "NOT bw -> bx\n"
				+ "km OR kn -> ko\n"
				+ "ko AND kq -> kr\n"
				+ "bv AND bx -> by\n"
				+ "kl OR kr -> ks\n"
				+ "1 AND ht -> hu\n"
				+ "df AND dg -> di\n"
				+ "NOT ag -> ah\n"
				+ "d OR j -> k\n"
				+ "d AND j -> l\n"
				+ "b AND n -> p\n"
				+ "gf OR ge -> gg\n"
				+ "gg LSHIFT 1 -> ha\n"
				+ "bn RSHIFT 5 -> bq\n"
				+ "bo OR bu -> bv\n"
				+ "1 AND gy -> gz\n"
				+ "s LSHIFT 15 -> w\n"
				+ "NOT ie -> if\n"
				+ "as RSHIFT 5 -> av\n"
				+ "bo AND bu -> bw\n"
				+ "hz AND ik -> im\n"
				+ "bp AND bq -> bs\n"
				+ "b RSHIFT 1 -> v\n"
				+ "NOT l -> m\n"
				+ "bp OR bq -> br\n"
				+ "g AND i -> j\n"
				+ "br AND bt -> bu\n"
				+ "t OR s -> u\n"
				+ "hz RSHIFT 5 -> ic\n"
				+ "gk AND gq -> gs\n"
				+ "fl LSHIFT 1 -> gf\n"
				+ "he RSHIFT 3 -> hg\n"
				+ "gz LSHIFT 15 -> hd\n"
				+ "hf OR hl -> hm\n"
				+ "1 AND gd -> ge\n"
				+ "fo OR fz -> ga\n"
				+ "id AND if -> ig\n"
				+ "fo AND fz -> gb\n"
				+ "gr AND gt -> gu\n"
				+ "he OR hp -> hq\n"
				+ "fq AND fr -> ft\n"
				+ "ga AND gc -> gd\n"
				+ "fo RSHIFT 2 -> fp\n"
				+ "gl OR gm -> gn\n"
				+ "hg AND hh -> hj\n"
				+ "NOT hn -> ho\n"
				+ "gl AND gm -> go\n"
				+ "he RSHIFT 5 -> hh\n"
				+ "NOT gb -> gc\n"
				+ "hq AND hs -> ht\n"
				+ "hz RSHIFT 3 -> ib\n"
				+ "hz RSHIFT 2 -> ia\n"
				+ "fq OR fr -> fs\n"
				+ "hx OR hy -> hz\n"
				+ "he AND hp -> hr\n"
				+ "gj RSHIFT 5 -> gm\n"
				+ "hf AND hl -> hn\n"
				+ "hv OR hu -> hw\n"
				+ "NOT hj -> hk\n"
				+ "gj RSHIFT 3 -> gl\n"
				+ "fo RSHIFT 3 -> fq\n"
				+ "he RSHIFT 2 -> hf";
		return input;
	}
	static String aBinario(int decimal) {
		String binario="";
		while(decimal!=0) {
			if(decimal%2==0)
				binario="0"+binario;
			else
				binario="1"+binario;
			decimal=decimal/2;
		}
		return binario;
	}
	static int aDecimal(String binario) {
		int decimal=0;
		int posicion=0;
		for(int i=binario.length()-1;i>=0;i--) {
			int valorBinario=binario.charAt(i)-'0';
			decimal += (int) valorBinario*Math.pow(2, posicion);
			posicion++;
		}
		return decimal;
	}
	static int opAND(int n1, int n2) {
		String bin1=aBinario(n1);
		String bin2=aBinario(n2);
		String binR="";
		if(bin1.length()>bin2.length()) {
			bin2="0".repeat(bin1.length()-bin2.length())+bin2;
		}
		if(bin2.length()>bin1.length()) {
			bin1="0".repeat(bin2.length()-bin1.length())+bin1;
		}
		for(int i=0;i<bin1.length();i++) {
			if(bin1.charAt(i)==0 || bin2.charAt(i)==0) {
				binR+="0";
			}
			else
				binR+="1";
		}
		return aDecimal(binR);
	}
	static int opOR(int n1, int n2) {
		String bin1=aBinario(n1);
		String bin2=aBinario(n2);
		String binR="";
		if(bin1.length()>bin2.length()) {
			bin2="0".repeat(bin1.length()-bin2.length())+bin2;
		}
		if(bin2.length()>bin1.length()) {
			bin1="0".repeat(bin2.length()-bin1.length())+bin1;
		}
		for(int i=0;i<bin1.length();i++) {
			if(bin1.charAt(i)==1 || bin2.charAt(i)==1) {
				binR+="1";
			}
			else
				binR+="0";
		}
		return aDecimal(binR);
	}
	static int opXOR(int n1, int n2) {
		String bin1=aBinario(n1);
		String bin2=aBinario(n2);
		String binR="";
		if(bin1.length()>bin2.length()) {
			bin2="0".repeat(bin1.length()-bin2.length())+bin2;
		}
		if(bin2.length()>bin1.length()) {
			bin1="0".repeat(bin2.length()-bin1.length())+bin1;
		}
		for(int i=0;i<bin1.length();i++) {
			if(bin1.charAt(i)!=bin2.charAt(i)) {
				binR+="1";
			}
			else
				binR+="0";
		}
		return aDecimal(binR);
	}
	static int opNOT(int n1) {
		String bin1=aBinario(n1);
		String binR="";
		for(int i=0;i<bin1.length();i++) {
			if(bin1.charAt(i)==0)
				binR+="1";
			else
				binR+="0";
		}
		return aDecimal(binR);
	}
	static int opLSHIFT(int n1, int n2) {
		String bin1=aBinario(n1);
		String binR=bin1+"0".repeat(n2);
		return aDecimal(binR);
	}
	static int opRSHIFT(int n1,int n2) {
		String bin1=aBinario(n1);
		String binR="";
		for(int i=0;i<bin1.length()-1-n2;i++) {
			binR+=bin1.charAt(i);
		}
		return aDecimal(binR);
	}
	public static boolean isParsableToInt(String str) {
	        if (str == null || str.isEmpty()) {
	            return false;
	        }

	        try {
	            Integer.parseInt(str);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	public static boolean tieneValor(Map<String, Senhal> senhales, String circuito) {
	        Senhal senhal = senhales.get(circuito);
	        return senhal != null && senhal.hasValue();
	    }
	public static Senhal encontrarSenhal(Map<String, Senhal> senhales, String nombre) {
        return senhales.get(nombre);
    }
	public static void main(String []args) {
		String input = input();
		String[] inputArray=input.split("\n");
		Map<String, Senhal> senhales = new HashMap<>();
		for(String linea: inputArray) {
			String[] parts = linea.split(" ");
			if(parts.length==3) {
				senhales.put(parts[2], new Senhal(parts[2],Integer.parseInt(parts[0])));
			}
			else if(parts[0].equals("NOT")&&senhales.containsKey(parts[1])) {
				senhales.put(parts[3], new Senhal(parts[3],~Integer.parseInt(parts[1])));
			}
			if(senhales.containsKey(parts[0])&&senhales.containsKey(parts[2])||isParsableToInt(parts[2])) {
				Senhal senhal1 = senhales.get(parts[0]);
				
				switch(parts[1]) {
					case "AND":
						Senhal senhal2 = senhales.get(parts[2]);
						senhales.put(parts[4], new Senhal(parts[4],(senhal1.getValor())&senhal2.getValor()));
						break;
					case "OR":
						Senhal senhal3 = senhales.get(parts[2]);
						senhales.put(parts[4], new Senhal(parts[4],(senhal1.getValor() | senhal3.getValor())));
						break;
					case "RSHIFT":
						senhales.put(parts[4], new Senhal(parts[4],(senhal1.getValor()>>Integer.parseInt(parts[2]))));
						break;
					case "LSHIFT":
						senhales.put(parts[4], new Senhal(parts[4],(senhal1.getValor()<<Integer.parseInt(parts[2]))));
					
				}
				
			}
		}
		System.out.println(senhales.get("a"));
			/*
			if(parts.length==3&&isParsableToInt(parts[0])) {
				senhales.put(parts[2], new Senhal(parts[2], Integer.parseInt(parts[0])));
			}
			else if(parts[0].equals("NOT")&&tieneValor(senhales,parts[1])) {
				Senhal senhal1 = encontrarSenhal(senhales, parts[1]);
                Senhal target = encontrarSenhal(senhales, parts[3]);
                if (!target.hasValue()) {
                    target.setValor(opNOT(senhal1.getValor()));
                }
			
			if(parts[0].equals("1") && tieneValor(senhales,parts[2])) {
				senhales.put(parts[2], new Senhal(parts[2], Integer.parseInt(parts[0])));
			}
			if(tieneValor(senhales,parts[0])||isParsableToInt(parts[0]) && tieneValor(senhales,parts[2])) {
				Senhal senhal1=encontrarSenhal(senhales, parts[0]);
				Senhal senhal2=encontrarSenhal(senhales, parts[2]);
				switch(parts[1]) {
					case "AND":	
						senhales.add(new Senhal(parts[4],opAND(senhal1.getValor(),senhal2.getValor())));
						break;
					case "OR":
						senhales.add(new Senhal(parts[4],opOR(senhal1.getValor(),senhal2.getValor())));
				}
			}
			
			if(tieneValor(senhales, parts[0])&&parts[1].equals("RSHIT")) {
				Senhal senhal1=encontrarSenhal(senhales, parts[0]);
				senhales.add(new Senhal(parts[4],opRSHIFT(senhal1.getValor(),Integer.parseInt(parts[2]))));
			}
			if(tieneValor(senhales, parts[0])&&parts[1].equals("LSHIT")) {
				Senhal senhal1=encontrarSenhal(senhales, parts[0]);
				senhales.add(new Senhal(parts[4],opLSHIFT(senhal1.getValor(),Integer.parseInt(parts[2]))));
			}*/
		
			
	
	}
	
	
}
