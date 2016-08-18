package org.packt.online.cart.portal.model.data;

// Generated 11 1, 15 3:03:23 PM by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * OrderPayment generated by hbm2java
 */
@Entity
@Table(name = "order_payment")
public class OrderPayment implements java.io.Serializable {

	private Integer id;
	private BillingStatement billingStatement;
	private Status status;
	private double total;

	public OrderPayment() {
	}

	public OrderPayment(BillingStatement billingStatement, Status status,
			double total) {
		this.billingStatement = billingStatement;
		this.status = status;
		this.total = total;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transId", nullable = false)
	public BillingStatement getBillingStatement() {
		return this.billingStatement;
	}

	public void setBillingStatement(BillingStatement billingStatement) {
		this.billingStatement = billingStatement;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status", nullable = false)
	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Column(name = "total", nullable = false, precision = 10)
	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
