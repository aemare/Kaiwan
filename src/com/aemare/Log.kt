package com.aemare

import com.aemare.enumeration.Format
import com.aemare.enumeration.Type
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter
import java.text.SimpleDateFormat
import java.util.*

/**
 * @author Aemare
 * @date 11/05/2016
 * @description Handles all the actions that need to be performed when logging.
 */
class Log {

    /**
     * Performs the original log action.
     */
    constructor(s: String) {
        val t: Type = Type.ORG
        var n = ""
        when (Constants.FORMAT) {
            Format.FULL,
            Format.DET -> n = t.n
            Format.MIN -> n = t.name
        }
        val text = "${Constants.LOGGER_NAME} on ${getDate()} : (${n.toUpperCase()}) $s"
        println(t.clr+text)
        if (Constants.ALLOW_STORE) write(text)
    }

    /**
     * Performs the log action with a custom Type.
     */
    constructor(t: Type, s: String) {
        var n = ""
        when (Constants.FORMAT) {
            Format.FULL,
            Format.DET -> n = t.n
            Format.MIN -> n = t.name
        }
        val text = "${Constants.LOGGER_NAME} on ${getDate()} : (${n.toUpperCase()}) $s"
        println(t.clr+text)
        if (Constants.ALLOW_STORE) write(text)
    }

    /**
     * Gets the date on basis of the Format type you selected.
     */
    fun getDate(): String {
        val sdf: SimpleDateFormat = SimpleDateFormat(Constants.FORMAT.sdf)
        return sdf.format(Date())
    }

    /**
     * Writes down the log on a certain path, if you allowed the script to do so.
     */
    fun write(s: String) {
        val f: File = File(Constants.STORAGE_DIRECTORY)
        val bw: BufferedWriter = BufferedWriter(FileWriter(f, true))
        if (!f.exists())
            f.createNewFile()
        try {
            bw.write(s)
            bw.newLine()
        } catch (e: Exception) {
            println("${Type.ERR.clr}Kaiwan on ${getDate()} : (INTERNAL ${Type.ERR.n.toUpperCase()}) $s")
        }
        bw.close()
    }

}
