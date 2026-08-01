package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7262e extends AbstractC12834e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C2007e f14861e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC12834e f14862e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C13197e f14863e;

    public C7262e(AbstractC12834e abstractC12834e, C2007e c2007e) {
        this.f14862e = abstractC12834e;
        this.f14861e = c2007e;
    }

    @Override // defpackage.AbstractC12834e
    /* renamed from: eؘؕۥ */
    public final InterfaceC4895e mo1012e() {
        if (this.f14863e == null) {
            this.f14863e = new C13197e(new C0958e(this.f14862e.mo1012e(), this));
        }
        return this.f14863e;
    }

    @Override // defpackage.AbstractC12834e
    public final long license() {
        return this.f14862e.license();
    }

    @Override // defpackage.AbstractC12834e
    public final C14133e purchase() {
        return this.f14862e.purchase();
    }
}
