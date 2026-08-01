package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12035e implements InterfaceC4543e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f24061e = -1;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2220e f24062e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f24063e;

    public C12035e(C2220e c2220e, int i) {
        this.f24062e = c2220e;
        this.f24063e = i;
    }

    public final void ad() {
        AbstractC2301e.billing(this.f24061e == -1);
        C2220e c2220e = this.f24062e;
        c2220e.isVip();
        c2220e.f5667e.getClass();
        int[] iArr = c2220e.f5667e;
        int i = this.f24063e;
        int i2 = iArr[i];
        if (i2 == -1) {
            if (c2220e.f5662e.contains(c2220e.f5639e.ad(i))) {
                i2 = -3;
            }
            i2 = -2;
        } else {
            boolean[] zArr = c2220e.f5631e;
            if (!zArr[i2]) {
                zArr[i2] = true;
            }
            i2 = -2;
        }
        this.f24061e = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        if (((defpackage.C8170e) r6.get(0)).purchase() == false) goto L59;
     */
    @Override // defpackage.InterfaceC4543e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int admob(defpackage.C13391e r20, defpackage.C7507e r21, int r22) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12035e.admob(eْٝۜ, eؚ۠ۢ, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if (r6.hasNext() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        r1 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r6.hasNext() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        r6 = r1;
     */
    @Override // defpackage.InterfaceC4543e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int amazon(long r5) {
        /*
            r4 = this;
            boolean r0 = r4.vip()
            if (r0 == 0) goto L5e
            int r0 = r4.f24061e
            eؓۥٓ r1 = r4.f24062e
            boolean r2 = r1.firebase()
            if (r2 == 0) goto L11
            goto L5e
        L11:
            eؚؖۙ[] r2 = r1.f5649e
            r2 = r2[r0]
            boolean r3 = r1.f5671e
            int r5 = r2.signatures(r5, r3)
            java.util.ArrayList r6 = r1.f5629e
            if (r6 == 0) goto L2c
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L26
            goto L42
        L26:
            r1 = 1
            java.lang.Object r6 = defpackage.AbstractC17861e.mopub(r1, r6)
            goto L43
        L2c:
            java.util.Iterator r6 = r6.iterator()
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L42
        L36:
            java.lang.Object r1 = r6.next()
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto L36
            r6 = r1
            goto L43
        L42:
            r6 = 0
        L43:
            eًۘٚ r6 = (defpackage.C8170e) r6
            if (r6 == 0) goto L5a
            boolean r1 = r6.purchase()
            if (r1 != 0) goto L5a
            int r1 = r2.remoteconfig()
            int r6 = r6.appmetrica(r0)
            int r6 = r6 - r1
            int r5 = java.lang.Math.min(r5, r6)
        L5a:
            r2.m4177interface(r5)
            return r5
        L5e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12035e.amazon(long):int");
    }

    @Override // defpackage.InterfaceC4543e
    public final boolean license() {
        if (this.f24061e == -3) {
            return true;
        }
        if (!vip()) {
            return false;
        }
        int i = this.f24061e;
        C2220e c2220e = this.f24062e;
        return !c2220e.firebase() && c2220e.f5649e[i].isVip(c2220e.f5671e);
    }

    @Override // defpackage.InterfaceC4543e
    public final void smaato() {
        int i = this.f24061e;
        C2220e c2220e = this.f24062e;
        if (i == -2) {
            c2220e.isVip();
            throw new IOException(AbstractC5087e.m1746extends("Unable to bind a sample queue to TrackGroup with MIME type ", c2220e.f5639e.ad(this.f24063e).license[0].loadAd, "."));
        }
        if (i == -1) {
            c2220e.m770interface();
            return;
        }
        if (i != -3) {
            c2220e.m770interface();
            C6939e c6939e = c2220e.f5649e[i];
            InterfaceC16612e interfaceC16612e = c6939e.yandex;
            if (interfaceC16612e == null || interfaceC16612e.getState() != 1) {
                return;
            }
            C7923e purchase = c6939e.yandex.purchase();
            purchase.getClass();
            throw purchase;
        }
    }

    public final boolean vip() {
        int i = this.f24061e;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }
}
