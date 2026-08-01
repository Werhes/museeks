package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9548e {
    public static final Object[] metrica;
    public static final float[] ad = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile C14338e vip = new C14338e(0);

    static {
        Object[] objArr = new Object[0];
        metrica = objArr;
        synchronized (objArr) {
            vip.license((int) 115.0f, new C16392e(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            vip.license((int) 130.0f, new C16392e(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            vip.license((int) 150.0f, new C16392e(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            vip.license((int) 180.0f, new C16392e(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            vip.license((int) 200.0f, new C16392e(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.INSTANCE;
        }
        if ((vip.f28365e[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        AbstractC15805e.vip("You should only apply non-linear scaling to font scales > 1");
    }

    public static InterfaceC8998e ad(float f) {
        float f2;
        InterfaceC8998e interfaceC8998e;
        float[] fArr = ad;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        InterfaceC8998e interfaceC8998e2 = (InterfaceC8998e) vip.metrica(i);
        if (interfaceC8998e2 != null) {
            return interfaceC8998e2;
        }
        C14338e c14338e = vip;
        int metrica2 = AbstractC10115e.metrica(c14338e.f28363e, i, c14338e.f28365e);
        if (metrica2 >= 0) {
            return (InterfaceC8998e) vip.appmetrica(metrica2);
        }
        int i2 = -(metrica2 + 1);
        int i3 = i2 - 1;
        if (i2 >= vip.f28363e) {
            C16392e c16392e = new C16392e(new float[]{1.0f}, new float[]{f});
            vip(f, c16392e);
            return c16392e;
        }
        if (i3 < 0) {
            interfaceC8998e = new C16392e(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = vip.f28365e[i3] / 100.0f;
            interfaceC8998e = (InterfaceC8998e) vip.appmetrica(i3);
        }
        float f3 = vip.f28365e[i2] / 100.0f;
        float max = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        InterfaceC8998e interfaceC8998e3 = (InterfaceC8998e) vip.appmetrica(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float vip2 = interfaceC8998e.vip(f4);
            fArr2[i4] = ((interfaceC8998e3.vip(f4) - vip2) * max) + vip2;
        }
        C16392e c16392e2 = new C16392e(fArr, fArr2);
        vip(f, c16392e2);
        return c16392e2;
    }

    public static void vip(float f, C16392e c16392e) {
        synchronized (metrica) {
            C14338e clone = vip.clone();
            clone.license((int) (f * 100.0f), c16392e);
            vip = clone;
            Unit unit = Unit.INSTANCE;
        }
    }
}
