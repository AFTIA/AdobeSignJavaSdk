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
import io.swagger.client.model.DocumentPageInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CombinedDocumentPagesInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:30:55.372+05:30")
public class CombinedDocumentPagesInfo {
  @SerializedName("documentPagesInfo")
  private List<DocumentPageInfo> documentPagesInfo = null;

  public CombinedDocumentPagesInfo documentPagesInfo(List<DocumentPageInfo> documentPagesInfo) {
    this.documentPagesInfo = documentPagesInfo;
    return this;
  }

  public CombinedDocumentPagesInfo addDocumentPagesInfoItem(DocumentPageInfo documentPagesInfoItem) {
    if (this.documentPagesInfo == null) {
      this.documentPagesInfo = new ArrayList<DocumentPageInfo>();
    }
    this.documentPagesInfo.add(documentPagesInfoItem);
    return this;
  }

   /**
   * List of basic information of all pages of the combined document of an Agreement.
   * @return documentPagesInfo
  **/
  @ApiModelProperty(value = "List of basic information of all pages of the combined document of an Agreement.")
  public List<DocumentPageInfo> getDocumentPagesInfo() {
    return documentPagesInfo;
  }

  public void setDocumentPagesInfo(List<DocumentPageInfo> documentPagesInfo) {
    this.documentPagesInfo = documentPagesInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CombinedDocumentPagesInfo combinedDocumentPagesInfo = (CombinedDocumentPagesInfo) o;
    return Objects.equals(this.documentPagesInfo, combinedDocumentPagesInfo.documentPagesInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentPagesInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CombinedDocumentPagesInfo {\n");
    
    sb.append("    documentPagesInfo: ").append(toIndentedString(documentPagesInfo)).append("\n");
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

