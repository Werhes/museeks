package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1785e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f4823e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ C8054e f4824e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ long f4825e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ boolean f4826e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C4246e f4827e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ int f4828e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f4829e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f4830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785e(boolean z, int i, long j, C4246e c4246e, C8054e c8054e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f4826e = z;
        this.f4828e = i;
        this.f4825e = j;
        this.f4827e = c4246e;
        this.f4824e = c8054e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C1785e(this.f4826e, this.f4828e, this.f4825e, this.f4827e, this.f4824e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1785e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003e -> B:5:0x0041). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f4829e
            r1 = 0
            r2 = 1
            int r3 = r11.f4828e
            boolean r4 = r11.f4826e
            if (r0 == 0) goto L1c
            if (r0 != r2) goto L14
            int r0 = r11.f4830e
            int r5 = r11.f4823e
            defpackage.AbstractC2003e.purchase(r12)
            goto L41
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            defpackage.AbstractC2003e.purchase(r12)
            r12 = 1500(0x5dc, float:2.102E-42)
            if (r4 != 0) goto L29
            if (r3 >= r12) goto L29
            if (r3 != 0) goto L28
            goto L29
        L28:
            r12 = r3
        L29:
            r0 = r12
            r5 = r1
        L2b:
            eْؕؖ r12 = new eْؕؖ
            long r6 = r11.f4825e
            r12.<init>(r5, r6, r0)
            r11.f4823e = r5
            r11.f4830e = r0
            r11.f4829e = r2
            java.lang.Object r12 = r12.startapp(r11)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r12 != r6) goto L41
            return r6
        L41:
            ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems r12 = (ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems) r12
            java.lang.Object r6 = r12.ad
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L4b
            eْۨٝ r6 = defpackage.C13664e.f27089e
        L4b:
            eّؖٝ r7 = r11.f4827e
            java.lang.Object r8 = r7.f9318e
            java.util.List r8 = (java.util.List) r8
            r8.addAll(r6)
            int r5 = r5 + r0
            int r8 = defpackage.C8054e.f16358e
            eًٛۖ r8 = r11.f4824e
            eٖٛ٘ r9 = r8.f16361e
            eٖٛ٘ r10 = r8.f16362e
            int r9 = r9.purchase()
            if (r9 != 0) goto L72
            java.lang.Integer r12 = r12.vip
            if (r12 == 0) goto L6c
            int r12 = r12.intValue()
            goto L6d
        L6c:
            r12 = r1
        L6d:
            eٖٛ٘ r8 = r8.f16361e
            r8.startapp(r12)
        L72:
            int r12 = r10.purchase()
            int r8 = r6.size()
            int r8 = r8 + r12
            r10.startapp(r8)
            int r12 = r6.size()
            if (r12 < r0) goto L92
            if (r4 != 0) goto L2b
            if (r3 <= 0) goto L2b
            java.lang.Object r12 = r7.f9318e
            java.util.List r12 = (java.util.List) r12
            int r12 = r12.size()
            if (r12 < r3) goto L2b
        L92:
            if (r4 == 0) goto L9b
            java.lang.Object r12 = r7.f9318e
            java.util.List r12 = (java.util.List) r12
            java.util.Collections.reverse(r12)
        L9b:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1785e.loadAd(java.lang.Object):java.lang.Object");
    }
}
