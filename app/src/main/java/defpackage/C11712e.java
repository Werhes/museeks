package defpackage;

import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِِْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11712e {
    public final Resources ad;
    public final Resources.Theme vip;

    public C11712e(Resources resources, Resources.Theme theme) {
        this.ad = resources;
        this.vip = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11712e.class == obj.getClass()) {
            C11712e c11712e = (C11712e) obj;
            if (this.ad.equals(c11712e.ad) && Objects.equals(this.vip, c11712e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.ad, this.vip);
    }
}
