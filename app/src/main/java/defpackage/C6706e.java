package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۡؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6706e implements Function4 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f13851e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11986e f13852e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C18055e f13853e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f13854e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f13855e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C8874e f13856e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ View f13857e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f13858e;

    public C6706e(C8874e c8874e, C18055e c18055e, C11986e c11986e, int i, InterfaceC18435e interfaceC18435e, int i2, View view, InterfaceC16132e interfaceC16132e) {
        this.f13856e = c8874e;
        this.f13853e = c18055e;
        this.f13852e = c11986e;
        this.f13855e = i;
        this.f13851e = interfaceC18435e;
        this.f13858e = i2;
        this.f13857e = view;
        this.f13854e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5 = (C12692e) obj;
        ((Boolean) obj2).getClass();
        C13770e c13770e = (C13770e) obj3;
        int intValue = ((Number) obj4).intValue();
        if ((intValue & 6) == 0) {
            intValue |= c13770e.purchase(obj5) ? 4 : 2;
        }
        if (c13770e.m3673protected(intValue & 1, (intValue & 131) != 130)) {
            C2892e license = AbstractC16653e.license(-753519798, new C2077e(obj5, this.f13857e, 10), c13770e);
            C8874e c8874e = this.f13856e;
            EnumC0698e enumC0698e = c8874e.f17829e;
            EnumC0698e enumC0698e2 = EnumC0698e.f2988e;
            C11986e c11986e = this.f13852e;
            int i = this.f13858e;
            Object obj6 = C2987e.ad;
            C0115e c0115e = C0115e.f1276e;
            C18055e c18055e = this.f13853e;
            InterfaceC18435e interfaceC18435e = this.f13851e;
            if (enumC0698e == enumC0698e2 || enumC0698e == EnumC0698e.f2985e) {
                c13770e.m3676strictfp(-1111829213);
                boolean z = c8874e.f17828e;
                InterfaceC12864e mopub = AbstractC8703e.mopub(c18055e, c0115e);
                boolean yandex = c13770e.yandex(interfaceC18435e) | c13770e.yandex(c8874e);
                Object m3681throw = c13770e.m3681throw();
                if (yandex || m3681throw == obj6) {
                    m3681throw = new C15183e(interfaceC18435e, c8874e, 0);
                    c13770e.m3682throws(m3681throw);
                }
                c11986e.m3307strictfp(this.f13855e, z, (Function1) m3681throw, license, mopub, Integer.valueOf(i), false, c13770e, 3072);
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(-1111176508);
                boolean z2 = c8874e.f17828e;
                InterfaceC12864e mopub2 = AbstractC8703e.mopub(c18055e, c0115e);
                boolean booleanValue = ((Boolean) this.f13854e.getValue()).booleanValue();
                boolean yandex2 = c13770e.yandex(interfaceC18435e) | c13770e.yandex(c8874e);
                Object m3681throw2 = c13770e.m3681throw();
                if (yandex2 || m3681throw2 == obj6) {
                    m3681throw2 = new C15183e(interfaceC18435e, c8874e, 1);
                    c13770e.m3682throws(m3681throw2);
                }
                c11986e.m3306private(this.f13855e, license, z2, (Function1) m3681throw2, mopub2, Integer.valueOf(i), false, booleanValue, c13770e, 48);
                c13770e.Signature(false);
            }
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
