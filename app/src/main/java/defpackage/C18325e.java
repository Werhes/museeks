package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18325e implements InterfaceC8376e, InterfaceC18435e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C15024e f35982e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC8850e f35983e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C11997e f35984e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC11129e f35985e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC8376e f35986e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Object f35987e = AbstractC18039e.appmetrica(3, new C13465e(22, this));

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C6029e f35988e;

    public C18325e(InterfaceC8376e interfaceC8376e, C11997e c11997e, InterfaceC8850e interfaceC8850e, C13886e c13886e, C13886e c13886e2, InterfaceC11129e interfaceC11129e) {
        this.f35986e = interfaceC8376e;
        this.f35984e = c11997e;
        this.f35983e = interfaceC8850e;
        this.f35985e = interfaceC11129e;
        this.f35982e = new C15024e(1, this, c13886e, interfaceC8376e.license());
        this.f35988e = new C6029e(1, this, c13886e2, interfaceC8376e.loadAd());
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f35983e;
    }

    @Override // defpackage.InterfaceC6141e
    /* renamed from: extends */
    public final C5033e mo324extends() {
        return this.f35986e.mo324extends();
    }

    @Override // defpackage.InterfaceC6141e
    public final C5874e getAttributes() {
        return this.f35986e.getAttributes();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC6141e
    public final InterfaceC11129e getParameters() {
        return (InterfaceC11129e) this.f35987e.getValue();
    }

    @Override // defpackage.InterfaceC6141e
    public final InterfaceC2861e license() {
        return this.f35982e;
    }

    @Override // defpackage.InterfaceC8376e, defpackage.InterfaceC6141e
    public final InterfaceC13646e license() {
        return this.f35982e;
    }

    @Override // defpackage.InterfaceC8376e, defpackage.InterfaceC6141e
    public final InterfaceC7046e loadAd() {
        return this.f35988e;
    }

    @Override // defpackage.InterfaceC6141e
    public final InterfaceC8559e loadAd() {
        return this.f35988e;
    }

    @Override // defpackage.InterfaceC6141e
    /* renamed from: static */
    public final /* bridge */ Object mo325static(Object obj, C12025e c12025e, AbstractC10731e abstractC10731e) {
        return AbstractC1634e.ad(this, obj, c12025e, abstractC10731e);
    }

    public final String toString() {
        return "RoutingApplicationCall(route=" + this.f35984e + ')';
    }
}
