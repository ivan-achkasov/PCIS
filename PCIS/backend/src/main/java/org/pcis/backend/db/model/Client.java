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

  @ManyToOne
  @JoinColumn(name = "idSec")
  private Sector sector;

  @OneToMany(mappedBy = "client")
  private Set<Used> usedList;

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

  public void setSector(Sector sector) {
    this.sector = sector;
  }

  public Sector getSector() {
    return sector;
  }

  public void setUsedList(Set<Used> usedList) {
    this.usedList = usedList;
  }

  public Set<Used> getUsedList() {
    return usedList;
  }
}
