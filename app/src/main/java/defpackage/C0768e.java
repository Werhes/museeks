package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؒؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768e {
    public final Locale ad;

    public C0768e(Locale locale) {
        this.ad = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0768e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC7890e.billing(this.ad.toLanguageTag(), ((C0768e) obj).ad.toLanguageTag());
    }

    public final int hashCode() {
        return this.ad.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.ad.toLanguageTag();
    }
}
