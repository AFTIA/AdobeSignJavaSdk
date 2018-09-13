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
 * CommonViewConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:50.276+05:30")
public class CommonViewConfiguration {
  @SerializedName("autoLoginUser")
  private Boolean autoLoginUser = null;

  @SerializedName("locale")
  private String locale = null;

  @SerializedName("noChrome")
  private Boolean noChrome = null;

  public CommonViewConfiguration autoLoginUser(Boolean autoLoginUser) {
    this.autoLoginUser = autoLoginUser;
    return this;
  }

   /**
   * Auto LogIn Flag. If true, the URL returned will automatically log the user in. If false, the URL returned will require the credentials. By default its value is false
   * @return autoLoginUser
  **/
  @ApiModelProperty(value = "Auto LogIn Flag. If true, the URL returned will automatically log the user in. If false, the URL returned will require the credentials. By default its value is false")
  public Boolean isAutoLoginUser() {
    return autoLoginUser;
  }

  public void setAutoLoginUser(Boolean autoLoginUser) {
    this.autoLoginUser = autoLoginUser;
  }

  public CommonViewConfiguration locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Message template locale
   * @return locale
  **/
  @ApiModelProperty(value = "Message template locale")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  public CommonViewConfiguration noChrome(Boolean noChrome) {
    this.noChrome = noChrome;
    return this;
  }

   /**
   * No Chrome Flag. If true, the embedded page is shown without a navigation header or footer. If false, the standard page header and footer will be present. By default its value is false
   * @return noChrome
  **/
  @ApiModelProperty(value = "No Chrome Flag. If true, the embedded page is shown without a navigation header or footer. If false, the standard page header and footer will be present. By default its value is false")
  public Boolean isNoChrome() {
    return noChrome;
  }

  public void setNoChrome(Boolean noChrome) {
    this.noChrome = noChrome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonViewConfiguration commonViewConfiguration = (CommonViewConfiguration) o;
    return Objects.equals(this.autoLoginUser, commonViewConfiguration.autoLoginUser) &&
        Objects.equals(this.locale, commonViewConfiguration.locale) &&
        Objects.equals(this.noChrome, commonViewConfiguration.noChrome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoLoginUser, locale, noChrome);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonViewConfiguration {\n");
    
    sb.append("    autoLoginUser: ").append(toIndentedString(autoLoginUser)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    noChrome: ").append(toIndentedString(noChrome)).append("\n");
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

