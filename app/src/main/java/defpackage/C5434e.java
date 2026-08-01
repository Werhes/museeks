package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5434e extends AbstractC15425e implements InterfaceC5238e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f11662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5434e(int i, AbstractC17076e abstractC17076e) {
        super(abstractC17076e);
        this.f11662e = i;
    }

    public AbstractC15267e billing() {
        if (!((AbstractC15267e) this.f30493e).mopub()) {
            return (AbstractC15267e) this.f30493e;
        }
        ((AbstractC15267e) this.f30493e).zzb.license();
        return (AbstractC15267e) super.metrica();
    }

    @Override // defpackage.AbstractC15425e
    public /* bridge */ /* synthetic */ AbstractC4291e license() {
        switch (this.f11662e) {
            case 0:
                return billing();
            default:
                return super.license();
        }
    }

    @Override // defpackage.AbstractC15425e
    public /* bridge */ /* synthetic */ AbstractC17076e metrica() {
        switch (this.f11662e) {
            case 0:
                return billing();
            default:
                return super.metrica();
        }
    }

    @Override // defpackage.AbstractC15425e
    public void purchase() {
        switch (this.f11662e) {
            case 0:
                super.purchase();
                AbstractC17076e abstractC17076e = this.f30493e;
                if (((AbstractC15267e) abstractC17076e).zzb != C6496e.metrica) {
                    AbstractC15267e abstractC15267e = (AbstractC15267e) abstractC17076e;
                    abstractC15267e.zzb = abstractC15267e.zzb.clone();
                    return;
                }
                return;
            default:
                super.purchase();
                return;
        }
    }
}
