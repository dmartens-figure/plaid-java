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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.PartnerEndCustomerAddress;
import com.plaid.client.model.PartnerEndCustomerAssetsUnderManagement;
import com.plaid.client.model.PartnerEndCustomerBillingContact;
import com.plaid.client.model.PartnerEndCustomerCustomerSupportInfo;
import com.plaid.client.model.PartnerEndCustomerTechnicalContact;
import com.plaid.client.model.Products;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request schema for &#x60;/partner/customer/create&#x60;.
 */
@ApiModel(description = "Request schema for `/partner/customer/create`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-20T21:31:59.039638Z[Etc/UTC]")
public class PartnerCustomerCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_COMPANY_NAME = "company_name";
  @SerializedName(SERIALIZED_NAME_COMPANY_NAME)
  private String companyName;

  public static final String SERIALIZED_NAME_IS_DILIGENCE_ATTESTED = "is_diligence_attested";
  @SerializedName(SERIALIZED_NAME_IS_DILIGENCE_ATTESTED)
  private Boolean isDiligenceAttested;

  public static final String SERIALIZED_NAME_PRODUCTS = "products";
  @SerializedName(SERIALIZED_NAME_PRODUCTS)
  private List<Products> products = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATE_LINK_CUSTOMIZATION = "create_link_customization";
  @SerializedName(SERIALIZED_NAME_CREATE_LINK_CUSTOMIZATION)
  private Boolean createLinkCustomization;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_LEGAL_ENTITY_NAME = "legal_entity_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_ENTITY_NAME)
  private String legalEntityName;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_APPLICATION_NAME = "application_name";
  @SerializedName(SERIALIZED_NAME_APPLICATION_NAME)
  private String applicationName;

  public static final String SERIALIZED_NAME_TECHNICAL_CONTACT = "technical_contact";
  @SerializedName(SERIALIZED_NAME_TECHNICAL_CONTACT)
  private PartnerEndCustomerTechnicalContact technicalContact;

  public static final String SERIALIZED_NAME_BILLING_CONTACT = "billing_contact";
  @SerializedName(SERIALIZED_NAME_BILLING_CONTACT)
  private PartnerEndCustomerBillingContact billingContact;

  public static final String SERIALIZED_NAME_CUSTOMER_SUPPORT_INFO = "customer_support_info";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_SUPPORT_INFO)
  private PartnerEndCustomerCustomerSupportInfo customerSupportInfo;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private PartnerEndCustomerAddress address;

  public static final String SERIALIZED_NAME_IS_BANK_ADDENDUM_COMPLETED = "is_bank_addendum_completed";
  @SerializedName(SERIALIZED_NAME_IS_BANK_ADDENDUM_COMPLETED)
  private Boolean isBankAddendumCompleted;

  public static final String SERIALIZED_NAME_ASSETS_UNDER_MANAGEMENT = "assets_under_management";
  @SerializedName(SERIALIZED_NAME_ASSETS_UNDER_MANAGEMENT)
  private PartnerEndCustomerAssetsUnderManagement assetsUnderManagement;

  public static final String SERIALIZED_NAME_REDIRECT_URIS = "redirect_uris";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URIS)
  private List<String> redirectUris = null;


  public PartnerCustomerCreateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public PartnerCustomerCreateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public PartnerCustomerCreateRequest companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * The company name of the end customer being created. This will be used to display the end customer in the Plaid Dashboard. It will not be shown to end users.
   * @return companyName
  **/
  @ApiModelProperty(required = true, value = "The company name of the end customer being created. This will be used to display the end customer in the Plaid Dashboard. It will not be shown to end users.")

  public String getCompanyName() {
    return companyName;
  }


  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public PartnerCustomerCreateRequest isDiligenceAttested(Boolean isDiligenceAttested) {
    
    this.isDiligenceAttested = isDiligenceAttested;
    return this;
  }

   /**
   * Denotes whether or not the partner has completed attestation of diligence for the end customer to be created.
   * @return isDiligenceAttested
  **/
  @ApiModelProperty(required = true, value = "Denotes whether or not the partner has completed attestation of diligence for the end customer to be created.")

  public Boolean getIsDiligenceAttested() {
    return isDiligenceAttested;
  }


  public void setIsDiligenceAttested(Boolean isDiligenceAttested) {
    this.isDiligenceAttested = isDiligenceAttested;
  }


  public PartnerCustomerCreateRequest products(List<Products> products) {
    
    this.products = products;
    return this;
  }

  public PartnerCustomerCreateRequest addProductsItem(Products productsItem) {
    this.products.add(productsItem);
    return this;
  }

   /**
   * The products to be enabled for the end customer.
   * @return products
  **/
  @ApiModelProperty(required = true, value = "The products to be enabled for the end customer.")

  public List<Products> getProducts() {
    return products;
  }


  public void setProducts(List<Products> products) {
    this.products = products;
  }


  public PartnerCustomerCreateRequest createLinkCustomization(Boolean createLinkCustomization) {
    
    this.createLinkCustomization = createLinkCustomization;
    return this;
  }

   /**
   * If &#x60;true&#x60;, the end customer&#39;s default Link customization will be set to match the partner&#39;s. You can always change the end customer&#39;s Link customization in the Plaid Dashboard. See the [Link Customization docs](https://plaid.com/docs/link/customization/) for more information.
   * @return createLinkCustomization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, the end customer's default Link customization will be set to match the partner's. You can always change the end customer's Link customization in the Plaid Dashboard. See the [Link Customization docs](https://plaid.com/docs/link/customization/) for more information.")

  public Boolean getCreateLinkCustomization() {
    return createLinkCustomization;
  }


  public void setCreateLinkCustomization(Boolean createLinkCustomization) {
    this.createLinkCustomization = createLinkCustomization;
  }


  public PartnerCustomerCreateRequest logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * Base64-encoded representation of the end customer&#39;s logo. Must be a PNG of size 1024x1024 under 4MB. The logo will be shared with financial institutions and shown to the end user during Link flows. A logo is required if &#x60;create_link_customization&#x60; is &#x60;true&#x60;. If &#x60;create_link_customization&#x60; is &#x60;false&#x60; and the logo is omitted, a stock logo will be used.
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Base64-encoded representation of the end customer's logo. Must be a PNG of size 1024x1024 under 4MB. The logo will be shared with financial institutions and shown to the end user during Link flows. A logo is required if `create_link_customization` is `true`. If `create_link_customization` is `false` and the logo is omitted, a stock logo will be used.")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public PartnerCustomerCreateRequest legalEntityName(String legalEntityName) {
    
    this.legalEntityName = legalEntityName;
    return this;
  }

   /**
   * The end customer&#39;s legal name. This will be shared with financial institutions as part of the OAuth registration process. It will not be shown to end users.
   * @return legalEntityName
  **/
  @ApiModelProperty(required = true, value = "The end customer's legal name. This will be shared with financial institutions as part of the OAuth registration process. It will not be shown to end users.")

  public String getLegalEntityName() {
    return legalEntityName;
  }


  public void setLegalEntityName(String legalEntityName) {
    this.legalEntityName = legalEntityName;
  }


  public PartnerCustomerCreateRequest website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * The end customer&#39;s website.
   * @return website
  **/
  @ApiModelProperty(required = true, value = "The end customer's website.")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public PartnerCustomerCreateRequest applicationName(String applicationName) {
    
    this.applicationName = applicationName;
    return this;
  }

   /**
   * The name of the end customer&#39;s application. This will be shown to end users when they go through the Plaid Link flow.
   * @return applicationName
  **/
  @ApiModelProperty(required = true, value = "The name of the end customer's application. This will be shown to end users when they go through the Plaid Link flow.")

  public String getApplicationName() {
    return applicationName;
  }


  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }


  public PartnerCustomerCreateRequest technicalContact(PartnerEndCustomerTechnicalContact technicalContact) {
    
    this.technicalContact = technicalContact;
    return this;
  }

   /**
   * Get technicalContact
   * @return technicalContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomerTechnicalContact getTechnicalContact() {
    return technicalContact;
  }


  public void setTechnicalContact(PartnerEndCustomerTechnicalContact technicalContact) {
    this.technicalContact = technicalContact;
  }


  public PartnerCustomerCreateRequest billingContact(PartnerEndCustomerBillingContact billingContact) {
    
    this.billingContact = billingContact;
    return this;
  }

   /**
   * Get billingContact
   * @return billingContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomerBillingContact getBillingContact() {
    return billingContact;
  }


  public void setBillingContact(PartnerEndCustomerBillingContact billingContact) {
    this.billingContact = billingContact;
  }


  public PartnerCustomerCreateRequest customerSupportInfo(PartnerEndCustomerCustomerSupportInfo customerSupportInfo) {
    
    this.customerSupportInfo = customerSupportInfo;
    return this;
  }

   /**
   * Get customerSupportInfo
   * @return customerSupportInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomerCustomerSupportInfo getCustomerSupportInfo() {
    return customerSupportInfo;
  }


  public void setCustomerSupportInfo(PartnerEndCustomerCustomerSupportInfo customerSupportInfo) {
    this.customerSupportInfo = customerSupportInfo;
  }


  public PartnerCustomerCreateRequest address(PartnerEndCustomerAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")

  public PartnerEndCustomerAddress getAddress() {
    return address;
  }


  public void setAddress(PartnerEndCustomerAddress address) {
    this.address = address;
  }


  public PartnerCustomerCreateRequest isBankAddendumCompleted(Boolean isBankAddendumCompleted) {
    
    this.isBankAddendumCompleted = isBankAddendumCompleted;
    return this;
  }

   /**
   * Denotes whether the partner has forwarded the Plaid bank addendum to the end customer.
   * @return isBankAddendumCompleted
  **/
  @ApiModelProperty(required = true, value = "Denotes whether the partner has forwarded the Plaid bank addendum to the end customer.")

  public Boolean getIsBankAddendumCompleted() {
    return isBankAddendumCompleted;
  }


  public void setIsBankAddendumCompleted(Boolean isBankAddendumCompleted) {
    this.isBankAddendumCompleted = isBankAddendumCompleted;
  }


  public PartnerCustomerCreateRequest assetsUnderManagement(PartnerEndCustomerAssetsUnderManagement assetsUnderManagement) {
    
    this.assetsUnderManagement = assetsUnderManagement;
    return this;
  }

   /**
   * Get assetsUnderManagement
   * @return assetsUnderManagement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerEndCustomerAssetsUnderManagement getAssetsUnderManagement() {
    return assetsUnderManagement;
  }


  public void setAssetsUnderManagement(PartnerEndCustomerAssetsUnderManagement assetsUnderManagement) {
    this.assetsUnderManagement = assetsUnderManagement;
  }


  public PartnerCustomerCreateRequest redirectUris(List<String> redirectUris) {
    
    this.redirectUris = redirectUris;
    return this;
  }

  public PartnerCustomerCreateRequest addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * A list of URIs indicating the destination(s) where a user can be forwarded after completing the Link flow; used to support OAuth authentication flows when launching Link in the browser or via a webview. URIs should not contain any query parameters. When used in Production or Development, URIs must use https. To specify any subdomain, use &#x60;*&#x60; as a wildcard character, e.g. &#x60;https://_*.example.com/oauth.html&#x60;. To modify redirect URIs for an end customer after creating them, go to the end customer&#39;s [API page](https://dashboard.plaid.com/team/api) in the Dashboard.
   * @return redirectUris
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of URIs indicating the destination(s) where a user can be forwarded after completing the Link flow; used to support OAuth authentication flows when launching Link in the browser or via a webview. URIs should not contain any query parameters. When used in Production or Development, URIs must use https. To specify any subdomain, use `*` as a wildcard character, e.g. `https://_*.example.com/oauth.html`. To modify redirect URIs for an end customer after creating them, go to the end customer's [API page](https://dashboard.plaid.com/team/api) in the Dashboard.")

  public List<String> getRedirectUris() {
    return redirectUris;
  }


  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerCustomerCreateRequest partnerCustomerCreateRequest = (PartnerCustomerCreateRequest) o;
    return Objects.equals(this.clientId, partnerCustomerCreateRequest.clientId) &&
        Objects.equals(this.secret, partnerCustomerCreateRequest.secret) &&
        Objects.equals(this.companyName, partnerCustomerCreateRequest.companyName) &&
        Objects.equals(this.isDiligenceAttested, partnerCustomerCreateRequest.isDiligenceAttested) &&
        Objects.equals(this.products, partnerCustomerCreateRequest.products) &&
        Objects.equals(this.createLinkCustomization, partnerCustomerCreateRequest.createLinkCustomization) &&
        Objects.equals(this.logo, partnerCustomerCreateRequest.logo) &&
        Objects.equals(this.legalEntityName, partnerCustomerCreateRequest.legalEntityName) &&
        Objects.equals(this.website, partnerCustomerCreateRequest.website) &&
        Objects.equals(this.applicationName, partnerCustomerCreateRequest.applicationName) &&
        Objects.equals(this.technicalContact, partnerCustomerCreateRequest.technicalContact) &&
        Objects.equals(this.billingContact, partnerCustomerCreateRequest.billingContact) &&
        Objects.equals(this.customerSupportInfo, partnerCustomerCreateRequest.customerSupportInfo) &&
        Objects.equals(this.address, partnerCustomerCreateRequest.address) &&
        Objects.equals(this.isBankAddendumCompleted, partnerCustomerCreateRequest.isBankAddendumCompleted) &&
        Objects.equals(this.assetsUnderManagement, partnerCustomerCreateRequest.assetsUnderManagement) &&
        Objects.equals(this.redirectUris, partnerCustomerCreateRequest.redirectUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, companyName, isDiligenceAttested, products, createLinkCustomization, logo, legalEntityName, website, applicationName, technicalContact, billingContact, customerSupportInfo, address, isBankAddendumCompleted, assetsUnderManagement, redirectUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerCustomerCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    isDiligenceAttested: ").append(toIndentedString(isDiligenceAttested)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    createLinkCustomization: ").append(toIndentedString(createLinkCustomization)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    legalEntityName: ").append(toIndentedString(legalEntityName)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
    sb.append("    technicalContact: ").append(toIndentedString(technicalContact)).append("\n");
    sb.append("    billingContact: ").append(toIndentedString(billingContact)).append("\n");
    sb.append("    customerSupportInfo: ").append(toIndentedString(customerSupportInfo)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    isBankAddendumCompleted: ").append(toIndentedString(isBankAddendumCompleted)).append("\n");
    sb.append("    assetsUnderManagement: ").append(toIndentedString(assetsUnderManagement)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

