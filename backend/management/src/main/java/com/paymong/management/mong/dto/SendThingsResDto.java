package com.paymong.management.mong.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SendThingsResDto {
    private Long memberId;
    private String thingsCode;
}
