package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11941e {
    public static final C11941e ad = new Object();

    public static final Object ad(InterfaceC1686e interfaceC1686e, C0086e c0086e, C6046e c6046e) {
        List list = c0086e.metrica;
        if (list.isEmpty() || c0086e.purchase) {
            return ad.appmetrica(interfaceC1686e, c0086e, c6046e);
        }
        int appmetrica = AbstractC10064e.appmetrica(AbstractC0746e.subscription(list, 10));
        if (appmetrica < 16) {
            appmetrica = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica);
        for (Object obj : list) {
            linkedHashMap.put(((AbstractC16049e) obj).getAd(), obj);
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC16049e) it.next()).getAd());
        }
        return AbstractC6537e.vip(arrayList, linkedHashMap, true);
    }

    public static C7838e metrica() {
        C12894e c12894e = C7838e.f15858e;
        if (c12894e == null) {
            c12894e = null;
        }
        return (C7838e) ((C14136e) c12894e.f25751e).invoke();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(4:19|20|21|22))(3:24|(2:26|(5:28|(1:30)|20|21|22)(2:32|33))(2:34|(1:36)(2:38|39))|31)))|44|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009a, code lost:
    
        if (defpackage.AbstractC5336e.advert(r6, r7, r0) == r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0038, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006e, code lost:
    
        r6 = new defpackage.C12763e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        r6 = new defpackage.C12763e(r6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.C0086e r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C15527e
            if (r0 == 0) goto L13
            r0 = r7
            eٕ٘ؖ r0 = (defpackage.C15527e) r0
            int r1 = r0.f30665e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30665e = r1
            goto L18
        L13:
            eٕ٘ؖ r0 = new eٕ٘ؖ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f30666e
            int r1 = r0.f30665e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            defpackage.AbstractC2003e.purchase(r7)     // Catch: java.lang.Throwable -> L29
            goto L9d
        L29:
            r6 = move-exception
            goto La0
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.AbstractC2003e.purchase(r7)     // Catch: java.lang.Throwable -> L38
            goto L6b
        L38:
            r6 = move-exception
            goto L6e
        L3a:
            defpackage.AbstractC2003e.purchase(r7)
            eۣٔؖ r6 = r6.ad
            boolean r7 = r6 instanceof defpackage.C1703e
            r1 = 0
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r7 == 0) goto L7f
            eًٍۘ r7 = metrica()
            eِ٘ٚ r7 = r7.f15868e
            eٍؓ r6 = (defpackage.C1703e) r6
            java.lang.String r6 = r6.ad
            eٌٔۤ r6 = r7.startapp(r6)
            if (r6 == 0) goto L7c
            eّٕٓ r7 = defpackage.AbstractC6731e.ad     // Catch: java.lang.Throwable -> L38
            eْؐؔ r7 = defpackage.AbstractC1497e.ad     // Catch: java.lang.Throwable -> L38
            eْؐؔ r7 = r7.f25795e     // Catch: java.lang.Throwable -> L38
            eؚ٘ۥ r2 = new eؚ٘ۥ     // Catch: java.lang.Throwable -> L38
            r5 = 5
            r2.<init>(r6, r1, r5)     // Catch: java.lang.Throwable -> L38
            r0.f30665e = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r6 = defpackage.AbstractC5336e.advert(r7, r2, r0)     // Catch: java.lang.Throwable -> L38
            if (r6 != r4) goto L6b
            goto L9c
        L6b:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L38
            goto L74
        L6e:
            eّۜۖ r7 = new eّۜۖ
            r7.<init>(r6)
            r6 = r7
        L74:
            boolean r6 = r6 instanceof defpackage.C12763e
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto Lad
        L7c:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L7f:
            eؘؔۡ r7 = defpackage.C2406e.ad
            boolean r6 = defpackage.AbstractC7890e.billing(r6, r7)
            if (r6 == 0) goto Lae
            eّٕٓ r6 = defpackage.AbstractC6731e.ad     // Catch: java.lang.Throwable -> L29
            eْؐؔ r6 = defpackage.AbstractC1497e.ad     // Catch: java.lang.Throwable -> L29
            eْؐؔ r6 = r6.f25795e     // Catch: java.lang.Throwable -> L29
            eّٖٙ r7 = new eّٖٙ     // Catch: java.lang.Throwable -> L29
            r5 = 20
            r7.<init>(r2, r5, r1)     // Catch: java.lang.Throwable -> L29
            r0.f30665e = r2     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = defpackage.AbstractC5336e.advert(r6, r7, r0)     // Catch: java.lang.Throwable -> L29
            if (r6 != r4) goto L9d
        L9c:
            return r4
        L9d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L29
            goto La6
        La0:
            eّۜۖ r7 = new eّۜۖ
            r7.<init>(r6)
            r6 = r7
        La6:
            boolean r6 = r6 instanceof defpackage.C12763e
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
        Lad:
            return r6
        Lae:
            eٔٚؖ r6 = new eٔٚؖ
            r7 = 10
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11941e.vip(eؑؕٗ, eُؑ۠):java.lang.Object");
    }

    public final Object appmetrica(InterfaceC1686e interfaceC1686e, C0086e c0086e, AbstractC10731e abstractC10731e) {
        if (interfaceC1686e instanceof InterfaceC17992e) {
            return license((InterfaceC17992e) interfaceC1686e, c0086e, abstractC10731e);
        }
        InterfaceC5083e interfaceC5083e = null;
        if (interfaceC1686e instanceof InterfaceC11116e) {
            return purchase(c0086e, new C0323e(interfaceC1686e, interfaceC5083e, 0), abstractC10731e);
        }
        if (interfaceC1686e instanceof InterfaceC4079e) {
            return purchase(c0086e, new C0323e(interfaceC1686e, interfaceC5083e, 1), abstractC10731e);
        }
        throw new C14803e(10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        if (r13 < 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0138 A[LOOP:0: B:15:0x0132->B:17:0x0138, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(defpackage.InterfaceC17992e r11, defpackage.C0086e r12, defpackage.AbstractC10731e r13) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11941e.license(eْ٘ۚ, eؑؕٗ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[LOOP:0: B:14:0x0059->B:16:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[LOOP:1: B:19:0x007b->B:21:0x0081, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchase(defpackage.C0086e r5, kotlin.jvm.functions.Function1 r6, defpackage.AbstractC10731e r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.C5596e
            if (r0 == 0) goto L13
            r0 = r7
            eؘّؑ r0 = (defpackage.C5596e) r0
            int r1 = r0.f11952e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11952e = r1
            goto L18
        L13:
            eؘّؑ r0 = new eؘّؑ
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f11950e
            int r1 = r0.f11952e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eؑؕٗ r5 = r0.f11951e
            defpackage.AbstractC2003e.purchase(r7)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r7)
            r0.f11951e = r5
            r0.f11952e = r2
            java.lang.Object r7 = r6.invoke(r0)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r7 != r6) goto L3f
            return r6
        L3f:
            java.util.List r7 = (java.util.List) r7
            r6 = 10
            int r0 = defpackage.AbstractC0746e.subscription(r7, r6)
            int r0 = defpackage.AbstractC10064e.appmetrica(r0)
            r1 = 16
            if (r0 >= r1) goto L50
            r0 = r1
        L50:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r0 = r7.iterator()
        L59:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r0.next()
            r3 = r2
            eؙٖۛ r3 = (defpackage.AbstractC16049e) r3
            java.lang.String r3 = r3.getAd()
            r1.put(r3, r2)
            goto L59
        L6e:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r6 = defpackage.AbstractC0746e.subscription(r7, r6)
            r0.<init>(r6)
            java.util.Iterator r6 = r7.iterator()
        L7b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8f
            java.lang.Object r7 = r6.next()
            eؙٖۛ r7 = (defpackage.AbstractC16049e) r7
            java.lang.String r7 = r7.getAd()
            r0.add(r7)
            goto L7b
        L8f:
            boolean r5 = r5.purchase
            if (r5 == 0) goto L9a
            java.util.List r0 = defpackage.AbstractC13480e.m3583e(r0)
            java.util.Collections.shuffle(r0)
        L9a:
            r5 = 0
            eٜؑ٘ r5 = defpackage.AbstractC6537e.vip(r0, r1, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11941e.purchase(eؑؕٗ, kotlin.jvm.functions.Function1, eُؑ۠):java.lang.Object");
    }
}
