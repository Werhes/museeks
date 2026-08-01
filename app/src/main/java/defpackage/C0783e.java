package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0783e extends AbstractC4857e {
    public final C1244e metrica;
    public final /* synthetic */ int vip;

    public /* synthetic */ C0783e(C1244e c1244e, int i) {
        this.vip = i;
        this.metrica = c1244e;
    }

    @Override // defpackage.AbstractC4857e
    public final void ad(Paint paint) {
        switch (this.vip) {
            case 0:
                if (this.ad) {
                    int i = 0;
                    this.ad = false;
                    C1244e c1244e = this.metrica;
                    int intValue = ((Integer) c1244e.adcel.ad).intValue();
                    int intValue2 = ((Integer) c1244e.mopub.ad).intValue();
                    float f = intValue / 255.0f;
                    if (f < 0.0f) {
                        f = 0.0f;
                    } else if (f > 1.0f) {
                        f = 1.0f;
                    }
                    float f2 = intValue2 / 255.0f;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    } else if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    float f3 = f * f2;
                    int i2 = (int) ((f3 >= 0.0f ? f3 > 1.0f ? 1.0f : f3 : 0.0f) * 0.85f * 255.0f);
                    if (i2 >= 0) {
                        i = 255;
                        if (i2 <= 255) {
                            i = i2;
                        }
                    }
                    paint.setAlpha(i);
                    return;
                }
                return;
            default:
                C1244e c1244e2 = this.metrica;
                C13935e c13935e = c1244e2.license;
                if (this.ad) {
                    this.ad = false;
                    int intValue3 = ((Integer) c1244e2.purchase.ad).intValue();
                    c13935e.getClass();
                    int[] iArr = new int[8];
                    for (int i3 = 0; i3 < 8; i3++) {
                        float f4 = (float) (((-Math.cos(((float[]) ((C9684e) c13935e.f27641e).yandex())[i3] * 3.141592653589793d)) / 2.0d) + 0.5d);
                        float f5 = 0.0f;
                        if (f4 >= 0.0f) {
                            f5 = 1.0f;
                            if (f4 <= 1.0f) {
                                float f6 = (intValue3 >> 24) & 255;
                                float f7 = (intValue3 >> 16) & 255;
                                float f8 = (intValue3 >> 8) & 255;
                                float f9 = intValue3 & 255;
                                float f10 = 0;
                                iArr[i3] = Color.argb((int) AbstractC1634e.billing(f10, f6, f4, f6), (int) AbstractC1634e.billing(f10, f7, f4, f7), (int) AbstractC1634e.billing(f10, f8, f4, f8), (int) AbstractC1634e.billing(f10, f9, f4, f9));
                            }
                        }
                        f4 = f5;
                        float f62 = (intValue3 >> 24) & 255;
                        float f72 = (intValue3 >> 16) & 255;
                        float f82 = (intValue3 >> 8) & 255;
                        float f92 = intValue3 & 255;
                        float f102 = 0;
                        iArr[i3] = Color.argb((int) AbstractC1634e.billing(f102, f62, f4, f62), (int) AbstractC1634e.billing(f102, f72, f4, f72), (int) AbstractC1634e.billing(f102, f82, f4, f82), (int) AbstractC1634e.billing(f102, f92, f4, f92));
                    }
                    paint.setShader(new RadialGradient(0.0f, 0.0f, 1.0f, iArr, (float[]) ((C9684e) c13935e.f27641e).yandex(), Shader.TileMode.CLAMP));
                    return;
                }
                return;
        }
    }
}
