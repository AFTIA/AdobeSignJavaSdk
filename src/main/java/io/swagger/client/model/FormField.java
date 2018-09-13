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
import io.swagger.client.model.FormFieldConditionalAction;
import io.swagger.client.model.FormFieldHyperlink;
import io.swagger.client.model.FormFieldLocation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A form field for an agreement.
 */
@ApiModel(description = "A form field for an agreement.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:30:55.372+05:30")
public class FormField {
  /**
   * Alignment of the text.
   */
  @JsonAdapter(AlignmentEnum.Adapter.class)
  public enum AlignmentEnum {
    LEFT("LEFT"),
    
    RIGHT("RIGHT"),
    
    CENTER("CENTER");

    private String value;

    AlignmentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlignmentEnum fromValue(String text) {
      for (AlignmentEnum b : AlignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AlignmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlignmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlignmentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AlignmentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("alignment")
  private AlignmentEnum alignment = null;

  @SerializedName("assignee")
  private String assignee = null;

  @SerializedName("backgroundColor")
  private String backgroundColor = null;

  @SerializedName("borderColor")
  private String borderColor = null;

  /**
   * Style of the border of the field.
   */
  @JsonAdapter(BorderStyleEnum.Adapter.class)
  public enum BorderStyleEnum {
    SOLID("SOLID"),
    
    DASHED("DASHED"),
    
    BEVELED("BEVELED"),
    
    INSET("INSET"),
    
    UNDERLINE("UNDERLINE");

    private String value;

    BorderStyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BorderStyleEnum fromValue(String text) {
      for (BorderStyleEnum b : BorderStyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BorderStyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BorderStyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BorderStyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return BorderStyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("borderStyle")
  private BorderStyleEnum borderStyle = null;

  @SerializedName("borderWidth")
  private Double borderWidth = null;

  @SerializedName("calculated")
  private Boolean calculated = null;

  @SerializedName("conditionalAction")
  private FormFieldConditionalAction conditionalAction = null;

  /**
   * Content Type of the form field.
   */
  @JsonAdapter(ContentTypeEnum.Adapter.class)
  public enum ContentTypeEnum {
    DATA("DATA"),
    
    SIGNATURE_BLOCK("SIGNATURE_BLOCK"),
    
    SIGNATURE("SIGNATURE"),
    
    SIGNER_NAME("SIGNER_NAME"),
    
    SIGNER_FIRST_NAME("SIGNER_FIRST_NAME"),
    
    SIGNER_LAST_NAME("SIGNER_LAST_NAME"),
    
    SIGNER_INITIALS("SIGNER_INITIALS"),
    
    SIGNER_EMAIL("SIGNER_EMAIL"),
    
    SIGNER_TITLE("SIGNER_TITLE"),
    
    SIGNER_COMPANY("SIGNER_COMPANY"),
    
    SIGNATURE_DATE("SIGNATURE_DATE"),
    
    AGREEMENT_NAME("AGREEMENT_NAME"),
    
    AGREEMENT_MESSAGE("AGREEMENT_MESSAGE"),
    
    TRANSACTION_ID("TRANSACTION_ID"),
    
    SIGNATURE_STAMP("SIGNATURE_STAMP"),
    
    PAYMENT("PAYMENT"),
    
    DIGITAL_SIGNATURE("DIGITAL_SIGNATURE");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContentTypeEnum fromValue(String text) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ContentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContentTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("contentType")
  private ContentTypeEnum contentType = null;

  @SerializedName("defaultValue")
  private String defaultValue = null;

  @SerializedName("displayFormat")
  private String displayFormat = null;

  /**
   * Format type of the text field.
   */
  @JsonAdapter(DisplayFormatTypeEnum.Adapter.class)
  public enum DisplayFormatTypeEnum {
    DEFAULT("DEFAULT"),
    
    DATE("DATE"),
    
    NUMBER("NUMBER");

    private String value;

    DisplayFormatTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisplayFormatTypeEnum fromValue(String text) {
      for (DisplayFormatTypeEnum b : DisplayFormatTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DisplayFormatTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisplayFormatTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisplayFormatTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DisplayFormatTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("displayFormatType")
  private DisplayFormatTypeEnum displayFormatType = null;

  @SerializedName("displayLabel")
  private String displayLabel = null;

  @SerializedName("fontColor")
  private String fontColor = null;

  @SerializedName("fontName")
  private String fontName = null;

  @SerializedName("fontSize")
  private Double fontSize = null;

  @SerializedName("hiddenOptions")
  private List<String> hiddenOptions = null;

  @SerializedName("hyperlink")
  private FormFieldHyperlink hyperlink = null;

  /**
   * Input type of the form field
   */
  @JsonAdapter(InputTypeEnum.Adapter.class)
  public enum InputTypeEnum {
    TEXT_FIELD("TEXT_FIELD"),
    
    MULTILINE("MULTILINE"),
    
    PASSWORD("PASSWORD"),
    
    RADIO("RADIO"),
    
    CHECKBOX("CHECKBOX"),
    
    DROP_DOWN("DROP_DOWN"),
    
    LISTBOX("LISTBOX"),
    
    SIGNATURE("SIGNATURE"),
    
    PDF_SIGNATURE("PDF_SIGNATURE"),
    
    BUTTON("BUTTON"),
    
    BLOCK("BLOCK"),
    
    FILE_CHOOSER("FILE_CHOOSER"),
    
    COMB("COMB"),
    
    INLINE_IMAGE("INLINE_IMAGE"),
    
    UNSUPPORTED("UNSUPPORTED");

    private String value;

    InputTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InputTypeEnum fromValue(String text) {
      for (InputTypeEnum b : InputTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InputTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InputTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InputTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InputTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("inputType")
  private InputTypeEnum inputType = null;

  @SerializedName("locations")
  private List<FormFieldLocation> locations = null;

  @SerializedName("masked")
  private Boolean masked = null;

  @SerializedName("maskingText")
  private String maskingText = null;

  @SerializedName("maxLength")
  private Integer maxLength = null;

  @SerializedName("maxValue")
  private Double maxValue = null;

  @SerializedName("minLength")
  private Integer minLength = null;

  @SerializedName("minValue")
  private Double minValue = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Origin of Form Field
   */
  @JsonAdapter(OriginEnum.Adapter.class)
  public enum OriginEnum {
    AUTHORED("AUTHORED"),
    
    GENERATED("GENERATED"),
    
    IMPORTED("IMPORTED");

    private String value;

    OriginEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OriginEnum fromValue(String text) {
      for (OriginEnum b : OriginEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OriginEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OriginEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OriginEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("origin")
  private OriginEnum origin = null;

  /**
   * The type of radio button (if field is radio button, identified by inputType).
   */
  @JsonAdapter(RadioCheckTypeEnum.Adapter.class)
  public enum RadioCheckTypeEnum {
    CIRCLE("CIRCLE"),
    
    CHECK("CHECK"),
    
    CROSS("CROSS"),
    
    DIAMOND("DIAMOND"),
    
    SQUARE("SQUARE"),
    
    STAR("STAR");

    private String value;

    RadioCheckTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RadioCheckTypeEnum fromValue(String text) {
      for (RadioCheckTypeEnum b : RadioCheckTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RadioCheckTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RadioCheckTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RadioCheckTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RadioCheckTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("radioCheckType")
  private RadioCheckTypeEnum radioCheckType = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("tooltip")
  private String tooltip = null;

  /**
   * Rule for validating the field value.
   */
  @JsonAdapter(ValidationEnum.Adapter.class)
  public enum ValidationEnum {
    NONE("NONE"),
    
    STRING("STRING"),
    
    NUMBER("NUMBER"),
    
    DATE("DATE"),
    
    DATE_CUSTOM("DATE_CUSTOM"),
    
    TIME("TIME"),
    
    ZIP("ZIP"),
    
    PHONE("PHONE"),
    
    SOCIAL_SEC("SOCIAL_SEC"),
    
    EMAIL("EMAIL"),
    
    CURRENCY("CURRENCY"),
    
    PERCENT("PERCENT"),
    
    FORMULA("FORMULA"),
    
    CUSTOM("CUSTOM"),
    
    XFA_PICTURE("XFA_PICTURE");

    private String value;

    ValidationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidationEnum fromValue(String text) {
      for (ValidationEnum b : ValidationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ValidationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ValidationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("validation")
  private ValidationEnum validation = null;

  @SerializedName("validationData")
  private String validationData = null;

  @SerializedName("validationErrMsg")
  private String validationErrMsg = null;

  @SerializedName("valueExpression")
  private String valueExpression = null;

  @SerializedName("visible")
  private Boolean visible = null;

  @SerializedName("visibleOptions")
  private List<String> visibleOptions = null;

  public FormField alignment(AlignmentEnum alignment) {
    this.alignment = alignment;
    return this;
  }

   /**
   * Alignment of the text.
   * @return alignment
  **/
  @ApiModelProperty(value = "Alignment of the text.")
  public AlignmentEnum getAlignment() {
    return alignment;
  }

  public void setAlignment(AlignmentEnum alignment) {
    this.alignment = alignment;
  }

  public FormField assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Who the field is assigned to.  Either a participant set id, null, NOBODY or PREFILL.
   * @return assignee
  **/
  @ApiModelProperty(value = "Who the field is assigned to.  Either a participant set id, null, NOBODY or PREFILL.")
  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public FormField backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Background color of the form field in RGB or HEX format
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "Background color of the form field in RGB or HEX format")
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }

  public FormField borderColor(String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

   /**
   * Color of the border of the field in RGB or HEX format
   * @return borderColor
  **/
  @ApiModelProperty(value = "Color of the border of the field in RGB or HEX format")
  public String getBorderColor() {
    return borderColor;
  }

  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }

  public FormField borderStyle(BorderStyleEnum borderStyle) {
    this.borderStyle = borderStyle;
    return this;
  }

   /**
   * Style of the border of the field.
   * @return borderStyle
  **/
  @ApiModelProperty(value = "Style of the border of the field.")
  public BorderStyleEnum getBorderStyle() {
    return borderStyle;
  }

  public void setBorderStyle(BorderStyleEnum borderStyle) {
    this.borderStyle = borderStyle;
  }

  public FormField borderWidth(Double borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }

   /**
   * Width of the border of the field in pixels
   * @return borderWidth
  **/
  @ApiModelProperty(value = "Width of the border of the field in pixels")
  public Double getBorderWidth() {
    return borderWidth;
  }

  public void setBorderWidth(Double borderWidth) {
    this.borderWidth = borderWidth;
  }

  public FormField calculated(Boolean calculated) {
    this.calculated = calculated;
    return this;
  }

   /**
   * true if this field&#39;s value is calculated from an expression, else false
   * @return calculated
  **/
  @ApiModelProperty(value = "true if this field's value is calculated from an expression, else false")
  public Boolean isCalculated() {
    return calculated;
  }

  public void setCalculated(Boolean calculated) {
    this.calculated = calculated;
  }

  public FormField conditionalAction(FormFieldConditionalAction conditionalAction) {
    this.conditionalAction = conditionalAction;
    return this;
  }

   /**
   * A predicate (or set of predicates) that determines whether this field is visible and enabled.
   * @return conditionalAction
  **/
  @ApiModelProperty(value = "A predicate (or set of predicates) that determines whether this field is visible and enabled.")
  public FormFieldConditionalAction getConditionalAction() {
    return conditionalAction;
  }

  public void setConditionalAction(FormFieldConditionalAction conditionalAction) {
    this.conditionalAction = conditionalAction;
  }

  public FormField contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Content Type of the form field.
   * @return contentType
  **/
  @ApiModelProperty(value = "Content Type of the form field.")
  public ContentTypeEnum getContentType() {
    return contentType;
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public FormField defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Default value of the form field
   * @return defaultValue
  **/
  @ApiModelProperty(value = "Default value of the form field")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public FormField displayFormat(String displayFormat) {
    this.displayFormat = displayFormat;
    return this;
  }

   /**
   * Format of the value of the field to be displayed based on the displayFormatType property.
   * @return displayFormat
  **/
  @ApiModelProperty(value = "Format of the value of the field to be displayed based on the displayFormatType property.")
  public String getDisplayFormat() {
    return displayFormat;
  }

  public void setDisplayFormat(String displayFormat) {
    this.displayFormat = displayFormat;
  }

  public FormField displayFormatType(DisplayFormatTypeEnum displayFormatType) {
    this.displayFormatType = displayFormatType;
    return this;
  }

   /**
   * Format type of the text field.
   * @return displayFormatType
  **/
  @ApiModelProperty(value = "Format type of the text field.")
  public DisplayFormatTypeEnum getDisplayFormatType() {
    return displayFormatType;
  }

  public void setDisplayFormatType(DisplayFormatTypeEnum displayFormatType) {
    this.displayFormatType = displayFormatType;
  }

  public FormField displayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
    return this;
  }

   /**
   * Display label attached to the field
   * @return displayLabel
  **/
  @ApiModelProperty(value = "Display label attached to the field")
  public String getDisplayLabel() {
    return displayLabel;
  }

  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }

  public FormField fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

   /**
   * Font color of the form field in RGB or HEX format
   * @return fontColor
  **/
  @ApiModelProperty(value = "Font color of the form field in RGB or HEX format")
  public String getFontColor() {
    return fontColor;
  }

  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  public FormField fontName(String fontName) {
    this.fontName = fontName;
    return this;
  }

   /**
   * Font name of the form field
   * @return fontName
  **/
  @ApiModelProperty(value = "Font name of the form field")
  public String getFontName() {
    return fontName;
  }

  public void setFontName(String fontName) {
    this.fontName = fontName;
  }

  public FormField fontSize(Double fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Font size of the form field in points
   * @return fontSize
  **/
  @ApiModelProperty(value = "Font size of the form field in points")
  public Double getFontSize() {
    return fontSize;
  }

  public void setFontSize(Double fontSize) {
    this.fontSize = fontSize;
  }

  public FormField hiddenOptions(List<String> hiddenOptions) {
    this.hiddenOptions = hiddenOptions;
    return this;
  }

  public FormField addHiddenOptionsItem(String hiddenOptionsItem) {
    if (this.hiddenOptions == null) {
      this.hiddenOptions = new ArrayList<String>();
    }
    this.hiddenOptions.add(hiddenOptionsItem);
    return this;
  }

   /**
   * Text values which are hidden in a drop down form field
   * @return hiddenOptions
  **/
  @ApiModelProperty(value = "Text values which are hidden in a drop down form field")
  public List<String> getHiddenOptions() {
    return hiddenOptions;
  }

  public void setHiddenOptions(List<String> hiddenOptions) {
    this.hiddenOptions = hiddenOptions;
  }

  public FormField hyperlink(FormFieldHyperlink hyperlink) {
    this.hyperlink = hyperlink;
    return this;
  }

   /**
   * Hyperlink-specific data (e.g. as url, link type)
   * @return hyperlink
  **/
  @ApiModelProperty(value = "Hyperlink-specific data (e.g. as url, link type)")
  public FormFieldHyperlink getHyperlink() {
    return hyperlink;
  }

  public void setHyperlink(FormFieldHyperlink hyperlink) {
    this.hyperlink = hyperlink;
  }

  public FormField inputType(InputTypeEnum inputType) {
    this.inputType = inputType;
    return this;
  }

   /**
   * Input type of the form field
   * @return inputType
  **/
  @ApiModelProperty(value = "Input type of the form field")
  public InputTypeEnum getInputType() {
    return inputType;
  }

  public void setInputType(InputTypeEnum inputType) {
    this.inputType = inputType;
  }

  public FormField locations(List<FormFieldLocation> locations) {
    this.locations = locations;
    return this;
  }

  public FormField addLocationsItem(FormFieldLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<FormFieldLocation>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * All locations in a document where the form field is placed
   * @return locations
  **/
  @ApiModelProperty(value = "All locations in a document where the form field is placed")
  public List<FormFieldLocation> getLocations() {
    return locations;
  }

  public void setLocations(List<FormFieldLocation> locations) {
    this.locations = locations;
  }

  public FormField masked(Boolean masked) {
    this.masked = masked;
    return this;
  }

   /**
   * true if the input entered by the signer has to be masked (like password), false if it shouldn&#39;t be
   * @return masked
  **/
  @ApiModelProperty(value = "true if the input entered by the signer has to be masked (like password), false if it shouldn't be")
  public Boolean isMasked() {
    return masked;
  }

  public void setMasked(Boolean masked) {
    this.masked = masked;
  }

  public FormField maskingText(String maskingText) {
    this.maskingText = maskingText;
    return this;
  }

   /**
   * Text to mask the masked form field
   * @return maskingText
  **/
  @ApiModelProperty(value = "Text to mask the masked form field")
  public String getMaskingText() {
    return maskingText;
  }

  public void setMaskingText(String maskingText) {
    this.maskingText = maskingText;
  }

  public FormField maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Maximum length of the input text field in terms of no. of characters
   * @return maxLength
  **/
  @ApiModelProperty(value = "Maximum length of the input text field in terms of no. of characters")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public FormField maxValue(Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

   /**
   * Upper bound of the number that can be entered by the signer
   * @return maxValue
  **/
  @ApiModelProperty(value = "Upper bound of the number that can be entered by the signer")
  public Double getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(Double maxValue) {
    this.maxValue = maxValue;
  }

  public FormField minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Minimum length of the input text field in terms of no. of characters
   * @return minLength
  **/
  @ApiModelProperty(value = "Minimum length of the input text field in terms of no. of characters")
  public Integer getMinLength() {
    return minLength;
  }

  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }

  public FormField minValue(Double minValue) {
    this.minValue = minValue;
    return this;
  }

   /**
   * Lower bound of the number that can be entered by the signer
   * @return minValue
  **/
  @ApiModelProperty(value = "Lower bound of the number that can be entered by the signer")
  public Double getMinValue() {
    return minValue;
  }

  public void setMinValue(Double minValue) {
    this.minValue = minValue;
  }

  public FormField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the form field
   * @return name
  **/
  @ApiModelProperty(value = "The name of the form field")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormField origin(OriginEnum origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Origin of Form Field
   * @return origin
  **/
  @ApiModelProperty(value = "Origin of Form Field")
  public OriginEnum getOrigin() {
    return origin;
  }

  public void setOrigin(OriginEnum origin) {
    this.origin = origin;
  }

  public FormField radioCheckType(RadioCheckTypeEnum radioCheckType) {
    this.radioCheckType = radioCheckType;
    return this;
  }

   /**
   * The type of radio button (if field is radio button, identified by inputType).
   * @return radioCheckType
  **/
  @ApiModelProperty(value = "The type of radio button (if field is radio button, identified by inputType).")
  public RadioCheckTypeEnum getRadioCheckType() {
    return radioCheckType;
  }

  public void setRadioCheckType(RadioCheckTypeEnum radioCheckType) {
    this.radioCheckType = radioCheckType;
  }

  public FormField readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * true if it is a read-only field, else false
   * @return readOnly
  **/
  @ApiModelProperty(value = "true if it is a read-only field, else false")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public FormField required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * true if it is a mandatory field to be filled by the signer, else false
   * @return required
  **/
  @ApiModelProperty(value = "true if it is a mandatory field to be filled by the signer, else false")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public FormField tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

   /**
   * Text that appears while hovering over the field
   * @return tooltip
  **/
  @ApiModelProperty(value = "Text that appears while hovering over the field")
  public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public FormField validation(ValidationEnum validation) {
    this.validation = validation;
    return this;
  }

   /**
   * Rule for validating the field value.
   * @return validation
  **/
  @ApiModelProperty(value = "Rule for validating the field value.")
  public ValidationEnum getValidation() {
    return validation;
  }

  public void setValidation(ValidationEnum validation) {
    this.validation = validation;
  }

  public FormField validationData(String validationData) {
    this.validationData = validationData;
    return this;
  }

   /**
   * Further data for validating input with regards to the field&#39;s specified format. The contents and interpretation of formatData depends on the value of validation.
   * @return validationData
  **/
  @ApiModelProperty(value = "Further data for validating input with regards to the field's specified format. The contents and interpretation of formatData depends on the value of validation.")
  public String getValidationData() {
    return validationData;
  }

  public void setValidationData(String validationData) {
    this.validationData = validationData;
  }

  public FormField validationErrMsg(String validationErrMsg) {
    this.validationErrMsg = validationErrMsg;
    return this;
  }

   /**
   * Error message to be shown to the signer if filled value doesn&#39;t match the validations of the form field
   * @return validationErrMsg
  **/
  @ApiModelProperty(value = "Error message to be shown to the signer if filled value doesn't match the validations of the form field")
  public String getValidationErrMsg() {
    return validationErrMsg;
  }

  public void setValidationErrMsg(String validationErrMsg) {
    this.validationErrMsg = validationErrMsg;
  }

  public FormField valueExpression(String valueExpression) {
    this.valueExpression = valueExpression;
    return this;
  }

   /**
   * Expression to calculate value of the form field
   * @return valueExpression
  **/
  @ApiModelProperty(value = "Expression to calculate value of the form field")
  public String getValueExpression() {
    return valueExpression;
  }

  public void setValueExpression(String valueExpression) {
    this.valueExpression = valueExpression;
  }

  public FormField visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * If set to false, then the form field is hidden.  Otherwise, it is visible.
   * @return visible
  **/
  @ApiModelProperty(value = "If set to false, then the form field is hidden.  Otherwise, it is visible.")
  public Boolean isVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public FormField visibleOptions(List<String> visibleOptions) {
    this.visibleOptions = visibleOptions;
    return this;
  }

  public FormField addVisibleOptionsItem(String visibleOptionsItem) {
    if (this.visibleOptions == null) {
      this.visibleOptions = new ArrayList<String>();
    }
    this.visibleOptions.add(visibleOptionsItem);
    return this;
  }

   /**
   * Text values which are visible in a drop down form field
   * @return visibleOptions
  **/
  @ApiModelProperty(value = "Text values which are visible in a drop down form field")
  public List<String> getVisibleOptions() {
    return visibleOptions;
  }

  public void setVisibleOptions(List<String> visibleOptions) {
    this.visibleOptions = visibleOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormField formField = (FormField) o;
    return Objects.equals(this.alignment, formField.alignment) &&
        Objects.equals(this.assignee, formField.assignee) &&
        Objects.equals(this.backgroundColor, formField.backgroundColor) &&
        Objects.equals(this.borderColor, formField.borderColor) &&
        Objects.equals(this.borderStyle, formField.borderStyle) &&
        Objects.equals(this.borderWidth, formField.borderWidth) &&
        Objects.equals(this.calculated, formField.calculated) &&
        Objects.equals(this.conditionalAction, formField.conditionalAction) &&
        Objects.equals(this.contentType, formField.contentType) &&
        Objects.equals(this.defaultValue, formField.defaultValue) &&
        Objects.equals(this.displayFormat, formField.displayFormat) &&
        Objects.equals(this.displayFormatType, formField.displayFormatType) &&
        Objects.equals(this.displayLabel, formField.displayLabel) &&
        Objects.equals(this.fontColor, formField.fontColor) &&
        Objects.equals(this.fontName, formField.fontName) &&
        Objects.equals(this.fontSize, formField.fontSize) &&
        Objects.equals(this.hiddenOptions, formField.hiddenOptions) &&
        Objects.equals(this.hyperlink, formField.hyperlink) &&
        Objects.equals(this.inputType, formField.inputType) &&
        Objects.equals(this.locations, formField.locations) &&
        Objects.equals(this.masked, formField.masked) &&
        Objects.equals(this.maskingText, formField.maskingText) &&
        Objects.equals(this.maxLength, formField.maxLength) &&
        Objects.equals(this.maxValue, formField.maxValue) &&
        Objects.equals(this.minLength, formField.minLength) &&
        Objects.equals(this.minValue, formField.minValue) &&
        Objects.equals(this.name, formField.name) &&
        Objects.equals(this.origin, formField.origin) &&
        Objects.equals(this.radioCheckType, formField.radioCheckType) &&
        Objects.equals(this.readOnly, formField.readOnly) &&
        Objects.equals(this.required, formField.required) &&
        Objects.equals(this.tooltip, formField.tooltip) &&
        Objects.equals(this.validation, formField.validation) &&
        Objects.equals(this.validationData, formField.validationData) &&
        Objects.equals(this.validationErrMsg, formField.validationErrMsg) &&
        Objects.equals(this.valueExpression, formField.valueExpression) &&
        Objects.equals(this.visible, formField.visible) &&
        Objects.equals(this.visibleOptions, formField.visibleOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alignment, assignee, backgroundColor, borderColor, borderStyle, borderWidth, calculated, conditionalAction, contentType, defaultValue, displayFormat, displayFormatType, displayLabel, fontColor, fontName, fontSize, hiddenOptions, hyperlink, inputType, locations, masked, maskingText, maxLength, maxValue, minLength, minValue, name, origin, radioCheckType, readOnly, required, tooltip, validation, validationData, validationErrMsg, valueExpression, visible, visibleOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormField {\n");
    
    sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    borderStyle: ").append(toIndentedString(borderStyle)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    calculated: ").append(toIndentedString(calculated)).append("\n");
    sb.append("    conditionalAction: ").append(toIndentedString(conditionalAction)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    displayFormat: ").append(toIndentedString(displayFormat)).append("\n");
    sb.append("    displayFormatType: ").append(toIndentedString(displayFormatType)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    fontName: ").append(toIndentedString(fontName)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    hiddenOptions: ").append(toIndentedString(hiddenOptions)).append("\n");
    sb.append("    hyperlink: ").append(toIndentedString(hyperlink)).append("\n");
    sb.append("    inputType: ").append(toIndentedString(inputType)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    masked: ").append(toIndentedString(masked)).append("\n");
    sb.append("    maskingText: ").append(toIndentedString(maskingText)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    radioCheckType: ").append(toIndentedString(radioCheckType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    validationData: ").append(toIndentedString(validationData)).append("\n");
    sb.append("    validationErrMsg: ").append(toIndentedString(validationErrMsg)).append("\n");
    sb.append("    valueExpression: ").append(toIndentedString(valueExpression)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    visibleOptions: ").append(toIndentedString(visibleOptions)).append("\n");
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

