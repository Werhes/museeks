package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9293e implements InterfaceC9479e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f18518e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4275e f18519e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C1962e f18520e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18521e;

    public /* synthetic */ C9293e(C4275e c4275e, int i, C1962e c1962e, int i2) {
        this.f18521e = i2;
        this.f18519e = c4275e;
        this.f18518e = i;
        this.f18520e = c1962e;
    }

    @Override // defpackage.InterfaceC9479e
    public final void metrica(InterfaceC3001e interfaceC3001e, int i) {
        switch (this.f18521e) {
            case 0:
                C4275e c4275e = this.f18519e;
                BinderC4329e binderC4329e = c4275e.metrica;
                int tapsense = c4275e.tapsense();
                int i2 = this.f18518e;
                C1962e c1962e = this.f18520e;
                if (tapsense >= 2) {
                    interfaceC3001e.mo947e(binderC4329e, i, i2, c1962e.metrica(c4275e.tapsense(), true));
                    return;
                } else {
                    interfaceC3001e.mo973e(binderC4329e, i, i2 + 1, c1962e.metrica(c4275e.tapsense(), true));
                    interfaceC3001e.mo950e(binderC4329e, i, i2);
                    return;
                }
            default:
                C4275e c4275e2 = this.f18519e;
                interfaceC3001e.mo973e(c4275e2.metrica, i, this.f18518e, this.f18520e.metrica(c4275e2.tapsense(), true));
                return;
        }
    }
}
