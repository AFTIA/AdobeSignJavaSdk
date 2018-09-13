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
import io.swagger.client.model.DeviceLocation;
import io.swagger.client.model.DigitalSignatureInfo;
import java.io.IOException;
import java.util.Date;

/**
 * MegasignEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:25.254+05:30")
public class MegasignEvent {
  @SerializedName("actingUserEmail")
  private String actingUserEmail = null;

  @SerializedName("actingUserIpAddress")
  private String actingUserIpAddress = null;

  @SerializedName("actingUserName")
  private String actingUserName = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("date")
  private Date date = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("deviceLocation")
  private DeviceLocation deviceLocation = null;

  @SerializedName("devicePhoneNumber")
  private String devicePhoneNumber = null;

  @SerializedName("digitalSignatureInfo")
  private DigitalSignatureInfo digitalSignatureInfo = null;

  @SerializedName("initiatingUserEmail")
  private String initiatingUserEmail = null;

  @SerializedName("initiatingUserName")
  private String initiatingUserName = null;

  @SerializedName("participantEmail")
  private String participantEmail = null;

  @SerializedName("participantId")
  private String participantId = null;

  /**
   * Role assumed by all participants in the participant set the participant belongs to (signer, approver etc.).
   */
  @JsonAdapter(ParticipantRoleEnum.Adapter.class)
  public enum ParticipantRoleEnum {
    SIGNER("SIGNER"),
    
    DELEGATE_TO_SIGNER("DELEGATE_TO_SIGNER"),
    
    APPROVER("APPROVER"),
    
    DELEGATE_TO_APPROVER("DELEGATE_TO_APPROVER"),
    
    ACCEPTOR("ACCEPTOR"),
    
    DELEGATE_TO_ACCEPTOR("DELEGATE_TO_ACCEPTOR"),
    
    FORM_FILLER("FORM_FILLER"),
    
    DELEGATE_TO_FORM_FILLER("DELEGATE_TO_FORM_FILLER"),
    
    CERTIFIED_RECIPIENT("CERTIFIED_RECIPIENT"),
    
    DELEGATE_TO_CERTIFIED_RECIPIENT("DELEGATE_TO_CERTIFIED_RECIPIENT"),
    
    SHARE("SHARE"),
    
    SENDER("SENDER");

    private String value;

    ParticipantRoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ParticipantRoleEnum fromValue(String text) {
      for (ParticipantRoleEnum b : ParticipantRoleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ParticipantRoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ParticipantRoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ParticipantRoleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ParticipantRoleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("participantRole")
  private ParticipantRoleEnum participantRole = null;

  @SerializedName("synchronizationId")
  private String synchronizationId = null;

  /**
   * Type of MegaSign event
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AUTO_CANCELLED_CONVERSION_PROBLEM("AUTO_CANCELLED_CONVERSION_PROBLEM"),
    
    CREATED("CREATED"),
    
    EXPIRED("EXPIRED"),
    
    EMAIL_BOUNCED("EMAIL_BOUNCED"),
    
    RECALLED("RECALLED"),
    
    SHARED("SHARED"),
    
    VAULTED("VAULTED");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("vaultEventId")
  private String vaultEventId = null;

  @SerializedName("vaultProviderName")
  private String vaultProviderName = null;

  @SerializedName("versionId")
  private String versionId = null;

  public MegasignEvent actingUserEmail(String actingUserEmail) {
    this.actingUserEmail = actingUserEmail;
    return this;
  }

   /**
   * Email address of the user that created the event
   * @return actingUserEmail
  **/
  @ApiModelProperty(value = "Email address of the user that created the event")
  public String getActingUserEmail() {
    return actingUserEmail;
  }

  public void setActingUserEmail(String actingUserEmail) {
    this.actingUserEmail = actingUserEmail;
  }

  public MegasignEvent actingUserIpAddress(String actingUserIpAddress) {
    this.actingUserIpAddress = actingUserIpAddress;
    return this;
  }

   /**
   * The IP address of the user that created the event
   * @return actingUserIpAddress
  **/
  @ApiModelProperty(value = "The IP address of the user that created the event")
  public String getActingUserIpAddress() {
    return actingUserIpAddress;
  }

  public void setActingUserIpAddress(String actingUserIpAddress) {
    this.actingUserIpAddress = actingUserIpAddress;
  }

  public MegasignEvent actingUserName(String actingUserName) {
    this.actingUserName = actingUserName;
    return this;
  }

   /**
   * The name of the acting user
   * @return actingUserName
  **/
  @ApiModelProperty(value = "The name of the acting user")
  public String getActingUserName() {
    return actingUserName;
  }

  public void setActingUserName(String actingUserName) {
    this.actingUserName = actingUserName;
  }

  public MegasignEvent comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * The event comment. For RECALLED or REJECTED, the reason given by the user that initiates the event. For DELEGATE or SHARE, the message from the acting user to the participant
   * @return comment
  **/
  @ApiModelProperty(value = "The event comment. For RECALLED or REJECTED, the reason given by the user that initiates the event. For DELEGATE or SHARE, the message from the acting user to the participant")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public MegasignEvent date(Date date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the audit event. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time
   * @return date
  **/
  @ApiModelProperty(value = "The date of the audit event. Format would be yyyy-MM-dd'T'HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time")
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public MegasignEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the audit event
   * @return description
  **/
  @ApiModelProperty(value = "A description of the audit event")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MegasignEvent deviceLocation(DeviceLocation deviceLocation) {
    this.deviceLocation = deviceLocation;
    return this;
  }

   /**
   * Location of the device that generated the event (This value may be null due to limited privileges)
   * @return deviceLocation
  **/
  @ApiModelProperty(value = "Location of the device that generated the event (This value may be null due to limited privileges)")
  public DeviceLocation getDeviceLocation() {
    return deviceLocation;
  }

  public void setDeviceLocation(DeviceLocation deviceLocation) {
    this.deviceLocation = deviceLocation;
  }

  public MegasignEvent devicePhoneNumber(String devicePhoneNumber) {
    this.devicePhoneNumber = devicePhoneNumber;
    return this;
  }

   /**
   * Phone number from the device used when the participation is completed on a mobile phone
   * @return devicePhoneNumber
  **/
  @ApiModelProperty(value = "Phone number from the device used when the participation is completed on a mobile phone")
  public String getDevicePhoneNumber() {
    return devicePhoneNumber;
  }

  public void setDevicePhoneNumber(String devicePhoneNumber) {
    this.devicePhoneNumber = devicePhoneNumber;
  }

  public MegasignEvent digitalSignatureInfo(DigitalSignatureInfo digitalSignatureInfo) {
    this.digitalSignatureInfo = digitalSignatureInfo;
    return this;
  }

   /**
   * This is present for ESIGNED events when the participation is signed digitally
   * @return digitalSignatureInfo
  **/
  @ApiModelProperty(value = "This is present for ESIGNED events when the participation is signed digitally")
  public DigitalSignatureInfo getDigitalSignatureInfo() {
    return digitalSignatureInfo;
  }

  public void setDigitalSignatureInfo(DigitalSignatureInfo digitalSignatureInfo) {
    this.digitalSignatureInfo = digitalSignatureInfo;
  }

  public MegasignEvent initiatingUserEmail(String initiatingUserEmail) {
    this.initiatingUserEmail = initiatingUserEmail;
    return this;
  }

   /**
   * Email address of the user that initiated the event on behalf of the acting user when the account is shared. Will be empty if there is no account sharing in effect
   * @return initiatingUserEmail
  **/
  @ApiModelProperty(value = "Email address of the user that initiated the event on behalf of the acting user when the account is shared. Will be empty if there is no account sharing in effect")
  public String getInitiatingUserEmail() {
    return initiatingUserEmail;
  }

  public void setInitiatingUserEmail(String initiatingUserEmail) {
    this.initiatingUserEmail = initiatingUserEmail;
  }

  public MegasignEvent initiatingUserName(String initiatingUserName) {
    this.initiatingUserName = initiatingUserName;
    return this;
  }

   /**
   * Full name of the user that initiated the event on behalf of the acting user when the account is shared. Will be empty if there is no account sharing in effect
   * @return initiatingUserName
  **/
  @ApiModelProperty(value = "Full name of the user that initiated the event on behalf of the acting user when the account is shared. Will be empty if there is no account sharing in effect")
  public String getInitiatingUserName() {
    return initiatingUserName;
  }

  public void setInitiatingUserName(String initiatingUserName) {
    this.initiatingUserName = initiatingUserName;
  }

  public MegasignEvent participantEmail(String participantEmail) {
    this.participantEmail = participantEmail;
    return this;
  }

   /**
   * Email address of the user that is the participant for the event. This may be different than the acting user for certain event types. For example, for a DELEGATION event, this is the user who was delegated to
   * @return participantEmail
  **/
  @ApiModelProperty(value = "Email address of the user that is the participant for the event. This may be different than the acting user for certain event types. For example, for a DELEGATION event, this is the user who was delegated to")
  public String getParticipantEmail() {
    return participantEmail;
  }

  public void setParticipantEmail(String participantEmail) {
    this.participantEmail = participantEmail;
  }

  public MegasignEvent participantId(String participantId) {
    this.participantId = participantId;
    return this;
  }

   /**
   * The unique identifier of the participant for the event. This may be different than the acting user for certain event types. For example, for a DELEGATION event, this is the user who was delegated to
   * @return participantId
  **/
  @ApiModelProperty(value = "The unique identifier of the participant for the event. This may be different than the acting user for certain event types. For example, for a DELEGATION event, this is the user who was delegated to")
  public String getParticipantId() {
    return participantId;
  }

  public void setParticipantId(String participantId) {
    this.participantId = participantId;
  }

  public MegasignEvent participantRole(ParticipantRoleEnum participantRole) {
    this.participantRole = participantRole;
    return this;
  }

   /**
   * Role assumed by all participants in the participant set the participant belongs to (signer, approver etc.).
   * @return participantRole
  **/
  @ApiModelProperty(value = "Role assumed by all participants in the participant set the participant belongs to (signer, approver etc.).")
  public ParticipantRoleEnum getParticipantRole() {
    return participantRole;
  }

  public void setParticipantRole(ParticipantRoleEnum participantRole) {
    this.participantRole = participantRole;
  }

  public MegasignEvent synchronizationId(String synchronizationId) {
    this.synchronizationId = synchronizationId;
    return this;
  }

   /**
   * A unique identifier linking offline events to synchronization events (specified for offline signing events and synchronization events, else null)
   * @return synchronizationId
  **/
  @ApiModelProperty(value = "A unique identifier linking offline events to synchronization events (specified for offline signing events and synchronization events, else null)")
  public String getSynchronizationId() {
    return synchronizationId;
  }

  public void setSynchronizationId(String synchronizationId) {
    this.synchronizationId = synchronizationId;
  }

  public MegasignEvent type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of MegaSign event
   * @return type
  **/
  @ApiModelProperty(value = "Type of MegaSign event")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MegasignEvent vaultEventId(String vaultEventId) {
    this.vaultEventId = vaultEventId;
    return this;
  }

   /**
   * The identifier assigned by the vault provider for the vault event (if vaulted, otherwise null)
   * @return vaultEventId
  **/
  @ApiModelProperty(value = "The identifier assigned by the vault provider for the vault event (if vaulted, otherwise null)")
  public String getVaultEventId() {
    return vaultEventId;
  }

  public void setVaultEventId(String vaultEventId) {
    this.vaultEventId = vaultEventId;
  }

  public MegasignEvent vaultProviderName(String vaultProviderName) {
    this.vaultProviderName = vaultProviderName;
    return this;
  }

   /**
   * Name of the vault provider for the vault event (if vaulted, otherwise null)
   * @return vaultProviderName
  **/
  @ApiModelProperty(value = "Name of the vault provider for the vault event (if vaulted, otherwise null)")
  public String getVaultProviderName() {
    return vaultProviderName;
  }

  public void setVaultProviderName(String vaultProviderName) {
    this.vaultProviderName = vaultProviderName;
  }

  public MegasignEvent versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * An ID which uniquely identifies the version of the document associated with this audit event
   * @return versionId
  **/
  @ApiModelProperty(value = "An ID which uniquely identifies the version of the document associated with this audit event")
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MegasignEvent megasignEvent = (MegasignEvent) o;
    return Objects.equals(this.actingUserEmail, megasignEvent.actingUserEmail) &&
        Objects.equals(this.actingUserIpAddress, megasignEvent.actingUserIpAddress) &&
        Objects.equals(this.actingUserName, megasignEvent.actingUserName) &&
        Objects.equals(this.comment, megasignEvent.comment) &&
        Objects.equals(this.date, megasignEvent.date) &&
        Objects.equals(this.description, megasignEvent.description) &&
        Objects.equals(this.deviceLocation, megasignEvent.deviceLocation) &&
        Objects.equals(this.devicePhoneNumber, megasignEvent.devicePhoneNumber) &&
        Objects.equals(this.digitalSignatureInfo, megasignEvent.digitalSignatureInfo) &&
        Objects.equals(this.initiatingUserEmail, megasignEvent.initiatingUserEmail) &&
        Objects.equals(this.initiatingUserName, megasignEvent.initiatingUserName) &&
        Objects.equals(this.participantEmail, megasignEvent.participantEmail) &&
        Objects.equals(this.participantId, megasignEvent.participantId) &&
        Objects.equals(this.participantRole, megasignEvent.participantRole) &&
        Objects.equals(this.synchronizationId, megasignEvent.synchronizationId) &&
        Objects.equals(this.type, megasignEvent.type) &&
        Objects.equals(this.vaultEventId, megasignEvent.vaultEventId) &&
        Objects.equals(this.vaultProviderName, megasignEvent.vaultProviderName) &&
        Objects.equals(this.versionId, megasignEvent.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actingUserEmail, actingUserIpAddress, actingUserName, comment, date, description, deviceLocation, devicePhoneNumber, digitalSignatureInfo, initiatingUserEmail, initiatingUserName, participantEmail, participantId, participantRole, synchronizationId, type, vaultEventId, vaultProviderName, versionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MegasignEvent {\n");
    
    sb.append("    actingUserEmail: ").append(toIndentedString(actingUserEmail)).append("\n");
    sb.append("    actingUserIpAddress: ").append(toIndentedString(actingUserIpAddress)).append("\n");
    sb.append("    actingUserName: ").append(toIndentedString(actingUserName)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceLocation: ").append(toIndentedString(deviceLocation)).append("\n");
    sb.append("    devicePhoneNumber: ").append(toIndentedString(devicePhoneNumber)).append("\n");
    sb.append("    digitalSignatureInfo: ").append(toIndentedString(digitalSignatureInfo)).append("\n");
    sb.append("    initiatingUserEmail: ").append(toIndentedString(initiatingUserEmail)).append("\n");
    sb.append("    initiatingUserName: ").append(toIndentedString(initiatingUserName)).append("\n");
    sb.append("    participantEmail: ").append(toIndentedString(participantEmail)).append("\n");
    sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
    sb.append("    participantRole: ").append(toIndentedString(participantRole)).append("\n");
    sb.append("    synchronizationId: ").append(toIndentedString(synchronizationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vaultEventId: ").append(toIndentedString(vaultEventId)).append("\n");
    sb.append("    vaultProviderName: ").append(toIndentedString(vaultProviderName)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

