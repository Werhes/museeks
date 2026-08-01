package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14214e extends AbstractC11750e {
    public final AbstractC3743e Signature;
    public final C5363e admob;
    public final C17424e amazon;
    public final long loadAd;
    public final C17651e pro;
    public final C7744e remoteconfig;
    public final C4199e smaato;
    public final C5363e subscription;

    public C14214e(C4199e c4199e, C17424e c17424e) {
        this.smaato = c4199e;
        this.amazon = c17424e;
        AbstractC3743e smaato = ((InterfaceC15288e) c17424e.f34142e).smaato();
        this.Signature = smaato;
        C5363e c5363e = new C5363e(new C5671e(12, this));
        this.admob = c5363e;
        this.subscription = c5363e;
        this.remoteconfig = AbstractC14430e.appmetrica(Boolean.FALSE);
        this.pro = new C17651e(false);
        this.loadAd = ((C10994e) AbstractC5336e.yandex(smaato, new C14641e(2, 11, null))).f21777e;
    }

    /* renamed from: adcel, reason: merged with bridge method [inline-methods] */
    public final C5114e startapp() {
        return (C5114e) this.subscription.getValue();
    }

    public final InterfaceC3477e mopub() {
        return this.admob;
    }
}
