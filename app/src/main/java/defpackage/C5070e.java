package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5070e {
    public static final C11883e appmetrica = AbstractC9743e.startapp(new C13887e(1), new C14151e(0, 23));
    public float ad;
    public final C2616e license;
    public Function0 metrica = new C13117e(9);
    public final C2616e vip;

    public C5070e(float f, float f2, float f3) {
        this.ad = f;
        this.vip = new C2616e(f3);
        this.license = new C2616e(f2);
    }

    public final float ad() {
        if (this.ad == 0.0f) {
            return 0.0f;
        }
        return this.license.purchase() / this.ad;
    }

    public final void metrica(float f) {
        this.license.startapp(AbstractC3062e.vip(f, this.ad, 0.0f));
    }

    public final float vip() {
        boolean booleanValue = ((Boolean) this.metrica.invoke()).booleanValue();
        C2616e c2616e = this.vip;
        if (!booleanValue && c2616e.purchase() == 0.0f) {
            return 1.0f;
        }
        float f = this.ad;
        if (f == 0.0f) {
            return 0.0f;
        }
        return 1 - (AbstractC3062e.vip(Math.abs(c2616e.purchase()) + f, this.ad, 0.0f) / this.ad);
    }
}
