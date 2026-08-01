package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16155e {
    public static final C2892e ad = new C2892e(1449428131, false, new C2131e(13));
    public static final C2892e vip = new C2892e(-748296189, false, new C2131e(14));
    public static final C2892e metrica = new C2892e(1006157473, false, new C2131e(15));
    public static final C2892e license = new C2892e(2050698466, false, new C2131e(16));
    public static final C2892e appmetrica = new C2892e(1212592272, false, new C9375e(11));
    public static final C2892e purchase = new C2892e(-327621172, false, new C13428e(0));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.AbstractC11424e r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C0686e
            if (r0 == 0) goto L13
            r0 = r7
            eؑۥؚ r0 = (defpackage.C0686e) r0
            int r1 = r0.f2981e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2981e = r1
            goto L18
        L13:
            eؑۥؚ r0 = new eؑۥؚ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2979e
            int r1 = r0.f2981e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eُۨۨ r6 = r0.f2980e
            defpackage.AbstractC2003e.purchase(r7)
            goto L75
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.AbstractC2003e.purchase(r7)
            java.lang.Object r7 = r6.f22964e
            eًَۨ r7 = (defpackage.InterfaceC8376e) r7
            eْۧؕ r7 = r7.license()
            eً٘ۤ r7 = r7.ad()
            java.lang.String r1 = "Host"
            java.util.List r7 = r7.mo457e(r1)
            if (r7 != 0) goto L49
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L49:
            int r7 = r7.size()
            if (r7 <= r2) goto L78
            java.lang.Object r7 = r6.f22964e
            eًَۨ r7 = (defpackage.InterfaceC8376e) r7
            eۣؔؗ r1 = defpackage.C2394e.f6113e
            eؙّؔ r3 = defpackage.AbstractC3820e.ad
            java.lang.Class<eۣؔؗ> r4 = defpackage.C2394e.class
            eؚ٘ٚ r3 = r3.vip(r4)
            eٓٔۖ r4 = defpackage.AbstractC3820e.ad(r4)     // Catch: java.lang.Throwable -> L62
            goto L63
        L62:
            r4 = 0
        L63:
            eِ۟ۥ r5 = new eِ۟ۥ
            r5.<init>(r3, r4)
            r0.f2980e = r6
            r0.f2981e = r2
            java.lang.Object r7 = r7.mo325static(r1, r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r7 != r0) goto L75
            goto L7a
        L75:
            r6.vip()
        L78:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16155e.ad(eُۨۨ, eُؑ۠):java.lang.Object");
    }

    public static final AbstractC1186e adcel(AbstractC1186e abstractC1186e) {
        advert(abstractC1186e);
        if (abstractC1186e.getAnnotations().license(AbstractC0206e.Signature) == null) {
            return null;
        }
        return ((AbstractC16232e) abstractC1186e.mopub().get(appmetrica(abstractC1186e))).vip();
    }

    public static final boolean advert(AbstractC1186e abstractC1186e) {
        AbstractC13445e abstractC13445e;
        InterfaceC4077e advert = abstractC1186e.loadAd().advert();
        if (advert == null) {
            return false;
        }
        if ((advert instanceof InterfaceC5052e) && AbstractC13270e.m3539this(advert)) {
            int i = AbstractC2876e.ad;
            abstractC13445e = startapp(AbstractC14300e.purchase(advert));
        } else {
            abstractC13445e = null;
        }
        return AbstractC7890e.billing(abstractC13445e, C7692e.metrica) || AbstractC7890e.billing(abstractC13445e, C2597e.metrica);
    }

    public static boolean amazon(int i, Context context, String str) {
        C12698e ad2 = C5277e.ad(context);
        ad2.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) ((Context) ad2.ad).getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static final int appmetrica(AbstractC1186e abstractC1186e) {
        InterfaceC16566e license2 = abstractC1186e.getAnnotations().license(AbstractC0206e.admob);
        if (license2 == null) {
            return 0;
        }
        return ((Number) ((C2144e) ((AbstractC13656e) AbstractC10064e.license(AbstractC4972e.appmetrica, license2.advert()))).ad).intValue();
    }

    public static final C0520e billing(AbstractC1186e abstractC1186e) {
        String str;
        InterfaceC16566e license2 = abstractC1186e.getAnnotations().license(AbstractC0206e.subscription);
        if (license2 == null) {
            return null;
        }
        Object m3599static = AbstractC13480e.m3599static(license2.advert().values());
        C17804e c17804e = m3599static instanceof C17804e ? (C17804e) m3599static : null;
        if (c17804e != null && (str = (String) c17804e.ad) != null) {
            if (!C0520e.purchase(str)) {
                str = null;
            }
            if (str != null) {
                return C0520e.appmetrica(str);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    public static final C6195e license(C6195e c6195e, List list) {
        List singletonList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        ArrayList arrayList3 = null;
        for (InterfaceC5142e interfaceC5142e : c6195e.ad) {
            if (interfaceC5142e instanceof C13259e) {
                if (arrayList3 != null) {
                    arrayList3.addAll(((C13259e) interfaceC5142e).ad);
                } else {
                    arrayList3 = new ArrayList(((C13259e) interfaceC5142e).ad);
                }
            } else if (interfaceC5142e instanceof C14795e) {
                arrayList2.add(interfaceC5142e);
            } else {
                if (arrayList3 != null) {
                    arrayList.add(new C13259e(arrayList3));
                    arrayList3 = null;
                }
                arrayList.add(interfaceC5142e);
            }
        }
        List list2 = c6195e.vip;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C6195e license2 = license((C6195e) it.next(), arrayList2);
            if (license2.ad.isEmpty()) {
                singletonList = license2.vip;
                if (singletonList.isEmpty()) {
                    singletonList = Collections.singletonList(license2);
                }
            } else {
                singletonList = Collections.singletonList(license2);
            }
            AbstractC13480e.inmobi(arrayList4, singletonList);
        }
        boolean isEmpty = arrayList4.isEmpty();
        ArrayList<C6195e> arrayList5 = arrayList4;
        if (isEmpty) {
            arrayList5 = Collections.singletonList(new C6195e(arrayList2, C13664e.f27089e));
        }
        if (arrayList3 == null) {
            return new C6195e(arrayList, arrayList5);
        }
        if (!arrayList5.isEmpty()) {
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                InterfaceC5142e interfaceC5142e2 = (InterfaceC5142e) AbstractC13480e.m3604this(((C6195e) it2.next()).ad);
                if (interfaceC5142e2 != null && (interfaceC5142e2 instanceof C13259e)) {
                    ArrayList arrayList6 = new ArrayList(AbstractC0746e.subscription(arrayList5, 10));
                    for (C6195e c6195e2 : arrayList5) {
                        List list3 = c6195e2.ad;
                        List list4 = c6195e2.vip;
                        InterfaceC5142e interfaceC5142e3 = (InterfaceC5142e) AbstractC13480e.m3604this(list3);
                        arrayList6.add(interfaceC5142e3 instanceof C13259e ? new C6195e(AbstractC13480e.m3584final(Collections.singletonList(new C13259e(AbstractC13480e.m3584final(arrayList3, ((C13259e) interfaceC5142e3).ad))), AbstractC13480e.subs(1, list3)), list4) : interfaceC5142e3 == null ? new C6195e(Collections.singletonList(new C13259e(arrayList3)), list4) : new C6195e(AbstractC13480e.m3584final(Collections.singletonList(new C13259e(arrayList3)), list3), list4));
                    }
                    return new C6195e(arrayList, arrayList6);
                }
            }
        }
        arrayList.add(new C13259e(arrayList3));
        return new C6195e(arrayList, arrayList5);
    }

    public static final C6195e metrica(C6195e c6195e, C6195e c6195e2) {
        List list = c6195e.vip;
        List list2 = c6195e.ad;
        if (list.isEmpty()) {
            return new C6195e(AbstractC13480e.m3584final(list2, c6195e2.ad), c6195e2.vip);
        }
        List list3 = c6195e.vip;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(metrica((C6195e) it.next(), c6195e2));
        }
        return new C6195e(list2, arrayList);
    }

    public static final List mopub(AbstractC1186e abstractC1186e) {
        advert(abstractC1186e);
        List mopub = abstractC1186e.mopub();
        return mopub.subList(((!advert(abstractC1186e) || abstractC1186e.getAnnotations().license(AbstractC0206e.Signature) == null) ? 0 : 1) + appmetrica(abstractC1186e), mopub.size() - 1);
    }

    public static final AbstractC10226e purchase(AbstractC13270e abstractC13270e, InterfaceC2460e interfaceC2460e, AbstractC1186e abstractC1186e, List list, ArrayList arrayList, AbstractC1186e abstractC1186e2, boolean z) {
        InterfaceC5052e mopub;
        InterfaceC2460e interfaceC2460e2 = C4590e.f9885e;
        int i = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (abstractC1186e != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(new C7878e((AbstractC1186e) it.next()));
        }
        arrayList2.addAll(arrayList3);
        AbstractC9386e.vip(arrayList2, abstractC1186e != null ? new C7878e(1, abstractC1186e) : null);
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC6874e.Signature();
                throw null;
            }
            arrayList2.add(new C7878e((AbstractC1186e) next));
            i2 = i3;
        }
        arrayList2.add(new C7878e(abstractC1186e2));
        int size = list.size() + arrayList.size() + (abstractC1186e == null ? 0 : 1);
        if (z) {
            mopub = abstractC13270e.tapsense(size);
        } else {
            C0520e c0520e = AbstractC4972e.ad;
            mopub = abstractC13270e.mopub("Function" + size);
        }
        if (abstractC1186e != null) {
            C12816e c12816e = AbstractC0206e.Signature;
            if (!interfaceC2460e.amazon(c12816e)) {
                ArrayList m3571case = AbstractC13480e.m3571case(interfaceC2460e, new C16434e(abstractC13270e, c12816e, C9139e.f18290e));
                interfaceC2460e = m3571case.isEmpty() ? interfaceC2460e2 : new C4155e(i, m3571case);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            C12816e c12816e2 = AbstractC0206e.admob;
            if (!interfaceC2460e.amazon(c12816e2)) {
                ArrayList m3571case2 = AbstractC13480e.m3571case(interfaceC2460e, new C16434e(abstractC13270e, c12816e2, Collections.singletonMap(AbstractC4972e.appmetrica, new C2144e(size2))));
                if (!m3571case2.isEmpty()) {
                    interfaceC2460e2 = new C4155e(i, m3571case2);
                }
                interfaceC2460e = interfaceC2460e2;
            }
        }
        return AbstractC1596e.license(AbstractC1660e.m673protected(interfaceC2460e), mopub.mo1459goto(), arrayList2, false);
    }

    public static boolean smaato(Context context, int i) {
        if (amazon(i, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                C6274e ad2 = C6274e.ad(context);
                ad2.getClass();
                if (packageInfo != null) {
                    if (!C6274e.metrica(packageInfo, false)) {
                        if (C6274e.metrica(packageInfo, true)) {
                            if (!AbstractC18410e.ad(ad2.ad)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static final AbstractC13445e startapp(C13579e c13579e) {
        C15857e ad2;
        if (!c13579e.license() || c13579e.metrica() || (ad2 = C1955e.vip.ad(c13579e.startapp().vip(), c13579e.billing().vip())) == null) {
            return null;
        }
        return ad2.ad;
    }

    public static final C6195e vip(List list) {
        C13664e c13664e = C13664e.f27089e;
        C6195e c6195e = new C6195e(c13664e, c13664e);
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                c6195e = metrica((C6195e) listIterator.previous(), c6195e);
            }
        }
        return license(c6195e, c13664e);
    }

    public static final List yandex(AbstractC1186e abstractC1186e) {
        advert(abstractC1186e);
        int appmetrica2 = appmetrica(abstractC1186e);
        if (appmetrica2 == 0) {
            return C13664e.f27089e;
        }
        List subList = abstractC1186e.mopub().subList(0, appmetrica2);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(subList, 10));
        Iterator it = subList.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC16232e) it.next()).vip());
        }
        return arrayList;
    }
}
