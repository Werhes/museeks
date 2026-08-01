package defpackage;

import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5805e {
    public static final float ad;
    public static final float vip;

    static {
        float f = 25;
        ad = f;
        vip = (f * 2.0f) / 2.4142137f;
    }

    public static final void ad(InterfaceC6790e interfaceC6790e, InterfaceC12864e interfaceC12864e, long j, C13770e c13770e, int i, int i2) {
        c13770e.m3671package(1776202187);
        int i3 = (c13770e.purchase(interfaceC6790e) ? 4 : 2) | i | (c13770e.purchase(interfaceC12864e) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && c13770e.appmetrica(j)) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            c13770e.m3655case();
            if ((i & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                i3 &= -897;
                j = 9205357640488583168L;
            }
            c13770e.admob();
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object m3681throw = c13770e.m3681throw();
            if (z || m3681throw == C2987e.ad) {
                m3681throw = new C0609e(4, interfaceC6790e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC9357e.ad(interfaceC6790e, C5438e.f11669e, AbstractC16653e.license(-1653527038, new C9560e(j, AbstractC1147e.ad(interfaceC12864e, false, (Function1) m3681throw)), c13770e), c13770e, i4 | 432);
        } else {
            c13770e.m3659default();
        }
        long j2 = j;
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C14954e(interfaceC6790e, interfaceC12864e, j2, i, i2, 0);
        }
    }

    public static final void vip(int i, int i2, C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        int i3;
        c13770e.m3671package(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                interfaceC12864e = C0115e.f1276e;
            }
            AbstractC12534e.ad(c13770e, AbstractC5750e.license(AbstractC18007e.adcel(interfaceC12864e, vip, ad), new C14134e(((C15331e) c13770e.adcel(AbstractC8389e.ad)).ad, 1)));
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2133e(interfaceC12864e, i, i2, 0);
        }
    }
}
