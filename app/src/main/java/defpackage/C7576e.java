package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7576e implements InterfaceC8018e {
    public final InterfaceC7048e ad;
    public final C11467e adcel;
    public final C5363e advert;
    public final C10250e appmetrica;
    public int billing;
    public final C14826e license;
    public final C17651e metrica = AbstractC12751e.ad();
    public final C5363e mopub;
    public final C17651e purchase;
    public final C16089e startapp;
    public final InterfaceC9452e vip;
    public C8419e yandex;

    /* JADX WARN: Type inference failed for: r2v13, types: [eِؒۜ, java.lang.Object] */
    public C7576e(InterfaceC7048e interfaceC7048e, List list, InterfaceC9452e interfaceC9452e, InterfaceC8850e interfaceC8850e) {
        this.ad = interfaceC7048e;
        this.vip = interfaceC9452e;
        InterfaceC10500e interfaceC10500e = (InterfaceC10500e) interfaceC8850e.mo397public(C4524e.f9798e);
        if (interfaceC10500e == null) {
            throw new IllegalStateException(("Missing Job on Coroutine context: " + interfaceC8850e).toString());
        }
        interfaceC10500e.mo692else(new C10739e(8, this));
        this.license = AbstractC9743e.ad(interfaceC8850e.mo394const(interfaceC10500e));
        this.appmetrica = new C10250e(new C14869e(this, (InterfaceC5083e) null, 26));
        this.purchase = AbstractC12751e.ad();
        this.startapp = new C16089e(7);
        ?? obj = new Object();
        obj.f23071e = this;
        obj.f23072e = AbstractC12751e.ad();
        obj.f23070e = new C8823e();
        obj.f23069e = AbstractC13480e.m3575continue(list);
        this.adcel = obj;
        final int i = 0;
        this.mopub = new C5363e(new Function0(this) { // from class: eٌؗؐ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C7576e f10163e;

            {
                this.f10163e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.f10163e.ad.ad();
                    default:
                        return ((InterfaceC2885e) this.f10163e.mopub.getValue()).metrica();
                }
            }
        });
        final int i2 = 1;
        this.advert = new C5363e(new Function0(this) { // from class: eٌؗؐ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C7576e f10163e;

            {
                this.f10163e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.f10163e.ad.ad();
                    default:
                        return ((InterfaceC2885e) this.f10163e.mopub.getValue()).metrica();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object appmetrica(defpackage.C7576e r11, boolean r12, kotlin.jvm.functions.Function2 r13, defpackage.AbstractC10731e r14) {
        /*
            boolean r0 = r14 instanceof defpackage.C4598e
            if (r0 == 0) goto L13
            r0 = r14
            eؗؒۥ r0 = (defpackage.C4598e) r0
            int r1 = r0.f9901e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9901e = r1
            goto L18
        L13:
            eؗؒۥ r0 = new eؗؒۥ
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f9904e
            int r1 = r0.f9901e
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L31
            if (r1 != r2) goto L29
            defpackage.AbstractC2003e.purchase(r14)
            return r14
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            boolean r12 = r0.f9902e
            eؚٖؓ r13 = r0.f9900e
            kotlin.jvm.functions.Function2 r13 = (kotlin.jvm.functions.Function2) r13
            defpackage.AbstractC2003e.purchase(r14)
        L3a:
            r8 = r12
            r9 = r13
            goto L4b
        L3d:
            defpackage.AbstractC2003e.purchase(r14)
            r14 = r13
            eؚٖؓ r14 = (defpackage.AbstractC7185e) r14
            r0.f9900e = r14
            r0.f9902e = r12
            r0.f9901e = r3
            r14 = r4
            goto L3a
        L4b:
            r7 = r14
            eؘۢؐ r7 = (defpackage.InterfaceC5979e) r7
            eٌِٞ r12 = r11.yandex()
            eؚؔٛ r5 = new eؚؔٛ
            r10 = 0
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r0.f9900e = r4
            r0.f9902e = r8
            r0.f9901e = r2
            java.lang.Object r11 = defpackage.AbstractC5336e.advert(r12, r5, r0)
            eٟؔۙ r12 = defpackage.EnumC2821e.f6782e
            if (r11 != r12) goto L68
            return r12
        L68:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7576e.appmetrica(eؚٖۤ, boolean, kotlin.jvm.functions.Function2, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:12:0x0043, B:14:0x004a, B:15:0x005d), top: B:11:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object license(defpackage.C7576e r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C3013e
            if (r0 == 0) goto L13
            r0 = r6
            eؔۧٗ r0 = (defpackage.C3013e) r0
            int r1 = r0.f7062e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7062e = r1
            goto L18
        L13:
            eؔۧٗ r0 = new eؔۧٗ
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f7060e
            int r1 = r0.f7062e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eٍٖ٘ r0 = r0.f7061e
            defpackage.AbstractC2003e.purchase(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eٍٖ٘ r6 = r5.purchase
            r0.f7061e = r6
            r0.f7062e = r2
            java.lang.Object r0 = r6.appmetrica(r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L41
            return r1
        L41:
            r0 = r6
        L42:
            r6 = 0
            int r1 = r5.billing     // Catch: java.lang.Throwable -> L5b
            int r1 = r1 + r2
            r5.billing = r1     // Catch: java.lang.Throwable -> L5b
            if (r1 != r2) goto L5d
            eٔٛۤ r1 = r5.license     // Catch: java.lang.Throwable -> L5b
            eؗٔۜ r2 = new eؗٔۜ     // Catch: java.lang.Throwable -> L5b
            r3 = 2
            r2.<init>(r3, r6, r5)     // Catch: java.lang.Throwable -> L5b
            r3 = 3
            r4 = 0
            eٌُؑ r1 = defpackage.AbstractC5336e.purchase(r1, r6, r4, r2, r3)     // Catch: java.lang.Throwable -> L5b
            r5.yandex = r1     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r5 = move-exception
            goto L65
        L5d:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5b
            r0.billing(r6)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L65:
            r0.billing(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7576e.license(eؚٖۤ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:12:0x0043, B:14:0x004b, B:16:0x004f, B:17:0x0055, B:18:0x0057), top: B:11:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(defpackage.C7576e r4, defpackage.AbstractC10731e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.C17511e
            if (r0 == 0) goto L13
            r0 = r5
            e٘ؔؒ r0 = (defpackage.C17511e) r0
            int r1 = r0.f34341e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34341e = r1
            goto L18
        L13:
            e٘ؔؒ r0 = new e٘ؔؒ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f34339e
            int r1 = r0.f34341e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eٍٖ٘ r0 = r0.f34340e
            defpackage.AbstractC2003e.purchase(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r5)
            eٍٖ٘ r5 = r4.purchase
            r0.f34340e = r5
            r0.f34341e = r2
            java.lang.Object r0 = r5.appmetrica(r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L41
            return r1
        L41:
            r0 = r5
        L42:
            r5 = 0
            int r1 = r4.billing     // Catch: java.lang.Throwable -> L53
            int r1 = r1 + (-1)
            r4.billing = r1     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L57
            eٌُؑ r1 = r4.yandex     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L55
            r1.Signature(r5)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r4 = move-exception
            goto L5f
        L55:
            r4.yandex = r5     // Catch: java.lang.Throwable -> L53
        L57:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L53
            r0.billing(r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L5f:
            r0.billing(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7576e.metrica(eؚٖۤ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r7 == r5) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object purchase(defpackage.C7576e r6, defpackage.AbstractC10731e r7) {
        /*
            eٍؘٖ r0 = r6.startapp
            boolean r1 = r7 instanceof defpackage.C11982e
            if (r1 == 0) goto L15
            r1 = r7
            eِۚ۠ r1 = (defpackage.C11982e) r1
            int r2 = r1.f23955e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f23955e = r2
            goto L1a
        L15:
            eِۚ۠ r1 = new eِۚ۠
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.f23954e
            int r2 = r1.f23955e
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.AbstractC2003e.purchase(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.AbstractC2003e.purchase(r7)     // Catch: java.lang.Throwable -> L67
            goto L5c
        L38:
            defpackage.AbstractC2003e.purchase(r7)
            eَۡۚ r7 = r0.signatures()
            boolean r7 = r7 instanceof defpackage.C15551e
            if (r7 == 0) goto L48
            eَۡۚ r6 = r0.signatures()
            return r6
        L48:
            r1.f23955e = r4     // Catch: java.lang.Throwable -> L67
            eؒٓۦ r7 = new eؒٓۦ     // Catch: java.lang.Throwable -> L67
            r0 = 0
            r7.<init>(r6, r0)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = defpackage.AbstractC12731e.purchase(r7, r1)     // Catch: java.lang.Throwable -> L67
            if (r7 != r5) goto L57
            goto L59
        L57:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L67
        L59:
            if (r7 != r5) goto L5c
            goto L65
        L5c:
            r1.f23955e = r3
            r7 = 0
            java.lang.Object r6 = r6.startapp(r7, r1)
            if (r6 != r5) goto L66
        L65:
            return r5
        L66:
            return r6
        L67:
            r6 = move-exception
            eؑۦِ r7 = new eؑۦِ
            r0 = -1
            r7.<init>(r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7576e.purchase(eؚٖۤ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8018e
    public final InterfaceC1108e ad() {
        return this.appmetrica;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [eؚؖٞ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object adcel(java.lang.Object r10, boolean r11, defpackage.AbstractC10731e r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.C1140e
            if (r0 == 0) goto L13
            r0 = r12
            eؒٙۤ r0 = (defpackage.C1140e) r0
            int r1 = r0.f3715e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3715e = r1
            goto L18
        L13:
            eؒٙۤ r0 = new eؒٙۤ
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f3713e
            int r1 = r0.f3715e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eؚؖٞ r10 = r0.f3714e
            defpackage.AbstractC2003e.purchase(r12)
            goto L56
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            defpackage.AbstractC2003e.purchase(r12)
            eؚؖٞ r5 = new eؚؖٞ
            r5.<init>()
            eؘؒؐ r12 = r9.mopub
            java.lang.Object r12 = r12.getValue()
            eؔۜۤ r12 = (defpackage.InterfaceC2885e) r12
            eُؚؗ r3 = new eُؚؗ
            r8 = 0
            r4 = r9
            r6 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f3714e = r5
            r0.f3715e = r2
            java.lang.Object r10 = r12.ad(r3, r0)
            eٟؔۙ r11 = defpackage.EnumC2821e.f6782e
            if (r10 != r11) goto L55
            return r11
        L55:
            r10 = r5
        L56:
            int r10 = r10.f8852e
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7576e.adcel(java.lang.Object, boolean, eُؑ۠):java.lang.Object");
    }

    public final InterfaceC4417e billing() {
        return (InterfaceC4417e) this.advert.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
    
        if (r10 == r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r10 == r6) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        if (r10 == r6) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startapp(boolean r9, defpackage.InterfaceC5083e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C7906e
            if (r0 == 0) goto L13
            r0 = r10
            eًٌْ r0 = (defpackage.C7906e) r0
            int r1 = r0.f15984e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15984e = r1
            goto L18
        L13:
            eًٌْ r0 = new eًٌْ
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f15987e
            int r1 = r0.f15984e
            eٍؘٖ r2 = r8.startapp
            r3 = 3
            r4 = 2
            r5 = 1
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L44
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L38
            if (r1 != r3) goto L30
            defpackage.AbstractC2003e.purchase(r10)
            goto Lad
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.AbstractC2003e.purchase(r10)
            goto L94
        L3c:
            boolean r9 = r0.f15985e
            eَۡۚ r1 = r0.f15983e
            defpackage.AbstractC2003e.purchase(r10)
            goto L60
        L44:
            defpackage.AbstractC2003e.purchase(r10)
            eَۡۚ r1 = r2.signatures()
            boolean r10 = r1 instanceof defpackage.C18307e
            if (r10 != 0) goto Lc1
            eؖ۠ؖ r10 = r8.billing()
            r0.f15983e = r1
            r0.f15985e = r9
            r0.f15984e = r5
            java.lang.Object r10 = r10.ad(r0)
            if (r10 != r6) goto L60
            goto Lac
        L60:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            boolean r5 = r1 instanceof defpackage.C10950e
            if (r5 == 0) goto L70
            r7 = r1
            eُِۙ r7 = (defpackage.C10950e) r7
            int r7 = r7.ad
            goto L71
        L70:
            r7 = -1
        L71:
            if (r5 == 0) goto L76
            if (r10 != r7) goto L76
            return r1
        L76:
            eٌَ٘ r10 = new eٌَ٘
            r1 = 0
            r10.<init>(r7, r1, r8)
            if (r9 == 0) goto L97
            eؖ۠ؖ r3 = r8.billing()
            eًٓٙ r5 = new eًٓٙ
            r5.<init>(r8, r10, r9, r1)
            r0.f15983e = r1
            r0.f15985e = r9
            r0.f15984e = r4
            java.lang.Object r10 = r3.vip(r5, r0)
            if (r10 != r6) goto L94
            goto Lac
        L94:
            eؙۖؕ r10 = (defpackage.C6571e) r10
            goto Laf
        L97:
            eؖ۠ؖ r4 = r8.billing()
            eٍٓٚ r5 = new eٍٓٚ
            r5.<init>(r8, r10, r1)
            r0.f15983e = r1
            r0.f15985e = r9
            r0.f15984e = r3
            java.lang.Object r10 = r4.license(r5, r0)
            if (r10 != r6) goto Lad
        Lac:
            return r6
        Lad:
            eؙۖؕ r10 = (defpackage.C6571e) r10
        Laf:
            java.lang.Object r9 = r10.f13544e
            eَۡۚ r9 = (defpackage.AbstractC10595e) r9
            java.lang.Object r10 = r10.f13543e
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lc0
            r2.m4115protected(r9)
        Lc0:
            return r9
        Lc1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7576e.startapp(boolean, eًؗۖ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8018e
    public final Object vip(Function2 function2, InterfaceC5083e interfaceC5083e) {
        AbstractC6629e.yandex(this.license.f29359e);
        return AbstractC12731e.purchase(new C12300e(this, function2, null), interfaceC5083e);
    }

    public final InterfaceC8850e yandex() {
        return this.license.f29359e.mo396final(C4524e.f9798e);
    }
}
