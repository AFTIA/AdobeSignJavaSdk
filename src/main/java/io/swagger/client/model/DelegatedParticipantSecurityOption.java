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
import io.swagger.client.model.PhoneInfo;
import java.io.IOException;

/**
 * DelegatedParticipantSecurityOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:30:55.372+05:30")
public class DelegatedParticipantSecurityOption {
  @SerializedName("phoneInfo")
  private PhoneInfo phoneInfo = null;

  public DelegatedParticipantSecurityOption phoneInfo(PhoneInfo phoneInfo) {
    this.phoneInfo = phoneInfo;
    return this;
  }

   /**
   * The phoneInfo required for the participant to view and sign the document
   * @return phoneInfo
  **/
  @ApiModelProperty(value = "The phoneInfo required for the participant to view and sign the document")
  public PhoneInfo getPhoneInfo() {
    return phoneInfo;
  }

  public void setPhoneInfo(PhoneInfo phoneInfo) {
    this.phoneInfo = phoneInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelegatedParticipantSecurityOption delegatedParticipantSecurityOption = (DelegatedParticipantSecurityOption) o;
    return Objects.equals(this.phoneInfo, delegatedParticipantSecurityOption.phoneInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegatedParticipantSecurityOption {\n");
    
    sb.append("    phoneInfo: ").append(toIndentedString(phoneInfo)).append("\n");
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

