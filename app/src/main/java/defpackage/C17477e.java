package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؑٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17477e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Serializable f34234e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ boolean f34235e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C3967e f34236e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C4246e f34237e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f34238e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C7576e f34239e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f34240e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C3967e f34241e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17477e(C4246e c4246e, C7576e c7576e, C3967e c3967e, Function2 function2, boolean z, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f34237e = c4246e;
        this.f34239e = c7576e;
        this.f34236e = c3967e;
        this.f34238e = function2;
        this.f34235e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C17477e) mopub((InterfaceC5083e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r10 != r8) goto L30;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f34240e
            r1 = 0
            eؚؖٞ r2 = r9.f34236e
            eؚٖۤ r3 = r9.f34239e
            eّؖٝ r4 = r9.f34237e
            r5 = 3
            r6 = 2
            r7 = 1
            eٟؔۙ r8 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L38
            if (r0 == r7) goto L30
            if (r0 == r6) goto L28
            if (r0 != r5) goto L20
            eؚؖٞ r2 = r9.f34241e
            java.io.Serializable r0 = r9.f34234e
            eٍِؕ r0 = (defpackage.C11506e) r0
            defpackage.AbstractC2003e.purchase(r10)
            goto L7b
        L20:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L28:
            java.io.Serializable r0 = r9.f34234e
            eؚؖٞ r0 = (defpackage.C3967e) r0
            defpackage.AbstractC2003e.purchase(r10)     // Catch: defpackage.C11506e -> L6c
            goto L63
        L30:
            java.io.Serializable r0 = r9.f34234e
            eّؖٝ r0 = (defpackage.C4246e) r0
            defpackage.AbstractC2003e.purchase(r10)     // Catch: defpackage.C11506e -> L6c
            goto L4d
        L38:
            defpackage.AbstractC2003e.purchase(r10)
            r9.f34234e = r4     // Catch: defpackage.C11506e -> L6c
            r9.f34240e = r7     // Catch: defpackage.C11506e -> L6c
            eُّؒ r10 = new eُّؒ     // Catch: defpackage.C11506e -> L6c
            r0 = 1
            r10.<init>(r0, r1, r3)     // Catch: defpackage.C11506e -> L6c
            java.lang.Object r10 = defpackage.AbstractC12731e.purchase(r10, r9)     // Catch: defpackage.C11506e -> L6c
            if (r10 != r8) goto L4c
            goto L7a
        L4c:
            r0 = r4
        L4d:
            r0.f9318e = r10     // Catch: defpackage.C11506e -> L6c
            kotlin.jvm.functions.Function2 r10 = r9.f34238e     // Catch: defpackage.C11506e -> L6c
            boolean r0 = r9.f34235e     // Catch: defpackage.C11506e -> L6c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: defpackage.C11506e -> L6c
            r9.f34234e = r2     // Catch: defpackage.C11506e -> L6c
            r9.f34240e = r6     // Catch: defpackage.C11506e -> L6c
            java.lang.Object r10 = r10.invoke(r0, r9)     // Catch: defpackage.C11506e -> L6c
            if (r10 != r8) goto L62
            goto L7a
        L62:
            r0 = r2
        L63:
            java.lang.Number r10 = (java.lang.Number) r10     // Catch: defpackage.C11506e -> L6c
            int r10 = r10.intValue()     // Catch: defpackage.C11506e -> L6c
            r0.f8852e = r10     // Catch: defpackage.C11506e -> L6c
            goto L83
        L6c:
            java.lang.Object r10 = r4.f9318e
            r9.f34234e = r1
            r9.f34241e = r2
            r9.f34240e = r5
            java.lang.Object r10 = r3.adcel(r10, r7, r9)
            if (r10 != r8) goto L7b
        L7a:
            return r8
        L7b:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r2.f8852e = r10
        L83:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17477e.loadAd(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        return new C17477e(this.f34237e, this.f34239e, this.f34236e, this.f34238e, this.f34235e, interfaceC5083e);
    }
}
