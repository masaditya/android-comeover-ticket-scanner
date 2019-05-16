package com.adityaeka.cocheckinqrscanner;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;

public interface CheckinService {

    @GET("/tickets/{id}")
    Call<Ticket> getUser(@Path("id") String id );

    @PATCH("/tickets/{id}/done")
    Call<MessageRes> setDone(@Path("id") String id);
}
