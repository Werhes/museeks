package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14591e {
    public final int ad;

    public static String ad(int i) {
        return i == 0 ? "EmojiSupportMatch.Default" : i == 1 ? "EmojiSupportMatch.None" : i == 2 ? "EmojiSupportMatch.All" : AbstractC8647e.applovin("Invalid(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C14591e) {
            return this.ad == ((C14591e) obj).ad;
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
