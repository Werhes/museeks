package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۥۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0696e {
    public static final String ad;
    public static final HashMap adcel;
    public static final HashMap advert;
    public static final LinkedHashSet amazon;
    public static final C11709e appmetrica;
    public static final C11709e billing;
    public static final String license;
    public static final List loadAd;
    public static final String metrica;
    public static final HashMap mopub;
    public static final C12816e purchase;
    public static final HashMap smaato;
    public static final HashMap startapp;
    public static final String vip;
    public static final HashMap yandex;

    static {
        StringBuilder sb = new StringBuilder();
        C7692e c7692e = C7692e.metrica;
        sb.append(c7692e.ad);
        sb.append('.');
        sb.append(c7692e.vip);
        ad = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        C0930e c0930e = C0930e.metrica;
        sb2.append(c0930e.ad);
        sb2.append('.');
        sb2.append(c0930e.vip);
        vip = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        C2597e c2597e = C2597e.metrica;
        sb3.append(c2597e.ad);
        sb3.append('.');
        sb3.append(c2597e.vip);
        metrica = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        C2770e c2770e = C2770e.metrica;
        sb4.append(c2770e.ad);
        sb4.append('.');
        sb4.append(c2770e.vip);
        license = sb4.toString();
        C11709e Signature = C9616e.Signature(new C12816e("kotlin.jvm.functions.FunctionN"));
        appmetrica = Signature;
        purchase = Signature.ad();
        billing = C12269e.subscription;
        appmetrica(Class.class);
        yandex = new HashMap();
        startapp = new HashMap();
        adcel = new HashMap();
        mopub = new HashMap();
        advert = new HashMap();
        smaato = new HashMap();
        amazon = new LinkedHashSet();
        C11709e Signature2 = C9616e.Signature(AbstractC0206e.premium);
        C12816e c12816e = AbstractC0206e.f1442native;
        C12816e c12816e2 = Signature2.ad;
        C18279e c18279e = new C18279e(appmetrica(Iterable.class), Signature2, new C11709e(c12816e2, AbstractC12475e.appmetrica(c12816e, c12816e2), false));
        C11709e Signature3 = C9616e.Signature(AbstractC0206e.ads);
        C12816e c12816e3 = AbstractC0206e.f1452this;
        C12816e c12816e4 = Signature3.ad;
        C18279e c18279e2 = new C18279e(appmetrica(Iterator.class), Signature3, new C11709e(c12816e4, AbstractC12475e.appmetrica(c12816e3, c12816e4), false));
        C11709e Signature4 = C9616e.Signature(AbstractC0206e.subs);
        C12816e c12816e5 = AbstractC0206e.f1435extends;
        C12816e c12816e6 = Signature4.ad;
        C18279e c18279e3 = new C18279e(appmetrica(Collection.class), Signature4, new C11709e(c12816e6, AbstractC12475e.appmetrica(c12816e5, c12816e6), false));
        C11709e Signature5 = C9616e.Signature(AbstractC0206e.crashlytics);
        C12816e c12816e7 = AbstractC0206e.f1453throw;
        C12816e c12816e8 = Signature5.ad;
        C18279e c18279e4 = new C18279e(appmetrica(List.class), Signature5, new C11709e(c12816e8, AbstractC12475e.appmetrica(c12816e7, c12816e8), false));
        C11709e Signature6 = C9616e.Signature(AbstractC0206e.f1433class);
        C12816e c12816e9 = AbstractC0206e.f1455try;
        C12816e c12816e10 = Signature6.ad;
        C18279e c18279e5 = new C18279e(appmetrica(Set.class), Signature6, new C11709e(c12816e10, AbstractC12475e.appmetrica(c12816e9, c12816e10), false));
        C11709e Signature7 = C9616e.Signature(AbstractC0206e.firebase);
        C12816e c12816e11 = AbstractC0206e.f1456while;
        C12816e c12816e12 = Signature7.ad;
        C18279e c18279e6 = new C18279e(appmetrica(ListIterator.class), Signature7, new C11709e(c12816e12, AbstractC12475e.appmetrica(c12816e11, c12816e12), false));
        C12816e c12816e13 = AbstractC0206e.f1441interface;
        C11709e Signature8 = C9616e.Signature(c12816e13);
        C12816e c12816e14 = AbstractC0206e.f1446protected;
        C12816e c12816e15 = Signature8.ad;
        C18279e c18279e7 = new C18279e(appmetrica(Map.class), Signature8, new C11709e(c12816e15, AbstractC12475e.appmetrica(c12816e14, c12816e15), false));
        C11709e license2 = C9616e.Signature(c12816e13).license(AbstractC0206e.f1437goto.ad.billing());
        C12816e c12816e16 = AbstractC0206e.f1430break;
        C12816e c12816e17 = license2.ad;
        List<C18279e> startapp2 = AbstractC6874e.startapp(c18279e, c18279e2, c18279e3, c18279e4, c18279e5, c18279e6, c18279e7, new C18279e(appmetrica(Map.Entry.class), license2, new C11709e(c12816e17, AbstractC12475e.appmetrica(c12816e16, c12816e17), false)));
        loadAd = startapp2;
        license(Object.class, AbstractC0206e.ad);
        license(String.class, AbstractC0206e.purchase);
        license(CharSequence.class, AbstractC0206e.appmetrica);
        metrica(Throwable.class, AbstractC0206e.mopub);
        license(Cloneable.class, AbstractC0206e.metrica);
        license(Number.class, AbstractC0206e.startapp);
        metrica(Comparable.class, AbstractC0206e.advert);
        license(Enum.class, AbstractC0206e.adcel);
        metrica(Annotation.class, AbstractC0206e.remoteconfig);
        for (C18279e c18279e8 : startapp2) {
            C11709e c11709e = c18279e8.ad;
            C11709e c11709e2 = c18279e8.vip;
            C11709e c11709e3 = c18279e8.metrica;
            ad(c11709e, c11709e2);
            vip(c11709e3.ad(), c11709e);
            advert.put(c11709e3, c11709e2);
            smaato.put(c11709e2, c11709e3);
            C12816e ad2 = c11709e2.ad();
            C12816e ad3 = c11709e3.ad();
            adcel.put(c11709e3.ad().ad, ad2);
            mopub.put(ad2.ad, ad3);
        }
        for (EnumC8790e enumC8790e : EnumC8790e.values()) {
            C12816e c12816e18 = enumC8790e.f17704e;
            if (c12816e18 == null) {
                EnumC8790e.ad(15);
                throw null;
            }
            C11709e c11709e4 = new C11709e(c12816e18.vip(), c12816e18.ad.billing());
            C12816e ad4 = AbstractC4972e.mopub.ad(enumC8790e.license().f8288e);
            ad(c11709e4, new C11709e(ad4.vip(), ad4.ad.billing()));
        }
        for (C11709e c11709e5 : AbstractC17131e.ad) {
            C12816e c12816e19 = new C12816e("kotlin.jvm.internal." + c11709e5.purchase().vip() + "CompanionObject");
            ad(new C11709e(c12816e19.vip(), c12816e19.ad.billing()), c11709e5.license(AbstractC13893e.vip));
        }
        for (int i = 0; i < 23; i++) {
            C12816e c12816e20 = new C12816e(AbstractC1786e.admob(i, "kotlin.jvm.functions.Function"));
            ad(new C11709e(c12816e20.vip(), c12816e20.ad.billing()), new C11709e(AbstractC4972e.mopub, C0520e.appmetrica("Function" + i)));
            vip(new C12816e(AbstractC8647e.isPro(i, vip, new StringBuilder())), billing);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            C2770e c2770e2 = C2770e.metrica;
            vip(new C12816e((c2770e2.ad + '.' + c2770e2.vip) + i2), billing);
        }
        vip(new C12816e("kotlin.concurrent.atomics.AtomicInt"), appmetrica(AtomicInteger.class));
        vip(new C12816e("kotlin.concurrent.atomics.AtomicLong"), appmetrica(AtomicLong.class));
        vip(new C12816e("kotlin.concurrent.atomics.AtomicBoolean"), appmetrica(AtomicBoolean.class));
        vip(new C12816e("kotlin.concurrent.atomics.AtomicReference"), appmetrica(AtomicReference.class));
        vip(new C12816e("kotlin.concurrent.atomics.AtomicIntArray"), appmetrica(AtomicIntegerArray.class));
        vip(new C12816e("kotlin.concurrent.atomics.AtomicLongArray"), appmetrica(AtomicLongArray.class));
        vip(new C12816e("kotlin.concurrent.atomics.AtomicArray"), appmetrica(AtomicReferenceArray.class));
        vip(AbstractC0206e.vip.startapp(), appmetrica(Void.class));
    }

    public static void ad(C11709e c11709e, C11709e c11709e2) {
        yandex.put(c11709e.ad().ad, c11709e2);
        vip(c11709e2.ad(), c11709e);
    }

    public static C11709e appmetrica(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return appmetrica(declaringClass).license(C0520e.appmetrica(cls.getSimpleName()));
        }
        C12816e c12816e = new C12816e(cls.getCanonicalName());
        return new C11709e(c12816e.vip(), c12816e.ad.billing());
    }

    public static C11709e billing(C13579e c13579e) {
        return (purchase(c13579e, ad) || purchase(c13579e, metrica)) ? appmetrica : (purchase(c13579e, vip) || purchase(c13579e, license)) ? billing : (C11709e) startapp.get(c13579e);
    }

    public static void license(Class cls, C13579e c13579e) {
        metrica(cls, c13579e.startapp());
    }

    public static void metrica(Class cls, C12816e c12816e) {
        ad(appmetrica(cls), new C11709e(c12816e.vip(), c12816e.ad.billing()));
    }

    public static boolean purchase(C13579e c13579e, String str) {
        Integer signatures;
        String str2 = c13579e.ad;
        if (AbstractC6507e.pro(str2, str, false)) {
            String substring = str2.substring(str.length());
            if (!AbstractC5304e.m1864instanceof(substring, '0') && (signatures = AbstractC6507e.signatures(substring)) != null && signatures.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    public static void vip(C12816e c12816e, C11709e c11709e) {
        amazon.add(c12816e);
        startapp.put(c12816e.ad, c11709e);
    }

    public static C12816e yandex(C13579e c13579e) {
        return (C12816e) mopub.get(c13579e);
    }
}
