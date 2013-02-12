package dk.cphbusiness.choir.contract.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MemberDetail implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private long id;
  private String firstName;
  private String lastName;
  private String title;
  //private boolean active = true;
  //private boolean shy = false;
  private Date dateOfBirth;
  private VoiceSummary voice;
  private int voiceCode = 0;
  private Map<String, RoleSummary> roles =
      new HashMap<String, RoleSummary>();
  private String[] roleCodes;
  private String street;
  private String zipCode;
  private String city;
  private String email;
  private String phone;

  public MemberDetail() {
//    active = true;
    dateOfBirth = new Date();
    roleCodes = new String[0];
    }

  /**
   * Create a new member detail from backend.
   * 
   * Use this constructor to create new member details from
   * a backend application.
   * 
   * @param id Member id.
   * @param firstName First name.
   * @param lastName Last name.
   * @param title Title in role.
   * @param active Whether this member is active.
   * @param shy Whether this member will hide address.
   * @param dateOfBirth Date of birth.
   * @param voice Voice summary.
   * @param roles Collection of role summaries.
   * @param street Street address.
   * @param zipCode Zip or postal code.
   * @param city City.
   * @param email Email.
   * @param phone Phone number.
   */
  public MemberDetail(
      long id,
      String firstName,
      String lastName,
      String title,
      boolean active,
      boolean shy,
      Date dateOfBirth,
      VoiceSummary voice,
      Collection<RoleSummary> roles,
      String street,
      String zipCode,
      String city,
      String email,
      String phone
      ) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.title = title;
//    this.active = active;
//    this.shy = shy;
    this.voice = voice;
    if (voice != null) this.voiceCode = voice.getCode();
    if (roles != null) {
      roleCodes = new String[roles.size()];
      int i = 0;
      for (RoleSummary role : roles) {
        roleCodes[i++] = role.getCode();
        this.roles.put(role.getCode(), role);
        }
      }
    this.dateOfBirth = dateOfBirth;
    this.street = street;
    this.zipCode = zipCode;
    this.city = city;
    this.email = email;
    this.phone = phone;
    }

  /**
   * Create a new member detail from frontend.
   * 
   * Use this constructor to create new member details from
   * a frontend application.
   * 
   * @param id Member id.
   * @param firstName First name.
   * @param lastName Last name.
   * @param dateOfBirth Date of birth.
   * @param voiceCode Voice code.
   * @param roleCodes Array of role codes.
   * @param street Street address.
   * @param zipCode Zip or postal code.
   * @param city City.
   * @param email Email.
   * @param phone Phone number.
   */
  public MemberDetail(
      long id,
      String firstName,
      String lastName,
      String title,
      boolean active,
      boolean shy,
      Date dateOfBirth,
      int voiceCode,
      String[] rolesCodes,
      String street,
      String zipCode,
      String city,
      String email,
      String phone
      ) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.title = title;
//    this.active = active;
//    this.shy = shy;
    this.voiceCode = voiceCode;
    this.roleCodes = rolesCodes;
    this.dateOfBirth = dateOfBirth;
    this.street = street;
    this.zipCode = zipCode;
    this.city = city;
    this.email = email;
    this.phone = phone;
    }

  
  
  public long getId() {
    return id;
    }

  public String getFirstName() {
    return firstName;
    }

  public String getLastName() {
    return lastName;
    }

  public String getTitle() {
    return title;
    }

  public void setTitle(String title) {
    this.title = title;
    }

//  public boolean isActive() {
//    return active;
//    }
//
//  public void setActive(boolean active) {
//    this.active = active;
//    }
//
//  public boolean isShy() {
//    return shy;
//    }
//
//  public void setShy(boolean shy) {
//    this.shy = shy;
//    }
  
  public Date getDateOfBirth() {
    return dateOfBirth;
    }

  public VoiceSummary getVoice() {
    return voice;
    }

  public int getVoiceCode() {
    return voiceCode;
    }

  public Collection<RoleSummary> getRoles() {
    return roles.values();
    }
  
  public Map<String, RoleSummary> getRolesMap() {
    return roles;
    }

  public String[] getRoleCodes() {
    return roleCodes;
    }

  public String getStreet() {
    return street;
    }

  public String getZipCode() {
    return zipCode;
    }

  public String getCity() {
    return city;
    }

  public String getEmail() {
    return email;
    }

  public String getPhone() {
    return phone;
    }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
    }

  public void setLastName(String lastName) {
    this.lastName = lastName;
    }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    }

  public void setVoiceCode(int voiceCode) {
    this.voiceCode = voiceCode;
    }

  public void setRoleCodes(String[] roleCodes) {
    this.roleCodes = roleCodes;
    }

  public void setStreet(String street) {
    this.street = street;
    }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
    }

  public void setCity(String city) {
    this.city = city;
    }

  public void setEmail(String email) {
    this.email = email;
    }

  public void setPhone(String phone) {
    this.phone = phone;
    }
  
  }
