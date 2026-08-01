package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۣؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5231e implements InterfaceC14239e, InterfaceC1145e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long f11131e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C8903e[] f11132e = new C8903e[0];

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public InterfaceC1145e f11133e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C10889e f11134e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f11135e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC14239e f11136e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f11137e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f11138e;

    public C5231e(InterfaceC14239e interfaceC14239e, boolean z, long j, long j2, int i) {
        this.f11136e = interfaceC14239e;
        this.f11135e = z ? j : -9223372036854775807L;
        this.f11131e = -9223372036854775807L;
        this.f11138e = j;
        this.f11137e = j2;
    }

    @Override // defpackage.InterfaceC1145e
    public final void ad(InterfaceC14239e interfaceC14239e) {
        if (this.f11134e != null) {
            return;
        }
        InterfaceC1145e interfaceC1145e = this.f11133e;
        interfaceC1145e.getClass();
        interfaceC1145e.ad(this);
    }

    @Override // defpackage.InterfaceC14585e
    public final long admob() {
        long admob = this.f11136e.admob();
        if (admob != Long.MIN_VALUE) {
            long j = this.f11137e;
            if (j == Long.MIN_VALUE || admob < j) {
                return admob;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.InterfaceC14239e
    public final long advert() {
        if (vip()) {
            long j = this.f11135e;
            this.f11135e = -9223372036854775807L;
            this.f11131e = j;
            long advert = advert();
            return advert != -9223372036854775807L ? advert : j;
        }
        long advert2 = this.f11136e.advert();
        if (advert2 != -9223372036854775807L) {
            long j2 = this.f11138e;
            long j3 = this.f11137e;
            long max = Math.max(advert2, j2);
            if (j3 != Long.MIN_VALUE) {
                max = Math.min(max, j3);
            }
            if (max != this.f11131e) {
                this.f11131e = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC14239e
    public final C12931e amazon() {
        return this.f11136e.amazon();
    }

    @Override // defpackage.InterfaceC14239e
    public final long appmetrica(long j, C1198e c1198e) {
        long j2 = this.f11138e;
        if (j == j2) {
            return j2;
        }
        long mopub = AbstractC9413e.mopub(c1198e.ad, 0L, j - j2);
        long j3 = c1198e.vip;
        long j4 = this.f11137e;
        long mopub2 = AbstractC9413e.mopub(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (mopub != c1198e.ad || mopub2 != c1198e.vip) {
            c1198e = new C1198e(mopub, mopub2);
        }
        return this.f11136e.appmetrica(j, c1198e);
    }

    @Override // defpackage.InterfaceC14239e
    public final void billing() {
        C10889e c10889e = this.f11134e;
        if (c10889e != null) {
            throw c10889e;
        }
        this.f11136e.billing();
    }

    @Override // defpackage.InterfaceC14585e
    public final long license() {
        long license = this.f11136e.license();
        if (license != Long.MIN_VALUE) {
            long j = this.f11137e;
            if (j == Long.MIN_VALUE || license < j) {
                return license;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean loadAd(C6576e c6576e) {
        return this.f11136e.loadAd(c6576e);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // defpackage.InterfaceC14239e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long metrica(defpackage.InterfaceC17119e[] r18, boolean[] r19, defpackage.InterfaceC4543e[] r20, boolean[] r21, long r22) {
        /*
            r17 = this;
            r0 = r17
            r8 = r20
            int r1 = r8.length
            eٌۗؒ[] r1 = new defpackage.C8903e[r1]
            r0.f11132e = r1
            int r1 = r8.length
            eؖۨۚ[] r4 = new defpackage.InterfaceC4543e[r1]
            r1 = 0
        Ld:
            int r2 = r8.length
            if (r1 >= r2) goto L23
            eٌۗؒ[] r2 = r0.f11132e
            r3 = r8[r1]
            eٌۗؒ r3 = (defpackage.C8903e) r3
            r2[r1] = r3
            if (r3 == 0) goto L1d
            eؖۨۚ r10 = r3.f17865e
            goto L1e
        L1d:
            r10 = 0
        L1e:
            r4[r1] = r10
            int r1 = r1 + 1
            goto Ld
        L23:
            eٓۛٛ r1 = r0.f11136e
            r2 = r18
            r3 = r19
            r5 = r21
            r6 = r22
            long r11 = r1.metrica(r2, r3, r4, r5, r6)
            long r13 = r0.f11137e
            r3 = 0
            long r9 = java.lang.Math.max(r11, r6)
            r15 = -9223372036854775808
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 == 0) goto L42
            long r9 = java.lang.Math.min(r9, r13)
        L42:
            boolean r5 = r0.vip()
            if (r5 == 0) goto L6e
            int r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r5 >= 0) goto L4d
            goto L69
        L4d:
            r5 = 0
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 == 0) goto L6e
            int r5 = r2.length
            r6 = 0
        L55:
            if (r6 >= r5) goto L6e
            r7 = r2[r6]
            if (r7 == 0) goto L6b
            eٌْٗ r7 = r7.remoteconfig()
            java.lang.String r11 = r7.loadAd
            java.lang.String r7 = r7.mopub
            boolean r7 = defpackage.AbstractC8542e.ad(r11, r7)
            if (r7 != 0) goto L6b
        L69:
            r5 = r9
            goto L73
        L6b:
            int r6 = r6 + 1
            goto L55
        L6e:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L73:
            r0.f11135e = r5
            r1 = 0
        L76:
            int r2 = r8.length
            if (r1 >= r2) goto L9c
            r2 = r4[r1]
            if (r2 != 0) goto L82
            eٌۗؒ[] r2 = r0.f11132e
            r2[r1] = r3
            goto L93
        L82:
            eٌۗؒ[] r5 = r0.f11132e
            r6 = r5[r1]
            if (r6 == 0) goto L8c
            eؖۨۚ r6 = r6.f17865e
            if (r6 == r2) goto L93
        L8c:
            eٌۗؒ r6 = new eٌۗؒ
            r6.<init>(r0, r2)
            r5[r1] = r6
        L93:
            eٌۗؒ[] r2 = r0.f11132e
            r2 = r2[r1]
            r8[r1] = r2
            int r1 = r1 + 1
            goto L76
        L9c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5231e.metrica(eُٗٛ[], boolean[], eؖۨۚ[], boolean[], long):long");
    }

    @Override // defpackage.InterfaceC13344e
    public final void mopub(InterfaceC14585e interfaceC14585e) {
        InterfaceC1145e interfaceC1145e = this.f11133e;
        interfaceC1145e.getClass();
        interfaceC1145e.mopub(this);
    }

    @Override // defpackage.InterfaceC14239e
    public final void smaato(InterfaceC1145e interfaceC1145e, long j) {
        this.f11133e = interfaceC1145e;
        this.f11136e.smaato(this, j);
    }

    @Override // defpackage.InterfaceC14239e
    public final void startapp(long j) {
        this.f11136e.startapp(j);
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean subscription() {
        return this.f11136e.subscription();
    }

    @Override // defpackage.InterfaceC14585e
    public final void tapsense(long j) {
        this.f11136e.tapsense(j);
    }

    public final boolean vip() {
        return this.f11135e != -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC14239e
    public final long yandex(long j) {
        this.f11135e = -9223372036854775807L;
        for (C8903e c8903e : this.f11132e) {
            if (c8903e != null) {
                c8903e.f17864e = false;
            }
        }
        long yandex = this.f11136e.yandex(j);
        long j2 = this.f11138e;
        long j3 = this.f11137e;
        long max = Math.max(yandex, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }
}
