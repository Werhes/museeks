package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8988e {
    public final C0560e ad = new C0560e();

    public C8988e() {
    }

    public C8988e(C0731e c0731e) {
        C14240e c14240e = new C14240e(this);
        c0731e.getClass();
        ((C0560e) c0731e.f3025e).purchase(AbstractC10468e.ad, new C9770e(c0731e, c14240e));
    }

    public final void ad(Exception exc) {
        this.ad.Signature(exc);
    }

    public final void license(Object obj) {
        this.ad.loadAd(obj);
    }

    public final boolean metrica(Exception exc) {
        C0560e c0560e = this.ad;
        c0560e.getClass();
        AbstractC9528e.adcel(exc, "Exception must not be null");
        synchronized (c0560e.ad) {
            try {
                if (c0560e.metrica) {
                    return false;
                }
                c0560e.metrica = true;
                c0560e.purchase = exc;
                c0560e.vip.firebase(c0560e);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void vip(Object obj) {
        this.ad.amazon(obj);
    }
}
