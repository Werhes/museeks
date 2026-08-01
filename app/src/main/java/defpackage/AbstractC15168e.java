package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15168e extends AbstractC16956e {
    public final InterfaceC5372e ad;

    public AbstractC15168e(InterfaceC5372e interfaceC5372e) {
        this.ad = interfaceC5372e;
    }

    @Override // defpackage.InterfaceC5372e
    public void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        int startapp = startapp(obj);
        InterfaceC9998e appmetrica = appmetrica();
        InterfaceC11845e pro = interfaceC5757e.pro(appmetrica, startapp);
        Iterator yandex = yandex(obj);
        for (int i = 0; i < startapp; i++) {
            ((AbstractC15920e) pro).applovin(appmetrica(), i, this.ad, yandex.next());
        }
        pro.vip(appmetrica);
    }

    public abstract void amazon(int i, Object obj, Object obj2);

    @Override // defpackage.AbstractC16956e
    public void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        amazon(i, obj, interfaceC2043e.subscription(appmetrica(), i, this.ad, null));
    }
}
