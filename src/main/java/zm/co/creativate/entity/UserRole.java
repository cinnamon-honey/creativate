package zm.co.creativate.entity;

public class UserRole {
	private Integer id;
	private String role_name;
	private String role_type;
	private String role_description;
	public UserRole() {
		super();
	}
	public UserRole(String role_name, String role_type, String role_description) {
		super();
		this.role_name = role_name;
		this.role_type = role_type;
		this.role_description = role_description;
	}
	public Integer getId() {
		return id;
	}
	public String getRole_name() {
		return role_name;
	}
	public String getRole_type() {
		return role_type;
	}
	public String getRole_description() {
		return role_description;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public void setRole_type(String role_type) {
		this.role_type = role_type;
	}
	public void setRole_description(String role_description) {
		this.role_description = role_description;
	}
	@Override
	public String toString() {
		return "UserRole [id=" + id + ", role_name=" + role_name + ", role_type=" + role_type + ", role_description="
				+ role_description + "]";
	}
	
	
}
