/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.379.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The counterparty type.  &#x60;merchant&#x60;: a provider of goods or services for purchase &#x60;financial_institution&#x60;: a financial entity (bank, credit union, BNPL, fintech) &#x60;payment_app&#x60;: a transfer or P2P app (e.g. Zelle) &#x60;marketplace&#x60;: a marketplace (e.g DoorDash, Google Play Store) &#x60;payment_terminal&#x60;: a point-of-sale payment terminal (e.g Square, Toast) &#x60;income_source&#x60;: the payer in an income transaction (e.g., an employer, client, or government agency)
 */
@JsonAdapter(CounterpartyType.Adapter.class)
public enum CounterpartyType {
  
  MERCHANT("merchant"),
  
  FINANCIAL_INSTITUTION("financial_institution"),
  
  PAYMENT_APP("payment_app"),
  
  MARKETPLACE("marketplace"),
  
  PAYMENT_TERMINAL("payment_terminal"),
  
  INCOME_SOURCE("income_source"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  CounterpartyType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CounterpartyType fromValue(String value) {
    for (CounterpartyType b : CounterpartyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return CounterpartyType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<CounterpartyType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CounterpartyType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CounterpartyType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CounterpartyType.fromValue(value);
    }
  }
}

