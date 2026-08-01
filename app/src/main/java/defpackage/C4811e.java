package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4811e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f10252e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ Object f10253e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C2751e f10254e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC11424e f10255e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C7460e f10256e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ String f10257e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C8208e f10258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4811e(C8208e c8208e, String str, C2751e c2751e, Function2 function2, Object obj, AbstractC11424e abstractC11424e, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f10258e = c8208e;
        this.f10257e = str;
        this.f10254e = c2751e;
        this.f10256e = (C7460e) function2;
        this.f10253e = obj;
        this.f10255e = abstractC11424e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4811e) mopub((InterfaceC5083e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if (r11 == r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r10.f10254e.invoke(r11, r0, r7, r10) == r8) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r11 == r8) goto L38;
     */
    /* JADX WARN: Type inference failed for: r11v8, types: [eؚۛۖ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f10252e
            eٌِٞ r1 = r10.f21135e
            eٌؓۦ r2 = defpackage.C1368e.f4162e
            java.lang.String r3 = r10.f10257e
            eًۛؗ r4 = r10.f10258e
            r5 = 3
            r6 = 2
            r7 = 1
            eٟؔۙ r8 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L2c
            if (r0 == r7) goto L28
            if (r0 == r6) goto L24
            if (r0 != r5) goto L1c
            defpackage.AbstractC2003e.purchase(r11)
            goto La2
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            defpackage.AbstractC2003e.purchase(r11)
            goto L77
        L28:
            defpackage.AbstractC2003e.purchase(r11)
            goto L5a
        L2c:
            defpackage.AbstractC2003e.purchase(r11)
            java.lang.String r11 = r4.ad
            r10.f10252e = r7
            boolean r0 = defpackage.AbstractC1452e.ad()
            if (r0 != 0) goto L3c
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            goto L52
        L3c:
            eؗؒۚ r0 = r1.mo397public(r2)
            if (r0 == 0) goto L50
            eؒ۠ؓ r0 = (defpackage.C1368e) r0
            java.util.ArrayList r0 = r0.f4163e
            eِٖؖ r9 = new eِٖؖ
            r9.<init>(r11, r7, r3)
            r0.add(r9)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L50:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L52:
            if (r11 != r8) goto L55
            goto L57
        L55:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L57:
            if (r11 != r8) goto L5a
            goto La1
        L5a:
            eؚۛۖ r11 = r10.f10256e
            java.lang.Object r0 = r10.f10253e
            eُۨۨ r7 = r10.f10255e
            java.lang.Object r11 = r11.invoke(r0, r7)
            java.lang.Object r0 = r7.f22964e
            eًَۨ r0 = (defpackage.InterfaceC8376e) r0
            java.lang.Object r7 = r7.metrica()
            r10.f10252e = r6
            eّؔٞ r9 = r10.f10254e
            java.lang.Object r11 = r9.invoke(r11, r0, r7, r10)
            if (r11 != r8) goto L77
            goto La1
        L77:
            java.lang.String r11 = r4.ad
            r10.f10252e = r5
            boolean r0 = defpackage.AbstractC1452e.ad()
            if (r0 != 0) goto L84
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            goto L9a
        L84:
            eؗؒۚ r0 = r1.mo397public(r2)
            if (r0 == 0) goto L98
            eؒ۠ؓ r0 = (defpackage.C1368e) r0
            java.util.ArrayList r0 = r0.f4163e
            eِٖؖ r1 = new eِٖؖ
            r1.<init>(r11, r6, r3)
            r0.add(r1)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L98:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L9a:
            if (r11 != r8) goto L9d
            goto L9f
        L9d:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L9f:
            if (r11 != r8) goto La2
        La1:
            return r8
        La2:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4811e.loadAd(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [eؚۛۖ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        return new C4811e(this.f10258e, this.f10257e, this.f10254e, this.f10256e, this.f10253e, this.f10255e, interfaceC5083e);
    }
}
