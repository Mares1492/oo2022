package mares.webshop.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Fruits {
    @Id
    @GeneratedValue
    Long id;
    String fruit;
    String imgSrc;
    String description;
    boolean present;
}
