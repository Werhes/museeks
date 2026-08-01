package defpackage;

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15162e implements TimeInterpolator {
    public int[] ad;
    public int metrica;
    public int vip;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = (int) ((f * this.metrica) + 0.5f);
        int i2 = this.vip;
        int[] iArr = this.ad;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        return (i3 / i2) + (i3 < i2 ? i / this.metrica : 0.0f);
    }
}
