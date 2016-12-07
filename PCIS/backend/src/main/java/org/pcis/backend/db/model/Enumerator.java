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
@Table(name = "enumerator")
public class Enumerator {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "typeEnum", nullable = false, length = 50)
  private String typeEnum;

  @OneToMany(mappedBy = "enumerator")
  private Set<Used> usedList;

  public Enumerator() {

  }

  public Enumerator(Long id) {
    this.id = id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setTypeEnum(String typeEum) {
    this.typeEnum = typeEnum;
  }

  public String getTypeEnum() {
    return typeEnum;
  }

  public void setUsedList(Set<Used> usedList) {
    this.usedList = usedList;
  }

  public Set<Used> getUsedList() {
    return usedList;
  }
}
