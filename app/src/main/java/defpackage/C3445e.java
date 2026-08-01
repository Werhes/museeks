package defpackage;

import ealvatag.tag.datatype.DataTypes;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٙؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3445e {
    public final int ad;

    public static String ad(int i) {
        return i == 0 ? "Unspecified" : i == 1 ? DataTypes.OBJ_TEXT : i == 2 ? "Ascii" : i == 3 ? DataTypes.OBJ_NUMBER : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? DataTypes.OBJ_EMAIL : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3445e) {
            return this.ad == ((C3445e) obj).ad;
        }
        return false;
    }

    public final int hashCode() {
        return this.ad;
    }

    public final String toString() {
        return ad(this.ad);
    }
}
