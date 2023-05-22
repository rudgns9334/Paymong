package com.paymong.member.paypoint.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddPaypointAdminReqDto {
    String content;
    Integer price;
    String memberIdStr;
}
