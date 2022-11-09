package main.java.br.com.design_patters.behavioral.state.states;

import main.java.br.com.design_patters.behavioral.state.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);

	void longClick(HeadPhone hp);
}
