package com.aemare.enumeration

/**
 * @author Aemare
 * @date 11/05/2016
 * @description Keeps all the available log types for Kaiwan, every Type has it's own color and message.
 * @returns id (identification), n (name), clr (color)
 */
enum class Type(val id: Int, val n: String, val clr: String) {
    ORG(0, "Original", "\u001B[30m"),
    WARN(1, "Warning", "\u001B[33m"),
    ERR(2, "Error", "\u001B[31m"),
    ANNO(3, "Annotation", "\u001B[35m"),
    INFO(4, "Information", "\u001B[34m")
}