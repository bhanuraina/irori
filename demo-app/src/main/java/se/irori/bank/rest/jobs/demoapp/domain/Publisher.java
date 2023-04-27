package se.irori.bank.rest.jobs.demoapp.domain;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;


@Entity
public class Publisher {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String publisherName;
    private String address;
    private String city;
    private String state;
    private String zipcode;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;



    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getPublisherName() {
        return publisherName;
    }
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id == null) ? 0 : Id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Publisher other = (Publisher) obj;
        if (Id == null) {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        return true;
    }
    public Set<Book> getBooks() {
        return books;
    }
    public void setBooks(Set<Book> books) {
        this.books = books;
    }



}
