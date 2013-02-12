package dk.cphbusiness.choir.contract.dto;

import java.io.Serializable;

public class MaterialSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  private long id;
  private String title;
  private String description; // including voices
  private String musicDescription;
  private String type;

  public MaterialSummary() { }

  public MaterialSummary(
      long id,
      String title, 
      String description, 
      String musicDescription, 
      String type
      ) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.musicDescription = musicDescription;
    this.type = type;
    }

  public long getId() {
    return id;
    }

  public String getTitle() {
    return title;
    }

  public String getDescription() {
    return description;
    }

  public String getMusicDescription() {
    return musicDescription;
    }

  public String getType() {
    return type;
    }
  
  }
