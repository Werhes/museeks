package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7000e extends C11997e implements InterfaceC6055e {

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final C8208e f14333e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C0136e f14334e = new C0136e(7);

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final C1293e f14335e = new Object();

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public static final C1293e f14336e = new Object();

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final ArrayList f14337e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C5033e f14338e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eؒۙ۠, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [eؒۙ۠, java.lang.Object] */
    static {
        InterfaceC13984e interfaceC13984e;
        InterfaceC7227e vip = AbstractC3820e.ad.vip(C7000e.class);
        try {
            interfaceC13984e = AbstractC3820e.ad(C7000e.class);
        } catch (Throwable unused) {
            interfaceC13984e = null;
        }
        f14333e = new C8208e("Routing", new C12025e(vip, interfaceC13984e));
    }

    public C7000e(C5033e c5033e) {
        super(null, new C6084e(c5033e.f10721e), c5033e.f25998e, c5033e.f25997e);
        this.f14338e = c5033e;
        ArrayList arrayList = new ArrayList();
        this.f14337e = arrayList;
        if (AbstractC12044e.vip.yandex()) {
            arrayList.add(new C3114e(25));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (remoteconfig(r7, r1, r8, r0) == r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
    
        if (r8 == r4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pro(defpackage.AbstractC11424e r7, defpackage.AbstractC10731e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C17865e
            if (r0 == 0) goto L13
            r0 = r8
            e٘ٛۜ r0 = (defpackage.C17865e) r0
            int r1 = r0.f35048e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35048e = r1
            goto L18
        L13:
            e٘ٛۜ r0 = new e٘ٛۜ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f35046e
            int r1 = r0.f35048e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            defpackage.AbstractC2003e.purchase(r8)
            goto L69
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            eُۨۨ r7 = r0.f35047e
            defpackage.AbstractC2003e.purchase(r8)
            goto L51
        L38:
            defpackage.AbstractC2003e.purchase(r8)
            eُِؓ r8 = new eُِؓ
            java.lang.Object r1 = r7.f22964e
            eًَۨ r1 = (defpackage.InterfaceC8376e) r1
            java.util.ArrayList r5 = r6.f14337e
            r8.<init>(r6, r1, r5)
            r0.f35047e = r7
            r0.f35048e = r3
            java.lang.Object r8 = r8.mopub(r0)
            if (r8 != r4) goto L51
            goto L68
        L51:
            eِؒٝ r8 = (defpackage.AbstractC1006e) r8
            boolean r1 = r8 instanceof defpackage.C5158e
            if (r1 == 0) goto L6c
            eِۜؑ r1 = r8.ad
            eؗۛٚ r8 = (defpackage.C5158e) r8
            eُٝؓ r8 = r8.vip
            r3 = 0
            r0.f35047e = r3
            r0.f35048e = r2
            java.lang.Object r7 = r6.remoteconfig(r7, r1, r8, r0)
            if (r7 != r4) goto L69
        L68:
            return r4
        L69:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L6c:
            boolean r0 = r8 instanceof defpackage.C17614e
            if (r0 == 0) goto L84
            java.lang.Object r7 = r7.f22964e
            eًَۨ r7 = (defpackage.InterfaceC8376e) r7
            eؘۙٗ r7 = r7.getAttributes()
            eًۛؗ r0 = defpackage.AbstractC12044e.ad
            eؚْ٘ r8 = (defpackage.C17614e) r8
            eۣؔؗ r8 = r8.metrica
            r7.billing(r0, r8)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L84:
            eٔٚؖ r7 = new eٔٚؖ
            r8 = 10
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7000e.pro(eُۨۨ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remoteconfig(defpackage.AbstractC11424e r17, defpackage.C11997e r18, defpackage.InterfaceC11129e r19, defpackage.AbstractC10731e r20) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7000e.remoteconfig(eُۨۨ, eِۜؑ, eُٝؓ, eُؑ۠):java.lang.Object");
    }
}
