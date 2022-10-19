package edu.paul.jf.oop;

public class ModelCobaCoba {

	private long id ;
	private String namaLengkap;
	private String alamat;
	private String noHp;
	private String noKtp;
	private short createdBy;
	private String createdDate;
	private short modifiedBy;
	private String modifiedDate;
	private char isDelete;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNamaLengkap() {
		return namaLengkap;
	}
	public void setNamaLengkap(String namaLengkap) {
		this.namaLengkap = namaLengkap;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getNoHp() {
		return noHp;
	}
	public void setNoHp(String noHp) {
		this.noHp = noHp;
	}
	public String getNoKtp() {
		return noKtp;
	}
	public void setNoKtp(String noKtp) {
		this.noKtp = noKtp;
	}
	public short getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(short createdBy) {
		this.createdBy = createdBy;
	}
	public short getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(short modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public char getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(char isDelete) {
		this.isDelete = isDelete;
	}
	
	
	
}