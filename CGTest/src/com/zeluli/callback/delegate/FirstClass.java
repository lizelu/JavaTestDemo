package com.zeluli.callback.delegate;

public class FirstClass implements CustomDelegate {
	private SecondClass secondClass;
	
	public void beginRunSecondDelegateMethod() {
		if(this.secondClass == null) {
			this.secondClass = new SecondClass(this);
		}
	}

	//secondClass回调要执行的方法
	@Override
	public void setValue(String value) {
		System.out.println("第二个类回调过来的值：" + value);
	}

}
