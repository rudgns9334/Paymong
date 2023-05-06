package com.paymong.data.model.response

import com.paymong.common.code.CharacterCode

data class FindMemberResDto(
    val mongCode : String,
    val point : Long
)

data class PointInfoResDto(
    val content : String,
    val price : Int
)