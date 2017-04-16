package com.cxksliling.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 26958 on 2017/4/16.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
