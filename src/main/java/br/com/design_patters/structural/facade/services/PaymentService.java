package main.java.br.com.design_patters.structural.facade.services;

import java.util.List;

import main.java.br.com.design_patters.structural.facade.model.Card;
import main.java.br.com.design_patters.structural.facade.model.Register;

public class PaymentService {
	private RegisterService registerService;

	public PaymentService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getPaymentInfoByCard(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		double sum = registers.stream()
				.reduce(0d, (partialValue, reg) -> partialValue + reg.getValue(), Double::sum);
		System.out.println(String.format("You have to pay %.2f until next week", sum));
	}

}
