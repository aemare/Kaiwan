package com.aemare

import com.aemare.enumeration.Format
import com.aemare.enumeration.Type

/**
 * @author Aemare
 * @date 11/05/2016
 * @description Initializes constants for the logger, this class is optional. (Uses default constants)
 */
class Initializer {
    /**
     * Initializes the script with the following options:
     * Logger Name (Kaiwan => My Awesome Logger),
     * Log Formatting (Format.FULL => Format.DET),
     * Allow Log Storage (False => True),
     * Log Storage Directory (Working/Directory/Kaiwan-Log.txt => Custom/Directory/LoggerName-Log.txt)
     */
    constructor(name: String, format: Format, allow_store: Boolean, storage_directory: String) {
        Log(Type.INFO, "Welcome to Kaiwan, a logger made by Aemare.")
        Log(Type.INFO, "You renamed the logger to $name on size: ${format.n}, you allowed storage at $storage_directory")
        Constants.LOGGER_NAME = name
        Constants.FORMAT = format
        Constants.ALLOW_STORE = allow_store
        Constants.STORAGE_DIRECTORY = storage_directory
    }
    /**
     * Initializes the script with the following options:
     * Logger Name (Kaiwan => My Awesome Logger),
     * Log Formatting (Format.FULL => Format.DET),
     * Allow Log Storage (False => True, on the default location(workingdirectory/Kaiwan-Log.txt))
     */
    constructor(name: String, format: Format, storage_directory: Boolean) {
        Log(Type.INFO, "Welcome to Kaiwan, a logger made by Aemare.")
        Log(Type.INFO, "You renamed the logger to $name on size: ${format.n}, you allowed storage at ${Constants.STORAGE_DIRECTORY}")
        Constants.LOGGER_NAME = name
        Constants.FORMAT = format
        Constants.ALLOW_STORE = storage_directory
    }
    /**
     * Initializes the script with the following options:
     * Logger Name (Kaiwan => My Awesome Logger),
     * Log Formatting (Format.FULL => Format.DET)
     */
    constructor(name: String, format: Format) {
        Log(Type.INFO, "Welcome to Kaiwan, a logger made by Aemare.")
        Log(Type.INFO, "You renamed the logger to $name on size: ${format.n}, you didn't allow storage.")
        Constants.LOGGER_NAME = name
        Constants.FORMAT = format
    }
}