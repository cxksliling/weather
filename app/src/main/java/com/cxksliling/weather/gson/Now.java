package com.cxksliling.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 26958 on 2017/4/16.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
