package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٝٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13388e {
    public final AbstractC7255e ad;
    public C11106e metrica;
    public boolean vip;

    public AbstractC13388e(AbstractC7255e abstractC7255e, boolean z) {
        this.ad = abstractC7255e;
        this.vip = z;
    }

    public abstract void ad();

    public final void appmetrica() {
        C11106e c11106e = this.metrica;
        if (c11106e == null || !((LinkedHashSet) c11106e.f22009e).remove(this)) {
            return;
        }
        C15655e c15655e = (C15655e) c11106e.f22007e;
        if (equals(c15655e.purchase)) {
            if (c15655e.billing == -1) {
                ad();
            }
            c15655e.purchase = null;
            c15655e.billing = 0;
            c15655e.yandex = null;
        }
        c15655e.license.remove(this);
        c15655e.appmetrica.remove(this);
        this.metrica = null;
        c15655e.vip();
    }

    public abstract void license(C1558e c1558e);

    public abstract void metrica(C1558e c1558e);

    public final void purchase(boolean z) {
        C15655e c15655e;
        if (this.vip == z) {
            return;
        }
        this.vip = z;
        C11106e c11106e = this.metrica;
        if (c11106e == null || (c15655e = (C15655e) c11106e.f22007e) == null) {
            return;
        }
        c15655e.vip();
    }

    public abstract void vip();
}
