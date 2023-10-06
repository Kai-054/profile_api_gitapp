package com.example.profile_user.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient2 {
    private static final String BASE_URL = "https://api.github.com/user";
    private static Retrofit retrofit;
    private static api_profile apiInstance;

    private RetrofitClient2() { }

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static api_profile getApiInstance() {
        if (apiInstance == null) {
            apiInstance = getRetrofit().create(api_profile.class);
        }
        return apiInstance;
    }
}
