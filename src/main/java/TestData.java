import org.apache.spark.ui.jobs.ApiHelper;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class TestData {
    @DataProvider(name = "create")
    public Object[][] dataProvFunc() throws IOException {
        return new Object[][] {
                {"Cagliari","Fiorentina"},
                {"Metz","Nice"},
                {"Granada","Osasuna"},
                {"Arsenal","Burnley"},
                {"Leicester","Brighton"},
                {"Crystal Palace","Liverpool"},
                {"Napoli","Salernitana"},
                {"Torino","Sassuolo"},
                {"Spezia","Sampdoria"},
                {"Angers","Troyes"},
                {"Clermont","Rennes"},
                {"Nantes","Lorient"},
                {"Bordeaux","Strasbourg"},
                {"RB Leipzig","Wolfsburg"},
                {"Real Madrid","Elche"},
                {"Guimaraes","Estoril Praia"},
                {"Maritimo","Belenenses"},
                {"Montpellier","Monaco"},
                {"Chelsea","Tottenham"},
                {"Hertha Berlin","Bayern M."},
                {"Empoli","AS Roma"},
                {"Rayo Vallecano","Athletic Bilbao"},
                {"Real Sociedad","Getafe"},
                {"Gil Vicente","Portimonense"},
                {"AC Milan","Juventus"},
                {"PSG","Reims"},
                {"Alaves","Barcelona"},
                {"FC Porto","Famalicao"},
                {"Angers","St.Etienne"},
                {"Estoril Praia","Arouca"},
                {"Nantes","Brest"},
                {"Nancy","Amiens"},
                {"Toulouse","Versailles 78 FC"},
                {"Reims","Bastia"},
                {"Marseille","Montpellier"},
                {"Vizela","Guimaraes"},
                {"Portimonense","Tondela"},
                {"FC Bergerac","St Etienne"},
                {"Braga","Moreirense"},
                {"Lens","Monaco"},
                {"FC Porto","Maritimo"},
                {"Estoril Praia","Pacos Ferreira"},
                {"PSG","Nice"},
                {"Famalicao","Arouca"},
                {"Santa Clara","Boavista"},
                {"Belenenses","Sporting"},
                {"Benfica","Gil Vicente"},
                {"Hertha Berlin","Bochum"},
                {"Athletic Bilbao","Espanyol"},
                {"Getafe","Levante"},
                {"Marseille","Angers"},
                {"Man.Utd","Middlesbrough"},
                {"Chelsea","Plymouth"},
                {"Arminia Bielefeld","Mgladbach"},
                {"Stuttgart","E.Frankfurt"},
                {"Augsburg","Union Berlin"},
                {"Mainz","Hoffenheim"},
                {"FC Koln","Freiburg"},
                {"Wolves","Norwich"},
                {"Southampton","Coventry"},
                {"Everton","Brentford"},
                {"Man.City","Fulham"},
                {"Huddersfield","Barnsley"},
                {"Stoke","Wigan"},
                {"Crystal Palace","Hartlepool"},
                {"Peterborough","QPR"},
                {"Mallorca","Cadiz"},
                {"St.Etienne","Montpellier"},
                {"Celta Vigo","Rayo Vallecano"},
                {"Bayern M.","RB Leipzig"},
                {"Cambridge Utd","Luton"},
                {"Burnley","Watford"},
                {"Osasuna","Sevilla"},
                {"Monaco","Lyon"},
                {"Tottenham","Brighton"},
                {"Lorient","Lens"},
                {"Liverpool","Cardiff"},
                {"Valencia","Real Sociedad"},
                {"Reims","Bordeaux"},
                {"Nice","Clermont"},
                {"Troyes","Metz"},
                {"Strasbourg","Nantes"},
                {"Dortmund","Leverkusen"},
                {"Bologna","Empoli"},
                {"Atalanta","Cagliari"},
                {"Venezia","Napoli"},
                {"Fiorentina","Lazio"},
                {"Sampdoria","Sassuolo"},
                {"Udinese","Torino"},
                {"Inter","AC Milan"},
                {"Salernitana","Spezia"},
                {"Juventus","Verona"},
                {"AS Roma","Genoa"},
                {"Barcelona","Atletico Madrid"},
                {"Rennes","Brest"},
                {"Nottm Forest","Leicester"},
                {"Wolfsburg","G.Furth"},
                {"Betis","Villarreal"},
                {"Bournemouth","Boreham Wood"},
                {"Lille","PSG"}

        };
    }
}
