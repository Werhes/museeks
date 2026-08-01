package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14910e implements InterfaceC14017e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14093e f29544e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29545e;

    public /* synthetic */ C14910e(C14093e c14093e, int i) {
        this.f29545e = i;
        this.f29544e = c14093e;
    }

    @Override // defpackage.InterfaceC14017e
    public final double mopub(double d) {
        switch (this.f29545e) {
            case 0:
                return AbstractC3062e.ad(this.f29544e.mopub.mopub(d), r10.appmetrica, r10.purchase);
            default:
                return this.f29544e.amazon.mopub(AbstractC3062e.ad(d, r0.appmetrica, r0.purchase));
        }
    }
}
