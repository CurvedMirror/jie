package com.bdqn.model;

import java.util.Date;

public class House {
    private Integer id;

    private String title;

    private Integer typeId;

    private Date fdate;

    private String description;

    private Double price;

    private String pic;

    private String contact;

    public House(Integer id, String title, Integer typeId, Date fdate, String description, Double price, String pic, String contact) {
        this.id = id;
        this.title = title;
        this.typeId = typeId;
        this.fdate = fdate;
        this.description = description;
        this.price = price;
        this.pic = pic;
        this.contact = contact;
    }

    public House() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Date getFdate() {
        return fdate;
    }

    public void setFdate(Date fdate) {
        this.fdate = fdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }
}