package org.ameya.groovygoodness.constructs

import spock.lang.Shared
import spock.lang.Specification
import org.ameya.groovygoodness.constructs.Intro;

/**
 * Created by Webonise on 29/09/15.
 */
class IntroSpec extends  Specification {

    @Shared
    Intro intro = new Intro()

    def "variables definitions should be done properly"(){
        expect :
        assert intro.x == "1" : "Variable not correctly defined"
    }

    def "demonstrateMutipleAssigment should return the correct String"(){
        when :
        intro.demonstrateMutipleAssigment()
        then :
        assert  true
    }

    def "demonstrateUnderflow should  work as expected"(){
        when :
        intro.demonstrateUnderflow()
        then :
        assert  true

    }


    def "demonstrateOverflow should  work as expected"(){
        when :
        intro.demonstrateOverflow()
        then :
        assert  true

    }
}
