package sequoiaat.entity;

import java.time.LocalDateTime;

@Entity
@Table(name = "User_table")
@Data
public class User {
	
	@Id
	@GenerateValue(Strategy = Generate.Identity)
	@Column(name = "user_id")
	private long userId;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "password")
	private String password;
	@Column(name = "status")
	private String status;
	@Column(name = "registerTime")
	private LocalDateTime registerTime;
	
	@prePrist
	public setstatus() {
		if(this.status == null) {
			status = "active";
		}
		registerTime = LocalDateTime.now();
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(LocalDateTime registerTime) {
		this.registerTime = registerTime;
	}

	
	
}
