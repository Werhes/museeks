package defpackage;

import android.os.Trace;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15384e {
    public static final Object ad = AbstractC18039e.appmetrica(3, new C13564e(6));

    public static float ad(C15074e c15074e) {
        float license = license(c15074e);
        InterfaceC6412e interfaceC6412e = c15074e.f29860e;
        if (AbstractC7890e.billing(interfaceC6412e, C4419e.ad)) {
            return 1.0f;
        }
        if (!AbstractC7890e.billing(interfaceC6412e, C8313e.ad)) {
            throw new C14803e(10);
        }
        if (C15765e.ad(license, 7) < 0) {
            return 1.0f;
        }
        return c15074e.f29843e != null ? 0.5f : 0.3334f;
    }

    public static final float appmetrica(C15074e c15074e) {
        float f = c15074e.f29840e;
        if (0.0f > f || f > 1.0f) {
            f = c15074e.f29849e.license;
        }
        return (0.0f > f || f > 1.0f) ? c15074e.f29836e.license : f;
    }

    public static final float license(C15074e c15074e) {
        float f = c15074e.f29845e;
        if (Float.isNaN(f)) {
            f = c15074e.f29849e.metrica;
        }
        return !Float.isNaN(f) ? f : c15074e.f29836e.metrica;
    }

    public static final boolean metrica(C15074e c15074e) {
        return c15074e.f29837e ? c15074e.f29853e : ((Boolean) c15074e.f29842e.vip.getValue()).booleanValue();
    }

    public static final List purchase(C15074e c15074e) {
        List list = c15074e.f29839e;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            list = c15074e.f29849e.vip;
            if (list.isEmpty()) {
                list = null;
            }
            if (list == null) {
                List list2 = c15074e.f29836e.vip;
                List list3 = list2.isEmpty() ? null : list2;
                return list3 == null ? C13664e.f27089e : list3;
            }
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, eؕٛؓ] */
    public static C9508e vip(C15074e c15074e, float f, float f2, List list, float f3, AbstractC4457e abstractC4457e, C7127e c7127e, int i) {
        float f4;
        AbstractC4457e abstractC4457e2;
        float ad2 = ad(c15074e);
        if ((i & 2) != 0) {
            f4 = license(c15074e);
            if (Float.isNaN(f4)) {
                f4 = 0;
            }
        } else {
            f4 = f;
        }
        float appmetrica = (i & 4) != 0 ? appmetrica(c15074e) : f2;
        List purchase = (i & 8) != 0 ? purchase(c15074e) : list;
        float f5 = (i & 16) != 0 ? 1.0f : f3;
        float f6 = appmetrica;
        long j = c15074e.f29846e;
        int i2 = 0;
        long j2 = c15074e.f29852e;
        C9508e c9508e = null;
        if ((i & 128) != 0) {
            c15074e.getClass();
            abstractC4457e2 = null;
        } else {
            abstractC4457e2 = abstractC4457e;
        }
        C7127e c7127e2 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : c7127e;
        if (AbstractC7890e.billing(c15074e.f29835e, null)) {
            i2 = 3;
        }
        int i3 = i2;
        Trace.beginSection("HazeEffectNode-getOrCreateRenderEffect");
        try {
            C8073e c8073e = new C8073e(f4, f6, ad2, j, j2, purchase, f5, abstractC4457e2, c7127e2, i3);
            ?? r1 = ad;
            C9508e c9508e2 = (C9508e) ((C4662e) r1.getValue()).vip(c8073e);
            if (c9508e2 != null) {
                c9508e = c9508e2;
            } else {
                C9508e metrica = AbstractC14380e.metrica(c15074e, c8073e);
                if (metrica != null) {
                    ((C4662e) r1.getValue()).metrica(c8073e, metrica);
                    c9508e = metrica;
                }
            }
            return c9508e;
        } finally {
            Trace.endSection();
        }
    }
}
