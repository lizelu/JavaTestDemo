package com.zeluli.callback.delegate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class SecondClass {
	private CustomDelegate delegate;

	public SecondClass(CustomDelegate delegate) {
		this.delegate = delegate;
		this.begin();
	}
	
	public void begin() {
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				delegate.setValue(getNowDate());	//执行委托代理回调方法
			}
		};
		
        long delay = 0;  
        Timer timer = new Timer();  
        timer.scheduleAtFixedRate(task, delay, 1000); 
	}
	
	private String getNowDate() {
	   Date currentTime = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   String dateString = formatter.format(currentTime);
	   return dateString;
	}
}
