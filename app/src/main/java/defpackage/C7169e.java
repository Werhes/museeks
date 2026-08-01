package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7169e {
    public Object ad;
    public boolean license;
    public C4001e metrica;
    public C9689e vip;

    public final boolean ad(Object obj) {
        this.license = true;
        C9689e c9689e = this.vip;
        boolean z = c9689e != null && c9689e.f19184e.adcel(obj);
        if (z) {
            this.ad = null;
            this.vip = null;
            this.metrica = null;
        }
        return z;
    }

    public final void finalize() {
        C4001e c4001e;
        C9689e c9689e = this.vip;
        if (c9689e != null) {
            C10314e c10314e = c9689e.f19184e;
            if (!c10314e.isDone()) {
                c10314e.mopub(new C3548e("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.ad, 3));
            }
        }
        if (this.license || (c4001e = this.metrica) == null) {
            return;
        }
        c4001e.adcel(null);
    }

    public final boolean metrica(Throwable th) {
        this.license = true;
        C9689e c9689e = this.vip;
        boolean z = c9689e != null && c9689e.f19184e.mopub(th);
        if (z) {
            this.ad = null;
            this.vip = null;
            this.metrica = null;
        }
        return z;
    }

    public final void vip() {
        this.license = true;
        C9689e c9689e = this.vip;
        if (c9689e == null || !c9689e.f19184e.cancel(true)) {
            return;
        }
        this.ad = null;
        this.vip = null;
        this.metrica = null;
    }
}
