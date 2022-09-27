package main.java.br.com.design_patters.structural.facade.services;

import java.util.List;

import main.java.br.com.design_patters.structural.facade.model.Card;
import main.java.br.com.design_patters.structural.facade.model.Register;

public class ReportService {
	private RegisterService registerService;

	public ReportService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getSumary(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		for (Register reg : registers) {
			System.out.println(String.format("%s\t%.2f\t%s",
					reg.getStoreName(),
					reg.getValue(),
					reg.getDate().toString()));
		}
	}

}
