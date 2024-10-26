package com.example.a99group_mobileexercise_benedictokennethsubagio.detailPage

import com.google.gson.annotations.SerializedName

// Json object{} -> class
// Json array[] -> List

data class ResponseDetailPage(

	@field:SerializedName("property_details")
	val propertyDetails: List<PropertyDetailsItem?>? = null,

	@field:SerializedName("address")
	val address: DetailAddress? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("photo")
	val photo: String? = null,

	@field:SerializedName("attributes")
	val attributes: DetailsAttributes? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("project_name")
	val projectName: String? = null
)

data class DetailsAttributes(

	@field:SerializedName("bedrooms")
	val bedrooms: Int? = null,

	@field:SerializedName("area_size")
	val areaSize: Int? = null,

	@field:SerializedName("price")
	val price: Int? = null,

	@field:SerializedName("bathrooms")
	val bathrooms: Int? = null
)

data class DetailAddress(

	@field:SerializedName("map_coordinates")
	val mapCoordinates: MapCoordinates? = null,

	@field:SerializedName("subtitle")
	val subtitle: String? = null,

	@field:SerializedName("title")
	val title: String? = null
)

data class MapCoordinates(

	@field:SerializedName("lng")
	val lng: Any? = null,

	@field:SerializedName("lat")
	val lat: Any? = null
)

data class PropertyDetailsItem(

	@field:SerializedName("label")
	val label: String? = null,

	@field:SerializedName("text")
	val text: String? = null
)
