package com.wenlifen.java02demo06;

public class Order {
	
	public static void main(String[] args) {
		Order o1 = new Order(10,"0");
		Order o2 = new Order(10,"0");
		System.out.println(o1.equals(o2));
	
	}
	
	int orderld;
	String orderName;
	
	
	
	public Order(int orderld, String orderName) {
		super();
		this.orderld = orderld;
		this.orderName = orderName;
	}
	
	public int getOrderld() {
		return orderld;
	}
	public void setOrderld(int orderld) {
		this.orderld = orderld;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderName == null) {
			if (other.orderName != null)
				return false;
		} else if (!orderName.equals(other.orderName))
			return false;
		if (orderld != other.orderld)
			return false;
		return true;
	}
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(this==obj) {
//			return true;
//		}
//		if(obj instanceof Order) {
//			Order order = (Order)obj;
//			
//			return this.orderld==order.orderld&&this.orderName.equals(order.orderName);
//		}
//		return false;
//	}
}
