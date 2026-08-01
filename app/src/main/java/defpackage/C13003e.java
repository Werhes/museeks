package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13003e implements InterfaceC11455e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C3426e f25921e = new C3426e(new C10612e(2), C5949e.f12529e);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long[] f25922e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC17475e f25923e;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13003e(defpackage.C1410e r19) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13003e.<init>(eؒۢۗ):void");
    }

    @Override // defpackage.InterfaceC11455e
    public final long adcel(int i) {
        AbstractC2301e.billing(i < this.f25923e.size());
        return this.f25922e[i];
    }

    @Override // defpackage.InterfaceC11455e
    public final List advert(long j) {
        int purchase = AbstractC9413e.purchase(this.f25922e, j, false);
        if (purchase != -1) {
            return (AbstractC17475e) this.f25923e.get(purchase);
        }
        C2171e c2171e = AbstractC17475e.f34223e;
        return C1410e.f4222e;
    }

    @Override // defpackage.InterfaceC11455e
    public final int loadAd() {
        return this.f25923e.size();
    }

    @Override // defpackage.InterfaceC11455e
    public final int purchase(long j) {
        int vip = AbstractC9413e.vip(this.f25922e, j, false);
        if (vip < this.f25923e.size()) {
            return vip;
        }
        return -1;
    }
}
