package org.pcis.backend.db.model;

import java.beans.ConstructorProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enumenator")
public class Enumenator {

  @Id  
  @Column(name = "id", insertable = false, updatable=false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "type", nullable = false, length = 50)
  private String type;

  @ManyToOne
  @JoinColumn(name = "id", insertable=false, updatable=false)
  private Client client;
  
  @Column(name = "value")
  private Long value;

  public Enumenator(Long id) {
    this.id = id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setTypeEnum(String type) {
    this.type = type;
  }

  public String getTypeEnum() {
    return type;
  }

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}

public Long getValue() {
	return value;
}

public void setValue(Long value) {
	this.value = value;
}

}
