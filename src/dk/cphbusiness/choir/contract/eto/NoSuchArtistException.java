package dk.cphbusiness.choir.contract.eto;

public class NoSuchArtistException extends Exception {
  private static final long serialVersionUID = 1L;

  private long id;

  public NoSuchArtistException(long id, String string) {
    super(string);
    this.id = id;
    }
  
  public long getId() {
    return id;
    }
  
  }
