package com.example.examplestatemachine;

public class acceptState extends State{

	StateContext sc;
	
	public acceptState(StateContext sc) {
		this.sc = sc;
		this.accept = true;
	}
	
	@Override
	public void actionA() {
		if(sc.a=="NOaction") {
			sc.a="actionA";
			sc.setState(sc.getacceptState());
		}else if(sc.a=="actionA") {
			sc.setState(sc.getacceptState());
		} else if(sc.a=="actionB") {
			sc.setState(sc.getrejectState());
		}
	}
	
	@Override
	public void actionB() {
		if(sc.a=="NOaction") {
			sc.a="actionB";
			sc.setState(sc.getacceptState());
		}else if(sc.a=="actionB") {
			sc.setState(sc.getacceptState());
		} else if(sc.a=="actionA") {
			sc.setState(sc.getrejectState());
		}
	}
	
}
