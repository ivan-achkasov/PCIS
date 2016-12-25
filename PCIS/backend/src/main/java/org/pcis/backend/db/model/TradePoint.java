package org.pcis.backend.db.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TradePoint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", insertable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "description", length = 500)
	private String description;

	@Column(name = "address", length = 100)
	private String address;

	@OneToMany(mappedBy = "tradePoint", fetch = FetchType.EAGER)
	private Collection<Income> incomes = new LinkedHashSet<Income>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Collection<Income> getIncomes() {
		return incomes;
	}

	public void setIncomes(Collection<Income> incomes) {
		this.incomes = incomes;
	}
}
