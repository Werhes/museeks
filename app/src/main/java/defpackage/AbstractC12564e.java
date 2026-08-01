package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12564e {
    public final int ad;
    public final long license;
    public final Interpolator metrica;
    public float vip;

    public AbstractC12564e(int i, Interpolator interpolator, long j) {
        this.ad = i;
        this.metrica = interpolator;
        this.license = j;
    }

    public float ad() {
        return 1.0f;
    }

    public void appmetrica(float f) {
        this.vip = f;
    }

    public int license() {
        return this.ad;
    }

    public float metrica() {
        Interpolator interpolator = this.metrica;
        return interpolator != null ? interpolator.getInterpolation(this.vip) : this.vip;
    }

    public long vip() {
        return this.license;
    }
}
