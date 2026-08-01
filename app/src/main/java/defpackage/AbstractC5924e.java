package defpackage;

import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۜۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5924e {
    public static final float ad;
    public static final float license;
    public static final List metrica;
    public static final float vip;

    static {
        float f;
        char c;
        char c2;
        long j;
        int i;
        float f2 = AbstractC0789e.metrica;
        ad = f2;
        float f3 = AbstractC0789e.vip;
        vip = f3;
        float f4 = AbstractC0789e.ad;
        C9821e c9821e = AbstractC11786e.ad;
        C11913e billing = c9821e.billing();
        C11913e c11913e = AbstractC11786e.advert;
        if (c11913e == null) {
            c11913e = AbstractC8769e.purchase(9, AbstractC11786e.metrica).metrica(new C9444e(AbstractC11786e.appmetrica, 2)).vip();
            AbstractC11786e.advert = c11913e;
        }
        C11913e c11913e2 = AbstractC11786e.startapp;
        if (c11913e2 == null) {
            c2 = 0;
            f = 0.5f;
            j = 4294967295L;
            c = ' ';
            c11913e2 = C9821e.license(c9821e, AbstractC6874e.startapp(new C16017e((Float.floatToRawIntBits(-0.009f) & 4294967295L) | (Float.floatToRawIntBits(0.5f) << 32), new C17307e(2, 0.172f)), new C16017e((Float.floatToRawIntBits(1.03f) << 32) | (Float.floatToRawIntBits(0.365f) & 4294967295L), new C17307e(2, 0.164f)), new C16017e((Float.floatToRawIntBits(0.828f) << 32) | (Float.floatToRawIntBits(0.97f) & 4294967295L), new C17307e(2, 0.169f))), 1, 4).vip();
            AbstractC11786e.startapp = c11913e2;
        } else {
            f = 0.5f;
            c = ' ';
            c2 = 0;
            j = 4294967295L;
        }
        C11913e c11913e3 = AbstractC11786e.yandex;
        if (c11913e3 == null) {
            C16017e c16017e = new C16017e((Float.floatToRawIntBits(0.961f) << c) | (Float.floatToRawIntBits(0.039f) & j), new C17307e(2, 0.426f));
            C16017e c16017e2 = new C16017e((Float.floatToRawIntBits(1.001f) << c) | (Float.floatToRawIntBits(0.428f) & j), C17307e.vip);
            C16017e c16017e3 = new C16017e((Float.floatToRawIntBits(0.609f) & j) | (Float.floatToRawIntBits(1.0f) << c), new C17307e(2, 1.0f));
            C16017e[] c16017eArr = new C16017e[3];
            c16017eArr[c2] = c16017e;
            c16017eArr[1] = c16017e2;
            c16017eArr[2] = c16017e3;
            c11913e3 = C9821e.license(c9821e, AbstractC6874e.startapp(c16017eArr), 2, 4).vip();
            AbstractC11786e.yandex = c11913e3;
        }
        C11913e c11913e4 = AbstractC11786e.adcel;
        if (c11913e4 == null) {
            c11913e4 = AbstractC8769e.purchase(8, AbstractC11786e.vip).vip();
            AbstractC11786e.adcel = c11913e4;
        }
        C11913e c11913e5 = AbstractC11786e.mopub;
        if (c11913e5 == null) {
            C16017e c16017e4 = new C16017e((Float.floatToRawIntBits(1.237f) << c) | (Float.floatToRawIntBits(1.236f) & j), new C17307e(2, 0.258f));
            C16017e c16017e5 = new C16017e((Float.floatToRawIntBits(0.918f) & j) | (Float.floatToRawIntBits(f) << c), new C17307e(2, 0.233f));
            C16017e[] c16017eArr2 = new C16017e[2];
            c16017eArr2[c2] = c16017e4;
            c16017eArr2[1] = c16017e5;
            i = 4;
            c11913e5 = C9821e.license(c9821e, AbstractC6874e.startapp(c16017eArr2), 4, 12).vip();
            AbstractC11786e.mopub = c11913e5;
        } else {
            i = 4;
        }
        C11913e c11913e6 = AbstractC11786e.billing;
        if (c11913e6 == null) {
            float[] ad2 = C6739e.ad();
            C6739e.yandex(ad2, 1.0f, 0.64f, i);
            c11913e6 = AbstractC8769e.ad(15).metrica(new C9444e(ad2, 2)).metrica(new C9444e(AbstractC11786e.license, 2)).vip();
            AbstractC11786e.billing = c11913e6;
        }
        C11913e[] c11913eArr = new C11913e[7];
        c11913eArr[c2] = billing;
        c11913eArr[1] = c11913e;
        c11913eArr[2] = c11913e2;
        c11913eArr[3] = c11913e3;
        c11913eArr[4] = c11913e4;
        c11913eArr[5] = c11913e5;
        c11913eArr[6] = c11913e6;
        metrica = AbstractC6874e.startapp(c11913eArr);
        C11913e c11913e7 = AbstractC11786e.purchase;
        if (c11913e7 == null) {
            c11913e7 = AbstractC8769e.ad(14).vip();
            AbstractC11786e.purchase = c11913e7;
        }
        float[] ad3 = C6739e.ad();
        C6739e.purchase(ad3, 18.0f);
        Unit unit = Unit.INSTANCE;
        C11913e metrica2 = c11913e7.metrica(new C9444e(ad3, 2));
        C11913e billing2 = c9821e.billing();
        C11913e[] c11913eArr2 = new C11913e[2];
        c11913eArr2[c2] = metrica2;
        c11913eArr2[1] = billing2;
        AbstractC6874e.startapp(c11913eArr2);
        license = f4 / Math.min(f2, f3);
    }
}
