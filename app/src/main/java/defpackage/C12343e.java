package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12343e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f24737e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f24738e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f24739e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ long f24740e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f24741e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C13121e f24742e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24743e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ float f24744e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ float f24745e;

    public /* synthetic */ C12343e(C4298e c4298e, C4298e c4298e2, C4298e c4298e3, C4298e c4298e4, float f, float f2, long j, C13121e c13121e, int i) {
        this.f24743e = i;
        this.f24739e = c4298e;
        this.f24738e = c4298e2;
        this.f24741e = c4298e3;
        this.f24737e = c4298e4;
        this.f24745e = f;
        this.f24744e = f2;
        this.f24740e = j;
        this.f24742e = c13121e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
        switch (this.f24743e) {
            case 0:
                float floatValue = (((Number) this.f24739e.getValue()).floatValue() * 216.0f) % 360.0f;
                float floatValue2 = ((Number) this.f24738e.getValue()).floatValue();
                InterfaceC16132e interfaceC16132e = this.f24741e;
                float abs = Math.abs(floatValue2 - ((Number) interfaceC16132e.getValue()).floatValue());
                float floatValue3 = ((Number) interfaceC16132e.getValue()).floatValue() + ((Number) this.f24737e.getValue()).floatValue() + (floatValue - 90.0f);
                float f = 2;
                float f2 = (((this.f24745e / (this.f24744e / f)) * 57.29578f) / 2.0f) + floatValue3;
                float max = Math.max(abs, 0.1f);
                C13121e c13121e = this.f24742e;
                interfaceC2235e.subs(this.f24740e, f2, max, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(r6) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)) - (f * (c13121e.ad / f))) << 32), (r23 & 64) != 0 ? 1.0f : 0.0f, c13121e);
                return Unit.INSTANCE;
            default:
                float floatValue4 = (((Number) this.f24739e.getValue()).floatValue() * 216.0f) % 360.0f;
                float floatValue5 = ((Number) this.f24738e.getValue()).floatValue();
                InterfaceC16132e interfaceC16132e2 = this.f24741e;
                float abs2 = Math.abs(floatValue5 - ((Number) interfaceC16132e2.getValue()).floatValue());
                float floatValue6 = ((Number) interfaceC16132e2.getValue()).floatValue() + ((Number) this.f24737e.getValue()).floatValue() + (floatValue4 - 90.0f);
                float f3 = 2;
                float f4 = (((this.f24745e / (this.f24744e / f3)) * 57.29578f) / 2.0f) + floatValue6;
                float max2 = Math.max(abs2, 0.1f);
                C13121e c13121e2 = this.f24742e;
                interfaceC2235e.subs(this.f24740e, f4, max2, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(r6) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)) - (f3 * (c13121e2.ad / f3))) << 32), (r23 & 64) != 0 ? 1.0f : 0.0f, c13121e2);
                return Unit.INSTANCE;
        }
    }
}
