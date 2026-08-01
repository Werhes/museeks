package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12983e {
    public static final C12983e ad = new Object();

    public static ArrayList ad(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC10226e abstractC10226e = (AbstractC10226e) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC10226e abstractC10226e2 = (AbstractC10226e) it2.next();
                    if (abstractC10226e2 != abstractC10226e && ((Boolean) function2.invoke(abstractC10226e2, abstractC10226e)).booleanValue()) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [eًؙٟ] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [eًؙٟ, eّٓؐ] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v17, types: [eَْ] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eٜؒؒ, java.lang.Object, eَْ] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.Set] */
    public final AbstractC10226e vip(ArrayList arrayList) {
        AbstractC10226e abstractC10226e;
        AbstractC10226e vip;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC10226e abstractC10226e2 = (AbstractC10226e) it.next();
            if (abstractC10226e2.loadAd() instanceof C14376e) {
                Collection ad2 = abstractC10226e2.loadAd().ad();
                ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(ad2, 10));
                Iterator it2 = ad2.iterator();
                while (it2.hasNext()) {
                    AbstractC10226e license = AbstractC9600e.license((AbstractC1186e) it2.next());
                    if (abstractC10226e2.Signature()) {
                        license = license.pro(true);
                    }
                    arrayList3.add(license);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(abstractC10226e2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        EnumC1093e enumC1093e = EnumC1093e.f3636e;
        while (it3.hasNext()) {
            enumC1093e = enumC1093e.ad((AbstractC15728e) it3.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            AbstractC10226e abstractC10226e3 = (AbstractC10226e) it4.next();
            if (enumC1093e == EnumC1093e.f3635e) {
                if (abstractC10226e3 instanceof C17970e) {
                    C17970e c17970e = (C17970e) abstractC10226e3;
                    abstractC10226e3 = new C17970e(c17970e.f35222e, c17970e.f35221e, c17970e.f35223e, c17970e.f35220e, c17970e.f35225e, true);
                }
                AbstractC10226e amazon = C17354e.amazon(abstractC10226e3, false);
                abstractC10226e3 = (amazon == null && (amazon = AbstractC16481e.billing(abstractC10226e3)) == null) ? abstractC10226e3.pro(false) : amazon;
            }
            linkedHashSet.add(abstractC10226e3);
        }
        ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((AbstractC10226e) it5.next()).smaato());
        }
        Iterator it6 = arrayList4.iterator();
        if (!it6.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it6.next();
        while (true) {
            abstractC10226e = null;
            if (!it6.hasNext()) {
                break;
            }
            C6557e c6557e = (C6557e) it6.next();
            next = (C6557e) next;
            C10312e c10312e = C6557e.f13492e;
            if (!next.isEmpty() || !c6557e.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Iterator it7 = ((ConcurrentHashMap) c10312e.f20361e).values().iterator();
                while (it7.hasNext()) {
                    int intValue = ((Number) it7.next()).intValue();
                    C11720e c11720e = (C11720e) next.f27639e.get(intValue);
                    C11720e c11720e2 = (C11720e) c6557e.f27639e.get(intValue);
                    if (c11720e != null) {
                        if (!AbstractC7890e.billing(c11720e2, c11720e)) {
                            c11720e = null;
                        }
                        c11720e2 = c11720e;
                    } else if (c11720e2 == null || !AbstractC7890e.billing(c11720e, c11720e2)) {
                        c11720e2 = null;
                    }
                    AbstractC9386e.vip(arrayList5, c11720e2);
                }
                next = C10312e.amazon(arrayList5);
            }
        }
        C6557e c6557e2 = (C6557e) next;
        if (linkedHashSet.size() == 1) {
            vip = (AbstractC10226e) AbstractC13480e.m3589import(linkedHashSet);
        } else {
            ArrayList ad3 = ad(linkedHashSet, new C14874e(2, this, C12983e.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 0, 13));
            ad3.isEmpty();
            if (!ad3.isEmpty()) {
                Iterator it8 = ad3.iterator();
                if (!it8.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                AbstractC10226e next2 = it8.next();
                while (it8.hasNext()) {
                    AbstractC10226e abstractC10226e4 = (AbstractC10226e) it8.next();
                    next2 = next2;
                    if (next2 != 0 && abstractC10226e4 != null) {
                        InterfaceC5021e loadAd = next2.loadAd();
                        InterfaceC5021e loadAd2 = abstractC10226e4.loadAd();
                        boolean z = loadAd instanceof C0024e;
                        if (z && (loadAd2 instanceof C0024e)) {
                            Set set = ((C0024e) loadAd).f1161e;
                            Set set2 = ((C0024e) loadAd2).f1161e;
                            Set m3581e = AbstractC13480e.m3581e(set);
                            AbstractC13480e.inmobi(m3581e, set2);
                            C0024e c0024e = new C0024e(m3581e);
                            C6557e.f13492e.getClass();
                            next2 = AbstractC1596e.appmetrica(C18139e.ad(2, true, "unknown integer literal type"), C6557e.f13491e, c0024e, C13664e.f27089e, false);
                        } else if (z) {
                            if (((C0024e) loadAd).f1161e.contains(abstractC10226e4)) {
                                next2 = abstractC10226e4;
                            }
                        } else if ((loadAd2 instanceof C0024e) && ((C0024e) loadAd2).f1161e.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                abstractC10226e = next2;
            }
            if (abstractC10226e != null) {
                vip = abstractC10226e;
            } else {
                InterfaceC9477e.vip.getClass();
                ArrayList ad4 = ad(ad3, new C14874e(2, C14617e.vip, C0399e.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 0, 14));
                ad4.isEmpty();
                vip = ad4.size() < 2 ? (AbstractC10226e) AbstractC13480e.m3589import(ad4) : new C14376e(linkedHashSet).vip();
            }
        }
        return vip.isVip(c6557e2);
    }
}
