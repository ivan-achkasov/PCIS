package org.pcis.backend.db.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sector")
public class Sector {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "address", nullable = false, length = 50)
  private String address;

  @OneToMany(mappedBy = "sector")
  private Set<Client> clientList;

  public Sector() {

  }

  public Sector(Long id) {
    this.id = id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public void setClientList(Set<Client> clientList) {
    this.clientList = clientList;
  }

  public Set<Client> getClientList() {
    return clientList;
  }

}
