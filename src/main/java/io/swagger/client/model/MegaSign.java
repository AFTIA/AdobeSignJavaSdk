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
import java.io.IOException;
import java.util.Date;

/**
 * MegaSign
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:25.254+05:30")
public class MegaSign {
  @SerializedName("displayDate")
  private Date displayDate = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("esign")
  private Boolean esign = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Current status of the MegaSign parent agreement from the perspective of the user
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    WAITING_FOR_MY_SIGNATURE("WAITING_FOR_MY_SIGNATURE"),
    
    IN_PROCESS("IN_PROCESS"),
    
    CANCELLED("CANCELLED"),
    
    ARCHIVED("ARCHIVED"),
    
    COMPLETED("COMPLETED"),
    
    WAITING_FOR_AUTHORING("WAITING_FOR_AUTHORING"),
    
    WAITING_FOR_PREFILL("WAITING_FOR_PREFILL");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public MegaSign displayDate(Date displayDate) {
    this.displayDate = displayDate;
    return this;
  }

   /**
   * The display date for the MegaSign parent agreement. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time
   * @return displayDate
  **/
  @ApiModelProperty(value = "The display date for the MegaSign parent agreement. Format would be yyyy-MM-dd'T'HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time")
  public Date getDisplayDate() {
    return displayDate;
  }

  public void setDisplayDate(Date displayDate) {
    this.displayDate = displayDate;
  }

  public MegaSign id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the MegaSign parent agreement
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of the MegaSign parent agreement")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MegaSign esign(Boolean esign) {
    this.esign = esign;
    return this;
  }

   /**
   * True, if the signature type of the MegaSign parent agreement is ESIGN. False, if the signature type of the MegaSign parent agreement is WRITTEN
   * @return esign
  **/
  @ApiModelProperty(value = "True, if the signature type of the MegaSign parent agreement is ESIGN. False, if the signature type of the MegaSign parent agreement is WRITTEN")
  public Boolean isEsign() {
    return esign;
  }

  public void setEsign(Boolean esign) {
    this.esign = esign;
  }

  public MegaSign name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the MegaSign parent agreement
   * @return name
  **/
  @ApiModelProperty(value = "Name of the MegaSign parent agreement")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MegaSign status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Current status of the MegaSign parent agreement from the perspective of the user
   * @return status
  **/
  @ApiModelProperty(value = "Current status of the MegaSign parent agreement from the perspective of the user")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MegaSign megaSign = (MegaSign) o;
    return Objects.equals(this.displayDate, megaSign.displayDate) &&
        Objects.equals(this.id, megaSign.id) &&
        Objects.equals(this.esign, megaSign.esign) &&
        Objects.equals(this.name, megaSign.name) &&
        Objects.equals(this.status, megaSign.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayDate, id, esign, name, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MegaSign {\n");
    
    sb.append("    displayDate: ").append(toIndentedString(displayDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    esign: ").append(toIndentedString(esign)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

