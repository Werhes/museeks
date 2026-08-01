package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10887e implements InterfaceC9479e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ float f21560e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4275e f21561e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21562e;

    public /* synthetic */ C10887e(C4275e c4275e, float f, int i) {
        this.f21562e = i;
        this.f21561e = c4275e;
        this.f21560e = f;
    }

    @Override // defpackage.InterfaceC9479e
    public final void metrica(InterfaceC3001e interfaceC3001e, int i) {
        switch (this.f21562e) {
            case 0:
                interfaceC3001e.mo962e(this.f21561e.metrica, i, this.f21560e);
                return;
            case 1:
                interfaceC3001e.mo963e(this.f21561e.metrica, i, this.f21560e);
                return;
            default:
                C4275e c4275e = this.f21561e;
                BinderC4329e binderC4329e = c4275e.metrica;
                if (c4275e.tapsense() >= 6) {
                    interfaceC3001e.mo996transient(binderC4329e, i);
                    return;
                } else {
                    interfaceC3001e.mo963e(binderC4329e, i, this.f21560e);
                    return;
                }
        }
    }
}
