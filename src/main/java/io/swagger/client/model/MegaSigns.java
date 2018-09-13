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
import io.swagger.client.model.MegaSign;
import io.swagger.client.model.PageInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MegaSigns
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:25.254+05:30")
public class MegaSigns {
  @SerializedName("megaSignList")
  private List<MegaSign> megaSignList = null;

  @SerializedName("page")
  private PageInfo page = null;

  public MegaSigns megaSignList(List<MegaSign> megaSignList) {
    this.megaSignList = megaSignList;
    return this;
  }

  public MegaSigns addMegaSignListItem(MegaSign megaSignListItem) {
    if (this.megaSignList == null) {
      this.megaSignList = new ArrayList<MegaSign>();
    }
    this.megaSignList.add(megaSignListItem);
    return this;
  }

   /**
   * An array of MegaSign parent agreements
   * @return megaSignList
  **/
  @ApiModelProperty(value = "An array of MegaSign parent agreements")
  public List<MegaSign> getMegaSignList() {
    return megaSignList;
  }

  public void setMegaSignList(List<MegaSign> megaSignList) {
    this.megaSignList = megaSignList;
  }

  public MegaSigns page(PageInfo page) {
    this.page = page;
    return this;
  }

   /**
   * Pagination information for navigating through the response
   * @return page
  **/
  @ApiModelProperty(value = "Pagination information for navigating through the response")
  public PageInfo getPage() {
    return page;
  }

  public void setPage(PageInfo page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MegaSigns megaSigns = (MegaSigns) o;
    return Objects.equals(this.megaSignList, megaSigns.megaSignList) &&
        Objects.equals(this.page, megaSigns.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(megaSignList, page);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MegaSigns {\n");
    
    sb.append("    megaSignList: ").append(toIndentedString(megaSignList)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

