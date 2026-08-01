package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11620e {
    public final String ad;
    public final int vip;

    public C11620e(C15525e c15525e) {
        this.ad = c15525e.vip;
        this.vip = c15525e.metrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11620e)) {
            return false;
        }
        C11620e c11620e = (C11620e) obj;
        return this.ad.equals(c11620e.ad) && this.vip == c11620e.vip && TextUtils.equals(null, null);
    }

    public final int hashCode() {
        return Objects.hash(this.ad, Integer.valueOf(this.vip), 0, 0, null);
    }
}
