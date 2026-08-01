package defpackage;

import android.content.Context;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4306e {
    public static final C12916e ad = new C12916e(12, Boolean.TRUE);

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0290, code lost:
    
        if (r7.license == r6) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if (r4.license == r12) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void ad(defpackage.C17688e r40, defpackage.C17677e r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instructions count: 1791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4306e.ad(eُ٘ۙ, eُ٘ؓ, java.util.ArrayList, int):void");
    }

    public static final EnumC12302e adcel(int i) {
        if (i == 0) {
            return EnumC12302e.START;
        }
        if (i == 1) {
            return EnumC12302e.CENTER_HORIZONTALLY;
        }
        if (i == 2) {
            return EnumC12302e.END;
        }
        throw new IllegalStateException(("unknown horizontal alignment " + ((Object) C2782e.vip(i))).toString());
    }

    public static Object appmetrica(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static void billing(List list, InterfaceC11801e interfaceC11801e, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (interfaceC11801e.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    public static final Method license(InterfaceC5261e interfaceC5261e) {
        InterfaceC9739e vip;
        InterfaceC8826e ad2 = AbstractC5965e.ad(interfaceC5261e);
        Member vip2 = (ad2 == null || (vip = ad2.vip()) == null) ? null : vip.vip();
        if (vip2 instanceof Method) {
            return (Method) vip2;
        }
        return null;
    }

    public static final InterfaceC5261e metrica(Collection collection, Method method) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC15954e interfaceC15954e = (InterfaceC15954e) it.next();
            if (interfaceC15954e instanceof InterfaceC5261e) {
                InterfaceC5261e interfaceC5261e = (InterfaceC5261e) interfaceC15954e;
                if (AbstractC7890e.billing(interfaceC5261e.getName(), method.getName()) && AbstractC7890e.billing(license(interfaceC5261e), method)) {
                    return interfaceC5261e;
                }
            }
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            InterfaceC15954e interfaceC15954e2 = (InterfaceC15954e) it2.next();
            if (interfaceC15954e2 instanceof InterfaceC5261e) {
                InterfaceC5261e interfaceC5261e2 = (InterfaceC5261e) interfaceC15954e2;
                if (!AbstractC7890e.billing(interfaceC5261e2.getName(), method.getName()) && AbstractC7890e.billing(license(interfaceC5261e2), method)) {
                    return interfaceC5261e2;
                }
            }
        }
        return null;
    }

    public static final String purchase(int i) {
        return AbstractC1786e.admob(i, "appWidgetLayout-");
    }

    public static final EnumC10368e startapp(int i) {
        if (i == 0) {
            return EnumC10368e.TOP;
        }
        if (i == 1) {
            return EnumC10368e.CENTER_VERTICALLY;
        }
        if (i == 2) {
            return EnumC10368e.BOTTOM;
        }
        throw new IllegalStateException(("unknown vertical alignment " + ((Object) C13692e.vip(i))).toString());
    }

    public static final C14888e vip(Context context, InterfaceC2209e interfaceC2209e) {
        EnumC4441e enumC4441e;
        EnumC0137e enumC0137e;
        C1119e ads = C14888e.ads();
        if (interfaceC2209e instanceof C5541e) {
            enumC4441e = EnumC4441e.BOX;
        } else if (interfaceC2209e instanceof C0775e) {
            enumC4441e = AbstractC8178e.appmetrica(((C0775e) interfaceC2209e).metrica) ? EnumC4441e.RADIO_ROW : EnumC4441e.ROW;
        } else if (interfaceC2209e instanceof C3391e) {
            enumC4441e = AbstractC8178e.appmetrica(((C3391e) interfaceC2209e).metrica) ? EnumC4441e.RADIO_COLUMN : EnumC4441e.COLUMN;
        } else if (interfaceC2209e instanceof C12102e) {
            enumC4441e = EnumC4441e.TEXT;
        } else if (interfaceC2209e instanceof C15784e) {
            enumC4441e = EnumC4441e.IMAGE;
        } else if (interfaceC2209e instanceof C14390e) {
            enumC4441e = EnumC4441e.REMOTE_VIEWS_ROOT;
        } else {
            if (!(interfaceC2209e instanceof C5831e)) {
                throw new IllegalArgumentException("Unknown element type " + interfaceC2209e.getClass().getCanonicalName());
            }
            enumC4441e = EnumC4441e.SIZE_BOX;
        }
        ads.metrica();
        C14888e.amazon((C14888e) ads.f24447e, enumC4441e);
        C12005e c12005e = (C12005e) interfaceC2209e.vip().appmetrica(null, C5983e.f12610e);
        AbstractC7107e abstractC7107e = C9133e.ad;
        EnumC5847e yandex = yandex(c12005e != null ? c12005e.ad : abstractC7107e, context);
        ads.metrica();
        C14888e.loadAd((C14888e) ads.f24447e, yandex);
        C8851e c8851e = (C8851e) interfaceC2209e.vip().appmetrica(null, C5983e.f12605e);
        if (c8851e != null) {
            abstractC7107e = c8851e.ad;
        }
        EnumC5847e yandex2 = yandex(abstractC7107e, context);
        ads.metrica();
        C14888e.Signature((C14888e) ads.f24447e, yandex2);
        boolean z = interfaceC2209e.vip().appmetrica(null, C5983e.f12613e) != null;
        ads.metrica();
        C14888e.signatures((C14888e) ads.f24447e, z);
        if (interfaceC2209e.vip().appmetrica(null, C5983e.f12617e) != null) {
            ads.metrica();
            C14888e.pro((C14888e) ads.f24447e);
        }
        if (interfaceC2209e instanceof C15784e) {
            C15784e c15784e = (C15784e) interfaceC2209e;
            int i = c15784e.appmetrica;
            if (i == 1) {
                enumC0137e = EnumC0137e.FIT;
            } else if (i == 0) {
                enumC0137e = EnumC0137e.CROP;
            } else {
                if (i != 2) {
                    throw new IllegalStateException(("Unknown content scale " + ((Object) C6604e.ad(c15784e.appmetrica))).toString());
                }
                enumC0137e = EnumC0137e.FILL_BOUNDS;
            }
            ads.metrica();
            C14888e.remoteconfig((C14888e) ads.f24447e, enumC0137e);
            boolean z2 = !AbstractC8141e.purchase(c15784e);
            ads.metrica();
            C14888e.isVip((C14888e) ads.f24447e, z2);
            boolean z3 = c15784e.metrica != null;
            ads.metrica();
            C14888e.inmobi((C14888e) ads.f24447e, z3);
            boolean z4 = c15784e.license != null;
            ads.metrica();
            C14888e.isPro((C14888e) ads.f24447e, z4);
        } else if (interfaceC2209e instanceof C3391e) {
            EnumC12302e adcel = adcel(((C3391e) interfaceC2209e).appmetrica);
            ads.metrica();
            C14888e.admob((C14888e) ads.f24447e, adcel);
        } else if (interfaceC2209e instanceof C0775e) {
            EnumC10368e startapp = startapp(((C0775e) interfaceC2209e).appmetrica);
            ads.metrica();
            C14888e.subscription((C14888e) ads.f24447e, startapp);
        } else if (interfaceC2209e instanceof C5541e) {
            C5541e c5541e = (C5541e) interfaceC2209e;
            EnumC12302e adcel2 = adcel(c5541e.license.ad);
            ads.metrica();
            C14888e.admob((C14888e) ads.f24447e, adcel2);
            EnumC10368e startapp2 = startapp(c5541e.license.vip);
            ads.metrica();
            C14888e.subscription((C14888e) ads.f24447e, startapp2);
        }
        if (interfaceC2209e instanceof AbstractC5918e) {
            ArrayList arrayList = ((AbstractC5918e) interfaceC2209e).vip;
            ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(vip(context, (InterfaceC2209e) it.next()));
            }
            ads.metrica();
            C14888e.tapsense((C14888e) ads.f24447e, arrayList2);
        }
        return (C14888e) ads.ad();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if ((r2 instanceof defpackage.C9361e) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.EnumC5847e yandex(defpackage.AbstractC7107e r2, android.content.Context r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r2 = r2 instanceof defpackage.C9361e
            if (r2 == 0) goto L1a
            goto L28
        Lb:
            eؚّٖ r2 = defpackage.AbstractC5111e.appmetrica(r2, r3)
            boolean r3 = r2 instanceof defpackage.C7191e
            if (r3 == 0) goto L16
            eؘۗۨ r2 = defpackage.EnumC5847e.EXACT
            return r2
        L16:
            boolean r3 = r2 instanceof defpackage.C9133e
            if (r3 == 0) goto L1d
        L1a:
            eؘۗۨ r2 = defpackage.EnumC5847e.WRAP
            return r2
        L1d:
            boolean r3 = r2 instanceof defpackage.C6705e
            if (r3 == 0) goto L24
            eؘۗۨ r2 = defpackage.EnumC5847e.FILL
            return r2
        L24:
            boolean r2 = r2 instanceof defpackage.C9361e
            if (r2 == 0) goto L2b
        L28:
            eؘۗۨ r2 = defpackage.EnumC5847e.EXPAND
            return r2
        L2b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "After resolution, no other type should be present"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC4306e.yandex(eؚّٖ, android.content.Context):eؘۗۨ");
    }
}
