package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٛؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5735e {
    public final Object ad;
    public boolean license;
    public boolean metrica;
    public boolean vip;

    public AbstractC5735e(Object obj) {
        this.ad = obj;
    }

    public void ad() {
        boolean z = this.vip;
        Object obj = this.ad;
        if (z) {
            throw new IllegalStateException(AbstractC1634e.advert(obj, "detach() called when detach() had already been called for: "));
        }
        if (this.metrica) {
            throw new IllegalStateException(AbstractC1634e.advert(obj, "detach() called when sendResult() had already been called for: "));
        }
        if (this.license) {
            throw new IllegalStateException(AbstractC1634e.advert(obj, "detach() called when sendError() had already been called for: "));
        }
        this.vip = true;
    }

    public final void appmetrica() {
        if (this.metrica || this.license) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.ad);
        }
        this.license = true;
        metrica();
    }

    public abstract void license(Object obj);

    public void metrica() {
        throw new UnsupportedOperationException("It is not supported to send an error for " + this.ad);
    }

    public final void purchase(Object obj) {
        if (this.metrica || this.license) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.ad);
        }
        this.metrica = true;
        license(obj);
    }

    public final boolean vip() {
        return this.vip || this.metrica || this.license;
    }
}
