package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6241e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C9137e f13045e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C0351e f13046e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f13047e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f13048e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ float f13049e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f13050e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ float f13051e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13052e = 0;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ long f13053e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16154e f13054e;

    public /* synthetic */ C6241e(InterfaceC12864e interfaceC12864e, C0351e c0351e, InterfaceC3314e interfaceC3314e, C9137e c9137e, InterfaceC16154e interfaceC16154e, long j, float f, float f2, C2892e c2892e) {
        this.f13048e = interfaceC12864e;
        this.f13046e = c0351e;
        this.f13050e = interfaceC3314e;
        this.f13045e = c9137e;
        this.f13054e = interfaceC16154e;
        this.f13053e = j;
        this.f13049e = f;
        this.f13051e = f2;
        this.f13047e = c2892e;
    }

    public /* synthetic */ C6241e(InterfaceC12864e interfaceC12864e, C0351e c0351e, InterfaceC3314e interfaceC3314e, C9137e c9137e, InterfaceC16154e interfaceC16154e, long j, float f, float f2, C2892e c2892e, int i) {
        this.f13048e = interfaceC12864e;
        this.f13046e = c0351e;
        this.f13050e = interfaceC3314e;
        this.f13045e = c9137e;
        this.f13054e = interfaceC16154e;
        this.f13053e = j;
        this.f13049e = f;
        this.f13051e = f2;
        this.f13047e = c2892e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13052e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC5711e.ad(this.f13048e, this.f13046e, this.f13050e, this.f13045e, this.f13054e, this.f13053e, this.f13049e, this.f13051e, this.f13047e, c13770e, 384);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC5711e.ad(this.f13048e, this.f13046e, this.f13050e, this.f13045e, this.f13054e, this.f13053e, this.f13049e, this.f13051e, this.f13047e, (C13770e) obj, AbstractC5190e.advert(385));
                return Unit.INSTANCE;
        }
    }
}
