package main.java.br.com.design_patters.structural.facade.facade;

import java.util.List;

import main.java.br.com.design_patters.structural.facade.model.Card;
import main.java.br.com.design_patters.structural.facade.model.Register;
import main.java.br.com.design_patters.structural.facade.services.CardService;
import main.java.br.com.design_patters.structural.facade.services.PaymentService;
import main.java.br.com.design_patters.structural.facade.services.RegisterService;
import main.java.br.com.design_patters.structural.facade.services.ReportService;
import main.java.br.com.design_patters.structural.facade.services.SecurityService;

public class BankFacade {
	CardService cardService;
	RegisterService registerService;
	ReportService reportService;
	PaymentService paymentService;
	SecurityService securityService;

	public BankFacade() {
		cardService = new CardService();
		registerService = new RegisterService();
		reportService = new ReportService(registerService);
		paymentService = new PaymentService(registerService);
		securityService = new SecurityService(cardService, registerService);
	}

	public Card getCardByUser(Long l) {
		return cardService.getCardByUser(l);
	}

	public void getSumary(Card card) {
		reportService.getSumary(card);
	}

	public void getPaymentInfoByCard(Card card) {
		paymentService.getPaymentInfoByCard(card);
	}

	public void cancelLastRegister(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		registerService.removeByIndex(card, registers.size() - 1);
		List<Register> pendingRegisters = securityService.blockCard(card);
		Card newCard = cardService.createNewCard(123456L, 33445566L);
		registerService.addCardRegisters(newCard, pendingRegisters);
		reportService.getSumary(newCard);
	}
}
