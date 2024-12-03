package io.hvk.meradostapp.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

data class Lecture(
    val id: String,
    val title: String,
    val description: String,
    val icon: ImageVector,
    val content: List<LectureContent>
)

data class LectureContent(
    val hindi: String,
    val english: String,
    val pronunciation: String,
    val example: String? = null
)

val lectureCategories = listOf(
    Lecture(
        id = "letters",
        title = "Hindi Letters",
        description = "Learn Hindi alphabet and basic characters",
        icon = Icons.Default.Abc,
        content = listOf(
            LectureContent(
                hindi = "अ",
                english = "a",
                pronunciation = "a as in around",
                example = "अमर (amar) - immortal"
            ),
            LectureContent(
                hindi = "आ",
                english = "aa",
                pronunciation = "aa as in father",
                example = "आम (aam) - mango"
            ),
            LectureContent(
                hindi = "इ",
                english = "i",
                pronunciation = "i as in it",
                example = "इधर (idhar) - here"
            ),
            LectureContent(
                hindi = "ई",
                english = "ee",
                pronunciation = "ee as in feet",
                example = "ईद (eed) - Eid"
            ),
            LectureContent(
                hindi = "उ",
                english = "u",
                pronunciation = "u as in put",
                example = "उधर (udhar) - there"
            ),
            LectureContent(
                hindi = "ऊ",
                english = "oo",
                pronunciation = "oo as in boot",
                example = "ऊन (oon) - wool"
            ),
            LectureContent(
                hindi = "ए",
                english = "ri",
                pronunciation = "ri as in rich",
                example = "ऋषि (rishi) - sage"
            ),
            LectureContent(
                hindi = "ए",
                english = "e",
                pronunciation = "e as in way",
                example = "एक (ek) - one"
            ),
            LectureContent(
                hindi = "ऐ",
                english = "ai",
                pronunciation = "ai as in eye",
                example = "ऐनक (ainak) - spectacles"
            ),
            LectureContent(
                hindi = "ओ",
                english = "o",
                pronunciation = "o as in go",
                example = "ओर (or) - direction"
            ),
            LectureContent(
                hindi = "औ",
                english = "au",
                pronunciation = "au as in now",
                example = "औरत (aurat) - woman"
            ),
            LectureContent(
                hindi = "अं",
                english = "am",
                pronunciation = "am as in sum",
                example = "अंक (ank) - number"
            ),
            LectureContent(
                hindi = "अः",
                english = "ah",
                pronunciation = "ah with aspiration",
                example = "अंतः (antah) - inner"
            ),
            LectureContent(
                hindi = "क",
                english = "ka",
                pronunciation = "ka as in car",
                example = "कमल (kamal) - lotus"
            ),
            LectureContent(
                hindi = "ख",
                english = "kha",
                pronunciation = "kha as in khan",
                example = "खाना (khana) - food"
            ),
            LectureContent(
                hindi = "ग",
                english = "ga",
                pronunciation = "ga as in gun",
                example = "गाना (gana) - song"
            ),
            LectureContent(
                hindi = "घ",
                english = "gha",
                pronunciation = "gha as in ghost",
                example = "घर (ghar) - house"
            ),
            LectureContent(
                hindi = "ङ",
                english = "nga",
                pronunciation = "nga as in sing",
                example = "रंग (rang) - color"
            ),
            LectureContent(
                hindi = "च",
                english = "cha",
                pronunciation = "cha as in chair",
                example = "चाय (chai) - tea"
            ),
            LectureContent(
                hindi = "छ",
                english = "chha",
                pronunciation = "chha as in church",
                example = "छाता (chhata) - umbrella"
            ),
            LectureContent(
                hindi = "ज",
                english = "ja",
                pronunciation = "ja as in joy",
                example = "जल (jal) - water"
            ),
            LectureContent(
                hindi = "झ",
                english = "jha",
                pronunciation = "jha as in hedge",
                example = "झंडा (jhanda) - flag"
            ),
            LectureContent(
                hindi = "ञ",
                english = "nya",
                pronunciation = "nya as in canyon",
                example = "ज्ञान (gyan) - knowledge"
            ),
            LectureContent(
                hindi = "ट",
                english = "ta",
                pronunciation = "ta as in top",
                example = "टमाटर (tamatar) - tomato"
            ),
            LectureContent(
                hindi = "ठ",
                english = "tha",
                pronunciation = "tha as in thumb",
                example = "ठंडा (thanda) - cold"
            ),
            LectureContent(
                hindi = "ड",
                english = "da",
                pronunciation = "da as in dog",
                example = "डर (dar) - fear"
            ),
            LectureContent(
                hindi = "ढ",
                english = "dha",
                pronunciation = "dha as in dharma",
                example = "ढोल (dhol) - drum"
            ),
            LectureContent(
                hindi = "ण",
                english = "na",
                pronunciation = "na as in under",
                example = "गणेश (ganesh) - Ganesh"
            ),
            LectureContent(
                hindi = "त",
                english = "ta",
                pronunciation = "ta as in table",
                example = "तारा (tara) - star"
            ),
            LectureContent(
                hindi = "थ",
                english = "tha",
                pronunciation = "tha as in thumb",
                example = "थाली (thali) - plate"
            ),
            LectureContent(
                hindi = "द",
                english = "da",
                pronunciation = "da as in day",
                example = "दिन (din) - day"
            ),
            LectureContent(
                hindi = "ध",
                english = "dha",
                pronunciation = "dha as in dharma",
                example = "धन (dhan) - wealth"
            ),
            LectureContent(
                hindi = "न",
                english = "na",
                pronunciation = "na as in name",
                example = "नाम (naam) - name"
            ),
            LectureContent(
                hindi = "प",
                english = "pa",
                pronunciation = "pa as in pen",
                example = "पानी (pani) - water"
            ),
            LectureContent(
                hindi = "फ",
                english = "pha",
                pronunciation = "pha as in phone",
                example = "फल (phal) - fruit"
            ),
            LectureContent(
                hindi = "ब",
                english = "ba",
                pronunciation = "ba as in ball",
                example = "बस (bas) - bus"
            ),
            LectureContent(
                hindi = "भ",
                english = "bha",
                pronunciation = "bha as in bharat",
                example = "भारत (bharat) - India"
            ),
            LectureContent(
                hindi = "म",
                english = "ma",
                pronunciation = "ma as in mother",
                example = "माता (mata) - mother"
            ),
            LectureContent(
                hindi = "य",
                english = "ya",
                pronunciation = "ya as in yard",
                example = "याद (yaad) - memory"
            ),
            LectureContent(
                hindi = "र",
                english = "ra",
                pronunciation = "ra as in run",
                example = "राम (ram) - Ram"
            ),
            LectureContent(
                hindi = "ल",
                english = "la",
                pronunciation = "la as in lamp",
                example = "लाल (lal) - red"
            ),
            LectureContent(
                hindi = "व",
                english = "va/wa",
                pronunciation = "va as in water",
                example = "वन (van) - forest"
            ),
            LectureContent(
                hindi = "श",
                english = "sha",
                pronunciation = "sha as in sharp",
                example = "शांति (shanti) - peace"
            ),
            LectureContent(
                hindi = "ष",
                english = "sha",
                pronunciation = "sha as in sharp",
                example = "कृष्ण (krishna) - Krishna"
            ),
            LectureContent(
                hindi = "स",
                english = "sa",
                pronunciation = "sa as in sun",
                example = "सूरज (suraj) - sun"
            ),
            LectureContent(
                hindi = "ह",
                english = "ha",
                pronunciation = "ha as in house",
                example = "हवा (hava) - air"
            )
        )
    ),
    Lecture(
        id = "numbers",
        title = "Hindi Numbers",
        description = "Learn counting in Hindi",
        icon = Icons.Default.Numbers,
        content = listOf(
            LectureContent(
                hindi = "१ - एक",
                english = "1 - One",
                pronunciation = "ek",
                example = "एक किताब (ek kitaab) - one book"
            ),
            LectureContent(
                hindi = "२ - दो",
                english = "2 - Two",
                pronunciation = "do",
                example = "दो लोग (do log) - two people"
            ),
            LectureContent(
                hindi = "३ - तीन",
                english = "3 - Three",
                pronunciation = "teen",
                example = "तीन दिन (teen din) - three days"
            ),
            LectureContent(
                hindi = "४ - चार",
                english = "4 - Four",
                pronunciation = "chaar",
                example = "चार बजे (chaar baje) - four o'clock"
            ),
            LectureContent(
                hindi = "५ - पाँच",
                english = "5 - Five",
                pronunciation = "paanch",
                example = "पाँच मिनट (paanch minute) - five minutes"
            ),
            LectureContent(
                hindi = "६ - छह",
                english = "6 - Six",
                pronunciation = "chhah",
                example = "छह महीने (chhah mahine) - six months"
            ),
            LectureContent(
                hindi = "७ - सात",
                english = "7 - Seven",
                pronunciation = "saat",
                example = "सात दिन (saat din) - seven days"
            ),
            LectureContent(
                hindi = "८ - आठ",
                english = "8 - Eight",
                pronunciation = "aath",
                example = "आठ घंटे (aath ghante) - eight hours"
            ),
            LectureContent(
                hindi = "९ - नौ",
                english = "9 - Nine",
                pronunciation = "nau",
                example = "नौ बजे (nau baje) - nine o'clock"
            ),
            LectureContent(
                hindi = "१० - दस",
                english = "10 - Ten",
                pronunciation = "das",
                example = "दस रुपये (das rupaye) - ten rupees"
            ),
            LectureContent(
                hindi = "११ - ग्यारह",
                english = "11 - Eleven",
                pronunciation = "gyaarah",
                example = "ग्यारह साल (gyaarah saal) - eleven years"
            ),
            LectureContent(
                hindi = "१२ - बारह",
                english = "12 - Twelve",
                pronunciation = "baarah",
                example = "बारह महीने (baarah mahine) - twelve months"
            ),
            LectureContent(
                hindi = "१३ - तेरह",
                english = "13 - Thirteen",
                pronunciation = "terah",
                example = "तेरह तारीख (terah tareekh) - thirteenth date"
            ),
            LectureContent(
                hindi = "१४ - चौदह",
                english = "14 - Fourteen",
                pronunciation = "chaudah",
                example = "चौदह साल (chaudah saal) - fourteen years"
            ),
            LectureContent(
                hindi = "१५ - पंद्रह",
                english = "15 - Fifteen",
                pronunciation = "pandrah",
                example = "पंद्रह मिनट (pandrah minat) - fifteen minutes"
            ),
            LectureContent(
                hindi = "१६ - सोलह",
                english = "16 - Sixteen",
                pronunciation = "solah",
                example = "सोलह साल (solah saal) - sixteen years"
            ),
            LectureContent(
                hindi = "१७ - सत्रह",
                english = "17 - Seventeen",
                pronunciation = "satrah",
                example = "सत्रह लोग (satrah log) - seventeen people"
            ),
            LectureContent(
                hindi = "१८ - अठारह",
                english = "18 - Eighteen",
                pronunciation = "athaarah",
                example = "अठारह साल (athaarah saal) - eighteen years"
            ),
            LectureContent(
                hindi = "१९ - उन्नीस",
                english = "19 - Nineteen",
                pronunciation = "unnees",
                example = "उन्नीस दिन (unnees din) - nineteen days"
            ),
            LectureContent(
                hindi = "२० - बीस",
                english = "20 - Twenty",
                pronunciation = "bees",
                example = "बीस रुपये (bees rupaye) - twenty rupees"
            ),
            LectureContent(
                hindi = "३० - तीस",
                english = "30 - Thirty",
                pronunciation = "tees",
                example = "तीस मिनट (tees minat) - thirty minutes"
            ),
            LectureContent(
                hindi = "४० - चालीस",
                english = "40 - Forty",
                pronunciation = "chaalees",
                example = "चालीस किलो (chaalees kilo) - forty kilos"
            ),
            LectureContent(
                hindi = "५० - पचास",
                english = "50 - Fifty",
                pronunciation = "pachaas",
                example = "पचास प्रतिशत (pachaas pratishat) - fifty percent"
            ),
            LectureContent(
                hindi = "६० - साठ",
                english = "60 - Sixty",
                pronunciation = "saath",
                example = "साठ सेकंड (saath second) - sixty seconds"
            ),
            LectureContent(
                hindi = "७० - सत्तर",
                english = "70 - Seventy",
                pronunciation = "sattar",
                example = "सत्तर साल (sattar saal) - seventy years"
            ),
            LectureContent(
                hindi = "८० - अस्सी",
                english = "80 - Eighty",
                pronunciation = "assi",
                example = "अस्सी किलोमीटर (assi kilometer) - eighty kilometers"
            ),
            LectureContent(
                hindi = "९० - नब्बे",
                english = "90 - Ninety",
                pronunciation = "nabbe",
                example = "नब्बे प्रतिशत (nabbe pratishat) - ninety percent"
            ),
            LectureContent(
                hindi = "१०० - सौ",
                english = "100 - Hundred",
                pronunciation = "sau",
                example = "सौ रुपये (sau rupaye) - hundred rupees"
            ),
            LectureContent(
                hindi = "हज़ार",
                english = "Thousand",
                pronunciation = "hazaar",
                example = "एक हज़ार रुपये (ek hazaar rupaye) - one thousand rupees"
            ),
            LectureContent(
                hindi = "लाख",
                english = "Hundred Thousand",
                pronunciation = "laakh",
                example = "एक लाख रुपये (ek laakh rupaye) - one hundred thousand rupees"
            ),
            LectureContent(
                hindi = "करोड़",
                english = "Ten Million",
                pronunciation = "karod",
                example = "एक करोड़ रुपये (ek karod rupaye) - ten million rupees"
            )
        )
    ),
    Lecture(
        id = "colors",
        title = "Colors",
        description = "Learn colors in Hindi",
        icon = Icons.Default.Palette,
        content = listOf(
            LectureContent(
                hindi = "लाल",
                english = "Red",
                pronunciation = "laal",
                example = "लाल गुलाब (laal gulaab) - red rose"
            ),
            LectureContent(
                hindi = "नीला",
                english = "Blue",
                pronunciation = "neela",
                example = "नीला आसमान (neela aasmaan) - blue sky"
            ),
            LectureContent(
                hindi = "पीला",
                english = "Yellow",
                pronunciation = "peela",
                example = "पीला फूल (peela phool) - yellow flower"
            ),
            LectureContent(
                hindi = "हरा",
                english = "Green",
                pronunciation = "hara",
                example = "हरी घास (hari ghaas) - green grass"
            ),
            LectureContent(
                hindi = "काला",
                english = "Black",
                pronunciation = "kaala",
                example = "काला बादल (kaala baadal) - black cloud"
            ),
            LectureContent(
                hindi = "सफ़ेद",
                english = "White",
                pronunciation = "safed",
                example = "सफ़ेद कप़ा (safed kapda) - white cloth"
            ),
            LectureContent(
                hindi = "नारंगी",
                english = "Orange",
                pronunciation = "naarangi",
                example = "नारंगी संतरा (naarangi santra) - orange fruit"
            ),
            LectureContent(
                hindi = "गुलाबी",
                english = "Pink",
                pronunciation = "gulaabi",
                example = "गुलाबी फूल (gulaabi phool) - pink flower"
            ),
            LectureContent(
                hindi = "बैंगनी",
                english = "Purple",
                pronunciation = "baingani",
                example = "बैंगनी रंग (baingani rang) - purple color"
            ),
            LectureContent(
                hindi = "भूरा",
                english = "Brown",
                pronunciation = "bhoora",
                example = "भूरी मिट्टी (bhoori mitti) - brown soil"
            ),
            LectureContent(
                hindi = "धूसर",
                english = "Grey",
                pronunciation = "dhoosar",
                example = "धूसर बादल (dhoosar baadal) - grey clouds"
            ),
            LectureContent(
                hindi = "सुनहरा",
                english = "Golden",
                pronunciation = "sunehra",
                example = "सुनहरा गहना (sunehra gehna) - golden jewelry"
            ),
            LectureContent(
                hindi = "चांदी",
                english = "Silver",
                pronunciation = "chaandi",
                example = "चांदी का सिक्का (chaandi ka sikka) - silver coin"
            ),
            LectureContent(
                hindi = "गहरा नीला",
                english = "Dark Blue",
                pronunciation = "gehra neela",
                example = "गहरा नीला समुदर (gehra neela samundar) - deep blue ocean"
            ),
            LectureContent(
                hindi = "हल्का नीला",
                english = "Light Blue",
                pronunciation = "halka neela",
                example = "हल्का नीला आसमान (halka neela aasmaan) - light blue sky"
            )
        )
    ),
    Lecture(
        id = "family",
        title = "Family Members",
        description = "Learn family relations in Hindi",
        icon = Icons.Default.People,
        content = listOf(
            LectureContent(
                hindi = "माता",
                english = "Mother",
                pronunciation = "maata",
                example = "मेरी माता (meri maata) - my mother"
            ),
            LectureContent(
                hindi = "पिता",
                english = "Father",
                pronunciation = "pita",
                example = "मेरे पिता (mere pita) - my father"
            ),
            LectureContent(
                hindi = "भड़ा भाई",
                english = "Elder Brother",
                pronunciation = "bada bhai",
                example = "मेरा बड़ा भाई (mera bada bhai) - my elder brother"
            ),
            LectureContent(
                hindi = "छोटा भाई",
                english = "Younger Brother",
                pronunciation = "chota bhai",
                example = "मेरा छोटा भाई (mera chota bhai) - my younger brother"
            ),
            LectureContent(
                hindi = "बड़ी बहन",
                english = "Elder Sister",
                pronunciation = "badi behen",
                example = "मेरी बड़ी बहन (meri badi behen) - my elder sister"
            ),
            LectureContent(
                hindi = "छोटी बहन",
                english = "Younger Sister",
                pronunciation = "choti behen",
                example = "मेरी छोटी बहन (meri choti behen) - my younger sister"
            ),
            LectureContent(
                hindi = "दादा",
                english = "Paternal Grandfather",
                pronunciation = "daada",
                example = "मेरे दादा (mere daada) - my paternal grandfather"
            ),
            LectureContent(
                hindi = "दादी",
                english = "Paternal Grandmother",
                pronunciation = "daadi",
                example = "मेरी दादी (meri daadi) - my paternal grandmother"
            ),
            LectureContent(
                hindi = "नाना",
                english = "Maternal Grandfather",
                pronunciation = "naana",
                example = "मेरे नाना (mere naana) - my maternal grandfather"
            ),
            LectureContent(
                hindi = "नानी",
                english = "Maternal Grandmother",
                pronunciation = "naani",
                example = "मेरी नानी (meri naani) - my maternal grandmother"
            ),
            LectureContent(
                hindi = "चाचा",
                english = "Paternal Uncle",
                pronunciation = "chaacha",
                example = "मेरे चाचा (mere chaacha) - my paternal uncle"
            ),
            LectureContent(
                hindi = "चाची",
                english = "Paternal Aunt (Uncle's Wife)",
                pronunciation = "chaachi",
                example = "मेरी चाची (meri chaachi) - my paternal aunt"
            ),
            LectureContent(
                hindi = "ताऊ",
                english = "Elder Paternal Uncle",
                pronunciation = "tau",
                example = "मेरे ताऊ (mere tau) - my elder paternal uncle"
            ),
            LectureContent(
                hindi = "ताई",
                english = "Elder Paternal Aunt",
                pronunciation = "tai",
                example = "मेरी ताई (meri tai) - my elder paternal aunt"
            ),
            LectureContent(
                hindi = "माा",
                english = "Maternal Uncle",
                pronunciation = "maama",
                example = "मेरे मामा (mere maama) - my maternal uncle"
            ),
            LectureContent(
                hindi = "मामी",
                english = "Maternal Aunt (Uncle's Wife)",
                pronunciation = "maami",
                example = "मेरी मामी (meri maami) - my maternal aunt"
            ),
            LectureContent(
                hindi = "मौसी",
                english = "Maternal Aunt",
                pronunciation = "mausi",
                example = "मेरी मौसी (meri mausi) - my maternal aunt"
            ),
            LectureContent(
                hindi = "मौसा",
                english = "Maternal Aunt's Husband",
                pronunciation = "mausa",
                example = "मेरे मौसा (mere mausa) - my maternal aunt's husband"
            ),
            LectureContent(
                hindi = "बेटा",
                english = "Son",
                pronunciation = "beta",
                example = "मेरा बेटा (mera beta) - my son"
            ),
            LectureContent(
                hindi = "बेटी",
                english = "Daughter",
                pronunciation = "beti",
                example = "मेरी बेटी (meri beti) - my daughter"
            ),
            LectureContent(
                hindi = "चचेरा भाई",
                english = "Paternal Cousin Brother",
                pronunciation = "chachera bhai",
                example = "मेरा चचेरा भाई (mera chachera bhai) - my paternal cousin brother"
            ),
            LectureContent(
                hindi = "चचेरी बहन",
                english = "Paternal Cousin Sister",
                pronunciation = "chacheri behen",
                example = "मेरी चचेरी बहन (meri chacheri behen) - my paternal cousin sister"
            ),
            LectureContent(
                hindi = "ममेरा भाई",
                english = "Maternal Cousin Brother",
                pronunciation = "mamera bhai",
                example = "मेरा ममेरा भाई (mera mamera bhai) - my maternal cousin brother"
            ),
            LectureContent(
                hindi = "ममेरी बहन",
                english = "Maternal Cousin Sister",
                pronunciation = "mameri behen",
                example = "मेरी ममेरी बहन (meri mameri behen) - my maternal cousin sister"
            )
        )
    ),
    Lecture(
        id = "directions",
        title = "Directions",
        description = "Learn directional words in Hindi",
        icon = Icons.Default.Navigation,
        content = listOf(
            LectureContent(
                hindi = "उत्तर",
                english = "North",
                pronunciation = "uttar",
                example = "उत्तर दिशा (uttar disha) - north direction"
            ),
            LectureContent(
                hindi = "दक्षिण",
                english = "South",
                pronunciation = "dakshin",
                example = "दक्षिण भारत (dakshin bharat) - south India"
            ),
            LectureContent(
                hindi = "पूर्व",
                english = "East",
                pronunciation = "poorv",
                example = "सूर्य पूर्व से उगता है (soorya poorv se ugta hai) - sun rises in the east"
            ),
            LectureContent(
                hindi = "पश्चिम",
                english = "West",
                pronunciation = "paschim",
                example = "पश्चिम दिशा (paschim disha) - western direction"
            ),
            LectureContent(
                hindi = "ऊपर",
                english = "Up",
                pronunciation = "oopar",
                example = "ऊपर जाओ (oopar jao) - go up"
            )
        )
    ),
    Lecture(
        id = "animals",
        title = "Animals",
        description = "Learn animal names in Hindi",
        icon = Icons.Default.Pets,
        content = listOf(
            LectureContent(
                hindi = "कुत्ता",
                english = "Dog",
                pronunciation = "kutta",
                example = "मेरा कुत्ता (mera kutta) - my dog"
            ),
            LectureContent(
                hindi = "बिल्ली",
                english = "Cat",
                pronunciation = "billi",
                example = "काली बिल्ली (kaali billi) - black cat"
            ),
            LectureContent(
                hindi = "हाय",
                english = "Cow",
                pronunciation = "gaay",
                example = "दूध देने वाली गाय (doodh dene wali gaay) - milk-giving cow"
            ),
            LectureContent(
                hindi = "बकरी",
                english = "Goat",
                pronunciation = "bakri",
                example = "छोटी बकरी (chhoti bakri) - small goat"
            ),
            LectureContent(
                hindi = "घोड़ा",
                english = "Horse",
                pronunciation = "ghoda",
                example = "तेज़ घोड़ा (tez ghoda) - fast horse"
            ),
            LectureContent(
                hindi = "भेड़",
                english = "Sheep",
                pronunciation = "bhed",
                example = "सफेद भेड़ (safed bhed) - white sheep"
            ),
            LectureContent(
                hindi = "मुर्गी",
                english = "Hen",
                pronunciation = "murgi",
                example = "अंडे देने वाली मुर्गी (ande dene wali murgi) - egg-laying hen"
            ),
            LectureContent(
                hindi = "शेर",
                english = "Lion",
                pronunciation = "sher",
                example = "जंगल का राजा शेर (jangal ka raja sher) - lion, king of jungle"
            ),
            LectureContent(
                hindi = "बाघ",
                english = "Tiger",
                pronunciation = "baagh",
                example = "बंगाल का बाघ (bengal ka baagh) - Bengal tiger"
            ),
            LectureContent(
                hindi = "हाथी",
                english = "Elephant",
                pronunciation = "haathi",
                example = "बड़ा हाथी (bada haathi) - big elephant"
            ),
            LectureContent(
                hindi = "भालू",
                english = "Bear",
                pronunciation = "bhaalu",
                example = "भूरा भालू (bhoora bhaalu) - brown bear"
            ),
            LectureContent(
                hindi = "बंदर",
                english = "Monkey",
                pronunciation = "bandar",
                example = "छोटा बंदर (chota bandar) - small monkey"
            ),
            LectureContent(
                hindi = "जेब्रा",
                english = "Zebra",
                pronunciation = "zebra",
                example = "धारीदार जेब्रा (dharidaar zebra) - striped zebra"
            ),
            LectureContent(
                hindi = "जिराफ",
                english = "Giraffe",
                pronunciation = "giraaf",
                example = "लंबी गर्दन वाला जिराफ (lambi gardan wala giraaf) - long-necked giraffe"
            ),
            LectureContent(
                hindi = "तोता",
                english = "Parrot",
                pronunciation = "tota",
                example = "हरा तोता (hara tota) - green parrot"
            ),
            LectureContent(
                hindi = "कबूतर",
                english = "Pigeon",
                pronunciation = "kabutar",
                example = "सफेद कबूतर (safed kabutar) - white pigeon"
            ),
            LectureContent(
                hindi = "कौआ",
                english = "Crow",
                pronunciation = "kauaa",
                example = "काला कौआ (kaala kauaa) - black crow"
            ),
            LectureContent(
                hindi = "मोर",
                english = "Peacock",
                pronunciation = "mor",
                example = "नृत्य करता मोर (nritya karta mor) - dancing peacock"
            ),
            LectureContent(
                hindi = "तितली",
                english = "Butterfly",
                pronunciation = "titli",
                example = "रंगीन तितली (rangeen titli) - colorful butterfly"
            ),
            LectureContent(
                hindi = "मधुमक्खी",
                english = "Bee",
                pronunciation = "madhumakhi",
                example = "शहद की मधुमक्खी (shahad ki madhumakhi) - honey bee"
            ),
            LectureContent(
                hindi = "चींटी",
                english = "Ant",
                pronunciation = "cheenti",
                example = "छोटी चींटी (chhoti cheenti) - small ant"
            ),
            LectureContent(
                hindi = "मछली",
                english = "Fish",
                pronunciation = "machhli",
                example = "तालाब की मछली (talaab ki machhli) - pond fish"
            ),
            LectureContent(
                hindi = "केकड़ा",
                english = "Crab",
                pronunciation = "kekda",
                example = "लाल केकड़ा (laal kekda) - red crab"
            ),
            LectureContent(
                hindi = "व्हेल",
                english = "Whale",
                pronunciation = "whale",
                example = "नीली व्हेल (neeli whale) - blue whale"
            )
        )
    ),
    Lecture(
        id = "foods",
        title = "Foods",
        description = "Learn food items in Hindi",
        icon = Icons.Default.Restaurant,
        content = listOf(
            LectureContent(
                hindi = "चावल",
                english = "Rice",
                pronunciation = "chawal",
                example = "गरम चवल (garam chawal) - hot rice"
            ),
            LectureContent(
                hindi = "रोटी",
                english = "Bread",
                pronunciation = "roti",
                example = "गरम रोटी (garam roti) - hot bread"
            ),
            LectureContent(
                hindi = "दाल",
                english = "Lentils",
                pronunciation = "daal",
                example = "दाल चावल (daal chawal) - lentils and rice"
            ),
            LectureContent(
                hindi = "सब्जी",
                english = "Vegetables",
                pronunciation = "sabzi",
                example = "ताजी सब्जी (taazi sabzi) - fresh vegetables"
            ),
            LectureContent(
                hindi = "दही",
                english = "Yogurt",
                pronunciation = "dahi",
                example = "ठंडा दही (thanda dahi) - cold yogurt"
            )
        )
    ),
    Lecture(
        id = "greetings",
        title = "Greetings",
        description = "Common Hindi greetings and phrases",
        icon = Icons.Default.WavingHand,
        content = listOf(
            LectureContent(
                hindi = "नमस्ते",
                english = "Hello/Greetings",
                pronunciation = "namaste",
                example = "नमस्ते, कैसे हैं आप? (namaste, kaise hain aap?) - Hello, how are you?"
            ),
            LectureContent(
                hindi = "शुभ प्रभात",
                english = "Good Morning",
                pronunciation = "shubh prabhat",
                example = "शुभ प्रभात, सर (shubh prabhat, sir) - Good morning, sir"
            ),
            LectureContent(
                hindi = "शुभ रात्रि",
                english = "Good Night",
                pronunciation = "shubh ratri",
                example = "शुभ रात्रि, मां (shubh ratri, maa) - Good night, mother"
            ),
            LectureContent(
                hindi = "धन्यवाद",
                english = "Thank You",
                pronunciation = "dhanyavaad",
                example = "आपका धन्यवाद (aapka dhanyavaad) - Thank you"
            ),
            LectureContent(
                hindi = "फिर मिलेंगे",
                english = "See you again",
                pronunciation = "phir milenge",
                example = "फिर मिलेंगे, दोस्त (phir milenge, dost) - See you again, friend"
            )
        )
    ),
    Lecture(
        id = "time",
        title = "Time",
        description = "Learn to tell time in Hindi",
        icon = Icons.Default.Schedule,
        content = listOf(
            LectureContent(
                hindi = "समय",
                english = "Time",
                pronunciation = "samay",
                example = "क्या समय हुआ है? (kya samay hua hai?) - What time is it?"
            ),
            LectureContent(
                hindi = "घड़ी",
                english = "Clock/Watch",
                pronunciation = "ghadee",
                example = "मेरी घड़ी में पांच बजे हैं (meri ghadee mein paanch baje hain) - My watch shows five o'clock"
            ),

            // Parts of Day
            LectureContent(
                hindi = "सुबह",
                english = "Morning",
                pronunciation = "subah",
                example = "शुभ प्रभात! सुबह हो गई (shubh prabhat! subah ho gayi) - Good morning! It's morning"
            ),
            LectureContent(
                hindi = "दोपहर",
                english = "Afternoon",
                pronunciation = "dopahar",
                example = "दोपहर का खाना (dopahar ka khana) - Lunch"
            ),
            LectureContent(
                hindi = "शाम",
                english = "Evening",
                pronunciation = "shaam",
                example = "शाम को चाय पीते हैं (shaam ko chai peete hain) - We drink tea in the evening"
            ),
            LectureContent(
                hindi = "रात",
                english = "Night",
                pronunciation = "raat",
                example = "शुभ रात्रि (shubh ratri) - Good night"
            ),

            // Time Units
            LectureContent(
                hindi = "सेकंड",
                english = "Second",
                pronunciation = "second",
                example = "एक मिनट में साठ सेकंड होते हैं (ek minute mein saath second hote hain) - There are sixty seconds in a minute"
            ),
            LectureContent(
                hindi = "मिनट",
                english = "Minute",
                pronunciation = "minute",
                example = "पांच मिनट रुको (paanch minute ruko) - Wait for five minutes"
            ),
            LectureContent(
                hindi = "घंटा",
                english = "Hour",
                pronunciation = "ghanta",
                example = "एक घंटे का समय (ek ghante ka samay) - Time of one hour"
            ),

            // Time Periods
            LectureContent(
                hindi = "दिन",
                english = "Day",
                pronunciation = "din",
                example = "आज का दिन (aaj ka din) - Today"
            ),
            LectureContent(
                hindi = "हफ्ता",
                english = "Week",
                pronunciation = "hafta",
                example = "अगले हफ्ते मिलते हैं (agle hafte milte hain) - See you next week"
            ),
            LectureContent(
                hindi = "महीना",
                english = "Month",
                pronunciation = "maheena",
                example = "इस महीने की शुरुआत (is mahine ki shuruaat) - Beginning of this month"
            ),
            LectureContent(
                hindi = "साल",
                english = "Year",
                pronunciation = "saal",
                example = "नया साल मुबारक (naya saal mubarak) - Happy New Year"
            ),

            // Common Time Phrases
            LectureContent(
                hindi = "आज",
                english = "Today",
                pronunciation = "aaj",
                example = "आज क्या दिन है? (aaj kya din hai?) - What day is today?"
            ),
            LectureContent(
                hindi = "कल",
                english = "Tomorrow/Yesterday",
                pronunciation = "kal",
                example = "कल मिलते हैं (kal milte hain) - See you tomorrow"
            ),
            LectureContent(
                hindi = "परसों",
                english = "Day after tomorrow/Day before yesterday",
                pronunciation = "parson",
                example = "परसों छुट्टी है (parson chhutti hai) - Day after tomorrow is holiday"
            ),
            LectureContent(
                hindi = "अभी",
                english = "Now",
                pronunciation = "abhi",
                example = "अभी समय नहीं है (abhi samay nahi hai) - No time now"
            ),
            LectureContent(
                hindi = "बाद में",
                english = "Later",
                pronunciation = "baad mein",
                example = "बाद में मिलते हैं (baad mein milte hain) - See you later"
            ),
            LectureContent(
                hindi = "जल्दी",
                english = "Early",
                pronunciation = "jaldi",
                example = "जल्दी उठो (jaldi utho) - Wake up early"
            ),
            LectureContent(
                hindi = "देर",
                english = "Late",
                pronunciation = "der",
                example = "देर हो गई (der ho gayi) - It's late"
            )
        )
    ),
    Lecture(
        id = "weather",
        title = "Weather",
        description = "Weather terms in Hindi",
        icon = Icons.Default.WbSunny,
        content = listOf(
            LectureContent(
                hindi = "मौसम",
                english = "Weather",
                pronunciation = "mausam",
                example = "आज का मौसम (aaj ka mausam) - Today's weather"
            ),
            LectureContent(
                hindi = "गरमी",
                english = "Hot/Heat",
                pronunciation = "garmi",
                example = "बहुत गरमी है (bahut garmi hai) - It's very hot"
            ),
            LectureContent(
                hindi = "सर्दी",
                english = "Cold",
                pronunciation = "sardi",
                example = "सर्दी का मौसम (sardi ka mausam) - Winter season"
            ),
            LectureContent(
                hindi = "बारिश",
                english = "Rain",
                pronunciation = "baarish",
                example = "बारिश हो रही है (baarish ho rahi hai) - It's raining"
            ),
            LectureContent(
                hindi = "धूप",
                english = "Sunshine",
                pronunciation = "dhoop",
                example = "तेज धूप है (tez dhoop hai) - Strong sunshine"
            )
        )
    ),
    Lecture(
        id = "emotions",
        title = "Emotions",
        description = "Express feelings in Hindi",
        icon = Icons.Default.EmojiEmotions,
        content = listOf(
            // Basic Emotions
            LectureContent(
                hindi = "खुश",
                english = "Happy",
                pronunciation = "khush",
                example = "मैं खहुत खुश हूं (main bahut khush hoon) - I am very happy"
            ),
            LectureContent(
                hindi = "दुखी",
                english = "Sad",
                pronunciation = "dukhi",
                example = "वह दुखी है (woh dukhi hai) - He/She is sad"
            ),
            LectureContent(
                hindi = "गुस्सा",
                english = "Angry",
                pronunciation = "gussa",
                example = "मुझे गुस्सा आ रहा है (mujhe gussa aa raha hai) - I am getting angry"
            ),
            LectureContent(
                hindi = "प्यार",
                english = "Love",
                pronunciation = "pyaar",
                example = "मैं तुमसे प्यार करता/करती हूं (main tumse pyaar karta/karti hoon) - I love you"
            ),
            LectureContent(
                hindi = "डर",
                english = "Fear",
                pronunciation = "dar",
                example = "मुझे डर लग रहा है (mujhe dar lag raha hai) - I am feeling scared"
            ),

            // Complex Emotions
            LectureContent(
                hindi = "उत्साहित",
                english = "Excited",
                pronunciation = "utsahit",
                example = "मैं बहुत उत्साहित हूं (main bahut utsahit hoon) - I am very excited"
            ),
            LectureContent(
                hindi = "चिंतित",
                english = "Worried",
                pronunciation = "chintit",
                example = "वह चिंतित दिख रहा है (woh chintit dikh raha hai) - He looks worried"
            ),
            LectureContent(
                hindi = "शर्मिंदा",
                english = "Embarrassed",
                pronunciation = "sharminda",
                example = "मैं शर्मिंदा हूं (main sharminda hoon) - I am embarrassed"
            ),
            LectureContent(
                hindi = "आश्चर्यचकित",
                english = "Surprised",
                pronunciation = "aashcharyachakit",
                example = "मैं आश्चर्यचकित हूं (main aashcharyachakit hoon) - I am surprised"
            ),

            // Mood States
            LectureContent(
                hindi = "थका हुआ",
                english = "Tired",
                pronunciation = "thaka hua",
                example = "मैं बहुत थका हुआ हूं (main bahut thaka hua hoon) - I am very tired"
            ),
            LectureContent(
                hindi = "ऊबा हुआ",
                english = "Bored",
                pronunciation = "ooba hua",
                example = "मैं ऊब गया हूं (main oob gaya hoon) - I am bored"
            ),
            LectureContent(
                hindi = "शांत",
                english = "Calm",
                pronunciation = "shaant",
                example = "कृपया शांत रहिए (kripya shaant rahiye) - Please stay calm"
            ),
            LectureContent(
                hindi = "परेशान",
                english = "Troubled",
                pronunciation = "pareshan",
                example = "मैं परेशान हूं (main pareshan hoon) - I am troubled"
            ),

            // Positive States
            LectureContent(
                hindi = "संतुष्ट",
                english = "Satisfied",
                pronunciation = "santusht",
                example = "मैं संतुष्ट हूं (main santusht hoon) - I am satisfied"
            ),
            LectureContent(
                hindi = "आनंदित",
                english = "Delighted",
                pronunciation = "aanandit",
                example = "मैं आनंदित हूं (main aanandit hoon) - I am delighted"
            ),
            LectureContent(
                hindi = "गर्वित",
                english = "Proud",
                pronunciation = "garvit",
                example = "मैं तुम पर गर्वित हूं (main tum par garvit hoon) - I am proud of you"
            ),

            // Negative States
            LectureContent(
                hindi = "निराश",
                english = "Disappointed",
                pronunciation = "nirash",
                example = "मैं निराश हूं (main nirash hoon) - I am disappointed"
            ),
            LectureContent(
                hindi = "ईर्ष्यालु",
                english = "Jealous",
                pronunciation = "eershyalu",
                example = "वह ईर्ष्यालु है (woh eershyalu hai) - He/She is jealous"
            ),
            LectureContent(
                hindi = "दुखी",
                english = "Hurt",
                pronunciation = "dukhi",
                example = "मैं दुखी हूं (main dukhi hoon) - I am hurt"
            ),

            // Social Emotions
            LectureContent(
                hindi = "शर्मीला",
                english = "Shy",
                pronunciation = "sharmeela",
                example = "वह बहुत शर्मीली है (woh bahut sharmeeli hai) - She is very shy"
            ),
            LectureContent(
                hindi = "आत्मविश्वासी",
                english = "Confident",
                pronunciation = "aatmavishwasi",
                example = "मैं आत्मविश्वासी हूं (main aatmavishwasi hoon) - I am confident"
            )
        )
    ),
    Lecture(
        id = "places",
        title = "Places",
        description = "Common places in Hindi",
        icon = Icons.Default.Place,
        content = listOf(
            LectureContent(
                hindi = "घर",
                english = "Home",
                pronunciation = "ghar",
                example = "मेरा घर (mera ghar) - My home"
            ),
            LectureContent(
                hindi = "बाज़ार",
                english = "Market",
                pronunciation = "bazaar",
                example = "बाज़ार जाना (bazaar jana) - Going to market"
            ),
            LectureContent(
                hindi = "स्कूल",
                english = "School",
                pronunciation = "school",
                example = "स्कूल की छुट्टी (school ki chhutti) - School holiday"
            ),
            LectureContent(
                hindi = "अस्पताल",
                english = "Hospital",
                pronunciation = "aspatal",
                example = "नया अस्पताल (naya aspatal) - New hospital"
            ),
            LectureContent(
                hindi = "मंदिर",
                english = "Temple",
                pronunciation = "mandir",
                example = "मंदिर में पूजा (mandir mein pooja) - Prayer in temple"
            )
        )
    )
) 