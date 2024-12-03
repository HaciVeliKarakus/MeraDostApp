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
                example = "सफ़ेद कपड़ा (safed kapda) - white cloth"
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
                example = "गहरा नीला समुद्र (gehra neela samundar) - deep blue ocean"
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
                example = "मे���ी दादी (meri daadi) - my paternal grandmother"
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
                hindi = "मामा",
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
                hindi = "हाथी",
                english = "Elephant",
                pronunciation = "haathi",
                example = "बड़ा हाथी (bada haathi) - big elephant"
            ),
            LectureContent(
                hindi = "शेर",
                english = "Lion",
                pronunciation = "sher",
                example = "जंगल का राजा शेर (jangal ka raja sher) - lion, king of jungle"
            ),
            LectureContent(
                hindi = "बंदर",
                english = "Monkey",
                pronunciation = "bandar",
                example = "छोटा बंदर (chota bandar) - small monkey"
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
                example = "गरम च���वल (garam chawal) - hot rice"
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
    )
) 