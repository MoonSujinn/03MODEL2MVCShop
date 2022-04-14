package com.model2.mvc.service.purchase;

import java.util.HashMap;
import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;

public interface PurchaseService {
	
	public void addPurchase(Product product) throws Exception;
	
	public Product getPurchase(String productNo) throws Exception;
	
	public Map<String, Object> getPurchaseList(Search search) throws Exception;
	
	public Map<String, Object> getSaleList(Search search) throws Exception;
	
	public void updatePurchase(Product product) throws Exception;
	
	public void updateTranCode(Product product) throws Exception;	

}
