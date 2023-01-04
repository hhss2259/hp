package clonecodinghs.hp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class Validation {

    @JsonProperty
    private final boolean validation;
}
