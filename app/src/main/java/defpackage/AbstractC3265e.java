package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3265e {
    public static volatile boolean amazon = true;
    public static final C2892e ad = new C2892e(749773641, false, new C2916e(28));
    public static final C2892e vip = new C2892e(-566276152, false, new C2916e(29));
    public static final C2892e metrica = new C2892e(-223385095, false, new C16015e(26));
    public static final C2892e license = new C2892e(-1288352326, false, new C16015e(27));
    public static final C2892e appmetrica = new C2892e(1941647739, false, new C16015e(28));
    public static final C2892e purchase = new C2892e(20151768, false, new C16015e(29));
    public static final C2892e billing = new C2892e(-1044815463, false, new C17240e(0));
    public static final C2892e yandex = new C2892e(-2109782694, false, new C17240e(1));
    public static final C2892e startapp = new C2892e(-530698500, false, new C17240e(2));
    public static final C2892e adcel = new C2892e(571461555, false, new C16015e(24));
    public static final C2892e mopub = new C2892e(-884951500, false, new C16015e(25));
    public static final C0959e advert = new C0959e(1);
    public static final C0611e smaato = new C0611e(1);

    public static C0738e ad(InterfaceC7227e interfaceC7227e, String str) {
        C0738e c0738e;
        HashMap hashMap = C0738e.metrica;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new C0738e(interfaceC7227e, str);
                    hashMap.put(str, obj);
                }
                c0738e = (C0738e) obj;
                if (!AbstractC7890e.billing(c0738e.vip, interfaceC7227e)) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0738e;
    }

    public static C11980e metrica(Set set) {
        C11980e c11980e = new C11980e(1);
        c11980e.f23948e = smaato;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C9492e c9492e = (C9492e) it.next();
            HashMap hashMap = (HashMap) c11980e.f23949e;
            HashMap hashMap2 = (HashMap) c11980e.f23950e;
            AbstractC9835e.advert(c9492e, "key");
            boolean z = c9492e.metrica;
            if (!z) {
                hashMap.remove(c9492e);
                hashMap2.put(c9492e, C11980e.f23946e);
            } else {
                if (!z) {
                    throw new IllegalArgumentException("key must be repeating");
                }
                hashMap2.remove(c9492e);
                hashMap.put(c9492e, C11980e.f23945e);
            }
        }
        return c11980e;
    }

    public static final InterfaceC3314e vip(C5609e c5609e, C13770e c13770e, int i) {
        c13770e.m3676strictfp(-220138742);
        C12575e c12575e = C12575e.f25232e;
        c13770e.m3676strictfp(644836070);
        boolean purchase2 = c13770e.purchase(c5609e) | c13770e.purchase(c12575e);
        Object m3681throw = c13770e.m3681throw();
        Object obj = C2987e.ad;
        if (purchase2 || m3681throw == obj) {
            m3681throw = new C0576e(c5609e.startapp(), c12575e);
            c13770e.m3682throws(m3681throw);
        }
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
        c13770e.Signature(false);
        c13770e.m3676strictfp(644838839);
        boolean yandex2 = c13770e.yandex(c5609e) | c13770e.purchase(interfaceC3314e);
        Object m3681throw2 = c13770e.m3681throw();
        if (yandex2 || m3681throw2 == obj) {
            m3681throw2 = new C6538e(c5609e, interfaceC3314e, 20);
            c13770e.m3682throws(m3681throw2);
        }
        c13770e.Signature(false);
        AbstractC17680e.vip(c5609e, (Function1) m3681throw2, c13770e);
        c13770e.Signature(false);
        return interfaceC3314e;
    }
}
