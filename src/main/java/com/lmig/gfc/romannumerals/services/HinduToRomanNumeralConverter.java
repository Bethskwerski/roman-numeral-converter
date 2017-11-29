package com.lmig.gfc.romannumerals.services;

public class HinduToRomanNumeralConverter {
	public String convert(int numberToConvert) {

		String result = "";

		for (int i = numberToConvert; i >= 1000; i -= 1000) {
			result += "M";
			numberToConvert -= 1000;
		}

		for (int i = numberToConvert; i >= 900; i -= 900) {
			result += "CM";
			numberToConvert -= 900;
		}

		for (int i = numberToConvert; i >= 500; i -= 500) {
			result += "D";
			numberToConvert -= 500;
		}

		for (int i = numberToConvert; i >= 400; i -= 400) {
			result += "CD";
			numberToConvert -= 400;
		}

		for (int i = numberToConvert; i >= 100; i -= 100) {
			result += "C";
			numberToConvert -= 100;
		}

		for (int i = numberToConvert; i >= 90; i -= 90) {
			result += "XC";
			numberToConvert -= 90;
		}

		for (int i = numberToConvert; i >= 50; i -= 50) {
			result += "L";
			numberToConvert -= 50;
		}

		for (int i = numberToConvert; i >= 40; i -= 40) {
			result += "XL";
			numberToConvert -= 40;
		}

		for (int i = numberToConvert; i >= 10; i -= 10) {
			result += "X";
			numberToConvert -= 10;
		}

		for (int i = numberToConvert; i >= 9; i -= 9) {
			result += "IX";
			numberToConvert -= 9;
		}

		for (int i = numberToConvert; i >= 5; i -= 5) {
			result += "V";
			numberToConvert -= 5;
		}

		for (int i = numberToConvert; i >= 4; i -= 4) {
			result += "IV";
			numberToConvert -= 4;
		}

		for (int i = numberToConvert; i >= 1; i -= 1) {
			result += "I";
			numberToConvert -= 1;
		}
		return result;
	}
}
