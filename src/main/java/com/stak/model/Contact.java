package com.stak.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigInteger;

@Document(collection = Contact.COLLECTION_NAME)
public class Contact implements Serializable {
    public static final String COLLECTION_NAME = "contacts";

    /**
     * В качестве ID может выступать UUID объекта из MongoDB (ObjectID).
     *
     * @Id private String id;
     */
    @Id
    private BigInteger id;

    private String name;
    private String number;
    private String email;

    public Contact() {
    }

    public Contact(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }





	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
