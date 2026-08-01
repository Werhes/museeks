package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۥّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4490e implements InterfaceC10218e, Cloneable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public AbstractC3405e f9709e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC3405e f9710e;

    public AbstractC4490e(AbstractC3405e abstractC3405e) {
        this.f9710e = abstractC3405e;
        if (abstractC3405e.loadAd()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f9709e = abstractC3405e.subscription();
    }

    public final AbstractC3405e ad() {
        AbstractC3405e metrica = metrica();
        metrica.getClass();
        if (AbstractC3405e.amazon(metrica, true)) {
            return metrica;
        }
        throw new C8801e();
    }

    public final void appmetrica() {
        if (this.f9709e.loadAd()) {
            return;
        }
        AbstractC3405e subscription = this.f9710e.subscription();
        AbstractC3405e abstractC3405e = this.f9709e;
        C10051e c10051e = C10051e.metrica;
        c10051e.getClass();
        c10051e.ad(subscription.getClass()).ad(subscription, abstractC3405e);
        this.f9709e = subscription;
    }

    public final AbstractC4490e license() {
        AbstractC4490e license = this.f9710e.license();
        license.f9709e = metrica();
        return license;
    }

    public final AbstractC3405e metrica() {
        if (!this.f9709e.loadAd()) {
            return this.f9709e;
        }
        AbstractC3405e abstractC3405e = this.f9709e;
        abstractC3405e.getClass();
        C10051e c10051e = C10051e.metrica;
        c10051e.getClass();
        c10051e.ad(abstractC3405e.getClass()).vip(abstractC3405e);
        abstractC3405e.Signature();
        return this.f9709e;
    }

    public final void purchase(AbstractC3405e abstractC3405e) {
        if (this.f9710e.equals(abstractC3405e)) {
            return;
        }
        appmetrica();
        AbstractC3405e abstractC3405e2 = this.f9709e;
        C10051e c10051e = C10051e.metrica;
        c10051e.getClass();
        c10051e.ad(abstractC3405e2.getClass()).ad(abstractC3405e2, abstractC3405e);
    }
}
