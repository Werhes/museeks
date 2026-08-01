package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17327e extends AbstractC16956e {
    public final InterfaceC5372e ad;
    public final C12170e license;
    public final /* synthetic */ int metrica;
    public final InterfaceC5372e vip;

    public C17327e(InterfaceC5372e interfaceC5372e, InterfaceC5372e interfaceC5372e2, byte b) {
        this.ad = interfaceC5372e;
        this.vip = interfaceC5372e2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17327e(InterfaceC5372e interfaceC5372e, InterfaceC5372e interfaceC5372e2, int i) {
        this(interfaceC5372e, interfaceC5372e2, (byte) 0);
        this.metrica = i;
        switch (i) {
            case 1:
                this(interfaceC5372e, interfaceC5372e2, (byte) 0);
                this.license = new C12170e("kotlin.collections.LinkedHashMap", interfaceC5372e.appmetrica(), interfaceC5372e2.appmetrica());
                return;
            default:
                this.license = new C12170e("kotlin.collections.HashMap", interfaceC5372e.appmetrica(), interfaceC5372e2.appmetrica());
                return;
        }
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        int startapp = startapp(obj);
        InterfaceC9998e appmetrica = appmetrica();
        InterfaceC11845e pro = interfaceC5757e.pro(appmetrica, startapp);
        Iterator yandex = yandex(obj);
        int i = 0;
        while (yandex.hasNext()) {
            Map.Entry entry = (Map.Entry) yandex.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            AbstractC15920e abstractC15920e = (AbstractC15920e) pro;
            abstractC15920e.applovin(appmetrica(), i, this.ad, key);
            i += 2;
            abstractC15920e.applovin(appmetrica(), i2, this.vip, value);
        }
        pro.vip(appmetrica);
    }

    @Override // defpackage.AbstractC16956e
    public final Object advert(Object obj) {
        switch (this.metrica) {
            case 0:
                return new HashMap((Map) null);
            default:
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        switch (this.metrica) {
            case 0:
                return this.license;
            default:
                return this.license;
        }
    }

    @Override // defpackage.AbstractC16956e
    public final int billing(Object obj) {
        int size;
        switch (this.metrica) {
            case 0:
                size = ((HashMap) obj).size();
                break;
            default:
                size = ((LinkedHashMap) obj).size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.AbstractC16956e
    public final void mopub(InterfaceC2043e interfaceC2043e, int i, Object obj) {
        Map map = (Map) obj;
        Object subscription = interfaceC2043e.subscription(appmetrica(), i, this.ad, null);
        int yandex = interfaceC2043e.yandex(appmetrica());
        if (yandex != i + 1) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(i, yandex, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean containsKey = map.containsKey(subscription);
        InterfaceC5372e interfaceC5372e = this.vip;
        map.put(subscription, (!containsKey || (interfaceC5372e.appmetrica().appmetrica() instanceof AbstractC5296e)) ? interfaceC2043e.subscription(appmetrica(), yandex, interfaceC5372e, null) : interfaceC2043e.subscription(appmetrica(), yandex, interfaceC5372e, AbstractC10064e.license(subscription, map)));
    }

    @Override // defpackage.AbstractC16956e
    public final Object purchase() {
        switch (this.metrica) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.AbstractC16956e
    public final Object smaato(Object obj) {
        switch (this.metrica) {
            case 0:
                return (HashMap) obj;
            default:
                return (LinkedHashMap) obj;
        }
    }

    @Override // defpackage.AbstractC16956e
    public final int startapp(Object obj) {
        switch (this.metrica) {
            case 0:
                return ((Map) obj).size();
            default:
                return ((Map) obj).size();
        }
    }

    @Override // defpackage.AbstractC16956e
    public final Iterator yandex(Object obj) {
        switch (this.metrica) {
            case 0:
                return ((Map) obj).entrySet().iterator();
            default:
                return ((Map) obj).entrySet().iterator();
        }
    }
}
