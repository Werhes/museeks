package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6354e {
    public static final AbstractC12614e license = AbstractC12614e.Signature(3, "_syn", "_err", "_el");
    public String ad;
    public final HashMap metrica;
    public final long vip;

    public C6354e(String str, long j, HashMap hashMap) {
        this.ad = str;
        this.vip = j;
        HashMap hashMap2 = new HashMap();
        this.metrica = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object vip(Object obj, Object obj2, String str) {
        if (license.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final C6354e clone() {
        return new C6354e(this.ad, this.vip, new HashMap(this.metrica));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6354e)) {
            return false;
        }
        C6354e c6354e = (C6354e) obj;
        if (this.vip == c6354e.vip && this.ad.equals(c6354e.ad)) {
            return this.metrica.equals(c6354e.metrica);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        long j = this.vip;
        return this.metrica.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.ad;
        String obj = this.metrica.toString();
        int length = String.valueOf(str).length();
        long j = this.vip;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + obj.length() + 1);
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
