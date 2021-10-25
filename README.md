# Donut
 ASCII taurus render in Java

A translation of RandomThings23's taurus renderer: https://github.com/RandomThings23/donut

The character chosen for illumination depends on the direction a line perpendicular to the surface at that point would take.
I won't claim to fully understand the process but an explanation of the conept can be found here: https://www.a1k0n.net/2011/07/20/donut-math.html

I was unable to display my output in a way that satisfied me as I could not find a way to clear the console in Java on windows. I did find a Linux method but I couldn't test it.
I also managed to slightly improve efficiency over the original by printing each render with a single command, as opposed to the line-by-line method RandomThings23 used.
