package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15425e implements Cloneable, InterfaceC5238e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public AbstractC17076e f30493e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC17076e f30494e;

    public AbstractC15425e(AbstractC17076e abstractC17076e) {
        this.f30494e = abstractC17076e;
        if (abstractC17076e.mopub()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f30493e = (AbstractC17076e) abstractC17076e.smaato(4, null);
    }

    @Override // defpackage.InterfaceC5238e
    public final boolean ad() {
        return AbstractC17076e.adcel(this.f30493e, false);
    }

    public final void appmetrica() {
        if (this.f30493e.mopub()) {
            return;
        }
        purchase();
    }

    public final Object clone() {
        AbstractC15425e abstractC15425e = (AbstractC15425e) this.f30494e.smaato(5, null);
        abstractC15425e.f30493e = metrica();
        return abstractC15425e;
    }

    public /* bridge */ AbstractC4291e license() {
        return metrica();
    }

    public AbstractC17076e metrica() {
        if (!this.f30493e.mopub()) {
            return this.f30493e;
        }
        AbstractC17076e abstractC17076e = this.f30493e;
        abstractC17076e.getClass();
        C17792e.metrica.ad(abstractC17076e.getClass()).ad(abstractC17076e);
        abstractC17076e.billing();
        return this.f30493e;
    }

    public void purchase() {
        AbstractC17076e abstractC17076e = (AbstractC17076e) this.f30494e.smaato(4, null);
        C17792e.metrica.ad(abstractC17076e.getClass()).purchase(abstractC17076e, this.f30493e);
        this.f30493e = abstractC17076e;
    }

    public final AbstractC17076e vip() {
        AbstractC17076e metrica = metrica();
        if (AbstractC17076e.adcel(metrica, true)) {
            return metrica;
        }
        throw new C8058e();
    }
}
