package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5933e {
    public final C3950e ad;
    public C8419e appmetrica;
    public C18196e license;
    public final C10345e metrica;
    public final C12835e purchase;
    public final C9335e vip;

    public C5933e(C3950e c3950e, C9335e c9335e, C10345e c10345e) {
        this.ad = c3950e;
        this.vip = c9335e;
        this.metrica = c10345e;
        AbstractC10747e.ad();
        C11106e vip = C12835e.vip();
        vip.f22006e = C5709e.vip;
        vip.f22008e = C13903e.billing;
        vip.f22007e = C5031e.license;
        vip.f22009e = C1062e.appmetrica;
        this.purchase = vip.pro();
    }

    public static final void ad(C5933e c5933e) {
        C8419e c8419e = c5933e.appmetrica;
        if (c8419e != null) {
            c8419e.Signature(null);
        }
        c5933e.appmetrica = null;
        c5933e.license = null;
    }
}
