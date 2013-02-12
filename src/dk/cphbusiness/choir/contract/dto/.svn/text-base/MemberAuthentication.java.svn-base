package dk.cphbusiness.choir.contract.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MemberAuthentication implements Serializable {
  private static final long serialVersionUID = 1L;

  private long id;
  private String name;
  private Set<String> roleCodes = new HashSet<String>();

  public MemberAuthentication(long id, String name) {
    this.id = id;
    this.name = name;
    }

  public void addRoleCode(String roleCode) {
    roleCodes.add(roleCode);
    }
  
  public long getId() {
    return id;
    }

  public String getName() {
    return name;
    }
  
  public boolean isAdministrator() {
    return roleCodes.contains("ADM");
    }
  
  }
