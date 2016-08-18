package org.packt.online.cart.portal.model.data;

// Generated 11 1, 15 3:03:23 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Login generated by hbm2java
 */

@Entity
@Table(name = "login", catalog = "ocs", uniqueConstraints = @UniqueConstraint(columnNames = {
		"id", "username" }))
public class Login implements java.io.Serializable {

	private Integer id;
	private CustomerAccount customerAccount;
	private String username;
	private String password;
	private String encPassword;
	private Set<RolePermission> rolePermissions = new HashSet<RolePermission>(0);

	public Login() {
	}

	public Login(CustomerAccount customerAccount, String username,
			String password, String encPassword) {
		this.customerAccount = customerAccount;
		this.username = username;
		this.password = password;
		this.encPassword = encPassword;
	}

	public Login(CustomerAccount customerAccount, String username,
			String password, String encPassword,
			Set<RolePermission> rolePermissions) {
		this.customerAccount = customerAccount;
		this.username = username;
		this.password = password;
		this.encPassword = encPassword;
		this.rolePermissions = rolePermissions;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "customerAccount"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public CustomerAccount getCustomerAccount() {
		return this.customerAccount;
	}

	public void setCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccount = customerAccount;
	}

	@Column(name = "username", nullable = false, length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "enc_password", nullable = false, length = 100)
	public String getEncPassword() {
		return this.encPassword;
	}

	public void setEncPassword(String encPassword) {
		this.encPassword = encPassword;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<RolePermission> getRolePermissions() {
		return this.rolePermissions;
	}

	public void setRolePermissions(Set<RolePermission> rolePermissions) {
		this.rolePermissions = rolePermissions;
	}

}
