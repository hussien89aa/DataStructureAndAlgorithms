package com.ds;

public class QueueDArrayDemo {

	public static void main(String[] args) {
		QueueDArray<Integer> q= new
				QueueDArray<Integer>(2);
		q.Queue(11);
		q.Queue(12);
		System.out.println("Size:"+ q.getSize());
		q.Queue(12);
		System.out.println("Size:"+ q.getSize());
	}

}
