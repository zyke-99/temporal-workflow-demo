package org.zyke.workflow.activity.response

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class PhoneOtpActivityResponse @JsonCreator constructor(
    @JsonProperty("mockField") val mockField: Boolean
)
