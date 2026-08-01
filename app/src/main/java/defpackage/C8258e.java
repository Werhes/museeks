package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eً۠٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8258e {
    public final Object ad;
    public C8258e appmetrica;
    public int license;
    public boolean purchase;
    public final C4695e vip;
    public int metrica = -1;
    public final C0576e billing = AbstractC14533e.startapp(null);

    public C8258e(Object obj, C4695e c4695e) {
        this.ad = obj;
        this.vip = c4695e;
    }

    public final C8258e ad() {
        if (this.purchase) {
            AbstractC8889e.metrica("Pin should not be called on an already disposed item ");
        }
        if (this.license == 0) {
            this.vip.f10082e.add(this);
            C8258e c8258e = (C8258e) this.billing.getValue();
            if (c8258e != null) {
                c8258e.ad();
            } else {
                c8258e = null;
            }
            this.appmetrica = c8258e;
        }
        this.license++;
        return this;
    }

    public final void vip() {
        if (this.purchase) {
            return;
        }
        if (this.license <= 0) {
            AbstractC8889e.metrica("Release should only be called once");
        }
        int i = this.license - 1;
        this.license = i;
        if (i == 0) {
            this.vip.f10082e.remove(this);
            C8258e c8258e = this.appmetrica;
            if (c8258e != null) {
                c8258e.vip();
            }
            this.appmetrica = null;
        }
    }
}
