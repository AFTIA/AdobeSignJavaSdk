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
import io.swagger.client.model.ReminderInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RemindersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:30:55.372+05:30")
public class RemindersResponse {
  @SerializedName("reminderInfoList")
  private List<ReminderInfo> reminderInfoList = null;

  public RemindersResponse reminderInfoList(List<ReminderInfo> reminderInfoList) {
    this.reminderInfoList = reminderInfoList;
    return this;
  }

  public RemindersResponse addReminderInfoListItem(ReminderInfo reminderInfoListItem) {
    if (this.reminderInfoList == null) {
      this.reminderInfoList = new ArrayList<ReminderInfo>();
    }
    this.reminderInfoList.add(reminderInfoListItem);
    return this;
  }

   /**
   * A list of one or more reminders created on the agreement specified by the unique identifier agreementId by the user invoking the API.
   * @return reminderInfoList
  **/
  @ApiModelProperty(value = "A list of one or more reminders created on the agreement specified by the unique identifier agreementId by the user invoking the API.")
  public List<ReminderInfo> getReminderInfoList() {
    return reminderInfoList;
  }

  public void setReminderInfoList(List<ReminderInfo> reminderInfoList) {
    this.reminderInfoList = reminderInfoList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemindersResponse remindersResponse = (RemindersResponse) o;
    return Objects.equals(this.reminderInfoList, remindersResponse.reminderInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reminderInfoList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemindersResponse {\n");
    
    sb.append("    reminderInfoList: ").append(toIndentedString(reminderInfoList)).append("\n");
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

