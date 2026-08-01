package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7765e {
    public final C11388e ad;
    public boolean adcel;
    public Function0 amazon;
    public final C16722e applovin;
    public boolean appmetrica;
    public final InterfaceC18435e billing;
    public C17612e inmobi;
    public final C6656e isPro;
    public int isVip;
    public boolean license;
    public InterfaceC14388e metrica;
    public InterfaceC5178e mopub;
    public final C0576e pro;
    public final C5780e purchase;
    public final C0576e remoteconfig;
    public final C0576e signatures;
    public Function0 smaato;
    public InterfaceC17155e startapp;
    public C13918e tapsense;
    public final C7102e vip;
    public final InterfaceC3358e yandex;
    public final C0576e advert = AbstractC14533e.startapp(Boolean.TRUE);
    public final C0576e loadAd = AbstractC14533e.startapp(new C2152e(9205357640488583168L));
    public final C0576e Signature = AbstractC14533e.startapp(new C2152e(9205357640488583168L));
    public final C0576e admob = AbstractC14533e.startapp(null);
    public final C0576e subscription = AbstractC14533e.startapp(EnumC11891e.f23827e);

    public C7765e(C11388e c11388e, C7102e c7102e, InterfaceC14388e interfaceC14388e, boolean z, boolean z2, boolean z3, C5780e c5780e, InterfaceC18435e interfaceC18435e, InterfaceC3358e interfaceC3358e, InterfaceC17155e interfaceC17155e) {
        this.ad = c11388e;
        this.vip = c7102e;
        this.metrica = interfaceC14388e;
        this.license = z2;
        this.appmetrica = z3;
        this.purchase = c5780e;
        this.billing = interfaceC18435e;
        this.yandex = interfaceC3358e;
        this.startapp = interfaceC17155e;
        this.adcel = z;
        Boolean bool = Boolean.FALSE;
        this.remoteconfig = AbstractC14533e.startapp(bool);
        this.pro = AbstractC14533e.startapp(EnumC5022e.f10707e);
        this.signatures = AbstractC14533e.startapp(bool);
        this.isVip = -1;
        this.isPro = AbstractC14533e.purchase(new C18486e(this, 3));
        this.applovin = new C16722e(2, this.startapp);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v2, types: [eؚٓٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [eؚٓٞ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C7765e r8, defpackage.InterfaceC13742e r9, defpackage.AbstractC10731e r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof defpackage.C15430e
            if (r0 == 0) goto L17
            r0 = r10
            eؚْٕ r0 = (defpackage.C15430e) r0
            int r1 = r0.f30501e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f30501e = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            eؚْٕ r0 = new eؚْٕ
            r0.<init>(r8, r10)
            goto L15
        L1d:
            java.lang.Object r10 = r6.f30504e
            int r0 = r6.f30501e
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 != r1) goto L31
            eؚٓٞ r9 = r6.f30500e
            eؚٓٞ r1 = r6.f30502e
            defpackage.AbstractC2003e.purchase(r10)     // Catch: java.lang.Throwable -> L2e
            goto L7b
        L2e:
            r0 = move-exception
            r10 = r0
            goto L86
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            defpackage.AbstractC2003e.purchase(r10)
            eؚٓٞ r10 = new eؚٓٞ
            r10.<init>()
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r10.f14622e = r2
            eؚٓٞ r7 = new eؚٓٞ
            r7.<init>()
            r7.f14622e = r2
            eٍۖۦ r2 = new eٍۖۦ     // Catch: java.lang.Throwable -> L81
            r0 = 10
            r2.<init>(r0, r10, r8, r7)     // Catch: java.lang.Throwable -> L81
            eؚ۠ۖ r3 = new eؚ۠ۖ     // Catch: java.lang.Throwable -> L81
            r0 = 1
            r3.<init>(r10, r7, r8, r0)     // Catch: java.lang.Throwable -> L81
            eؚ۠ۖ r4 = new eؚ۠ۖ     // Catch: java.lang.Throwable -> L81
            r0 = 2
            r4.<init>(r10, r7, r8, r0)     // Catch: java.lang.Throwable -> L81
            eۧۡ r5 = new eۧۡ     // Catch: java.lang.Throwable -> L81
            r0 = 8
            r5.<init>(r0, r7, r8, r10)     // Catch: java.lang.Throwable -> L81
            r6.f30502e = r10     // Catch: java.lang.Throwable -> L81
            r6.f30500e = r7     // Catch: java.lang.Throwable -> L81
            r6.f30501e = r1     // Catch: java.lang.Throwable -> L81
            r1 = r9
            java.lang.Object r9 = defpackage.AbstractC11454e.appmetrica(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L81
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r9 != r0) goto L79
            return r0
        L79:
            r1 = r10
            r9 = r7
        L7b:
            billing(r1, r9, r8)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L81:
            r0 = move-exception
            r9 = r0
            r1 = r10
            r10 = r9
            r9 = r7
        L86:
            billing(r1, r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7765e.ad(eًؘُ, eؙٓؔ, eُؑ۠):java.lang.Object");
    }

    public static final void billing(C7142e c7142e, C7142e c7142e2, C7765e c7765e) {
        if ((c7142e.f14622e & 9223372034707292159L) != 9205357640488583168L) {
            c7142e.f14622e = 9205357640488583168L;
            c7142e2.f14622e = 9205357640488583168L;
            c7765e.license();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r1v12, types: [eؚٓٞ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [eؚٓٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [eؚٓٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v5, types: [eؚٓٞ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.C7765e r13, defpackage.InterfaceC13742e r14, boolean r15, defpackage.AbstractC10731e r16) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7765e.vip(eًؘُ, eؙٓؔ, boolean, eُؑ۠):java.lang.Object");
    }

    public static final void yandex(C7142e c7142e, C7142e c7142e2, C7765e c7765e) {
        if ((c7142e.f14622e & 9223372034707292159L) != 9205357640488583168L) {
            c7765e.license();
            c7142e.f14622e = 9205357640488583168L;
            c7142e2.f14622e = 0L;
            c7765e.isVip = -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if ((r1 != null ? defpackage.AbstractC14520e.vip(r6, defpackage.AbstractC14520e.startapp(r1)) : false) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C12626e Signature(boolean r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            if (r18 == 0) goto L7
            eّٟۡ r1 = defpackage.EnumC12813e.f25631e
            goto L9
        L7:
            eّٟۡ r1 = defpackage.EnumC12813e.f25630e
        L9:
            eؚؚّ r2 = r0.vip
            eِّٔ r2 = r2.metrica()
            if (r2 != 0) goto L12
            goto L5e
        L12:
            eُۦؑ r3 = r0.ad
            eٗٔۢ r4 = r3.license()
            long r4 = r4.f33324e
            boolean r6 = defpackage.C12347e.license(r4)
            if (r6 == 0) goto L21
            goto L5e
        L21:
            long r6 = r17.loadAd(r18)
            eؑۜٝ r8 = r0.subscription
            java.lang.Object r8 = r8.getValue()
            eِٞ۠ r8 = (defpackage.EnumC11891e) r8
            eِٞ۠ r9 = defpackage.EnumC11891e.f23827e
            r10 = 1
            r11 = 0
            if (r8 != r9) goto L4d
            eّٟۡ r8 = r0.advert()
            if (r8 == r1) goto L4b
            eؑؒۛ r1 = r0.admob()
            if (r1 == 0) goto L48
            eؒؐۥ r1 = defpackage.AbstractC14520e.startapp(r1)
            boolean r1 = defpackage.AbstractC14520e.vip(r6, r1)
            goto L49
        L48:
            r1 = r11
        L49:
            if (r1 == 0) goto L4d
        L4b:
            r1 = r10
            goto L4e
        L4d:
            r1 = r11
        L4e:
            if (r1 != 0) goto L51
            goto L5e
        L51:
            eٗٔۢ r1 = r3.license()
            eؙۖؕ r1 = r1.f33326e
            if (r1 != 0) goto L5b
            r1 = r10
            goto L5c
        L5b:
            r1 = r11
        L5c:
            if (r1 != 0) goto L61
        L5e:
            eُّٞ r1 = defpackage.C12626e.purchase
            return r1
        L61:
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r1 = 32
            if (r18 == 0) goto L6e
            long r10 = r4 >> r1
            int r3 = (int) r10
            goto L76
        L6e:
            long r12 = r4 & r8
            int r3 = (int) r12
            int r3 = r3 - r10
            int r3 = java.lang.Math.max(r3, r11)
        L76:
            int r15 = r2.ad(r3)
            boolean r16 = defpackage.C12347e.yandex(r4)
            if (r19 == 0) goto L90
            eؑؒۛ r3 = r0.admob()
            if (r3 == 0) goto L8e
            eؒؐۥ r3 = defpackage.AbstractC14520e.startapp(r3)
            long r6 = defpackage.AbstractC17416e.ad(r6, r3)
        L8e:
            r12 = r6
            goto L96
        L90:
            r6 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L8e
        L96:
            if (r18 == 0) goto L9c
            long r3 = r4 >> r1
            int r1 = (int) r3
            goto L9e
        L9c:
            long r4 = r4 & r8
            int r1 = (int) r4
        L9e:
            eُّٞ r10 = new eُّٞ
            r11 = 1
            float r14 = defpackage.AbstractC7255e.license(r2, r1)
            r10.<init>(r11, r12, r14, r15, r16)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7765e.Signature(boolean, boolean):eُّٞ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if ((r0 != null ? defpackage.AbstractC14520e.vip(r6, defpackage.AbstractC14520e.startapp(r0)) : false) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C12626e adcel(boolean r9) {
        /*
            r8 = this;
            eُۦؑ r0 = r8.ad
            eٗٔۢ r0 = r0.license()
            eؑۜٝ r1 = r8.remoteconfig
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            eؑۜٝ r2 = r8.subscription
            java.lang.Object r2 = r2.getValue()
            eِٞ۠ r2 = (defpackage.EnumC11891e) r2
            eِٞ۠ r3 = defpackage.EnumC11891e.f23827e
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L22
            r2 = r4
            goto L23
        L22:
            r2 = r5
        L23:
            eّٟۡ r3 = r8.advert()
            if (r1 == 0) goto L79
            if (r2 == 0) goto L79
            long r1 = r0.f33324e
            boolean r1 = defpackage.C12347e.license(r1)
            if (r1 == 0) goto L79
            eؙۖؕ r1 = r0.f33326e
            if (r1 != 0) goto L79
            java.lang.CharSequence r0 = r0.f33322e
            int r0 = r0.length()
            if (r0 <= 0) goto L79
            eّٟۡ r0 = defpackage.EnumC12813e.f25633e
            if (r3 == r0) goto L7a
            eٓؒٝ r1 = defpackage.AbstractC12640e.adcel()
            if (r1 == 0) goto L4f
            kotlin.jvm.functions.Function1 r0 = r1.appmetrica()
        L4d:
            r2 = r0
            goto L51
        L4f:
            r0 = 0
            goto L4d
        L51:
            eٓؒٝ r3 = defpackage.AbstractC12640e.smaato(r1)
            eؒؐۥ r0 = r8.mopub()     // Catch: java.lang.Throwable -> L73
            long r6 = r0.metrica()     // Catch: java.lang.Throwable -> L73
            defpackage.AbstractC12640e.Signature(r1, r3, r2)
            eؑؒۛ r0 = r8.admob()
            if (r0 == 0) goto L6f
            eؒؐۥ r0 = defpackage.AbstractC14520e.startapp(r0)
            boolean r0 = defpackage.AbstractC14520e.vip(r6, r0)
            goto L70
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L79
            goto L7a
        L73:
            r0 = move-exception
            r9 = r0
            defpackage.AbstractC12640e.Signature(r1, r3, r2)
            throw r9
        L79:
            r4 = r5
        L7a:
            if (r4 != 0) goto L7f
            eُّٞ r9 = defpackage.C12626e.purchase
            return r9
        L7f:
            eُّٞ r0 = new eُّٞ
            if (r9 == 0) goto L8d
            eؒؐۥ r9 = r8.mopub()
            long r1 = r9.metrica()
        L8b:
            r2 = r1
            goto L93
        L8d:
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L8b
        L93:
            r5 = 1
            r6 = 0
            r1 = 1
            r4 = 0
            r0.<init>(r1, r2, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7765e.adcel(boolean):eُّٞ");
    }

    public final InterfaceC0043e admob() {
        InterfaceC0043e appmetrica = this.vip.appmetrica();
        if (appmetrica == null || !appmetrica.billing()) {
            return null;
        }
        return appmetrica;
    }

    public final void ads(EnumC12813e enumC12813e, long j) {
        this.admob.setValue(enumC12813e);
        AbstractC0054e.m220goto(j, this.Signature);
    }

    public final EnumC12813e advert() {
        return (EnumC12813e) this.admob.getValue();
    }

    public final long amazon() {
        C0576e c0576e = this.Signature;
        if ((((C2152e) c0576e.getValue()).ad & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        C0576e c0576e2 = this.loadAd;
        if ((9223372034707292159L & ((C2152e) c0576e2.getValue()).ad) == 9205357640488583168L) {
            return AbstractC17416e.vip(this.vip, ((C2152e) c0576e.getValue()).ad);
        }
        long j = ((C2152e) c0576e.getValue()).ad;
        long j2 = ((C2152e) c0576e2.getValue()).ad;
        InterfaceC0043e admob = admob();
        return C2152e.startapp(j, C2152e.yandex(j2, admob != null ? admob.license(0L) : 9205357640488583168L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r1.hasMimeType("text/*") == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit applovin() {
        /*
            r3 = this;
            eٗؒۤ r0 = r3.applovin
            java.lang.Object r1 = r0.f32780e
            eٗٝٛ r1 = (defpackage.InterfaceC17155e) r1
            eؔۚٞ r1 = (defpackage.C2842e) r1
            eٖٟۤ r2 = r1.ad
            android.content.ClipboardManager r2 = r2.ad()
            boolean r2 = r2.hasPrimaryClip()
            if (r2 == 0) goto L2a
            eٖٟۤ r1 = r1.ad
            android.content.ClipboardManager r1 = r1.ad()
            android.content.ClipDescription r1 = r1.getPrimaryClipDescription()
            if (r1 == 0) goto L2a
            java.lang.String r2 = "text/*"
            boolean r1 = r1.hasMimeType(r2)
            r2 = 1
            if (r1 != r2) goto L2a
            goto L2b
        L2a:
            r2 = 0
        L2b:
            r0.f32781e = r2
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7765e.applovin():kotlin.Unit");
    }

    public final Unit appmetrica(boolean z, AbstractC7185e abstractC7185e) {
        C10566e c10566e;
        C11388e c11388e = this.ad;
        if (C12347e.license(c11388e.license().f33324e) || this.appmetrica) {
            c10566e = null;
        } else {
            C17013e license = c11388e.license();
            c10566e = new C10566e(license.f33322e.subSequence(C12347e.billing(license.f33324e), C12347e.purchase(license.f33324e)).toString());
            if (z) {
                c11388e.ad();
            }
        }
        if (c10566e == null) {
            return Unit.INSTANCE;
        }
        Unit ad = ((C2842e) this.startapp).ad(AbstractC3149e.yandex(c10566e));
        return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
    }

    public final void inmobi(EnumC5022e enumC5022e) {
        this.pro.setValue(enumC5022e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isPro(defpackage.AbstractC10731e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C10453e
            if (r0 == 0) goto L13
            r0 = r9
            eَۣۖ r0 = (defpackage.C10453e) r0
            int r1 = r0.f20645e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20645e = r1
            goto L18
        L13:
            eَۣۖ r0 = new eَۣۖ
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f20644e
            int r1 = r0.f20645e
            eؘٞؗ r2 = r8.purchase
            eؑۜٝ r3 = r8.pro
            r4 = 0
            eٜؗٚ r5 = defpackage.EnumC5022e.f10707e
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L37
            if (r1 != r7) goto L2f
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.lang.Throwable -> L2d
            goto L4c
        L2d:
            r9 = move-exception
            goto L6a
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            defpackage.AbstractC2003e.purchase(r9)
            eُِۢ r9 = new eُِۢ     // Catch: java.lang.Throwable -> L2d
            r1 = 24
            r9.<init>(r8, r4, r1)     // Catch: java.lang.Throwable -> L2d
            r0.f20645e = r7     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r9 = defpackage.AbstractC9743e.appmetrica(r9, r0)     // Catch: java.lang.Throwable -> L2d
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r9 != r0) goto L4c
            return r0
        L4c:
            eَٟۙ r9 = (defpackage.InterfaceC10500e) r9     // Catch: java.lang.Throwable -> L2d
            r8.isVip(r6)
            java.lang.Object r9 = r3.getValue()
            eٜؗٚ r9 = (defpackage.EnumC5022e) r9
            if (r9 == r5) goto L67
            eٖۨٙ r9 = r2.ad
            if (r9 == 0) goto L67
            eٌُؑ r0 = r9.f32722e
            if (r0 != 0) goto L62
            goto L67
        L62:
            r0.Signature(r4)
            r9.f32722e = r4
        L67:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L6a:
            r8.isVip(r6)
            java.lang.Object r0 = r3.getValue()
            eٜؗٚ r0 = (defpackage.EnumC5022e) r0
            if (r0 == r5) goto L83
            eٖۨٙ r0 = r2.ad
            if (r0 == 0) goto L83
            eٌُؑ r1 = r0.f32722e
            if (r1 != 0) goto L7e
            goto L83
        L7e:
            r1.Signature(r4)
            r0.f32722e = r4
        L83:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7765e.isPro(eُؑ۠):java.lang.Object");
    }

    public final void isVip(boolean z) {
        this.remoteconfig.setValue(Boolean.valueOf(z));
    }

    public final void license() {
        this.admob.setValue(null);
        AbstractC0054e.m220goto(9205357640488583168L, this.Signature);
        AbstractC0054e.m220goto(9205357640488583168L, this.loadAd);
    }

    public final long loadAd(boolean z) {
        long j;
        C12476e metrica = this.vip.metrica();
        if (metrica == null) {
            return 0L;
        }
        long j2 = this.ad.license().f33324e;
        if (z) {
            int i = C12347e.metrica;
            j = j2 >> 32;
        } else {
            int i2 = C12347e.metrica;
            j = 4294967295L & j2;
        }
        return AbstractC4584e.metrica(metrica, (int) j, z, C12347e.yandex(j2));
    }

    public final C0763e metrica(C12476e c12476e, C17013e c17013e) {
        if (!C12347e.license(c17013e.f33324e)) {
            return C0763e.appmetrica;
        }
        C0763e metrica = c12476e.metrica((int) (c17013e.f33324e >> 32));
        float floor = (float) Math.floor(this.metrica.mo497instanceof(AbstractC9578e.ad));
        if (floor < 1.0f) {
            floor = 1.0f;
        }
        float f = c12476e.ad.yandex == EnumC7792e.f15794e ? (floor / 2) + metrica.ad : metrica.metrica - (floor / 2);
        float f2 = floor / 2;
        float f3 = ((int) (c12476e.metrica >> 32)) - f2;
        if (f > f3) {
            f = f3;
        }
        if (f < f2) {
            f = f2;
        }
        float floor2 = ((int) floor) % 2 == 1 ? ((float) Math.floor(f)) + 0.5f : (float) Math.rint(f);
        return new C0763e(floor2 - f2, metrica.vip, floor2 + f2, metrica.license);
    }

    public final C0763e mopub() {
        C12476e metrica = this.vip.metrica();
        return metrica == null ? C0763e.appmetrica : metrica(metrica, this.ad.license());
    }

    public final long premium(C17013e c17013e, int i, int i2, boolean z, C16658e c16658e, boolean z2, boolean z3, C10138e c10138e) {
        long j;
        InterfaceC5178e interfaceC5178e;
        long j2 = c17013e.f33324e;
        C12347e c12347e = new C12347e(j2);
        if (z3 || (!z2 && C12347e.license(j2))) {
            c12347e = null;
        }
        C12476e metrica = this.vip.metrica();
        if (metrica == null) {
            j = C12347e.vip;
        } else if (c12347e == null && AbstractC7890e.billing(c16658e, C5107e.f10963e)) {
            j = AbstractC9262e.metrica(i, i2);
        } else {
            C13918e purchase = AbstractC7150e.purchase(metrica, i, i2, this.isVip, c12347e != null ? c12347e.ad : C12347e.vip, c12347e == null, z);
            if (c12347e == null || purchase.advert(this.tapsense)) {
                C9106e ad = c16658e.ad(purchase);
                long metrica2 = AbstractC9262e.metrica(ad.ad.vip, ad.vip.vip);
                this.tapsense = purchase;
                this.isVip = z ? i : i2;
                j = metrica2;
            } else {
                j = c12347e.ad;
            }
        }
        if (c10138e != null && ((C12347e.billing(j) != C12347e.billing(j2) || C12347e.purchase(j) != C12347e.purchase(j2)) && (interfaceC5178e = this.mopub) != null)) {
            ((C6169e) interfaceC5178e).ad(c10138e.ad);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r8 == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        if (r8 == r6) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pro(defpackage.AbstractC10731e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.C11012e
            if (r0 == 0) goto L13
            r0 = r8
            eُٕٖ r0 = (defpackage.C11012e) r0
            int r1 = r0.f21815e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21815e = r1
            goto L18
        L13:
            eُٕٖ r0 = new eُٕٖ
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f21814e
            int r1 = r0.f21815e
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L38
            if (r1 == r5) goto L34
            if (r1 != r4) goto L2c
            defpackage.AbstractC2003e.purchase(r8)
            goto L75
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            defpackage.AbstractC2003e.purchase(r8)
            goto L58
        L38:
            defpackage.AbstractC2003e.purchase(r8)
            eٗٝٛ r8 = r7.startapp
            r0.f21815e = r5
            eؔۚٞ r8 = (defpackage.C2842e) r8
            eٖٟۤ r8 = r8.ad
            android.content.ClipboardManager r8 = r8.ad()
            android.content.ClipData r8 = r8.getPrimaryClip()
            if (r8 == 0) goto L54
            eْۣٖ r1 = new eْۣٖ
            r1.<init>(r8)
            r8 = r1
            goto L55
        L54:
            r8 = r3
        L55:
            if (r8 != r6) goto L58
            goto L74
        L58:
            eْۣٖ r8 = (defpackage.C13590e) r8
            if (r8 == 0) goto L84
            r0.f21815e = r4
            android.content.ClipData r8 = r8.ad
            android.content.ClipData$Item r8 = r8.getItemAt(r2)
            if (r8 == 0) goto L71
            java.lang.CharSequence r8 = r8.getText()
            if (r8 == 0) goto L71
            java.lang.String r8 = r8.toString()
            goto L72
        L71:
            r8 = r3
        L72:
            if (r8 != r6) goto L75
        L74:
            return r6
        L75:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L7a
            goto L84
        L7a:
            eُۦؑ r0 = r7.ad
            r1 = 10
            defpackage.C11388e.yandex(r0, r8, r2, r1)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L84:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7765e.pro(eُؑ۠):java.lang.Object");
    }

    public final Unit purchase(AbstractC7185e abstractC7185e) {
        C10566e c10566e;
        C11388e c11388e = this.ad;
        if (C12347e.license(c11388e.license().f33324e) || !smaato() || this.appmetrica) {
            c10566e = null;
        } else {
            C17013e license = c11388e.license();
            c10566e = new C10566e(license.f33322e.subSequence(C12347e.billing(license.f33324e), C12347e.purchase(license.f33324e)).toString());
            c11388e.metrica();
        }
        if (c10566e == null) {
            return Unit.INSTANCE;
        }
        Unit ad = ((C2842e) this.startapp).ad(AbstractC3149e.yandex(c10566e));
        return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (pro(r0) == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (pro(r0) == r3) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remoteconfig(defpackage.AbstractC10731e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C6930e
            if (r0 == 0) goto L13
            r0 = r6
            eًؚؖ r0 = (defpackage.C6930e) r0
            int r1 = r0.f14192e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14192e = r1
            goto L18
        L13:
            eًؚؖ r0 = new eًؚؖ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f14191e
            int r1 = r0.f14192e
            r2 = 1
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L53
            if (r1 == r2) goto L4f
            r2 = 2
            r4 = 3
            if (r1 == r2) goto L35
            if (r1 != r4) goto L2d
            defpackage.AbstractC2003e.purchase(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            defpackage.AbstractC2003e.purchase(r6)
            eْۣٖ r6 = (defpackage.C13590e) r6
            if (r6 != 0) goto L48
            r0.f14192e = r4
            java.lang.Object r6 = r5.pro(r0)
            if (r6 != r3) goto L45
            goto L6f
        L45:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L48:
            android.content.ClipData r6 = r6.ad
            r6.getDescription()
            r6 = 0
            throw r6
        L4f:
            defpackage.AbstractC2003e.purchase(r6)
            goto L70
        L53:
            defpackage.AbstractC2003e.purchase(r6)
            kotlin.jvm.functions.Function0 r6 = r5.amazon
            if (r6 == 0) goto L67
            java.lang.Object r6 = r6.invoke()
            if (r6 != 0) goto L61
            goto L67
        L61:
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        L67:
            r0.f14192e = r2
            java.lang.Object r6 = r5.pro(r0)
            if (r6 != r3) goto L70
        L6f:
            return r3
        L70:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7765e.remoteconfig(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean signatures(long r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7765e.signatures(long):boolean");
    }

    public final boolean smaato() {
        return this.adcel;
    }

    public final Object startapp(InterfaceC13742e interfaceC13742e, AbstractC7185e abstractC7185e) {
        Object m1364e = ((C3427e) interfaceC13742e).m1364e(new C4836e(this, null, 3), abstractC7185e);
        return m1364e == EnumC2821e.f6782e ? m1364e : Unit.INSTANCE;
    }

    public final void subscription() {
        InterfaceC3358e interfaceC3358e = this.yandex;
        if (interfaceC3358e != null) {
            C11388e c11388e = this.ad;
            CharSequence charSequence = c11388e.license().f33322e;
            long j = c11388e.license().f33324e;
            if (charSequence.length() > 0 && !C12347e.license(j)) {
                AbstractC5336e.purchase(this.billing, null, 4, new C5840e(interfaceC3358e, charSequence, j, this, null, 8), 1);
            }
        }
    }

    public final void tapsense(boolean z) {
        this.advert.setValue(Boolean.valueOf(z));
    }
}
