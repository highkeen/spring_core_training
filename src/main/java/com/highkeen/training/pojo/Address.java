package com.highkeen.training.pojo;

/**
 * @author samik
 *
 */
/**
 * @author samik
 *
 */
public class Address {

	private String line1;
	private String line2;
	private String pin;

	public Address() {
		super();
	}

	public Address(String line1, String line2, String pin) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.pin = pin;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", pin=" + pin + "]";
	}

}
