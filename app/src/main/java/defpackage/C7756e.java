package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7756e {
    public String ad;
    public EnumC7300e vip;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7756e)) {
            return false;
        }
        C7756e c7756e = (C7756e) obj;
        if (this.vip != c7756e.vip) {
            return false;
        }
        return this.ad.equals(c7756e.ad);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }
}
