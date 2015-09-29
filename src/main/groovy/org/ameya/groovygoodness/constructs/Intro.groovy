package org.ameya.groovygoodness.constructs

/**
 * Created by Webonise on 29/09/15.
 */
class Intro {

    def x = "1"

    def demonstrateMutipleAssigment (){
        def (a, b, c) = [10, 20, "String"]
    }

    def demonstrateUnderflow(){
        def (a, b,c) = [10, 20]
        assert  a == 10 && b == 20 && c == null
    }

    def demonstrateOverflow(){
        def (a, b) = [10, 20,30]
        assert  a == 10 && b == 20
    }



}
