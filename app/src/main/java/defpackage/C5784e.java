package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5784e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public float f12233e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f12234e;

    @Override // defpackage.InterfaceC17303e
    public final int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f12233e) : interfaceC16719e.loadAd(i);
    }

    @Override // defpackage.InterfaceC17303e
    public final int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f12233e) : interfaceC16719e.mo2529while(i);
    }

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final long m1968e(long j, boolean z) {
        int round;
        int yandex = C5602e.yandex(j);
        if (yandex == Integer.MAX_VALUE || (round = Math.round(yandex / this.f12233e)) <= 0) {
            return 0L;
        }
        if (!z || AbstractC10075e.startapp(yandex, j, round)) {
            return (yandex << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    /* renamed from: eّّۚ, reason: contains not printable characters */
    public final long m1969e(long j, boolean z) {
        int startapp = C5602e.startapp(j);
        int round = Math.round(startapp * this.f12233e);
        if (round <= 0) {
            return 0L;
        }
        if (!z || AbstractC10075e.startapp(round, j, startapp)) {
            return (round << 32) | (startapp & 4294967295L);
        }
        return 0L;
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final long m1970e(long j, boolean z) {
        int round;
        int billing = C5602e.billing(j);
        if (billing == Integer.MAX_VALUE || (round = Math.round(billing * this.f12233e)) <= 0) {
            return 0L;
        }
        if (!z || AbstractC10075e.startapp(round, j, billing)) {
            return (round << 32) | (billing & 4294967295L);
        }
        return 0L;
    }

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final long m1971e(long j, boolean z) {
        int adcel = C5602e.adcel(j);
        int round = Math.round(adcel / this.f12233e);
        if (round <= 0) {
            return 0L;
        }
        if (!z || AbstractC10075e.startapp(adcel, j, round)) {
            return (adcel << 32) | (round & 4294967295L);
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (defpackage.C12729e.vip(r5, 0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        if (defpackage.C12729e.vip(r5, 0) == false) goto L53;
     */
    @Override // defpackage.InterfaceC17303e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.InterfaceC17242e license(defpackage.InterfaceC13158e r8, defpackage.InterfaceC16719e r9, long r10) {
        /*
            r7 = this;
            boolean r0 = r7.f12234e
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L67
            long r5 = r7.m1968e(r10, r2)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto L14
            goto Lc0
        L14:
            long r5 = r7.m1970e(r10, r2)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto L20
            goto Lc0
        L20:
            long r5 = r7.m1971e(r10, r2)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto L2c
            goto Lc0
        L2c:
            long r5 = r7.m1969e(r10, r2)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto L38
            goto Lc0
        L38:
            long r5 = r7.m1968e(r10, r1)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto L44
            goto Lc0
        L44:
            long r5 = r7.m1970e(r10, r1)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto L50
            goto Lc0
        L50:
            long r5 = r7.m1971e(r10, r1)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto L5c
            goto Lc0
        L5c:
            long r5 = r7.m1969e(r10, r1)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto Lbf
            goto Lc0
        L67:
            long r5 = r7.m1970e(r10, r2)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto L72
            goto Lc0
        L72:
            long r5 = r7.m1968e(r10, r2)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto L7d
            goto Lc0
        L7d:
            long r5 = r7.m1969e(r10, r2)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto L88
            goto Lc0
        L88:
            long r5 = r7.m1971e(r10, r2)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto L93
            goto Lc0
        L93:
            long r5 = r7.m1970e(r10, r1)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto L9e
            goto Lc0
        L9e:
            long r5 = r7.m1968e(r10, r1)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto La9
            goto Lc0
        La9:
            long r5 = r7.m1969e(r10, r1)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto Lb4
            goto Lc0
        Lb4:
            long r5 = r7.m1971e(r10, r1)
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto Lbf
            goto Lc0
        Lbf:
            r5 = r3
        Lc0:
            boolean r0 = defpackage.C12729e.vip(r5, r3)
            if (r0 != 0) goto Le6
            r10 = 32
            long r10 = r5 >> r10
            int r10 = (int) r10
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r11 = (int) r3
            if (r10 < 0) goto Ld6
            r0 = r2
            goto Ld7
        Ld6:
            r0 = r1
        Ld7:
            if (r11 < 0) goto Lda
            r1 = r2
        Lda:
            r0 = r0 & r1
            if (r0 != 0) goto Le2
            java.lang.String r0 = "width and height must be >= 0"
            defpackage.AbstractC15805e.ad(r0)
        Le2:
            long r10 = defpackage.AbstractC2278e.yandex(r10, r10, r11, r11)
        Le6:
            eؔۚؓ r9 = r9.admob(r10)
            int r10 = r9.f6806e
            int r11 = r9.f6804e
            eؗٔٓ r0 = new eؗٔٓ
            r1 = 1
            r0.<init>(r9, r1)
            eٌۧۘ r9 = defpackage.C9139e.f18290e
            eٗۚ r8 = r8.ads(r10, r11, r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5784e.license(eٍْٕ, eٗؒۛ, long):eٗۚ");
    }

    @Override // defpackage.InterfaceC17303e
    public final int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.f12233e) : interfaceC16719e.metrica(i);
    }

    @Override // defpackage.InterfaceC17303e
    public final int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.f12233e) : interfaceC16719e.smaato(i);
    }
}
