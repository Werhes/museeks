package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0080e extends AbstractC10596e {
    public final C11501e purchase;

    public C0080e(AbstractC6690e abstractC6690e) {
        super(abstractC6690e);
        this.purchase = new C11501e();
    }

    @Override // defpackage.AbstractC10596e, defpackage.AbstractC6690e
    public final C6158e purchase(int i, C6158e c6158e, boolean z) {
        AbstractC6690e abstractC6690e = this.appmetrica;
        C6158e purchase = abstractC6690e.purchase(i, c6158e, z);
        if (abstractC6690e.smaato(purchase.metrica, this.purchase, 0L).ad()) {
            purchase.startapp(c6158e.ad, c6158e.vip, c6158e.metrica, c6158e.license, c6158e.appmetrica, C11541e.purchase, true);
            return purchase;
        }
        purchase.purchase = true;
        return purchase;
    }
}
