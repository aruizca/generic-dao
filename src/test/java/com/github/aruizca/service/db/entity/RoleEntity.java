package com.github.aruizca.service.db.entity;

// Generated 17/04/2012 3:45:49 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * RoleEntity generated by hbm2java
 */
@Entity
@Table(name = "ROLE")
public class RoleEntity implements java.io.Serializable {

	private Integer roleId;
	private String roleName;
	private Set<UserEntity> userEntities = new HashSet<UserEntity>(0);

	public RoleEntity() {
	}

	public RoleEntity(Integer roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public RoleEntity(Integer roleId, String roleName, Set<UserEntity> userEntities) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.userEntities = userEntities;
	}

	@Id
	@Column(name = "ROLE_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Column(name = "ROLE_NAME", nullable = false, length = 20)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "roleEntities")
	public Set<UserEntity> getUserEntities() {
		return this.userEntities;
	}

	public void setUserEntities(Set<UserEntity> userEntities) {
		this.userEntities = userEntities;
	}

}
