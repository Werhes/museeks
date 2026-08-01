package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10458e extends AbstractC5340e {
    public static final String appmetrica;
    public static final String license;
    public final float metrica;
    public final int vip;

    static {
        String str = AbstractC9413e.ad;
        license = Integer.toString(1, 36);
        appmetrica = Integer.toString(2, 36);
    }

    public C10458e(int i) {
        AbstractC2301e.yandex(i > 0, "maxStars must be a positive integer");
        this.vip = i;
        this.metrica = -1.0f;
    }

    public C10458e(int i, float f) {
        boolean z = false;
        AbstractC2301e.yandex(i > 0, "maxStars must be a positive integer");
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        AbstractC2301e.yandex(z, "starRating is out of range [0, maxStars]");
        this.vip = i;
        this.metrica = f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10458e)) {
            return false;
        }
        C10458e c10458e = (C10458e) obj;
        return this.vip == c10458e.vip && this.metrica == c10458e.metrica;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.vip), Float.valueOf(this.metrica));
    }

    @Override // defpackage.AbstractC5340e
    public final Bundle metrica() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC5340e.ad, 2);
        bundle.putInt(license, this.vip);
        bundle.putFloat(appmetrica, this.metrica);
        return bundle;
    }

    @Override // defpackage.AbstractC5340e
    public final boolean vip() {
        return this.metrica != -1.0f;
    }
}
