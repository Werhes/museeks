package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؕۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14507e extends C7460e implements Function1 {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ C15096e f28692e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C3721e f28693e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C15096e f28694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14507e(C3721e c3721e, C15096e c15096e, C15096e c15096e2) {
        super(1, AbstractC15389e.class, "scaleToOffset", "Slider$lambda$3$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.f28693e = c3721e;
        this.f28694e = c15096e;
        this.f28692e = c15096e2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        C3721e c3721e = this.f28693e;
        float f = c3721e.ad;
        float f2 = c3721e.vip;
        float f3 = this.f28694e.f29883e;
        float f4 = this.f28692e.f29883e;
        float f5 = f2 - f;
        float f6 = f5 == 0.0f ? 0.0f : (floatValue - f) / f5;
        float f7 = f6 >= 0.0f ? f6 : 0.0f;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        return Float.valueOf(AbstractC15842e.startapp(f3, f4, f7));
    }
}
