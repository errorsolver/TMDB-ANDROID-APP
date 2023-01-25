package com.example.moviefinder.model

import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieResponse(
    @SerializedName("result")
    val movies: List<Movie>
):Parcelable{
    constructor(): this(mutableListOf())
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeTypedList(movies)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<MovieResponse> {
//        override fun createFromParcel(parcel: Parcel): MovieResponse {
//            return MovieResponse(parcel)
//        }
//
//        override fun newArray(size: Int): Array<MovieResponse?> {
//            return arrayOfNulls(size)
//        }
//    }
}



















