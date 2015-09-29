package org.ameya.groovygoodness.constructs

import spock.lang.Specification
import org.ameya.groovygoodness.constructs.Intro;

/**
 * Created by Webonise on 29/09/15.
 */
class IntroSpec extends  Specification {

    def "variables definitions should be done properly"(){
        setup:
        Intro intro = new Intro()
        expect :
        assert intro.x == "1" : "Variable not correctly defined"
    }
}
