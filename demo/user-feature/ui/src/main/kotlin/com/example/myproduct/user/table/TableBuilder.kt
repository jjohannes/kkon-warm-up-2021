package com.example.myproduct.user.table

import com.example.myproduct.model.MyProductRelease
import com.example.myproduct.user.data.DataRetriever

object TableBuilder {
    fun build() = build(DataRetriever.retrieve().releases)

    private fun build(releases: List<MyProductRelease>) =
        releases.associate { it.version to it.releaseNotes }
}