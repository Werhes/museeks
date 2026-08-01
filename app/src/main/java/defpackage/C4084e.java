package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4084e implements InterfaceC5823e {
    public final C8202e ad;

    public C4084e(C8202e c8202e) {
        this.ad = c8202e;
    }

    @Override // defpackage.InterfaceC5823e
    public final int ad() {
        return this.ad.billing().Signature;
    }

    @Override // defpackage.InterfaceC5823e
    public final int appmetrica() {
        return this.ad.license.vip.purchase();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.InterfaceC5823e
    public final boolean license() {
        return !this.ad.billing().smaato.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.InterfaceC5823e
    public final int metrica() {
        int i;
        boolean z;
        long j;
        C8202e c8202e = this.ad;
        int i2 = 0;
        if (c8202e.billing().smaato.isEmpty()) {
            return 0;
        }
        C17908e billing = c8202e.billing();
        EnumC17426e enumC17426e = billing.admob;
        EnumC17426e enumC17426e2 = EnumC17426e.f34146e;
        int purchase = (int) (enumC17426e == enumC17426e2 ? billing.purchase() & 4294967295L : billing.purchase() >> 32);
        C17908e billing2 = c8202e.billing();
        boolean z2 = billing2.admob == enumC17426e2;
        ?? r8 = billing2.smaato;
        if (!r8.isEmpty()) {
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < r8.size()) {
                int adcel = AbstractC1101e.adcel(z2, billing2, i3);
                if (adcel == -1) {
                    i3++;
                } else {
                    int i6 = i2;
                    while (i3 < r8.size() && AbstractC1101e.adcel(z2, billing2, i3) == adcel) {
                        if (z2) {
                            z = z2;
                            j = ((C6564e) r8.get(i3)).pro & 4294967295L;
                        } else {
                            z = z2;
                            j = ((C6564e) r8.get(i3)).pro >> 32;
                        }
                        i6 = Math.max(i6, (int) j);
                        i3++;
                        z2 = z;
                    }
                    i4 += i6;
                    i5++;
                    z2 = z2;
                    i2 = 0;
                }
            }
            i2 = (i4 / i5) + billing2.remoteconfig;
        }
        if (i2 != 0 && (i = purchase / i2) >= 1) {
            return i;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.InterfaceC5823e
    public final int vip() {
        return ((C6564e) AbstractC13480e.m3570break(this.ad.billing().smaato)).ad;
    }
}
