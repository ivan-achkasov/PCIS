package org.pcis.backend.db.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "used")
public class Used {

  @ManyToOne
  @JoinColumn(name = "idEnum")
  private Enumerator enumerator;

  @ManyToOne
  @JoinColumn(name = "idClient")
  private Client client;

  public Used() {

  }

  public void setEnumerator(Enumerator enumerator) {
    this.enumerator = enumerator;
  }

  public Enumerator getEnumerator() {
    return enumerator;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public Client getClient() {
    return client;
  }

}
