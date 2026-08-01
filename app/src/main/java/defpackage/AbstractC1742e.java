package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1742e {
    public static final float ad = 56;
    public static final C14870e metrica;
    public static final C11699e vip;

    static {
        C11699e c11699e = new C11699e(0);
        vip = c11699e;
        metrica = new C14870e(0, 0, 0, EnumC17426e.f34145e, 0, 0, 0, C17354e.f34049e, new C12103e(3), AbstractC9743e.ad(C2693e.f6576e), c11699e, AbstractC2278e.vip(0, 0, 0, 0, 15));
    }

    public static final long ad(C14870e c14870e, int i) {
        int i2 = c14870e.metrica;
        long j = i * (c14870e.vip + i2);
        int i3 = -c14870e.purchase;
        long j2 = ((j + i3) + c14870e.license) - i2;
        int purchase = (int) (c14870e.appmetrica == EnumC17426e.f34145e ? c14870e.purchase() >> 32 : c14870e.purchase() & 4294967295L);
        long metrica2 = j2 - (purchase - AbstractC3062e.metrica(c14870e.amazon.purchase(purchase, c14870e.vip, i3, r1), 0, purchase));
        if (metrica2 < 0) {
            return 0L;
        }
        return metrica2;
    }

    public static final C16349e vip(int i, Function0 function0, C13770e c13770e, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        C11883e c11883e = C16349e.f32129goto;
        boolean license = c13770e.license(i) | c13770e.metrica(0.0f);
        if ((((i2 & 896) ^ 384) <= 256 || !c13770e.purchase(function0)) && (i2 & 384) != 256) {
            z = false;
        }
        boolean z2 = license | z;
        Object m3681throw = c13770e.m3681throw();
        if (z2 || m3681throw == C2987e.ad) {
            m3681throw = new C8779e(i, function0, 3);
            c13770e.m3682throws(m3681throw);
        }
        C16349e c16349e = (C16349e) AbstractC10510e.appmetrica(objArr, c11883e, (Function0) m3681throw, c13770e, 0);
        c16349e.f32130interface.setValue(function0);
        return c16349e;
    }
}
