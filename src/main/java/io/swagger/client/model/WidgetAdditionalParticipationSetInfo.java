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
import io.swagger.client.model.ParticipantSetMemberInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WidgetAdditionalParticipationSetInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:50.276+05:30")
public class WidgetAdditionalParticipationSetInfo {
  @SerializedName("memberInfos")
  private List<ParticipantSetMemberInfo> memberInfos = null;

  @SerializedName("order")
  private Integer order = null;

  /**
   * Role assumed by all participants in the set (signer, approver, etc.) Widget First Participant will only have roles - Signer, Approver, Acceptor and Form Filler
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    SIGNER("SIGNER"),
    
    DELEGATE_TO_SIGNER("DELEGATE_TO_SIGNER"),
    
    APPROVER("APPROVER"),
    
    DELEGATE_TO_APPROVER("DELEGATE_TO_APPROVER"),
    
    ACCEPTOR("ACCEPTOR"),
    
    DELEGATE_TO_ACCEPTOR("DELEGATE_TO_ACCEPTOR"),
    
    FORM_FILLER("FORM_FILLER"),
    
    DELEGATE_TO_FORM_FILLER("DELEGATE_TO_FORM_FILLER"),
    
    CERTIFIED_RECIPIENT("CERTIFIED_RECIPIENT"),
    
    DELEGATE_TO_CERTIFIED_RECIPIENT("DELEGATE_TO_CERTIFIED_RECIPIENT");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String text) {
      for (RoleEnum b : RoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RoleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("role")
  private RoleEnum role = null;

  public WidgetAdditionalParticipationSetInfo memberInfos(List<ParticipantSetMemberInfo> memberInfos) {
    this.memberInfos = memberInfos;
    return this;
  }

  public WidgetAdditionalParticipationSetInfo addMemberInfosItem(ParticipantSetMemberInfo memberInfosItem) {
    if (this.memberInfos == null) {
      this.memberInfos = new ArrayList<ParticipantSetMemberInfo>();
    }
    this.memberInfos.add(memberInfosItem);
    return this;
  }

   /**
   * Array of ParticipantInfo objects, containing participant - specific data (email, e.g.). All participants in the array belong to the same set. Currently we are supporting only one member in the set. Since the email of the widget signer is unknown at the time of widget creation, the email should be left empty and its optional security options should be provided. 
   * @return memberInfos
  **/
  @ApiModelProperty(value = "Array of ParticipantInfo objects, containing participant - specific data (email, e.g.). All participants in the array belong to the same set. Currently we are supporting only one member in the set. Since the email of the widget signer is unknown at the time of widget creation, the email should be left empty and its optional security options should be provided. ")
  public List<ParticipantSetMemberInfo> getMemberInfos() {
    return memberInfos;
  }

  public void setMemberInfos(List<ParticipantSetMemberInfo> memberInfos) {
    this.memberInfos = memberInfos;
  }

  public WidgetAdditionalParticipationSetInfo order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Index indicating position at which signing group needs to sign. Additional participant to sign at first place is assigned a index of 1. Widget participant should not have any order specified. Widget participant should not have any email address and and can not have phone authentication applied. Different signingOrder specified in input should form a valid consecutive increasing sequence of integers. Otherwise signingOrder will be considered invalid
   * @return order
  **/
  @ApiModelProperty(value = "Index indicating position at which signing group needs to sign. Additional participant to sign at first place is assigned a index of 1. Widget participant should not have any order specified. Widget participant should not have any email address and and can not have phone authentication applied. Different signingOrder specified in input should form a valid consecutive increasing sequence of integers. Otherwise signingOrder will be considered invalid")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public WidgetAdditionalParticipationSetInfo role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Role assumed by all participants in the set (signer, approver, etc.) Widget First Participant will only have roles - Signer, Approver, Acceptor and Form Filler
   * @return role
  **/
  @ApiModelProperty(value = "Role assumed by all participants in the set (signer, approver, etc.) Widget First Participant will only have roles - Signer, Approver, Acceptor and Form Filler")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetAdditionalParticipationSetInfo widgetAdditionalParticipationSetInfo = (WidgetAdditionalParticipationSetInfo) o;
    return Objects.equals(this.memberInfos, widgetAdditionalParticipationSetInfo.memberInfos) &&
        Objects.equals(this.order, widgetAdditionalParticipationSetInfo.order) &&
        Objects.equals(this.role, widgetAdditionalParticipationSetInfo.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberInfos, order, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetAdditionalParticipationSetInfo {\n");
    
    sb.append("    memberInfos: ").append(toIndentedString(memberInfos)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

