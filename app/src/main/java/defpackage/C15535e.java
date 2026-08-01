package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15535e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f30675e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ boolean f30676e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C0763e f30677e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ float f30678e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C9755e f30679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15535e(C9755e c9755e, float f, boolean z, C0763e c0763e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f30679e = c9755e;
        this.f30678e = f;
        this.f30676e = z;
        this.f30677e = c0763e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C15535e(this.f30679e, this.f30678e, this.f30676e, this.f30677e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C15535e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r8.ad(r7.f30677e, r7) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (defpackage.AbstractC16653e.purchase(r8, r0, r7) == r4) goto L27;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f30675e
            eٍٟۛ r1 = r7.f30679e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L12
            defpackage.AbstractC2003e.purchase(r8)
            goto L62
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            defpackage.AbstractC2003e.purchase(r8)
            goto L4f
        L1e:
            defpackage.AbstractC2003e.purchase(r8)
            eٌۧٔ r8 = r1.f19301e
            float r0 = defpackage.AbstractC12388e.ad
            float r0 = r7.f30678e
            boolean r5 = java.lang.Float.isNaN(r0)
            if (r5 != 0) goto L46
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 == 0) goto L34
            goto L46
        L34:
            r5 = 0
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L40
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
        L3e:
            float r0 = (float) r5
            goto L46
        L40:
            double r5 = (double) r0
            double r5 = java.lang.Math.floor(r5)
            goto L3e
        L46:
            r7.f30675e = r3
            java.lang.Object r8 = defpackage.AbstractC16653e.purchase(r8, r0, r7)
            if (r8 != r4) goto L4f
            goto L61
        L4f:
            boolean r8 = r7.f30676e
            if (r8 == 0) goto L62
            eؚؚّ r8 = r1.f19298e
            eٕؔٚ r8 = r8.billing
            r7.f30675e = r2
            eؒؐۥ r0 = r7.f30677e
            java.lang.Object r8 = r8.ad(r0, r7)
            if (r8 != r4) goto L62
        L61:
            return r4
        L62:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15535e.loadAd(java.lang.Object):java.lang.Object");
    }
}
