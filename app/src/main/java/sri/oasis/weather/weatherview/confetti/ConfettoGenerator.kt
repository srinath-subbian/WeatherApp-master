package sri.oasis.weather.weatherview.confetti

import sri.oasis.weather.weatherview.confetto.Confetto
import java.util.*


interface ConfettoGenerator {
    /**
     * Generate a random confetto to animate.
     *
     * @param random a [Random] that can be used to generate random confetto.
     * @return the randomly generated confetto.
     */
    abstract fun generateConfetto(random: Random): Confetto
}