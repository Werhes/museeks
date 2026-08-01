package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16275e {
    public static final C2892e ad = new C2892e(-1372775149, false, new C8580e(12));

    public static final void ad(boolean z, Function2 function2, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-642000585);
        if ((i & 6) == 0) {
            i2 = (c13770e.billing(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function2) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            Object ad2 = AbstractC16233e.ad(c13770e);
            if (ad2 == null) {
                c13770e.m3676strictfp(1512740606);
                ad2 = AbstractC12536e.ad(c13770e);
            } else {
                c13770e.m3676strictfp(1512737723);
            }
            c13770e.Signature(false);
            if (ad2 == null) {
                throw new IllegalStateException("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
            }
            boolean purchase = c13770e.purchase(ad2);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (purchase || m3681throw == c5170e) {
                InterfaceC12760e interfaceC12760e = ad2 instanceof InterfaceC12760e ? (InterfaceC12760e) ad2 : null;
                C11106e metrica = interfaceC12760e != null ? interfaceC12760e.metrica() : null;
                InterfaceC15119e interfaceC15119e = ad2 instanceof InterfaceC15119e ? (InterfaceC15119e) ad2 : null;
                m3681throw = new C7184e(metrica, interfaceC15119e != null ? interfaceC15119e.ad() : null);
                c13770e.m3682throws(m3681throw);
            }
            C7184e c7184e = (C7184e) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = AbstractC17680e.startapp(c13770e);
                c13770e.m3682throws(m3681throw2);
            }
            InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw2;
            long j = c13770e.f27286case;
            boolean purchase2 = c13770e.purchase(c7184e) | c13770e.appmetrica(j);
            Object m3681throw3 = c13770e.m3681throw();
            if (purchase2 || m3681throw3 == c5170e) {
                m3681throw3 = new C10381e(interfaceC18435e, new C17130e(j, ad2));
                c13770e.m3682throws(m3681throw3);
            }
            C10381e c10381e = (C10381e) m3681throw3;
            c13770e.m3676strictfp(-348514256);
            boolean yandex = c13770e.yandex(c10381e) | c13770e.yandex(function2);
            Object m3681throw4 = c13770e.m3681throw();
            if (yandex || m3681throw4 == c5170e) {
                m3681throw4 = new C5565e(c10381e, function2, 1);
                c13770e.m3682throws(m3681throw4);
            }
            AbstractC17680e.purchase((Function0) m3681throw4, c13770e);
            int i3 = i2;
            Boolean valueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean yandex2 = c13770e.yandex(c10381e) | (i4 == 4);
            Object m3681throw5 = c13770e.m3681throw();
            if (yandex2 || m3681throw5 == c5170e) {
                m3681throw5 = new C7144e(c10381e, z, 3);
                c13770e.m3682throws(m3681throw5);
            }
            AbstractC17181e.purchase(valueOf, c10381e, null, (Function1) m3681throw5, c13770e, i4);
            boolean yandex3 = c13770e.yandex(c7184e) | c13770e.yandex(c10381e);
            Object m3681throw6 = c13770e.m3681throw();
            if (yandex3 || m3681throw6 == c5170e) {
                m3681throw6 = new C10869e(c7184e, c10381e, 27);
                c13770e.m3682throws(m3681throw6);
            }
            AbstractC17680e.ad(c7184e, c10381e, (Function1) m3681throw6, c13770e);
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9295e(z, function2, i);
        }
    }

    public static final Object license(C4983e c4983e, long j, CharSequence charSequence, C11123e c11123e, InterfaceC13033e interfaceC13033e, InterfaceC1618e interfaceC1618e, C9077e c9077e) {
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (charSequence != null && vip(charSequence)) {
            Object vip = AbstractC18341e.vip(interfaceC13033e, interfaceC1618e, c9077e);
            return vip == enumC2821e ? vip : Unit.INSTANCE;
        }
        if (j != -1) {
            Object purchase = AbstractC11263e.purchase(interfaceC13033e, interfaceC1618e, j, c9077e);
            return purchase == enumC2821e ? purchase : Unit.INSTANCE;
        }
        if ((c11123e == null || !c11123e.ad) && !(c11123e == null && AbstractC7890e.billing(c4983e, C4983e.billing))) {
            interfaceC1618e.ad(new IllegalStateException("Failed to parse request body: request body length should be specified,\nchunked transfer encoding should be used or\nkeep-alive should be disabled (connection: close)"));
            return Unit.INSTANCE;
        }
        Object purchase2 = AbstractC11263e.purchase(interfaceC13033e, interfaceC1618e, Long.MAX_VALUE, c9077e);
        return purchase2 == enumC2821e ? purchase2 : Unit.INSTANCE;
    }

    public static final LinkedHashMap metrica(List list, C12156e c12156e) {
        HashMap hashMap = new HashMap();
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(list, 10));
        if (appmetrica < 16) {
            appmetrica = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica);
        for (Object obj : list) {
            Object obj2 = c12156e.get(obj);
            Integer num = (Integer) hashMap.get(obj2);
            int intValue = num != null ? num.intValue() + 1 : 0;
            hashMap.put(obj2, Integer.valueOf(intValue));
            linkedHashMap.put(new C11523e(intValue, obj2), obj);
        }
        return linkedHashMap;
    }

    public static final boolean vip(CharSequence charSequence) {
        C13935e c13935e = AbstractC7076e.ad;
        boolean z = false;
        if (AbstractC7076e.ad(charSequence, 0, charSequence.length(), "chunked")) {
            return true;
        }
        if (AbstractC7076e.ad(charSequence, 0, charSequence.length(), "identity")) {
            return false;
        }
        Iterator it = AbstractC5304e.m1869private(charSequence, new String[]{","}, 6).iterator();
        while (it.hasNext()) {
            String lowerCase = AbstractC5304e.m1855const((String) it.next()).toString().toLowerCase(Locale.ROOT);
            if (lowerCase.equals("chunked")) {
                if (z) {
                    throw new IllegalArgumentException("Double-chunked TE is not supported: " + ((Object) charSequence));
                }
                z = true;
            } else if (!lowerCase.equals("identity")) {
                throw new IllegalArgumentException("Unsupported transfer encoding ".concat(lowerCase));
            }
        }
        return z;
    }

    public abstract void appmetrica(int i, int i2, byte[] bArr);
}
