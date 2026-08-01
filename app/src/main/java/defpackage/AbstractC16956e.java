package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16956e implements InterfaceC5372e {
    public final Object adcel(InterfaceC11754e interfaceC11754e) {
        Object purchase = purchase();
        int billing = billing(purchase);
        InterfaceC2043e metrica = interfaceC11754e.metrica(appmetrica());
        while (true) {
            int yandex = metrica.yandex(appmetrica());
            if (yandex == -1) {
                metrica.vip(appmetrica());
                return smaato(purchase);
            }
            mopub(metrica, yandex + billing, purchase);
        }
    }

    public abstract Object advert(Object obj);

    public abstract int billing(Object obj);

    @Override // defpackage.InterfaceC5372e
    public Object metrica(InterfaceC11754e interfaceC11754e) {
        return adcel(interfaceC11754e);
    }

    public abstract void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj);

    public abstract Object purchase();

    public abstract Object smaato(Object obj);

    public abstract int startapp(Object obj);

    public abstract Iterator yandex(Object obj);
}
