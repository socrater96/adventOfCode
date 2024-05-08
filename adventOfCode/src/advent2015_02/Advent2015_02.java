package advent2015_02;

public class Advent2015_02 {
	static int minimo(int n1, int n2, int n3) {
		return Math.min(Math.min(n1, n2), n3);
	}
	static void parte1(String input) {
		String[] inputArray = input.split("\r\n");
		int total=0;
		for (String regalo: inputArray) {
			int l=Integer.parseInt(regalo.split("x")[0]);
			int w=Integer.parseInt(regalo.split("x")[1]);
			int h=Integer.parseInt(regalo.split("x")[2]);
			total+=2*l*w + 2*w*h + 2*h*l+minimo(l*w,l*h,w*h);
		}
		System.out.print("Total papel: "+total);
	}
	static void parte2(String input) {
		String[] inputArray = input.split("\r\n");
		int total=0;
		for (String regalo: inputArray) {
			int l=Integer.parseInt(regalo.split("x")[0]);
			int w=Integer.parseInt(regalo.split("x")[1]);
			int h=Integer.parseInt(regalo.split("x")[2]);
			total+=h*l*w+minimo(2*l+2*h,2*w+2*h,2*l+2*w);
		}
		System.out.print("Total cinta: "+total);
	}
	public static void main (String[]args) {
		String input="3x11x24\r\n"
				+ "13x5x19\r\n"
				+ "1x9x27\r\n"
				+ "24x8x21\r\n"
				+ "6x8x17\r\n"
				+ "19x18x22\r\n"
				+ "10x9x12\r\n"
				+ "12x2x5\r\n"
				+ "26x6x11\r\n"
				+ "9x23x15\r\n"
				+ "12x8x17\r\n"
				+ "13x29x10\r\n"
				+ "28x18x6\r\n"
				+ "22x28x26\r\n"
				+ "1x5x11\r\n"
				+ "29x26x12\r\n"
				+ "8x28x29\r\n"
				+ "27x4x21\r\n"
				+ "12x7x16\r\n"
				+ "7x4x23\r\n"
				+ "15x24x8\r\n"
				+ "15x14x2\r\n"
				+ "11x6x29\r\n"
				+ "28x19x9\r\n"
				+ "10x3x1\r\n"
				+ "5x20x13\r\n"
				+ "10x25x1\r\n"
				+ "22x17x7\r\n"
				+ "16x29x3\r\n"
				+ "18x22x8\r\n"
				+ "18x11x19\r\n"
				+ "21x24x20\r\n"
				+ "4x7x17\r\n"
				+ "22x27x12\r\n"
				+ "1x26x6\r\n"
				+ "5x27x24\r\n"
				+ "29x21x3\r\n"
				+ "25x30x2\r\n"
				+ "21x26x2\r\n"
				+ "10x24x27\r\n"
				+ "10x16x28\r\n"
				+ "18x16x23\r\n"
				+ "6x5x26\r\n"
				+ "19x12x20\r\n"
				+ "6x24x25\r\n"
				+ "11x20x7\r\n"
				+ "4x8x5\r\n"
				+ "2x13x11\r\n"
				+ "11x17x1\r\n"
				+ "13x24x6\r\n"
				+ "22x29x16\r\n"
				+ "4x24x20\r\n"
				+ "10x25x10\r\n"
				+ "12x29x23\r\n"
				+ "23x27x12\r\n"
				+ "11x21x9\r\n"
				+ "13x2x6\r\n"
				+ "15x30x2\r\n"
				+ "8x26x24\r\n"
				+ "24x7x30\r\n"
				+ "22x22x8\r\n"
				+ "29x27x8\r\n"
				+ "28x23x27\r\n"
				+ "13x16x14\r\n"
				+ "9x28x20\r\n"
				+ "21x4x30\r\n"
				+ "21x20x20\r\n"
				+ "11x17x30\r\n"
				+ "9x14x22\r\n"
				+ "20x2x6\r\n"
				+ "10x11x14\r\n"
				+ "1x8x23\r\n"
				+ "23x19x19\r\n"
				+ "26x10x13\r\n"
				+ "21x12x12\r\n"
				+ "25x7x24\r\n"
				+ "1x28x17\r\n"
				+ "20x23x9\r\n"
				+ "2x24x27\r\n"
				+ "20x24x29\r\n"
				+ "1x3x10\r\n"
				+ "5x20x14\r\n"
				+ "25x21x3\r\n"
				+ "15x5x22\r\n"
				+ "14x17x19\r\n"
				+ "27x3x18\r\n"
				+ "29x23x19\r\n"
				+ "14x21x19\r\n"
				+ "20x8x3\r\n"
				+ "22x27x12\r\n"
				+ "24x15x18\r\n"
				+ "9x10x19\r\n"
				+ "29x25x28\r\n"
				+ "14x22x6\r\n"
				+ "4x19x28\r\n"
				+ "4x24x14\r\n"
				+ "17x19x17\r\n"
				+ "7x19x29\r\n"
				+ "28x8x26\r\n"
				+ "7x20x16\r\n"
				+ "11x26x29\r\n"
				+ "2x18x3\r\n"
				+ "12x7x18\r\n"
				+ "11x15x21\r\n"
				+ "24x7x26\r\n"
				+ "2x22x23\r\n"
				+ "2x30x5\r\n"
				+ "1x19x8\r\n"
				+ "15x29x10\r\n"
				+ "15x26x22\r\n"
				+ "20x16x14\r\n"
				+ "25x29x22\r\n"
				+ "3x13x19\r\n"
				+ "1x12x30\r\n"
				+ "3x15x27\r\n"
				+ "19x9x11\r\n"
				+ "30x8x21\r\n"
				+ "26x12x20\r\n"
				+ "11x17x19\r\n"
				+ "17x25x1\r\n"
				+ "19x24x12\r\n"
				+ "30x6x20\r\n"
				+ "11x19x18\r\n"
				+ "18x15x29\r\n"
				+ "18x8x9\r\n"
				+ "25x15x5\r\n"
				+ "15x6x26\r\n"
				+ "13x27x19\r\n"
				+ "23x24x12\r\n"
				+ "3x15x28\r\n"
				+ "17x10x10\r\n"
				+ "15x4x7\r\n"
				+ "15x27x7\r\n"
				+ "21x8x11\r\n"
				+ "9x18x2\r\n"
				+ "7x20x20\r\n"
				+ "17x23x12\r\n"
				+ "2x19x1\r\n"
				+ "7x26x26\r\n"
				+ "13x23x8\r\n"
				+ "10x3x12\r\n"
				+ "11x1x9\r\n"
				+ "1x11x19\r\n"
				+ "25x14x26\r\n"
				+ "16x10x15\r\n"
				+ "7x6x11\r\n"
				+ "8x1x27\r\n"
				+ "20x28x17\r\n"
				+ "3x25x9\r\n"
				+ "30x7x5\r\n"
				+ "17x17x4\r\n"
				+ "23x25x27\r\n"
				+ "23x8x5\r\n"
				+ "13x11x1\r\n"
				+ "15x10x21\r\n"
				+ "22x16x1\r\n"
				+ "12x15x28\r\n"
				+ "27x18x26\r\n"
				+ "25x18x5\r\n"
				+ "21x3x27\r\n"
				+ "15x25x5\r\n"
				+ "29x27x19\r\n"
				+ "11x10x12\r\n"
				+ "22x16x21\r\n"
				+ "11x8x18\r\n"
				+ "6x10x23\r\n"
				+ "21x21x2\r\n"
				+ "13x27x28\r\n"
				+ "2x5x20\r\n"
				+ "23x16x20\r\n"
				+ "1x21x7\r\n"
				+ "22x2x13\r\n"
				+ "11x10x4\r\n"
				+ "7x3x4\r\n"
				+ "19x2x5\r\n"
				+ "21x11x1\r\n"
				+ "7x27x26\r\n"
				+ "12x4x23\r\n"
				+ "12x3x15\r\n"
				+ "25x7x4\r\n"
				+ "20x7x15\r\n"
				+ "16x5x11\r\n"
				+ "1x18x26\r\n"
				+ "11x27x10\r\n"
				+ "17x6x24\r\n"
				+ "19x13x16\r\n"
				+ "6x3x11\r\n"
				+ "4x19x18\r\n"
				+ "16x15x15\r\n"
				+ "1x11x17\r\n"
				+ "19x11x29\r\n"
				+ "18x19x1\r\n"
				+ "1x25x7\r\n"
				+ "8x22x14\r\n"
				+ "15x6x19\r\n"
				+ "5x30x18\r\n"
				+ "30x24x22\r\n"
				+ "11x16x2\r\n"
				+ "21x29x19\r\n"
				+ "20x29x11\r\n"
				+ "27x1x18\r\n"
				+ "20x5x30\r\n"
				+ "12x4x28\r\n"
				+ "3x9x30\r\n"
				+ "26x20x15\r\n"
				+ "18x25x18\r\n"
				+ "20x28x28\r\n"
				+ "21x5x3\r\n"
				+ "20x21x25\r\n"
				+ "19x27x22\r\n"
				+ "8x27x9\r\n"
				+ "1x5x15\r\n"
				+ "30x6x19\r\n"
				+ "16x5x15\r\n"
				+ "18x30x21\r\n"
				+ "4x15x8\r\n"
				+ "9x3x28\r\n"
				+ "18x15x27\r\n"
				+ "25x11x6\r\n"
				+ "17x22x15\r\n"
				+ "18x12x18\r\n"
				+ "14x30x30\r\n"
				+ "1x7x23\r\n"
				+ "27x21x12\r\n"
				+ "15x7x18\r\n"
				+ "16x17x24\r\n"
				+ "11x12x19\r\n"
				+ "18x15x21\r\n"
				+ "6x18x15\r\n"
				+ "2x21x4\r\n"
				+ "12x9x14\r\n"
				+ "19x7x25\r\n"
				+ "22x3x1\r\n"
				+ "29x19x7\r\n"
				+ "30x25x7\r\n"
				+ "6x27x27\r\n"
				+ "5x13x9\r\n"
				+ "21x4x18\r\n"
				+ "13x1x16\r\n"
				+ "11x21x25\r\n"
				+ "27x20x27\r\n"
				+ "14x25x9\r\n"
				+ "23x11x15\r\n"
				+ "22x10x26\r\n"
				+ "15x16x4\r\n"
				+ "14x16x21\r\n"
				+ "1x1x24\r\n"
				+ "17x27x3\r\n"
				+ "25x28x16\r\n"
				+ "12x2x29\r\n"
				+ "9x19x28\r\n"
				+ "12x7x17\r\n"
				+ "6x9x19\r\n"
				+ "15x14x24\r\n"
				+ "25x21x23\r\n"
				+ "26x27x25\r\n"
				+ "7x18x13\r\n"
				+ "15x10x6\r\n"
				+ "22x28x2\r\n"
				+ "15x2x14\r\n"
				+ "3x24x18\r\n"
				+ "30x22x7\r\n"
				+ "18x27x17\r\n"
				+ "29x18x7\r\n"
				+ "20x2x4\r\n"
				+ "4x20x26\r\n"
				+ "23x30x15\r\n"
				+ "5x7x3\r\n"
				+ "4x24x12\r\n"
				+ "24x30x20\r\n"
				+ "26x18x17\r\n"
				+ "6x28x3\r\n"
				+ "29x19x29\r\n"
				+ "14x10x4\r\n"
				+ "15x5x23\r\n"
				+ "12x25x4\r\n"
				+ "7x15x19\r\n"
				+ "26x21x19\r\n"
				+ "18x2x23\r\n"
				+ "19x20x3\r\n"
				+ "3x13x9\r\n"
				+ "29x21x24\r\n"
				+ "26x13x29\r\n"
				+ "30x27x4\r\n"
				+ "20x10x29\r\n"
				+ "21x18x8\r\n"
				+ "7x26x10\r\n"
				+ "29x16x21\r\n"
				+ "22x5x11\r\n"
				+ "17x15x2\r\n"
				+ "7x29x5\r\n"
				+ "6x18x15\r\n"
				+ "23x6x14\r\n"
				+ "10x30x14\r\n"
				+ "26x6x16\r\n"
				+ "24x13x25\r\n"
				+ "17x29x20\r\n"
				+ "4x27x19\r\n"
				+ "28x12x11\r\n"
				+ "23x20x3\r\n"
				+ "22x6x20\r\n"
				+ "29x9x19\r\n"
				+ "10x16x22\r\n"
				+ "30x26x4\r\n"
				+ "29x26x11\r\n"
				+ "2x11x15\r\n"
				+ "1x3x30\r\n"
				+ "30x30x29\r\n"
				+ "9x1x3\r\n"
				+ "30x13x16\r\n"
				+ "20x4x5\r\n"
				+ "23x28x11\r\n"
				+ "24x27x1\r\n"
				+ "4x25x10\r\n"
				+ "9x3x6\r\n"
				+ "14x4x15\r\n"
				+ "4x5x25\r\n"
				+ "27x14x13\r\n"
				+ "20x30x3\r\n"
				+ "28x15x25\r\n"
				+ "5x19x2\r\n"
				+ "10x24x29\r\n"
				+ "29x30x18\r\n"
				+ "30x1x25\r\n"
				+ "7x7x15\r\n"
				+ "1x13x16\r\n"
				+ "23x18x4\r\n"
				+ "1x28x8\r\n"
				+ "24x11x8\r\n"
				+ "22x26x19\r\n"
				+ "30x30x14\r\n"
				+ "2x4x13\r\n"
				+ "27x20x26\r\n"
				+ "16x20x17\r\n"
				+ "11x12x13\r\n"
				+ "28x2x17\r\n"
				+ "15x26x13\r\n"
				+ "29x15x25\r\n"
				+ "30x27x9\r\n"
				+ "2x6x25\r\n"
				+ "10x26x19\r\n"
				+ "16x8x23\r\n"
				+ "12x17x18\r\n"
				+ "26x14x22\r\n"
				+ "13x17x4\r\n"
				+ "27x27x29\r\n"
				+ "17x13x22\r\n"
				+ "9x8x3\r\n"
				+ "25x15x20\r\n"
				+ "14x13x16\r\n"
				+ "8x7x13\r\n"
				+ "12x4x21\r\n"
				+ "27x16x15\r\n"
				+ "6x14x5\r\n"
				+ "28x29x17\r\n"
				+ "23x17x25\r\n"
				+ "10x27x28\r\n"
				+ "1x28x21\r\n"
				+ "18x2x30\r\n"
				+ "25x30x16\r\n"
				+ "25x21x7\r\n"
				+ "2x3x4\r\n"
				+ "9x6x13\r\n"
				+ "19x6x10\r\n"
				+ "28x17x8\r\n"
				+ "13x24x28\r\n"
				+ "24x12x7\r\n"
				+ "5x19x5\r\n"
				+ "18x10x27\r\n"
				+ "16x1x6\r\n"
				+ "12x14x30\r\n"
				+ "1x2x28\r\n"
				+ "23x21x2\r\n"
				+ "13x3x23\r\n"
				+ "9x22x10\r\n"
				+ "10x17x2\r\n"
				+ "24x20x11\r\n"
				+ "30x6x14\r\n"
				+ "28x1x16\r\n"
				+ "24x20x1\r\n"
				+ "28x7x7\r\n"
				+ "1x24x21\r\n"
				+ "14x9x7\r\n"
				+ "22x8x15\r\n"
				+ "20x1x21\r\n"
				+ "6x3x7\r\n"
				+ "7x26x14\r\n"
				+ "5x7x28\r\n"
				+ "5x4x4\r\n"
				+ "15x7x28\r\n"
				+ "30x16x23\r\n"
				+ "7x26x2\r\n"
				+ "1x2x30\r\n"
				+ "24x28x20\r\n"
				+ "5x17x28\r\n"
				+ "4x15x20\r\n"
				+ "15x26x2\r\n"
				+ "1x3x23\r\n"
				+ "22x30x24\r\n"
				+ "9x20x16\r\n"
				+ "7x15x2\r\n"
				+ "6x21x18\r\n"
				+ "21x21x29\r\n"
				+ "29x10x10\r\n"
				+ "4x3x23\r\n"
				+ "23x2x18\r\n"
				+ "29x24x14\r\n"
				+ "29x29x16\r\n"
				+ "22x28x24\r\n"
				+ "21x18x24\r\n"
				+ "16x21x6\r\n"
				+ "3x9x22\r\n"
				+ "9x18x4\r\n"
				+ "22x9x9\r\n"
				+ "12x9x13\r\n"
				+ "18x21x14\r\n"
				+ "7x8x29\r\n"
				+ "28x28x14\r\n"
				+ "1x6x24\r\n"
				+ "11x11x3\r\n"
				+ "8x28x6\r\n"
				+ "11x16x10\r\n"
				+ "9x16x16\r\n"
				+ "6x6x19\r\n"
				+ "21x5x12\r\n"
				+ "15x17x12\r\n"
				+ "3x6x29\r\n"
				+ "19x1x26\r\n"
				+ "10x30x25\r\n"
				+ "24x26x21\r\n"
				+ "1x10x18\r\n"
				+ "6x1x16\r\n"
				+ "4x17x27\r\n"
				+ "17x11x27\r\n"
				+ "15x15x21\r\n"
				+ "14x23x1\r\n"
				+ "8x9x30\r\n"
				+ "22x22x25\r\n"
				+ "20x27x22\r\n"
				+ "12x7x9\r\n"
				+ "9x26x19\r\n"
				+ "26x25x12\r\n"
				+ "8x8x16\r\n"
				+ "28x15x10\r\n"
				+ "29x18x2\r\n"
				+ "25x22x6\r\n"
				+ "4x6x15\r\n"
				+ "12x18x4\r\n"
				+ "10x3x20\r\n"
				+ "17x28x17\r\n"
				+ "14x25x13\r\n"
				+ "14x10x3\r\n"
				+ "14x5x10\r\n"
				+ "7x7x22\r\n"
				+ "21x2x14\r\n"
				+ "1x21x5\r\n"
				+ "27x29x1\r\n"
				+ "6x20x4\r\n"
				+ "7x19x23\r\n"
				+ "28x19x27\r\n"
				+ "3x9x18\r\n"
				+ "13x17x17\r\n"
				+ "18x8x15\r\n"
				+ "26x23x17\r\n"
				+ "10x10x13\r\n"
				+ "11x5x21\r\n"
				+ "25x15x29\r\n"
				+ "6x23x24\r\n"
				+ "10x7x2\r\n"
				+ "19x10x30\r\n"
				+ "4x3x23\r\n"
				+ "22x12x6\r\n"
				+ "11x17x16\r\n"
				+ "6x8x12\r\n"
				+ "18x20x11\r\n"
				+ "6x2x2\r\n"
				+ "17x4x11\r\n"
				+ "20x23x22\r\n"
				+ "29x23x24\r\n"
				+ "25x11x21\r\n"
				+ "22x11x15\r\n"
				+ "29x3x9\r\n"
				+ "13x30x5\r\n"
				+ "17x10x12\r\n"
				+ "10x30x8\r\n"
				+ "21x16x17\r\n"
				+ "1x5x26\r\n"
				+ "22x15x16\r\n"
				+ "27x7x11\r\n"
				+ "16x8x18\r\n"
				+ "29x9x7\r\n"
				+ "25x4x17\r\n"
				+ "10x21x25\r\n"
				+ "2x19x21\r\n"
				+ "29x11x16\r\n"
				+ "18x26x21\r\n"
				+ "2x8x20\r\n"
				+ "17x29x27\r\n"
				+ "25x27x4\r\n"
				+ "14x3x14\r\n"
				+ "25x29x29\r\n"
				+ "26x18x11\r\n"
				+ "8x24x28\r\n"
				+ "7x30x24\r\n"
				+ "12x30x22\r\n"
				+ "29x20x6\r\n"
				+ "3x17x1\r\n"
				+ "6x15x14\r\n"
				+ "6x22x20\r\n"
				+ "13x26x26\r\n"
				+ "12x2x1\r\n"
				+ "7x14x12\r\n"
				+ "15x16x11\r\n"
				+ "3x21x4\r\n"
				+ "30x17x29\r\n"
				+ "9x18x27\r\n"
				+ "11x28x16\r\n"
				+ "22x3x25\r\n"
				+ "18x15x15\r\n"
				+ "2x30x12\r\n"
				+ "3x27x22\r\n"
				+ "10x8x8\r\n"
				+ "26x16x14\r\n"
				+ "15x2x29\r\n"
				+ "12x10x7\r\n"
				+ "21x20x15\r\n"
				+ "2x15x25\r\n"
				+ "4x14x13\r\n"
				+ "3x15x13\r\n"
				+ "29x8x3\r\n"
				+ "7x7x28\r\n"
				+ "15x10x24\r\n"
				+ "23x15x5\r\n"
				+ "5x7x14\r\n"
				+ "24x1x22\r\n"
				+ "1x11x13\r\n"
				+ "26x4x19\r\n"
				+ "19x16x26\r\n"
				+ "5x25x5\r\n"
				+ "17x25x14\r\n"
				+ "23x7x14\r\n"
				+ "24x6x17\r\n"
				+ "5x13x12\r\n"
				+ "20x20x5\r\n"
				+ "22x29x17\r\n"
				+ "11x17x29\r\n"
				+ "25x6x4\r\n"
				+ "29x8x16\r\n"
				+ "28x22x24\r\n"
				+ "24x23x17\r\n"
				+ "16x17x4\r\n"
				+ "17x8x25\r\n"
				+ "22x9x13\r\n"
				+ "24x4x8\r\n"
				+ "18x10x20\r\n"
				+ "21x23x21\r\n"
				+ "13x14x12\r\n"
				+ "23x26x4\r\n"
				+ "4x10x29\r\n"
				+ "2x18x18\r\n"
				+ "19x5x21\r\n"
				+ "2x27x23\r\n"
				+ "6x29x30\r\n"
				+ "21x9x20\r\n"
				+ "6x5x16\r\n"
				+ "25x10x27\r\n"
				+ "5x29x21\r\n"
				+ "24x14x19\r\n"
				+ "19x11x8\r\n"
				+ "2x28x6\r\n"
				+ "19x25x6\r\n"
				+ "27x1x11\r\n"
				+ "6x8x29\r\n"
				+ "18x25x30\r\n"
				+ "4x27x26\r\n"
				+ "8x12x1\r\n"
				+ "7x17x25\r\n"
				+ "7x14x27\r\n"
				+ "12x9x5\r\n"
				+ "14x29x13\r\n"
				+ "18x17x5\r\n"
				+ "23x1x3\r\n"
				+ "28x5x13\r\n"
				+ "3x2x26\r\n"
				+ "3x7x11\r\n"
				+ "1x8x7\r\n"
				+ "12x5x4\r\n"
				+ "2x30x21\r\n"
				+ "16x30x11\r\n"
				+ "3x26x4\r\n"
				+ "16x9x4\r\n"
				+ "11x9x22\r\n"
				+ "23x5x6\r\n"
				+ "13x20x3\r\n"
				+ "4x3x2\r\n"
				+ "14x10x29\r\n"
				+ "11x8x12\r\n"
				+ "26x15x16\r\n"
				+ "7x17x29\r\n"
				+ "18x19x18\r\n"
				+ "8x28x4\r\n"
				+ "22x6x13\r\n"
				+ "9x23x7\r\n"
				+ "11x23x20\r\n"
				+ "13x11x26\r\n"
				+ "15x30x13\r\n"
				+ "1x5x8\r\n"
				+ "5x10x24\r\n"
				+ "22x25x17\r\n"
				+ "27x20x25\r\n"
				+ "30x10x21\r\n"
				+ "16x28x24\r\n"
				+ "20x12x8\r\n"
				+ "17x25x1\r\n"
				+ "30x14x9\r\n"
				+ "14x18x6\r\n"
				+ "8x28x29\r\n"
				+ "12x18x29\r\n"
				+ "9x7x18\r\n"
				+ "6x12x25\r\n"
				+ "20x13x24\r\n"
				+ "22x3x12\r\n"
				+ "5x23x22\r\n"
				+ "8x10x17\r\n"
				+ "7x23x5\r\n"
				+ "10x26x27\r\n"
				+ "14x26x19\r\n"
				+ "10x18x24\r\n"
				+ "8x4x4\r\n"
				+ "16x15x11\r\n"
				+ "3x14x9\r\n"
				+ "18x5x30\r\n"
				+ "29x12x26\r\n"
				+ "16x13x12\r\n"
				+ "15x10x7\r\n"
				+ "18x5x26\r\n"
				+ "14x1x6\r\n"
				+ "10x8x29\r\n"
				+ "3x4x9\r\n"
				+ "19x4x23\r\n"
				+ "28x17x23\r\n"
				+ "30x7x17\r\n"
				+ "19x5x9\r\n"
				+ "26x29x28\r\n"
				+ "22x13x17\r\n"
				+ "28x2x1\r\n"
				+ "20x30x8\r\n"
				+ "15x13x21\r\n"
				+ "25x23x19\r\n"
				+ "27x23x1\r\n"
				+ "4x6x23\r\n"
				+ "29x29x24\r\n"
				+ "5x18x7\r\n"
				+ "4x6x30\r\n"
				+ "17x15x2\r\n"
				+ "27x4x2\r\n"
				+ "25x24x14\r\n"
				+ "28x8x30\r\n"
				+ "24x29x5\r\n"
				+ "14x30x14\r\n"
				+ "10x18x19\r\n"
				+ "15x26x22\r\n"
				+ "24x19x21\r\n"
				+ "29x23x27\r\n"
				+ "21x10x16\r\n"
				+ "7x4x29\r\n"
				+ "14x21x3\r\n"
				+ "21x4x28\r\n"
				+ "17x16x15\r\n"
				+ "24x7x13\r\n"
				+ "21x24x15\r\n"
				+ "25x11x16\r\n"
				+ "10x26x13\r\n"
				+ "23x20x14\r\n"
				+ "20x29x27\r\n"
				+ "14x24x14\r\n"
				+ "14x23x12\r\n"
				+ "18x6x5\r\n"
				+ "3x18x9\r\n"
				+ "8x18x19\r\n"
				+ "20x26x15\r\n"
				+ "16x14x13\r\n"
				+ "30x16x3\r\n"
				+ "17x13x4\r\n"
				+ "15x19x30\r\n"
				+ "20x3x8\r\n"
				+ "13x4x5\r\n"
				+ "12x10x15\r\n"
				+ "8x23x26\r\n"
				+ "16x8x15\r\n"
				+ "22x8x11\r\n"
				+ "12x11x18\r\n"
				+ "28x3x30\r\n"
				+ "15x8x4\r\n"
				+ "13x22x13\r\n"
				+ "21x26x21\r\n"
				+ "29x1x15\r\n"
				+ "28x9x5\r\n"
				+ "27x3x26\r\n"
				+ "22x19x30\r\n"
				+ "4x11x22\r\n"
				+ "21x27x20\r\n"
				+ "22x26x7\r\n"
				+ "19x28x20\r\n"
				+ "24x23x16\r\n"
				+ "26x12x9\r\n"
				+ "13x22x9\r\n"
				+ "5x6x23\r\n"
				+ "20x7x2\r\n"
				+ "18x26x30\r\n"
				+ "3x6x28\r\n"
				+ "24x18x13\r\n"
				+ "28x19x16\r\n"
				+ "25x21x25\r\n"
				+ "25x19x23\r\n"
				+ "22x29x10\r\n"
				+ "29x19x30\r\n"
				+ "4x7x27\r\n"
				+ "5x12x28\r\n"
				+ "8x26x6\r\n"
				+ "14x14x25\r\n"
				+ "17x17x2\r\n"
				+ "5x27x11\r\n"
				+ "8x2x2\r\n"
				+ "3x20x24\r\n"
				+ "26x10x9\r\n"
				+ "22x28x27\r\n"
				+ "18x15x20\r\n"
				+ "12x11x1\r\n"
				+ "5x14x30\r\n"
				+ "7x3x16\r\n"
				+ "2x16x16\r\n"
				+ "18x20x15\r\n"
				+ "13x14x29\r\n"
				+ "1x17x12\r\n"
				+ "13x5x23\r\n"
				+ "19x4x10\r\n"
				+ "25x19x11\r\n"
				+ "15x17x14\r\n"
				+ "1x28x27\r\n"
				+ "11x9x28\r\n"
				+ "9x10x18\r\n"
				+ "30x11x22\r\n"
				+ "21x21x20\r\n"
				+ "2x1x5\r\n"
				+ "2x25x1\r\n"
				+ "7x3x4\r\n"
				+ "22x15x29\r\n"
				+ "21x28x15\r\n"
				+ "12x12x4\r\n"
				+ "21x30x6\r\n"
				+ "15x10x7\r\n"
				+ "10x14x6\r\n"
				+ "21x26x18\r\n"
				+ "14x25x6\r\n"
				+ "9x7x11\r\n"
				+ "22x3x1\r\n"
				+ "1x16x27\r\n"
				+ "1x14x23\r\n"
				+ "2x13x8\r\n"
				+ "14x19x11\r\n"
				+ "21x26x1\r\n"
				+ "4x28x13\r\n"
				+ "12x16x20\r\n"
				+ "21x13x9\r\n"
				+ "3x4x13\r\n"
				+ "14x9x8\r\n"
				+ "21x21x12\r\n"
				+ "27x10x17\r\n"
				+ "6x20x6\r\n"
				+ "28x23x23\r\n"
				+ "2x28x12\r\n"
				+ "8x10x10\r\n"
				+ "3x9x2\r\n"
				+ "20x3x29\r\n"
				+ "19x4x16\r\n"
				+ "29x24x9\r\n"
				+ "26x20x8\r\n"
				+ "15x28x26\r\n"
				+ "18x17x10\r\n"
				+ "7x22x10\r\n"
				+ "20x15x9\r\n"
				+ "6x10x8\r\n"
				+ "7x26x21\r\n"
				+ "8x8x16\r\n"
				+ "15x6x29\r\n"
				+ "22x30x11\r\n"
				+ "18x25x8\r\n"
				+ "6x21x20\r\n"
				+ "7x23x25\r\n"
				+ "8x25x26\r\n"
				+ "11x25x27\r\n"
				+ "22x18x23\r\n"
				+ "3x2x14\r\n"
				+ "16x16x1\r\n"
				+ "15x13x11\r\n"
				+ "3x9x25\r\n"
				+ "29x25x24\r\n"
				+ "9x15x1\r\n"
				+ "12x4x1\r\n"
				+ "23x30x20\r\n"
				+ "3x1x23\r\n"
				+ "6x10x29\r\n"
				+ "28x13x24\r\n"
				+ "4x19x17\r\n"
				+ "6x6x25\r\n"
				+ "27x29x17\r\n"
				+ "12x13x2\r\n"
				+ "10x7x13\r\n"
				+ "14x15x8\r\n"
				+ "22x2x3\r\n"
				+ "27x17x19\r\n"
				+ "23x10x16\r\n"
				+ "5x9x25\r\n"
				+ "9x25x14\r\n"
				+ "11x18x6\r\n"
				+ "18x10x12\r\n"
				+ "9x4x15\r\n"
				+ "7x16x14\r\n"
				+ "17x24x10\r\n"
				+ "11x4x6\r\n"
				+ "12x9x17\r\n"
				+ "22x18x12\r\n"
				+ "6x24x24\r\n"
				+ "6x22x23\r\n"
				+ "5x17x30\r\n"
				+ "6x9x5\r\n"
				+ "17x20x10\r\n"
				+ "6x8x12\r\n"
				+ "14x17x13\r\n"
				+ "29x10x17\r\n"
				+ "22x4x5\r\n"
				+ "10x19x30\r\n"
				+ "22x29x11\r\n"
				+ "10x12x29\r\n"
				+ "21x22x26\r\n"
				+ "16x6x25\r\n"
				+ "1x26x24\r\n"
				+ "30x17x16\r\n"
				+ "27x28x5\r\n"
				+ "30x13x22\r\n"
				+ "7x26x12\r\n"
				+ "11x24x30\r\n"
				+ "1x17x25\r\n"
				+ "22x1x3\r\n"
				+ "29x24x6\r\n"
				+ "4x8x24\r\n"
				+ "13x9x20\r\n"
				+ "8x12x9\r\n"
				+ "21x25x4\r\n"
				+ "23x23x28\r\n"
				+ "5x2x19\r\n"
				+ "29x3x15\r\n"
				+ "22x1x14\r\n"
				+ "3x23x30\r\n"
				+ "8x25x3\r\n"
				+ "15x8x14\r\n"
				+ "30x14x6\r\n"
				+ "23x27x24\r\n"
				+ "19x1x2\r\n"
				+ "10x9x13\r\n"
				+ "13x8x7\r\n"
				+ "8x13x22\r\n"
				+ "5x15x20\r\n"
				+ "17x14x8\r\n"
				+ "5x11x20\r\n"
				+ "5x10x27\r\n"
				+ "24x17x19\r\n"
				+ "21x2x3\r\n"
				+ "15x30x26\r\n"
				+ "21x19x15\r\n"
				+ "2x7x23\r\n"
				+ "13x17x25\r\n"
				+ "30x15x19\r\n"
				+ "26x4x10\r\n"
				+ "2x25x8\r\n"
				+ "9x9x10\r\n"
				+ "2x25x8\r\n"
				+ "19x21x30\r\n"
				+ "17x26x12\r\n"
				+ "7x5x10\r\n"
				+ "2x22x14\r\n"
				+ "10x17x30\r\n"
				+ "1x8x5\r\n"
				+ "23x2x25\r\n"
				+ "22x29x8\r\n"
				+ "13x26x1\r\n"
				+ "26x3x30\r\n"
				+ "25x17x8\r\n"
				+ "25x18x26\r\n"
				+ "26x19x15\r\n"
				+ "8x28x10\r\n"
				+ "12x16x29\r\n"
				+ "30x6x29\r\n"
				+ "28x19x4\r\n"
				+ "27x26x18\r\n"
				+ "15x23x17\r\n"
				+ "5x21x30\r\n"
				+ "8x11x13\r\n"
				+ "2x26x7\r\n"
				+ "19x9x24\r\n"
				+ "3x22x23\r\n"
				+ "6x7x18\r\n"
				+ "4x26x30\r\n"
				+ "13x25x20\r\n"
				+ "17x3x15\r\n"
				+ "8x20x18\r\n"
				+ "23x18x23\r\n"
				+ "28x23x9\r\n"
				+ "16x3x4\r\n"
				+ "1x29x14\r\n"
				+ "20x26x22\r\n"
				+ "3x2x22\r\n"
				+ "23x8x17\r\n"
				+ "19x5x17\r\n"
				+ "21x18x20\r\n"
				+ "17x21x8\r\n"
				+ "30x28x1\r\n"
				+ "29x19x23\r\n"
				+ "12x12x11\r\n"
				+ "24x18x7\r\n"
				+ "21x18x14\r\n"
				+ "14x26x25\r\n"
				+ "9x11x3\r\n"
				+ "10x7x15\r\n"
				+ "27x6x28\r\n"
				+ "14x26x4\r\n"
				+ "28x4x1\r\n"
				+ "22x25x29\r\n"
				+ "6x26x6\r\n"
				+ "1x3x13\r\n"
				+ "26x22x12\r\n"
				+ "6x21x26\r\n"
				+ "23x4x27\r\n"
				+ "26x13x24\r\n"
				+ "5x24x28\r\n"
				+ "22x16x7\r\n"
				+ "3x27x24\r\n"
				+ "19x28x2\r\n"
				+ "11x13x9\r\n"
				+ "29x16x22\r\n"
				+ "30x10x24\r\n"
				+ "14x14x22\r\n"
				+ "22x23x16\r\n"
				+ "14x8x3\r\n"
				+ "20x5x14\r\n"
				+ "28x6x13\r\n"
				+ "3x15x25\r\n"
				+ "4x12x22\r\n"
				+ "15x12x25\r\n"
				+ "10x11x24\r\n"
				+ "7x7x6\r\n"
				+ "8x11x9\r\n"
				+ "21x10x29\r\n"
				+ "23x28x30\r\n"
				+ "8x29x26\r\n"
				+ "16x27x11\r\n"
				+ "1x10x2\r\n"
				+ "24x20x16\r\n"
				+ "7x12x28\r\n"
				+ "28x8x20\r\n"
				+ "14x10x30\r\n"
				+ "1x19x6\r\n"
				+ "4x12x20\r\n"
				+ "18x2x7\r\n"
				+ "24x18x17\r\n"
				+ "16x11x10\r\n"
				+ "1x12x22\r\n"
				+ "30x16x28\r\n"
				+ "18x12x11\r\n"
				+ "28x9x8\r\n"
				+ "23x6x17\r\n"
				+ "10x3x11\r\n"
				+ "5x12x8\r\n"
				+ "22x2x23\r\n"
				+ "9x19x14\r\n"
				+ "15x28x13\r\n"
				+ "27x20x23\r\n"
				+ "19x16x12\r\n"
				+ "19x30x15\r\n"
				+ "8x17x4\r\n"
				+ "10x22x18\r\n"
				+ "13x22x4\r\n"
				+ "3x12x19\r\n"
				+ "22x16x23\r\n"
				+ "11x8x19\r\n"
				+ "8x11x6\r\n"
				+ "7x14x7\r\n"
				+ "29x17x29\r\n"
				+ "21x8x12\r\n"
				+ "21x9x11\r\n"
				+ "20x1x27\r\n"
				+ "1x22x11\r\n"
				+ "5x28x4\r\n"
				+ "26x7x26\r\n"
				+ "30x12x18\r\n"
				+ "29x11x20\r\n"
				+ "3x12x15\r\n"
				+ "24x25x17\r\n"
				+ "14x6x11";
		parte1(input);
		parte2(input);
	}
}
