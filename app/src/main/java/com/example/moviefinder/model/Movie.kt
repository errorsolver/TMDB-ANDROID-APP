package com.example.moviefinder.model

import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie (
    @SerializedName("id")
    val id: String?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("poster_path")
    val poster: String?,
    @SerializedName("release_path")
    val release: String?,
) : Parcelable {
    constructor() : this("","","","")
}










