package org.packt.online.cart.portal.model.data;

// Generated 11 1, 15 3:03:23 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BillingAddress generated by hbm2java
 */
@Entity
@Table(name = "billing_address", catalog = "ocs")
public class BillingAddress implements java.io.Serializable {

	private int transId;
	private CustomerAccount customerAccount;
	private String billingAddress;
	private Set<BillingStatement> billingStatements = new HashSet<BillingStatement>(
			0);

	public BillingAddress() {
	}

	public BillingAddress(int transId, CustomerAccount customerAccount,
			String billingAddress) {
		this.transId = transId;
		this.customerAccount = customerAccount;
		this.billingAddress = billingAddress;
	}

	public BillingAddress(int transId, CustomerAccount customerAccount,
			String billingAddress, Set<BillingStatement> billingStatements) {
		this.transId = transId;
		this.customerAccount = customerAccount;
		this.billingAddress = billingAddress;
		this.billingStatements = billingStatements;
	}

	@Id
	@Column(name = "transId", unique = true, nullable = false)
	public int getTransId() {
		return this.transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", nullable = false)
	public CustomerAccount getCustomerAccount() {
		return this.customerAccount;
	}

	public void setCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccount = customerAccount;
	}

	@Column(name = "billingAddress", nullable = false, length = 45)
	public String getBillingAddress() {
		return this.billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "billingAddress")
	public Set<BillingStatement> getBillingStatements() {
		return this.billingStatements;
	}

	public void setBillingStatements(Set<BillingStatement> billingStatements) {
		this.billingStatements = billingStatements;
	}

}
