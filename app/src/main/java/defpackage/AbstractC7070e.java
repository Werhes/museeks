package defpackage;

import android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7070e {
    public static final C2892e ad = new C2892e(-1638136831, false, new C14498e(0));
    public static final C2892e vip = new C2892e(-665205696, false, new C14498e(1));

    public static final CancellationException ad(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void appmetrica(C3168e c3168e, C17013e c17013e, C17013e c17013e2, C16911e c16911e, boolean z) {
        C12431e c12431e = (C12431e) c16911e.f33137e;
        int i = c12431e.f24868e;
        if (i > 1) {
            c3168e.m1251e(new C12569e(0, c17013e.f33322e.toString(), c17013e2.f33322e.toString(), c17013e.f33324e, c17013e2.f33324e, 0L, false, 32));
            return;
        }
        if (i == 1) {
            C4085e c4085e = (C4085e) c12431e.f24870e[0];
            long metrica = AbstractC9262e.metrica(c4085e.metrica, c4085e.license);
            C4085e c4085e2 = (C4085e) ((C12431e) c16911e.f33137e).f24870e[0];
            long metrica2 = AbstractC9262e.metrica(c4085e2.ad, c4085e2.vip);
            if (C12347e.license(metrica) && C12347e.license(metrica2)) {
                return;
            }
            c3168e.m1251e(new C12569e(C12347e.billing(metrica), AbstractC9262e.appmetrica(metrica, c17013e), AbstractC9262e.appmetrica(metrica2, c17013e2), c17013e.f33324e, c17013e2.f33324e, 0L, z, 32));
        }
    }

    public static final LinkedHashMap billing(AbstractC5918e abstractC5918e) {
        ArrayList arrayList = abstractC5918e.vip;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            InterfaceC2209e interfaceC2209e = (InterfaceC2209e) next;
            InterfaceC7189e vip2 = interfaceC2209e.vip();
            C6571e c6571e = vip2.yandex(C8865e.f17812e) ? (C6571e) vip2.appmetrica(new C6571e(null, C17043e.ad), C5983e.f12618e) : new C6571e(null, vip2);
            C4289e c4289e = (C4289e) c6571e.f13544e;
            InterfaceC7189e interfaceC7189e = (InterfaceC7189e) c6571e.f13543e;
            InterfaceC10161e interfaceC10161e = c4289e != null ? c4289e.ad : null;
            C6571e c6571e2 = interfaceC10161e instanceof C7694e ? new C6571e(interfaceC10161e, interfaceC7189e) : new C6571e(null, interfaceC7189e);
            C7694e c7694e = (C7694e) c6571e2.f13544e;
            InterfaceC7189e interfaceC7189e2 = (InterfaceC7189e) c6571e2.f13543e;
            if (c7694e != null && !(interfaceC2209e instanceof C5831e)) {
                String str = c7694e.ad + '+' + i;
                C7694e c7694e2 = new C7694e(str, c7694e.vip);
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(str, obj);
                }
                ((List) obj).add(c7694e2);
                interfaceC2209e.metrica(interfaceC7189e2.purchase(new C4289e(c7694e2)));
            }
            if (interfaceC2209e instanceof AbstractC5918e) {
                for (Map.Entry entry : billing((AbstractC5918e) interfaceC2209e).entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    Object obj2 = linkedHashMap.get(str2);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(str2, obj2);
                    }
                    ((List) obj2).addAll(list);
                }
            }
            i = i2;
        }
        return linkedHashMap;
    }

    public static final void license(AbstractC5918e abstractC5918e) {
        ArrayList arrayList = abstractC5918e.vip;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC2209e interfaceC2209e = (InterfaceC2209e) it.next();
            if (interfaceC2209e instanceof AbstractC5918e) {
                license((AbstractC5918e) interfaceC2209e);
            }
        }
        C8851e c8851e = (C8851e) abstractC5918e.vip().appmetrica(null, C5983e.f12625e);
        AbstractC7107e abstractC7107e = C9133e.ad;
        if (((c8851e != null ? c8851e.ad : abstractC7107e) instanceof C9133e) && (arrayList == null || !arrayList.isEmpty())) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C8851e c8851e2 = (C8851e) ((InterfaceC2209e) it2.next()).vip().appmetrica(null, C5983e.f12616e);
                if ((c8851e2 != null ? c8851e2.ad : null) instanceof C6705e) {
                    abstractC5918e.metrica(abstractC5918e.vip().purchase(new C8851e(C6705e.ad)));
                    break;
                }
            }
        }
        C12005e c12005e = (C12005e) abstractC5918e.vip().appmetrica(null, C5983e.f12602e);
        if (c12005e != null) {
            abstractC7107e = c12005e.ad;
        }
        if (abstractC7107e instanceof C9133e) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C12005e c12005e2 = (C12005e) ((InterfaceC2209e) it3.next()).vip().appmetrica(null, C5983e.f12620e);
                    if ((c12005e2 != null ? c12005e2.ad : null) instanceof C6705e) {
                        abstractC5918e.metrica(AbstractC10589e.license(abstractC5918e.vip()));
                        return;
                    }
                }
            }
        }
    }

    public static void metrica(C14390e c14390e) {
        ArrayList arrayList = c14390e.vip;
        if (!arrayList.isEmpty()) {
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!(((InterfaceC2209e) it.next()) instanceof C5831e)) {
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ArrayList arrayList2 = ((C5831e) ((InterfaceC2209e) it2.next())).vip;
                if (arrayList2.size() != 1) {
                    C5541e c5541e = new C5541e();
                    AbstractC13480e.inmobi(c5541e.vip, arrayList2);
                    arrayList2.clear();
                    arrayList2.add(c5541e);
                }
            }
            license(c14390e);
            purchase(c14390e, new C3685e(24));
        }
        if (arrayList.size() != 1) {
            C5541e c5541e2 = new C5541e();
            AbstractC13480e.inmobi(c5541e2.vip, arrayList);
            arrayList.clear();
            arrayList.add(c5541e2);
        }
        license(c14390e);
        purchase(c14390e, new C3685e(24));
    }

    public static final void purchase(AbstractC5918e abstractC5918e, C3685e c3685e) {
        Iterator it = abstractC5918e.vip.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            InterfaceC2209e interfaceC2209e = (InterfaceC2209e) c3685e.invoke((InterfaceC2209e) next);
            abstractC5918e.vip.set(i, interfaceC2209e);
            if (interfaceC2209e instanceof AbstractC5918e) {
                purchase((AbstractC5918e) interfaceC2209e, c3685e);
            }
            i = i2;
        }
    }

    public static final void vip(C8092e c8092e, C6071e c6071e) {
        C0500e c0500e = c6071e.license;
        C0583e c0583e = c0500e.f2578e;
        Object billing = c0500e.f2578e.billing(AbstractC9058e.applovin);
        if (billing == null) {
            billing = null;
        }
        C11796e c11796e = (C11796e) billing;
        if (AbstractC13362e.ad(c6071e)) {
            if (c11796e != null && c11796e.ad == 8) {
                return;
            }
            Object billing2 = c0583e.billing(AbstractC10789e.isPro);
            if (billing2 == null) {
                billing2 = null;
            }
            C10591e c10591e = (C10591e) billing2;
            if (c10591e != null) {
                c8092e.vip(new C3614e(R.id.accessibilityActionPageUp, c10591e.ad));
            }
            Object billing3 = c0583e.billing(AbstractC10789e.ads);
            if (billing3 == null) {
                billing3 = null;
            }
            C10591e c10591e2 = (C10591e) billing3;
            if (c10591e2 != null) {
                c8092e.vip(new C3614e(R.id.accessibilityActionPageDown, c10591e2.ad));
            }
            Object billing4 = c0583e.billing(AbstractC10789e.applovin);
            if (billing4 == null) {
                billing4 = null;
            }
            C10591e c10591e3 = (C10591e) billing4;
            if (c10591e3 != null) {
                c8092e.vip(new C3614e(R.id.accessibilityActionPageLeft, c10591e3.ad));
            }
            Object billing5 = c0583e.billing(AbstractC10789e.premium);
            C10591e c10591e4 = (C10591e) (billing5 != null ? billing5 : null);
            if (c10591e4 != null) {
                c8092e.vip(new C3614e(R.id.accessibilityActionPageRight, c10591e4.ad));
            }
        }
    }
}
