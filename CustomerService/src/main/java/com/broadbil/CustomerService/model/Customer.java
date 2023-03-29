package com.broadbil.CustomerService.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Customer {
    @Id
    @JsonProperty("CUSTOMER_NUMBER")
    private Integer customerNumber;
    @JsonProperty("SHORT_NAME")
    private String shortName;
    @JsonProperty("IS_INDIVIDUAL")
    private String isIndividual;
    @JsonProperty("NATIONALITY")
    private String nationality;
    @JsonProperty("NATIONALITY_NUMBER")
    private Integer nationalityNumber;
    @JsonProperty("NATIONALITY_DESCRIPTION")
    private String nationalityDescription;
    @JsonProperty("STREET_ADDRESS")
    private String streetAddress;
    @JsonProperty("ADDRESS_LINE2")
    private ArrayList<Object> addressLineTwo;
    @JsonProperty("ADDRESS_LINE3")
    private ArrayList<Object> addressLineThree;
    @JsonProperty("TOWN_COUNTRY")
    private String townCountry;
    @JsonProperty("POST_CODE")
    private ArrayList<Object> postCode;
    @JsonProperty("COUNTRY")
    private String country;
    @JsonProperty("COUNTRY_CODE")
    private String countryCode;
    @JsonProperty("COUNTRY_CODE_NUMBER")
    private Integer countryCodeNumber;
    @JsonProperty("DISPATCH_CODE")
    private String dispatchCode;
    @JsonProperty("COMMUNICATION_CHANNEL")
    private String communicationChannel;
    @JsonProperty("PHONE_NUMBER")
    private String phoneNumber;
    @JsonProperty("OFFICE_PHONE_NUMBER")
    private String officePhoneNumber;
    @JsonProperty("FAX_NUMBER")
    private Long faxNumber;
    @JsonProperty("MOBILE_OPERATORISO")
    private String mobileOperatorISO;
    @JsonProperty("MOBILE_OPERATOR_CODE")
    private String mobileOperatorCode;
    @JsonProperty("SMS_NUMBER")
    private String smsNumber;
    @JsonProperty("EMAIL")
    private String email;
}
