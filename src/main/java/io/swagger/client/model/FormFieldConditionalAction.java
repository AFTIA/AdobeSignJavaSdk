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
import io.swagger.client.model.FormFieldConditionPredicate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Conditional actions to perfom on this form field.
 */
@ApiModel(description = "Conditional actions to perfom on this form field.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:30:55.372+05:30")
public class FormFieldConditionalAction {
  /**
   * Action to show/hide the form field is to be taken on the basis of evaluation of conditions.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    SHOW("SHOW"),
    
    HIDE("HIDE"),
    
    DISABLE("DISABLE"),
    
    ENABLE("ENABLE");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String text) {
      for (ActionEnum b : ActionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ActionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  /**
   * It indicates if any one of the conditions or all of them have to be true.
   */
  @JsonAdapter(AnyOrAllEnum.Adapter.class)
  public enum AnyOrAllEnum {
    ALL("ALL"),
    
    ANY("ANY");

    private String value;

    AnyOrAllEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AnyOrAllEnum fromValue(String text) {
      for (AnyOrAllEnum b : AnyOrAllEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AnyOrAllEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AnyOrAllEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AnyOrAllEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AnyOrAllEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("anyOrAll")
  private AnyOrAllEnum anyOrAll = null;

  @SerializedName("predicates")
  private List<FormFieldConditionPredicate> predicates = null;

  public FormFieldConditionalAction action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Action to show/hide the form field is to be taken on the basis of evaluation of conditions.
   * @return action
  **/
  @ApiModelProperty(value = "Action to show/hide the form field is to be taken on the basis of evaluation of conditions.")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public FormFieldConditionalAction anyOrAll(AnyOrAllEnum anyOrAll) {
    this.anyOrAll = anyOrAll;
    return this;
  }

   /**
   * It indicates if any one of the conditions or all of them have to be true.
   * @return anyOrAll
  **/
  @ApiModelProperty(value = "It indicates if any one of the conditions or all of them have to be true.")
  public AnyOrAllEnum getAnyOrAll() {
    return anyOrAll;
  }

  public void setAnyOrAll(AnyOrAllEnum anyOrAll) {
    this.anyOrAll = anyOrAll;
  }

  public FormFieldConditionalAction predicates(List<FormFieldConditionPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }

  public FormFieldConditionalAction addPredicatesItem(FormFieldConditionPredicate predicatesItem) {
    if (this.predicates == null) {
      this.predicates = new ArrayList<FormFieldConditionPredicate>();
    }
    this.predicates.add(predicatesItem);
    return this;
  }

   /**
   * The predicates to be evaluated in order to determine whether this condition is true
   * @return predicates
  **/
  @ApiModelProperty(value = "The predicates to be evaluated in order to determine whether this condition is true")
  public List<FormFieldConditionPredicate> getPredicates() {
    return predicates;
  }

  public void setPredicates(List<FormFieldConditionPredicate> predicates) {
    this.predicates = predicates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormFieldConditionalAction formFieldConditionalAction = (FormFieldConditionalAction) o;
    return Objects.equals(this.action, formFieldConditionalAction.action) &&
        Objects.equals(this.anyOrAll, formFieldConditionalAction.anyOrAll) &&
        Objects.equals(this.predicates, formFieldConditionalAction.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, anyOrAll, predicates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormFieldConditionalAction {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    anyOrAll: ").append(toIndentedString(anyOrAll)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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

