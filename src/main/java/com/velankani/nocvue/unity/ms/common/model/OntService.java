package com.velankani.nocvue.unity.ms.common.model;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Data
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
public class OntService {
	private String nodeName;
	private String actiontype;
	private String ipaddress;
	private String xmlProtocolPassword;
	private String serialNumber;
	private String emsIpAddress;
	private String ontprofName;
	private String portName;
	private String voiceSvctagactionName;
	private String portType;
	private String voiceSvctagaction;
	private String emsUserName;
	private String vendor;
	private String voiceVlan;
	private String registrationId;
	private String emsName;
	private String xmlProtocolUserName;
	private String model;
	private String xmlProtocolStartPort;
	private String ontProfile;
	private String ontId;
	private String username;

}
