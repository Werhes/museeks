package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2407e implements InterfaceC1719e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C2407e(Object obj, Object obj2, int i) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
    }

    @Override // defpackage.InterfaceC1719e
    public final float ad(float f) {
        switch (this.ad) {
            case 0:
                C9570e c9570e = (C9570e) this.vip;
                float adcel = c9570e.f19003e.adcel(f);
                float purchase = adcel - ((C2616e) c9570e.f19003e.startapp).purchase();
                ((C5624e) this.metrica).ad(adcel, 0.0f);
                return purchase;
            case 1:
                C11950e c11950e = (C11950e) this.vip;
                if (Math.abs(f) == 0.0f || ((Boolean) c11950e.yandex.invoke()).booleanValue()) {
                    return c11950e.license(c11950e.billing(((C3593e) this.metrica).ad(2, c11950e.appmetrica(c11950e.yandex(f)))));
                }
                throw new AbstractC4233e("The fling animation was cancelled", 0);
            default:
                C14995e c14995e = ((C3229e) this.vip).purchase;
                float vip = AbstractC3062e.vip((Float.isNaN(((C2616e) c14995e.startapp).purchase()) ? 0.0f : ((C2616e) c14995e.startapp).purchase()) + f, c14995e.startapp().appmetrica(), c14995e.startapp().license());
                float purchase2 = vip - ((C2616e) c14995e.startapp).purchase();
                ((C5624e) this.metrica).ad(vip, 0.0f);
                return purchase2;
        }
    }
}
