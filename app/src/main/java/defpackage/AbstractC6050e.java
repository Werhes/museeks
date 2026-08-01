package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۦؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6050e {
    public static final C8268e ad;
    public static final C8268e adcel;
    public static final C6114e advert;
    public static final C5399e amazon;
    public static final C8268e appmetrica;
    public static final C8268e billing;
    public static final C8268e license;
    public static final HashMap loadAd;
    public static final C8268e metrica;
    public static final C10990e mopub;
    public static final C8268e purchase;
    public static final C1400e smaato;
    public static final C8268e startapp;
    public static final C8268e vip;
    public static final C8268e yandex;

    static {
        C4824e c4824e = C4824e.f10285e;
        C8268e c8268e = new C8268e(c4824e, 0);
        ad = c8268e;
        C4824e c4824e2 = C4824e.f10284e;
        C8268e c8268e2 = new C8268e(c4824e2, 1);
        vip = c8268e2;
        C4824e c4824e3 = C4824e.f10287e;
        C8268e c8268e3 = new C8268e(c4824e3, 2);
        metrica = c8268e3;
        C4824e c4824e4 = C4824e.f10292e;
        C8268e c8268e4 = new C8268e(c4824e4, 3);
        license = c8268e4;
        C4824e c4824e5 = C4824e.f10288e;
        C8268e c8268e5 = new C8268e(c4824e5, 4);
        appmetrica = c8268e5;
        C4824e c4824e6 = C4824e.f10291e;
        C8268e c8268e6 = new C8268e(c4824e6, 5);
        purchase = c8268e6;
        C4824e c4824e7 = C4824e.f10290e;
        C8268e c8268e7 = new C8268e(c4824e7, 6);
        billing = c8268e7;
        C4824e c4824e8 = C4824e.f10286e;
        C8268e c8268e8 = new C8268e(c4824e8, 7);
        yandex = c8268e8;
        C4824e c4824e9 = C4824e.f10289e;
        C8268e c8268e9 = new C8268e(c4824e9, 8);
        startapp = c8268e9;
        DesugarCollections.unmodifiableSet(AbstractC1660e.m664case(new C8268e[]{c8268e, c8268e2, c8268e4, c8268e6}));
        HashMap hashMap = new HashMap(6);
        hashMap.put(c8268e2, 0);
        hashMap.put(c8268e, 0);
        hashMap.put(c8268e4, 1);
        hashMap.put(c8268e3, 1);
        hashMap.put(c8268e5, 2);
        DesugarCollections.unmodifiableMap(hashMap);
        adcel = c8268e5;
        int i = 28;
        mopub = new C10990e(i);
        advert = new C6114e(i);
        smaato = new C1400e(i);
        try {
            Iterator it = Arrays.asList(new C5399e[0]).iterator();
            amazon = it.hasNext() ? (C5399e) it.next() : C5399e.ad;
            HashMap hashMap2 = new HashMap();
            loadAd = hashMap2;
            hashMap2.put(c4824e, c8268e);
            hashMap2.put(c4824e2, c8268e2);
            hashMap2.put(c4824e3, c8268e3);
            hashMap2.put(c4824e4, c8268e4);
            hashMap2.put(c4824e5, c8268e5);
            hashMap2.put(c4824e6, c8268e6);
            hashMap2.put(c4824e7, c8268e7);
            hashMap2.put(c4824e8, c8268e8);
            hashMap2.put(c4824e9, c8268e9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void ad(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6050e.ad(int):void");
    }

    public static boolean appmetrica(C8268e c8268e) {
        if (c8268e != null) {
            return c8268e == ad || c8268e == vip;
        }
        ad(14);
        throw null;
    }

    public static boolean license(InterfaceC0091e interfaceC0091e, InterfaceC15498e interfaceC15498e) {
        if (interfaceC15498e == null) {
            ad(7);
            throw null;
        }
        C9616e appmetrica2 = AbstractC14300e.appmetrica(interfaceC15498e);
        if (appmetrica2 != C9616e.f19068e) {
            return appmetrica2.equals(AbstractC14300e.appmetrica(interfaceC0091e));
        }
        return false;
    }

    public static InterfaceC0091e metrica(InterfaceC13969e interfaceC13969e, InterfaceC0091e interfaceC0091e, InterfaceC15498e interfaceC15498e) {
        InterfaceC0091e metrica2;
        if (interfaceC0091e == null) {
            ad(8);
            throw null;
        }
        if (interfaceC15498e == null) {
            ad(9);
            throw null;
        }
        for (InterfaceC0091e interfaceC0091e2 = (InterfaceC0091e) interfaceC0091e.vip(); interfaceC0091e2 != null && interfaceC0091e2.advert() != purchase; interfaceC0091e2 = (InterfaceC0091e) AbstractC14300e.yandex(interfaceC0091e2, InterfaceC0091e.class, true)) {
            if (!interfaceC0091e2.advert().ad(interfaceC13969e, interfaceC0091e2, interfaceC15498e)) {
                return interfaceC0091e2;
            }
        }
        if (!(interfaceC0091e instanceof InterfaceC13032e) || (metrica2 = metrica(interfaceC13969e, ((C11245e) ((InterfaceC13032e) interfaceC0091e)).f22535e, interfaceC15498e)) == null) {
            return null;
        }
        return metrica2;
    }

    public static C8268e purchase(AbstractC1984e abstractC1984e) {
        if (abstractC1984e == null) {
            ad(15);
            throw null;
        }
        C8268e c8268e = (C8268e) loadAd.get(abstractC1984e);
        if (c8268e != null) {
            return c8268e;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + abstractC1984e);
    }

    public static Integer vip(C8268e c8268e, C8268e c8268e2) {
        if (c8268e == null) {
            ad(12);
            throw null;
        }
        AbstractC1984e abstractC1984e = c8268e.ad;
        if (c8268e2 == null) {
            ad(13);
            throw null;
        }
        AbstractC1984e abstractC1984e2 = c8268e2.ad;
        Integer vip2 = abstractC1984e.vip(abstractC1984e2);
        if (vip2 != null) {
            return vip2;
        }
        Integer vip3 = abstractC1984e2.vip(abstractC1984e);
        if (vip3 != null) {
            return Integer.valueOf(-vip3.intValue());
        }
        return null;
    }
}
