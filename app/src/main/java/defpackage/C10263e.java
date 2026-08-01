package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10263e implements InterfaceC8526e {
    public final C11787e ad = new C11787e();
    public C3434e vip = C3434e.vip;
    public final C10095e metrica = new C10095e(0);
    public Object license = C13210e.ad;
    public C11380e appmetrica = AbstractC5097e.ad();
    public final C5874e purchase = AbstractC12176e.ad(true);

    @Override // defpackage.InterfaceC8526e
    public final C10095e ad() {
        return this.metrica;
    }

    public final void metrica(C10263e c10263e) {
        this.vip = c10263e.vip;
        this.license = c10263e.license;
        C5874e c5874e = c10263e.purchase;
        vip((C12025e) c5874e.purchase(AbstractC5173e.ad));
        C11787e c11787e = c10263e.ad;
        C11787e c11787e2 = this.ad;
        AbstractC14385e.appmetrica(c11787e2, c11787e);
        c11787e2.yandex = c11787e2.yandex;
        AbstractC12900e.ad(this.metrica, c10263e.metrica);
        for (C8208e c8208e : c5874e.license()) {
            this.purchase.billing(c8208e, c5874e.metrica(c8208e));
        }
    }

    public final void vip(C12025e c12025e) {
        C5874e c5874e = this.purchase;
        if (c12025e != null) {
            c5874e.billing(AbstractC5173e.ad, c12025e);
        } else {
            c5874e.appmetrica().remove(AbstractC5173e.ad);
        }
    }
}
