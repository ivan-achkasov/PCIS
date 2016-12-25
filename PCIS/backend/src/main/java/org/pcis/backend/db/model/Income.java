package org.pcis.backend.db.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Income {

	@Id
	@Column(name = "id")
	private long id;

	@ManyToOne
	@JoinColumn(name = "tradepoint_id")
	private TradePoint tradePoint;
	
	@Column(name = "year")
	private Integer year;
	
	@Column(name = "month")
	private Integer month;

	@Column(name = "value")
	private Integer value;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public TradePoint getTradePoint() {
		return tradePoint;
	}

	public void setTradePoint(TradePoint tradePoint) {
		this.tradePoint = tradePoint;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
