package defpackage;

import android.text.TextUtils;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C6165e {
    public final String ad;
    public final int metrica;
    public final int vip;

    public C6165e(String str, int i, int i2) {
        this.ad = str;
        this.vip = i;
        this.metrica = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6165e)) {
            return false;
        }
        C6165e c6165e = (C6165e) obj;
        int i = c6165e.metrica;
        String str = c6165e.ad;
        int i2 = c6165e.vip;
        int i3 = this.metrica;
        String str2 = this.ad;
        int i4 = this.vip;
        return (i4 < 0 || i2 < 0) ? TextUtils.equals(str2, str) && i3 == i : TextUtils.equals(str2, str) && i4 == i2 && i3 == i;
    }

    public final int hashCode() {
        return Objects.hash(this.ad, Integer.valueOf(this.metrica));
    }
}
