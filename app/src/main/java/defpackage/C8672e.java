package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8672e extends AbstractC7185e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC4619e f17508e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ C17047e f17509e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public /* synthetic */ C3225e f17510e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f17511e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5178e f17512e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ C3225e f17513e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f17514e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f17515e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8672e(InterfaceC5178e interfaceC5178e, C17047e c17047e, InterfaceC5083e interfaceC5083e) {
        super(4, interfaceC5083e);
        this.f17512e = interfaceC5178e;
        this.f17509e = c17047e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C8672e c8672e = new C8672e(this.f17512e, this.f17509e, (InterfaceC5083e) obj4);
        c8672e.f17513e = (C3225e) obj2;
        c8672e.f17510e = (C3225e) obj3;
        return c8672e.loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Type inference failed for: r6v3, types: [eؚؗؔ] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r12) {
        /*
            r11 = this;
            eًؕۜ r0 = r11.f17513e
            eًؕۜ r1 = r11.f17510e
            int r2 = r11.f17511e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            eٟؔۙ r8 = defpackage.EnumC2821e.f6782e
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L35
            if (r2 == r5) goto L27
            if (r2 != r4) goto L1f
            eؚؗؔ r0 = r11.f17508e
            defpackage.AbstractC2003e.purchase(r12)     // Catch: java.lang.Throwable -> L1c
            goto L97
        L1c:
            r12 = move-exception
            goto La7
        L1f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L27:
            int r3 = r11.f17514e
            int r2 = r11.f17515e
            eؚؗؔ r5 = r11.f17508e
            defpackage.AbstractC2003e.purchase(r12)     // Catch: java.lang.Throwable -> L31
            goto L7a
        L31:
            r12 = move-exception
            r0 = r5
            goto La7
        L35:
            int r2 = r11.f17515e
            eؚؗؔ r6 = r11.f17508e
            defpackage.AbstractC2003e.purchase(r12)
            r12 = r6
            goto L60
        L3e:
            defpackage.AbstractC2003e.purchase(r12)
            r12 = 27
            eؗۜۥ r2 = r11.f17512e
            eؙؕؑ r2 = (defpackage.C6169e) r2
            r2.ad(r12)
            eٖٗۛ r12 = r11.f17509e
            eٍٖ٘ r12 = r12.f33389e
            r11.f17513e = r0
            r11.f17510e = r1
            r11.f17508e = r12
            r11.f17515e = r3
            r11.f17511e = r6
            java.lang.Object r2 = r12.appmetrica(r11)
            if (r2 != r8) goto L5f
            goto L95
        L5f:
            r2 = r3
        L60:
            eًۚ r6 = defpackage.C18353e.ad     // Catch: java.lang.Throwable -> La5
            r11.f17513e = r0     // Catch: java.lang.Throwable -> La5
            r11.f17510e = r1     // Catch: java.lang.Throwable -> La5
            r11.f17508e = r12     // Catch: java.lang.Throwable -> La5
            r11.f17515e = r2     // Catch: java.lang.Throwable -> La5
            r11.f17514e = r3     // Catch: java.lang.Throwable -> La5
            r11.f17511e = r5     // Catch: java.lang.Throwable -> La5
            eۣۡ r5 = defpackage.C18353e.vip     // Catch: java.lang.Throwable -> La5
            java.lang.Object r5 = r5.m4501e(r11)     // Catch: java.lang.Throwable -> La5
            if (r5 != r8) goto L77
            goto L95
        L77:
            r10 = r5
            r5 = r12
            r12 = r10
        L7a:
            eّؖٚ r12 = (defpackage.C4199e) r12     // Catch: java.lang.Throwable -> L31
            eؙٞؑ r6 = new eؙٞؑ     // Catch: java.lang.Throwable -> L31
            r9 = 13
            r6.<init>(r1, r0, r9)     // Catch: java.lang.Throwable -> L31
            r11.f17513e = r7     // Catch: java.lang.Throwable -> L31
            r11.f17510e = r7     // Catch: java.lang.Throwable -> L31
            r11.f17508e = r5     // Catch: java.lang.Throwable -> L31
            r11.f17515e = r2     // Catch: java.lang.Throwable -> L31
            r11.f17514e = r3     // Catch: java.lang.Throwable -> L31
            r11.f17511e = r4     // Catch: java.lang.Throwable -> L31
            java.lang.Object r12 = r12.m1505e(r6, r11)     // Catch: java.lang.Throwable -> L31
            if (r12 != r8) goto L96
        L95:
            return r8
        L96:
            r0 = r5
        L97:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1c
            eٍٖ٘ r0 = (defpackage.C17651e) r0
            r0.billing(r7)
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        La1:
            r10 = r0
            r0 = r12
            r12 = r10
            goto La7
        La5:
            r0 = move-exception
            goto La1
        La7:
            eٍٖ٘ r0 = (defpackage.C17651e) r0
            r0.billing(r7)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8672e.loadAd(java.lang.Object):java.lang.Object");
    }
}
