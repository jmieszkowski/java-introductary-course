package my_package.stream.team;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class teamMain {
    public static void main(String[] args) {
        Player player1 = new Player("kajksd", 100, BigDecimal.valueOf(100_000));
        Player player2 = new Player("adsa", 50, BigDecimal.valueOf(5_000));
        Player player3 = new Player("lkalds", 70, BigDecimal.valueOf(26_000));
        Player player4 = new Player("ka;ds;", 90, BigDecimal.valueOf(10_000));
        Player player5 = new Player("asd;ak", 10, BigDecimal.valueOf(19_000));

        Coach coach1 = new Coach("asdasda", "asda", BigDecimal.valueOf(190_000));
        Coach coach2 = new Coach("asd132", "asda", BigDecimal.valueOf(90_000));

        Team allStars = new Team(coach1);
        allStars.setPlayers(Arrays.asList(player1, player2));

        Team krepianka = new Team(coach2);
        krepianka.setPlayers(Arrays.asList(player3, player4, player5));

        League japanLeague = new League("Japan league");
        japanLeague.registerTeam(allStars);
        japanLeague.registerTeam(krepianka);


        List<Player> skilledPlayer = getAllPlayersWithHighSkill(japanLeague, player -> player.getSkill() > 70);
        List<Player> playersStartWithA = getAllPlayersWithHighSkill(japanLeague, player -> player.getNick().startsWith("a"));

        skilledPlayer.forEach(player -> System.out.println(player));
        System.out.println();
        playersStartWithA.forEach(player -> System.out.println(player));

        Coach coach3 = new Coach("lajsd", "alksjd", BigDecimal.valueOf(100_000));
        Coach coach4 = new Coach("khaj", "ksjad", BigDecimal.valueOf(20_000));

        List<Coach> coaches = Arrays.asList(coach1,coach2,coach3,coach4);

        Optional<Coach> coachesWith4Letter = coachesFilter(coaches);



    }

    private static List<Player> getPlayersOldWay(League league) {
        List<Player> result = new ArrayList<>();
        List<Team> teams = league.getTeams();

        for (Team t : teams) {
            result.addAll(t.getPlayers());
        }

        return result;
    }

    private static List<Player> getAllLeaguePlayers(League league) {
        return league.getTeams().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream())
                .collect(Collectors.toList());


    }
    
    private static List<Player> getAllPlayersWithHighSkill(League league, Predicate<Player> predicate) {
        return league.getTeams().stream()
                .map(team -> team.getPlayers())
                .flatMap(players -> players.stream())
                .filter(predicate)
                .collect(Collectors.toList());
    }

    private static Optional<Coach> coachesFilter(List<Coach> coaches){
            return coaches.stream()
                        .filter(coach -> coach.getName().length() == 4)
                        .findFirst();

    }
}
