package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12303e {
    public final ArrayList ad = new ArrayList();
    public final /* synthetic */ int vip;

    public C12303e(int i) {
        this.vip = i;
    }

    public static InterfaceC2268e appmetrica(InterfaceC1835e interfaceC1835e, InterfaceC2268e interfaceC2268e, InterfaceC2268e interfaceC2268e2) {
        if (interfaceC2268e instanceof Iterable) {
            return billing(interfaceC1835e, ((Iterable) interfaceC2268e).iterator(), interfaceC2268e2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static InterfaceC2268e billing(InterfaceC1835e interfaceC1835e, Iterator it, InterfaceC2268e interfaceC2268e) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC2268e m3221while = interfaceC1835e.vip((InterfaceC2268e) it.next()).m3221while((C5273e) interfaceC2268e);
                if (m3221while instanceof C8466e) {
                    C8466e c8466e = (C8466e) m3221while;
                    String str = c8466e.f17237e;
                    if ("break".equals(str)) {
                        return InterfaceC2268e.f5755e;
                    }
                    if ("return".equals(str)) {
                        return c8466e;
                    }
                }
            }
        }
        return InterfaceC2268e.f5755e;
    }

    public static boolean license(InterfaceC2268e interfaceC2268e, InterfaceC2268e interfaceC2268e2) {
        if (interfaceC2268e instanceof InterfaceC11320e) {
            interfaceC2268e = new C15547e(interfaceC2268e.startapp());
        }
        if (interfaceC2268e2 instanceof InterfaceC11320e) {
            interfaceC2268e2 = new C15547e(interfaceC2268e2.startapp());
        }
        if ((interfaceC2268e instanceof C15547e) && (interfaceC2268e2 instanceof C15547e)) {
            return ((C15547e) interfaceC2268e).f30696e.compareTo(((C15547e) interfaceC2268e2).f30696e) < 0;
        }
        double doubleValue = interfaceC2268e.subscription().doubleValue();
        double doubleValue2 = interfaceC2268e2.subscription().doubleValue();
        return (Double.isNaN(doubleValue) || Double.isNaN(doubleValue2) || (doubleValue == 0.0d && doubleValue2 == 0.0d) || ((doubleValue == 0.0d && doubleValue2 == 0.0d) || Double.compare(doubleValue, doubleValue2) >= 0)) ? false : true;
    }

    public static C1105e metrica(C11467e c11467e, List list) {
        EnumC16521e enumC16521e = EnumC16521e.ADD;
        AbstractC8677e.advert(2, "FN", list);
        InterfaceC2268e purchase = ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) list.get(0));
        InterfaceC2268e purchase2 = ((C7302e) c11467e.f23070e).purchase(c11467e, (InterfaceC2268e) list.get(1));
        if (!(purchase2 instanceof C5273e)) {
            throw new IllegalArgumentException(AbstractC17861e.Signature("FN requires an ArrayValue of parameter names found ", purchase2.getClass().getCanonicalName()));
        }
        List smaato = ((C5273e) purchase2).smaato();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C1105e(purchase.startapp(), (ArrayList) smaato, arrayList, c11467e);
    }

    public static boolean purchase(InterfaceC2268e interfaceC2268e, InterfaceC2268e interfaceC2268e2) {
        if (interfaceC2268e.getClass().equals(interfaceC2268e2.getClass())) {
            if ((interfaceC2268e instanceof C1058e) || (interfaceC2268e instanceof C12157e)) {
                return true;
            }
            return interfaceC2268e instanceof C6020e ? (Double.isNaN(interfaceC2268e.subscription().doubleValue()) || Double.isNaN(interfaceC2268e2.subscription().doubleValue()) || interfaceC2268e.subscription().doubleValue() != interfaceC2268e2.subscription().doubleValue()) ? false : true : interfaceC2268e instanceof C15547e ? interfaceC2268e.startapp().equals(interfaceC2268e2.startapp()) : interfaceC2268e instanceof C14898e ? interfaceC2268e.yandex().equals(interfaceC2268e2.yandex()) : interfaceC2268e == interfaceC2268e2;
        }
        if (((interfaceC2268e instanceof C1058e) || (interfaceC2268e instanceof C12157e)) && ((interfaceC2268e2 instanceof C1058e) || (interfaceC2268e2 instanceof C12157e))) {
            return true;
        }
        boolean z = interfaceC2268e instanceof C6020e;
        if (z && (interfaceC2268e2 instanceof C15547e)) {
            return purchase(interfaceC2268e, new C6020e(interfaceC2268e2.subscription()));
        }
        boolean z2 = interfaceC2268e instanceof C15547e;
        if ((!z2 || !(interfaceC2268e2 instanceof C6020e)) && !(interfaceC2268e instanceof C14898e)) {
            if (interfaceC2268e2 instanceof C14898e) {
                return purchase(interfaceC2268e, new C6020e(interfaceC2268e2.subscription()));
            }
            if ((z2 || z) && (interfaceC2268e2 instanceof InterfaceC11320e)) {
                return purchase(interfaceC2268e, new C15547e(interfaceC2268e2.startapp()));
            }
            if ((interfaceC2268e instanceof InterfaceC11320e) && ((interfaceC2268e2 instanceof C15547e) || (interfaceC2268e2 instanceof C6020e))) {
                return purchase(new C15547e(interfaceC2268e.startapp()), interfaceC2268e2);
            }
            return false;
        }
        return purchase(new C6020e(interfaceC2268e.subscription()), interfaceC2268e2);
    }

    public static boolean yandex(InterfaceC2268e interfaceC2268e, InterfaceC2268e interfaceC2268e2) {
        if (interfaceC2268e instanceof InterfaceC11320e) {
            interfaceC2268e = new C15547e(interfaceC2268e.startapp());
        }
        if (interfaceC2268e2 instanceof InterfaceC11320e) {
            interfaceC2268e2 = new C15547e(interfaceC2268e2.startapp());
        }
        return (((interfaceC2268e instanceof C15547e) && (interfaceC2268e2 instanceof C15547e)) || !(Double.isNaN(interfaceC2268e.subscription().doubleValue()) || Double.isNaN(interfaceC2268e2.subscription().doubleValue()))) && !license(interfaceC2268e2, interfaceC2268e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:361:0x090e, code lost:
    
        if ("return".equals(r4) != false) goto L303;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:535:0x0c88. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.InterfaceC2268e ad(java.lang.String r12, defpackage.C11467e r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 3858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12303e.ad(java.lang.String, eِؒۜ, java.util.ArrayList):eٜؓۨ");
    }

    public final void vip(String str) {
        if (!this.ad.contains(AbstractC8677e.loadAd(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
