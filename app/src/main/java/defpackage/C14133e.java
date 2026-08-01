package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14133e {
    public final String ad;
    public final String[] metrica;
    public final String vip;
    public static final C10445e license = new C10445e("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final C10445e appmetrica = new C10445e(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public C14133e(String str, String str2, String[] strArr) {
        this.ad = str;
        this.vip = str2;
        this.metrica = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.nio.charset.Charset ad(defpackage.C14133e r6) {
        /*
            java.lang.String[] r6 = r6.metrica
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = 2
            r2 = 0
            int r0 = defpackage.AbstractC4340e.license(r2, r0, r1)
            r1 = 0
            if (r0 < 0) goto L22
        Le:
            r3 = r6[r2]
            java.lang.String r4 = "charset"
            r5 = 1
            boolean r3 = defpackage.AbstractC6507e.loadAd(r3, r4, r5)
            if (r3 == 0) goto L1d
            int r2 = r2 + r5
            r6 = r6[r2]
            goto L23
        L1d:
            if (r2 == r0) goto L22
            int r2 = r2 + 2
            goto Le
        L22:
            r6 = r1
        L23:
            if (r6 != 0) goto L26
            return r1
        L26:
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.IllegalArgumentException -> L2b
            return r6
        L2b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14133e.ad(eَٓٞ):java.nio.charset.Charset");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C14133e) && AbstractC7890e.billing(((C14133e) obj).ad, this.ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return this.ad;
    }
}
