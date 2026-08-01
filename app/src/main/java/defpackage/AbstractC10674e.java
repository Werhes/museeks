package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۦۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10674e implements InterfaceC5372e {
    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        InterfaceC5372e purchase = AbstractC5706e.purchase(this, interfaceC5757e, obj);
        InterfaceC9998e appmetrica = appmetrica();
        AbstractC15920e abstractC15920e = (AbstractC15920e) interfaceC5757e.metrica(appmetrica);
        abstractC15920e.ads(appmetrica(), 0, purchase.appmetrica().ad());
        abstractC15920e.applovin(appmetrica(), 1, purchase, obj);
        abstractC15920e.vip(appmetrica);
    }

    public InterfaceC5372e billing(InterfaceC5757e interfaceC5757e, Object obj) {
        C10068e ad = interfaceC5757e.ad();
        InterfaceC7227e yandex = yandex();
        ad.getClass();
        if (yandex.applovin(obj)) {
            AbstractC9476e.adcel(1, null);
        }
        return null;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e appmetrica = appmetrica();
        InterfaceC2043e metrica = interfaceC11754e.metrica(appmetrica);
        Object obj = null;
        String str = null;
        while (true) {
            int yandex = metrica.yandex(appmetrica());
            if (yandex == -1) {
                if (obj == null) {
                    throw new IllegalArgumentException(AbstractC17861e.Signature("Polymorphic value has not been read for class ", str).toString());
                }
                metrica.vip(appmetrica);
                return obj;
            }
            if (yandex == 0) {
                str = metrica.smaato(appmetrica(), yandex);
            } else {
                if (yandex != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(yandex);
                    throw new IllegalArgumentException(sb.toString());
                }
                if (str == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                obj = metrica.subscription(appmetrica(), yandex, AbstractC5706e.appmetrica(this, metrica, str), null);
            }
        }
    }

    public InterfaceC5372e purchase(InterfaceC2043e interfaceC2043e, String str) {
        C10068e ad = interfaceC2043e.ad();
        yandex();
        ad.getClass();
        AbstractC9476e.adcel(1, null);
        return null;
    }

    public abstract InterfaceC7227e yandex();
}
