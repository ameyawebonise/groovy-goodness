package org.ameya.groovygoodness.objectdestructuring

import spock.lang.Shared
import spock.lang.Specification

/**
 * Created by Webonise on 29/09/15.
 */
class ObjectDestructuringDemoSpec extends Specification{


    def "deconstructObject should work as expected"(){
        when:
        def coordinate = new Coordinates(latitude: 43.23, longitude: 3.67)
        def(la,lo) = coordinate
        then :
        assert la == 43.23
        assert lo == 3.67
    }
}
