package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16816e extends C18357e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C6029e f32953e;

    public C16816e(C6029e c6029e) {
        this.f32953e = c6029e;
    }

    @Override // defpackage.C18357e, defpackage.InterfaceC2268e
    public final InterfaceC2268e remoteconfig(String str, C11467e c11467e, ArrayList arrayList) {
        int hashCode = str.hashCode();
        C6029e c6029e = this.f32953e;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    AbstractC8677e.mopub(0, "getEventName", arrayList);
                    return new C15547e(((C6354e) c6029e.f12698e).ad);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    AbstractC8677e.mopub(0, "getTimestamp", arrayList);
                    return new C6020e(Double.valueOf(((C6354e) c6029e.f12698e).vip));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    AbstractC8677e.mopub(1, "getParamValue", arrayList);
                    String startapp = ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) arrayList.get(0)).startapp();
                    HashMap hashMap = ((C6354e) c6029e.f12698e).metrica;
                    return AbstractC8787e.advert(hashMap.containsKey(startapp) ? hashMap.get(startapp) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    AbstractC8677e.mopub(0, "getParams", arrayList);
                    HashMap hashMap2 = ((C6354e) c6029e.f12698e).metrica;
                    C18357e c18357e = new C18357e();
                    for (String str2 : hashMap2.keySet()) {
                        c18357e.adcel(str2, AbstractC8787e.advert(hashMap2.get(str2)));
                    }
                    return c18357e;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    AbstractC8677e.mopub(2, "setParamValue", arrayList);
                    String startapp2 = ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) arrayList.get(0)).startapp();
                    InterfaceC2268e purchase = ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) arrayList.get(1));
                    C6354e c6354e = (C6354e) c6029e.f12698e;
                    Object remoteconfig = AbstractC8677e.remoteconfig(purchase);
                    HashMap hashMap3 = c6354e.metrica;
                    if (remoteconfig == null) {
                        hashMap3.remove(startapp2);
                        return purchase;
                    }
                    hashMap3.put(startapp2, C6354e.vip(hashMap3.get(startapp2), remoteconfig, startapp2));
                    return purchase;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    AbstractC8677e.mopub(1, "setEventName", arrayList);
                    InterfaceC2268e purchase2 = ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) arrayList.get(0));
                    if (InterfaceC2268e.f5755e.equals(purchase2) || InterfaceC2268e.f5758e.equals(purchase2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    ((C6354e) c6029e.f12698e).ad = purchase2.startapp();
                    return new C15547e(purchase2.startapp());
                }
                break;
        }
        return super.remoteconfig(str, c11467e, arrayList);
    }
}
