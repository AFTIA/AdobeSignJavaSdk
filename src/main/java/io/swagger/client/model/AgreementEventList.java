/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AgreementEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AgreementEventList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:30:55.372+05:30")
public class AgreementEventList {
  @SerializedName("events")
  private List<AgreementEvent> events = null;

  public AgreementEventList events(List<AgreementEvent> events) {
    this.events = events;
    return this;
  }

  public AgreementEventList addEventsItem(AgreementEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<AgreementEvent>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * An array of event objects.
   * @return events
  **/
  @ApiModelProperty(value = "An array of event objects.")
  public List<AgreementEvent> getEvents() {
    return events;
  }

  public void setEvents(List<AgreementEvent> events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementEventList agreementEventList = (AgreementEventList) o;
    return Objects.equals(this.events, agreementEventList.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementEventList {\n");
    
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

