package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۡ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3693e implements InterfaceC1272e {
    public boolean metrica;
    public final C8958e ad = new C8958e(0, 1, null, "audio/ac4");
    public final C1292e vip = new C1292e(16384);

    @Override // defpackage.InterfaceC1272e
    public final InterfaceC1272e ad() {
        return this;
    }

    @Override // defpackage.InterfaceC1272e
    public final List appmetrica() {
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    @Override // defpackage.InterfaceC1272e
    public final void license(long j, long j2) {
        this.metrica = false;
        this.ad.vip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // defpackage.InterfaceC1272e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean metrica(defpackage.InterfaceC2283e r15) {
        /*
            r14 = this;
            eؒۙۚ r0 = new eؒۙۚ
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = r2
        L9:
            byte[] r4 = r0.ad
            r5 = r15
            eٟٔؑ r5 = (defpackage.C14446e) r5
            r5.billing(r4, r2, r1, r2)
            r0.m571try(r2)
            int r4 = r0.crashlytics()
            r6 = 4801587(0x494433, float:6.728456E-39)
            r7 = 3
            if (r4 == r6) goto L90
            r5.f28561e = r2
            r5.mopub(r3, r2)
            r15 = r2
            r1 = r3
        L25:
            byte[] r4 = r0.ad
            r6 = 7
            r5.billing(r4, r2, r6, r2)
            r0.m571try(r2)
            int r4 = r0.m565goto()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r4 == r8) goto L4c
            if (r4 == r9) goto L4c
            r5.f28561e = r2
            int r1 = r1 + 1
            int r15 = r1 - r3
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r15 < r4) goto L47
            goto L89
        L47:
            r5.mopub(r1, r2)
            r15 = r2
            goto L25
        L4c:
            r8 = 1
            int r15 = r15 + r8
            r10 = 4
            if (r15 < r10) goto L52
            return r8
        L52:
            byte[] r8 = r0.ad
            int r11 = r8.length
            r12 = -1
            if (r11 >= r6) goto L5a
            r11 = r12
            goto L87
        L5a:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r7]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L81
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L82
        L81:
            r6 = r10
        L82:
            if (r4 != r9) goto L86
            int r6 = r6 + 2
        L86:
            int r11 = r11 + r6
        L87:
            if (r11 != r12) goto L8a
        L89:
            return r2
        L8a:
            int r11 = r11 + (-7)
            r5.mopub(r11, r2)
            goto L25
        L90:
            r0.m568protected(r7)
            int r4 = r0.applovin()
            int r6 = r4 + 10
            int r3 = r3 + r6
            r5.mopub(r4, r2)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3693e.metrica(eَؔؐ):boolean");
    }

    @Override // defpackage.InterfaceC1272e
    public final void purchase(InterfaceC5483e interfaceC5483e) {
        this.ad.appmetrica(interfaceC5483e, new C18316e(0, 1));
        interfaceC5483e.mopub();
        interfaceC5483e.pro(new C5990e(-9223372036854775807L));
    }

    @Override // defpackage.InterfaceC1272e
    public final void release() {
    }

    @Override // defpackage.InterfaceC1272e
    public final int vip(InterfaceC2283e interfaceC2283e, C14829e c14829e) {
        C1292e c1292e = this.vip;
        int read = interfaceC2283e.read(c1292e.ad, 0, 16384);
        if (read == -1) {
            return -1;
        }
        c1292e.m571try(0);
        c1292e.m572while(read);
        boolean z = this.metrica;
        C8958e c8958e = this.ad;
        if (!z) {
            c8958e.loadAd = 0L;
            this.metrica = true;
        }
        c8958e.ad(c1292e);
        return 0;
    }
}
