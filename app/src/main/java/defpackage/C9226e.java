package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9226e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f18421e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ float f18422e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18423e;

    public /* synthetic */ C9226e(float f, int i, long j) {
        this.f18423e = i;
        this.f18422e = f;
        this.f18421e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18423e) {
            case 0:
                InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                float f = this.f18422e;
                float mo497instanceof = interfaceC2235e.mo497instanceof(f);
                long floatToRawIntBits = (Float.floatToRawIntBits(interfaceC2235e.mo497instanceof(f) / r2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
                float mo497instanceof2 = interfaceC2235e.mo497instanceof(f) / 2;
                float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L));
                interfaceC2235e.mo776extends(this.f18421e, floatToRawIntBits, (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(mo497instanceof2) << 32), mo497instanceof, (r19 & 16) != 0 ? 0 : 0);
                return Unit.INSTANCE;
            default:
                InterfaceC2235e interfaceC2235e2 = (InterfaceC2235e) obj;
                float f2 = this.f18422e;
                float mo497instanceof3 = interfaceC2235e2.mo497instanceof(f2);
                float f3 = 2;
                float mo497instanceof4 = interfaceC2235e2.mo497instanceof(f2) / f3;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2235e2.yandex() >> 32));
                float mo497instanceof5 = interfaceC2235e2.mo497instanceof(f2) / f3;
                interfaceC2235e2.mo776extends(this.f18421e, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(mo497instanceof4) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (4294967295L & Float.floatToRawIntBits(mo497instanceof5)), mo497instanceof3, (r19 & 16) != 0 ? 0 : 0);
                return Unit.INSTANCE;
        }
    }
}
