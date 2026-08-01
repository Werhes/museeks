package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7656e {
    public final C1410e ad;
    public final UUID metrica;
    public final C1410e vip;

    public C7656e(C1410e c1410e, C1410e c1410e2, UUID uuid) {
        this.ad = c1410e;
        this.vip = c1410e2;
        this.metrica = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7656e)) {
            return false;
        }
        C7656e c7656e = (C7656e) obj;
        return this.ad.equals(c7656e.ad) && this.vip.equals(c7656e.vip) && this.metrica.equals(c7656e.metrica);
    }

    public final int hashCode() {
        return ((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ ((int) (-4294967296L));
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.ad);
    }
}
