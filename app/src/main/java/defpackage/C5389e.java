package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Process;
import android.provider.Settings;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.appbar.AppBarLayout;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NotificationCallback;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5389e implements InterfaceC3518e, InterfaceC17386e, InterfaceC0569e, InterfaceC12233e, InterfaceC3896e, InterfaceC12523e, InterfaceC14187e, InterfaceC17722e, NotificationCallback, InterfaceC11306e, InterfaceC14168e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static volatile C5389e f11537e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static volatile C5389e f11538e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Object f11539e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f11540e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11541e;

    public C5389e(int i) {
        this.f11541e = i;
        switch (i) {
            case 1:
                return;
            case 5:
                this.f11540e = new C12431e(0, new C8735e[16]);
                return;
            case 12:
                this.f11540e = new C5628e();
                return;
            default:
                Csuper ad = AbstractC8507e.ad();
                ad.mo3904implements("aar", "Afar");
                ad.mo3904implements("abk", "Abkhazian");
                ad.mo3904implements("ace", "Achinese");
                ad.mo3904implements("ach", "Acoli");
                ad.mo3904implements("ada", "Adangme");
                ad.mo3904implements("afa", "Afro-Asiatic");
                ad.mo3904implements("afh", "Afrihili");
                ad.mo3904implements("afr", "Afrikaans");
                ad.mo3904implements("aka", "Akan");
                ad.mo3904implements("akk", "Akkadian");
                ad.mo3904implements("alb", "Albanian");
                ad.mo3904implements("ale", "Aleut");
                ad.mo3904implements("alg", "Algonquian languages");
                ad.mo3904implements("amh", "Amharic");
                ad.mo3904implements("ang", "Old English,(ca.450-1100)");
                ad.mo3904implements("apa", "Apache languages");
                ad.mo3904implements("ara", "Arabic");
                ad.mo3904implements("arc", "Aramaic");
                ad.mo3904implements("arm", "Armenian");
                ad.mo3904implements("arn", "Araucanian");
                ad.mo3904implements("arp", "Arapaho");
                ad.mo3904implements("art", "Artificial");
                ad.mo3904implements("arw", "Arawak");
                ad.mo3904implements("asm", "Assamese");
                ad.mo3904implements("ast", "Asturian Bable");
                ad.mo3904implements("ath", "Athapascan languages");
                ad.mo3904implements("aus", "Australian languages");
                ad.mo3904implements("ava", "Avaric");
                ad.mo3904implements("ave", "Avestan");
                ad.mo3904implements("awa", "Awadhi");
                ad.mo3904implements("aym", "Aymara");
                ad.mo3904implements("aze", "Azerbaijani");
                ad.mo3904implements("bad", "Banda");
                ad.mo3904implements("bai", "Bamileke languages");
                ad.mo3904implements("bak", "Bashkir");
                ad.mo3904implements("bal", "Baluchi");
                ad.mo3904implements("bam", "Bambara");
                ad.mo3904implements("ban", "Balinese");
                ad.mo3904implements("baq", "Basque");
                ad.mo3904implements("bas", "Basa");
                ad.mo3904implements("bat", "Baltic");
                ad.mo3904implements("bej", "Beja");
                ad.mo3904implements("bel", "Belarusian");
                ad.mo3904implements("bem", "Bemba");
                ad.mo3904implements("ben", "Bengali");
                ad.mo3904implements("ber", "Berber");
                ad.mo3904implements("bho", "Bhojpuri");
                ad.mo3904implements("bih", "Bihari");
                ad.mo3904implements("bik", "Bikol");
                ad.mo3904implements("bin", "Bini");
                ad.mo3904implements("bis", "Bislama");
                ad.mo3904implements("bla", "Siksika");
                ad.mo3904implements("bnt", "Bantu");
                ad.mo3904implements("bod", "Tibetan");
                ad.mo3904implements("bos", "Bosnian");
                ad.mo3904implements("bra", "Braj");
                ad.mo3904implements("bre", "Breton");
                ad.mo3904implements("btk", "Batak (Indonesia)");
                ad.mo3904implements("bua", "Buriat");
                ad.mo3904implements("bug", "Buginese");
                ad.mo3904implements("bul", "Bulgarian");
                ad.mo3904implements("bur", "Burmese");
                ad.mo3904implements("cad", "Caddo");
                ad.mo3904implements("cai", "Central American Indian");
                ad.mo3904implements("car", "Carib");
                ad.mo3904implements("cat", "Catalan");
                ad.mo3904implements("cau", "Caucasian");
                ad.mo3904implements("ceb", "Cebuano");
                ad.mo3904implements("cel", "Celtic");
                ad.mo3904implements("ces", "Czech");
                ad.mo3904implements("cha", "Chamorro");
                ad.mo3904implements("chb", "Chibcha");
                ad.mo3904implements("che", "Chechen");
                ad.mo3904implements("chg", "Chagatai");
                ad.mo3904implements("chi", "Chinese");
                ad.mo3904implements("chk", "Chuukese");
                ad.mo3904implements("chm", "Mari");
                ad.mo3904implements("chn", "Chinook jargon");
                ad.mo3904implements("cho", "Choctaw");
                ad.mo3904implements("chp", "Chipewyan");
                ad.mo3904implements("chr", "Cherokee");
                ad.mo3904implements("chu", "Church Slavic");
                ad.mo3904implements("chv", "Chuvash");
                ad.mo3904implements("chy", "Cheyenne");
                ad.mo3904implements("cmc", "Chamic languages");
                ad.mo3904implements("cop", "Coptic");
                ad.mo3904implements("cor", "Cornish");
                ad.mo3904implements("cos", "Corsican");
                ad.mo3904implements("cpe", "Creoles and pidgins, English based");
                ad.mo3904implements("cpf", "Creoles and pidgins, French based");
                ad.mo3904implements("cpp", "Creoles and pidgins, Portuguese-based");
                ad.mo3904implements("cre", "Cree");
                ad.mo3904implements("crp", "Creoles and pidgins");
                ad.mo3904implements("cus", "Cushitic");
                ad.mo3904implements("cym", "Welsh");
                ad.mo3904implements("cze", "Czech");
                ad.mo3904implements("dak", "Dakota");
                ad.mo3904implements("dan", "Danish");
                ad.mo3904implements("day", "Dayak");
                ad.mo3904implements("del", "Delaware");
                ad.mo3904implements("den", "Slave (Athapascan)");
                ad.mo3904implements("deu", "German");
                ad.mo3904implements("dgr", "Dogrib");
                ad.mo3904implements("din", "Dinka");
                ad.mo3904implements("div", "Divehi");
                ad.mo3904implements("doi", "Dogri");
                ad.mo3904implements("dra", "Dravidian");
                ad.mo3904implements("dua", "Duala");
                ad.mo3904implements("dum", "Dutch, Middle (ca.1050-1350)");
                ad.mo3904implements("dut", "Dutch");
                ad.mo3904implements("dyu", "Dyula");
                ad.mo3904implements("dzo", "Dzongkha");
                ad.mo3904implements("efi", "Efik");
                ad.mo3904implements("egy", "Egyptian (Ancient)");
                ad.mo3904implements("eka", "Ekajuk");
                ad.mo3904implements("ell", "Greek, Modern (1453-)");
                ad.mo3904implements("elx", "Elamite");
                ad.mo3904implements("eng", "English");
                ad.mo3904implements("enm", "English, Middle (1100-1500)");
                ad.mo3904implements("epo", "Esperanto");
                ad.mo3904implements("est", "Estonian");
                ad.mo3904implements("eus", "Basque");
                ad.mo3904implements("ewe", "Ewe");
                ad.mo3904implements("ewo", "Ewondo");
                ad.mo3904implements("fan", "Fang");
                ad.mo3904implements("fao", "Faroese");
                ad.mo3904implements("fas", "Persian");
                ad.mo3904implements("fat", "Fanti");
                ad.mo3904implements("fij", "Fijian");
                ad.mo3904implements("fin", "Finnish");
                ad.mo3904implements("fiu", "Finno-Ugrian");
                ad.mo3904implements("fon", "Fon");
                ad.mo3904implements("fra", "French");
                ad.mo3904implements("frm", "French, Middle (ca.1400-1800)");
                ad.mo3904implements("fro", "French, Old (842-ca.1400)");
                ad.mo3904implements("fry", "Frisian");
                ad.mo3904implements("ful", "Fulah");
                ad.mo3904implements("fur", "Friulian");
                ad.mo3904implements("gaa", "Ga");
                ad.mo3904implements("gay", "Gayo");
                ad.mo3904implements("gba", "Gbaya");
                ad.mo3904implements("gem", "Germanic");
                ad.mo3904implements("geo", "Georgian");
                ad.mo3904implements("ger", "German");
                ad.mo3904implements("gez", "Geez");
                ad.mo3904implements("gil", "Gilbertese");
                ad.mo3904implements("gla", "Gaelic Scottish Gaelic");
                ad.mo3904implements("gle", "Irish");
                ad.mo3904implements("glg", "Gallegan");
                ad.mo3904implements("glv", "Manx");
                ad.mo3904implements("gmh", "German, Middle High (ca.1050-1500)");
                ad.mo3904implements("goh", "German, Old High (ca.750-1050)");
                ad.mo3904implements("gon", "Gondi");
                ad.mo3904implements("gor", "Gorontalo");
                ad.mo3904implements("got", "Gothic");
                ad.mo3904implements("grb", "Grebo");
                ad.mo3904implements("grc", "Greek, Ancient (to 1453)");
                ad.mo3904implements("gre", "Greek, Modern (1453-)");
                ad.mo3904implements("grn", "Guarani");
                ad.mo3904implements("guj", "Gujarati");
                ad.mo3904implements("gwi", "Gwich´in");
                ad.mo3904implements("hai", "Haida");
                ad.mo3904implements("hau", "Hausa");
                ad.mo3904implements("haw", "Hawaiian");
                ad.mo3904implements("heb", "Hebrew");
                ad.mo3904implements("her", "Herero");
                ad.mo3904implements("hil", "Hiligaynon");
                ad.mo3904implements("him", "Himachali");
                ad.mo3904implements("hin", "Hindi");
                ad.mo3904implements("hit", "Hittite");
                ad.mo3904implements("hmn", "Hmong");
                ad.mo3904implements("hmo", "Hiri Motu");
                ad.mo3904implements("hrv", "Croatian");
                ad.mo3904implements("hun", "Hungarian");
                ad.mo3904implements("hup", "Hupa");
                ad.mo3904implements("hye", "Armenian");
                ad.mo3904implements("iba", "Iban");
                ad.mo3904implements("ibo", "Igbo");
                ad.mo3904implements("ice", "Icelandic");
                ad.mo3904implements("ido", "Ido");
                ad.mo3904implements("ijo", "Ijo");
                ad.mo3904implements("iku", "Inuktitut");
                ad.mo3904implements("ile", "Interlingue");
                ad.mo3904implements("ilo", "Iloko");
                ad.mo3904implements("ina", "Interlingua");
                ad.mo3904implements("inc", "Indic");
                ad.mo3904implements("ind", "Indonesian");
                ad.mo3904implements("ine", "Indo-European");
                ad.mo3904implements("ipk", "Inupiaq");
                ad.mo3904implements("ira", "Iranian (Other)");
                ad.mo3904implements("iro", "Iroquoian languages");
                ad.mo3904implements("isl", "Icelandic");
                ad.mo3904implements("ita", "Italian");
                ad.mo3904implements("jav", "Javanese");
                ad.mo3904implements("jpn", "Japanese");
                ad.mo3904implements("jpr", "Judeo-Persian");
                ad.mo3904implements("jrb", "Judeo-Arabic");
                ad.mo3904implements("kaa", "Kara-Kalpak");
                ad.mo3904implements("kab", "Kabyle");
                ad.mo3904implements("kac", "Kachin");
                ad.mo3904implements("kal", "Kalaallisut");
                ad.mo3904implements("kam", "Kamba");
                ad.mo3904implements("kan", "Kannada");
                ad.mo3904implements("kar", "Karen");
                ad.mo3904implements("kas", "Kashmiri");
                ad.mo3904implements("kat", "Georgian");
                ad.mo3904implements("kau", "Kanuri");
                ad.mo3904implements("kaw", "Kawi");
                ad.mo3904implements("kaz", "Kazakh");
                ad.mo3904implements("kha", "Khasi");
                ad.mo3904implements("khi", "Khoisan");
                ad.mo3904implements("khm", "Khmer");
                ad.mo3904implements("kho", "Khotanese");
                ad.mo3904implements("kik", "Kikuyu Gikuyu");
                ad.mo3904implements("kin", "Kinyarwanda");
                ad.mo3904implements("kir", "Kirghiz");
                ad.mo3904implements("kmb", "Kimbundu");
                ad.mo3904implements("kok", "Konkani");
                ad.mo3904implements("kom", "Komi");
                ad.mo3904implements("kon", "Kongo");
                ad.mo3904implements("kor", "Korean");
                ad.mo3904implements("kos", "Kosraean");
                ad.mo3904implements("kpe", "Kpelle");
                ad.mo3904implements("kro", "Kru");
                ad.mo3904implements("kru", "Kurukh");
                ad.mo3904implements("kua", "Kuanyama Kwanyama");
                ad.mo3904implements("kum", "Kumyk");
                ad.mo3904implements("kur", "Kurdish");
                ad.mo3904implements("kut", "Kutenai");
                ad.mo3904implements("lad", "Ladino");
                ad.mo3904implements("lah", "Lahnda");
                ad.mo3904implements("lam", "Lamba");
                ad.mo3904implements("lao", "Lao");
                ad.mo3904implements("lat", "Latin");
                ad.mo3904implements("lav", "Latvian");
                ad.mo3904implements("lez", "Lezghian");
                ad.mo3904implements("lin", "Lingala");
                ad.mo3904implements("lit", "Lithuanian");
                ad.mo3904implements("lol", "Mongo");
                ad.mo3904implements("loz", "Lozi");
                ad.mo3904implements("ltz", "Luxembourgish Letzeburgesch");
                ad.mo3904implements("lua", "Luba-Lulua");
                ad.mo3904implements("lub", "Luba-Katanga");
                ad.mo3904implements("lug", "Ganda");
                ad.mo3904implements("lui", "Luiseno");
                ad.mo3904implements("lun", "Lunda");
                ad.mo3904implements("luo", "Luo (Kenya and Tanzania)");
                ad.mo3904implements("lus", "lushai");
                ad.mo3904implements("mac", "Macedonian");
                ad.mo3904implements("mad", "Madurese");
                ad.mo3904implements("mag", "Magahi");
                ad.mo3904implements("mah", "Marshallese");
                ad.mo3904implements("mai", "Maithili");
                ad.mo3904implements("mak", "Makasar");
                ad.mo3904implements("mal", "Malayalam");
                ad.mo3904implements("man", "Mandingo");
                ad.mo3904implements("mao", "Maori");
                ad.mo3904implements("map", "Austronesian");
                ad.mo3904implements("mar", "Marathi");
                ad.mo3904implements("mas", "Masai");
                ad.mo3904implements("may", "Malay");
                ad.mo3904implements("mdr", "Mandar");
                ad.mo3904implements("men", "Mende");
                ad.mo3904implements("mga", "Irish, Middle (900-1200)");
                ad.mo3904implements("mic", "Micmac");
                ad.mo3904implements("min", "Minangkabau");
                ad.mo3904implements("mis", "Miscellaneous languages");
                ad.mo3904implements("mkd", "Macedonian");
                ad.mo3904implements("mkh", "Mon-Khmer");
                ad.mo3904implements("mlg", "Malagasy");
                ad.mo3904implements("mlt", "Maltese");
                ad.mo3904implements("mnc", "Manchu");
                ad.mo3904implements("mni", "Manipuri");
                ad.mo3904implements("mno", "Manobo languages");
                ad.mo3904implements("moh", "Mohawk");
                ad.mo3904implements("mol", "Moldavian");
                ad.mo3904implements("mon", "Mongolian");
                ad.mo3904implements("mos", "Mossi");
                ad.mo3904implements("mri", "Maori");
                ad.mo3904implements("msa", "Malay");
                ad.mo3904implements("mul", "Multiple languages");
                ad.mo3904implements("mun", "Munda languages");
                ad.mo3904implements("mus", "Creek");
                ad.mo3904implements("mwr", "Marwari");
                ad.mo3904implements("mya", "Burmese");
                ad.mo3904implements("myn", "Mayan languages");
                ad.mo3904implements("nah", "Nahuatl");
                ad.mo3904implements("nai", "North American Indian");
                ad.mo3904implements("nau", "Nauru");
                ad.mo3904implements("nav", "Navajo Navaho");
                ad.mo3904implements("nbl", "South Ndebele");
                ad.mo3904implements("nde", "North Ndebele");
                ad.mo3904implements("ndo", "Ndonga");
                ad.mo3904implements("nds", "Low German Low Saxon");
                ad.mo3904implements("nep", "Nepali");
                ad.mo3904implements("new", "Newari");
                ad.mo3904implements("nia", "Nias");
                ad.mo3904implements("nic", "Niger-Kordofanian");
                ad.mo3904implements("niu", "Niuean");
                ad.mo3904implements("nld", "Dutch");
                ad.mo3904implements("nno", "Norwegian Nynorsk");
                ad.mo3904implements("nob", "Norwegian Bokmål");
                ad.mo3904implements("non", "Norse, Old");
                ad.mo3904implements("nor", "Norwegian");
                ad.mo3904implements("nso", "Sotho, Northern");
                ad.mo3904implements("nub", "Nubian languages");
                ad.mo3904implements("nya", "Chichewa Chewa Nyanja");
                ad.mo3904implements("nym", "Nyamwezi");
                ad.mo3904implements("nyn", "Nyankole");
                ad.mo3904implements("nyo", "Nyoro");
                ad.mo3904implements("nzi", "Nzima");
                ad.mo3904implements("oci", "Occitan (post 1500) Provençal");
                ad.mo3904implements("oji", "Ojibwa");
                ad.mo3904implements("ori", "Oriya");
                ad.mo3904implements("orm", "Oromo");
                ad.mo3904implements("osa", "Osage");
                ad.mo3904implements("oss", "Ossetian Ossetic");
                ad.mo3904implements("ota", "Turkish, Ottoman (1500-1928)");
                ad.mo3904implements("oto", "Otomian languages");
                ad.mo3904implements("paa", "Papuan");
                ad.mo3904implements("pag", "Pangasinan");
                ad.mo3904implements("pal", "Pahlavi");
                ad.mo3904implements("pam", "Pampanga");
                ad.mo3904implements("pan", "Panjabi");
                ad.mo3904implements("pap", "Papiamento");
                ad.mo3904implements("pau", "Palauan");
                ad.mo3904implements("peo", "Persian, Old (ca.600-400 B.C.)");
                ad.mo3904implements("per", "Persian");
                ad.mo3904implements("phi", "Philippine");
                ad.mo3904implements("phn", "Phoenician");
                ad.mo3904implements("pli", "Pali");
                ad.mo3904implements("pol", "Polish");
                ad.mo3904implements("pon", "Pohnpeian");
                ad.mo3904implements("por", "Portuguese");
                ad.mo3904implements("pra", "Prakrit languages");
                ad.mo3904implements("pro", "Provençal, Old (to 1500)");
                ad.mo3904implements("pus", "Pushto");
                ad.mo3904implements("que", "Quechua");
                ad.mo3904implements("raj", "Rajasthani");
                ad.mo3904implements("rap", "Rapanui");
                ad.mo3904implements("rar", "Rarotongan");
                ad.mo3904implements("roa", "Romance");
                ad.mo3904implements("roh", "Raeto-Romance");
                ad.mo3904implements("rom", "Romany");
                ad.mo3904implements("ron", "Romanian");
                ad.mo3904implements("rum", "Romanian");
                ad.mo3904implements("run", "Rundi");
                ad.mo3904implements("rus", "Russian");
                ad.mo3904implements("sad", "Sandawe");
                ad.mo3904implements("sag", "Sango");
                ad.mo3904implements("sah", "Yakut");
                ad.mo3904implements("sai", "South American Indian");
                ad.mo3904implements("sal", "Salishan languages");
                ad.mo3904implements("sam", "Samaritan Aramaic");
                ad.mo3904implements("san", "Sanskrit");
                ad.mo3904implements("sas", "Sasak");
                ad.mo3904implements("sat", "Santali");
                ad.mo3904implements("sco", "Scots");
                ad.mo3904implements("sel", "Selkup");
                ad.mo3904implements("sem", "Semitic");
                ad.mo3904implements("sga", "Irish, Old (to 900)");
                ad.mo3904implements("sgn", "Sign languages");
                ad.mo3904implements("shn", "Shan");
                ad.mo3904implements("sid", "Sidamo");
                ad.mo3904implements("sin", "Sinhales");
                ad.mo3904implements("sio", "Siouan languages");
                ad.mo3904implements("sit", "Sino-Tibetan");
                ad.mo3904implements("sla", "Slavic");
                ad.mo3904implements("slk", "Slovak");
                ad.mo3904implements("slo", "Slovak");
                ad.mo3904implements("slv", "Slovenian");
                ad.mo3904implements("sma", "Southern Sami");
                ad.mo3904implements("sme", "Northern Sami");
                ad.mo3904implements("smi", "Sami languages");
                ad.mo3904implements("smj", "Lule Sami");
                ad.mo3904implements("smn", "Inari Sami");
                ad.mo3904implements("smo", "Samoan");
                ad.mo3904implements("sms", "Skolt Sami");
                ad.mo3904implements("sna", "Shona");
                ad.mo3904implements("snd", "Sindhi");
                ad.mo3904implements("snk", "Soninke");
                ad.mo3904implements("sog", "Sogdian");
                ad.mo3904implements("som", "Somali");
                ad.mo3904implements("son", "Songhai");
                ad.mo3904implements("sot", "Sotho, Southern");
                ad.mo3904implements("spa", "Spanish Castilia");
                ad.mo3904implements("sqi", "Albanian");
                ad.mo3904implements("srd", "Sardinian");
                ad.mo3904implements("srp", "Serbian");
                ad.mo3904implements("srr", "Serer");
                ad.mo3904implements("ssa", "Nilo-Saharan");
                ad.mo3904implements("sus", "Susu");
                ad.mo3904implements("sux", "Sumerian");
                ad.mo3904implements("swa", "Swahili");
                ad.mo3904implements("swe", "Swedish");
                ad.mo3904implements("syr", "Syriac");
                ad.mo3904implements("tah", "Tahitian");
                ad.mo3904implements("tai", "Tai");
                ad.mo3904implements("tam", "Tamil");
                ad.mo3904implements("tat", "Tatar");
                ad.mo3904implements("tel", "Telugu");
                ad.mo3904implements("tem", "Timne");
                ad.mo3904implements("ter", "Tereno");
                ad.mo3904implements("tet", "Tetum");
                ad.mo3904implements("tgk", "Tajik");
                ad.mo3904implements("tgl", "Tagalog");
                ad.mo3904implements("tha", "Thai");
                ad.mo3904implements("tib", "Tibetan");
                ad.mo3904implements("tig", "Tigre");
                ad.mo3904implements("tir", "Tigrinya");
                ad.mo3904implements("tiv", "Tiv");
                ad.mo3904implements("tkl", "Tokelau");
                ad.mo3904implements("tli", "Tlingit");
                ad.mo3904implements("tmh", "Tamashek");
                ad.mo3904implements("tog", "Tonga (Nyasa)");
                ad.mo3904implements("ton", "Tonga (Tonga Islands)");
                ad.mo3904implements("tpi", "Tok Pisin");
                ad.mo3904implements("tsi", "Tsimshian");
                ad.mo3904implements("tsn", "Tswana");
                ad.mo3904implements("tso", "Tsonga");
                ad.mo3904implements("tuk", "Turkmen");
                ad.mo3904implements("tum", "Tumbuka");
                ad.mo3904implements("tup", "Tupi");
                ad.mo3904implements("tur", "Turkish");
                ad.mo3904implements("tut", "Altaic");
                ad.mo3904implements("tvl", "Tuvalu");
                ad.mo3904implements("twi", "Twi");
                ad.mo3904implements("tyv", "Tuvinian");
                ad.mo3904implements("uga", "Ugaritic");
                ad.mo3904implements("uig", "Uighur");
                ad.mo3904implements("ukr", "Ukrainian");
                ad.mo3904implements("umb", "Umbundu");
                ad.mo3904implements("und", "Undetermined");
                ad.mo3904implements("urd", "Urdu");
                ad.mo3904implements("uzb", "Uzbek");
                ad.mo3904implements("vai", "Vai");
                ad.mo3904implements("ven", "Venda");
                ad.mo3904implements("vie", "Vietnamese");
                ad.mo3904implements("vol", "Volapük");
                ad.mo3904implements("vot", "Votic");
                ad.mo3904implements("wak", "Wakashan languages");
                ad.mo3904implements("wal", "Walamo");
                ad.mo3904implements("war", "Waray");
                ad.mo3904implements("was", "Washo");
                ad.mo3904implements("wel", "Welsh");
                ad.mo3904implements("wen", "Sorbian languages");
                ad.mo3904implements("wln", "Walloon");
                ad.mo3904implements("wol", "Wolof");
                ad.mo3904implements("xho", "Xhosa");
                ad.mo3904implements("yao", "Yao");
                ad.mo3904implements("yap", "Yapese");
                ad.mo3904implements("yid", "Yiddish");
                ad.mo3904implements("yor", "Yoruba");
                ad.mo3904implements("ypk", "Yupik languages");
                ad.mo3904implements("zap", "Zapotec");
                ad.mo3904implements("zen", "Zenaga");
                ad.mo3904implements("zha", "Zhuang Chuang");
                ad.mo3904implements("zho", "Chinese");
                ad.mo3904implements("znd", "Zande");
                ad.mo3904implements("zul", "Zulu");
                ad.mo3904implements("zun", "Zuni");
                ad.mo3904implements("\u0000\u0000\u0000", "Winamp Format");
                ad.mo3904implements("XXX", "Media Monkey Format");
                this.f11540e = ad.mopub(true);
                return;
        }
    }

    public C5389e(int i, int i2) {
        this.f11541e = 25;
        this.f11540e = new C17980e(i, i2);
    }

    public /* synthetic */ C5389e(int i, Object obj) {
        this.f11541e = i;
        this.f11540e = obj;
    }

    public C5389e(Context context) {
        boolean isEmpty;
        this.f11541e = 26;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f11540e = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                yandex();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public C5389e(EditText editText) {
        this.f11541e = 11;
        this.f11540e = new C13391e(editText);
    }

    public C5389e(HashSet hashSet) {
        this.f11541e = 20;
        this.f11540e = DesugarCollections.unmodifiableSet(hashSet);
    }

    public static C5389e isVip(Context context) {
        C5389e c5389e;
        synchronized (f11539e) {
            try {
                if (f11537e == null) {
                    Context applicationContext = context.getApplicationContext();
                    C5389e c5389e2 = new C5389e(1);
                    C11883e c11883e = new C11883e(2, false);
                    c11883e.f23815e = applicationContext;
                    c11883e.f23814e = applicationContext.getContentResolver();
                    c5389e2.f11540e = c11883e;
                    f11537e = c5389e2;
                }
                c5389e = f11537e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5389e;
    }

    public static C5389e pro(C11154e c11154e, C1400e c1400e) {
        String str;
        C1828e c1828e;
        C2697e c2697e = c11154e.vip;
        HashSet hashSet = new HashSet();
        boolean z = c11154e.metrica;
        if (c11154e.license < 1) {
            hashSet.add(EnumC12540e.f25119e);
        }
        if (!c11154e.ad() && c2697e == null) {
            hashSet.add(EnumC12540e.f25105e);
        } else if (c11154e.ad() && c2697e != null) {
            hashSet.add(EnumC12540e.f25100e);
        }
        if (c11154e.ad()) {
            if (!z) {
                hashSet.add(EnumC12540e.f25115e);
            }
            C4541e c4541e = c11154e.ad;
            for (C12070e c12070e : c4541e.ad) {
                String str2 = c12070e.ad;
                C14796e c14796e = c12070e.vip;
                if (str2 == null || str2.isEmpty()) {
                    hashSet.add(EnumC12540e.f25104e);
                }
                if (c14796e != null) {
                    if (c14796e.ad == -1) {
                        hashSet.add(EnumC12540e.f25114e);
                    }
                    if (c14796e.vip < -1) {
                        hashSet.add(EnumC12540e.f25122e);
                    }
                }
            }
            for (C7297e c7297e : c4541e.vip) {
                String str3 = c7297e.billing;
                if (str3 == null || str3.isEmpty()) {
                    hashSet.add(EnumC12540e.f25102e);
                }
                if (c7297e.ad == -1) {
                    hashSet.add(EnumC12540e.f25113e);
                }
                if (c7297e.vip < -1) {
                    hashSet.add(EnumC12540e.f25116e);
                }
            }
            for (C5129e c5129e : c4541e.metrica) {
                EnumC15030e enumC15030e = c5129e.ad;
                String str4 = c5129e.adcel;
                if (enumC15030e == null) {
                    hashSet.add(EnumC12540e.f25120e);
                }
                if (c5129e.metrica == null) {
                    hashSet.add(EnumC12540e.f25109e);
                }
                if (c5129e.purchase == null) {
                    hashSet.add(EnumC12540e.f25117e);
                }
                EnumC15030e enumC15030e2 = EnumC15030e.CLOSED_CAPTIONS;
                if (enumC15030e == enumC15030e2) {
                    String str5 = c5129e.vip;
                    if (str5 != null && !str5.isEmpty()) {
                        hashSet.add(EnumC12540e.f25101e);
                    }
                    if (str4 == null) {
                        hashSet.add(EnumC12540e.f25111e);
                    }
                } else if (enumC15030e != enumC15030e2 && str4 != null) {
                    hashSet.add(EnumC12540e.f25099e);
                }
                if (c5129e.billing && !c5129e.yandex) {
                    hashSet.add(EnumC12540e.f25098e);
                }
                if (enumC15030e != EnumC15030e.SUBTITLES && c5129e.startapp) {
                    hashSet.add(EnumC12540e.f25103e);
                }
            }
        }
        if (c2697e != null) {
            if (z && (c1828e = c2697e.yandex) != null && Float.isNaN(c1828e.ad)) {
                hashSet.add(EnumC12540e.f25097e);
            }
            List<C6900e> list = c2697e.ad;
            HashSet hashSet2 = new HashSet();
            for (C6900e c6900e : list) {
                C5564e c5564e = c6900e.billing;
                boolean z2 = c5564e != null;
                String str6 = c6900e.ad;
                if (z2) {
                    if (c5564e.vip != null) {
                        hashSet2.add(str6);
                    } else if (!hashSet2.contains(str6)) {
                        hashSet.add(EnumC12540e.f25112e);
                    }
                }
            }
            for (C6900e c6900e2 : c2697e.ad) {
                String str7 = c6900e2.ad;
                C14943e c14943e = c6900e2.vip;
                if (str7 == null || str7.isEmpty()) {
                    hashSet.add(EnumC12540e.f25107e);
                }
                if (z && c14943e == null) {
                    hashSet.add(EnumC12540e.f25108e);
                }
                C4903e c4903e = c6900e2.metrica;
                if (c4903e != null && c4903e.ad == null) {
                    hashSet.add(EnumC12540e.f25121e);
                }
                if (c14943e != null) {
                    c1400e.getClass();
                    if (c14943e.ad < 0.0f) {
                        hashSet.add(EnumC12540e.f25106e);
                    }
                }
                C4438e c4438e = c6900e2.purchase;
                if (c4438e != null && ((str = c4438e.ad) == null || str.isEmpty())) {
                    hashSet.add(EnumC12540e.f25118e);
                }
            }
        }
        return new C5389e(hashSet);
    }

    public static C5389e signatures() {
        if (f11538e == null) {
            synchronized (C5389e.class) {
                try {
                    if (f11538e == null) {
                        f11538e = new C5389e(0);
                    }
                } finally {
                }
            }
        }
        return f11538e;
    }

    @Override // defpackage.InterfaceC17722e
    public SecretKeyFactory Signature(String str) {
        return SecretKeyFactory.getInstance(str, (Provider) this.f11540e);
    }

    public void ad(int i, int i2, InterfaceC2283e interfaceC2283e) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        int i8;
        int i9;
        int i10;
        int i11;
        C0518e c0518e = (C0518e) this.f11540e;
        C10629e c10629e = c0518e.vip;
        SparseArray sparseArray = c0518e.metrica;
        C1292e c1292e = c0518e.mopub;
        C1292e c1292e2 = c0518e.startapp;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (c0518e.f2653protected != 2) {
                    return;
                }
                C7657e c7657e = (C7657e) sparseArray.get(c0518e.f2638catch);
                int i15 = c0518e.f2650new;
                C1292e c1292e3 = c0518e.Signature;
                if (i15 != 4 || !"V_VP9".equals(c7657e.metrica)) {
                    interfaceC2283e.amazon(i2);
                    return;
                } else {
                    c1292e3.m564extends(i2);
                    interfaceC2283e.readFully(c1292e3.ad, 0, i2);
                    return;
                }
            }
            if (i == 16877) {
                c0518e.yandex(i);
                C7657e c7657e2 = c0518e.isPro;
                int i16 = c7657e2.yandex;
                if (i16 != 1685485123 && i16 != 1685480259) {
                    interfaceC2283e.amazon(i2);
                    return;
                }
                byte[] bArr = new byte[i2];
                c7657e2.f15555break = bArr;
                interfaceC2283e.readFully(bArr, 0, i2);
                return;
            }
            if (i == 16981) {
                c0518e.yandex(i);
                byte[] bArr2 = new byte[i2];
                c0518e.isPro.adcel = bArr2;
                interfaceC2283e.readFully(bArr2, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i2];
                interfaceC2283e.readFully(bArr3, 0, i2);
                c0518e.yandex(i);
                c0518e.isPro.mopub = new C17737e(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                Arrays.fill(c1292e.ad, (byte) 0);
                interfaceC2283e.readFully(c1292e.ad, 4 - i2, i2);
                c1292e.m571try(0);
                c0518e.ads = (int) c1292e.subs();
                return;
            }
            if (i == 25506) {
                c0518e.yandex(i);
                byte[] bArr4 = new byte[i2];
                c0518e.isPro.advert = bArr4;
                interfaceC2283e.readFully(bArr4, 0, i2);
                return;
            }
            if (i != 30322) {
                throw C15125e.ad(null, "Unexpected id: " + i);
            }
            c0518e.yandex(i);
            byte[] bArr5 = new byte[i2];
            c0518e.isPro.inmobi = bArr5;
            interfaceC2283e.readFully(bArr5, 0, i2);
            return;
        }
        if (c0518e.f2653protected == 0) {
            c0518e.f2638catch = (int) c10629e.subscription(interfaceC2283e, false, true, 8);
            c0518e.f2643final = c10629e.f20950e;
            c0518e.f2635abstract = -9223372036854775807L;
            c0518e.f2653protected = 1;
            c1292e2.m564extends(0);
        }
        C7657e c7657e3 = (C7657e) sparseArray.get(c0518e.f2638catch);
        if (c7657e3 == null) {
            interfaceC2283e.amazon(i2 - c0518e.f2643final);
            c0518e.f2653protected = 0;
            return;
        }
        c7657e3.f15568package.getClass();
        if (c0518e.f2653protected == 1) {
            c0518e.smaato(interfaceC2283e, 3);
            int i17 = (c1292e2.ad[2] & 6) >> 1;
            byte b = 255;
            if (i17 == 0) {
                c0518e.f2645implements = 1;
                int[] iArr = c0518e.f2637case;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                c0518e.f2637case = iArr;
                iArr[0] = (i2 - c0518e.f2643final) - 3;
            } else {
                c0518e.smaato(interfaceC2283e, 4);
                int i18 = (c1292e2.ad[3] & 255) + 1;
                c0518e.f2645implements = i18;
                int[] iArr2 = c0518e.f2637case;
                if (iArr2 == null) {
                    iArr2 = new int[i18];
                } else if (iArr2.length < i18) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i18)];
                }
                c0518e.f2637case = iArr2;
                if (i17 == 2) {
                    int i19 = (i2 - c0518e.f2643final) - 4;
                    int i20 = c0518e.f2645implements;
                    Arrays.fill(iArr2, 0, i20, i19 / i20);
                } else {
                    if (i17 != 1) {
                        if (i17 != 3) {
                            throw C15125e.ad(null, "Unexpected lacing value: " + i17);
                        }
                        int i21 = 0;
                        int i22 = 0;
                        int i23 = 4;
                        while (true) {
                            int i24 = c0518e.f2645implements - i14;
                            if (i21 >= i24) {
                                i3 = i12;
                                i4 = i13;
                                i5 = i14;
                                c0518e.f2637case[i24] = ((i2 - c0518e.f2643final) - i23) - i22;
                                break;
                            }
                            c0518e.f2637case[i21] = i13;
                            int i25 = i23 + 1;
                            c0518e.smaato(interfaceC2283e, i25);
                            if (c1292e2.ad[i23] == 0) {
                                throw C15125e.ad(null, "No valid varint length mask found");
                            }
                            int i26 = i13;
                            while (true) {
                                if (i26 >= 8) {
                                    i6 = i12;
                                    i7 = i14;
                                    j = 0;
                                    i8 = i25;
                                    break;
                                }
                                int i27 = i14 << (7 - i26);
                                i6 = i12;
                                if ((c1292e2.ad[i23] & i27) != 0) {
                                    int i28 = i25 + i26;
                                    c0518e.smaato(interfaceC2283e, i28);
                                    i7 = i14;
                                    j = c1292e2.ad[i23] & b & (~i27);
                                    while (i25 < i28) {
                                        j = (j << 8) | (c1292e2.ad[i25] & b);
                                        i25++;
                                        i28 = i28;
                                        b = 255;
                                    }
                                    i8 = i28;
                                    if (i21 > 0) {
                                        j -= (1 << ((i26 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i26++;
                                    i12 = i6;
                                    b = 255;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i29 = (int) j;
                            int[] iArr3 = c0518e.f2637case;
                            if (i21 != 0) {
                                i29 += iArr3[i21 - 1];
                            }
                            iArr3[i21] = i29;
                            i22 += i29;
                            i21++;
                            i13 = i26;
                            i12 = i6;
                            i14 = i7;
                            i23 = i8;
                            b = 255;
                        }
                        throw C15125e.ad(null, "EBML lacing sample size out of range.");
                    }
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 4;
                    while (true) {
                        i9 = c0518e.f2645implements - 1;
                        if (i30 >= i9) {
                            break;
                        }
                        c0518e.f2637case[i30] = 0;
                        while (true) {
                            i10 = i32 + 1;
                            c0518e.smaato(interfaceC2283e, i10);
                            int i33 = c1292e2.ad[i32] & 255;
                            int[] iArr4 = c0518e.f2637case;
                            i11 = iArr4[i30] + i33;
                            iArr4[i30] = i11;
                            if (i33 != 255) {
                                break;
                            } else {
                                i32 = i10;
                            }
                        }
                        i31 += i11;
                        i30++;
                        i32 = i10;
                    }
                    c0518e.f2637case[i9] = ((i2 - c0518e.f2643final) - i32) - i31;
                }
            }
            i3 = 2;
            i4 = 0;
            i5 = 1;
            byte[] bArr6 = c1292e2.ad;
            c0518e.f2636break = c0518e.loadAd((bArr6[i5] & 255) | (bArr6[i4] << 8)) + c0518e.f2665while;
            c0518e.f2657super = (c7657e3.appmetrica == i5 || (i == 163 && (c1292e2.ad[i3] & 128) == 128)) ? 1 : i4;
            c0518e.f2653protected = i3;
            c0518e.f2640default = i4;
        }
        if (i == 163) {
            while (true) {
                int i34 = c0518e.f2640default;
                if (i34 >= c0518e.f2645implements) {
                    c0518e.f2653protected = 0;
                    return;
                } else {
                    c0518e.startapp(c7657e3, ((c0518e.f2640default * c7657e3.purchase) / 1000) + c0518e.f2636break, c0518e.f2657super, c0518e.Signature(interfaceC2283e, c7657e3, c0518e.f2637case[i34], false), 0);
                    c0518e.f2640default++;
                }
            }
        } else {
            while (true) {
                int i35 = c0518e.f2640default;
                if (i35 >= c0518e.f2645implements) {
                    return;
                }
                int[] iArr5 = c0518e.f2637case;
                iArr5[i35] = c0518e.Signature(interfaceC2283e, c7657e3, iArr5[i35], true);
                c0518e.f2640default++;
            }
        }
    }

    @Override // defpackage.InterfaceC17722e
    public SecureRandom adcel() {
        return SecureRandom.getInstance("DEFAULT", (Provider) this.f11540e);
    }

    @Override // defpackage.InterfaceC14168e
    public Object admob(InterfaceC1719e interfaceC1719e, Float f, Float f2, Function1 function1, C11067e c11067e) {
        float floatValue = f.floatValue();
        float floatValue2 = f2.floatValue();
        Object vip = AbstractC2650e.vip(interfaceC1719e, Math.signum(floatValue2) * Math.abs(floatValue), floatValue, AbstractC1284e.ad(0.0f, floatValue2, 28), (InterfaceC2869e) this.f11540e, function1, c11067e);
        return vip == EnumC2821e.f6782e ? vip : (C5768e) vip;
    }

    public boolean ads(C18287e c18287e) {
        int i;
        C11883e c11883e = (C11883e) this.f11540e;
        C16184e c16184e = c18287e.ad;
        Context context = (Context) c11883e.f23815e;
        if (context.checkPermission("android.permission.MEDIA_CONTENT_CONTROL", c16184e.vip, c16184e.metrica) == 0) {
            return true;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(c16184e.ad, 0) != null) {
                if (c11883e.smaato(c16184e, "android.permission.STATUS_BAR_SERVICE") || c11883e.smaato(c16184e, "android.permission.MEDIA_CONTENT_CONTROL") || (i = c16184e.metrica) == 1000 || i == Process.myUid()) {
                    return true;
                }
                String string = Settings.Secure.getString((ContentResolver) c11883e.f23814e, "enabled_notification_listeners");
                if (string != null) {
                    for (String str : string.split(":")) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null && unflattenFromString.getPackageName().equals(c16184e.ad)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC2803e.license("MediaSessionManager", "Package " + c16184e.ad + " doesn't exist");
            return false;
        }
    }

    @Override // defpackage.InterfaceC17722e
    public AlgorithmParameters advert(String str) {
        return AlgorithmParameters.getInstance(str, (Provider) this.f11540e);
    }

    @Override // defpackage.InterfaceC12523e
    public Object amazon(C7169e c7169e) {
        C6815e c6815e = (C6815e) this.f11540e;
        AbstractC4265e.yandex("The result can only set once!", c6815e.f14033e == null);
        c6815e.f14033e = c7169e;
        return "FutureChain[" + c6815e + "]";
    }

    public void applovin(int i, long j) {
        C0518e c0518e = (C0518e) this.f11540e;
        if (i == 240) {
            if (c0518e.applovin) {
                return;
            }
            c0518e.billing(i);
            if (c0518e.f2644goto == -1) {
                c0518e.f2644goto = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (c0518e.applovin) {
                return;
            }
            c0518e.billing(i);
            if (c0518e.f2648interface == -1) {
                c0518e.f2648interface = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw C15125e.ad(null, "ContentEncodingOrder " + j + " not supported");
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw C15125e.ad(null, "ContentEncodingScope " + j + " not supported");
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    c0518e.yandex(i);
                    c0518e.isPro.appmetrica = 2;
                    return;
                }
                if (i2 == 2) {
                    c0518e.yandex(i);
                    c0518e.isPro.appmetrica = 1;
                    return;
                } else if (i2 == 17) {
                    c0518e.yandex(i);
                    c0518e.isPro.appmetrica = 3;
                    return;
                } else if (i2 != 33) {
                    c0518e.yandex(i);
                    c0518e.isPro.appmetrica = -1;
                    return;
                } else {
                    c0518e.yandex(i);
                    c0518e.isPro.appmetrica = 5;
                    return;
                }
            case 136:
                c0518e.yandex(i);
                c0518e.isPro.f15571strictfp = j == 1;
                return;
            case 155:
                c0518e.f2635abstract = c0518e.loadAd(j);
                return;
            case 159:
                c0518e.yandex(i);
                c0518e.isPro.f15554abstract = (int) j;
                return;
            case 176:
                c0518e.yandex(i);
                c0518e.isPro.amazon = (int) j;
                return;
            case 179:
                if (c0518e.applovin) {
                    return;
                }
                c0518e.billing(i);
                c0518e.firebase = c0518e.loadAd(j);
                return;
            case 186:
                c0518e.yandex(i);
                c0518e.isPro.loadAd = (int) j;
                return;
            case 215:
                c0518e.yandex(i);
                c0518e.isPro.license = (int) j;
                return;
            case 231:
                c0518e.f2665while = c0518e.loadAd(j);
                return;
            case 238:
                c0518e.f2650new = (int) j;
                return;
            case 247:
                if (c0518e.applovin) {
                    return;
                }
                c0518e.billing(i);
                c0518e.f2639class = (int) j;
                return;
            case 251:
                c0518e.f2656strictfp = true;
                return;
            case 16871:
                c0518e.yandex(i);
                c0518e.isPro.yandex = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C15125e.ad(null, "ContentCompAlgo " + j + " not supported");
            case 17029:
                if (j < 1 || j > 2) {
                    throw C15125e.ad(null, "DocTypeReadVersion " + j + " not supported");
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C15125e.ad(null, "EBMLReadVersion " + j + " not supported");
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C15125e.ad(null, "ContentEncAlgo " + j + " not supported");
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C15125e.ad(null, "AESSettingsCipherMode " + j + " not supported");
            case 21420:
                c0518e.premium = j + c0518e.remoteconfig;
                return;
            case 21432:
                int i3 = (int) j;
                c0518e.yandex(i);
                if (i3 == 0) {
                    c0518e.isPro.isPro = 0;
                    return;
                }
                if (i3 == 1) {
                    c0518e.isPro.isPro = 2;
                    return;
                } else if (i3 == 3) {
                    c0518e.isPro.isPro = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    c0518e.isPro.isPro = 3;
                    return;
                }
            case 21680:
                c0518e.yandex(i);
                c0518e.isPro.admob = (int) j;
                return;
            case 21682:
                c0518e.yandex(i);
                c0518e.isPro.remoteconfig = (int) j;
                return;
            case 21690:
                c0518e.yandex(i);
                c0518e.isPro.subscription = (int) j;
                return;
            case 21930:
                c0518e.yandex(i);
                c0518e.isPro.f15567new = j == 1;
                return;
            case 21938:
                c0518e.yandex(i);
                C7657e c7657e = c0518e.isPro;
                c7657e.applovin = true;
                c7657e.Signature = (int) j;
                return;
            case 21998:
                c0518e.yandex(i);
                c0518e.isPro.billing = (int) j;
                return;
            case 22186:
                c0518e.yandex(i);
                c0518e.isPro.f15556case = j;
                return;
            case 22203:
                c0518e.yandex(i);
                c0518e.isPro.f15557catch = j;
                return;
            case 25188:
                c0518e.yandex(i);
                c0518e.isPro.f15559default = (int) j;
                return;
            case 30114:
                c0518e.f2652private = j;
                return;
            case 30321:
                c0518e.yandex(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    c0518e.isPro.pro = 0;
                    return;
                }
                if (i4 == 1) {
                    c0518e.isPro.pro = 1;
                    return;
                } else if (i4 == 2) {
                    c0518e.isPro.pro = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    c0518e.isPro.pro = 3;
                    return;
                }
            case 2352003:
                c0518e.yandex(i);
                c0518e.isPro.purchase = (int) j;
                return;
            case 2807729:
                c0518e.pro = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        c0518e.yandex(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            c0518e.isPro.subs = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            c0518e.isPro.subs = 1;
                            return;
                        }
                    case 21946:
                        c0518e.yandex(i);
                        int billing = C14754e.billing((int) j);
                        if (billing != -1) {
                            c0518e.isPro.premium = billing;
                            return;
                        }
                        return;
                    case 21947:
                        c0518e.yandex(i);
                        c0518e.isPro.applovin = true;
                        int purchase = C14754e.purchase((int) j);
                        if (purchase != -1) {
                            c0518e.isPro.ads = purchase;
                            return;
                        }
                        return;
                    case 21948:
                        c0518e.yandex(i);
                        c0518e.isPro.crashlytics = (int) j;
                        return;
                    case 21949:
                        c0518e.yandex(i);
                        c0518e.isPro.firebase = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public void appmetrica(float f, float f2, float f3, float f4, int i) {
        ((C18478e) this.f11540e).m4557this().amazon(f, f2, f3, f4, i);
    }

    @Override // defpackage.InterfaceC17722e
    public Cipher billing(String str) {
        return Cipher.getInstance(str, (Provider) this.f11540e);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [eًؑۜ, java.lang.Object] */
    /* renamed from: class, reason: not valid java name */
    public void m1895class(int i, long j, long j2) {
        C0518e c0518e = (C0518e) this.f11540e;
        c0518e.f2662throws.getClass();
        if (i == 160) {
            c0518e.f2656strictfp = false;
            c0518e.f2652private = 0L;
            return;
        }
        if (i == 174) {
            ?? obj = new Object();
            obj.amazon = -1;
            obj.loadAd = -1;
            obj.Signature = -1;
            obj.admob = -1;
            obj.subscription = -1;
            obj.remoteconfig = 0;
            obj.pro = -1;
            obj.signatures = 0.0f;
            obj.tapsense = 0.0f;
            obj.isVip = 0.0f;
            obj.inmobi = null;
            obj.isPro = -1;
            obj.applovin = false;
            obj.ads = -1;
            obj.premium = -1;
            obj.subs = -1;
            obj.crashlytics = 1000;
            obj.firebase = 200;
            obj.f15558class = -1.0f;
            obj.f15565interface = -1.0f;
            obj.f15562goto = -1.0f;
            obj.f15573this = -1.0f;
            obj.f15566native = -1.0f;
            obj.f15560extends = -1.0f;
            obj.f15574throw = -1.0f;
            obj.f15577while = -1.0f;
            obj.f15576try = -1.0f;
            obj.f15570protected = -1.0f;
            obj.f15554abstract = 1;
            obj.f15559default = -1;
            obj.f15563implements = 8000;
            obj.f15556case = 0L;
            obj.f15557catch = 0L;
            obj.f15572super = false;
            obj.f15571strictfp = true;
            obj.f15569private = "eng";
            c0518e.isPro = obj;
            obj.ad = c0518e.isVip;
            return;
        }
        if (i == 183) {
            if (c0518e.applovin) {
                return;
            }
            c0518e.billing(i);
            c0518e.f2639class = -1;
            c0518e.f2648interface = -1L;
            c0518e.f2644goto = -1L;
            return;
        }
        if (i == 187) {
            if (c0518e.applovin) {
                return;
            }
            c0518e.billing(i);
            c0518e.firebase = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            c0518e.ads = -1;
            c0518e.premium = -1L;
            return;
        }
        if (i == 20533) {
            c0518e.yandex(i);
            c0518e.isPro.startapp = true;
            return;
        }
        if (i == 21968) {
            c0518e.yandex(i);
            c0518e.isPro.applovin = true;
            return;
        }
        if (i == 408125543) {
            long j3 = c0518e.remoteconfig;
            if (j3 != -1 && j3 != j) {
                throw C15125e.ad(null, "Multiple Segment elements not supported");
            }
            c0518e.remoteconfig = j;
            c0518e.subscription = j2;
            return;
        }
        if (i == 475249515) {
            if (c0518e.applovin) {
                return;
            }
            c0518e.crashlytics = true;
        } else if (i == 524531317 && !c0518e.applovin) {
            if (c0518e.license && c0518e.f2642extends != -1) {
                c0518e.f2649native = true;
            } else {
                c0518e.f2662throws.pro(new C5990e(c0518e.tapsense));
                c0518e.applovin = true;
            }
        }
    }

    public void crashlytics(float f, long j) {
        InterfaceC14576e m4557this = ((C18478e) this.f11540e).m4557this();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        m4557this.loadAd(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        m4557this.vip(f);
        m4557this.loadAd(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    @Override // defpackage.InterfaceC17722e
    public Signature createSignature(String str) {
        return Signature.getInstance(str, (Provider) this.f11540e);
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        return ((C17980e) this.f11540e).license(bArr, 0);
    }

    @Override // defpackage.InterfaceC0569e
    /* renamed from: extends */
    public C12948e mo378extends(View view, C12948e c12948e) {
        AppBarLayout appBarLayout = (AppBarLayout) this.f11540e;
        WeakHashMap weakHashMap = AbstractC2016e.ad;
        C12948e c12948e2 = appBarLayout.getFitsSystemWindows() ? c12948e : null;
        if (!Objects.equals(appBarLayout.f760e, c12948e2)) {
            appBarLayout.f760e = c12948e2;
            appBarLayout.setWillNotDraw(!(appBarLayout.f744e != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return c12948e;
    }

    public void firebase(float f, float f2, long j) {
        InterfaceC14576e m4557this = ((C18478e) this.f11540e).m4557this();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        m4557this.loadAd(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        m4557this.ad(f, f2);
        m4557this.loadAd(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        switch (this.f11541e) {
            case 8:
                return new C12894e(11, (Context) ((C5389e) this.f11540e).f11540e, new C7936e(12), new C14595e(12));
            default:
                return this.f11540e;
        }
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        StringBuilder sb = new StringBuilder("Skein-MAC-");
        C17980e c17980e = (C17980e) this.f11540e;
        sb.append(c17980e.f35269e.f12984e * 8);
        sb.append("-");
        sb.append(c17980e.f35265e * 8);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return ((C17980e) this.f11540e).f35265e;
    }

    @Override // defpackage.InterfaceC3518e
    public String getValue(String str) {
        return (String) ((C0409e) this.f11540e).get(str);
    }

    /* renamed from: goto, reason: not valid java name */
    public void m1896goto(C1293e c1293e, Function1 function1) {
        C10845e c10845e = new C10845e(function1);
        C11721e c11721e = (C11721e) ((C5628e) this.f11540e).ad(c1293e, new C2163e(20));
        while (true) {
            Object obj = c11721e._prev;
            if (!(obj instanceof C12405e)) {
                C7954e c7954e = (C7954e) obj;
                if (c7954e._next != c11721e) {
                    c11721e.vip(c7954e);
                }
            }
            C7954e c7954e2 = (C7954e) obj;
            c7954e2.getClass();
            C7954e.f16101e.lazySet(c10845e, c7954e2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C7954e.f16102e;
            atomicReferenceFieldUpdater.lazySet(c10845e, c11721e);
            while (!atomicReferenceFieldUpdater.compareAndSet(c7954e2, c11721e, c10845e)) {
                if (atomicReferenceFieldUpdater.get(c7954e2) != c11721e) {
                    break;
                }
            }
            break;
        }
        while (true) {
            Object obj2 = c11721e._prev;
            if ((obj2 instanceof C12405e) || c10845e._next != c11721e) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C7954e.f16101e;
            while (!atomicReferenceFieldUpdater2.compareAndSet(c11721e, obj2, c10845e)) {
                if (atomicReferenceFieldUpdater2.get(c11721e) != obj2) {
                    break;
                }
            }
            if (c10845e._next instanceof C12405e) {
                c11721e.vip((C7954e) obj2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [eٓۖۙ, java.lang.Object] */
    @Override // defpackage.InterfaceC11306e
    public void init(InterfaceC3894e interfaceC3894e) {
        C14169e c14169e;
        if (interfaceC3894e instanceof C14169e) {
            c14169e = (C14169e) interfaceC3894e;
        } else {
            if (!(interfaceC3894e instanceof C14915e)) {
                throw new IllegalArgumentException(AbstractC8703e.remoteconfig("Invalid parameter passed to Skein MAC init - ", interfaceC3894e));
            }
            Hashtable hashtable = new Hashtable();
            byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
            if (bArr == null) {
                throw new IllegalArgumentException("Parameter value must not be null.");
            }
            hashtable.put(0, bArr);
            ?? obj = new Object();
            obj.f28019e = hashtable;
            c14169e = obj;
        }
        if (((byte[]) c14169e.f28019e.get(0)) == null) {
            throw new IllegalArgumentException("Skein MAC requires a key parameter.");
        }
        ((C17980e) this.f11540e).appmetrica(c14169e);
    }

    @Override // defpackage.InterfaceC14187e
    public void inmobi(IOException iOException) {
        ((C0485e) this.f11540e).amazon(iOException);
    }

    /* renamed from: interface, reason: not valid java name */
    public void m1897interface(int i, String str) {
        C0518e c0518e = (C0518e) this.f11540e;
        if (i == 134) {
            c0518e.yandex(i);
            c0518e.isPro.metrica = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                c0518e.isVip = str.equals("webm");
                return;
            }
            throw C15125e.ad(null, "DocType " + str + " not supported");
        }
        if (i == 21358) {
            c0518e.yandex(i);
            c0518e.isPro.vip = str;
        } else {
            if (i != 2274716) {
                return;
            }
            c0518e.yandex(i);
            c0518e.isPro.f15569private = str;
        }
    }

    public void isPro(float f, float f2, float f3, float f4) {
        C18478e c18478e = (C18478e) this.f11540e;
        InterfaceC14576e m4557this = c18478e.m4557this();
        float intBitsToFloat = Float.intBitsToFloat((int) (c18478e.m4560try() >> 32)) - (f3 + f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (c18478e.m4560try() & 4294967295L)) - (f4 + f2);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) < 0.0f) {
            AbstractC18019e.ad("Width and height must be greater than or equal to zero");
        }
        c18478e.m4533continue(floatToRawIntBits);
        m4557this.loadAd(f, f2);
    }

    public void license(CancellationException cancellationException) {
        C12431e c12431e = (C12431e) this.f11540e;
        int i = c12431e.f24868e;
        InterfaceC1148e[] interfaceC1148eArr = new InterfaceC1148e[i];
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC1148eArr[i2] = ((C8735e) c12431e.f24870e[i2]).vip;
        }
        for (int i3 = 0; i3 < i; i3++) {
            interfaceC1148eArr[i3].ad(cancellationException);
        }
        if (c12431e.f24868e == 0) {
            return;
        }
        AbstractC8889e.metrica("uncancelled requests present");
    }

    @Override // defpackage.InterfaceC3896e
    public C5912e loadAd(C11709e c11709e) {
        C5912e loadAd;
        InterfaceC14956e interfaceC14956e = (InterfaceC14956e) this.f11540e;
        C12816e c12816e = c11709e.ad;
        ArrayList arrayList = new ArrayList();
        AbstractC8439e.appmetrica(interfaceC14956e, c12816e, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC9646e interfaceC9646e = (InterfaceC9646e) it.next();
            if ((interfaceC9646e instanceof C4718e) && (loadAd = ((C4718e) interfaceC9646e).f10104e.loadAd(c11709e)) != null) {
                return loadAd;
            }
        }
        return null;
    }

    @Override // defpackage.InterfaceC17722e
    public MessageDigest metrica(String str) {
        return MessageDigest.getInstance(str, (Provider) this.f11540e);
    }

    @Override // defpackage.InterfaceC17722e
    public CertificateFactory mopub(String str) {
        return CertificateFactory.getInstance(str, (Provider) this.f11540e);
    }

    @Override // io.realm.kotlin.internal.interop.NotificationCallback
    public void onChange(long j) {
        C0912e c0912e = (C0912e) this.f11540e;
        int i = AbstractC6026e.ad;
        c0912e.smaato(new LongPointerWrapper(realmcJNI.realm_clone(j), true));
    }

    public void premium(C1293e c1293e, Object obj) {
        C11721e c11721e = (C11721e) ((C5628e) this.f11540e).vip(c1293e);
        Throwable th = null;
        if (c11721e != null) {
            for (C7954e c7954e = (C7954e) c11721e._next; !AbstractC7890e.billing(c7954e, c11721e); c7954e = AbstractC15603e.metrica(c7954e._next)) {
                if (c7954e instanceof C10845e) {
                    try {
                        Function1 function1 = ((C10845e) c7954e).f21482e;
                        AbstractC9476e.purchase(1, function1);
                        function1.invoke(obj);
                    } catch (Throwable th2) {
                        if (th != null) {
                            AbstractC13362e.license(th, th2);
                        } else {
                            th = th2;
                        }
                    }
                }
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public void purchase() {
        ((AbstractC5830e) this.f11540e).getClass();
    }

    @Override // defpackage.InterfaceC17722e
    public KeyFactory remoteconfig(String str) {
        return KeyFactory.getInstance(str, (Provider) this.f11540e);
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        C17980e c17980e = (C17980e) this.f11540e;
        long[] jArr = c17980e.f35267e;
        long[] jArr2 = c17980e.f35264e;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        c17980e.startapp(48);
    }

    @Override // defpackage.InterfaceC17386e
    public boolean smaato(MenuC8939e menuC8939e) {
        C13631e c13631e = (C13631e) this.f11540e;
        if (menuC8939e == c13631e.f27034e) {
            return false;
        }
        ((SubMenuC1355e) menuC8939e).f4152e.getClass();
        c13631e.getClass();
        InterfaceC17386e interfaceC17386e = c13631e.f27031e;
        if (interfaceC17386e != null) {
            return interfaceC17386e.smaato(menuC8939e);
        }
        return false;
    }

    @Override // defpackage.InterfaceC17722e
    public Mac startapp(String str) {
        return Mac.getInstance(str, (Provider) this.f11540e);
    }

    public void subs() {
        C12431e c12431e = (C12431e) this.f11540e;
        C15926e admob = AbstractC3062e.admob(0, c12431e.f24868e);
        int i = admob.f22523e;
        int i2 = admob.f22522e;
        if (i <= i2) {
            while (true) {
                ((C8735e) c12431e.f24870e[i]).vip.billing(Unit.INSTANCE);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        c12431e.startapp();
    }

    @Override // defpackage.InterfaceC14187e
    public void subscription(C4602e c4602e, C11058e c11058e) {
        ((C0485e) this.f11540e).smaato(c11058e);
    }

    public C15816e tapsense() {
        return new C15816e(24, ((C4993e) this.f11540e).yandex());
    }

    /* renamed from: this, reason: not valid java name */
    public void m1898this(float f, float f2) {
        ((C18478e) this.f11540e).m4557this().loadAd(f, f2);
    }

    public String toString() {
        switch (this.f11541e) {
            case 20:
                StringBuilder sb = new StringBuilder("(PlaylistValidation valid=");
                Set set = (Set) this.f11540e;
                sb.append(set.isEmpty());
                sb.append(" errors=");
                sb.append(set);
                sb.append(")");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte b) {
        C17980e c17980e = (C17980e) this.f11540e;
        byte[] bArr = c17980e.f35268e;
        bArr[0] = b;
        C10379e c10379e = c17980e.f35266e;
        if (c10379e == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        }
        c10379e.m2801break(bArr, 0, 1, c17980e.f35264e);
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte[] bArr, int i, int i2) {
        C17980e c17980e = (C17980e) this.f11540e;
        C10379e c10379e = c17980e.f35266e;
        if (c10379e == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        }
        c10379e.m2801break(bArr, i, i2, c17980e.f35264e);
    }

    @Override // defpackage.InterfaceC17386e
    public void vip(MenuC8939e menuC8939e, boolean z) {
        if (menuC8939e instanceof SubMenuC1355e) {
            ((SubMenuC1355e) menuC8939e).f4151e.mopub().metrica(false);
        }
        InterfaceC17386e interfaceC17386e = ((C13631e) this.f11540e).f27031e;
        if (interfaceC17386e != null) {
            interfaceC17386e.vip(menuC8939e, z);
        }
    }

    public synchronized void yandex() {
        ((SharedPreferences) this.f11540e).edit().clear().commit();
    }
}
