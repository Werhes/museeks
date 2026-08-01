package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12999e extends AbstractC1101e {
    public final /* synthetic */ byte[] license;
    public final /* synthetic */ int metrica;
    public final /* synthetic */ C14133e vip;

    public C12999e(int i, C14133e c14133e, byte[] bArr) {
        this.vip = c14133e;
        this.metrica = i;
        this.license = bArr;
    }

    @Override // defpackage.AbstractC1101e
    public final C14133e license() {
        return this.vip;
    }

    @Override // defpackage.AbstractC1101e
    public final long metrica() {
        return this.metrica;
    }

    @Override // defpackage.AbstractC1101e
    public final void mopub(InterfaceC11855e interfaceC11855e) {
        interfaceC11855e.mo2633strictfp(this.metrica, this.license);
    }
}
