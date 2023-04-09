package net.itinajero.apps

import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody

fun main(){

    val client = OkHttpClient()
    val apiKey = "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"

    val endpoint = "https://api.openai.com/v1/completions"

    val json = """
    {
        "prompt": "Dame un ejemplo en Kotlin utilizando la API de OpenAI GPT-3",
        "temperature": 0.5,
        "model": "text-davinci-003"
    }
    """.trimIndent()

    val mediaType = "application/json; charset=utf-8".toMediaType()
    val body = json.toRequestBody(mediaType)

    val request = Request.Builder()
        .url(endpoint)
        .addHeader("Authorization", "Bearer $apiKey")
        .post(body)
        .build()

    val response = client.newCall(request).execute()
    val responseBody = response.body?.string()


    if (response.isSuccessful) {
        println(responseBody)
    } else {
        println("Error: ${response.code} - ${response.message}")
    }


}