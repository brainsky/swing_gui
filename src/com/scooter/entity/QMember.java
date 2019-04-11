package com.scooter.entity;

import java.io.Serializable;
import java.util.List;


/**
 * QMUL Students and staff members
 * @author root
 *
 */
public class QMember implements Serializable {

	
	private static final long serialVersionUID = 2277233516040892002L;
	
	private String number;
	
	private String fullName;
	
	private String email;
	
	private List<DriverRecord> record;

}
