package com.github.aruizca.service.db.entity;

// Generated 12/10/2012 10:27:12 AM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * UserEntity generated by hbm2java
 */
@Entity
@Table(name = "USERS", schema = "ABROS_OWNER", uniqueConstraints = @UniqueConstraint(columnNames = "USERNAME"))
public class UserEntity implements java.io.Serializable {

	private BigDecimal userId;
	private String username;
	private String password;
	private String email;
	private UserDetailEntity userDetailEntity;
	private Set<RoleEntity> roleEntities = new HashSet<RoleEntity>(0);

	public UserEntity() {
	}

	public UserEntity(BigDecimal userId, String username, String password,
			String email) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public UserEntity(BigDecimal userId, String username, String password,
			String email, UserDetailEntity userDetailEntity,
			Set<RoleEntity> roleEntities) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.userDetailEntity = userDetailEntity;
		this.roleEntities = roleEntities;
	}

	@Id
	@Column(name = "USER_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	@Column(name = "USERNAME", unique = true, nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "EMAIL", nullable = false, length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "userEntity")
	public UserDetailEntity getUserDetailEntity() {
		return this.userDetailEntity;
	}

	public void setUserDetailEntity(UserDetailEntity userDetailEntity) {
		this.userDetailEntity = userDetailEntity;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "USER_ROLE", schema = "ABROS_OWNER", joinColumns = { @JoinColumn(name = "USER_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID", nullable = false, updatable = false) })
	public Set<RoleEntity> getRoleEntities() {
		return this.roleEntities;
	}

	public void setRoleEntities(Set<RoleEntity> roleEntities) {
		this.roleEntities = roleEntities;
	}

}
