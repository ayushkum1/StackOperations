package com.app.stack;

import java.util.Arrays;

public class Stack implements StackOpertaionInterface{

	int[] arr;
	int top = -1;
	int size;
	
	//constructor to initialize an array with user given size
	public Stack(int size) {
		super();
		this.size = size;
		arr = new int[size];//initializing
	}

	public int[] getArr() {
		return arr;
	}
	
	//push method will first check if the stack is full, if yes then it will return,
	//else increment the top and store the number at top(index) in array
	@Override
	public void push(int n) {
		if(isFull()) {
			System.out.println("Stack is full!");
			return;
		}
		
		++top;
		arr[top] = n;
		
	}

	//pop method will first check if the stack is empty, if yes then it will return, 
	//else it will decrement the top value
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

	//if top is -1 then stack is empty
	@Override
	public boolean isEmpty() {
		
		if(top == -1) {
			return true;
		}
		
		return false;
	}

	//if top is equal to stack size then full
	@Override
	public boolean isFull() {
		
		if(top == size - 1) {
			return true;
		}
		
		return false;
	}


}
