package com.example.advena.data

import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.realtime.Realtime
import io.github.jan.supabase.auth.Auth

// Connect to supabase db
object SupabaseClient {

    // TODO: Move URL and ANON_KEY to a secure place since they should not be exposed in source code.
    private const val SUPABASE_URL = ""

    private const val SUPABASE_ANON_KEY = ""

    val client = createSupabaseClient(
        supabaseUrl = SUPABASE_URL,
        supabaseKey = SUPABASE_ANON_KEY
    ) {
        install(Auth)
        install(Postgrest)
        install(Realtime)
    }
}

