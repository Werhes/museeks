package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۛؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13500e {
    public final String ad;
    public final C13500e adcel;
    public final HashMap advert;
    public final long appmetrica;
    public final String[] billing;
    public final long license;
    public final boolean metrica;
    public final HashMap mopub;
    public final C15904e purchase;
    public ArrayList smaato;
    public final String startapp;
    public final String vip;
    public final String yandex;

    public C13500e(String str, String str2, long j, long j2, C15904e c15904e, String[] strArr, String str3, String str4, C13500e c13500e) {
        this.ad = str;
        this.vip = str2;
        this.startapp = str4;
        this.purchase = c15904e;
        this.billing = strArr;
        this.metrica = str2 != null;
        this.license = j;
        this.appmetrica = j2;
        str3.getClass();
        this.yandex = str3;
        this.adcel = c13500e;
        this.mopub = new HashMap();
        this.advert = new HashMap();
    }

    public static C13500e ad(String str) {
        return new C13500e(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, BuildConfig.FLAVOR, null, null);
    }

    public static SpannableStringBuilder appmetrica(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C4715e c4715e = new C4715e();
            c4715e.ad = new SpannableStringBuilder();
            c4715e.vip = null;
            treeMap.put(str, c4715e);
        }
        CharSequence charSequence = ((C4715e) treeMap.get(str)).ad;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final void billing(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.yandex;
        if (!BuildConfig.FLAVOR.equals(str3)) {
            str = str3;
        }
        if (purchase(j) && "div".equals(this.ad) && (str2 = this.startapp) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < metrica(); i++) {
            vip(i).billing(j, str, arrayList);
        }
    }

    public final void license(TreeSet treeSet, boolean z) {
        String str = this.ad;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.startapp != null)) {
            long j = this.license;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.appmetrica;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.smaato == null) {
            return;
        }
        for (int i = 0; i < this.smaato.size(); i++) {
            ((C13500e) this.smaato.get(i)).license(treeSet, z || equals);
        }
    }

    public final int metrica() {
        ArrayList arrayList = this.smaato;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final boolean purchase(long j) {
        long j2 = this.license;
        long j3 = this.appmetrica;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    public final void startapp(long j, boolean z, String str, TreeMap treeMap) {
        boolean z2;
        TreeMap treeMap2;
        long j2;
        HashMap hashMap = this.mopub;
        hashMap.clear();
        HashMap hashMap2 = this.advert;
        hashMap2.clear();
        String str2 = this.ad;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.yandex;
        String str4 = BuildConfig.FLAVOR.equals(str3) ? str : str3;
        if (this.metrica && z) {
            SpannableStringBuilder appmetrica = appmetrica(str4, treeMap);
            String str5 = this.vip;
            str5.getClass();
            appmetrica.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            appmetrica(str4, treeMap).append('\n');
            return;
        }
        if (purchase(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C4715e) entry.getValue()).ad;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str2);
            for (int i = 0; i < metrica(); i++) {
                C13500e vip = vip(i);
                if (z || equals) {
                    z2 = true;
                    treeMap2 = treeMap;
                    j2 = j;
                } else {
                    z2 = false;
                    j2 = j;
                    treeMap2 = treeMap;
                }
                vip.startapp(j2, z2, str4, treeMap2);
            }
            if (equals) {
                SpannableStringBuilder appmetrica2 = appmetrica(str4, treeMap);
                int length = appmetrica2.length() - 1;
                while (length >= 0 && appmetrica2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && appmetrica2.charAt(length) != '\n') {
                    appmetrica2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C4715e) entry2.getValue()).ad;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public final C13500e vip(int i) {
        ArrayList arrayList = this.smaato;
        if (arrayList != null) {
            return (C13500e) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yandex(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13500e.yandex(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }
}
