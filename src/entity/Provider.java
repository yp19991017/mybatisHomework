package entity;

import java.sql.Date;

public class Provider {
	private int id;//����
	private String proCode;//��Ӧ�̱���
	private String proName;//��Ӧ������
	private String peoDesc;//��Ӧ����ϸ����
	private String proContact;//��Ӧ����ϵ��
	private String proPhone;//��Ӧ�̵绰
	private String proAddress;//��Ӧ�̵�ַ
	private String proFax;//��Ӧ�̴���
	private int createBy;//������
	private Date creationDate;//����ʱ��
	private Date modifyDate;//����ʱ��
	private int modifyBy;//������
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProCode() {
		return proCode;
	}
	public void setProCode(String proCode) {
		this.proCode = proCode;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getPeoDesc() {
		return peoDesc;
	}
	public void setPeoDesc(String peoDesc) {
		this.peoDesc = peoDesc;
	}
	public String getProContact() {
		return proContact;
	}
	public void setProContact(String proContact) {
		this.proContact = proContact;
	}
	public String getProPhone() {
		return proPhone;
	}
	public void setProPhone(String proPhone) {
		this.proPhone = proPhone;
	}
	public String getProAddress() {
		return proAddress;
	}
	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}
	public String getProFax() {
		return proFax;
	}
	public void setProFax(String proFax) {
		this.proFax = proFax;
	}
	public int getCreateBy() {
		return createBy;
	}
	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	
}
