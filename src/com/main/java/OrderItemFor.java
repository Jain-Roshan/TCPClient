package com.main.java;

import java.util.ArrayList;
import java.util.List;

public class OrderItemFor {
	public static List<OrderItem> allOrderItems = new ArrayList<>();

	public static void main(String[] args) throws InterruptedException {

		OrderItem headOrderItem = new OrderItem();
		List<OrderItem> headList = new ArrayList<>();

		OrderItem oi0 = new OrderItem();
		List<OrderItem> List0 = new ArrayList<>();
		OrderItem oi00 = new OrderItem();
		List<OrderItem> List00 = new ArrayList<>();
		OrderItem oi000 = new OrderItem();
		List00.add(oi000);
		oi00.setOi(List00);
		OrderItem oi01 = new OrderItem();
		List0.add(oi00);
		List0.add(oi01);
		oi0.setOi(List0);

		OrderItem oi1 = new OrderItem();
		OrderItem oi2 = new OrderItem();
		List<OrderItem> List2 = new ArrayList<>();
		OrderItem oi20 = new OrderItem();
		List2.add(oi20);
		oi2.setOi(List2);

		headList.add(oi0);
		headList.add(oi1);
		headList.add(oi2);
		headOrderItem.setOi(headList);

		allOrderItems.add(headOrderItem);
		if (headOrderItem.getOi() != null)
			collectOrderItem(headOrderItem);
		System.out.println(allOrderItems.size());
	}

	public static void collectOrderItem(OrderItem currentOrderItem) throws InterruptedException {

		for (OrderItem orderItem : currentOrderItem.getOi()) {
			allOrderItems.add(orderItem);
			if (orderItem.getOi() != null)
				collectMyOrderItem(orderItem);
		}
	}

	public static void collectMyOrderItem(OrderItem currentOrderItem) throws InterruptedException {

		for (OrderItem orderItem : currentOrderItem.getOi()) {
			allOrderItems.add(orderItem);
			if (orderItem.getOi() != null)
				collectOrderItem(orderItem);
		}
	}
}
