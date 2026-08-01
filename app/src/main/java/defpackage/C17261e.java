package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17261e extends AbstractC11069e {
    public final C5363e signatures;

    public C17261e(InterfaceC7227e interfaceC7227e) {
        super(3, interfaceC7227e, 2, null);
        this.signatures = new C5363e(new C14136e(18));
    }

    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        C9481e c9481e = (C9481e) obj;
        String str = c9481e.f18824e;
        c17790e.m4424case(c9481e.ad());
        ((AbstractC11069e) this.signatures.getValue()).adcel(c17790e, 99, c9481e.f18822e);
        C2936e.f6930e.ad().adcel(c17790e, 8, c9481e.f18825e);
        C14721e c14721e = c9481e.f18823e;
        if (c14721e != null) {
            C14721e.f29132e.adcel(c17790e, 7, c14721e);
        }
        C10046e c10046e = c9481e.f18827e;
        if (c10046e != null) {
            C10046e.f19844e.adcel(c17790e, 6, c10046e);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.adcel(c17790e, 5, str);
        }
        C11333e c11333e = c9481e.f18828e;
        if (c11333e != null) {
            C11333e.f22783e.adcel(c17790e, 4, c11333e);
        }
        C7546e c7546e = c9481e.f18829e;
        if (c7546e != null) {
            C7546e.f15370e.adcel(c17790e, 3, c7546e);
        }
        EnumC14764e enumC14764e = c9481e.f18821e;
        if (enumC14764e != EnumC14764e.Crash) {
            EnumC14764e.f29203e.adcel(c17790e, 2, enumC14764e);
        }
        long j = c9481e.f18826e;
        if (j != 0) {
            AbstractC11069e.mopub.adcel(c17790e, 1, Long.valueOf(j));
        }
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
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0029. Please report as an issue. */
    @Override // defpackage.AbstractC11069e
    public final java.lang.Object metrica(defpackage.C17546e r20) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17261e.metrica(e٘ؕ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        C9481e c9481e = (C9481e) obj;
        String str = c9481e.f18824e;
        int license = c9481e.ad().license();
        long j = c9481e.f18826e;
        if (j != 0) {
            license += AbstractC11069e.mopub.advert(1, Long.valueOf(j));
        }
        EnumC14764e enumC14764e = c9481e.f18821e;
        if (enumC14764e != EnumC14764e.Crash) {
            license += EnumC14764e.f29203e.advert(2, enumC14764e);
        }
        C7546e c7546e = c9481e.f18829e;
        if (c7546e != null) {
            license += C7546e.f15370e.advert(3, c7546e);
        }
        C11333e c11333e = c9481e.f18828e;
        if (c11333e != null) {
            license += C11333e.f22783e.advert(4, c11333e);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            license += AbstractC11069e.Signature.advert(5, str);
        }
        C10046e c10046e = c9481e.f18827e;
        if (c10046e != null) {
            license += C10046e.f19844e.advert(6, c10046e);
        }
        C14721e c14721e = c9481e.f18823e;
        if (c14721e != null) {
            license += C14721e.f29132e.advert(7, c14721e);
        }
        return ((AbstractC11069e) this.signatures.getValue()).advert(99, c9481e.f18822e) + C2936e.f6930e.ad().advert(8, c9481e.f18825e) + license;
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        C9481e c9481e = (C9481e) obj;
        String str = c9481e.f18824e;
        long j = c9481e.f18826e;
        if (j != 0) {
            AbstractC11069e.mopub.startapp(c0444e, 1, Long.valueOf(j));
        }
        EnumC14764e enumC14764e = c9481e.f18821e;
        if (enumC14764e != EnumC14764e.Crash) {
            EnumC14764e.f29203e.startapp(c0444e, 2, enumC14764e);
        }
        C7546e c7546e = c9481e.f18829e;
        if (c7546e != null) {
            C7546e.f15370e.startapp(c0444e, 3, c7546e);
        }
        C11333e c11333e = c9481e.f18828e;
        if (c11333e != null) {
            C11333e.f22783e.startapp(c0444e, 4, c11333e);
        }
        if (!AbstractC7890e.billing(str, BuildConfig.FLAVOR)) {
            AbstractC11069e.Signature.startapp(c0444e, 5, str);
        }
        C10046e c10046e = c9481e.f18827e;
        if (c10046e != null) {
            C10046e.f19844e.startapp(c0444e, 6, c10046e);
        }
        C14721e c14721e = c9481e.f18823e;
        if (c14721e != null) {
            C14721e.f29132e.startapp(c0444e, 7, c14721e);
        }
        C2936e.f6930e.ad().startapp(c0444e, 8, c9481e.f18825e);
        ((AbstractC11069e) this.signatures.getValue()).startapp(c0444e, 99, c9481e.f18822e);
        c0444e.m356try(c9481e.ad());
    }
}
