package org.ameya.groovygoodness.objectdestructuring

import groovy.transform.Immutable

/**
 * Created by Webonise on 29/09/15.
 */
@Immutable
class Coordinates {
    double latitude
    double longitude

    double getAt(int idx) {
        if (idx == 0) latitude
        else if (idx == 1) longitude
        else throw new Exception("Wrong coordinate index, use 0 or 1")
    }
}
