package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3229e {
    public final boolean ad;
    public final C6656e appmetrica;
    public InterfaceC6512e billing;
    public final Function1 license;
    public final Function0 metrica;
    public final C14995e purchase;
    public final Function0 vip;
    public InterfaceC6512e yandex;

    public C3229e(boolean z, Function0 function0, Function0 function02, EnumC8613e enumC8613e, Function1 function1) {
        this.ad = z;
        this.vip = function0;
        this.metrica = function02;
        this.license = function1;
        if (z && enumC8613e == EnumC8613e.f17427e) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        this.appmetrica = AbstractC14533e.purchase(new C5505e(this, 1));
        float f = AbstractC4229e.ad;
        C14995e c14995e = new C14995e(enumC8613e);
        c14995e.ad = function1;
        this.purchase = c14995e;
        this.billing = AbstractC12696e.license();
        this.yandex = AbstractC12696e.license();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, eٔۦْ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.InterfaceC8642e r10, float r11, defpackage.AbstractC10731e r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.C7739e
            if (r0 == 0) goto L13
            r0 = r12
            eًؗؖ r0 = (defpackage.C7739e) r0
            int r1 = r0.f15709e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15709e = r1
            goto L18
        L13:
            eًؗؖ r0 = new eًؗؖ
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f15707e
            int r1 = r0.f15709e
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            eٔۦْ r10 = r0.f15708e
            defpackage.AbstractC2003e.purchase(r12)
            r6 = r9
            goto L51
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L30:
            defpackage.AbstractC2003e.purchase(r12)
            eٔۦْ r4 = new eٔۦْ
            r4.<init>()
            eُؚۢ r3 = new eُؚۢ
            r8 = 0
            r6 = r9
            r5 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.f15708e = r4
            r0.f15709e = r2
            eٔ۟ٔ r10 = r6.purchase
            java.lang.Object r10 = defpackage.C14995e.vip(r10, r3, r0)
            eٟؔۙ r11 = defpackage.EnumC2821e.f6782e
            if (r10 != r11) goto L50
            return r11
        L50:
            r10 = r4
        L51:
            float r10 = r10.f29883e
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3229e.ad(eٌّؐ, float, eُؑ۠):java.lang.Object");
    }

    public final boolean appmetrica() {
        return this.purchase.startapp().metrica(EnumC8613e.f17427e);
    }

    public final boolean billing() {
        return ((C0576e) this.purchase.metrica).getValue() != EnumC8613e.f17430e;
    }

    public final EnumC8613e license() {
        return (EnumC8613e) ((C0576e) this.purchase.license).getValue();
    }

    public final Object metrica(AbstractC7185e abstractC7185e) {
        Object vip;
        Function1 function1 = this.license;
        EnumC8613e enumC8613e = EnumC8613e.f17428e;
        return (((Boolean) function1.invoke(enumC8613e)).booleanValue() && (vip = vip(enumC8613e, this.billing, abstractC7185e)) == EnumC2821e.f6782e) ? vip : Unit.INSTANCE;
    }

    public final Object purchase(AbstractC7185e abstractC7185e) {
        Object vip;
        Function1 function1 = this.license;
        EnumC8613e enumC8613e = EnumC8613e.f17430e;
        return (((Boolean) function1.invoke(enumC8613e)).booleanValue() && (vip = vip(enumC8613e, this.yandex, abstractC7185e)) == EnumC2821e.f6782e) ? vip : Unit.INSTANCE;
    }

    public final Object startapp(AbstractC7185e abstractC7185e) {
        Object vip;
        EnumC8613e enumC8613e = appmetrica() ? EnumC8613e.f17427e : EnumC8613e.f17428e;
        return (((Boolean) this.license.invoke(enumC8613e)).booleanValue() && (vip = vip(enumC8613e, this.billing, abstractC7185e)) == EnumC2821e.f6782e) ? vip : Unit.INSTANCE;
    }

    public final Object vip(EnumC8613e enumC8613e, InterfaceC6512e interfaceC6512e, AbstractC7185e abstractC7185e) {
        C14995e c14995e = this.purchase;
        Object ad = c14995e.ad(enumC8613e, EnumC6955e.f14256e, new C8568e(c14995e, interfaceC6512e, null), abstractC7185e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (ad != enumC2821e) {
            ad = Unit.INSTANCE;
        }
        return ad == enumC2821e ? ad : Unit.INSTANCE;
    }

    public final Object yandex(AbstractC7185e abstractC7185e) {
        Object vip;
        if (this.ad) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Function1 function1 = this.license;
        EnumC8613e enumC8613e = EnumC8613e.f17427e;
        return (((Boolean) function1.invoke(enumC8613e)).booleanValue() && (vip = vip(enumC8613e, this.yandex, abstractC7185e)) == EnumC2821e.f6782e) ? vip : Unit.INSTANCE;
    }
}
