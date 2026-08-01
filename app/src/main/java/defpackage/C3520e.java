package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؕٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3520e extends AbstractC11069e {
    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C17196e c17196e = (C17196e) obj;
        String str = c17196e.f33716e;
        String str2 = c17196e.f33719e;
        String str3 = c17196e.f33715e;
        c17790e.m4424case(c17196e.ad());
        String str4 = c17196e.f33717e;
        boolean billing = AbstractC7890e.billing(str4, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.adcel(c17790e, 6, str4);
        }
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 5, str3);
        }
        int i = c17196e.f33718e;
        if (i != 0) {
            AbstractC11069e.billing.adcel(c17790e, 4, Integer.valueOf(i));
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e.adcel(c17790e, 3, str2);
        }
        EnumC6972e enumC6972e = c17196e.f33714e;
        if (enumC6972e != EnumC6972e.SOCKS5) {
            EnumC6972e.f14290e.adcel(c17790e, 2, enumC6972e);
        }
        if (AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            return;
        }
        c14808e.adcel(c17790e, 1, str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0018. Please report as an issue. */
    @Override // defpackage.AbstractC11069e
    public final java.lang.Object metrica(defpackage.C17546e r14) {
        /*
            r13 = this;
            eؙؚؔ r0 = defpackage.EnumC6972e.SOCKS5
            long r1 = r14.license()
            java.lang.String r3 = ""
            r4 = 0
            r5 = r3
            r7 = r5
            r9 = r7
            r10 = r9
            r8 = r4
        Le:
            r3 = r0
        Lf:
            int r4 = r14.billing()
            r0 = -1
            if (r4 == r0) goto L62
            eٔٚٗ r0 = defpackage.AbstractC11069e.Signature
            switch(r4) {
                case 1: goto L59;
                case 2: goto L45;
                case 3: goto L3c;
                case 4: goto L31;
                case 5: goto L28;
                case 6: goto L1f;
                default: goto L1b;
            }
        L1b:
            r14.smaato(r4)
            goto Lf
        L1f:
            r0.getClass()
            java.lang.String r0 = r14.advert()
            r10 = r0
            goto Lf
        L28:
            r0.getClass()
            java.lang.String r0 = r14.advert()
            r9 = r0
            goto Lf
        L31:
            eٔٚٗ r0 = defpackage.AbstractC11069e.billing
            r0.getClass()
            int r0 = r14.amazon()
            r8 = r0
            goto Lf
        L3c:
            r0.getClass()
            java.lang.String r0 = r14.advert()
            r7 = r0
            goto Lf
        L45:
            eِۣۚ r0 = defpackage.EnumC6972e.f14290e     // Catch: defpackage.C17420e -> L4c
            java.lang.Object r0 = r0.metrica(r14)     // Catch: defpackage.C17420e -> L4c
            goto Le
        L4c:
            r0 = move-exception
            int r0 = r0.f34135e
            long r11 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r11)
            r6 = 1
            r14.ad(r4, r6, r0)
            goto Lf
        L59:
            r0.getClass()
            java.lang.String r0 = r14.advert()
            r5 = r0
            goto Lf
        L62:
            eًؑۤ r11 = r14.appmetrica(r1)
            eْٗۖ r4 = new eْٗۖ
            r6 = r3
            eؙؚؔ r6 = (defpackage.EnumC6972e) r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3520e.metrica(e٘ؕ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C17196e c17196e = (C17196e) obj;
        String str = c17196e.f33717e;
        String str2 = c17196e.f33715e;
        String str3 = c17196e.f33719e;
        int license = c17196e.ad().license();
        String str4 = c17196e.f33716e;
        boolean billing = AbstractC7890e.billing(str4, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            license += c14808e.advert(1, str4);
        }
        EnumC6972e enumC6972e = c17196e.f33714e;
        if (enumC6972e != EnumC6972e.SOCKS5) {
            license += EnumC6972e.f14290e.advert(2, enumC6972e);
        }
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            license += c14808e.advert(3, str3);
        }
        int i = c17196e.f33718e;
        if (i != 0) {
            license = AbstractC8647e.signatures(i, AbstractC11069e.billing, 4, license);
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            license += c14808e.advert(5, str2);
        }
        return !AbstractC7890e.billing(str, BuildConfig.FLAVOR) ? c14808e.advert(6, str) + license : license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C17196e c17196e = (C17196e) obj;
        String str = c17196e.f33717e;
        String str2 = c17196e.f33715e;
        String str3 = c17196e.f33719e;
        String str4 = c17196e.f33716e;
        boolean billing = AbstractC7890e.billing(str4, BuildConfig.FLAVOR);
        C14808e c14808e = AbstractC11069e.Signature;
        if (!billing) {
            c14808e.startapp(c0444e, 1, str4);
        }
        EnumC6972e enumC6972e = c17196e.f33714e;
        if (enumC6972e != EnumC6972e.SOCKS5) {
            EnumC6972e.f14290e.startapp(c0444e, 2, enumC6972e);
        }
        if (!AbstractC7890e.billing(str3, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 3, str3);
        }
        int i = c17196e.f33718e;
        if (i != 0) {
            AbstractC11069e.billing.startapp(c0444e, 4, Integer.valueOf(i));
        }
        if (!AbstractC7890e.billing(str2, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 5, str2);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            c14808e.startapp(c0444e, 6, str);
        }
        c0444e.m356try(c17196e.ad());
    }
}
