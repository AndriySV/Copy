package com.softserveinc.softtour.entity;


import javax.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "HistoryRequest")
public class HistoryRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "cityFrom", nullable = false, length = 45)
    private String cityFrom;

    @Column(name = "dateFrom",  nullable = false)
    private Date dateFrom;

    @Column(name = "dateTo", nullable = false)
    private Date dateTo;

    @Column(name = "daysFrom", nullable = false)
    private int daysFrom;

    @Column(name = "daysTo", nullable = false)
    private int daysTo;

    @Column(name = "stars", nullable = false)
    @ElementCollection(targetClass=Integer.class)
    private Set stars;

    @Column(name = "adults", nullable = false)
    private int adults;

    @Column(name = "children", nullable = false)
    private int children;

    @Column(name = "priceFrom", nullable = false)
    private BigDecimal priceFrom;

    @Column(name = "priceTo", nullable = false)
    private BigDecimal priceTo;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @Column(name = "requestDate", nullable = false)
    private Date requestDate;

    public HistoryRequest() {
    }

    public HistoryRequest(String cityFrom, Date dateFrom, Date dateTo,int daysFrom, int daysTo, Set stars, int adults, int children,
                          BigDecimal priceFrom, BigDecimal priceTo, User user, Country country, Date requestDate) {

        this.cityFrom = cityFrom;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.daysFrom = daysFrom;
        this.daysTo = daysTo;
        this.stars = stars;
        this.adults = adults;
        this.children = children;
        this.priceFrom = priceFrom;
        this.priceTo = priceTo;
        this.user = user;
        this.country = country;
        this.requestDate = requestDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public int getDaysFrom() {
        return daysFrom;
    }

    public void setDaysFrom(int daysFrom) {
        this.daysFrom = daysFrom;
    }

    public int getDaysTo() {
        return daysTo;
    }

    public void setDaysTo(int daysTo) {
        this.daysTo = daysTo;
    }

    public Set getStars() {
        return stars;
    }

    public void setStars(Set stars) {
        this.stars = stars;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public BigDecimal getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(BigDecimal priceFrom) {
        this.priceFrom = priceFrom;
    }

    public BigDecimal getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(BigDecimal priceTo) {
        this.priceTo = priceTo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + adults;
		result = prime * result + children;
		result = prime * result
				+ ((cityFrom == null) ? 0 : cityFrom.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((dateFrom == null) ? 0 : dateFrom.hashCode());
		result = prime * result + ((dateTo == null) ? 0 : dateTo.hashCode());
		result = prime * result + daysFrom;
		result = prime * result + daysTo;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((priceFrom == null) ? 0 : priceFrom.hashCode());
		result = prime * result + ((priceTo == null) ? 0 : priceTo.hashCode());
		result = prime * result
				+ ((requestDate == null) ? 0 : requestDate.hashCode());
		result = prime * result + ((stars == null) ? 0 : stars.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		HistoryRequest other = (HistoryRequest) obj;
		if (adults != other.adults)
			return false;
		if (children != other.children)
			return false;
		if (cityFrom == null) {
			if (other.cityFrom != null)
				return false;
		} else if (!cityFrom.equals(other.cityFrom))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (dateFrom == null) {
			if (other.dateFrom != null)
				return false;
		} else if (!dateFrom.equals(other.dateFrom))
			return false;
		if (dateTo == null) {
			if (other.dateTo != null)
				return false;
		} else if (!dateTo.equals(other.dateTo))
			return false;
		if (daysFrom != other.daysFrom)
			return false;
		if (daysTo != other.daysTo)
			return false;
		if (id != other.id)
			return false;
		if (priceFrom == null) {
			if (other.priceFrom != null)
				return false;
		} else if (!priceFrom.equals(other.priceFrom))
			return false;
		if (priceTo == null) {
			if (other.priceTo != null)
				return false;
		} else if (!priceTo.equals(other.priceTo))
			return false;
		if (requestDate == null) {
			if (other.requestDate != null)
				return false;
		} else if (!requestDate.equals(other.requestDate))
			return false;
		if (stars == null) {
			if (other.stars != null)
				return false;
		} else if (!stars.equals(other.stars))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
    
    
}
