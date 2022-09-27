package main.java.br.com.design_patters.structural.facade;

import java.util.List;

import main.java.br.com.design_patters.structural.facade.model.Card;
import main.java.br.com.design_patters.structural.facade.model.Register;
import main.java.br.com.design_patters.structural.facade.services.CardService;
import main.java.br.com.design_patters.structural.facade.services.PaymentService;
import main.java.br.com.design_patters.structural.facade.services.RegisterService;
import main.java.br.com.design_patters.structural.facade.services.ReportService;
import main.java.br.com.design_patters.structural.facade.services.SecurityService;

public class Client {

	public static void main(String[] args) {
		CardService cardService = new CardService();
		RegisterService registerService = new RegisterService();
		ReportService reportService = new ReportService(registerService);
		PaymentService paymentService = new PaymentService(registerService);
		SecurityService securityService = new SecurityService(cardService, registerService);

		Card card = cardService.getCardByUser(123456L);
		System.out.println(card);

		reportService.getSumary(card);

		paymentService.getPaymentInfoByCard(card);

		// Remove last register, block the card e order a new one
		List<Register> registers = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, registers.size() - 1);
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 33445566L);
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSumary(newCard);
	}
}
