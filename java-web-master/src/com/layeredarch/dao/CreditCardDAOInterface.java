package com.layeredarch.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.layeredarch.model.CreditCardModel;

public interface CreditCardDAOInterface {
	ArrayList getCreditCards() throws ClassNotFoundException, SQLException;

	CreditCardModel getCreditCard(String cardNo);

	int insertCreditCard(CreditCardModel creditCardModel);

	int updateCreditCard(CreditCardModel creditCardModel);

	int deleteCreditCard(String cardNo);

}