package zm.co.creativate.entity;

import java.util.Date;

public class User {
	private Integer id;
	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private int user_role;
	private String othernames;
	private Date dateOfBirth;
	private String gender;
	private String email;
	private String country;
	private String province;
	private String district;
	private Date timecreated;
	private Date lastlogin;
	private String picture;

	public User() {

	}

	public User(String firstname, String lastname, String username, String password, int user_role, String othernames,
			Date dateOfBirth, String gender, String email, String country, String province, String district,
			Date timecreated, Date lastlogin, String picture) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.user_role = user_role;
		this.othernames = othernames;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.email = email;
		this.country = country;
		this.province = province;
		this.district = district;
		this.timecreated = timecreated;
		this.lastlogin = lastlogin;
		this.picture = picture;
	}

	public Integer getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public int getUser_role() {
		return user_role;
	}

	public String getOthernames() {
		return othernames;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public String getCountry() {
		return country;
	}

	public String getProvince() {
		return province;
	}

	public String getDistrict() {
		return district;
	}

	public Date getTimecreated() {
		return timecreated;
	}

	public Date getLastlogin() {
		return lastlogin;
	}

	public String getPicture() {
		return picture;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUser_role(int user_role) {
		this.user_role = user_role;
	}

	public void setOthernames(String othernames) {
		this.othernames = othernames;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setTimecreated(Date timecreated) {
		this.timecreated = timecreated;
	}

	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
				+ ", password=" + password + ", user_role=" + user_role + ", othernames=" + othernames
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", email=" + email + ", country=" + country
				+ ", province=" + province + ", district=" + district + ", timecreated=" + timecreated + ", lastlogin="
				+ lastlogin + ", picture=" + picture + "]";
	}

	
}
