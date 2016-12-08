package org.pcis.backend.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "used")
public class Used {

  @Id
  @Column(name = "date")
  private Date date;

  @Id
  @ManyToOne
  @JoinColumn(name = "idEnumenator")
  private Enumerator enumerator;

  @Column(name = "value")
  private Integer value;

  public void setEnumerator(Enumerator enumerator) {
    this.enumerator = enumerator;
  }

  public Enumerator getEnumerator() {
    return enumerator;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

}
