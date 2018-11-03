package com.example.api;

import com.example.api.models.PersonObject;
import com.example.api.models.TaxFilingObject;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link TaxFilingsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */

public interface TaxFilingsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * @see TaxFilingsApi#getTaxFiling
     */
    default ResponseEntity<TaxFilingObject> getTaxFiling(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"period\" : 0,  \"taxLiability\" : 1.46581298050294517310021547018550336360931396484375,  \"year\" : \"year\",  \"jurisdiction\" : \"jurisdiction\",  \"filingID\" : \"filingID\",  \"taxpayer\" : \"taxpayer\",  \"currency\" : \"currency\",  \"grossIncome\" : 6.02745618307040320615897144307382404804229736328125}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * @see TaxFilingsApi#saveTaxFiling
     */
    default ResponseEntity<TaxFilingObject> saveTaxFiling(PersonObject personObject) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"period\" : 0,  \"taxLiability\" : 1.46581298050294517310021547018550336360931396484375,  \"year\" : \"year\",  \"jurisdiction\" : \"jurisdiction\",  \"filingID\" : \"filingID\",  \"taxpayer\" : \"taxpayer\",  \"currency\" : \"currency\",  \"grossIncome\" : 6.02745618307040320615897144307382404804229736328125}");
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    ApiUtil.setExampleResponse(request, "application/xml", "<null>  <filingID>aeiou</filingID>  <jurisdiction>aeiou</jurisdiction>  <year>aeiou</year>  <period>123</period>  <currency>aeiou</currency>  <grossIncome>3.149</grossIncome>  <taxLiability>3.149</taxLiability>  <taxpayer>aeiou</taxpayer></null>");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
