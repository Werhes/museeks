package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2815e {
    public final ColorFilter ad;
    public final int metrica;
    public final long vip;

    public C2815e(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC7440e.yandex();
            porterDuffColorFilter = AbstractC7440e.ad(AbstractC6532e.m2193extends(j), AbstractC14204e.m3771default(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(AbstractC6532e.m2193extends(j), AbstractC14204e.m3769catch(i));
        }
        this.ad = porterDuffColorFilter;
        this.vip = j;
        this.metrica = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2815e)) {
            return false;
        }
        C2815e c2815e = (C2815e) obj;
        return C3618e.metrica(this.vip, c2815e.vip) && this.metrica == c2815e.metrica;
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        return (C10994e.ad(this.vip) * 31) + this.metrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        AbstractC5087e.m1754try(this.vip, ", blendMode=", sb);
        sb.append((Object) C8738e.billing(this.metrica));
        sb.append(')');
        return sb.toString();
    }
}
