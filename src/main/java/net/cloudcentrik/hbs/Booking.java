package net.cloudcentrik.hbs;

import java.sql.Time;
import java.util.Date;

public class Booking {
	private String shopEmail;
	private String customerEmail;
	private Date bookingDate;
	private Time bookingStartTime;
	private Time bookingEndTime;
	public String getShopEmail() {
		return shopEmail;
	}
	public void setShopEmail(String shopEmail) {
		this.shopEmail = shopEmail;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Time getBookingStartTime() {
		return bookingStartTime;
	}
	public void setBookingStartTime(Time bookingStartTime) {
		this.bookingStartTime = bookingStartTime;
	}
	public Time getBookingEndTime() {
		return bookingEndTime;
	}
	public void setBookingEndTime(Time bookingEndTime) {
		this.bookingEndTime = bookingEndTime;
	}
	public Booking(String shopEmail, String customerEmail, Date bookingDate,
			Time bookingStartTime, Time bookingEndTime) {
		super();
		this.shopEmail = shopEmail;
		this.customerEmail = customerEmail;
		this.bookingDate = bookingDate;
		this.bookingStartTime = bookingStartTime;
		this.bookingEndTime = bookingEndTime;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

}
