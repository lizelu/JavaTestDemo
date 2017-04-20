package com.zeluli.callback.innerclass;

public class FirstClass {
	private SecondClass secondClass;
	
	public void beginRunSecondDelegateMethod() {
		if(this.secondClass == null) {
			this.secondClass = new SecondClass(new CustomDelegate () {
				@Override
				public void setValue(String value) {
					System.out.println("第二个类回调过来的值：" + value);
				}
			});
		}
		this.secondClass.begin();
	}
}
