package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؐ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8406e {
    public final Integer ad;

    public C8406e(Integer num) {
        this.ad = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8406e)) {
            return false;
        }
        Integer num = ((C8406e) obj).ad;
        Integer num2 = this.ad;
        return num2 == null ? num == null : num2.equals(num);
    }

    public final int hashCode() {
        Integer num = this.ad;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.ad + "}";
    }
}
