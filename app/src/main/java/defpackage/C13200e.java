package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13200e implements Comparator {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final ArrayList f26206e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static C13200e f26207e;

    static {
        ArrayList arrayList = new ArrayList();
        f26206e = arrayList;
        AbstractC8703e.subs(arrayList, "UFI", "TT2", "TP1", "TAL");
        AbstractC8703e.subs(arrayList, "TOR", "TCO", "TCM", "TPE");
        AbstractC8703e.subs(arrayList, "TT1", "TRK", "TYE", "TDA");
        AbstractC8703e.subs(arrayList, "TIM", "TBP", "TRC", "TOR");
        AbstractC8703e.subs(arrayList, "TP2", "TT3", "ULT", "TXX");
        AbstractC8703e.subs(arrayList, "WXX", "WAR", "WCM", "WCP");
        AbstractC8703e.subs(arrayList, "WAF", "WRS", "WPAY", "WPB");
        AbstractC8703e.subs(arrayList, "WCM", "TXT", "TMT", "IPL");
        AbstractC8703e.subs(arrayList, "TLA", "TST", "TDY", "CNT");
        AbstractC8703e.subs(arrayList, "POP", "TPB", "TS2", "TSC");
        AbstractC8703e.subs(arrayList, "TCP", "TST", "TSP", "TSA");
        AbstractC8703e.subs(arrayList, "TS2", "TSC", "COM", "TRD");
        AbstractC8703e.subs(arrayList, "TCR", "TEN", "EQU", "ETC");
        AbstractC8703e.subs(arrayList, "TFT", "TSS", "TKE", "TLE");
        AbstractC8703e.subs(arrayList, "LNK", "TSI", "MLL", "TOA");
        AbstractC8703e.subs(arrayList, "TOF", "TOL", "TOT", "BUF");
        AbstractC8703e.subs(arrayList, "TP4", "REV", "TPA", "SLT");
        AbstractC8703e.subs(arrayList, "STC", "PIC", "MCI", "CRA");
        arrayList.add("GEO");
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        ArrayList arrayList = f26206e;
        int indexOf = arrayList.indexOf(str);
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        if (indexOf == -1) {
            indexOf = Integer.MAX_VALUE;
        }
        int indexOf2 = arrayList.indexOf(str2);
        if (indexOf2 != -1) {
            i = indexOf2;
        }
        return indexOf == i ? str.compareTo(str2) : indexOf - i;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof C13200e;
    }
}
