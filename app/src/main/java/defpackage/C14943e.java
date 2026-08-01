package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14943e {
    public final float ad;
    public final String vip;

    public C14943e(String str, float f) {
        this.ad = f;
        this.vip = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14943e)) {
            return false;
        }
        C14943e c14943e = (C14943e) obj;
        return this.ad == c14943e.ad && Objects.equals(this.vip, c14943e.vip);
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.ad), this.vip);
    }
}
