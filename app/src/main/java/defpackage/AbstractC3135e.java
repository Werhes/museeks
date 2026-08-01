package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؕۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3135e {
    public static final float ad;
    public static final C13789e vip;

    static {
        int i = AbstractC14929e.ad;
        ad = 40;
        new C13789e(0.2f, 0.0f, 0.8f, 1.0f);
        new C13789e(0.4f, 0.0f, 1.0f, 1.0f);
        new C13789e(0.0f, 0.0f, 0.65f, 1.0f);
        new C13789e(0.1f, 0.0f, 0.45f, 1.0f);
        vip = new C13789e(0.4f, 0.0f, 0.2f, 1.0f);
    }

    public static final void ad(final float f, int i, int i2, final long j, long j2, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        C13770e c13770e2;
        int i3;
        long j3;
        int i4;
        long j4;
        int i5;
        final long j5;
        c13770e.m3671package(-1119119072);
        int i6 = i2 | (c13770e.appmetrica(j) ? 32 : 16) | 11264;
        if (c13770e.m3673protected(i6 & 1, (i6 & 9363) != 9362)) {
            c13770e.m3655case();
            if ((i2 & 1) == 0 || c13770e.isPro()) {
                i4 = i6 & (-57345);
                j4 = C3618e.startapp;
                i5 = 2;
            } else {
                c13770e.m3659default();
                i4 = i6 & (-57345);
                i5 = i;
                j4 = j2;
            }
            c13770e.admob();
            final C13121e c13121e = new C13121e(((InterfaceC14388e) c13770e.adcel(AbstractC11473e.yandex)).mo497instanceof(f), 0.0f, i5, 0, null, 26);
            C17719e adcel = AbstractC11906e.adcel(c13770e, 1);
            C15239e c15239e = AbstractC5616e.license;
            final C4298e billing = AbstractC11906e.billing(adcel, 0, 5, AbstractC9546e.vip, AbstractC12696e.vip(AbstractC12696e.yandex(6660, 2, c15239e), 0, 0L, 6), null, c13770e, 33208, 16);
            final C4298e purchase = AbstractC11906e.purchase(adcel, 0.0f, 286.0f, AbstractC12696e.vip(AbstractC12696e.yandex(1332, 2, c15239e), 0, 0L, 6), null, c13770e, 4536, 8);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new C4526e(26);
                c13770e.m3682throws(m3681throw);
            }
            final C4298e purchase2 = AbstractC11906e.purchase(adcel, 0.0f, 290.0f, AbstractC12696e.vip(AbstractC12696e.metrica((Function1) m3681throw), 0, 0L, 6), null, c13770e, 4536, 8);
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = new C4526e(27);
                c13770e.m3682throws(m3681throw2);
            }
            final C4298e purchase3 = AbstractC11906e.purchase(adcel, 0.0f, 290.0f, AbstractC12696e.vip(AbstractC12696e.metrica((Function1) m3681throw2), 0, 0L, 6), null, c13770e, 4536, 8);
            c13770e2 = c13770e;
            InterfaceC12864e startapp = AbstractC18007e.startapp(AbstractC2206e.appmetrica(interfaceC12864e), ad);
            boolean yandex = c13770e2.yandex(c13121e) | c13770e2.purchase(billing) | c13770e2.purchase(purchase2) | c13770e2.purchase(purchase3) | c13770e2.purchase(purchase) | ((((i4 & 112) ^ 48) > 32 && c13770e2.appmetrica(j)) || (i4 & 48) == 32);
            Object m3681throw3 = c13770e2.m3681throw();
            if (yandex || m3681throw3 == c5170e) {
                j5 = j4;
                Function1 function1 = new Function1() { // from class: eؖٓۡ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float f2;
                        InterfaceC2235e interfaceC2235e = (InterfaceC2235e) obj;
                        long j6 = j5;
                        C13121e c13121e2 = c13121e;
                        AbstractC3135e.vip(interfaceC2235e, 0.0f, 360.0f, j6, c13121e2);
                        float floatValue = ((Number) purchase2.getValue()).floatValue();
                        InterfaceC16132e interfaceC16132e = purchase3;
                        float abs = Math.abs(floatValue - ((Number) interfaceC16132e.getValue()).floatValue());
                        float floatValue2 = ((Number) interfaceC16132e.getValue()).floatValue() + ((Number) purchase.getValue()).floatValue() + (((((Number) billing.getValue()).intValue() * 216.0f) % 360.0f) - 90.0f);
                        if (c13121e2.metrica == 0) {
                            f2 = 0.0f;
                        } else {
                            f2 = ((f / (AbstractC3135e.ad / 2)) * 57.29578f) / 2.0f;
                        }
                        AbstractC3135e.vip(interfaceC2235e, floatValue2 + f2, Math.max(abs, 0.1f), j, c13121e2);
                        return Unit.INSTANCE;
                    }
                };
                c13770e2.m3682throws(function1);
                m3681throw3 = function1;
            } else {
                j5 = j4;
            }
            AbstractC18366e.ad(startapp, (Function1) m3681throw3, c13770e2, 0);
            j3 = j5;
            i3 = i5;
        } else {
            c13770e2 = c13770e;
            c13770e2.m3659default();
            i3 = i;
            j3 = j2;
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C8708e(interfaceC12864e, j, f, j3, i3, i2);
        }
    }

    public static final void vip(InterfaceC2235e interfaceC2235e, float f, float f2, long j, C13121e c13121e) {
        float f3 = 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)) - (f3 * (c13121e.ad / f3));
        interfaceC2235e.subs(j, f, f2, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (r23 & 64) != 0 ? 1.0f : 0.0f, c13121e);
    }
}
