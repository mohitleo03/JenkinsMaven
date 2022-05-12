package com.ncu.calc_interface.calculator_interface;

public class Calculator implements ICalculator{
	public int sum(String expression) {
		int sum = 0;
		for (String expr : expression.split("\\+")) {
			sum += Integer.valueOf(expr);
		}
		return sum;
	}
	public int sub(String expression) {
		int diff = 0;
		for (String expr : expression.split("\\-")) {
			diff -= Integer.valueOf(expr);
		}
		return diff;
	}
	public int mul(String expression) {
		int mul = 0;
		for (String expr : expression.split("\\*")) {
			mul *= Integer.valueOf(expr);
		}
		return mul;
	}
	public int div(String expression) {
		int div = 0;
		for (String expr : expression.split("\\/")) {
			div /= Integer.valueOf(expr);
		}
		return div;
	}
}
