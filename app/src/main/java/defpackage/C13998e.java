package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13998e extends AbstractC5340e {
    public static final String metrica;
    public final float vip;

    static {
        String str = AbstractC9413e.ad;
        metrica = Integer.toString(1, 36);
    }

    public C13998e() {
        this.vip = -1.0f;
    }

    public C13998e(float f) {
        AbstractC2301e.yandex(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.vip = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13998e) {
            return this.vip == ((C13998e) obj).vip;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.vip));
    }

    @Override // defpackage.AbstractC5340e
    public final Bundle metrica() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC5340e.ad, 1);
        bundle.putFloat(metrica, this.vip);
        return bundle;
    }

    @Override // defpackage.AbstractC5340e
    public final boolean vip() {
        return this.vip != -1.0f;
    }
}
