package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13325e {
    public static final String appmetrica;
    public static final String billing;
    public static final C13325e license = new C13325e(new C18478e(23, false));
    public static final String purchase;
    public final Uri ad;
    public final Bundle metrica;
    public final String vip;

    static {
        String str = AbstractC9413e.ad;
        appmetrica = Integer.toString(0, 36);
        purchase = Integer.toString(1, 36);
        billing = Integer.toString(2, 36);
    }

    public C13325e(C18478e c18478e) {
        this.ad = (Uri) c18478e.f36228e;
        this.vip = (String) c18478e.f36227e;
        this.metrica = (Bundle) c18478e.f36229e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13325e)) {
            return false;
        }
        C13325e c13325e = (C13325e) obj;
        if (Objects.equals(this.ad, c13325e.ad) && Objects.equals(this.vip, c13325e.vip)) {
            if ((this.metrica == null) == (c13325e.metrica == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.ad;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.vip;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.metrica != null ? 1 : 0);
    }
}
