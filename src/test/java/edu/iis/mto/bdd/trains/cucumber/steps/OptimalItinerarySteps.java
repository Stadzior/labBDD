package edu.iis.mto.bdd.trains.cucumber.steps;

import java.util.List;

import org.joda.time.LocalTime;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

public class OptimalItinerarySteps {

	@Zakładając("^pociągi linii \"(.*)\" z \"(.*)\" odjeżdżają ze stacji \"(.*)\" do \"(.*)\" o$")
	public void givenArrivingTrains(String line, String lineStart, String departure, String destination,
			@Transform(JodaLocalTimeConverter.class) List<LocalTime> departureTimes) {
		//throw new PendingException();

	}

	@Gdy("^chcę podróżować z \"([^\"]*)\" do \"([^\"]*)\" o (.*)$")
	public void whenIWantToTravel(String departure, String destination, @Transform(JodaLocalTimeConverter.class) LocalTime startTime) {
		//throw new PendingException();
	}

	@Wtedy("^powinienem uzyskać informację o pociągach o:$")
	public void shouldBeInformedAbout(@Transform(JodaLocalTimeConverter.class) List<LocalTime> expectedTrainTimes) {
		//throw new PendingException();
	}

    @Zakładając("^, że chcę się dostać z \"([^\"]*)\" do \"([^\"]*)\" I następny pociąg odjeżdża na linii \"([^\"]*)\" o$")
    public void _że_chcę_się_dostać_z_do_I_następny_pociąg_odjeżdża_na_linii_o(String arg1, String arg2, String arg3,@Transform(JodaLocalTimeConverter.class) LocalTime nextTrainTime) {
        //throw new PendingException();
    }

    @Gdy("^ zapytam o godzinę przyjazdu$")
    public void _zapytam_o_godzinę_przyjazdu() throws Throwable {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @Wtedy("^ powinienem uzyskać następujący szacowany czas przyjazdu:$")
    public void _powinienem_uzyskać_następujący_szacowany_czas_przyjazdu(@Transform(JodaLocalTimeConverter.class) LocalTime expectedTime) {
        //throw new PendingException();
    }
}
