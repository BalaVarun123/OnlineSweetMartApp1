package com.cg.osm.model;

import java.time.LocalDate;
import java.util.List;

import com.cg.osm.entity.SweetOrder;

public class OrderBill {
	
	private Integer orderBillId;
	private LocalDate createdDate;
	private float totalCost;
	private List<SweetOrder> listSweetOrder;
	
}
