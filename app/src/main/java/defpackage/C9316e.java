package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9316e {
    public final String ad;
    public final boolean metrica;
    public final boolean vip;

    public C9316e(String str, boolean z, boolean z2) {
        this.ad = str;
        this.vip = z;
        this.metrica = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == C9316e.class) {
            C9316e c9316e = (C9316e) obj;
            if (TextUtils.equals(this.ad, c9316e.ad) && this.vip == c9316e.vip && this.metrica == c9316e.metrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC1786e.advert(31, 31, this.ad) + (this.vip ? 1231 : 1237)) * 31) + (this.metrica ? 1231 : 1237);
    }
}
