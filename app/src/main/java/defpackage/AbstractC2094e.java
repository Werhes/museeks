package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2094e {
    public static final C8208e ad;

    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip = AbstractC3820e.ad.vip(C5874e.class);
        try {
            interfaceC13984e = AbstractC3820e.ad(C5874e.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        ad = new C8208e("ApplicationPluginRegistry", new C12025e(vip, interfaceC13984e));
    }

    public static final void ad(AbstractC4125e abstractC4125e, AbstractC4125e abstractC4125e2, C6544e c6544e, C4524e c4524e) {
        Object obj;
        List list;
        ArrayList arrayList = abstractC4125e.f9083e;
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C3079e c3079e = next instanceof C3079e ? (C3079e) next : null;
            if (c3079e == null) {
                C15257e c15257e = next instanceof C15257e ? (C15257e) next : null;
                c3079e = c15257e != null ? c15257e.ad : null;
            }
            arrayList2.add(c3079e);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C3079e c3079e2 = (C3079e) it2.next();
            ArrayList arrayList3 = abstractC4125e2.f9083e;
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (next2 instanceof C15257e) {
                    arrayList4.add(next2);
                }
            }
            Iterator it4 = arrayList4.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it4.next();
                    if (AbstractC7890e.billing(((C15257e) obj).ad, c3079e2)) {
                        break;
                    }
                }
            }
            C15257e c15257e2 = (C15257e) obj;
            if (c15257e2 != null) {
                c15257e2.license = true;
                list = c15257e2.metrica;
            } else {
                list = null;
            }
            if (list == null) {
                list = C13664e.f27089e;
            }
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                abstractC4125e.mopub(c3079e2, new C17699e(c6544e, c4524e, (Function3) it5.next(), null));
            }
        }
    }

    public static final Object license(AbstractC4125e abstractC4125e, InterfaceC0619e interfaceC0619e, Function1 function1) {
        if (!(abstractC4125e instanceof C11997e) || !(interfaceC0619e instanceof C6544e)) {
            C5874e metrica = metrica(abstractC4125e);
            Object purchase = metrica.purchase(interfaceC0619e.getKey());
            if (purchase == null) {
                Object vip = interfaceC0619e.vip(abstractC4125e, function1);
                metrica.billing(interfaceC0619e.getKey(), vip);
                return vip;
            }
            if (purchase.equals(interfaceC0619e)) {
                return purchase;
            }
            throw new C2123e(AbstractC4653e.applovin(new StringBuilder("Please make sure that you use unique name for the plugin and don't install it twice. Conflicting application plugin is already installed with the same key as `"), interfaceC0619e.getKey().ad, '`'), 5);
        }
        C11997e c11997e = (C11997e) abstractC4125e;
        C6544e c6544e = (C6544e) interfaceC0619e;
        C5874e metrica2 = metrica(c11997e);
        C8208e c8208e = c6544e.f13466e;
        if (metrica2.purchase(c8208e) != null) {
            throw new C2123e("Please make sure that you use unique name for the plugin and don't install it twice. Plugin `" + c8208e.ad + "` is already installed to the pipeline " + c11997e, 5);
        }
        if (metrica(AbstractC12044e.ad(c11997e)).purchase(c8208e) != null) {
            throw new C2123e("Installing RouteScopedPlugin to application and route is not supported. Consider moving application level install to routing root.", 5);
        }
        C11997e c7000e = c11997e instanceof C7000e ? new C7000e(((C7000e) c11997e).f14338e) : new C11997e(c11997e.f23979e, c11997e.f23980e, c11997e.f25998e, c11997e.f25997e);
        Object vip2 = c6544e.vip(c7000e, function1);
        metrica(c11997e).billing(c8208e, vip2);
        Iterator it = c7000e.f23978e.iterator();
        while (it.hasNext()) {
            vip(c11997e, (C11997e) it.next());
        }
        c11997e.amazon(c7000e);
        C13886e c13886e = c11997e.f25996e;
        C13886e c13886e2 = c11997e.f25995e;
        C13886e c13886e3 = c7000e.f25995e;
        c13886e2.amazon(c13886e3);
        C13886e c13886e4 = c7000e.f25996e;
        c13886e.amazon(c13886e4);
        C4524e c4524e = (C4524e) vip2;
        ad(c11997e, c7000e, c6544e, c4524e);
        ad(c13886e2, c13886e3, c6544e, c4524e);
        ad(c13886e, c13886e4, c6544e, c4524e);
        return vip2;
    }

    public static final C5874e metrica(AbstractC4125e abstractC4125e) {
        return (C5874e) abstractC4125e.f9085e.ad(ad, new C0743e(10));
    }

    public static final void vip(C11997e c11997e, C11997e c11997e2) {
        C11997e admob = c11997e.admob(c11997e2.f23980e);
        Iterator it = c11997e2.f23981e.iterator();
        while (it.hasNext()) {
            admob.f23981e.add((Function2) it.next());
            admob.f23977e = null;
        }
        Iterator it2 = c11997e2.f23978e.iterator();
        while (it2.hasNext()) {
            vip(admob, (C11997e) it2.next());
        }
    }
}
