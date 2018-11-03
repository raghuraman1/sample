/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.2-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.api;

import com.example.api.models.FamilyObject;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "family", description = "the family API")
public interface FamilyApi {

    default FamilyApiDelegate getDelegate() {
        return new FamilyApiDelegate() {};
    }

    @ApiOperation(value = "", nickname = "getFamily", notes = "Retrieves a FamilyObject having the specified id.", response = FamilyObject.class, tags={ "FamilyObject", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response, with a representation of save.", response = FamilyObject.class),
        @ApiResponse(code = 404, message = "The family was not found.") })
    @RequestMapping(value = "/family/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<FamilyObject> getFamily(@Size(max=10) @ApiParam(value = "id of the person",required=true) @PathVariable("id") String id) {
        return getDelegate().getFamily(id);
    }


    @ApiOperation(value = "", nickname = "saveFamily", notes = "Saves a FamilyObject .", response = FamilyObject.class, tags={ "FamilyObject", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response, with a representation of the Tax Filing.", response = FamilyObject.class),
        @ApiResponse(code = 304, message = "The requested tax filing was not saved.") })
    @RequestMapping(value = "/family",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" },
        method = RequestMethod.POST)
    default ResponseEntity<FamilyObject> saveFamily(@ApiParam(value = "Family object that needs to be added to the store" ,required=true )  @Valid @RequestBody FamilyObject familyObject) {
        return getDelegate().saveFamily(familyObject);
    }

}
