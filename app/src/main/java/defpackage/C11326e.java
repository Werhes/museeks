package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11326e extends AbstractC5340e {
    public static final String appmetrica;
    public static final String license;
    public final boolean metrica;
    public final boolean vip;

    static {
        String str = AbstractC9413e.ad;
        license = Integer.toString(1, 36);
        appmetrica = Integer.toString(2, 36);
    }

    public C11326e() {
        this.vip = false;
        this.metrica = false;
    }

    public C11326e(boolean z) {
        this.vip = true;
        this.metrica = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11326e)) {
            return false;
        }
        C11326e c11326e = (C11326e) obj;
        return this.metrica == c11326e.metrica && this.vip == c11326e.vip;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.vip), Boolean.valueOf(this.metrica));
    }

    @Override // defpackage.AbstractC5340e
    public final Bundle metrica() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC5340e.ad, 0);
        bundle.putBoolean(license, this.vip);
        bundle.putBoolean(appmetrica, this.metrica);
        return bundle;
    }

    @Override // defpackage.AbstractC5340e
    public final boolean vip() {
        return this.vip;
    }
}
