package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۦۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17419e {
    public static final C2892e ad = new C2892e(-210781411, false, new C8436e(0, 1));

    public static final Long ad(InterfaceC3052e interfaceC3052e) {
        String mo459e = interfaceC3052e.ad().mo459e("Content-Length");
        if (mo459e != null) {
            return AbstractC6507e.tapsense(mo459e);
        }
        return null;
    }

    public static C11354e license(String str, C17974e c17974e, C1078e c1078e, int i) {
        if ((i & 2) != 0) {
            c17974e = null;
        }
        Function1 function1 = c1078e;
        if ((i & 4) != 0) {
            function1 = new C2163e(1);
        }
        C15420e c15420e = AbstractC6731e.ad;
        return new C11354e(str, c17974e, function1, AbstractC9743e.ad(AbstractC5797e.vip(ExecutorC3603e.f8134e, AbstractC5097e.ad())));
    }

    public static final float metrica(float f, float f2, float f3) {
        return AbstractC1634e.billing(f2, f, f3, f);
    }

    public static final C1622e vip(InterfaceC8526e interfaceC8526e) {
        String m4623e = interfaceC8526e.ad().m4623e("Content-Type");
        if (m4623e == null) {
            return null;
        }
        C1622e c1622e = C1622e.f4539e;
        return AbstractC6227e.metrica(m4623e);
    }

    public abstract void appmetrica(int i, int i2, byte[] bArr);
}
