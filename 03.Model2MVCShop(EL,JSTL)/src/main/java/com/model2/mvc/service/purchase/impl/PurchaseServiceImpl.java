package com.model2.mvc.service.purchase.impl;

import java.util.HashMap;
import java.util.Map;

import com.model2.mvc.service.purchase.dao.PurchaseDAO;
import com.model2.mvc.service.domain.Purchase;
import com.model2.mvc.common.Search;
import com.model2.mvc.service.purchase.PurchaseService;


public class PurchaseServiceImpl implements PurchaseService{
	
	private PurchaseDAO purchaseDAO;
	
	public PurchaseServiceImpl() {
		purchaseDAO=new PurchaseDAO();
	}
	
	public void addPurchase(Purchase purchase) throws Exception {
		purchaseDAO.insertPurchase(purchase);
				
	}
	
	public Map<String,Object> getPurchaseList(Search search) throws Exception {
		return purchaseDAO.getPurchaseList(search);
	}
	
	public Map<String,Object> getSaleList(Search search) throws Exception {
		return purchaseDAO.getPurchaseList(search);
	}


	public Purchase getPurchase(String prodNo) throws Exception {
		return purchaseDAO.findPurchase(prodNo);
	}
	

	public void updatePurchase(Purchase purchase) throws Exception {
		purchaseDAO.updatePurchase(purchase);
	}
	
	public void updateTranCode(Purchase purchase) throws Exception {
		purchaseDAO.updatePurchase(tranCode);
	}


}