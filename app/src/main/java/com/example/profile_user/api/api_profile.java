package com.example.profile_user.api;

import com.example.profile_user.data.model.userprofile;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface api_profile {
    @GET("/users")
    @Headers("Authorization: token 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")
    Call<userprofile> getProfileUsers(
            @Query("q") String query
    );
}