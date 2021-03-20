package io.github.gianpamx.shscale


fun Int.toClock() = "${minutes()}:${seconds()}"
private fun Int.minutes() = this / 60
private fun Int.seconds() = "${this % 60}".padStart(2, '0')
