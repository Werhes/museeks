package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4475e {
    public static final C14326e ad = new C14326e("camera2.streamSpec.streamUseCase", Long.TYPE, null);
    public static final C1239e metrica;
    public static final C1239e vip;

    static {
        C1239e c1239e = new C1239e();
        int i = Build.VERSION.SDK_INT;
        EnumC12633e enumC12633e = EnumC12633e.f25350e;
        EnumC12633e enumC12633e2 = EnumC12633e.f25351e;
        EnumC12633e enumC12633e3 = EnumC12633e.f25349e;
        if (i >= 33) {
            EnumC12633e enumC12633e4 = EnumC12633e.f25353e;
            EnumC12633e enumC12633e5 = EnumC12633e.f25348e;
            c1239e.put(4L, AbstractC1660e.m664case(new EnumC12633e[]{enumC12633e3, enumC12633e4, enumC12633e5}));
            c1239e.put(1L, AbstractC1660e.m664case(new EnumC12633e[]{enumC12633e3, enumC12633e4, enumC12633e5}));
            c1239e.put(2L, Collections.singleton(enumC12633e2));
            c1239e.put(3L, Collections.singleton(enumC12633e));
        }
        vip = c1239e.vip();
        C1239e c1239e2 = new C1239e();
        if (i >= 33) {
            c1239e2.put(4L, AbstractC1660e.m664case(new EnumC12633e[]{enumC12633e3, enumC12633e2, enumC12633e}));
            c1239e2.put(3L, AbstractC1660e.m664case(new EnumC12633e[]{enumC12633e3, enumC12633e}));
        }
        metrica = c1239e2.vip();
    }

    public static boolean ad(InterfaceC2531e interfaceC2531e, List list) {
        if (Build.VERSION.SDK_INT >= 33) {
            long[] jArr = (long[]) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!hashSet.contains(Long.valueOf(((C4637e) it.next()).metrica.f6112e))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean appmetrica(InterfaceC12330e interfaceC12330e, EnumC12633e enumC12633e) {
        if (((Boolean) interfaceC12330e.smaato(InterfaceC12438e.f24894e, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        C14326e c14326e = C5753e.f12173e;
        if (interfaceC12330e.mo812extends(c14326e)) {
            return enumC12633e.ordinal() == 0 && ((Number) interfaceC12330e.subscription(c14326e)).intValue() == 2;
        }
        return false;
    }

    public static boolean license(InterfaceC2531e interfaceC2531e) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        long[] jArr = (long[]) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        return (jArr == null || jArr.length == 0) ? false : true;
    }

    public static boolean metrica(EnumC12633e enumC12633e, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (enumC12633e != EnumC12633e.f25347e) {
            Long valueOf = Long.valueOf(j);
            C1239e c1239e = vip;
            return c1239e.containsKey(valueOf) && ((Set) c1239e.get(Long.valueOf(j))).contains(enumC12633e);
        }
        Long valueOf2 = Long.valueOf(j);
        C1239e c1239e2 = metrica;
        if (!c1239e2.containsKey(valueOf2)) {
            return false;
        }
        Set set = (Set) c1239e2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((EnumC12633e) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean purchase(InterfaceC2531e interfaceC2531e, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList2 = new ArrayList(linkedHashMap.keySet());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((C6355e) it.next()).purchase == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object obj = linkedHashMap.get((InterfaceC12438e) it2.next());
                if (obj == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (((C6884e) obj).purchase == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            long[] jArr = (long[]) ((C9000e) interfaceC2531e).metrica(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
            if (jArr != null && jArr.length != 0) {
                HashSet hashSet = new HashSet();
                for (long j : jArr) {
                    hashSet.add(Long.valueOf(j));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    C6355e c6355e = (C6355e) it3.next();
                    InterfaceC12330e interfaceC12330e = c6355e.purchase;
                    C14326e c14326e = C11456e.f23059e;
                    if (interfaceC12330e.mo812extends(c14326e) && ((Number) c6355e.purchase.subscription(c14326e)).longValue() != 0) {
                        z2 = false;
                        z = true;
                    } else {
                        z = false;
                        z2 = true;
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    InterfaceC12438e interfaceC12438e = (InterfaceC12438e) it4.next();
                    C14326e c14326e2 = C11456e.f23059e;
                    if (interfaceC12438e.mo812extends(c14326e2)) {
                        long longValue = ((Number) interfaceC12438e.subscription(c14326e2)).longValue();
                        if (longValue != 0) {
                            if (z2) {
                                throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                            }
                            linkedHashSet.add(Long.valueOf(longValue));
                            z = true;
                        } else if (z) {
                            throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                        }
                    } else if (z) {
                        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
                    }
                    z2 = true;
                }
                if (!z2) {
                    Iterator it5 = linkedHashSet.iterator();
                    while (it5.hasNext()) {
                        if (!hashSet.contains(Long.valueOf(((Number) it5.next()).longValue()))) {
                        }
                    }
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        C6355e c6355e2 = (C6355e) it6.next();
                        InterfaceC12330e interfaceC12330e2 = c6355e2.purchase;
                        C11456e vip2 = vip(interfaceC12330e2, (Long) interfaceC12330e2.subscription(C11456e.f23059e));
                        if (vip2 != null) {
                            C10017e ad2 = C6884e.ad(c6355e2.metrica);
                            ad2.f19784e = Integer.valueOf(c6355e2.billing);
                            Range range = c6355e2.yandex;
                            if (range == null) {
                                throw new NullPointerException("Null expectedFrameRateRange");
                            }
                            ad2.f19791e = range;
                            C14677e c14677e = c6355e2.license;
                            if (c14677e == null) {
                                throw new NullPointerException("Null dynamicRange");
                            }
                            ad2.f19788e = c14677e;
                            ad2.f19790e = vip2;
                            linkedHashMap2.put(c6355e2, ad2.ad());
                        }
                    }
                    Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        InterfaceC12438e interfaceC12438e2 = (InterfaceC12438e) it7.next();
                        C6884e c6884e = (C6884e) linkedHashMap.get(interfaceC12438e2);
                        InterfaceC12330e interfaceC12330e3 = c6884e.purchase;
                        C11456e vip3 = vip(interfaceC12330e3, (Long) interfaceC12330e3.subscription(C11456e.f23059e));
                        if (vip3 != null) {
                            C10017e vip4 = c6884e.vip();
                            vip4.f19790e = vip3;
                            linkedHashMap.put(interfaceC12438e2, vip4.ad());
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [eؘؔؕ, eِؒؖ] */
    public static C11456e vip(InterfaceC12330e interfaceC12330e, Long l) {
        C14326e c14326e = ad;
        if (interfaceC12330e.mo812extends(c14326e) && AbstractC7890e.billing(interfaceC12330e.subscription(c14326e), l)) {
            return null;
        }
        C4069e purchase = C4069e.purchase(interfaceC12330e);
        purchase.yandex(c14326e, l);
        return new C2362e(7, purchase);
    }
}
