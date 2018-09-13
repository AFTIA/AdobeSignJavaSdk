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
import io.swagger.client.model.LibraryView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LibraryDocumentViewResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:19.178+05:30")
public class LibraryDocumentViewResponse {
  @SerializedName("libraryViewList")
  private List<LibraryView> libraryViewList = null;

  public LibraryDocumentViewResponse libraryViewList(List<LibraryView> libraryViewList) {
    this.libraryViewList = libraryViewList;
    return this;
  }

  public LibraryDocumentViewResponse addLibraryViewListItem(LibraryView libraryViewListItem) {
    if (this.libraryViewList == null) {
      this.libraryViewList = new ArrayList<LibraryView>();
    }
    this.libraryViewList.add(libraryViewListItem);
    return this;
  }

   /**
   * List of library docuemnt views
   * @return libraryViewList
  **/
  @ApiModelProperty(value = "List of library docuemnt views")
  public List<LibraryView> getLibraryViewList() {
    return libraryViewList;
  }

  public void setLibraryViewList(List<LibraryView> libraryViewList) {
    this.libraryViewList = libraryViewList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryDocumentViewResponse libraryDocumentViewResponse = (LibraryDocumentViewResponse) o;
    return Objects.equals(this.libraryViewList, libraryDocumentViewResponse.libraryViewList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(libraryViewList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryDocumentViewResponse {\n");
    
    sb.append("    libraryViewList: ").append(toIndentedString(libraryViewList)).append("\n");
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

