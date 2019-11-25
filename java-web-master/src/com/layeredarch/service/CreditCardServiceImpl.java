package com.layeredarch.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.layeredarch.dao.CreditCardDAOImpl;
import com.layeredarch.dao.CreditCardDAOInterface;
import com.layeredarch.model.CreditCardModel;
//service layer is used for business logic 
//transaction management
//logging
//security
//monitoring performance
public class CreditCardServiceImpl implements CreditCardServiceInterface{

	@Override
	public ArrayList getCreditCards() throws ClassNotFoundException, SQLException {
		CreditCardDAOInterface creditCardDAOInterface = new CreditCardDAOImpl();
		return creditCardDAOInterface.getCreditCards();
	}

	@Override
	public CreditCardModel getCreditCard(String cardNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addCreditCard(CreditCardModel creditCardModel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyCreditCard(CreditCardModel creditCardModel) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeCreditCard(String cardNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
