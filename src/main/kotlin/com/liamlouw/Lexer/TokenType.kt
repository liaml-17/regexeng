enum class TokenType(val importance: Int) {
    CHARACTER(0),

    // Anchors
    START(0),
    END(0),

    // Quantifiers
    ASTERIX(0),
    PLUS(0),
    Q_MARK(0),
    LEFT_CURL(0),
    RIGHT_CURL(0),

    // Logic
    STRAIGHT_BAR(0),
    LEFT_PAREN(0),
    RIGHT_PAREN(0),

    // Class
    LEFT_BRACKET(0),
    RIGHT_BRACKET(0),

    // Any / Other
    DOT(0),
    COMMA(0)
}
