package com.ewan.ciboard.global.jwt

object JwtProperties {
    const val ISSUER: String = "CI_BOARD"
    const val USER_ID: String = "USER_ID"
    const val USER_NAME: String = "USER_NAME"
    const val USER_ROLE: String = "USER_ROLE"
    const val SECRET: String = "CI_BOARD_API"
    const val EXPIRATION_TIME: Long = ((60*2)*1001) // 30분 -> ((60*30)*1001)
    const val BEARER_PREFIX: String = "Bearer"
    const val JWT_HEADER: String = "Authorization"
}