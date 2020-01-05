package org.wit.archaeologicalfieldwork.helpers

import org.wit.archaeologicalfieldwork.models.HillfortModel

fun constructEmail(hillfort: HillfortModel): String {
    return "Visit this Hillfort\n Name:${hillfort.name}\nDescription: ${hillfort.description}\nI visited on: ${hillfort.date}\nI rated it: ${hillfort.rating}/5\n Here is what to look out for: ${hillfort.image}\nWhere to find it: \nhttps://www.google.com/maps/place//@${hillfort.location.lat},${hillfort.location.lng},11z"
}