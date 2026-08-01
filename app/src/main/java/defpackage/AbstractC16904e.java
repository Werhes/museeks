package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16904e implements InterfaceC10481e {
    public final C15274e Signature;
    public boolean ad;
    public float adcel;
    public final C16330e admob;
    public final InterfaceC3314e ads;
    public final boolean advert;
    public InterfaceC14388e amazon;
    public final C4695e applovin;
    public int appmetrica;
    public long billing;

    /* renamed from: class, reason: not valid java name */
    public final C0576e f33124class;
    public final C0576e crashlytics;
    public final C0576e firebase;
    public final C0576e inmobi;
    public final C6827e isPro;
    public final C0571e isVip;
    public final C8331e license;
    public int loadAd;
    public final C0576e metrica;
    public final C18237e mopub;
    public final InterfaceC3314e premium;
    public final C7513e pro;
    public int purchase;
    public final C6656e remoteconfig;
    public final C4571e signatures;
    public final C0576e smaato;
    public float startapp;
    public final C0576e subs;
    public final C16330e subscription;
    public final C6594e tapsense;
    public C14870e vip;
    public long yandex;

    public AbstractC16904e(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            AbstractC8889e.ad("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.metrica = AbstractC14533e.startapp(new C2152e(0L));
        this.license = new C8331e(i, f, this);
        this.appmetrica = i;
        this.billing = Long.MAX_VALUE;
        final int i2 = 0;
        this.mopub = new C18237e(new Function1(this) { // from class: eٕؑۛ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC16904e f30023e;

            {
                this.f30023e = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Long] */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 252
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C15166e.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.advert = true;
        this.smaato = new C0576e(AbstractC1742e.metrica, C10990e.f21771e);
        this.amazon = AbstractC1742e.vip;
        this.Signature = new C15274e();
        this.admob = new C16330e(-1);
        this.subscription = new C16330e(i);
        C12575e c12575e = C12575e.f25232e;
        this.remoteconfig = AbstractC14533e.appmetrica(c12575e, new C18414e(this, 3));
        AbstractC14533e.appmetrica(c12575e, new C18414e(this, 4));
        final int i3 = 1;
        C7513e c7513e = new C7513e(new Function1(this) { // from class: eٕؑۛ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ AbstractC16904e f30023e;

            {
                this.f30023e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    */
                /*
                    Method dump skipped, instructions count: 252
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.C15166e.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.pro = c7513e;
        this.signatures = new C4571e(new C16089e(this), c7513e, new C18414e(this, 5));
        this.tapsense = new C6594e(17);
        this.isVip = new C0571e();
        this.inmobi = AbstractC14533e.startapp(null);
        this.isPro = new C6827e(this, 3);
        AbstractC2278e.vip(0, 0, 0, 0, 15);
        this.applovin = new C4695e();
        this.ads = AbstractC8508e.vip();
        this.premium = AbstractC8508e.vip();
        Boolean bool = Boolean.FALSE;
        this.subs = AbstractC14533e.startapp(bool);
        this.crashlytics = AbstractC14533e.startapp(bool);
        this.firebase = AbstractC14533e.startapp(bool);
        this.f33124class = AbstractC14533e.startapp(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r8.vip(r6, r7, r0) != r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r5.startapp(r0) == r4) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object subscription(defpackage.AbstractC16904e r5, defpackage.EnumC6955e r6, kotlin.jvm.functions.Function2 r7, defpackage.InterfaceC5083e r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C9339e
            if (r0 == 0) goto L13
            r0 = r8
            eٌٍِ r0 = (defpackage.C9339e) r0
            int r1 = r0.f18599e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18599e = r1
            goto L18
        L13:
            eٌٍِ r0 = new eٌٍِ
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f18600e
            int r1 = r0.f18599e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L41
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            eٍٗٝ r5 = r0.f18598e
            defpackage.AbstractC2003e.purchase(r8)
            goto L7f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            eؚٖؓ r5 = r0.f18601e
            r7 = r5
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            eؚؗۨ r6 = r0.f18596e
            eٍٗٝ r5 = r0.f18598e
            defpackage.AbstractC2003e.purchase(r8)
            goto L56
        L41:
            defpackage.AbstractC2003e.purchase(r8)
            r0.f18598e = r5
            r0.f18596e = r6
            r8 = r7
            eؚٖؓ r8 = (defpackage.AbstractC7185e) r8
            r0.f18601e = r8
            r0.f18599e = r3
            java.lang.Object r8 = r5.startapp(r0)
            if (r8 != r4) goto L56
            goto L7e
        L56:
            eٝؒ r8 = r5.mopub
            boolean r8 = r8.ad()
            if (r8 != 0) goto L6d
            eًۥؐ r8 = r5.license
            java.lang.Object r8 = r8.f17056e
            eٖٛ٘ r8 = (defpackage.C16330e) r8
            int r8 = r8.purchase()
            eٖٛ٘ r1 = r5.subscription
            r1.startapp(r8)
        L6d:
            eٝؒ r8 = r5.mopub
            r0.f18598e = r5
            r1 = 0
            r0.f18596e = r1
            r0.f18601e = r1
            r0.f18599e = r2
            java.lang.Object r6 = r8.vip(r6, r7, r0)
            if (r6 != r4) goto L7f
        L7e:
            return r4
        L7f:
            r6 = -1
            eٖٛ٘ r5 = r5.admob
            r5.startapp(r6)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16904e.subscription(eٍٗٝ, eؚؗۨ, kotlin.jvm.functions.Function2, eًؗۖ):java.lang.Object");
    }

    public final long Signature() {
        return ((C2152e) this.metrica.getValue()).ad;
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean ad() {
        return this.mopub.ad();
    }

    public final int adcel(int i) {
        if (advert() > 0) {
            return AbstractC3062e.metrica(i, 0, advert() - 1);
        }
        return 0;
    }

    public final boolean admob() {
        return ((int) Float.intBitsToFloat((int) (Signature() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (Signature() & 4294967295L))) == 0;
    }

    public abstract int advert();

    public final int amazon() {
        return ((C14870e) this.smaato.getValue()).metrica + smaato();
    }

    @Override // defpackage.InterfaceC10481e
    public final float appmetrica(float f) {
        return this.mopub.appmetrica(f);
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean license() {
        return ((Boolean) this.subs.getValue()).booleanValue();
    }

    public final int loadAd() {
        return ((Number) this.remoteconfig.getValue()).intValue();
    }

    @Override // defpackage.InterfaceC10481e
    public final boolean metrica() {
        return ((Boolean) this.crashlytics.getValue()).booleanValue();
    }

    public final C14870e mopub() {
        return (C14870e) this.smaato.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
    
        if (vip(defpackage.EnumC6955e.f14256e, r6, r0) != r5) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchase(int r13, defpackage.C13540e r14, defpackage.InterfaceC5083e r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.C6016e
            if (r0 == 0) goto L13
            r0 = r15
            eؘۤ r0 = (defpackage.C6016e) r0
            int r1 = r0.f12668e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12668e = r1
            goto L18
        L13:
            eؘۤ r0 = new eؘۤ
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f12671e
            int r1 = r0.f12668e
            r2 = 0
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2d
            defpackage.AbstractC2003e.purchase(r15)
            r7 = r12
            goto Lb5
        L2d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L35:
            int r13 = r0.f12669e
            eْٟ۟ r14 = r0.f12667e
            defpackage.AbstractC2003e.purchase(r15)
        L3c:
            r10 = r14
            goto L71
        L3e:
            defpackage.AbstractC2003e.purchase(r15)
            eًۥؐ r15 = r12.license
            java.lang.Object r1 = r15.f17056e
            eٖٛ٘ r1 = (defpackage.C16330e) r1
            int r1 = r1.purchase()
            if (r13 != r1) goto L5a
            java.lang.Object r15 = r15.f17053e
            eٖؔ٘ r15 = (defpackage.C2616e) r15
            float r15 = r15.purchase()
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L5a
            goto L60
        L5a:
            int r15 = r12.advert()
            if (r15 != 0) goto L63
        L60:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        L63:
            r0.f12667e = r14
            r0.f12669e = r13
            r0.f12668e = r4
            java.lang.Object r15 = r12.startapp(r0)
            if (r15 != r5) goto L3c
            r7 = r12
            goto Lb4
        L71:
            double r14 = (double) r2
            r6 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r1 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r1 > 0) goto L7f
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 > 0) goto L7f
            goto L95
        L7f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "pageOffsetFraction "
            r14.<init>(r15)
            r14.append(r2)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            defpackage.AbstractC8889e.ad(r14)
        L95:
            int r8 = r12.adcel(r13)
            int r13 = r12.amazon()
            float r13 = (float) r13
            float r9 = r2 * r13
            eؓؒٞ r6 = new eؓؒٞ
            r11 = 0
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 0
            r0.f12667e = r13
            r0.f12668e = r3
            eؚؗۨ r13 = defpackage.EnumC6955e.f14256e
            java.lang.Object r13 = r12.vip(r13, r6, r0)
            if (r13 != r5) goto Lb5
        Lb4:
            return r5
        Lb5:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16904e.purchase(int, eْٟ۟, eًؗۖ):java.lang.Object");
    }

    public final void remoteconfig(float f, int i, boolean z) {
        C8331e c8331e = this.license;
        C16330e c16330e = (C16330e) c8331e.f17056e;
        C2616e c2616e = (C2616e) c8331e.f17053e;
        if (c16330e.purchase() != i || c2616e.purchase() != f) {
            this.signatures.billing();
        }
        ((C16330e) c8331e.f17056e).startapp(i);
        ((C0705e) c8331e.f17058e).metrica(i);
        c2616e.startapp(f);
        c8331e.f17055e = null;
        if (!z) {
            AbstractC8508e.purchase(this.premium);
            return;
        }
        C13915e c13915e = (C13915e) this.inmobi.getValue();
        if (c13915e != null) {
            c13915e.advert();
        }
    }

    public final int smaato() {
        return ((C14870e) this.smaato.getValue()).vip;
    }

    public final Object startapp(AbstractC10731e abstractC10731e) {
        Object adcel;
        return (this.smaato.getValue() == AbstractC1742e.metrica && (adcel = this.isVip.adcel(abstractC10731e)) == EnumC2821e.f6782e) ? adcel : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC10481e
    public final Object vip(EnumC6955e enumC6955e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        return subscription(this, enumC6955e, function2, interfaceC5083e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0335 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0392 A[Catch: all -> 0x03d4, TRY_LEAVE, TryCatch #0 {all -> 0x03d4, blocks: (B:41:0x0335, B:44:0x033e, B:47:0x034b, B:49:0x0357, B:54:0x0392, B:56:0x0387, B:60:0x036f), top: B:40:0x0335 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02fe  */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object, eًؘۧ] */
    /* JADX WARN: Type inference failed for: r5v28, types: [int] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yandex(defpackage.C14870e r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16904e.yandex(eٔٞۤ, boolean, boolean):void");
    }
}
