package com.example.a99group_mobileexercise_benedictokennethsubagio

import com.google.gson.annotations.SerializedName

//data class Response99Group(
//
//	@field:SerializedName("Response99Group")
//	val response99Group: List<Response99GroupItem?>? = null
//)
//
data class Attributes(

	@field:SerializedName("bedrooms")
	val bedrooms: Int? = null,

	@field:SerializedName("area_size")
	val areaSize: Int? = null,

	@field:SerializedName("price")
	val price: Int? = null,

	@field:SerializedName("bathrooms")
	val bathrooms: Int? = null
)

data class Address(

	@field:SerializedName("district")
	val district: String? = null,

	@field:SerializedName("street_name")
	val streetName: String? = null
)

data class Response99GroupItem(

	@field:SerializedName("completed_at")
	val completedAt: String? = null,

	@field:SerializedName("address")
	val address: Address? = null,

	@field:SerializedName("photo")
	val photo: String? = null,

	@field:SerializedName("attributes")
	val attributes: Attributes? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("category")
	val category: String? = null,

	@field:SerializedName("project_name")
	val projectName: String? = null,

	@field:SerializedName("tenure")
	val tenure: Int? = null
)
