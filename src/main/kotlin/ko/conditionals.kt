package ko

import java.awt.Color
import java.awt.Color.*
import java.lang.Exception

/*
if is an expression
val max = if(a>b) else b
 */

fun mix(c1: Color, c2: Color)=
    when(setOf(c1,c2)){
        setOf(RED, YELLOW) -> ORANGE
        setOf(YELLOW, BLUE) -> GREEN
        setOf(WHITE, RED) -> PINK
        else -> throw  Exception("Dirty color")
    }

