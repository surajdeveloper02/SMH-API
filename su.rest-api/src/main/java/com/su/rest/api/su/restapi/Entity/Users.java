package com.su.rest.api.su.restapi.Entity;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.su.rest.api.su.restapi.Enum.ImageType;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@Column(name = "_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_email", nullable = false)
	private String email;
	@Column(name = "user_number", nullable = true)
	private String number;
	@Column(name = "user_image_type_likes", nullable = true)
	private List<ImageType> imageTypeLikes;
	@Column(name = "user_is_active",nullable = false, columnDefinition = "Boolean")
	private Boolean isActive;
	@Column(name = "user_can_download" ,nullable = false, columnDefinition = "Boolean")
	private Boolean canDownlaod;
	@Column(name = "user_download_count",nullable = true, columnDefinition = "Boolean")
	private Integer downlaodCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public List<ImageType> getImageTypeLikes() {
		return imageTypeLikes;
	}

	public void setImageTypeLikes(List<ImageType> imageTypeLikes) {
		this.imageTypeLikes = imageTypeLikes;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getCanDownlaod() {
		return canDownlaod;
	}

	public void setCanDownlaod(Boolean canDownlaod) {
		this.canDownlaod = canDownlaod;
	}

	public Integer getDownlaodCount() {
		return downlaodCount;
	}

	public void setDownlaodCount(Integer downlaodCount) {
		this.downlaodCount = downlaodCount;
	}

}
