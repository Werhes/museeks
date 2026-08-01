package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3918e implements Comparator {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final ArrayList f8750e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static C3918e f8751e;

    static {
        ArrayList arrayList = new ArrayList();
        f8750e = arrayList;
        AbstractC8703e.subs(arrayList, "UFID", "TIT2", "TPE1", "TALB");
        AbstractC8703e.subs(arrayList, "TSOA", "TCON", "TCOM", "TPE3");
        AbstractC8703e.subs(arrayList, "TIT1", "TRCK", "TDRC", "TPE2");
        AbstractC8703e.subs(arrayList, "TBPM", "TSRC", "TSOT", "TIT3");
        AbstractC8703e.subs(arrayList, "USLT", "TXXX", "WXXX", "WOAR");
        AbstractC8703e.subs(arrayList, "WCOM", "WCOP", "WOAF", "WORS");
        AbstractC8703e.subs(arrayList, "WPAY", "WPUB", "WCOM", "TEXT");
        AbstractC8703e.subs(arrayList, "TMED", "TIPL", "TLAN", "TSOP");
        AbstractC8703e.subs(arrayList, "TDLY", "PCNT", "POPM", "TPUB");
        AbstractC8703e.subs(arrayList, "TSO2", "TSOC", "TCMP", "COMM");
        AbstractC8703e.subs(arrayList, "ASPI", "COMR", "TCOP", "TENC");
        AbstractC8703e.subs(arrayList, "TDEN", "ENCR", "EQU2", "ETCO");
        AbstractC8703e.subs(arrayList, "TOWN", "TFLT", "GRID", "TSSE");
        AbstractC8703e.subs(arrayList, "TKEY", "TLEN", "LINK", "TMOO");
        AbstractC8703e.subs(arrayList, "MLLT", "TMCL", "TOPE", "TDOR");
        AbstractC8703e.subs(arrayList, "TOFN", "TOLY", "TOAL", "OWNE");
        AbstractC8703e.subs(arrayList, "POSS", "TPRO", "TRSN", "TRSO");
        AbstractC8703e.subs(arrayList, "RBUF", "RVA2", "TDRL", "TPE4");
        AbstractC8703e.subs(arrayList, "RVRB", "SEEK", "TPOS", "TSST");
        AbstractC8703e.subs(arrayList, "SIGN", "SYLT", "SYTC", "TDTG");
        AbstractC8703e.subs(arrayList, "USER", "APIC", "PRIV", "MCDI");
        arrayList.add("AENC");
        arrayList.add("GEOB");
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        ArrayList arrayList = f8750e;
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
        return obj instanceof C3918e;
    }
}
