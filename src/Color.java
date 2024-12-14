public enum Color {
    RED("Красный – это первый цвет, который младенцы начинают различать"),
    BLUE("Синий цвет - Это один из самых любимых цветов в мире"),
    GREEN("В культуре ислама зелёный символизирует рай и святость."),
    YELLOW("Желтый – это цвет солнца, оптимизма и счастья"),
    ORANGE("В 60-х годах оранжевый стал популярным цветом в культуре хиппи, символизируя свободу и радость"),
    PINK("Розовый символизирует нежность, любовь и романтику"),
    WHITE("Белый цвет отражает все остальные цвета спектра и является символом совершенства"),
    GRAY("В моде серый – универсальный цвет, который легко комбинировать с другими оттенками."),
    BLACK("В некоторых культурах черный считается символом защиты от злых духов"),
    PURPLE("Фиолетовый издавна ассоциировался с королевской властью, так как пурпурный краситель был редким и дорогим");

    String colorMessage;

    Color (String colorMessage){
        this.colorMessage = colorMessage;
    }

}
