package com.app.stack;

import java.util.Arrays;

public class Stack implements StackOpertaionInterface{

	int[] arr;
	int top = -1;
	int size;
	
	public Stack(int size) {
		super();
		this.size = size;
		arr = new int[size];
	}

	public int[] getArr() {
		return arr;
	}
	
	@Override
	public void push(int n) {
		if(isFull()) {
			System.out.println("Stack is full!");
			return;
		}
		
		++top;
		arr[top] = n;
		
	}

	@Override
	public int pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty!");
			return -1;
		}
		
		int popNumber = arr[top];
		
		--top;
		
		return popNumber;
	}

	@Override
	public boolean isEmpty() {
		
		if(top == -1) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isFull() {
		
		if(top == size - 1) {
			return true;
		}
		
		return false;
	}


}
