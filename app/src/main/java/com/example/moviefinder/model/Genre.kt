package com.example.moviefinder.model

import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Genre (
    @SerializedName("id")
    val id: String?,
    @SerializedName("genre")
    val genre: String?
) : Parcelable {
    constructor() : this("","")
}










