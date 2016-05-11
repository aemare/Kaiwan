package com.aemare.enumeration

/**
 * @author Aemare
 * @date 11/05/2016
 * @description Keeps all the available formats for Kaiwan, every Format type has a different log formatting.
 * @returns id (identification), n (name), sdf (SimpleDateFormat)
 */
enum class Format(val id: Int, val n: String, val sdf: String) {
    MIN(0, "Minimal", "hh:MM"),
    FULL(1, "Full", "yyyy/mm/dd hh:MM:ss"),
    DET(2, "Detailed","yyyy/mm/ww/dd hh:MM:ss:SS")
}