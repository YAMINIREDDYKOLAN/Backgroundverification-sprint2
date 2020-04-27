package com.cg.backgroundverification.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="upload_document")
public class UploadDocumentDto {
	
	@Id
	@Column(name="upload_doc_id")
	private int uploadDocId;
	@Column(name="status")
    private String status;
	@Column(name="upload_date")
    private LocalDate uploadDate;
    @OneToOne
    // @JoinColumn(name="source" , referencedColumnName="emp_id")
    LoginDto loginDto;
    @OneToMany
    //@JoinColumn(name="source" ,referencedColumnName="doc_id")
    private List<DocumentDto> document;
	public UploadDocumentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UploadDocumentDto(int uploadDocId, String status, LocalDate uploadDate, LoginDto loginDto,
			List<DocumentDto> document) {
		super();
		this.uploadDocId = uploadDocId;
		this.status = status;
		this.uploadDate = uploadDate;
		this.loginDto = loginDto;
		this.document = document;
	}
	public int getUploadDocId() {
		return uploadDocId;
	}
	public void setUploadDocId(int uploadDocId) {
		this.uploadDocId = uploadDocId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(LocalDate uploadDate) {
		this.uploadDate = uploadDate;
	}
	public LoginDto getLoginDto() {
		return loginDto;
	}
	public void setLoginDto(LoginDto loginDto) {
		this.loginDto = loginDto;
	}
	public List<DocumentDto> getDocument() {
		return document;
	}
	public void setDocument(List<DocumentDto> document) {
		this.document = document;
	}
    

}
