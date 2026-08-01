package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۡۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8275e extends AbstractC5217e {
    public final Integer ad;

    public C8275e(Integer num) {
        this.ad = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5217e)) {
            return false;
        }
        Integer num = this.ad;
        C8275e c8275e = (C8275e) ((AbstractC5217e) obj);
        return num == null ? c8275e.ad == null : num.equals(c8275e.ad);
    }

    public final int hashCode() {
        Integer num = this.ad;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.ad + "}";
    }
}
