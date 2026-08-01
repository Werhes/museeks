package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ۠ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10580e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f20867e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ C1633e f20868e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ C14390e f20869e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C1615e f20870e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ C11885e f20871e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f20872e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C8574e f20873e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Context f20874e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C7142e f20875e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C16007e f20876e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f20877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10580e(C16007e c16007e, C8574e c8574e, C7142e c7142e, C1615e c1615e, Context context, C14390e c14390e, C1633e c1633e, C11885e c11885e, InterfaceC18435e interfaceC18435e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f20876e = c16007e;
        this.f20873e = c8574e;
        this.f20875e = c7142e;
        this.f20870e = c1615e;
        this.f20874e = context;
        this.f20869e = c14390e;
        this.f20868e = c1633e;
        this.f20871e = c11885e;
        this.f20872e = interfaceC18435e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C10580e c10580e = new C10580e(this.f20876e, this.f20873e, this.f20875e, this.f20870e, this.f20874e, this.f20869e, this.f20868e, this.f20871e, this.f20872e, interfaceC5083e);
        c10580e.f20877e = obj;
        return c10580e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C10580e) advert((InterfaceC5083e) obj2, (EnumC18411e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (kotlin.Unit.INSTANCE == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r13 == r7) goto L27;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f20867e
            r1 = 0
            eؚٓٞ r2 = r12.f20875e
            eٌٌَ r3 = r12.f20873e
            r4 = 2
            eؓؗ r5 = r12.f20870e
            r6 = 1
            eٟؔۙ r7 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L23
            if (r0 == r6) goto L1f
            if (r0 != r4) goto L17
            defpackage.AbstractC2003e.purchase(r13)
            goto L80
        L17:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1f:
            defpackage.AbstractC2003e.purchase(r13)
            goto L60
        L23:
            defpackage.AbstractC2003e.purchase(r13)
            java.lang.Object r13 = r12.f20877e
            eٟ۠ r13 = (defpackage.EnumC18411e) r13
            int r13 = r13.ordinal()
            if (r13 == 0) goto L8e
            r0 = 4
            if (r13 == r0) goto L34
            goto L93
        L34:
            long r8 = r3.ad
            long r10 = r2.f14622e
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 > 0) goto L48
            java.lang.Object r13 = r5.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L89
        L48:
            eٓۧؒ r13 = r12.f20869e
            eؓۤ۠ r13 = r13.ad()
            eؘۜٚ r13 = (defpackage.AbstractC5918e) r13
            r12.f20867e = r6
            eٖؖۙ r0 = r12.f20876e
            r0.getClass()
            android.content.Context r6 = r12.f20874e
            java.lang.Object r13 = defpackage.C16007e.vip(r0, r6, r13, r12)
            if (r13 != r7) goto L60
            goto L7f
        L60:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            java.lang.Object r0 = r5.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L89
            if (r13 == 0) goto L89
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r12.f20867e = r4
            r5.smaato(r1, r13)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            if (r13 != r7) goto L80
        L7f:
            return r7
        L80:
            eِٞٔ r13 = r12.f20871e
            long r0 = r13.ad
            eؘّؓ r13 = r12.f20868e
            r13.vip(r0)
        L89:
            long r0 = r3.ad
            r2.f14622e = r0
            goto L93
        L8e:
            eۡۦ r13 = r12.f20872e
            defpackage.AbstractC9743e.license(r13, r1)
        L93:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10580e.loadAd(java.lang.Object):java.lang.Object");
    }
}
