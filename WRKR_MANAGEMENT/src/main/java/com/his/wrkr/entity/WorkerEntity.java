
package com.his.wrkr.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor

@AllArgsConstructor

@Entity

@Table(name = "ADMIN_CASE_WRKR_REGI")
public class WorkerEntity {

	@Id

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator =

	"worker_sequence")

	@SequenceGenerator(name = "worker_sequence", sequenceName = "WRKR_ID_SEQ", allocationSize = 1)

	@Column(name = "WRKR_ID")
	private Integer wrkrId;
	
	@Transient
	private String firstName;
	
	@Transient
	private String lastName;
	
	
	@Column(name = "WRKR_NAME")
	
	private String wrkrName;

	@Column(name = "WRKR_EMAIL")
	private String wrkrEmail;

	@Column(name = "WRKR_PWD")
	private String wrkrPassword;

	@Column(name = "GENDER")
	private Character gender;

	@Column(name = "WRKR_ROLE")
	private Character wrkrRole;

	@Column(name = "ISLOCK")
	private String isLock;

	@Column(name = "ISDELETE")
	private Character isDelete;

	@Column(name = "CREATED_DATE", updatable = false)

	@Temporal(TemporalType.DATE)

	@CreationTimestamp
	private Date createdDate;

	@Column(name = "UPDATED_DATE", insertable = false)

	@Temporal(TemporalType.DATE)

	@UpdateTimestamp
	private Date updateDate;
}
