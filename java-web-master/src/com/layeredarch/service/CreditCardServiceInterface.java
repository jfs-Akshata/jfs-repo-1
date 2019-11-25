package com.layeredarch.service;
import java.sql.SQLException;
import java.util.ArrayList;

import com.layeredarch.model.CreditCardModel;


public interface CreditCardServiceInterface {

	public ArrayList getCreditCards() throws ClassNotFoundException, SQLException;

	CreditCardModel getCreditCard(String cardNo);

	int addCreditCard(CreditCardModel creditCardModel);

	int modifyCreditCard(CreditCardModel creditCardModel);

	int removeCreditCard(String cardNo);
}