package ekstep.societal.sdk.services;

import ekstep.societal.sdk.Constants;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jithilprakash.pj on 11/21/2018.
 */

public class RetrofitSingleton {
    private static ApiInterfaceJava apiInterface;

    private RetrofitSingleton(){}

    public static ApiInterfaceJava getInstance(String url){
        if(url.equalsIgnoreCase(Constants.baseUrl)) {
            if (apiInterface == null) {
                try {
                    apiInterface = retrofitInstance(url);
                    return apiInterface;
                } catch (Exception e) {
                    return null;
                }
            } else {
                return apiInterface;
            }
        }
        else{
            if (apiInterface == null) {
                try {
                    apiInterface = retrofitInstance(url);
                    return apiInterface;
                } catch (Exception e) {
                    return null;
                }
            } else {
                return apiInterface;
            }

        }
    }

    private static ApiInterfaceJava retrofitInstance(String url) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ApiInterfaceJava.class);
    }

    public String checkInstance(){
        return apiInterface.toString();
    }
}
