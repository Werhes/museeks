package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۥۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15091e implements InterfaceC1403e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8050e f29875e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f29876e;

    public C15091e(C8050e c8050e, long j) {
        this.f29875e = c8050e;
        this.f29876e = j;
    }

    @Override // defpackage.InterfaceC1403e
    public final long advert(InterfaceC0043e interfaceC0043e) {
        InterfaceC0043e interfaceC0043e2 = (InterfaceC0043e) this.f29875e.f16353e.getValue();
        if (interfaceC0043e2 != null) {
            return interfaceC0043e.mo207class(interfaceC0043e2, this.f29876e);
        }
        AbstractC8889e.license("Tried to open context menu before the anchor was placed.");
        throw new C14803e(9);
    }

    @Override // defpackage.InterfaceC1403e
    public final C0763e loadAd(InterfaceC0043e interfaceC0043e) {
        return AbstractC18489e.billing(advert(interfaceC0043e), 0L);
    }

    @Override // defpackage.InterfaceC1403e
    /* renamed from: super */
    public final C17828e mo601super() {
        return AbstractC0853e.vip(this.f29875e);
    }
}
