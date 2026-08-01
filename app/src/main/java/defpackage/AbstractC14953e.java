package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۚۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14953e {
    public static volatile C0409e ad;
    public static final C0409e metrica;
    public static final C0409e vip = C0409e.yandex(1, new Object[]{"PIC", "APIC"}, null);

    static {
        C0409e.yandex(1, new Object[]{"APIC", "PIC"}, null);
        metrica = C0409e.yandex(3, new Object[]{"XSOT", "TSOT", "XSOP", "TSOP", "XSOA", "TSOA"}, null);
        Csuper ad2 = AbstractC8507e.ad();
        ad2.mo3904implements("RVAD", "RVA2");
        ad2.mo3904implements("EQUA", "EQU2");
        ad2.mo3904implements("IPLS", "TIPL");
        ad2.mo3904implements("TDAT", "TDRC");
        ad2.mo3904implements("TIME", "TDRC");
        ad2.mo3904implements("TORY", "TDOR");
        ad2.mo3904implements("TRDA", "TDRC");
        ad2.mo3904implements("TYER", "TDRC");
        ad2.smaato();
        Csuper ad3 = AbstractC8507e.ad();
        ad3.mo3904implements("RVA2", "RVAD");
        ad3.mo3904implements("TIPL", "IPLS");
        ad3.mo3904implements("TMOO", "TXXX");
        ad3.mo3904implements("TDOR", "TORY");
        ad3.smaato();
    }

    public static String ad(String str) {
        if (ad == null) {
            synchronized (AbstractC14953e.class) {
                try {
                    if (ad == null) {
                        ad = vip();
                    }
                } finally {
                }
            }
        }
        return (String) ad.get(str);
    }

    public static C0409e vip() {
        Csuper ad2 = AbstractC8507e.ad();
        ad2.mo3904implements("TP2", "TPE2");
        ad2.mo3904implements("TAL", "TALB");
        ad2.mo3904implements("TP1", "TPE1");
        ad2.mo3904implements("CRA", "AENC");
        ad2.mo3904implements("TBP", "TBPM");
        ad2.mo3904implements("COM", "COMM");
        ad2.mo3904implements("TCM", "TCOM");
        ad2.mo3904implements("TPE", "TPE3");
        ad2.mo3904implements("TT1", "TIT1");
        ad2.mo3904implements("TCR", "TCOP");
        ad2.mo3904implements("TEN", "TENC");
        ad2.mo3904implements("EQU", "EQUA");
        ad2.mo3904implements("ETC", "ETCO");
        ad2.mo3904implements("TFT", "TFLT");
        ad2.mo3904implements("GEO", "GEOB");
        ad2.mo3904implements("TCO", "TCON");
        ad2.mo3904implements("TSS", "TSSE");
        ad2.mo3904implements("TKE", "TKEY");
        ad2.mo3904implements("IPL", "IPLS");
        ad2.mo3904implements("TRC", "TSRC");
        ad2.mo3904implements("GP1", "GRP1");
        ad2.mo3904implements("TLA", "TLAN");
        ad2.mo3904implements("TLE", "TLEN");
        ad2.mo3904implements("LNK", "LINK");
        ad2.mo3904implements("TXT", "TEXT");
        ad2.mo3904implements("TMT", "TMED");
        ad2.mo3904implements("MVN", "MVNM");
        ad2.mo3904implements("MVI", "MVIN");
        ad2.mo3904implements("MLL", "MLLT");
        ad2.mo3904implements("MCI", "MCDI");
        ad2.mo3904implements("TOA", "TOPE");
        ad2.mo3904implements("TOF", "TOFN");
        ad2.mo3904implements("TOL", "TOLY");
        ad2.mo3904implements("TOT", "TOAL");
        ad2.mo3904implements("TDY", "TDLY");
        ad2.mo3904implements("CNT", "PCNT");
        ad2.mo3904implements("POP", "POPM");
        ad2.mo3904implements("TPB", "TPUB");
        ad2.mo3904implements("BUF", "RBUF");
        ad2.mo3904implements("RVA", "RVAD");
        ad2.mo3904implements("TP4", "TPE4");
        ad2.mo3904implements("REV", "RVRB");
        ad2.mo3904implements("TPA", "TPOS");
        ad2.mo3904implements("TPS", "TSST");
        ad2.mo3904implements("SLT", "SYLT");
        ad2.mo3904implements("STC", "SYTC");
        ad2.mo3904implements("TDA", "TDAT");
        ad2.mo3904implements("TIM", "TIME");
        ad2.mo3904implements("TT3", "TIT3");
        ad2.mo3904implements("TOR", "TORY");
        ad2.mo3904implements("TRK", "TRCK");
        ad2.mo3904implements("TRD", "TRDA");
        ad2.mo3904implements("TSI", "TSIZ");
        ad2.mo3904implements("TYE", "TYER");
        ad2.mo3904implements("UFI", "UFID");
        ad2.mo3904implements("ULT", "USLT");
        ad2.mo3904implements("WAR", "WOAR");
        ad2.mo3904implements("WCM", "WCOM");
        ad2.mo3904implements("WCP", "WCOP");
        ad2.mo3904implements("WAF", "WOAF");
        ad2.mo3904implements("WRS", "WORS");
        ad2.mo3904implements("WPAY", "WPAY");
        ad2.mo3904implements("WPB", "WPUB");
        ad2.mo3904implements("WAS", "WOAS");
        ad2.mo3904implements("TXX", "TXXX");
        ad2.mo3904implements("WXX", "WXXX");
        ad2.mo3904implements("TT2", "TIT2");
        ad2.mo3904implements("TCP", "TCMP");
        ad2.mo3904implements("TST", "TSOT");
        ad2.mo3904implements("TSP", "TSOP");
        ad2.mo3904implements("TSA", "TSOA");
        ad2.mo3904implements("TS2", "TSO2");
        ad2.mo3904implements("TSC", "TSOC");
        return ad2.mopub(true);
    }
}
