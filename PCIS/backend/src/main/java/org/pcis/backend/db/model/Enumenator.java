package org.pcis.backend.db.model;

import java.beans.ConstructorProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enumenator")
public class Enumenator {

  @Id  
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "typeEnum", nullable = false, length = 50)
  private String typeEnum;

  @Column(name = "client")
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

  public void setTypeEnum(String typeEnum) {
    this.typeEnum = typeEnum;
  }

  public String getTypeEnum() {
    return typeEnum;
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
