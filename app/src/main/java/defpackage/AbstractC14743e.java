package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14743e {
    public static final ConcurrentHashMap ad = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, eۛٞ, eِّؔ] */
    /* JADX WARN: Type inference failed for: r25v0, types: [eؕۥۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [eٍؚؒ, java.lang.Object] */
    public static final C14723e ad(Class cls) {
        InterfaceC0020e interfaceC0020e;
        InterfaceC2684e interfaceC2684e;
        ClassLoader license = AbstractC2677e.license(cls);
        C0678e c0678e = new C0678e(license);
        ConcurrentHashMap concurrentHashMap = ad;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(c0678e);
        if (weakReference != null) {
            C14723e c14723e = (C14723e) weakReference.get();
            if (c14723e != null) {
                return c14723e;
            }
            concurrentHashMap.remove(c0678e, weakReference);
        }
        C15802e c15802e = C15802e.f31142e;
        C7850e c7850e = new C7850e(21, license);
        C7850e c7850e2 = new C7850e(21, Unit.class.getClassLoader());
        C13935e c13935e = new C13935e(license);
        C4524e c4524e = C4524e.f9810e;
        C17354e c17354e = C17354e.f34040e;
        C6272e c6272e = new C6272e("DeserializationComponentsForJava.ModuleData");
        C9608e c9608e = new C9608e(c6272e);
        C16113e c16113e = new C16113e(C0520e.billing("<" + ("runtime module for " + license) + '>'), c6272e, c9608e, 56);
        InterfaceC17935e interfaceC17935e = c6272e.ad;
        interfaceC17935e.lock();
        try {
            if (c9608e.ad != null) {
                throw new AssertionError("Built-ins module is already set: " + c9608e.ad + " (attempting to reset to " + c16113e + ")");
            }
            c9608e.ad = c16113e;
            interfaceC17935e.unlock();
            c9608e.purchase = new C1245e(c16113e, 0);
            ?? obj = new Object();
            C15816e c15816e = new C15816e(26, false);
            C11980e c11980e = new C11980e(c6272e, c16113e);
            C12575e c12575e = C12575e.f25236e;
            C8662e c8662e = new C8662e(1, 9, 0);
            C11646e c11646e = AbstractC3674e.license;
            C8662e c8662e2 = c11646e.vip;
            EnumC10949e enumC10949e = (c8662e2 == null || c8662e2.f17503e - c8662e.f17503e > 0) ? c11646e.ad : c11646e.metrica;
            C12309e c12309e = new C12309e(new C17907e(enumC10949e, enumC10949e == EnumC10949e.f21678e ? null : enumC10949e), new C17877e(18, c8662e));
            C5438e c5438e = C5438e.f11686e;
            C16628e c16628e = C16628e.f32613e;
            C16728e c16728e = new C16728e();
            C5107e c5107e = C5107e.f10959e;
            C4590e c4590e = C4590e.f9896e;
            C10891e c10891e = new C10891e(c16113e, c11980e);
            C7985e c7985e = new C7985e(c12309e);
            C4590e c4590e2 = C4590e.f9897e;
            C11672e c11672e = new C11672e(new C0136e(2));
            C1400e c1400e = C1400e.f4215e;
            InterfaceC9477e.vip.getClass();
            C0399e c0399e = C14617e.vip;
            C9252e c9252e = new C9252e(new C17241e(c6272e, c13935e, c7850e, obj, c5438e, c4524e, c16628e, c16728e, c17354e, c15816e, c12575e, c5107e, c4590e, c16113e, c10891e, c7985e, c11672e, c1400e, c4590e2, c0399e, c12309e, new C17647e(28)));
            C16308e c16308e = C16308e.billing;
            C18540e c18540e = new C18540e(c7850e, (Object) obj, 26);
            ?? obj2 = new Object();
            obj2.f6388e = c7850e;
            obj2.f6386e = c6272e.vip(new C17877e(0, obj2));
            obj2.f6385e = c16113e;
            obj2.f6387e = c11980e;
            obj2.f6384e = new C16911e(c16113e, c11980e, 5);
            obj2.f6389e = C16308e.billing;
            obj2.f6389e = c16308e;
            List singletonList = Collections.singletonList(C15462e.ad);
            AbstractC13270e abstractC13270e = c16113e.f31691e;
            C9608e c9608e2 = abstractC13270e instanceof C9608e ? (C9608e) abstractC13270e : null;
            C17647e c17647e = C17647e.f34591e;
            if (c9608e2 == null || (interfaceC0020e = c9608e2.m2621native()) == null) {
                interfaceC0020e = C6114e.f12850e;
            }
            if (c9608e2 == null || (interfaceC2684e = c9608e2.m2621native()) == null) {
                interfaceC2684e = C5438e.f11694e;
            }
            C18521e c18521e = C13814e.ad;
            String str = C6272e.license;
            C0678e c0678e2 = c0678e;
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            new ConcurrentHashMap(3, 1.0f, 2);
            C18277e c18277e = new C18277e(c6272e, c16113e, c18540e, obj2, c9252e, c4524e, c17647e, C13664e.f27089e, c11980e, interfaceC0020e, interfaceC2684e, c18521e, c0399e, singletonList, c15802e);
            obj.ad = c18277e;
            c15816e.f31190e = new C12916e(13, c9252e);
            C18214e m2621native = c9608e.m2621native();
            C18214e m2621native2 = c9608e.m2621native();
            String str2 = C6272e.license;
            new ConcurrentHashMap(3, 1.0f, 2);
            C17501e c17501e = new C17501e(c6272e, c7850e2, c16113e);
            C5389e c5389e = new C5389e(10, c17501e);
            C16810e c16810e = C16810e.smaato;
            c17501e.metrica = new C18277e(c6272e, c16113e, c5389e, new C18540e(c16113e, c11980e, c16810e), c17501e, AbstractC6874e.startapp(new C3292e(c6272e, c16113e), new C3942e(c6272e, c16113e)), c11980e, m2621native, m2621native2, c16810e.ad, c0399e, 262144);
            c16113e.f31694e = new C9024e(AbstractC1660e.m670implements(new C16113e[]{c16113e}));
            c16113e.f31697e = new C9355e(AbstractC6874e.startapp(c9252e, c17501e), "CompositeProvider@RuntimeModuleData for " + c16113e);
            ?? obj3 = new Object();
            obj3.f3323e = obj;
            obj3.f3322e = c7850e;
            obj3.f3321e = new ConcurrentHashMap();
            C14723e c14723e2 = new C14723e(c18277e, obj3);
            while (true) {
                C0678e c0678e3 = c0678e2;
                ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(c0678e3, new WeakReference(c14723e2));
                if (weakReference2 == null) {
                    return c14723e2;
                }
                C14723e c14723e3 = (C14723e) weakReference2.get();
                if (c14723e3 != null) {
                    return c14723e3;
                }
                concurrentHashMap3.remove(c0678e3, weakReference2);
                c0678e2 = c0678e3;
                concurrentHashMap2 = concurrentHashMap3;
            }
        } finally {
        }
    }
}
