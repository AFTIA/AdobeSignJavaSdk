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
import io.swagger.client.model.SigningUrl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SigningUrlSetInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:30:55.372+05:30")
public class SigningUrlSetInfo {
  @SerializedName("signingUrlSetName")
  private String signingUrlSetName = null;

  @SerializedName("signingUrls")
  private List<SigningUrl> signingUrls = null;

  public SigningUrlSetInfo signingUrlSetName(String signingUrlSetName) {
    this.signingUrlSetName = signingUrlSetName;
    return this;
  }

   /**
   * The name of the current signer set. Returned only, if the API caller is the sender of agreement
   * @return signingUrlSetName
  **/
  @ApiModelProperty(value = "The name of the current signer set. Returned only, if the API caller is the sender of agreement")
  public String getSigningUrlSetName() {
    return signingUrlSetName;
  }

  public void setSigningUrlSetName(String signingUrlSetName) {
    this.signingUrlSetName = signingUrlSetName;
  }

  public SigningUrlSetInfo signingUrls(List<SigningUrl> signingUrls) {
    this.signingUrls = signingUrls;
    return this;
  }

  public SigningUrlSetInfo addSigningUrlsItem(SigningUrl signingUrlsItem) {
    if (this.signingUrls == null) {
      this.signingUrls = new ArrayList<SigningUrl>();
    }
    this.signingUrls.add(signingUrlsItem);
    return this;
  }

   /**
   * An array of urls for current signer set.
   * @return signingUrls
  **/
  @ApiModelProperty(value = "An array of urls for current signer set.")
  public List<SigningUrl> getSigningUrls() {
    return signingUrls;
  }

  public void setSigningUrls(List<SigningUrl> signingUrls) {
    this.signingUrls = signingUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SigningUrlSetInfo signingUrlSetInfo = (SigningUrlSetInfo) o;
    return Objects.equals(this.signingUrlSetName, signingUrlSetInfo.signingUrlSetName) &&
        Objects.equals(this.signingUrls, signingUrlSetInfo.signingUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signingUrlSetName, signingUrls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SigningUrlSetInfo {\n");
    
    sb.append("    signingUrlSetName: ").append(toIndentedString(signingUrlSetName)).append("\n");
    sb.append("    signingUrls: ").append(toIndentedString(signingUrls)).append("\n");
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

