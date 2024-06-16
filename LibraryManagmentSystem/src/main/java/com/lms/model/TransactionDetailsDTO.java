package com.lms.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TransactionDetailsDTO {
	private int Uid;
	private int AId;
	private Date Rdate;
	private Date Idate;
}
