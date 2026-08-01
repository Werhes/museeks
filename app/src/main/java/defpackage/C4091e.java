package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4091e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C3967e f9045e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f9046e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C7576e f9047e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9048e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC15437e f9049e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C3967e f9050e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f9051e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4091e(C3967e c3967e, C7576e c7576e, InterfaceC15437e interfaceC15437e, Object obj, boolean z, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f9050e = c3967e;
        this.f9047e = c7576e;
        this.f9049e = interfaceC15437e;
        this.f9046e = obj;
        this.f9048e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4091e) mopub((InterfaceC5083e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r7.f9049e.vip(r7, r1) == r6) goto L16;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f9051e
            java.lang.Object r1 = r7.f9046e
            eؚٖۤ r2 = r7.f9047e
            eؚؖٞ r3 = r7.f9050e
            r4 = 2
            r5 = 1
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L24
            if (r0 == r5) goto L1e
            if (r0 != r4) goto L16
            defpackage.AbstractC2003e.purchase(r8)
            goto L4d
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            eؚؖٞ r0 = r7.f9045e
            defpackage.AbstractC2003e.purchase(r8)
            goto L37
        L24:
            defpackage.AbstractC2003e.purchase(r8)
            eؖ۠ؖ r8 = r2.billing()
            r7.f9045e = r3
            r7.f9051e = r5
            java.lang.Object r8 = r8.metrica(r7)
            if (r8 != r6) goto L36
            goto L4c
        L36:
            r0 = r3
        L37:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.f8852e = r8
            r8 = 0
            r7.f9045e = r8
            r7.f9051e = r4
            eْٕٛ r8 = r7.f9049e
            java.lang.Object r8 = r8.vip(r7, r1)
            if (r8 != r6) goto L4d
        L4c:
            return r6
        L4d:
            boolean r8 = r7.f9048e
            if (r8 == 0) goto L65
            eٍؘٖ r8 = r2.startapp
            eُِۙ r0 = new eُِۙ
            if (r1 == 0) goto L5c
            int r2 = r1.hashCode()
            goto L5d
        L5c:
            r2 = 0
        L5d:
            int r3 = r3.f8852e
            r0.<init>(r1, r2, r3)
            r8.m4115protected(r0)
        L65:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4091e.loadAd(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        return new C4091e(this.f9050e, this.f9047e, this.f9049e, this.f9046e, this.f9048e, interfaceC5083e);
    }
}
