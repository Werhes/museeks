package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2085e {
    public final String ad;
    public boolean appmetrica;
    public final /* synthetic */ C6671e billing;
    public final C18208e license;
    public long metrica;
    public boolean purchase;
    public int vip;

    public C2085e(C6671e c6671e, String str, int i, C18208e c18208e) {
        this.billing = c6671e;
        this.ad = str;
        this.vip = i;
        this.metrica = c18208e == null ? -1L : c18208e.license;
        if (c18208e == null || !c18208e.vip()) {
            return;
        }
        this.license = c18208e;
    }

    public final boolean ad(C18177e c18177e) {
        C18208e c18208e = c18177e.license;
        AbstractC6690e abstractC6690e = c18177e.vip;
        if (c18208e == null) {
            return this.vip != c18177e.metrica;
        }
        long j = this.metrica;
        if (j == -1) {
            return false;
        }
        if (c18208e.license > j) {
            return true;
        }
        C18208e c18208e2 = this.license;
        if (c18208e2 == null) {
            return false;
        }
        int i = c18208e2.vip;
        int vip = abstractC6690e.vip(c18208e.ad);
        int vip2 = abstractC6690e.vip(c18208e2.ad);
        if (c18208e.license < c18208e2.license || vip < vip2) {
            return false;
        }
        if (vip > vip2) {
            return true;
        }
        if (!c18208e.vip()) {
            int i2 = c18208e.appmetrica;
            return i2 == -1 || i2 > i;
        }
        int i3 = c18208e.vip;
        int i4 = c18208e.metrica;
        if (i3 <= i) {
            return i3 == i && i4 > c18208e2.metrica;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.loadAd()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean vip(defpackage.AbstractC6690e r7, defpackage.AbstractC6690e r8) {
        /*
            r6 = this;
            int r0 = r6.vip
            int r1 = r7.loadAd()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.loadAd()
            if (r0 >= r7) goto L11
            goto L36
        L11:
            r0 = r3
            goto L36
        L13:
            eؙۜٛ r1 = r6.billing
            eِؔۨ r4 = r1.ad
            r7.amazon(r0, r4)
            int r0 = r4.amazon
        L1c:
            int r5 = r4.loadAd
            if (r0 > r5) goto L11
            java.lang.Object r5 = r7.advert(r0)
            int r5 = r8.vip(r5)
            if (r5 == r3) goto L33
            eؙؚؔ r7 = r1.vip
            eؙؚؔ r7 = r8.purchase(r5, r7, r2)
            int r0 = r7.metrica
            goto L36
        L33:
            int r0 = r0 + 1
            goto L1c
        L36:
            r6.vip = r0
            if (r0 != r3) goto L3b
            goto L4a
        L3b:
            eَٛ r7 = r6.license
            if (r7 != 0) goto L40
            goto L48
        L40:
            java.lang.Object r7 = r7.ad
            int r7 = r8.vip(r7)
            if (r7 == r3) goto L4a
        L48:
            r7 = 1
            return r7
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2085e.vip(eؙ۠ؐ, eؙ۠ؐ):boolean");
    }
}
