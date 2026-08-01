package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۨٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495e implements InterfaceC2994e {
    public final AbstractC9790e ad;
    public int metrica = -1;
    public final InterfaceC2994e vip;

    public C1495e(AbstractC9790e abstractC9790e, InterfaceC2994e interfaceC2994e) {
        this.ad = abstractC9790e;
        this.vip = interfaceC2994e;
    }

    @Override // defpackage.InterfaceC2994e
    public final void ad(Object obj) {
        int i = this.metrica;
        int i2 = this.ad.billing;
        if (i != i2) {
            this.metrica = i2;
            this.vip.ad(obj);
        }
    }
}
