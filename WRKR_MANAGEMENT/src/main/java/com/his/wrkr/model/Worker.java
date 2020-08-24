package com.his.wrkr.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Worker {
	
	private Integer wrkrId;
	private Name wrkrName;
	private String wrkrEmail;
	private String wrkrPassword;
	private Character gender;
	private String wrkrRole;
	private Character isLock;
	private Character isDelete;
	private Date createdDate;
	private Date updateDate;
	

}
