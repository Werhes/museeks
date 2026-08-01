package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16056e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C15867e f31613e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ C15867e f31614e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f31615e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ float[] f31616e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ boolean f31617e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17838e[] f31618e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ float[] f31619e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f31620e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f31621e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16056e(boolean z, float[] fArr, float[] fArr2, InterfaceC17838e[] interfaceC17838eArr, InterfaceC3314e interfaceC3314e, C15867e c15867e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f31617e = z;
        this.f31619e = fArr;
        this.f31616e = fArr2;
        this.f31618e = interfaceC17838eArr;
        this.f31615e = interfaceC3314e;
        this.f31614e = c15867e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C16056e c16056e = new C16056e(this.f31617e, this.f31619e, this.f31616e, this.f31618e, this.f31615e, this.f31614e, interfaceC5083e);
        c16056e.f31620e = obj;
        return c16056e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C16056e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (r13 == r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (defpackage.AbstractC16481e.vip(150, r12) == r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a6, code lost:
    
        if (r3 == false) goto L34;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a3 -> B:6:0x00a6). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f31620e
            eۡۦ r0 = (defpackage.InterfaceC18435e) r0
            int r1 = r12.f31621e
            r2 = 2
            boolean r3 = r12.f31617e
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L25
            if (r1 == r4) goto L1f
            if (r1 != r2) goto L17
            defpackage.AbstractC2003e.purchase(r13)
            goto La6
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            eٕۧۖ r1 = r12.f31613e
            defpackage.AbstractC2003e.purchase(r13)
            goto L57
        L25:
            defpackage.AbstractC2003e.purchase(r13)
        L28:
            eٌِٞ r13 = r0.advert()
            boolean r13 = defpackage.AbstractC6629e.amazon(r13)
            if (r13 == 0) goto La8
            if (r3 == 0) goto L3b
            eِؕۧ r13 = r12.f31615e
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r13.setValue(r1)
        L3b:
            eٜؔ۟ r13 = new eٜؔ۟
            r1 = 17
            r13.<init>(r1)
            r12.f31620e = r0
            eٕۧۖ r1 = r12.f31614e
            r12.f31613e = r1
            r12.f31621e = r4
            eٌِٞ r6 = r12.f21135e
            eٌۤؕ r6 = defpackage.AbstractC0326e.advert(r6)
            java.lang.Object r13 = r6.mo1675catch(r13, r12)
            if (r13 != r5) goto L57
            goto La5
        L57:
            java.lang.Number r13 = (java.lang.Number) r13
            long r6 = r13.longValue()
            r1.startapp(r6)
            r13 = 0
        L61:
            r1 = 4
            if (r13 >= r1) goto L96
            float[] r1 = r12.f31616e
            r6 = r1[r13]
            float[] r7 = r12.f31619e
            r7[r13] = r6
            if (r3 == 0) goto L81
            r6 = 1000000(0xf4240, float:1.401298E-39)
            eؘؖؑ r8 = defpackage.AbstractC15440e.f30517e
            int r6 = r8.adcel(r6)
            double r8 = (double) r6
            double r8 = java.lang.Math.cbrt(r8)
            r10 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r8 / r10
            float r6 = (float) r8
            goto L82
        L81:
            r6 = 0
        L82:
            r1[r13] = r6
            r1 = r7[r13]
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L8d
            eٓؗٙ r1 = defpackage.AbstractC3734e.vip
            goto L8f
        L8d:
            eٓؗٙ r1 = defpackage.AbstractC3734e.ad
        L8f:
            e٘ٙۦ[] r6 = r12.f31618e
            r6[r13] = r1
            int r13 = r13 + 1
            goto L61
        L96:
            r12.f31620e = r0
            r13 = 0
            r12.f31613e = r13
            r12.f31621e = r2
            r6 = 150(0x96, double:7.4E-322)
            java.lang.Object r13 = defpackage.AbstractC16481e.vip(r6, r12)
            if (r13 != r5) goto La6
        La5:
            return r5
        La6:
            if (r3 != 0) goto L28
        La8:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16056e.loadAd(java.lang.Object):java.lang.Object");
    }
}
