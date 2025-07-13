package com.chaaw.house.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

@Entity
@Table(name = "houses")
public class House {

    @Id
    @UuidGenerator // can generate uuid -> uuid = Universally Unique Identifier
    @Column(name = "id")
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "room_total")
    private int roomTotal;

    // new one-to-one association
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
//    @JsonManagedReference // for one direction (house -> fetched owner, but owner -> not fetched house)
    @JsonIdentityInfo( // bi-direction
            generator = ObjectIdGenerators.PropertyGenerator.class,
            property = "id"
    )
    private Owner owner;

    // getters & setters...

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoomTotal() {
        return roomTotal;
    }

    public void setRoomTotal(int roomTotal) {
        this.roomTotal = roomTotal;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
        owner.setHouse(this);  // keep both sides in sync
    }

}
