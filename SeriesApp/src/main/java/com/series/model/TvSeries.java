package com.series.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TvSeries implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5753756746082096034L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="serialid")
	private int serialId;
	@Column(name="serialname")
	private String serialName;
	@Column(name="dldcomplete")
	private String dldComplete;
	@Column(name="isactive")
	private String isActive;
	@Column(name="rlsdate")
	private Date releaseDate;
	
}
