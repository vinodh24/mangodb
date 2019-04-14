package com.velankani.nocvue.unity.ms.common.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
@Document(collection = "addService")
@Data
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class AddService {
	@Id
	private String Id;
	private	String enableVoice;
	private	String clli;
	private	String nodeName;
	private	String portName;
	private	String technology;
	private	String subscriberId;
	private	String ontId;
	private	String ontProfile;
	private	String serialNumber;
	private	String registrationId;
	private	String ports;
	private	String bwprofile;
	private	String svctagaction;
	private	String outtag;
	private	String intag;
	private	String emsName;
	private	String deviceType;
	private	String vendor;
	private	String actiontype;
	private	String nodeDbId;
	private	String nodeDbId1;
	private	String portDbId;
	private	String shelfCardPort;
	private	String username;
	private	String desc;
	private	String model;
	private	String networkName;
	private	String description;
	private	String serviceOrder;
	private	String ipaddress;
	private	String seqNo;
}
