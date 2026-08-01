package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f3353e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ long f3354e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9936e f3355e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0937e(boolean z, AbstractC9936e abstractC9936e, long j, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f3356e = z;
        this.f3355e = abstractC9936e;
        this.f3354e = j;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C0937e(this.f3356e, this.f3355e, this.f3354e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0937e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r11 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r11 == r3) goto L18;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f3353e
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L16
            if (r0 != r1) goto Le
            defpackage.AbstractC2003e.purchase(r11)
            goto L4c
        Le:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L16:
            defpackage.AbstractC2003e.purchase(r11)
            r9 = r10
            goto L36
        L1b:
            defpackage.AbstractC2003e.purchase(r11)
            boolean r11 = r10.f3356e
            eًٍۨ r0 = r10.f3355e
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            if (r11 != 0) goto L3c
            eَۦؕ r4 = r0.f19658e
            r10.f3353e = r2
            r5 = 0
            long r7 = r10.f3354e
            r9 = r10
            java.lang.Object r11 = r4.ad(r5, r7, r9)
            if (r11 != r3) goto L36
            goto L4b
        L36:
            eُۨۚ r11 = (defpackage.C11422e) r11
            r11.getClass()
            goto L51
        L3c:
            r9 = r10
            eَۦؕ r4 = r0.f19658e
            r9.f3353e = r1
            long r5 = r9.f3354e
            r7 = 0
            java.lang.Object r11 = r4.ad(r5, r7, r9)
            if (r11 != r3) goto L4c
        L4b:
            return r3
        L4c:
            eُۨۚ r11 = (defpackage.C11422e) r11
            r11.getClass()
        L51:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0937e.loadAd(java.lang.Object):java.lang.Object");
    }
}
