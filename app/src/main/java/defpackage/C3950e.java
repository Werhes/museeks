package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3950e extends AbstractC7185e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f8809e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ byte[] f8810e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C10345e f8811e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ String f8812e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ long f8813e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3950e(C10345e c10345e, InterfaceC5083e interfaceC5083e) {
        super(4, interfaceC5083e);
        this.f8811e = c10345e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj).longValue();
        C3950e c3950e = new C3950e(this.f8811e, (InterfaceC5083e) obj4);
        c3950e.f8813e = longValue;
        c3950e.f8812e = (String) obj2;
        c3950e.f8810e = (byte[]) obj3;
        return c3950e.loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (defpackage.AbstractC5336e.advert(r10, r2, r9) == r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r10 == r8) goto L17;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r10) {
        /*
            r9 = this;
            long r0 = r9.f8813e
            java.lang.String r2 = r9.f8812e
            byte[] r3 = r9.f8810e
            int r4 = r9.f8809e
            r5 = 2
            r6 = 1
            r7 = 0
            eٟؔۙ r8 = defpackage.EnumC2821e.f6782e
            if (r4 == 0) goto L23
            if (r4 == r6) goto L1f
            if (r4 != r5) goto L17
            defpackage.AbstractC2003e.purchase(r10)
            goto L5b
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            defpackage.AbstractC2003e.purchase(r10)
            goto L35
        L23:
            defpackage.AbstractC2003e.purchase(r10)
            r9.f8812e = r7
            r9.f8810e = r7
            r9.f8813e = r0
            r9.f8809e = r6
            java.lang.Object r10 = defpackage.C6609e.ad(r0, r2, r3, r9)
            if (r10 != r8) goto L35
            goto L5a
        L35:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L5b
            eّٕٓ r10 = defpackage.AbstractC6731e.ad
            eْؐؔ r10 = defpackage.AbstractC1497e.ad
            eْؐؔ r10 = r10.f25795e
            eّۤ r2 = new eّۤ
            eَِٙ r3 = r9.f8811e
            r4 = 28
            r2.<init>(r3, r7, r4)
            r9.f8812e = r7
            r9.f8810e = r7
            r9.f8813e = r0
            r9.f8809e = r5
            java.lang.Object r10 = defpackage.AbstractC5336e.advert(r10, r2, r9)
            if (r10 != r8) goto L5b
        L5a:
            return r8
        L5b:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3950e.loadAd(java.lang.Object):java.lang.Object");
    }
}
