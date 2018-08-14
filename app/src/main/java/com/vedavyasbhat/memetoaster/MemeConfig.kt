package com.vedavyasbhat.memetoaster

import java.util.*

object Memes {

    object Images {
        const val Apologetic = "apologetic"
        const val AwwYeah = "awwyeah"
        const val Fuuu = "fuuu"
        const val ThumbsUp = "thumbsup"
        const val TrollFace = "trollface"
        const val YUDoDis = "yudodis"

        private val nameToResourceMap = mapOf(
                Apologetic to R.drawable.apologetic,
                AwwYeah to R.drawable.awwyeah,
                Fuuu to R.drawable.fuuu,
                ThumbsUp to R.drawable.thumbsup,
                TrollFace to R.drawable.trollface,
                YUDoDis to R.drawable.yudodis
        )

        private val nameToTextMap = mapOf(
                Apologetic to "I'm sorryyy",
                AwwYeah to "Yeeeeeaaaaahhh",
                Fuuu to "Dang it",
                ThumbsUp to "Done!",
                TrollFace to "Lel",
                YUDoDis to "Y U DO DIS"
        )

        fun resource(name: String): Int {
            return nameToResourceMap[name] ?: 0
        }

        fun text(name: String): String? {
            return nameToTextMap[name]
        }
    }

    object Ascii {
        const val Acid = "⊂(◉‿◉)つ"
        const val Afraid = "(ㆆ _ ㆆ)"
        const val Alpha = "α"
        const val Angel = "☜(⌒▽⌒)☞"
        const val Angry = "•`_´•"
        const val Arrowhead = "⤜(ⱺ ʖ̯ⱺ)⤏"
        const val Apple = ""
        const val Ass = "(‿|‿)"
        const val Awkward = "•͡˘㇁•͡˘"
        const val Bat = "/|\\ ^._.^ /|\\"
        const val Bear = "ʕ·͡ᴥ·ʔ﻿"
        const val BearFlip = "ʕノ•ᴥ•ʔノ ︵ ┻━┻"
        const val BearHug = "ʕっ•ᴥ•ʔっ"
        const val Because = "∵"
        const val Beta= "β"
        const val BigHeart = "❤"
        const val BlackEye = "0__#"
        const val Blubby = "(      0    _   0    )"
        const val Blush= "(˵ ͡° ͜ʖ ͡°˵)"
        const val Bond= "┌( ͝° ͜ʖ͡°)=ε/̵͇̿̿/’̿’̿ ̿"
        const val Boobs = "( . Y . )"
        const val Bored = "(-_-)"
        const val Bribe = "( •͡˘ _•͡˘)ノð"
        const val Bubbles = "( ˘ ³˘)ノ°ﾟº❍｡"
        const val Butterfly = "ƸӜƷ"
        const val Cat = "(= ФェФ=)"
        const val CatLenny = "( ͡° ᴥ ͡°)﻿"
        const val Checkmark = "✔"
        const val Cheer = "※\\(^o^)/※"
        const val Chubby = "╭(ʘ̆~◞౪◟~ʘ̆)╮"
        const val Claro = "(͡ ° ͜ʖ ͡ °)"
        const val Clique = "ヽ༼ ຈل͜ຈ༼ ▀̿̿Ĺ̯̿̿▀̿ ̿༽Ɵ͆ل͜Ɵ͆ ༽ﾉ"
        const val Cloud = "☁"
        const val Club = "♣"
        const val Coffee = "c[_]"
        const val Command = "⌘"
        const val Cool = "(•_•) ( •_•)>⌐■-■ (⌐■_■)"
        const val Copyright = "©"
        const val Creep = "ԅ(≖‿≖ԅ)"
        const val Creepcute = "ƪ(ړײ)‎ƪ​​"
        const val Crim3S = "( ✜︵✜ )"
        const val Cross = "†"
        const val Cry = "(╥﹏╥)"
        const val CryWave = "( ╥﹏╥) ノシ"
        const val Cute = "(｡◕‿‿◕｡)"
        const val Dab = "ヽ( •_)ᕗ"
        const val DamnYou = "(ᕗ ͠° ਊ ͠° )ᕗ"
        const val Dance = "ᕕ(⌐■_■)ᕗ ♪♬"
        const val Dead = "x⸑x"
        const val DealWithIt = "(⌐■_■)"
        const val Delta = "Δ"
        const val Depressed = "(︶︹︶)"
        const val Derp = "☉ ‿ ⚆"
        const val Diamond = "♦"
        const val DJ = "d[-_-]b"
        const val Dog = "(◕ᴥ◕ʋ)"
        const val Dollar = "$"
        val DollarBill = { amount: Int ->
            val table = mapOf(
                "0" to "ο̲̅", "1" to "̅ι", "2" to "2̅", "3" to "3̅", "4" to "4̅",
                "5" to "5̲̅", "6" to "6̅", "7" to "7̅", "8" to "8̅", "9" to "9̅"
            )
            "[̲̅$̲̅(̲" + transpose(amount.toString(), table) + "̅)̲̅$̲̅]"
        }
        const val Dong = "(̿▀̿ ̿Ĺ̯̿̿▀̿ ̿)̄"
        const val Donger = "ヽ༼ຈل͜ຈ༽ﾉ"
        const val DontCare = "(- ʖ̯-)"
        const val DoNotWant = "ヽ(｀Д´)ﾉ"
        const val Dope = "<(^_^)>"
        const val DoubleQuotesLeft = "«"
        const val DoubleQuotesRight = "»"
        const val DoubleFlat = "𝄫"
        const val DoubleSharp = "𝄪"
        const val DoubleTableFlip = "┻━┻ ︵ヽ(`Д´)ﾉ︵ ┻━┻"
        const val Down = "↓"
        const val DuckFace = "(・3・)"
        const val Duel = "ᕕ(╭ರ╭ ͟ʖ╮•́)⊃¤=(————-"
        const val Duh = "(≧︿≦)"
        const val DunnoLol = "¯\\(°_o)/¯"
        const val Ebola = "ᴇʙᴏʟᴀ"
        const val EerieMob = "(-(-_-(-_(-_(-_-)_-)-_-)_-)_-)-)"
        const val Ellipsis = "…"
        const val Emdash = "–"
        const val EmptyStar = "☆"
        const val EmptyTriangle = "△"
        const val Endure = "(҂◡_◡) ᕤ"
        const val Envelope = "✉︎"
        const val Epsilon = "ɛ"
        const val Euro = "€"
        const val Evil = "ψ(｀∇´)ψ"
        const val EvilLenny = "(͠≖ ͜ʖ͠≖)"
        const val Excited = "(ﾉ◕ヮ◕)ﾉ*:・ﾟ✧"
        const val Execution = "(⌐■_■)︻╦╤─   (╥﹏╥)"
        const val Facebook = "(╯°□°)╯︵ ʞooqǝɔɐɟ"
        const val Facepalm = "(－‸ლ)"
        val FancyText = { text: String ->
            val table = mapOf(
                "a" to "α", "b" to "в", "c" to "¢", "d" to "∂", "e" to "є", "f" to "ƒ",
                "g" to "g", "h" to "н", "i" to "ι", "j" to "נ", "k" to "к", "l" to "ℓ",
                "m" to "м", "n" to "η", "o" to "σ", "p" to "ρ", "q" to "q", "r" to "я",
                "s" to "ѕ", "t" to "т", "u" to "υ", "v" to "ν", "w" to "ω", "x" to "χ",
                "y" to "у", "z" to "z"
            )
            transpose(text.toLowerCase(), table)
        }
        const val Fart = "(ˆ⺫ˆ๑)<3"
        const val Fight = "(ง •̀_•́)ง"
        const val Finn = "| (• ◡•)|"
        const val Fish = "<\"(((<3"
        const val Five = "卌"
        const val FiveEighths = "⅝"
        const val Flat = "♭"
        const val Flexing = "ᕙ(`▽´)ᕗ"
        val FlipText = { text: String ->
            val table = mapOf(
                "a" to "\u0250", "b" to "q", "c" to "\u0254", "d" to "p", "e" to "\u01DD",
                "f" to "\u025F", "g" to "\u0183", "h" to "\u0265", "i" to "\u0131",
                "j" to "\u027E", "k" to "\u029E", "l" to "\u05DF", "m" to "\u026F",
                "n" to "u", "p" to "d", "q" to "b", "r" to "\u0279", "t" to "\u0287",
                "u" to "n", "v" to "\u028C", "w" to "\u028D", "y" to "\u028E",
                "." to "\u02D9", "[" to "]", "(" to ")", "{" to "}", "?" to "\u00BF",
                "!" to "\u00A1", "'" to ",", "<" to ">", "_" to "\u203E",
                "\"\"" to "\u201E", "\\" to "\\", ";" to "\u061B", "\u203F" to "\u2040",
                "\u2045" to "\u2046", "\u2234" to "\u2235"
            )
            transpose(text.toLowerCase(), table, true)
        }
        val FlipTextTable = { text: String ->
            "(ノ ゜Д゜)ノ ︵  " + FlipText(text)
        }
        const val Flipped = "┬─┬﻿ ︵ /(.□. \\）"
        const val Flower = "(✿◠‿◠)"
        const val Flower2 = "✿"
        const val Fly = "─=≡Σ((( つ◕ل͜◕)つ"
        const val FriendFlip = "(╯°□°)╯︵ ┻━┻ ︵ ╯(°□° ╯)"
        const val Frown = "(ღ˘⌣˘ღ)"
        const val fuckoff = "୧༼ಠ益ಠ╭∩╮༽"
        const val FuckYou = "┌П┐(ಠ_ಠ)"
        const val Gentleman = "ಠ_ರೃ"
        const val Ghast = "= _ ="
        const val Ghost = "༼ つ ╹ ╹ ༽つ"
        const val Gift = "(´・ω・)っ由"
        const val Gimme = "༼ つ ◕_◕ ༽つ"
        const val GiveMeYourMoney = "(•-•)⌐"
        const val GlitterBomb = "(*・‿・)ノ⌒*:･ﾟ✧"
        const val Glasses = "(⌐ ͡■ ͜ʖ ͡■)"
        const val GlassesOff = "( ͡° ͜ʖ ͡°)ﾉ⌐■-■"
        const val GlitterDerp = "(ﾉ☉ヮ⚆)ﾉ ⌒*:･ﾟ✧"
        const val Gloomy = "(_゜_゜_)"
        const val Goatse = "(з๏ε)"
        const val GotIt = "(☞ﾟ∀ﾟ)☞"
        const val Greet = "( ´◔ ω◔`) ノシ"
        const val Gun = "︻╦╤─"
        const val Hadouken = "༼つಠ益ಠ༽つ ─=≡ΣO))"
        const val HammerAndSickle = "☭"
        const val HandLeft = "☜"
        const val HandRight = "☞"
        const val Haha = "٩(^‿^)۶"
        const val Happy = "٩( ๑╹ ꇴ╹)۶"
        const val HappyGarry = "ᕕ( ᐛ )ᕗ"
        const val Heart = "♥"
        const val Hello = "(ʘ‿ʘ)╯"
        const val Help = "\\(°Ω°)/"
        const val HighFive = "._.)/\\(._."
        const val Hitting = "( ｀皿´)｡ﾐ/"
        const val Hugs = "(づ｡◕‿‿◕｡)づ"
        const val IKnowRight = "┐｜･ิω･ิ#｜┌"
        const val Illuminati = "୧(▲ᴗ▲)ノ"
        const val Infinity = "∞"
        const val InLove = "(っ´ω`c)♡"
        const val Integral = "∫"
        const val Internet = "ଘ(੭*ˊᵕˋ)੭* ̀ˋ ɪɴᴛᴇʀɴᴇᴛ"
        const val InterroBang = "‽"
        const val Jake = "(❍ᴥ❍ʋ)"
        const val Kappa = "(¬,‿,¬)"
        const val Kawaii = "≧◡≦"
        const val Keen = "┬┴┬┴┤Ɵ͆ل͜Ɵ͆ ༽ﾉ"
        const val Kiahh = "~\\(≧▽≦)/~"
        const val Kiss = "(づ ￣ ³￣)づ"
        const val Kyubey = "／人◕ ‿‿ ◕人＼"
        const val Lambda = "λ"
        const val Lazy = "_(:3」∠)_"
        const val Left = "←"
        const val Lenny = "( ͡° ͜ʖ ͡°)"
        const val LennyBill = "[̲̅$̲̅(̲̅ ͡° ͜ʖ ͡°̲̅)̲̅$̲̅]"
        const val LennyFight = "(ง ͠° ͟ʖ ͡°)ง"
        const val LennyFlip = "(ノ ͡° ͜ʖ ͡°ノ)   ︵ ( ͜。 ͡ʖ ͜。)"
        const val LennyGang = "( ͡°( ͡° ͜ʖ( ͡° ͜ʖ ͡°)ʖ ͡°) ͡°)"
        const val LennyShrug = "¯\\_( ͡° ͜ʖ ͡°)_/¯"
        const val LennySir = "( ಠ ͜ʖ ರೃ)"
        const val LennyStalker = "┬┴┬┴┤( ͡° ͜ʖ├┬┴┬┴"
        const val LennyStrong = "ᕦ( ͡° ͜ʖ ͡°)ᕤ"
        const val LennyWizard = "╰( ͡° ͜ʖ ͡° )つ──☆*:・ﾟ"
        val Loading = { percent: Double ->
            val filledBlocks =
                    if (Math.round(percent / 10) <= 10)
                        Math.round(percent / 10)
                     else 10
            val emptyBlocks = 10 - filledBlocks
            var str = ""
            (1..filledBlocks).forEach { str += "█" }
            (1..emptyBlocks).forEach { str += "▒" }
            str
        }
        const val Lol = "L(° O °L)"
        const val Look = "(ಡ_ಡ)☞"
        const val Loud = "ᕦ(⩾﹏⩽)ᕥ"
        const val Love = "♥‿♥"
        const val LoveBear = "ʕ♥ᴥ♥ʔ"
        const val Lumpy = "꒰ ꒡⌓꒡꒱"
        const val Luv = "-`ღ´-"
        const val Magic = "ヽ(｀Д´)⊃━☆ﾟ. * ･ ｡ﾟ,"
        const val MagicFlip = "(/¯◡ ‿ ◡)/¯ ~ ┻━┻"
        const val Meep = "\\(°^°)/"
        const val Meh = "ಠ_ಠ"
        const val Metal = "\\m/,(> . <)_\\m/"
        const val MistyEyes = "ಡ_ಡ"
        const val Monster = "༼ ༎ຶ ෴ ༎ຶ༽"
        const val Natural = "♮"
        const val Needle = "┌(◉ ͜ʖ◉)つ┣▇▇▇═──"
        const val Nerd = "(⌐⊙_⊙)"
        const val Nice = "( ͡° ͜ °)"
        const val No = "→_←"
        const val NoClue = "／人◕ __ ◕人＼"
        const val Nom = "(っˆڡˆς)"
        const val Note = "♫"
        const val Nuclear = "☢"
        const val Nyan = "~=[,,_,,]:3"
        const val Nyeh = "@^@"
        const val OhShit = "( º﹃º )"
        const val Omega = "Ω"
        const val Omg = "◕_◕"
        const val OneEighth = "⅛"
        const val OneFourth = "¼"
        const val OneHalf = "½"
        const val OneThird = "⅓"
        const val Option = "⌥"
        const val OhReally = "(눈_눈)"
        const val OhYou = "(◞థ౪థ)ᴖ"
        const val Peace = "✌(-‿-)✌"
        const val Pear = "(__>-"
        const val Pi = "π"
        const val PingPong = "( •_•)O*¯`·.¸.·´¯`°Q(•_• )"
        const val Plain = "._."
        const val Pleased = "(˶‾᷄ ⁻̫ ‾᷅˵)"
        const val Point = "(☞ﾟヮﾟ)☞"
        const val Pooh = "ʕ •́؈•̀)"
        const val Porcupine = "(•ᴥ• )́`́'́`́'́⻍"
        const val Pound = "£"
        const val Praise = "(☝ ՞ਊ ՞)☝"
        const val Punch = "O=('-'Q)"
        const val Rage = "t(ಠ益ಠt)"
        const val RageFlip = "(ノಠ益ಠ)ノ彡┻━┻"
        const val RainbowCat = "(=^･ｪ･^=))ﾉ彡☆"
        const val Really = "ò_ô"
        const val Registered = "®"
        const val Right = "→"
        const val Riot = "୧༼ಠ益ಠ༽୨"
        val RollDice = { amount: Int ->
            (1..amount).joinToString(separator = " ") {
                val randomDiceInt = (0..5).let {
                    Random().nextInt((it.endInclusive + 1) - it.start) +  it.start
                }
                listOf("⚀", "⚁", "⚂", "⚃", "⚄", "⚅")[randomDiceInt]
            }
        }
        const val RollEyes = "(◔_◔)"
        const val Rose = "✿ڿڰۣ—"
        const val Run = "(╯°□°)╯"
        const val Sad = "ε(´סּ︵סּ`)з"
        const val SadDonger = "ヽ༼ຈʖ̯ຈ༽ﾉ"
        const val SadLenny = "( ͡° ʖ̯ ͡°)"
        const val SevenEigths = "⅞"
        const val Sharp = "♯"
        const val Shout = "╚(•⌂•)╝"
        const val Shrug = "¯\\_(ツ)_/¯"
        const val Shy = "=^_^="
        const val Sigma = "Σ"
        const val Skull = "☠"
        const val Smile = "ツ"
        const val Smiley = "☺︎"
        const val Smirk = "¬‿¬"
        const val Snowman = "☃"
        const val Sob = "(;´༎ຶД༎ຶ`)"
        const val SovietTableFlip = "ノ┬─┬ノ ︵ ( \\o°o)\\"
        const val Spade = "♠"
        const val SquareRoot = "√"
        const val Squid = "<コ:彡"
        const val Star = "★"
        const val Strong = "ᕙ(⇀‸↼‶)ᕗ"
        const val Suicide = "ε/̵͇̿̿/’̿’̿ ̿(◡︵◡)"
        const val Sum = "∑"
        const val Sun = "☀"
        const val Surprised = "(๑•́ ヮ •̀๑)"
        const val Surrender = "\\_(-_-)_/"
        const val Stalker = "┬┴┬┴┤(･_├┬┴┬┴"
        const val Swag = "(̿▀̿‿ ̿▀̿ ̿)"
        const val Sword = "o()xxxx[{::::::::::::::::::>"
        const val TableDown = "┬─┬﻿ ノ( ゜-゜ノ)"
        const val TableFlip = "(ノ ゜Д゜)ノ ︵ ┻━┻"
        const val Tau = "τ"
        const val Tears = "(ಥ﹏ಥ)"
        const val Terrorist = "୧༼ಠ益ಠ༽︻╦╤─"
        const val Thanks = "\\(^-^)/"
        const val Therefore = "⸫"
        const val Thisis = "( ͡° ͜ʖ ͡°)_/¯"
        const val ThreeEighths = "⅜"
        const val TieFighter = "|=-(¤)-=|"
        const val Tired = "(=____=)"
        const val ToldYouSo = "☜(꒡⌓꒡)"
        const val TooGood = "ᕦ(òᴥó)ᕥ"
        const val Trademark = "™"
        const val Triangle = "▲"
        const val TwoThirds = "⅔"
        const val Unflip = "┬──┬ ノ(ò_óノ)"
        const val Up = "↑"
        const val Victory = "(๑•̀ㅂ•́)ง✧"
        const val Wat = "(ÒДÓױ)"
        const val Wave = "( * ^ *) ノシ"
        const val Whaa = "Ö"
        const val Whistle = "(っ^з^)♪♬"
        const val Whoa = "(°o•)"
        const val Why = "ლ(`◉◞౪◟◉‵ლ)"
        val WitchText = { text: String ->
            val table = mapOf(
                "a" to "Λ", "b" to "ß", "c" to "¢", "d" to "Ð", "e" to "Σ",
                "f" to "Ŧ", "g" to "G", "h" to "H", "i" to "|", "j" to "⅃",
                "k" to "Ҡ", "l" to "L", "m" to "M", "n" to "И", "o" to "Ө",
                "p" to "þ", "q" to "Q", "r" to "Я", "s" to "$", "t" to "†",
                "u" to "V", "v" to "V", "w" to "W", "x" to "X", "y" to "Ұ", "z" to "Z"
            )
            transpose(text.toLowerCase(), table)
        }
        const val Woo = "＼(＾O＾)／"
        const val Wtf = "(⊙＿⊙')"
        const val Wut = "⊙ω⊙"
        const val Yay = "\\( ﾟヮﾟ)/"
        const val Yeah = "(•̀ᴗ•́)و ̑̑"
        const val Yen = "¥"
        const val YinYang = "☯"
        const val Yolo = "Yᵒᵘ Oᶰˡʸ Lᶤᵛᵉ Oᶰᶜᵉ"
        const val YouKids = "ლ༼>╭ ͟ʖ╮<༽ლ"
        const val YUNo = "(屮ﾟДﾟ)屮 Y U NO"
        const val Zen = "⊹╰(⌣ʟ⌣)╯⊹"
        const val Zoidberg = "(V) (°,,,,°) (V)"
        const val Zombie = "[¬º-°]¬"
    }

    private fun transpose(text: String, table: Map<String, String>, backwards: Boolean = false): String {
        return text.map {
            val char = it.toString()
            table[char] ?: char
        }.let {
            if (backwards) it.asReversed()
            else it
        }.joinToString("")
    }
}