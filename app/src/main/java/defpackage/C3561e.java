package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3561e implements InterfaceC5823e {
    public final C4993e ad;

    public C3561e(C4993e c4993e) {
        this.ad = c4993e;
    }

    @Override // defpackage.InterfaceC5823e
    public final int ad() {
        return this.ad.yandex().amazon;
    }

    @Override // defpackage.InterfaceC5823e
    public final int appmetrica() {
        return Math.max(0, this.ad.appmetrica.vip.purchase());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.InterfaceC5823e
    public final boolean license() {
        return !this.ad.yandex().mopub.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.InterfaceC5823e
    public final int metrica() {
        int i;
        C4993e c4993e = this.ad;
        if (c4993e.yandex().mopub.isEmpty()) {
            return 0;
        }
        C13648e yandex = c4993e.yandex();
        int purchase = (int) (yandex.loadAd == EnumC17426e.f34146e ? yandex.purchase() & 4294967295L : yandex.purchase() >> 32);
        int smaato = AbstractC10003e.smaato(c4993e.yandex());
        if (smaato != 0 && (i = purchase / smaato) >= 1) {
            return i;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.InterfaceC5823e
    public final int vip() {
        return Math.min(ad() - 1, ((C3225e) AbstractC13480e.m3570break(this.ad.yandex().mopub)).ad);
    }
}
