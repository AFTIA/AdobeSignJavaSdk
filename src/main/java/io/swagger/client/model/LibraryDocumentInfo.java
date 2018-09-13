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
import io.swagger.client.model.FileInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * LibraryDocumentInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:19.178+05:30")
public class LibraryDocumentInfo {
  @SerializedName("createdDate")
  private Date createdDate = null;

  @SerializedName("creatorEmail")
  private String creatorEmail = null;

  @SerializedName("fileInfos")
  private List<FileInfo> fileInfos = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Specifies who should have access to this library document. GLOBAL sharing mode is not applicable in POST/PUT calls
   */
  @JsonAdapter(SharingModeEnum.Adapter.class)
  public enum SharingModeEnum {
    USER("USER"),
    
    GROUP("GROUP"),
    
    ACCOUNT("ACCOUNT"),
    
    GLOBAL("GLOBAL");

    private String value;

    SharingModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SharingModeEnum fromValue(String text) {
      for (SharingModeEnum b : SharingModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SharingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SharingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SharingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SharingModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sharingMode")
  private SharingModeEnum sharingMode = null;

  /**
   * State of the library document.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    AUTHORING("AUTHORING"),
    
    ACTIVE("ACTIVE");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  /**
   * Status of the library document
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    AUTHORING("AUTHORING"),
    
    ACTIVE("ACTIVE"),
    
    REMOVED("REMOVED");

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

  /**
   * Gets or Sets templateTypes
   */
  @JsonAdapter(TemplateTypesEnum.Adapter.class)
  public enum TemplateTypesEnum {
    DOCUMENT("DOCUMENT"),
    
    FORM_FIELD_LAYER("FORM_FIELD_LAYER");

    private String value;

    TemplateTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TemplateTypesEnum fromValue(String text) {
      for (TemplateTypesEnum b : TemplateTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TemplateTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TemplateTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TemplateTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TemplateTypesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("templateTypes")
  private List<TemplateTypesEnum> templateTypes = null;

  public LibraryDocumentInfo createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date when library document was created. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time
   * @return createdDate
  **/
  @ApiModelProperty(value = "Date when library document was created. Format would be yyyy-MM-dd'T'HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time")
  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public LibraryDocumentInfo creatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
    return this;
  }

   /**
   * Email address of the library document creator. It will be ignored in POST call
   * @return creatorEmail
  **/
  @ApiModelProperty(value = "Email address of the library document creator. It will be ignored in POST call")
  public String getCreatorEmail() {
    return creatorEmail;
  }

  public void setCreatorEmail(String creatorEmail) {
    this.creatorEmail = creatorEmail;
  }

  public LibraryDocumentInfo fileInfos(List<FileInfo> fileInfos) {
    this.fileInfos = fileInfos;
    return this;
  }

  public LibraryDocumentInfo addFileInfosItem(FileInfo fileInfosItem) {
    if (this.fileInfos == null) {
      this.fileInfos = new ArrayList<FileInfo>();
    }
    this.fileInfos.add(fileInfosItem);
    return this;
  }

   /**
   * A list of one or more files (or references to files) that will be used to create the template. If more than one file is provided, they will be combined into one PDF. Note: Only a single parameter in every FileInfo object must be specified
   * @return fileInfos
  **/
  @ApiModelProperty(value = "A list of one or more files (or references to files) that will be used to create the template. If more than one file is provided, they will be combined into one PDF. Note: Only a single parameter in every FileInfo object must be specified")
  public List<FileInfo> getFileInfos() {
    return fileInfos;
  }

  public void setFileInfos(List<FileInfo> fileInfos) {
    this.fileInfos = fileInfos;
  }

  public LibraryDocumentInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier that is used to refer to the library template. It will be ignored in POST call
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier that is used to refer to the library template. It will be ignored in POST call")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LibraryDocumentInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the library template that will be used to identify it, in emails and on the website
   * @return name
  **/
  @ApiModelProperty(value = "The name of the library template that will be used to identify it, in emails and on the website")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LibraryDocumentInfo sharingMode(SharingModeEnum sharingMode) {
    this.sharingMode = sharingMode;
    return this;
  }

   /**
   * Specifies who should have access to this library document. GLOBAL sharing mode is not applicable in POST/PUT calls
   * @return sharingMode
  **/
  @ApiModelProperty(value = "Specifies who should have access to this library document. GLOBAL sharing mode is not applicable in POST/PUT calls")
  public SharingModeEnum getSharingMode() {
    return sharingMode;
  }

  public void setSharingMode(SharingModeEnum sharingMode) {
    this.sharingMode = sharingMode;
  }

  public LibraryDocumentInfo state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * State of the library document.
   * @return state
  **/
  @ApiModelProperty(value = "State of the library document.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public LibraryDocumentInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the library document
   * @return status
  **/
  @ApiModelProperty(value = "Status of the library document")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public LibraryDocumentInfo templateTypes(List<TemplateTypesEnum> templateTypes) {
    this.templateTypes = templateTypes;
    return this;
  }

  public LibraryDocumentInfo addTemplateTypesItem(TemplateTypesEnum templateTypesItem) {
    if (this.templateTypes == null) {
      this.templateTypes = new ArrayList<TemplateTypesEnum>();
    }
    this.templateTypes.add(templateTypesItem);
    return this;
  }

   /**
   * A list of one or more library template types
   * @return templateTypes
  **/
  @ApiModelProperty(value = "A list of one or more library template types")
  public List<TemplateTypesEnum> getTemplateTypes() {
    return templateTypes;
  }

  public void setTemplateTypes(List<TemplateTypesEnum> templateTypes) {
    this.templateTypes = templateTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryDocumentInfo libraryDocumentInfo = (LibraryDocumentInfo) o;
    return Objects.equals(this.createdDate, libraryDocumentInfo.createdDate) &&
        Objects.equals(this.creatorEmail, libraryDocumentInfo.creatorEmail) &&
        Objects.equals(this.fileInfos, libraryDocumentInfo.fileInfos) &&
        Objects.equals(this.id, libraryDocumentInfo.id) &&
        Objects.equals(this.name, libraryDocumentInfo.name) &&
        Objects.equals(this.sharingMode, libraryDocumentInfo.sharingMode) &&
        Objects.equals(this.state, libraryDocumentInfo.state) &&
        Objects.equals(this.status, libraryDocumentInfo.status) &&
        Objects.equals(this.templateTypes, libraryDocumentInfo.templateTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, creatorEmail, fileInfos, id, name, sharingMode, state, status, templateTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryDocumentInfo {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    creatorEmail: ").append(toIndentedString(creatorEmail)).append("\n");
    sb.append("    fileInfos: ").append(toIndentedString(fileInfos)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sharingMode: ").append(toIndentedString(sharingMode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    templateTypes: ").append(toIndentedString(templateTypes)).append("\n");
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

