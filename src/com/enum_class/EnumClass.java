package com.enum_class;

public class EnumClass {

	enum Alphabet {
		a, b
	}

	public static void main(String[] args) {
		System.out.println(Alphabet.a + " " + Alphabet.a.ordinal());
		System.out.println(Alphabet.b + " " + Alphabet.b.ordinal());
	}
}
