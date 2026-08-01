package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۤٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6021e extends AbstractC10200e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f12679e = 1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f12680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6021e(C1738e c1738e, C7302e c7302e) {
        super("getValue");
        this.f12680e = c7302e;
    }

    public C6021e(C3432e c3432e) {
        super("internal.logger");
        this.f12680e = c3432e;
        this.f20169e.put("log", new C3917e(this, false, true));
        this.f20169e.put("silent", new C1738e("silent", 1));
        ((AbstractC10200e) this.f20169e.get("silent")).adcel("log", new C3917e(this, true, true));
        this.f20169e.put("unmonitored", new C1738e("unmonitored", 2));
        ((AbstractC10200e) this.f20169e.get("unmonitored")).adcel("log", new C3917e(this, false, false));
    }

    public C6021e(C6029e c6029e) {
        super("internal.eventLogger");
        this.f12680e = c6029e;
    }

    public C6021e(C9271e c9271e) {
        super("internal.registerCallback");
        this.f12680e = c9271e;
    }

    public C6021e(CallableC13061e callableC13061e) {
        super("internal.appMetadata");
        this.f12680e = callableC13061e;
    }

    @Override // defpackage.AbstractC10200e
    public final InterfaceC2268e ad(C11467e c11467e, List list) {
        TreeMap treeMap;
        switch (this.f12679e) {
            case 0:
                AbstractC8677e.mopub(3, this.f20170e, list);
                String startapp = ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) list.get(0)).startapp();
                InterfaceC2268e interfaceC2268e = (InterfaceC2268e) list.get(1);
                C7302e c7302e = (C7302e) c11467e.f23070e;
                long subscription = (long) AbstractC8677e.subscription(c7302e.purchase(c11467e, interfaceC2268e).subscription().doubleValue());
                InterfaceC2268e purchase = c7302e.purchase(c11467e, (InterfaceC2268e) list.get(2));
                HashMap pro = purchase instanceof C18357e ? AbstractC8677e.pro((C18357e) purchase) : new HashMap();
                C6029e c6029e = (C6029e) this.f12680e;
                c6029e.getClass();
                HashMap hashMap = new HashMap();
                for (String str : pro.keySet()) {
                    HashMap hashMap2 = ((C6354e) c6029e.f12699e).metrica;
                    hashMap.put(str, C6354e.vip(hashMap2.containsKey(str) ? hashMap2.get(str) : null, pro.get(str), str));
                }
                ((ArrayList) c6029e.f12700e).add(new C6354e(startapp, subscription, hashMap));
                return InterfaceC2268e.f5755e;
            case 1:
                AbstractC8677e.mopub(2, "getValue", list);
                InterfaceC2268e purchase2 = ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) list.get(0));
                InterfaceC2268e purchase3 = ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) list.get(1));
                String startapp2 = purchase2.startapp();
                C7302e c7302e2 = (C7302e) this.f12680e;
                Map map = (Map) ((C10961e) c7302e2.f14915e).f21705e.get((String) c7302e2.f14916e);
                String str2 = (map == null || !map.containsKey(startapp2)) ? null : (String) map.get(startapp2);
                return str2 != null ? new C15547e(str2) : purchase3;
            case 2:
                return InterfaceC2268e.f5755e;
            case 3:
                try {
                    return AbstractC8787e.advert(((CallableC13061e) this.f12680e).call());
                } catch (Exception unused) {
                    return InterfaceC2268e.f5755e;
                }
            default:
                AbstractC8677e.mopub(3, this.f20170e, list);
                ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) list.get(0)).startapp();
                InterfaceC2268e interfaceC2268e2 = (InterfaceC2268e) list.get(1);
                C7302e c7302e3 = (C7302e) c11467e.f23070e;
                InterfaceC2268e purchase4 = c7302e3.purchase(c11467e, interfaceC2268e2);
                if (!(purchase4 instanceof C1105e)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                InterfaceC2268e purchase5 = c7302e3.purchase(c11467e, (InterfaceC2268e) list.get(2));
                if (!(purchase5 instanceof C18357e)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                C18357e c18357e = (C18357e) purchase5;
                HashMap hashMap3 = c18357e.f36035e;
                if (!hashMap3.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String startapp3 = c18357e.billing("type").startapp();
                int admob = hashMap3.containsKey("priority") ? AbstractC8677e.admob(c18357e.billing("priority").subscription().doubleValue()) : 1000;
                C9271e c9271e = (C9271e) this.f12680e;
                C1105e c1105e = (C1105e) purchase4;
                c9271e.getClass();
                if ("create".equals(startapp3)) {
                    treeMap = (TreeMap) c9271e.f18485e;
                } else {
                    if (!"edit".equals(startapp3)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(startapp3)));
                    }
                    treeMap = (TreeMap) c9271e.f18486e;
                }
                if (treeMap.containsKey(Integer.valueOf(admob))) {
                    admob = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(admob), c1105e);
                return InterfaceC2268e.f5755e;
        }
    }
}
