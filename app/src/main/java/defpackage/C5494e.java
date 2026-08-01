package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5494e {
    public final C12774e ad;

    static {
        new C5494e(BuildConfig.FLAVOR, 0, 0);
    }

    public C5494e(String str, int i, int i2) {
        this.ad = new C12774e(str, i, i2);
    }

    public static C5494e ad(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        String sb;
        if (z) {
            int i7 = i / 2;
            int i8 = i2 / 2;
            StringBuilder pro = AbstractC17861e.pro(i8, i7, "M0,", " A", ",");
            AbstractC10257e.signatures(pro, i8, " 0 1,1 ", i, ",");
            AbstractC10257e.signatures(pro, i8, " A", i7, ",");
            pro.append(i8);
            pro.append(" 0 1,1 0,");
            pro.append(i8);
            pro.append(" Z");
            sb = pro.toString();
        } else {
            StringBuilder sb2 = new StringBuilder("M ");
            int min = Math.min(i / 2, i2 / 2);
            int min2 = Math.min(min, i3);
            int min3 = Math.min(min, i4);
            int min4 = Math.min(min, i5);
            int min5 = Math.min(min, i6);
            sb2.append(min2);
            sb2.append(",0 L ");
            sb2.append(i - min3);
            sb2.append(",0");
            if (min3 > 0) {
                sb2.append(" A ");
                sb2.append(min3);
                sb2.append(",");
                sb2.append(min3);
                sb2.append(" 0 0,1 ");
                sb2.append(i);
                sb2.append(",");
                sb2.append(min3);
            }
            sb2.append(" L ");
            sb2.append(i);
            sb2.append(",");
            sb2.append(i2 - min4);
            if (min4 > 0) {
                sb2.append(" A ");
                sb2.append(min4);
                sb2.append(",");
                sb2.append(min4);
                sb2.append(" 0 0,1 ");
                sb2.append(i - min4);
                sb2.append(",");
                sb2.append(i2);
            }
            sb2.append(" L ");
            sb2.append(min5);
            sb2.append(",");
            sb2.append(i2);
            if (min5 > 0) {
                sb2.append(" A ");
                sb2.append(min5);
                sb2.append(",");
                sb2.append(min5);
                sb2.append(" 0 0,1 0,");
                sb2.append(i2 - min5);
            }
            if (min2 > 0) {
                sb2.append(" L 0,");
                sb2.append(min2);
                sb2.append(" A ");
                sb2.append(min2);
                sb2.append(",");
                sb2.append(min2);
                sb2.append(" 0 0,1 ");
                sb2.append(min2);
                sb2.append(",0");
            }
            sb2.append(" Z");
            sb = sb2.toString();
        }
        return new C5494e(sb, i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5494e) {
            return this.ad.equals(((C5494e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return this.ad.toString();
    }
}
