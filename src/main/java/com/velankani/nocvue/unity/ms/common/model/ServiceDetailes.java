package com.velankani.nocvue.unity.ms.common.model;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@Data
@Document(collection = "services")
@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonIgnoreProperties
//@FieldFilterSetting(className = Services.class, fields = {"id"})
public class ServiceDetailes {
	@Id
	//@JsonProperty( value = "id", access = JsonProperty.Access.WRITE_ONLY)
	private String id;
	@JsonProperty("DataServices")
	private DataService dataServices;
	private Common common;
	private Port port;
	@JsonProperty("VoiceServices")
	private VoiceService voiceServices;
	@JsonProperty("VideoServices")
	private VideoService videoServices;
	@JsonProperty("OntService")
	private OntService ontService;
}
