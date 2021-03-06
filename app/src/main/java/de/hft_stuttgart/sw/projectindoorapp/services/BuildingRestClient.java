package de.hft_stuttgart.sw.projectindoorapp.services;

import java.util.ArrayList;

import de.hft_stuttgart.sw.projectindoorapp.models.Position;
import de.hft_stuttgart.sw.projectindoorapp.models.external.Building;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Sony on 11/30/2017.
 */

public interface BuildingRestClient {
    @POST("building/addNewBuilding/")
    public Call<Position> addNewBuilding(@Query("buildingName") String buildingName, @Query("numberOfFloors") int numberOfFloors);

    @GET("building/getAllBuildings/")
    public Call<ArrayList<Building>> getAllBuildings();

    @GET("building/getBuildingByBuildingId")
    public Call<Building> getBuildingByBuildingId(@Query("buildingIdentifier") String buildingIdentifier);

}
