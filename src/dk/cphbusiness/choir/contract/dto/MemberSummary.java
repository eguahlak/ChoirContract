package dk.cphbusiness.choir.contract.dto;

import java.io.Serializable;

public class MemberSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  private long id;
  private String voiceName;
  private String name;
  private String title;
  private String address;
  private String email;
  private String phone;
  private String birthDay;
  private boolean active;

  // public MemberSummary() { }
  
  public MemberSummary(
      long id, 
      String voiceName,
      String name,
      String title,
      String address,
      String email,
      String phone,
      String birthDay,
      boolean active
      ) {
    this.id = id;
    this.voiceName = voiceName;
    this.name = name;
    this.title = title;
    this.address = address;
    this.email = email;
    this.phone = phone;
    this.birthDay = birthDay;
    this.active = active;
    }

  public long getId() {
    return id;
    }

  public String getVoiceName() {
    return voiceName;
    }

  public String getName() {
    return name;
    }

  public String getTitle() {
    return title;
    }
  
  public String getAddress() {
    return address;
    }

  public String getEmail() {
    return email;
    }

  public String getPhone() {
    return phone;
    }

  public String getBirthDay() {
    return birthDay;
    }

  public boolean isActive() {
    return active;
    }
  
  }
