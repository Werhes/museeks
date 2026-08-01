package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؒٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8439e {
    public static final C2892e ad = new C2892e(-783438685, false, new C10494e(19));
    public static final C2892e vip = new C2892e(-1548944684, false, new C11049e(3));
    public static final C2892e metrica = new C2892e(1467479975, false, new C10494e(26));
    public static final C2892e license = new C2892e(878149658, false, new C10494e(27));
    public static final C2892e appmetrica = new C2892e(-333707765, false, new C11049e(9));
    public static final C2892e purchase = new C2892e(-652535266, false, new C10494e(28));
    public static final C2892e billing = new C2892e(956270747, false, new C10494e(29));
    public static final C2892e yandex = new C2892e(-255586676, false, new C11049e(10));
    public static final C2892e startapp = new C2892e(-574414177, false, new C0972e(0));
    public static final C2892e adcel = new C2892e(933765655, false, new C11049e(11));
    public static final C2892e mopub = new C2892e(-1993736907, false, new C11049e(7));
    public static final C2892e advert = new C2892e(1438910333, false, new C9375e(9));
    public static final C2892e smaato = new C2892e(675166319, false, new C0972e(1));
    public static final C2892e amazon = new C2892e(-1167007637, false, new C11049e(12));
    public static final C2892e loadAd = new C2892e(458567181, false, new C11049e(13));
    public static final C2892e Signature = new C2892e(-1796778755, false, new C0972e(2));
    public static final C2892e admob = new C2892e(1861633919, false, new C0972e(3));
    public static final C2892e subscription = new C2892e(1203901812, false, new C0972e(4));
    public static final C2892e remoteconfig = new C2892e(-639733898, false, new C0972e(5));
    public static final C2892e pro = new C2892e(-660315019, false, new C10494e(20));
    public static final C2892e signatures = new C2892e(1791016567, false, new C10494e(21));
    public static final C2892e tapsense = new C2892e(1410252287, false, new C11049e(4));
    public static final C2892e isVip = new C2892e(680714465, false, new C11049e(5));
    public static final C2892e inmobi = new C2892e(-2117784987, false, new C10494e(22));
    public static final C2892e isPro = new C2892e(-735643801, false, new C10494e(23));
    public static final C2892e applovin = new C2892e(946389916, false, new C10494e(24));
    public static final C2892e ads = new C2892e(2039175198, false, new C10494e(25));
    public static final C2892e premium = new C2892e(-2136371737, false, new C11049e(6));
    public static final C2892e subs = new C2892e(-1597013175, false, new C11049e(8));

    public static C13935e ad(List list, Function1 function1, Function2 function2) {
        Object obj;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) function1.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) function1.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        if (obj == null) {
            throw new NoSuchElementException("Unable to build char tree from an empty list");
        }
        ((Number) function1.invoke(obj)).intValue();
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((Number) function1.invoke(it2.next())).intValue() == 0) {
                    throw new IllegalArgumentException("There should be no empty entries");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        vip(arrayList, list, 0, function1, function2);
        arrayList.trimToSize();
        return new C13935e(new C13728e((char) 0, C13664e.f27089e, arrayList));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eؚٗٗ, kotlin.jvm.functions.Function1] */
    public static final int adcel(C11795e c11795e, int i) {
        if (!c11795e.f23669e) {
            c11795e.f23669e = true;
            try {
                C16061e m3238e = c11795e.m3238e();
                C5732e c5732e = new C5732e(i);
                C8212e c8212e = (C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e)).getFocusOwner();
                C11795e purchase2 = c8212e.purchase();
                m3238e.adcel.invoke(c5732e);
                C11795e purchase3 = c8212e.purchase();
                if (c5732e.vip) {
                    C6260e c6260e = C6260e.vip;
                    return 2;
                }
                if (purchase2 != purchase3 && purchase3 != null) {
                    if (C6260e.license == C6260e.metrica) {
                        return 2;
                    }
                    c11795e.f23669e = false;
                    return 3;
                }
            } finally {
                c11795e.f23669e = false;
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v9, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r6v23, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r6v9, types: [eْۤۡ] */
    public static final boolean advert(C11795e c11795e) {
        C12431e c12431e;
        C14742e c14742e;
        C8212e c8212e;
        boolean z;
        ?? vip2;
        int i;
        ?? r5;
        int i2;
        int i3;
        C14742e c14742e2;
        C8212e c8212e2 = (C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e)).getFocusOwner();
        C11795e purchase2 = c8212e2.purchase();
        EnumC16488e m3239e = c11795e.m3239e();
        if (purchase2 == c11795e) {
            c11795e.m3235e(m3239e, m3239e);
            return true;
        }
        if ((purchase2 == null || purchase2.f23671e) && !c11795e.f23671e && !((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e)).getFocusOwner()).ad.m1702interface()) {
            return false;
        }
        if (purchase2 != null) {
            c12431e = new C12431e(0, new C11795e[16]);
            if (!purchase2.f27022e.f27016e) {
                AbstractC14070e.metrica("visitAncestors called on an unattached node");
            }
            AbstractC13616e abstractC13616e = purchase2.f27022e.f27011e;
            C13915e mopub2 = AbstractC5851e.mopub(purchase2);
            while (mopub2 != null) {
                if ((((AbstractC13616e) mopub2.f27592e.billing).f27020e & 1024) != 0) {
                    while (abstractC13616e != null) {
                        if ((abstractC13616e.f27014e & 1024) != 0) {
                            AbstractC13616e abstractC13616e2 = abstractC13616e;
                            C12431e c12431e2 = null;
                            while (abstractC13616e2 != null) {
                                if (abstractC13616e2 instanceof C11795e) {
                                    c12431e.license((C11795e) abstractC13616e2);
                                } else if ((abstractC13616e2.f27014e & 1024) != 0 && (abstractC13616e2 instanceof AbstractC6126e)) {
                                    int i4 = 0;
                                    for (AbstractC13616e abstractC13616e3 = ((AbstractC6126e) abstractC13616e2).f12873e; abstractC13616e3 != null; abstractC13616e3 = abstractC13616e3.f27024e) {
                                        if ((abstractC13616e3.f27014e & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                Unit unit = Unit.INSTANCE;
                                                abstractC13616e2 = abstractC13616e3;
                                            } else {
                                                if (c12431e2 == null) {
                                                    c12431e2 = new C12431e(0, new AbstractC13616e[16]);
                                                }
                                                if (abstractC13616e2 != null) {
                                                    c12431e2.license(abstractC13616e2);
                                                    abstractC13616e2 = null;
                                                }
                                                c12431e2.license(abstractC13616e3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC13616e2 = AbstractC5851e.vip(c12431e2);
                            }
                        }
                        abstractC13616e = abstractC13616e.f27011e;
                    }
                }
                mopub2 = mopub2.tapsense();
                abstractC13616e = (mopub2 == null || (c14742e2 = mopub2.f27592e) == null) ? null : (C9011e) c14742e2.purchase;
            }
        } else {
            c12431e = null;
        }
        C11795e[] c11795eArr = new C11795e[16];
        C11795e[] c11795eArr2 = new C11795e[16];
        if (!c11795e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitAncestors called on an unattached node");
        }
        ?? r6 = c11795e.f27022e.f27011e;
        C13915e mopub3 = AbstractC5851e.mopub(c11795e);
        boolean z2 = true;
        int i5 = 0;
        int i6 = 0;
        while (mopub3 != null) {
            if ((((AbstractC13616e) mopub3.f27592e.billing).f27020e & 1024) != 0) {
                while (r6 != null) {
                    if ((r6.f27014e & 1024) != 0) {
                        C11795e c11795e2 = r6;
                        C12431e c12431e3 = null;
                        while (c11795e2 != null) {
                            if (c11795e2 instanceof C11795e) {
                                C11795e c11795e3 = c11795e2;
                                if (AbstractC7890e.billing(c12431e != null ? Boolean.valueOf(c12431e.smaato(c11795e3)) : null, Boolean.TRUE)) {
                                    int i7 = i5 + 1;
                                    if (c11795eArr.length < i7) {
                                        int length = c11795eArr.length;
                                        c8212e = c8212e2;
                                        ?? r1 = new Object[Math.max(i7, length * 2)];
                                        i3 = i7;
                                        System.arraycopy(c11795eArr, 0, r1, 0, length);
                                        c11795eArr = r1;
                                    } else {
                                        c8212e = c8212e2;
                                        i3 = i7;
                                    }
                                    c11795eArr[i5] = c11795e3;
                                    i5 = i3;
                                } else {
                                    c8212e = c8212e2;
                                    int i8 = i6 + 1;
                                    if (c11795eArr2.length < i8) {
                                        int length2 = c11795eArr2.length;
                                        ?? r52 = new Object[Math.max(i8, length2 * 2)];
                                        i2 = i8;
                                        System.arraycopy(c11795eArr2, 0, r52, 0, length2);
                                        c11795eArr2 = r52;
                                    } else {
                                        i2 = i8;
                                    }
                                    c11795eArr2[i6] = c11795e3;
                                    i6 = i2;
                                }
                                if (c11795e3 == purchase2) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                c8212e = c8212e2;
                                z = true;
                            }
                            if (z && (c11795e2.f27014e & 1024) != 0 && (c11795e2 instanceof AbstractC6126e)) {
                                AbstractC13616e abstractC13616e4 = ((AbstractC6126e) c11795e2).f12873e;
                                int i9 = 0;
                                vip2 = c11795e2;
                                while (abstractC13616e4 != null) {
                                    if ((abstractC13616e4.f27014e & 1024) != 0) {
                                        int i10 = i9 + 1;
                                        if (i10 == 1) {
                                            Unit unit2 = Unit.INSTANCE;
                                            vip2 = abstractC13616e4;
                                            i = i10;
                                        } else {
                                            if (c12431e3 == null) {
                                                i = i10;
                                                r5 = new C12431e(0, new AbstractC13616e[16]);
                                            } else {
                                                i = i10;
                                                r5 = c12431e3;
                                            }
                                            if (vip2 != 0) {
                                                r5.license(vip2);
                                                vip2 = 0;
                                            }
                                            r5.license(abstractC13616e4);
                                            c12431e3 = r5;
                                            vip2 = vip2;
                                        }
                                        i9 = i;
                                    }
                                    abstractC13616e4 = abstractC13616e4.f27024e;
                                    vip2 = vip2;
                                }
                                if (i9 == 1) {
                                    c8212e2 = c8212e;
                                    c11795e2 = vip2;
                                }
                            }
                            vip2 = AbstractC5851e.vip(c12431e3);
                            c8212e2 = c8212e;
                            c11795e2 = vip2;
                        }
                    }
                    r6 = r6.f27011e;
                    c8212e2 = c8212e2;
                }
            }
            C8212e c8212e3 = c8212e2;
            mopub3 = mopub3.tapsense();
            r6 = (mopub3 == null || (c14742e = mopub3.f27592e) == null) ? null : (C9011e) c14742e.purchase;
            c8212e2 = c8212e3;
        }
        C8212e c8212e4 = c8212e2;
        if (!z2 || purchase2 == null || license(purchase2, false)) {
            AbstractC16425e.purchase(c11795e, new C17073e(6, c11795e));
            int ordinal = c11795e.m3239e().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new C14803e(10);
                        }
                    }
                }
                ((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e)).getFocusOwner()).startapp(c11795e);
            }
            EnumC16488e enumC16488e = EnumC16488e.f32315e;
            EnumC16488e enumC16488e2 = EnumC16488e.f32316e;
            if (z2 && purchase2 != null) {
                purchase2.m3235e(enumC16488e2, enumC16488e);
                Unit unit3 = Unit.INSTANCE;
            }
            EnumC16488e enumC16488e3 = EnumC16488e.f32314e;
            if (c12431e != null) {
                int i11 = c12431e.f24868e - 1;
                Object[] objArr = c12431e.f24870e;
                if (i11 < objArr.length) {
                    while (i11 >= 0) {
                        C11795e c11795e4 = (C11795e) objArr[i11];
                        if (c8212e4.purchase() != c11795e) {
                            break;
                        }
                        c11795e4.m3235e(enumC16488e3, enumC16488e);
                        i11--;
                    }
                }
                Unit unit4 = Unit.INSTANCE;
            }
            int i12 = i6 - 1;
            if (i12 < c11795eArr2.length) {
                while (i12 >= 0) {
                    C11795e c11795e5 = c11795eArr2[i12];
                    if (c8212e4.purchase() != c11795e) {
                        break;
                    }
                    c11795e5.m3235e(c11795e5 == purchase2 ? enumC16488e2 : enumC16488e, enumC16488e3);
                    i12--;
                }
            }
            if (c8212e4.purchase() == c11795e) {
                c11795e.m3235e(m3239e, enumC16488e2);
                if (c8212e4.purchase() != c11795e) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static final void appmetrica(InterfaceC14956e interfaceC14956e, C12816e c12816e, ArrayList arrayList) {
        if (interfaceC14956e instanceof InterfaceC14956e) {
            interfaceC14956e.metrica(c12816e, arrayList);
        } else {
            arrayList.addAll(interfaceC14956e.ad(c12816e));
        }
    }

    public static final boolean billing(C11795e c11795e) {
        int ordinal = c11795e.m3239e().ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return false;
            }
            throw new C14803e(10);
        }
        ((C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e)).getFocusOwner()).getClass();
        c11795e.m3235e(EnumC16488e.f32313e, EnumC16488e.f32316e);
        return true;
    }

    public static final boolean license(C11795e c11795e, boolean z) {
        int ordinal = c11795e.m3239e().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C11795e appmetrica2 = AbstractC11267e.appmetrica(c11795e);
                if (!(appmetrica2 != null ? license(appmetrica2, z) : true)) {
                    return false;
                }
                c11795e.m3235e(EnumC16488e.f32314e, EnumC16488e.f32315e);
                return true;
            }
            if (ordinal == 2) {
                return z;
            }
            if (ordinal != 3) {
                throw new C14803e(10);
            }
        }
        return true;
    }

    public static final C0909e metrica(AbstractC10226e abstractC10226e, InterfaceC2978e interfaceC2978e, int i) {
        if (interfaceC2978e == null || C18139e.appmetrica(interfaceC2978e)) {
            return null;
        }
        int size = interfaceC2978e.mo1221e().size() + i;
        if (interfaceC2978e.mo1222instanceof()) {
            List subList = abstractC10226e.mopub().subList(i, size);
            InterfaceC15498e mo1351switch = interfaceC2978e.mo1351switch();
            return new C0909e(interfaceC2978e, subList, metrica(abstractC10226e, mo1351switch instanceof InterfaceC2978e ? (InterfaceC2978e) mo1351switch : null, size));
        }
        if (size != abstractC10226e.mopub().size()) {
            AbstractC14300e.smaato(interfaceC2978e);
        }
        return new C0909e(interfaceC2978e, abstractC10226e.mopub().subList(i, abstractC10226e.mopub().size()), r0);
    }

    public static final int mopub(C11795e c11795e, int i) {
        AbstractC13616e abstractC13616e;
        C14742e c14742e;
        int ordinal = c11795e.m3239e().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C11795e appmetrica2 = AbstractC11267e.appmetrica(c11795e);
                if (appmetrica2 != null) {
                    return startapp(appmetrica2, i);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C14803e(10);
                }
                if (!c11795e.f27022e.f27016e) {
                    AbstractC14070e.metrica("visitAncestors called on an unattached node");
                }
                AbstractC13616e abstractC13616e2 = c11795e.f27022e.f27011e;
                C13915e mopub2 = AbstractC5851e.mopub(c11795e);
                loop0: while (true) {
                    abstractC13616e = null;
                    if (mopub2 == null) {
                        break;
                    }
                    if ((((AbstractC13616e) mopub2.f27592e.billing).f27020e & 1024) != 0) {
                        while (abstractC13616e2 != null) {
                            if ((abstractC13616e2.f27014e & 1024) != 0) {
                                AbstractC13616e abstractC13616e3 = abstractC13616e2;
                                C12431e c12431e = null;
                                while (abstractC13616e3 != null) {
                                    if (abstractC13616e3 instanceof C11795e) {
                                        abstractC13616e = abstractC13616e3;
                                        break loop0;
                                    }
                                    if ((abstractC13616e3.f27014e & 1024) != 0 && (abstractC13616e3 instanceof AbstractC6126e)) {
                                        int i2 = 0;
                                        for (AbstractC13616e abstractC13616e4 = ((AbstractC6126e) abstractC13616e3).f12873e; abstractC13616e4 != null; abstractC13616e4 = abstractC13616e4.f27024e) {
                                            if ((abstractC13616e4.f27014e & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    abstractC13616e3 = abstractC13616e4;
                                                } else {
                                                    if (c12431e == null) {
                                                        c12431e = new C12431e(0, new AbstractC13616e[16]);
                                                    }
                                                    if (abstractC13616e3 != null) {
                                                        c12431e.license(abstractC13616e3);
                                                        abstractC13616e3 = null;
                                                    }
                                                    c12431e.license(abstractC13616e4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    abstractC13616e3 = AbstractC5851e.vip(c12431e);
                                }
                            }
                            abstractC13616e2 = abstractC13616e2.f27011e;
                        }
                    }
                    mopub2 = mopub2.tapsense();
                    abstractC13616e2 = (mopub2 == null || (c14742e = mopub2.f27592e) == null) ? null : (C9011e) c14742e.purchase;
                }
                C11795e c11795e2 = (C11795e) abstractC13616e;
                if (c11795e2 != null) {
                    int ordinal2 = c11795e2.m3239e().ordinal();
                    if (ordinal2 == 0) {
                        return adcel(c11795e2, i);
                    }
                    if (ordinal2 == 1) {
                        return mopub(c11795e2, i);
                    }
                    if (ordinal2 == 2) {
                        return 2;
                    }
                    if (ordinal2 != 3) {
                        throw new C14803e(10);
                    }
                    int mopub3 = mopub(c11795e2, i);
                    int i3 = mopub3 != 1 ? mopub3 : 0;
                    return i3 == 0 ? adcel(c11795e2, i) : i3;
                }
            }
        }
        return 1;
    }

    public static final List purchase(InterfaceC2978e interfaceC2978e) {
        List list;
        Object obj;
        InterfaceC5021e mo1459goto;
        List mo1221e = interfaceC2978e.mo1221e();
        if (!interfaceC2978e.mo1222instanceof() && !(interfaceC2978e.mo1351switch() instanceof InterfaceC6647e)) {
            return mo1221e;
        }
        int i = AbstractC2876e.ad;
        C7247e c7247e = C7247e.f14828e;
        List Signature2 = AbstractC7762e.Signature(AbstractC7762e.mopub(AbstractC7762e.startapp(new C1356e(7, AbstractC7762e.yandex(AbstractC7762e.advert(interfaceC2978e, c7247e), 1)), C15146e.f29960e), C15146e.f29958e));
        Iterator it = AbstractC7762e.yandex(AbstractC7762e.advert(interfaceC2978e, c7247e), 1).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof InterfaceC5052e) {
                break;
            }
        }
        InterfaceC5052e interfaceC5052e = (InterfaceC5052e) obj;
        if (interfaceC5052e != null && (mo1459goto = interfaceC5052e.mo1459goto()) != null) {
            list = mo1459goto.getParameters();
        }
        if (list == null) {
            list = C13664e.f27089e;
        }
        if (Signature2.isEmpty() && list.isEmpty()) {
            return interfaceC2978e.mo1221e();
        }
        ArrayList m3584final = AbstractC13480e.m3584final(Signature2, list);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(m3584final, 10));
        Iterator it2 = m3584final.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C9867e((InterfaceC16046e) it2.next(), interfaceC2978e, mo1221e.size()));
        }
        return AbstractC13480e.m3584final(mo1221e, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [eؚٗٗ, kotlin.jvm.functions.Function1] */
    public static final int startapp(C11795e c11795e, int i) {
        int ordinal = c11795e.m3239e().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                C11795e appmetrica2 = AbstractC11267e.appmetrica(c11795e);
                if (appmetrica2 == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                int startapp2 = startapp(appmetrica2, i);
                if (startapp2 == 1) {
                    startapp2 = 0;
                }
                if (startapp2 != 0) {
                    return startapp2;
                }
                if (!c11795e.f23670e) {
                    c11795e.f23670e = true;
                    try {
                        C16061e m3238e = c11795e.m3238e();
                        C5732e c5732e = new C5732e(i);
                        C8212e c8212e = (C8212e) ((ViewTreeObserverOnGlobalLayoutListenerC5014e) AbstractC5851e.advert(c11795e)).getFocusOwner();
                        C11795e purchase2 = c8212e.purchase();
                        m3238e.mopub.invoke(c5732e);
                        C11795e purchase3 = c8212e.purchase();
                        if (c5732e.vip) {
                            C6260e c6260e = C6260e.vip;
                            return 2;
                        }
                        if (purchase2 == purchase3 || purchase3 == null) {
                            return 1;
                        }
                        return C6260e.license == C6260e.metrica ? 2 : 3;
                    } finally {
                        c11795e.f23670e = false;
                    }
                }
            } else {
                if (ordinal == 2) {
                    return 2;
                }
                if (ordinal != 3) {
                    throw new C14803e(10);
                }
            }
        }
        return 1;
    }

    public static void vip(ArrayList arrayList, List list, int i, Function1 function1, Function2 function2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Character ch = (Character) function2.invoke(obj, Integer.valueOf(i));
            ch.getClass();
            Object obj2 = linkedHashMap.get(ch);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(ch, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            char charValue = ((Character) entry.getKey()).charValue();
            List list2 = (List) entry.getValue();
            int i2 = i + 1;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (((Number) function1.invoke(obj3)).intValue() > i2) {
                    arrayList3.add(obj3);
                }
            }
            vip(arrayList2, arrayList3, i2, function1, function2);
            arrayList2.trimToSize();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : list2) {
                if (((Number) function1.invoke(obj4)).intValue() == i2) {
                    arrayList4.add(obj4);
                }
            }
            arrayList.add(new C13728e(charValue, arrayList4, arrayList2));
        }
    }

    public static final boolean yandex(InterfaceC14956e interfaceC14956e, C12816e c12816e) {
        if (interfaceC14956e instanceof InterfaceC14956e) {
            return interfaceC14956e.vip(c12816e);
        }
        ArrayList arrayList = new ArrayList();
        appmetrica(interfaceC14956e, c12816e, arrayList);
        return arrayList.isEmpty();
    }
}
