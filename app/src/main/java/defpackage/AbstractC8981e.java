package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۛۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8981e {
    public abstract String ad();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC8981e) && AbstractC7890e.billing(ad(), ((AbstractC8981e) obj).ad());
    }

    public int hashCode() {
        return ad().hashCode();
    }

    public String toString() {
        return AbstractC3820e.ad.vip(getClass()).mopub() + "(cacheKey=" + ad() + ")";
    }

    public abstract Bitmap vip(Bitmap bitmap, C16320e c16320e);
}
