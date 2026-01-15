package com.example.advena.data.remote

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.http.*

private const val apikey = ""

class GeocodingService(
    private val apiKey: String = apikey, // TODO: Move to secure storage
    private val client: HttpClient
) {
    suspend fun geocode(address: String): GeocodingResponse {
        return client.get("https://maps.googleapis.com/maps/api/geocode/json") {
            parameter("address", address)
            parameter("key", apiKey)
            accept(ContentType.Application.Json)
        }.body()
    }

}