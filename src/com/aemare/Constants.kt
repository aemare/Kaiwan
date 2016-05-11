package com.aemare

import com.aemare.enumeration.Format

/**
 * @author Aemare
 * @date 11/05/2016
 * @description Holds all the Constants used for Kaiwan.
 */
object Constants {

    //Holds the name of the logger.
    var LOGGER_NAME: String = "Kaiwan"
    //Defines if the storage is either allowed or not.
    var ALLOW_STORE: Boolean = true
    //Holds the directory used to store the log.
    var STORAGE_DIRECTORY: String =  "${System.getProperty("user.dir")}\\$LOGGER_NAME-Log.txt"
    //Holds the Format used for the log.
    var FORMAT: Format = Format.FULL

}