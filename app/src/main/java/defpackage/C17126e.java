package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٛۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17126e implements InterfaceC5823e {
    public final C13713e ad;

    public C17126e(C13713e c13713e) {
        this.ad = c13713e;
    }

    @Override // defpackage.InterfaceC5823e
    public final int ad() {
        return this.ad.billing().advert;
    }

    @Override // defpackage.InterfaceC5823e
    public final int appmetrica() {
        return ((C16330e) this.ad.metrica.f5739e).purchase();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.InterfaceC5823e
    public final boolean license() {
        return !this.ad.billing().smaato.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // defpackage.InterfaceC5823e
    public final int metrica() {
        int i;
        C13713e c13713e = this.ad;
        int i2 = 0;
        if (c13713e.billing().smaato.isEmpty()) {
            return 0;
        }
        C8076e billing = c13713e.billing();
        C8076e c8076e = AbstractC3725e.ad;
        EnumC17426e enumC17426e = billing.signatures;
        long j = billing.amazon;
        EnumC17426e enumC17426e2 = EnumC17426e.f34146e;
        int i3 = enumC17426e == enumC17426e2 ? (int) (j & 4294967295L) : (int) (j >> 32);
        C8076e billing2 = c13713e.billing();
        ?? r4 = billing2.smaato;
        if (!r4.isEmpty()) {
            int size = r4.size();
            int i4 = 0;
            while (i2 < size) {
                C13668e c13668e = (C13668e) r4.get(i2);
                i4 += (int) (billing2.signatures == enumC17426e2 ? c13668e.remoteconfig & 4294967295L : c13668e.remoteconfig >> 32);
                i2++;
            }
            i2 = (i4 / r4.size()) + billing2.remoteconfig;
        }
        if (i2 != 0 && (i = i3 / i2) >= 1) {
            return i;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.InterfaceC5823e
    public final int vip() {
        return ((C13668e) AbstractC13480e.m3570break(this.ad.billing().smaato)).ad;
    }
}
