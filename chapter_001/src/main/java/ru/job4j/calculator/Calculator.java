package ru.job4j.calculator;

/**
 *Class Calculator
 *author kgnedash
 *@since 3.11.2017
 *@version 1
 */


public class Calculator {
	private double result;

	public void add(double first, double second) {
		this.result = first + second;
	}

	public void substract(double first, double second) {
		this.result = first - second;
	}

	public void div(double first, double second) {
		this.result = first / second;
	}

	public void multiple(double first, double second) {
		this.result = first * second;
	}

	public double getResult() {
		return this.result;
	}
}