package dk.cphbusiness.choir.contract.dto;

import java.io.Serializable;
import java.util.Collection;

public class MusicDetail implements Serializable {
  private static final long serialVersionUID = 1L;

  private long id;
  private String title;
  private String opus;
  private ArtistSummary composer;
  private long composerId;
  private Collection<MaterialSummary> materials;
  private long[] materialIds;
  private int year;
  private String place;
  private String history;

  public MusicDetail() { }

  public MusicDetail(
      long id,
      String title,
      String opus,
      ArtistSummary composer,
      Collection<MaterialSummary> materials,
      int year,
      String place, 
      String history
      ) {
    this.id = id;
    this.title = title;
    this.opus = opus;
    this.composer = composer;
    this.composerId = composer.getId();
    this.materials = materials;
    this.materialIds = null;
    this.year = year;
    this.place = place;
    this.history = history;
    }

  public long getId() {
    return id;
    }

  public String getTitle() {
    return title;
    }

  public void setTitle(String title) {
    this.title = title;
    }

  public String getOpus() {
    return opus;
    }

  public void setOpus(String opus) {
    this.opus = opus;
    }

  public ArtistSummary getComposer() {
    return composer;
    }

  public void setComposerId(long composerId) {
    this.composerId = composerId;
    }

  /**
   * Get the composer id;
   * @return 
   */
  public long getComposerId() {
    return composerId;
    }
  
  public Collection<MaterialSummary> getMaterials() {
    return materials;
    }

  public void setMaterialIds(long[] materialIds) {
    this.materialIds = materialIds;
    }

  /**
   * Get the material ids if materials collection was changed.
   * 
   * @return null if no change otherwise the material ids.
   */
  public long[] getMaterialIds() {
    return materialIds;
    }
  
  public int getYear() {
    return year;
    }

  public void setYear(int year) {
    this.year = year;
    }

  public String getPlace() {
    return place;
    }

  public void setPlace(String place) {
    this.place = place;
    }

  public String getHistory() {
    return history;
    }

  public void setHistory(String history) {
    this.history = history;
    }
  
  
  
  
  }
