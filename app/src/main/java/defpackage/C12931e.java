package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۨۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12931e {
    public static final String appmetrica;
    public static final C12931e license = new C12931e(new C16437e[0]);
    public final int ad;
    public int metrica;
    public final C1410e vip;

    static {
        String str = AbstractC9413e.ad;
        appmetrica = Integer.toString(0, 36);
    }

    public C12931e(C16437e... c16437eArr) {
        C1410e tapsense = AbstractC17475e.tapsense(c16437eArr);
        this.vip = tapsense;
        this.ad = c16437eArr.length;
        int i = 0;
        while (i < tapsense.f4224e) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < tapsense.f4224e; i3++) {
                if (((C16437e) tapsense.get(i)).equals(tapsense.get(i3))) {
                    AbstractC2803e.billing("TrackGroupArray", BuildConfig.FLAVOR, new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final C16437e ad(int i) {
        return (C16437e) this.vip.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12931e.class != obj.getClass()) {
            return false;
        }
        C12931e c12931e = (C12931e) obj;
        return this.ad == c12931e.ad && this.vip.equals(c12931e.vip);
    }

    public final int hashCode() {
        if (this.metrica == 0) {
            this.metrica = this.vip.hashCode();
        }
        return this.metrica;
    }

    public final String toString() {
        return this.vip.toString();
    }

    public final int vip(C16437e c16437e) {
        int indexOf = this.vip.indexOf(c16437e);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }
}
