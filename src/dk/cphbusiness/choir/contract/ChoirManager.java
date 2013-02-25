package dk.cphbusiness.choir.contract;

import dk.cphbusiness.choir.contract.dto.ArtistDetail;
import dk.cphbusiness.choir.contract.dto.ArtistSummary;
import dk.cphbusiness.choir.contract.dto.MaterialDetail;
import dk.cphbusiness.choir.contract.dto.MaterialSummary;
import dk.cphbusiness.choir.contract.dto.MemberAuthentication;
import dk.cphbusiness.choir.contract.dto.MemberDetail;
import dk.cphbusiness.choir.contract.dto.MemberSummary;
import dk.cphbusiness.choir.contract.dto.MusicDetail;
import dk.cphbusiness.choir.contract.dto.MusicSummary;
import dk.cphbusiness.choir.contract.dto.RoleSummary;
import dk.cphbusiness.choir.contract.dto.VoiceSummary;
import dk.cphbusiness.choir.contract.eto.AuthenticationException;
import dk.cphbusiness.choir.contract.eto.NoSuchArtistException;
import dk.cphbusiness.choir.contract.eto.NoSuchMaterialException;
import dk.cphbusiness.choir.contract.eto.NoSuchMemberException;
import dk.cphbusiness.choir.contract.eto.NoSuchMusicException;
import java.util.Collection;
import javax.ejb.Remote;


@Remote
public interface ChoirManager {
  
  MemberAuthentication login(String email, String password) throws AuthenticationException;
  void logout();
  
  void changePassword(String oldPassword, String newPassword) throws AuthenticationException;
  
  Collection<VoiceSummary> listVoices();
  Collection<RoleSummary> listRoles();
  
  Collection<MemberSummary> listMembers();
  Collection<MemberSummary> listMembersByRole(String roleCode);
  Collection<MemberSummary> listMembersByVoices(int voiceCodes);
  
  MemberDetail findMember(long id)
      throws NoSuchMemberException;
  MemberDetail saveMember(MemberAuthentication user, MemberDetail member) 
      throws NoSuchMemberException, AuthenticationException;
  
  Collection<MaterialSummary> listMaterials();
  Collection<MaterialSummary> listMaterialsByVoices(int voiceCodes);
  Collection<MaterialSummary> listMaterialsByMusic(long musicId) throws NoSuchMusicException;
  
  MaterialDetail findMaterial(long id) throws NoSuchMaterialException;
  MaterialDetail saveMaterial(MemberAuthentication user, MaterialDetail material)
      throws NoSuchMaterialException, AuthenticationException;
  
  Collection<MusicSummary> listMusic();
  Collection<MusicSummary> listMusicByComposer(long composerId);
  
  MusicDetail findMusic(long id) throws NoSuchMusicException;
  MusicDetail saveMusic(MemberAuthentication user, MusicDetail music) 
      throws NoSuchMusicException, AuthenticationException;
  
  Collection<ArtistSummary> listArtists();
  Collection<ArtistSummary> listArtistsByPattern(String pattern);
  ArtistDetail findArtist(long id) throws NoSuchArtistException;
  ArtistDetail saveArtist(MemberAuthentication user, ArtistDetail artist) 
      throws NoSuchArtistException, AuthenticationException;
  
  }
