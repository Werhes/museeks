package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۨۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12159e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f24441e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C9398e f24442e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f24443e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C8007e f24444e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ AbstractC11424e f24445e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f24446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12159e(C8007e c8007e, C9398e c9398e, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f24444e = c8007e;
        this.f24442e = c9398e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C12159e c12159e = new C12159e(this.f24444e, this.f24442e, (InterfaceC5083e) obj3);
        c12159e.f24445e = (AbstractC11424e) obj;
        c12159e.f24443e = obj2;
        return c12159e.loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00aa, code lost:
    
        if (r0.purchase(r10, (defpackage.C5042e) r11) == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ac, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r11 != r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[LOOP:0: B:25:0x007a->B:27:0x0080, LOOP_END] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r11) {
        /*
            r10 = this;
            eُۨۨ r0 = r10.f24445e
            java.lang.Object r1 = r10.f24443e
            int r2 = r10.f24446e
            r3 = 2
            r4 = 1
            r5 = 0
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1e
            if (r2 != r3) goto L16
            defpackage.AbstractC2003e.purchase(r11)
            goto Lad
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            int r1 = r10.f24441e
            defpackage.AbstractC2003e.purchase(r11)
            goto L9c
        L25:
            defpackage.AbstractC2003e.purchase(r11)
            boolean r11 = r1 instanceof defpackage.AbstractC14601e
            if (r11 == 0) goto Lb0
            java.lang.Object r11 = r0.f22964e
            r2 = r11
            eَٔٔ r2 = (defpackage.C10263e) r2
            r2.license = r1
            r2.vip(r5)
            eَٔٔ r11 = (defpackage.C10263e) r11
            eؘۙٗ r1 = r11.purchase
            eًۛؗ r2 = defpackage.AbstractC15698e.ad
            java.lang.Object r1 = r1.purchase(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 20
            eًؙٙ r7 = r10.f24444e
            if (r1 == 0) goto L65
            int r8 = r1.intValue()
            r7.getClass()
            if (r8 < r2) goto L65
            int r2 = r1.intValue()
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r8) goto L60
            int r1 = r1.intValue()
            int r1 = r1 + r4
            goto L69
        L60:
            int r1 = r1.intValue()
            goto L69
        L65:
            r7.getClass()
            r1 = r2
        L69:
            eْؓۗ r2 = new eْؓۗ
            eٍُۘ r8 = r10.f24442e
            r2.<init>(r1, r8)
            java.util.ArrayList r7 = r7.ad
            java.util.List r7 = defpackage.AbstractC13480e.m3607transient(r7)
            java.util.Iterator r7 = r7.iterator()
        L7a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r7.next()
            kotlin.jvm.functions.Function3 r8 = (kotlin.jvm.functions.Function3) r8
            eِٕ٘ r9 = new eِٕ٘
            r9.<init>(r8, r2)
            r2 = r9
            goto L7a
        L8d:
            r10.f24445e = r0
            r10.f24443e = r5
            r10.f24441e = r1
            r10.f24446e = r4
            java.lang.Object r11 = r2.ad(r11, r10)
            if (r11 != r6) goto L9c
            goto Lac
        L9c:
            eؗٝٝ r11 = (defpackage.C5042e) r11
            r10.f24445e = r5
            r10.f24443e = r5
            r10.f24441e = r1
            r10.f24446e = r3
            java.lang.Object r11 = r0.purchase(r10, r11)
            if (r11 != r6) goto Lad
        Lac:
            return r6
        Lad:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        Lb0:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "\n|Fail to prepare request body for sending. \n|The body type is: "
            r11.<init>(r2)
            java.lang.Class r1 = r1.getClass()
            eؙّؔ r2 = defpackage.AbstractC3820e.ad
            eؚ٘ٚ r1 = r2.vip(r1)
            r11.append(r1)
            java.lang.String r1 = ", with Content-Type: "
            r11.append(r1)
            java.lang.Object r0 = r0.f22964e
            eٌؙؑ r0 = (defpackage.InterfaceC8526e) r0
            eٜؓؗ r0 = defpackage.AbstractC17419e.vip(r0)
            r11.append(r0)
            java.lang.String r0 = ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header."
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = defpackage.AbstractC17540e.appmetrica(r11)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12159e.loadAd(java.lang.Object):java.lang.Object");
    }
}
