package Quiz3ExtraWork.Sets;

// Class File

// UML Diagram
//
// ================================================================
//                            TournamentBrackets
// ================================================================
// - bracket1: Set
// - bracket2: Set
// ================================================================
// + TournamentBrackets()
//
// + addCountries(countries: String[], bracket: int): void
// + cardinality(bracket: int): int
// + eliminateCountry(country: String, bracket; int): boolean
// + showBracket(bracket: int): void
// ================================================================

import java.util.Set;
import java.util.TreeSet;

public class TournamentBrackets {
    // Instance variables
    private Set<String> bracket1;
    private Set<String> bracket2;

    // Constructors
    public TournamentBrackets() {
        bracket1 = new TreeSet<>();
        bracket2 = new TreeSet<>();
    }

    // Instance Methods

    // Add the array elements to the appropriate set.
    //    Bracket should be either 1 or 2.
    //    If appropriate throw an Illegal Argument Exception with
    //    the message "Method Add Countries".
    public void addCountries(String[] countries, int brackets) {
        if (brackets == 1) {
            for (String country : countries) {
                bracket1.add(country);
            }
        } else if (brackets == 2) {
            for (String country : countries) {
                bracket2.add(country);
            }
        } else {
            throw new IllegalArgumentException("Method Add Countries");
        }
    }

    public int cardinality(int bracket) {
        if (bracket == 1) {
            return bracket1.size();
        } else if (bracket == 2) {
            return bracket2.size();
        } else {
            throw new IllegalArgumentException("Method Cardinality");
        }
    }

    public boolean eliminateCountry(String country, int bracket) {
        if (bracket == 1) {
            return bracket1.remove(country);
        } else if (bracket == 2) {
            return bracket2.remove(country);
        } else {
            throw new IllegalArgumentException("Method Eliminate Country");
        }
    }

    public void showBracket(int bracket) {
        if (bracket == 1) {
            for (String elem : bracket1) {
                System.out.print(elem + ",");
            }
        } else if (bracket == 2) {
            for (String elem : bracket2) {
                System.out.print(elem + ",");
            }
        } else {
            throw new IllegalArgumentException("Method Show Bracket");
        }
    }

}
