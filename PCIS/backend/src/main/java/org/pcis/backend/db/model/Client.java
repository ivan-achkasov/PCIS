package org.pcis.backend.db.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "fio", unique = true, length = 50)
  private String FIO;

  @Column(name = "sector", length = 45)
  private String sector;

  @OneToMany(mappedBy = "client")
  private Set<Enumenator> enumenatorList;

  public Client(Long id) {
    this.id = id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setFIO(String FIO) {
    this.FIO = FIO;
  }

  public String getFIO() {
    return FIO;
  }

  public void setSector(String sector) {
    this.sector = sector;
  }

  public String getSector() {
    return sector;
  }

  public void setEnumenatorList(Set<Enumenator> enumenatorList) {
    this.enumenatorList = enumenatorList;
  }

  public Set<Enumenator> getEnumenatorList() {
    return enumenatorList;
  }
}
