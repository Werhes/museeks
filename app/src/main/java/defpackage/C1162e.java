package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٚ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1162e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC4619e f3745e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ int f3746e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ long f3747e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f3748e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f3749e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C11268e f3750e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f3751e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f3752e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C11268e f3753e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1162e(C11268e c11268e, long j, int i, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f3750e = c11268e;
        this.f3747e = j;
        this.f3746e = i;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C1162e(this.f3750e, this.f3747e, this.f3746e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1162e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        if (defpackage.C11268e.m3186class(r13, (java.util.List) r4, r18) != r7) goto L32;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.f3748e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L51
            if (r0 == r5) goto L3f
            if (r0 == r4) goto L29
            if (r0 != r3) goto L21
            eُٜۛ r0 = r1.f3753e
            java.util.List r0 = (java.util.List) r0
            eؚؗؔ r2 = r1.f3745e
            defpackage.AbstractC2003e.purchase(r19)     // Catch: java.lang.Throwable -> L1e
            goto La3
        L1e:
            r0 = move-exception
            goto Laf
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L29:
            int r2 = r1.f3751e
            int r0 = r1.f3749e
            eُٜۛ r4 = r1.f3753e
            eؚؗؔ r5 = r1.f3745e
            defpackage.AbstractC2003e.purchase(r19)     // Catch: java.lang.Throwable -> L3b
            r13 = r5
            r5 = r2
            r2 = r13
            r13 = r4
            r4 = r19
            goto L90
        L3b:
            r0 = move-exception
            r2 = r5
            goto Laf
        L3f:
            int r0 = r1.f3751e
            int r5 = r1.f3749e
            long r8 = r1.f3752e
            eُٜۛ r10 = r1.f3753e
            eؚؗؔ r11 = r1.f3745e
            defpackage.AbstractC2003e.purchase(r19)
            r16 = r5
        L4e:
            r14 = r8
            r13 = r10
            goto L74
        L51:
            defpackage.AbstractC2003e.purchase(r19)
            eُٜۛ r10 = r1.f3750e
            eٍٖ٘ r0 = r10.f22634e
            r1.f3745e = r0
            r1.f3753e = r10
            long r8 = r1.f3747e
            r1.f3752e = r8
            int r11 = r1.f3746e
            r1.f3749e = r11
            r1.f3751e = r2
            r1.f3748e = r5
            java.lang.Object r5 = r0.appmetrica(r1)
            if (r5 != r7) goto L6f
            goto La2
        L6f:
            r16 = r11
            r11 = r0
            r0 = r2
            goto L4e
        L74:
            eّٕٓ r5 = defpackage.AbstractC6731e.ad     // Catch: java.lang.Throwable -> Lad
            eًَٗ r12 = new eًَٗ     // Catch: java.lang.Throwable -> Lad
            r17 = 0
            r12.<init>(r13, r14, r16, r17)     // Catch: java.lang.Throwable -> Lad
            r1.f3745e = r11     // Catch: java.lang.Throwable -> Lad
            r1.f3753e = r13     // Catch: java.lang.Throwable -> Lad
            r1.f3749e = r0     // Catch: java.lang.Throwable -> Lad
            r1.f3751e = r2     // Catch: java.lang.Throwable -> Lad
            r1.f3748e = r4     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r4 = defpackage.AbstractC5336e.advert(r5, r12, r1)     // Catch: java.lang.Throwable -> Lad
            if (r4 != r7) goto L8e
            goto La2
        L8e:
            r5 = r2
            r2 = r11
        L90:
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L1e
            r1.f3745e = r2     // Catch: java.lang.Throwable -> L1e
            r1.f3753e = r6     // Catch: java.lang.Throwable -> L1e
            r1.f3749e = r0     // Catch: java.lang.Throwable -> L1e
            r1.f3751e = r5     // Catch: java.lang.Throwable -> L1e
            r1.f3748e = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = defpackage.C11268e.m3186class(r13, r4, r1)     // Catch: java.lang.Throwable -> L1e
            if (r0 != r7) goto La3
        La2:
            return r7
        La3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1e
            eٍٖ٘ r2 = (defpackage.C17651e) r2
            r2.billing(r6)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lad:
            r0 = move-exception
            r2 = r11
        Laf:
            eٍٖ٘ r2 = (defpackage.C17651e) r2
            r2.billing(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1162e.loadAd(java.lang.Object):java.lang.Object");
    }
}
