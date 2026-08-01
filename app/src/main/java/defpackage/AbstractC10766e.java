package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10766e {
    public C11106e ad;
    public boolean vip;

    public final void ad() {
        C11106e c11106e = this.ad;
        if (c11106e == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.vip) {
            c11106e.inmobi(this, null);
        }
        C15655e c15655e = (C15655e) c11106e.f22007e;
        C17687e c17687e = (C17687e) c11106e.f22008e;
        if (equals(c15655e.yandex) && -1 == c15655e.billing) {
            AbstractC13388e abstractC13388e = c15655e.purchase;
            if (abstractC13388e == null) {
                abstractC13388e = c15655e.metrica(-1);
            }
            c15655e.purchase = null;
            c15655e.billing = 0;
            c15655e.yandex = null;
            if (abstractC13388e == null) {
                ((C6194e) c17687e.f34647e).ad.run();
            } else {
                abstractC13388e.vip();
            }
            C1615e c1615e = c15655e.ad;
            c1615e.getClass();
            c1615e.smaato(null, C14477e.appmetrica);
        }
        this.vip = false;
    }

    public void vip(boolean z) {
    }
}
