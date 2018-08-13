package com.vedavyasbhat.memetoaster

import java.util.*

object Memes {

    object Images {
        const val Fuuu = "fuuu"
        const val TrollFace = "trollface"
        const val AwwYeah = "awwyeah"

        private val nameToResourceMap = mapOf(
                Fuuu to R.drawable.fuuu,
                TrollFace to R.drawable.trollface,
                AwwYeah to R.drawable.awwyeah
        )

        private val nameToTextMap = mapOf(
                Fuuu to "Dang it",
                TrollFace to "Lel",
                AwwYeah to ""
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
        const val doublesharp = "𝄪"
        const val doubletableflip = "┻━┻ ︵ヽ(`Д´)ﾉ︵ ┻━┻"
        const val down = "↓"
        const val duckface = "(・3・)"
        const val duel = "ᕕ(╭ರ╭ ͟ʖ╮•́)⊃¤=(————-"
        const val duh = "(≧︿≦)"
        const val dunnolol = "¯\\(°_o)/¯"
        const val ebola = "ᴇʙᴏʟᴀ"
        const val eeriemob = "(-(-_-(-_(-_(-_-)_-)-_-)_-)_-)-)"
        const val ellipsis = "…"
        const val emdash = "–"
        const val emptystar = "☆"
        const val emptytriangle = "△"
        const val endure = "(҂◡_◡) ᕤ"
        const val envelope = "✉︎"
        const val epsilon = "ɛ"
        const val euro = "€"
        const val evil = "ψ(｀∇´)ψ"
        const val evillenny = "(͠≖ ͜ʖ͠≖)"
        const val excited = "(ﾉ◕ヮ◕)ﾉ*:・ﾟ✧"
        const val execution = "(⌐■_■)︻╦╤─   (╥﹏╥)"
        const val facebook = "(╯°□°)╯︵ ʞooqǝɔɐɟ"
        const val facepalm = "(－‸ლ)"
        val fancytext = { text: String ->
            val table = mapOf(
                "a" to "α", "b" to "в", "c" to "¢", "d" to "∂", "e" to "є", "f" to "ƒ",
                "g" to "g", "h" to "н", "i" to "ι", "j" to "נ", "k" to "к", "l" to "ℓ",
                "m" to "м", "n" to "η", "o" to "σ", "p" to "ρ", "q" to "q", "r" to "я",
                "s" to "ѕ", "t" to "т", "u" to "υ", "v" to "ν", "w" to "ω", "x" to "χ",
                "y" to "у", "z" to "z"
            )
            transpose(text.toLowerCase(), table)
        }
        const val fart = "(ˆ⺫ˆ๑)<3"
        const val fight = "(ง •̀_•́)ง"
        const val finn = "| (• ◡•)|"
        const val fish = "<\"(((<3"
        const val five = "卌"
        const val fiveeights = "⅝"
        const val flat = "♭"
        const val flexing = "ᕙ(`▽´)ᕗ"
        val fliptext = { text: String ->
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
        val fliptexttable = { text: String ->
            "(ノ ゜Д゜)ノ ︵  " + fliptext(text)
        }
        const val flipped = "┬─┬﻿ ︵ /(.□. \\）"
        const val flower = "(✿◠‿◠)"
        const val flower2 = "✿"
        const val fly = "─=≡Σ((( つ◕ل͜◕)つ"
        const val friendflip = "(╯°□°)╯︵ ┻━┻ ︵ ╯(°□° ╯)"
        const val frown = "(ღ˘⌣˘ღ)"
        const val fuckoff = "୧༼ಠ益ಠ╭∩╮༽"
        const val fuckyou = "┌П┐(ಠ_ಠ)"
        const val gentleman = "ಠ_ರೃ"
        const val ghast = "= _ ="
        const val ghost = "༼ つ ╹ ╹ ༽つ"
        const val gift = "(´・ω・)っ由"
        const val gimme = "༼ つ ◕_◕ ༽つ"
        const val givemeyourmoney = "(•-•)⌐"
        const val glitterbomb = "(*・‿・)ノ⌒*:･ﾟ✧"
        const val glasses = "(⌐ ͡■ ͜ʖ ͡■)"
        const val glassesoff = "( ͡° ͜ʖ ͡°)ﾉ⌐■-■"
        const val glitterderp = "(ﾉ☉ヮ⚆)ﾉ ⌒*:･ﾟ✧"
        const val gloomy = "(_゜_゜_)"
        const val goatse = "(з๏ε)"
        const val gotit = "(☞ﾟ∀ﾟ)☞"
        const val greet = "( ´◔ ω◔`) ノシ"
        const val gun = "︻╦╤─"
        const val hadouken = "༼つಠ益ಠ༽つ ─=≡ΣO))"
        const val hammerandsickle = "☭"
        const val handleft = "☜"
        const val handright = "☞"
        const val haha = "٩(^‿^)۶"
        const val happy = "٩( ๑╹ ꇴ╹)۶"
        const val happygarry = "ᕕ( ᐛ )ᕗ"
        const val heart = "♥"
        const val hello = "(ʘ‿ʘ)╯"
        const val help = "\\(°Ω°)/"
        const val highfive = "._.)/\\(._."
        const val hitting = "( ｀皿´)｡ﾐ/"
        const val hugs = "(づ｡◕‿‿◕｡)づ"
        const val iknowright = "┐｜･ิω･ิ#｜┌"
        const val illuminati = "୧(▲ᴗ▲)ノ"
        const val infinity = "∞"
        const val inlove = "(っ´ω`c)♡"
        const val integral = "∫"
        const val internet = "ଘ(੭*ˊᵕˋ)੭* ̀ˋ ɪɴᴛᴇʀɴᴇᴛ"
        const val interrobang = "‽"
        const val jake = "(❍ᴥ❍ʋ)"
        const val kappa = "(¬,‿,¬)"
        const val kawaii = "≧◡≦"
        const val keen = "┬┴┬┴┤Ɵ͆ل͜Ɵ͆ ༽ﾉ"
        const val kiahh = "~\\(≧▽≦)/~"
        const val kiss = "(づ ￣ ³￣)づ"
        const val kyubey = "／人◕ ‿‿ ◕人＼"
        const val lambda = "λ"
        const val lazy = "_(:3」∠)_"
        const val left = "←"
        const val lenny = "( ͡° ͜ʖ ͡°)"
        const val lennybill = "[̲̅$̲̅(̲̅ ͡° ͜ʖ ͡°̲̅)̲̅$̲̅]"
        const val lennyfight = "(ง ͠° ͟ʖ ͡°)ง"
        const val lennyflip = "(ノ ͡° ͜ʖ ͡°ノ)   ︵ ( ͜。 ͡ʖ ͜。)"
        const val lennygang = "( ͡°( ͡° ͜ʖ( ͡° ͜ʖ ͡°)ʖ ͡°) ͡°)"
        const val lennyshrug = "¯\\_( ͡° ͜ʖ ͡°)_/¯"
        const val lennysir = "( ಠ ͜ʖ ರೃ)"
        const val lennystalker = "┬┴┬┴┤( ͡° ͜ʖ├┬┴┬┴"
        const val lennystrong = "ᕦ( ͡° ͜ʖ ͡°)ᕤ"
        const val lennywizard = "╰( ͡° ͜ʖ ͡° )つ──☆*:・ﾟ"
        val loading = { percent: Double ->
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
        const val lol = "L(° O °L)"
        const val look = "(ಡ_ಡ)☞"
        const val loud = "ᕦ(⩾﹏⩽)ᕥ"
        const val love = "♥‿♥"
        const val lovebear = "ʕ♥ᴥ♥ʔ"
        const val lumpy = "꒰ ꒡⌓꒡꒱"
        const val luv = "-`ღ´-"
        const val magic = "ヽ(｀Д´)⊃━☆ﾟ. * ･ ｡ﾟ,"
        const val magicflip = "(/¯◡ ‿ ◡)/¯ ~ ┻━┻"
        const val meep = "\\(°^°)/"
        const val meh = "ಠ_ಠ"
        const val metal = "\\m/,(> . <)_\\m/"
        const val mistyeyes = "ಡ_ಡ"
        const val monster = "༼ ༎ຶ ෴ ༎ຶ༽"
        const val natural = "♮"
        const val needle = "┌(◉ ͜ʖ◉)つ┣▇▇▇═──"
        const val nerd = "(⌐⊙_⊙)"
        const val nice = "( ͡° ͜ °)"
        const val no = "→_←"
        const val noclue = "／人◕ __ ◕人＼"
        const val nom = "(っˆڡˆς)"
        const val note = "♫"
        const val nuclear = "☢"
        const val nyan = "~=[,,_,,]:3"
        const val nyeh = "@^@"
        const val ohshit = "( º﹃º )"
        const val omega = "Ω"
        const val omg = "◕_◕"
        const val oneeighth = "⅛"
        const val onefourth = "¼"
        const val onehalf = "½"
        const val onethird = "⅓"
        const val option = "⌥"
        const val ohreally = "(눈_눈)"
        const val ohyou = "(◞థ౪థ)ᴖ"
        const val peace = "✌(-‿-)✌"
        const val pear = "(__>-"
        const val pi = "π"
        const val pingpong = "( •_•)O*¯`·.¸.·´¯`°Q(•_• )"
        const val plain = "._."
        const val pleased = "(˶‾᷄ ⁻̫ ‾᷅˵)"
        const val point = "(☞ﾟヮﾟ)☞"
        const val pooh = "ʕ •́؈•̀)"
        const val porcupine = "(•ᴥ• )́`́'́`́'́⻍"
        const val pound = "£"
        const val praise = "(☝ ՞ਊ ՞)☝"
        const val punch = "O=('-'Q)"
        const val rage = "t(ಠ益ಠt)"
        const val rageflip = "(ノಠ益ಠ)ノ彡┻━┻"
        const val rainbowcat = "(=^･ｪ･^=))ﾉ彡☆"
        const val really = "ò_ô"
        const val registered = "®"
        const val right = "→"
        const val riot = "୧༼ಠ益ಠ༽୨"
        val rolldice = { amount: Int ->
            (1..amount).joinToString(separator = " ") {
                val randomDiceInt = (0..5).let {
                    Random().nextInt((it.endInclusive + 1) - it.start) +  it.start
                }
                listOf("⚀", "⚁", "⚂", "⚃", "⚄", "⚅")[randomDiceInt]
            }
        }
        const val rolleyes = "(◔_◔)"
        const val rose = "✿ڿڰۣ—"
        const val run = "(╯°□°)╯"
        const val sad = "ε(´סּ︵סּ`)з"
        const val saddonger = "ヽ༼ຈʖ̯ຈ༽ﾉ"
        const val sadlenny = "( ͡° ʖ̯ ͡°)"
        const val seveneigths = "⅞"
        const val sharp = "♯"
        const val shout = "╚(•⌂•)╝"
        const val shrug = "¯\\_(ツ)_/¯"
        const val shy = "=^_^="
        const val sigma = "Σ"
        const val skull = "☠"
        const val smile = "ツ"
        const val smiley = "☺︎"
        const val smirk = "¬‿¬"
        const val snowman = "☃"
        const val sob = "(;´༎ຶД༎ຶ`)"
        const val soviettableflip = "ノ┬─┬ノ ︵ ( \\o°o)\\"
        const val spade = "♠"
        const val squareroot = "√"
        const val squid = "<コ:彡"
        const val star = "★"
        const val strong = "ᕙ(⇀‸↼‶)ᕗ"
        const val suicide = "ε/̵͇̿̿/’̿’̿ ̿(◡︵◡)"
        const val sum = "∑"
        const val sun = "☀"
        const val surprised = "(๑•́ ヮ •̀๑)"
        const val surrender = "\\_(-_-)_/"
        const val stalker = "┬┴┬┴┤(･_├┬┴┬┴"
        const val swag = "(̿▀̿‿ ̿▀̿ ̿)"
        const val sword = "o()xxxx[{::::::::::::::::::>"
        const val tabledown = "┬─┬﻿ ノ( ゜-゜ノ)"
        const val tableflip = "(ノ ゜Д゜)ノ ︵ ┻━┻"
        const val tau = "τ"
        const val tears = "(ಥ﹏ಥ)"
        const val terrorist = "୧༼ಠ益ಠ༽︻╦╤─"
        const val thanks = "\\(^-^)/"
        const val therefore = "⸫"
        const val thisis = "( ͡° ͜ʖ ͡°)_/¯"
        const val threeeights = "⅜"
        const val tiefighter = "|=-(¤)-=|"
        const val tired = "(=____=)"
        const val toldyouso = "☜(꒡⌓꒡)"
        const val toogood = "ᕦ(òᴥó)ᕥ"
        const val trademark = "™"
        const val triangle = "▲"
        const val twothirds = "⅔"
        const val unflip = "┬──┬ ノ(ò_óノ)"
        const val up = "↑"
        const val victory = "(๑•̀ㅂ•́)ง✧"
        const val wat = "(ÒДÓױ)"
        const val wave = "( * ^ *) ノシ"
        const val whaa = "Ö"
        const val whistle = "(っ^з^)♪♬"
        const val whoa = "(°o•)"
        const val why = "ლ(`◉◞౪◟◉‵ლ)"
        val witchtext = { text: String ->
            val table = mapOf(
                "a" to "Λ", "b" to "ß", "c" to "¢", "d" to "Ð", "e" to "Σ",
                "f" to "Ŧ", "g" to "G", "h" to "H", "i" to "|", "j" to "⅃",
                "k" to "Ҡ", "l" to "L", "m" to "M", "n" to "И", "o" to "Ө",
                "p" to "þ", "q" to "Q", "r" to "Я", "s" to "$", "t" to "†",
                "u" to "V", "v" to "V", "w" to "W", "x" to "X", "y" to "Ұ", "z" to "Z"
            )
            transpose(text.toLowerCase(), table)
        }
        const val woo = "＼(＾O＾)／"
        const val wtf = "(⊙＿⊙')"
        const val wut = "⊙ω⊙"
        const val yay = "\\( ﾟヮﾟ)/"
        const val yeah = "(•̀ᴗ•́)و ̑̑"
        const val yen = "¥"
        const val yinyang = "☯"
        const val yolo = "Yᵒᵘ Oᶰˡʸ Lᶤᵛᵉ Oᶰᶜᵉ"
        const val youkids = "ლ༼>╭ ͟ʖ╮<༽ლ"
        const val yuno = "(屮ﾟДﾟ)屮 Y U NO"
        const val zen = "⊹╰(⌣ʟ⌣)╯⊹"
        const val zoidberg = "(V) (°,,,,°) (V)"
        const val zombie = "[¬º-°]¬"
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