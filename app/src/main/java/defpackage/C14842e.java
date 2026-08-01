package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜۣٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14842e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15860e f29388e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29389e;

    public /* synthetic */ C14842e(C15860e c15860e, int i) {
        this.f29389e = i;
        this.f29388e = c15860e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C0763e c0763e;
        C7911e c7911e;
        InterfaceC0043e metrica;
        char c;
        long j;
        float f;
        InterfaceC0043e metrica2;
        InterfaceC0043e metrica3;
        InterfaceC0043e metrica4;
        InterfaceC0043e metrica5;
        int i = this.f29389e;
        C15860e c15860e = this.f29388e;
        switch (i) {
            case 0:
                return new C6035e(9, c15860e);
            case 1:
                c15860e.subscription();
                return Unit.INSTANCE;
            default:
                InterfaceC0043e interfaceC0043e = (InterfaceC0043e) obj;
                C7911e c7911e2 = c15860e.license;
                if (c7911e2 != null) {
                    if (c7911e2.Signature) {
                        c7911e2 = null;
                    }
                    if (c7911e2 != null) {
                        InterfaceC6256e interfaceC6256e = c15860e.vip;
                        long j2 = c15860e.amazon().vip;
                        int i2 = C12347e.metrica;
                        int billing = interfaceC6256e.billing((int) (j2 >> 32));
                        int billing2 = c15860e.vip.billing((int) (c15860e.amazon().vip & 4294967295L));
                        C7911e c7911e3 = c15860e.license;
                        long j3 = 0;
                        long mo211this = (c7911e3 == null || (metrica5 = c7911e3.metrica()) == null) ? 0L : metrica5.mo211this(c15860e.advert(true));
                        C7911e c7911e4 = c15860e.license;
                        if (c7911e4 != null && (metrica4 = c7911e4.metrica()) != null) {
                            j3 = metrica4.mo211this(c15860e.advert(false));
                        }
                        C7911e c7911e5 = c15860e.license;
                        float f2 = 0.0f;
                        if (c7911e5 == null || (metrica3 = c7911e5.metrica()) == null) {
                            c = ' ';
                            j = j3;
                            f = 0.0f;
                        } else {
                            c = ' ';
                            j = j3;
                            f = Float.intBitsToFloat((int) (metrica3.mo211this((Float.floatToRawIntBits(c7911e2.license() != null ? r4.ad.metrica(billing).vip : 0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)) & 4294967295L));
                        }
                        C7911e c7911e6 = c15860e.license;
                        if (c7911e6 != null && (metrica2 = c7911e6.metrica()) != null) {
                            f2 = Float.intBitsToFloat((int) (metrica2.mo211this((Float.floatToRawIntBits(0.0f) << c) | (Float.floatToRawIntBits(c7911e2.license() != null ? r7.ad.metrica(billing2).vip : 0.0f) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (mo211this >> c);
                        int i4 = (int) (j >> c);
                        c0763e = new C0763e(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(f, f2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (c7911e2.ad.billing.vip() * 25) + Math.max(Float.intBitsToFloat((int) (mo211this & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
                        c7911e = c15860e.license;
                        if (c7911e != null || (metrica = c7911e.metrica()) == null) {
                            return null;
                        }
                        return AbstractC1561e.startapp(c0763e, metrica, interfaceC0043e);
                    }
                }
                c0763e = C0763e.appmetrica;
                c7911e = c15860e.license;
                if (c7911e != null) {
                }
                return null;
        }
    }
}
