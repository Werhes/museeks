package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۤٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1437e implements InterfaceC5718e {
    public final Object ad;
    public AbstractC6690e metrica;
    public final C10170e vip;

    public C1437e(Object obj, C10170e c10170e) {
        this.ad = obj;
        this.vip = c10170e;
        this.metrica = c10170e.loadAd;
    }

    @Override // defpackage.InterfaceC5718e
    public final AbstractC6690e metrica() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC5718e
    public final Object vip() {
        return this.ad;
    }
}
