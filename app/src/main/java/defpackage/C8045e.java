package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8045e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16348e = 0;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ long f16349e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f16350e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f16351e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public long f16352e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8045e(C10709e c10709e, long j, long j2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f16350e = c10709e;
        this.f16352e = j;
        this.f16349e = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8045e(C11950e c11950e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f16350e = c11950e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f16348e) {
            case 0:
                return new C8045e((C10709e) this.f16350e, this.f16352e, this.f16349e, interfaceC5083e);
            default:
                C8045e c8045e = new C8045e((C11950e) this.f16350e, interfaceC5083e);
                c8045e.f16349e = ((C11422e) obj).ad;
                return c8045e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16348e) {
            case 0:
                return ((C8045e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            default:
                long j = ((C11422e) obj).ad;
                C8045e c8045e = new C8045e((C11950e) this.f16350e, (InterfaceC5083e) obj2);
                c8045e.f16349e = j;
                return c8045e.loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f16348e
            switch(r0) {
                case 0: goto L8f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r11.f16350e
            eِۙ r0 = (defpackage.C11950e) r0
            int r1 = r11.f16351e
            r2 = 3
            r3 = 2
            r4 = 1
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L34
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L23
            long r0 = r11.f16352e
            long r2 = r11.f16349e
            defpackage.AbstractC2003e.purchase(r12)
            r7 = r2
            r3 = r0
            r0 = r12
            goto L7d
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2b:
            long r3 = r11.f16352e
            long r7 = r11.f16349e
            defpackage.AbstractC2003e.purchase(r12)
            r1 = r12
            goto L63
        L34:
            long r7 = r11.f16349e
            defpackage.AbstractC2003e.purchase(r12)
            r1 = r12
            goto L4d
        L3b:
            defpackage.AbstractC2003e.purchase(r12)
            long r7 = r11.f16349e
            eَۦؕ r1 = r0.purchase
            r11.f16349e = r7
            r11.f16351e = r4
            java.lang.Object r1 = r1.vip(r7, r11)
            if (r1 != r6) goto L4d
            goto L8e
        L4d:
            eُۨۚ r1 = (defpackage.C11422e) r1
            long r9 = r1.ad
            long r9 = defpackage.C11422e.license(r7, r9)
            r11.f16349e = r7
            r11.f16352e = r9
            r11.f16351e = r3
            java.lang.Object r1 = r0.ad(r9, r11)
            if (r1 != r6) goto L62
            goto L8e
        L62:
            r3 = r9
        L63:
            eُۨۚ r1 = (defpackage.C11422e) r1
            long r9 = r1.ad
            eَۦؕ r0 = r0.purchase
            long r3 = defpackage.C11422e.license(r3, r9)
            r11.f16349e = r7
            r11.f16352e = r9
            r11.f16351e = r2
            r5 = r11
            r1 = r3
            r3 = r9
            java.lang.Object r0 = r0.ad(r1, r3, r5)
            if (r0 != r6) goto L7d
            goto L8e
        L7d:
            eُۨۚ r0 = (defpackage.C11422e) r0
            long r0 = r0.ad
            long r0 = defpackage.C11422e.license(r3, r0)
            long r0 = defpackage.C11422e.license(r7, r0)
            eُۨۚ r6 = new eُۨۚ
            r6.<init>(r0)
        L8e:
            return r6
        L8f:
            int r0 = r11.f16351e
            r1 = 1
            if (r0 == 0) goto La2
            if (r0 != r1) goto L9a
            defpackage.AbstractC2003e.purchase(r12)
            goto Lbb
        L9a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        La2:
            defpackage.AbstractC2003e.purchase(r12)
            java.lang.Object r0 = r11.f16350e
            eُّؐ r0 = (defpackage.C10709e) r0
            long r2 = r11.f16352e
            r6 = r2
            long r3 = r11.f16349e
            r11.f16351e = r1
            r5 = r11
            r1 = r6
            java.lang.Object r0 = r0.license(r1, r3, r5)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto Lbb
            goto Lbd
        Lbb:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8045e.loadAd(java.lang.Object):java.lang.Object");
    }
}
