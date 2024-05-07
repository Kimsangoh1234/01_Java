package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
//필드
	private String productName;
	private Date putdate;
	private Date getDate;
	private int putAmonunt;
	private int getAmount;
	private int inventoryAmount;
//메서드
	private void name() {
		
	}
public Inventory(String productName, Date putdate, int putAmonunt) {
	super();
	this.productName = productName;
	this.putdate = putdate;
	this.putAmonunt = putAmonunt;
}
//GEtter
public String getProductName() {
	return productName;
}
public Date getPutdate() {
	return putdate;
}
public Date getGetDate() {
	return getDate;
}
public int getPutAmonunt() {
	return putAmonunt;
}
public int getGetAmount() {
	return getAmount;
}
public int getInventoryAmount() {
	return inventoryAmount;
}
//Setter
public void setProductName(String productName) {
	this.productName = productName;
}
public void setPutdate(Date putdate) {
	this.putdate = putdate;
}
public void setGetDate(Date getDate) {
	this.getDate = getDate;
}
public void setPutAmonunt(int putAmonunt) {
	this.putAmonunt = putAmonunt;
}
public void setGetAmount(int getAmount) {
	this.getAmount = getAmount;
}
public void setInventoryAmount(int inventoryAmount) {
	this.inventoryAmount = inventoryAmount;
}
@Override
public String toString() {
	
	//날짜 형식을 변경
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 mm월 dd");
	String 문자열변환 = dateFormat.format(putdate);
	
	String 출고일변환 = dateFormat.format(getDate);
	
	int 남은재고 = putAmonunt - getAmount;
	return "Inventory [productName=" + productName + ", putdate=" + 문자열변환 + ", getDate=" + 출고일변환 + ", putAmonunt="
			+ putAmonunt + ", getAmo                   unt=" + getAmount + ", inventoryAmount=" + 남은재고 + ", toString()="
			+ super.toString() + "]";
}
	

	
}
