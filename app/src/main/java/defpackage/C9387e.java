package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9387e implements Comparator {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final ArrayList f18645e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static C9387e f18646e;

    static {
        ArrayList arrayList = new ArrayList();
        f18645e = arrayList;
        AbstractC8703e.subs(arrayList, "UFID", "TIT2", "TPE1", "TALB");
        AbstractC8703e.subs(arrayList, "TORY", "TCON", "TCOM", "TPE3");
        AbstractC8703e.subs(arrayList, "TIT1", "TRCK", "TYER", "TDAT");
        AbstractC8703e.subs(arrayList, "TIME", "TBPM", "TSRC", "TORY");
        AbstractC8703e.subs(arrayList, "TPE2", "TIT3", "USLT", "TXXX");
        AbstractC8703e.subs(arrayList, "WXXX", "WOAR", "WCOM", "WCOP");
        AbstractC8703e.subs(arrayList, "WOAF", "WORS", "WPAY", "WPUB");
        AbstractC8703e.subs(arrayList, "WCOM", "TEXT", "TMED", "IPLS");
        AbstractC8703e.subs(arrayList, "TLAN", "TSOT", "TDLY", "PCNT");
        AbstractC8703e.subs(arrayList, "POPM", "TPUB", "TSO2", "TSOC");
        AbstractC8703e.subs(arrayList, "TCMP", "TSOT", "TSOP", "TSOA");
        AbstractC8703e.subs(arrayList, "XSOT", "XSOP", "XSOA", "TSO2");
        AbstractC8703e.subs(arrayList, "TSOC", "COMM", "TRDA", "COMR");
        AbstractC8703e.subs(arrayList, "TCOP", "TENC", "ENCR", "EQUA");
        AbstractC8703e.subs(arrayList, "ETCO", "TOWN", "TFLT", "GRID");
        AbstractC8703e.subs(arrayList, "TSSE", "TKEY", "TLEN", "LINK");
        AbstractC8703e.subs(arrayList, "TSIZ", "MLLT", "TOPE", "TOFN");
        AbstractC8703e.subs(arrayList, "TOLY", "TOAL", "OWNE", "POSS");
        AbstractC8703e.subs(arrayList, "TRSN", "TRSO", "RBUF", "TPE4");
        AbstractC8703e.subs(arrayList, "RVRB", "TPOS", "SYLT", "SYTC");
        AbstractC8703e.subs(arrayList, "USER", "APIC", "PRIV", "MCDI");
        arrayList.add("AENC");
        arrayList.add("GEOB");
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        ArrayList arrayList = f18645e;
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
        return obj instanceof C9387e;
    }
}
