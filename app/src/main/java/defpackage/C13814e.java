package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13814e {
    public static final C18521e ad;

    static {
        C18521e c18521e = new C18521e();
        c18521e.ad(AbstractC5745e.ad);
        c18521e.ad(AbstractC5745e.vip);
        c18521e.ad(AbstractC5745e.metrica);
        c18521e.ad(AbstractC5745e.license);
        c18521e.ad(AbstractC5745e.appmetrica);
        c18521e.ad(AbstractC5745e.purchase);
        c18521e.ad(AbstractC5745e.billing);
        c18521e.ad(AbstractC5745e.yandex);
        c18521e.ad(AbstractC5745e.startapp);
        c18521e.ad(AbstractC5745e.adcel);
        c18521e.ad(AbstractC5745e.mopub);
        c18521e.ad(AbstractC5745e.advert);
        ad = c18521e;
    }

    public static C11771e ad(C11505e c11505e, InterfaceC11824e interfaceC11824e, C17221e c17221e) {
        String m3608try;
        C17758e c17758e = (C17758e) AbstractC0863e.appmetrica(c11505e, AbstractC5745e.ad);
        String string = (c17758e == null || (c17758e.f34834e & 1) != 1) ? "<init>" : interfaceC11824e.getString(c17758e.f34833e);
        if (c17758e == null || (c17758e.f34834e & 2) != 2) {
            List list = c11505e.f23116e;
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String appmetrica = appmetrica(AbstractC17110e.pro((C10067e) it.next(), c17221e), interfaceC11824e);
                if (appmetrica == null) {
                    return null;
                }
                arrayList.add(appmetrica);
            }
            m3608try = AbstractC13480e.m3608try(arrayList, BuildConfig.FLAVOR, "(", ")V", null, 56);
        } else {
            m3608try = interfaceC11824e.getString(c17758e.f34835e);
        }
        return new C11771e(string, m3608try);
    }

    public static String appmetrica(C13212e c13212e, InterfaceC11824e interfaceC11824e) {
        if (c13212e.Signature()) {
            return AbstractC13133e.vip(interfaceC11824e.ad(c13212e.f26235e));
        }
        return null;
    }

    public static final C6571e billing(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC0184e.ad(strArr));
        C6746e yandex = yandex(byteArrayInputStream, strArr2);
        C13141e c13141e = C9920e.f19580e;
        c13141e.getClass();
        C4285e c4285e = new C4285e(byteArrayInputStream);
        AbstractC6649e abstractC6649e = (AbstractC6649e) c13141e.ad(c4285e, ad);
        try {
            c4285e.ad(0);
            C13141e.vip(abstractC6649e);
            return new C6571e(yandex, (C9920e) abstractC6649e);
        } catch (C14226e e) {
            e.f28108e = abstractC6649e;
            throw e;
        }
    }

    public static final boolean license(C17485e c17485e) {
        return AbstractC14839e.ad.appmetrica(((Number) c17485e.mopub(AbstractC5745e.appmetrica)).intValue()).booleanValue();
    }

    public static C11771e metrica(C9920e c9920e, InterfaceC11824e interfaceC11824e, C17221e c17221e) {
        String signatures;
        C17758e c17758e = (C17758e) AbstractC0863e.appmetrica(c9920e, AbstractC5745e.vip);
        int i = (c17758e == null || (c17758e.f34834e & 1) != 1) ? c9920e.f19603e : c17758e.f34833e;
        if (c17758e == null || (c17758e.f34834e & 2) != 2) {
            List adcel = AbstractC6874e.adcel(AbstractC17110e.loadAd(c9920e, c17221e));
            List list = c9920e.f19593e;
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC17110e.pro((C10067e) it.next(), c17221e));
            }
            ArrayList m3584final = AbstractC13480e.m3584final(adcel, arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(m3584final, 10));
            Iterator it2 = m3584final.iterator();
            while (it2.hasNext()) {
                String appmetrica = appmetrica((C13212e) it2.next(), interfaceC11824e);
                if (appmetrica == null) {
                    return null;
                }
                arrayList2.add(appmetrica);
            }
            String appmetrica2 = appmetrica(AbstractC17110e.admob(c9920e, c17221e), interfaceC11824e);
            if (appmetrica2 == null) {
                return null;
            }
            signatures = AbstractC1786e.signatures(new StringBuilder(), AbstractC13480e.m3608try(arrayList2, BuildConfig.FLAVOR, "(", ")", null, 56), appmetrica2);
        } else {
            signatures = interfaceC11824e.getString(c17758e.f34835e);
        }
        return new C11771e(interfaceC11824e.getString(i), signatures);
    }

    public static final C6571e purchase(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC0184e.ad(strArr));
        C6746e yandex = yandex(byteArrayInputStream, strArr2);
        C13141e c13141e = C2009e.f5256e;
        c13141e.getClass();
        C4285e c4285e = new C4285e(byteArrayInputStream);
        AbstractC6649e abstractC6649e = (AbstractC6649e) c13141e.ad(c4285e, ad);
        try {
            c4285e.ad(0);
            C13141e.vip(abstractC6649e);
            return new C6571e(yandex, (C2009e) abstractC6649e);
        } catch (C14226e e) {
            e.f28108e = abstractC6649e;
            throw e;
        }
    }

    public static final C6571e startapp(String[] strArr, String[] strArr2) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC0184e.ad(strArr));
        C6746e yandex = yandex(byteArrayInputStream, strArr2);
        C13141e c13141e = C14882e.f29475e;
        c13141e.getClass();
        C4285e c4285e = new C4285e(byteArrayInputStream);
        AbstractC6649e abstractC6649e = (AbstractC6649e) c13141e.ad(c4285e, ad);
        try {
            c4285e.ad(0);
            C13141e.vip(abstractC6649e);
            return new C6571e(yandex, (C14882e) abstractC6649e);
        } catch (C14226e e) {
            e.f28108e = abstractC6649e;
            throw e;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x003e: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0040 A[HIDDEN]
          (r4v2 java.lang.String) from 0x0041: PHI (r4v3 java.lang.String) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:20:0x003e, B:15:0x002f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static defpackage.C13769e vip(defpackage.C17485e r4, defpackage.InterfaceC11824e r5, defpackage.C17221e r6, boolean r7) {
        /*
            eَؗۡ r0 = defpackage.AbstractC5745e.license
            java.lang.Object r0 = defpackage.AbstractC0863e.appmetrica(r4, r0)
            eؖۢؔ r0 = (defpackage.C4442e) r0
            r1 = 0
            if (r0 != 0) goto Lc
            goto L40
        Lc:
            int r2 = r0.f9640e
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L15
            eٗ۠ r0 = r0.f9639e
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 != 0) goto L1b
            if (r7 == 0) goto L1b
            goto L40
        L1b:
            if (r0 == 0) goto L25
            int r7 = r0.f33937e
            r7 = r7 & r3
            if (r7 != r3) goto L25
            int r7 = r0.f33936e
            goto L27
        L25:
            int r7 = r4.f34278e
        L27:
            if (r0 == 0) goto L36
            int r2 = r0.f33937e
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L36
            int r4 = r0.f33938e
            java.lang.String r4 = r5.getString(r4)
            goto L41
        L36:
            eِْۜ r4 = defpackage.AbstractC17110e.subscription(r4, r6)
            java.lang.String r4 = appmetrica(r4, r5)
            if (r4 != 0) goto L41
        L40:
            return r1
        L41:
            eۣٓؕ r6 = new eۣٓؕ
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13814e.vip(e٘ؒ, eِٚ, eٗۘۘ, boolean):eۣٓؕ");
    }

    public static C6746e yandex(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        return new C6746e((C12499e) C12499e.f25031e.metrica(byteArrayInputStream, ad), strArr);
    }
}
