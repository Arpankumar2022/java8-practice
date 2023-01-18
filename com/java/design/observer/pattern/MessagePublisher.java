package com.java.design.observer.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class MessagePublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();

	/*@Override
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}*/

	@Override
	public void notifyUpdate(Message m) {
		for (Observer o : observers) {
			o.update(null, m);
		}
	}

	@Override
	public void attach(com.java.design.observer.pattern.Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(com.java.design.observer.pattern.Observer o) {
		// TODO Auto-generated method stub
		
	}
}
