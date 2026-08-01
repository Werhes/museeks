package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٞۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14144e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f27972e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7185e f27973e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5857e f27974e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Context f27975e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Bundle f27976e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C10838e f27977e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f27978e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f27979e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C14144e(Context context, C10838e c10838e, AbstractC5857e abstractC5857e, Bundle bundle, Function4 function4, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27975e = context;
        this.f27977e = c10838e;
        this.f27974e = abstractC5857e;
        this.f27976e = bundle;
        this.f27973e = (AbstractC7185e) function4;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [eؚٖؓ, kotlin.jvm.functions.Function4] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C14144e c14144e = new C14144e(this.f27975e, this.f27977e, this.f27974e, this.f27976e, this.f27973e, interfaceC5083e);
        c14144e.f27978e = obj;
        return c14144e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C14144e) advert((InterfaceC5083e) obj2, (C6999e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v5, types: [eؚٖؓ, kotlin.jvm.functions.Function4] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.f27979e
            eؘُٜ r1 = r10.f27977e
            android.content.Context r2 = r10.f27975e
            r3 = 3
            r4 = 2
            r5 = 1
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r0 == 0) goto L31
            if (r0 == r5) goto L29
            if (r0 == r4) goto L1f
            if (r0 != r3) goto L17
            defpackage.AbstractC2003e.purchase(r11)
            return r11
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            boolean r0 = r10.f27972e
            java.lang.Object r2 = r10.f27978e
            eؚؚ٘ r2 = (defpackage.C6999e) r2
            defpackage.AbstractC2003e.purchase(r11)
            goto L6c
        L29:
            java.lang.Object r0 = r10.f27978e
            eؚؚ٘ r0 = (defpackage.C6999e) r0
            defpackage.AbstractC2003e.purchase(r11)
            goto L4c
        L31:
            defpackage.AbstractC2003e.purchase(r11)
            java.lang.Object r11 = r10.f27978e
            eؚؚ٘ r11 = (defpackage.C6999e) r11
            int r0 = r1.ad
            java.lang.String r0 = defpackage.AbstractC14114e.vip(r0)
            r10.f27978e = r11
            r10.f27979e = r5
            java.lang.Object r0 = r11.ad(r2, r0, r10)
            if (r0 != r6) goto L49
            goto L8d
        L49:
            r9 = r0
            r0 = r11
            r11 = r9
        L4c:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L6e
            eٖؖۙ r5 = new eٖؖۙ
            eؘٕۘ r7 = r10.f27974e
            android.os.Bundle r8 = r10.f27976e
            r5.<init>(r7, r1, r8)
            r10.f27978e = r0
            r10.f27972e = r11
            r10.f27979e = r4
            java.lang.Object r2 = r0.metrica(r2, r5, r10)
            if (r2 != r6) goto L6a
            goto L8d
        L6a:
            r2 = r0
            r0 = r11
        L6c:
            r11 = r0
            r0 = r2
        L6e:
            int r1 = r1.ad
            java.lang.String r1 = defpackage.AbstractC14114e.vip(r1)
            java.util.LinkedHashMap r2 = r0.ad
            java.lang.Object r1 = r2.get(r1)
            eٖؖۙ r1 = (defpackage.C16007e) r1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r2 = 0
            r10.f27978e = r2
            r10.f27979e = r3
            eؚٖؓ r2 = r10.f27973e
            java.lang.Object r11 = r2.invoke(r0, r1, r11, r10)
            if (r11 != r6) goto L8e
        L8d:
            return r6
        L8e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14144e.loadAd(java.lang.Object):java.lang.Object");
    }
}
