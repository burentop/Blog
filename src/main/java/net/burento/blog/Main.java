package net.burento.blog;

import static spark.Spark.get;

public class Main {
    public static void main(String[] args) {
        get("/", (req, res) -> "Brent's blog");
    }
}
