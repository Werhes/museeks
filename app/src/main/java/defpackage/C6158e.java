package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6158e {
    public static final String adcel;
    public static final String advert;
    public static final String mopub;
    public static final String startapp;
    public static final String yandex;
    public Object ad;
    public long appmetrica;
    public C11541e billing = C11541e.purchase;
    public long license;
    public int metrica;
    public boolean purchase;
    public Object vip;

    static {
        String str = AbstractC9413e.ad;
        yandex = Integer.toString(0, 36);
        startapp = Integer.toString(1, 36);
        adcel = Integer.toString(2, 36);
        mopub = Integer.toString(3, 36);
        advert = Integer.toString(4, 36);
    }

    public final long ad(int i, int i2) {
        C11768e ad = this.billing.ad(i);
        if (ad.vip != -1) {
            return ad.billing[i2];
        }
        return -9223372036854775807L;
    }

    public final int appmetrica(int i, int i2) {
        C11768e ad = this.billing.ad(i);
        if (ad.vip != -1) {
            return ad.purchase[i2];
        }
        return 0;
    }

    public final boolean billing(int i) {
        C11541e c11541e = this.billing;
        int i2 = c11541e.ad;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        C11768e ad = c11541e.ad(i);
        return ad.advert && ad.ad == Long.MIN_VALUE && ad.vip == -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6158e.class.equals(obj.getClass())) {
            C6158e c6158e = (C6158e) obj;
            if (Objects.equals(this.ad, c6158e.ad) && Objects.equals(this.vip, c6158e.vip) && this.metrica == c6158e.metrica && this.license == c6158e.license && this.appmetrica == c6158e.appmetrica && this.purchase == c6158e.purchase && Objects.equals(this.billing, c6158e.billing)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.ad;
        int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.vip;
        int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.metrica) * 31;
        long j = this.license;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.appmetrica;
        return this.billing.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.purchase ? 1 : 0)) * 31);
    }

    public final long license(int i) {
        return this.billing.ad(i).ad;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int metrica(long r15) {
        /*
            r14 = this;
            eِؗؗ r0 = r14.billing
            long r1 = r14.license
            int r3 = r0.ad
            int r4 = r3 + (-1)
            r5 = 1
            int r3 = r3 - r5
            r6 = 0
            r7 = -9223372036854775808
            r9 = -1
            if (r4 != r3) goto L24
            eِٕۥ r3 = r0.ad(r4)
            boolean r10 = r3.advert
            if (r10 == 0) goto L24
            long r10 = r3.ad
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 != 0) goto L24
            int r3 = r3.vip
            if (r3 != r9) goto L24
            r3 = r5
            goto L25
        L24:
            r3 = r6
        L25:
            int r4 = r4 - r3
        L26:
            if (r4 < 0) goto L59
            int r3 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r3 != 0) goto L2d
            goto L59
        L2d:
            eِٕۥ r3 = r0.ad(r4)
            long r10 = r3.ad
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 != 0) goto L52
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 == 0) goto L56
            boolean r12 = r3.advert
            if (r12 == 0) goto L4d
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 != 0) goto L4d
            int r3 = r3.vip
            if (r3 != r9) goto L4d
            goto L56
        L4d:
            int r3 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r3 >= 0) goto L59
            goto L56
        L52:
            int r3 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r3 >= 0) goto L59
        L56:
            int r4 = r4 + (-1)
            goto L26
        L59:
            if (r4 < 0) goto L73
            eِٕۥ r0 = r0.ad(r4)
            int r1 = r0.vip
            if (r1 != r9) goto L64
            goto L72
        L64:
            if (r6 >= r1) goto L73
            int[] r2 = r0.purchase
            r2 = r2[r6]
            if (r2 == 0) goto L72
            if (r2 != r5) goto L6f
            goto L72
        L6f:
            int r6 = r6 + 1
            goto L64
        L72:
            return r4
        L73:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6158e.metrica(long):int");
    }

    public final int purchase(int i) {
        return this.billing.ad(i).ad(-1);
    }

    public final void startapp(Object obj, Object obj2, int i, long j, long j2, C11541e c11541e, boolean z) {
        this.ad = obj;
        this.vip = obj2;
        this.metrica = i;
        this.license = j;
        this.appmetrica = j2;
        this.billing = c11541e;
        this.purchase = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r1 == (-9223372036854775807L)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r0.ad(r8).ad > r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int vip(long r12) {
        /*
            r11 = this;
            eِؗؗ r0 = r11.billing
            long r1 = r11.license
            int r3 = r0.ad
            r4 = -9223372036854775808
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r7 = -1
            if (r6 == 0) goto L54
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r6 == 0) goto L1b
            int r8 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r8 < 0) goto L1b
            goto L54
        L1b:
            int r8 = r0.license
        L1d:
            if (r8 >= r3) goto L45
            eِٕۥ r9 = r0.ad(r8)
            long r9 = r9.ad
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L33
            eِٕۥ r9 = r0.ad(r8)
            long r9 = r9.ad
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 <= 0) goto L42
        L33:
            eِٕۥ r9 = r0.ad(r8)
            int r10 = r9.vip
            if (r10 == r7) goto L45
            int r9 = r9.ad(r7)
            if (r9 >= r10) goto L42
            goto L45
        L42:
            int r8 = r8 + 1
            goto L1d
        L45:
            if (r8 >= r3) goto L54
            if (r6 == 0) goto L53
            eِٕۥ r12 = r0.ad(r8)
            long r12 = r12.ad
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 > 0) goto L54
        L53:
            return r8
        L54:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6158e.vip(long):int");
    }

    public final boolean yandex(int i) {
        return this.billing.ad(i).mopub;
    }
}
