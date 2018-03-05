package com.example.examplestatemachine;

public class StateContext {

	State acceptState;
	State rejectState;
	State state;
	String a;
	public actions firstAction;
	
	public StateContext() {
		this.acceptState = new acceptState(this);
		this.rejectState = new rejectState(this);
		state = rejectState;
		this.firstAction = new actions();
		a = firstAction.getNOaction();
	}
	
	public void actionA() {
		state.actionA();
	}
	
	public void actionB() {
		state.actionB();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void setacceptState(State state) {
		this.state = state;
	}
	
	public void setrejectState(State state) {
		this.state = state;
	}
	
	public State getrejectState() {
		return rejectState;
	}
	
	public State getacceptState() {
		return acceptState;
	}
	
	public State getState() {
		return state;
	}
	
	public boolean isAccept() {
        return state.accept;
    }
	
}
