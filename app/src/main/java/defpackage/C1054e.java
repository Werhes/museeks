package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1054e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f3550e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C7576e f3551e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f3552e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1054e(C7576e c7576e, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f3551e = c7576e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1054e) mopub((InterfaceC5083e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r9.firebase(r8) != r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        if (r9 != r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (r9 == r7) goto L32;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f3552e
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            eؚٖۤ r6 = r8.f3551e
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L31
            if (r0 == r4) goto L2d
            if (r0 == r3) goto L29
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1d
            int r0 = r8.f3550e
            defpackage.AbstractC2003e.purchase(r9)     // Catch: java.lang.Throwable -> L1b
            goto L7c
        L1b:
            r9 = move-exception
            goto L7f
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L25:
            defpackage.AbstractC2003e.purchase(r9)
            goto L68
        L29:
            defpackage.AbstractC2003e.purchase(r9)
            goto L54
        L2d:
            defpackage.AbstractC2003e.purchase(r9)
            goto L49
        L31:
            defpackage.AbstractC2003e.purchase(r9)
            eؘؒؐ r9 = r6.advert
            boolean r9 = r9.ad()
            if (r9 == 0) goto L51
            eؖ۠ؖ r9 = r6.billing()
            r8.f3552e = r4
            java.lang.Object r9 = r9.ad(r8)
            if (r9 != r7) goto L49
            goto L7b
        L49:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
        L4f:
            r0 = r9
            goto L6f
        L51:
            r8.f3552e = r3
            r9 = r5
        L54:
            eؘۢؐ r9 = (defpackage.InterfaceC5979e) r9
            eٌِٞ r0 = r6.yandex()
            eؗٔۜ r3 = new eؗٔۜ
            r3.<init>(r6, r9, r5)
            r8.f3552e = r2
            java.lang.Object r9 = defpackage.AbstractC5336e.advert(r0, r3, r8)
            if (r9 != r7) goto L68
            goto L7b
        L68:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            goto L4f
        L6f:
            eِؒۜ r9 = r6.adcel     // Catch: java.lang.Throwable -> L1b
            r8.f3550e = r0     // Catch: java.lang.Throwable -> L1b
            r8.f3552e = r1     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r9 = r9.firebase(r8)     // Catch: java.lang.Throwable -> L1b
            if (r9 != r7) goto L7c
        L7b:
            return r7
        L7c:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L7f:
            eٍؘٖ r1 = r6.startapp
            eؑۦِ r2 = new eؑۦِ
            r2.<init>(r9, r0)
            r1.m4115protected(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1054e.loadAd(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        return new C1054e(this.f3551e, interfaceC5083e);
    }
}
