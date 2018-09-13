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

/**
 * Document
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:50.276+05:30")
public class Document {
  @SerializedName("id")
  private String id = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("numPages")
  private Integer numPages = null;

  public Document id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the document. In case of PUT call, this is the only field that is accepted in Document structure. Name and mimeType are ignored in case of PUT call
   * @return id
  **/
  @ApiModelProperty(value = "ID of the document. In case of PUT call, this is the only field that is accepted in Document structure. Name and mimeType are ignored in case of PUT call")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Document label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label of the document
   * @return label
  **/
  @ApiModelProperty(value = "Label of the document")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Document mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * mimeType of the original file. This is returned in GET but not accepted back in PUT
   * @return mimeType
  **/
  @ApiModelProperty(value = "mimeType of the original file. This is returned in GET but not accepted back in PUT")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Document name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the original document uploaded. This is returned in GET but not accepted back in PUT
   * @return name
  **/
  @ApiModelProperty(value = "Name of the original document uploaded. This is returned in GET but not accepted back in PUT")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Document numPages(Integer numPages) {
    this.numPages = numPages;
    return this;
  }

   /**
   * Number of pages in the document
   * @return numPages
  **/
  @ApiModelProperty(value = "Number of pages in the document")
  public Integer getNumPages() {
    return numPages;
  }

  public void setNumPages(Integer numPages) {
    this.numPages = numPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.id, document.id) &&
        Objects.equals(this.label, document.label) &&
        Objects.equals(this.mimeType, document.mimeType) &&
        Objects.equals(this.name, document.name) &&
        Objects.equals(this.numPages, document.numPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, mimeType, name, numPages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numPages: ").append(toIndentedString(numPages)).append("\n");
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

