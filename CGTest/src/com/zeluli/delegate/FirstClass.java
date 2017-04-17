package com.zeluli.delegate;

public class FirstClass implements CustomDelegate {
	private SecondClass secondClass;
	
	public void beginRunSecondDelegateMethod() {
		if(this.secondClass == null) {
			this.secondClass = new SecondClass();
		}
		this.secondClass.setDelegate(this);
	}

	@Override
	public void setValue(String value) {
		System.out.println("第二个类回调过来的值：" + value);
	}

}
