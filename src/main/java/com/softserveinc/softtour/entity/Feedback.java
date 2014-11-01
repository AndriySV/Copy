package com.softserveinc.softtour.entity;

import javax.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "cleanliness", nullable = false, length = 1)
    private BigDecimal cleanliness;

    @Column(name = "comfort", nullable = false, length = 1)
    private BigDecimal comfort;

    @Column(name = "location", nullable = false, length = 1)
    private BigDecimal location;

    @Column(name = "valueForMoney", nullable = false, length = 1)
    private BigDecimal valueForMoney;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "hotel_id", nullable = false)
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Feedback() {
    }

    public Feedback(BigDecimal cleanliness, BigDecimal comfort,
                    BigDecimal location, BigDecimal valueForMoney,
                    String comment, Hotel hotel, User user) {

        this.cleanliness = cleanliness;
        this.comfort = comfort;
        this.location = location;
        this.valueForMoney = valueForMoney;
        this.comment = comment;
        this.hotel = hotel;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(BigDecimal cleanliness) {
        this.cleanliness = cleanliness;
    }

    public BigDecimal getComfort() {
        return comfort;
    }

    public void setComfort(BigDecimal comfort) {
        this.comfort = comfort;
    }

    public BigDecimal getLocation() {
        return location;
    }

    public void setLocation(BigDecimal location) {
        this.location = location;
    }

    public BigDecimal getValueForMoney() {
        return valueForMoney;
    }

    public void setValueForMoney(BigDecimal valueForMoney) {
        this.valueForMoney = valueForMoney;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((cleanliness == null) ? 0 : cleanliness.hashCode());
		result = prime * result + ((comfort == null) ? 0 : comfort.hashCode());
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result
				+ ((valueForMoney == null) ? 0 : valueForMoney.hashCode());
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
		Feedback other = (Feedback) obj;
		if (cleanliness == null) {
			if (other.cleanliness != null)
				return false;
		} else if (!cleanliness.equals(other.cleanliness))
			return false;
		if (comfort == null) {
			if (other.comfort != null)
				return false;
		} else if (!comfort.equals(other.comfort))
			return false;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (hotel == null) {
			if (other.hotel != null)
				return false;
		} else if (!hotel.equals(other.hotel))
			return false;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (valueForMoney == null) {
			if (other.valueForMoney != null)
				return false;
		} else if (!valueForMoney.equals(other.valueForMoney))
			return false;
		return true;
	}
    
}
