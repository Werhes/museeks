package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۢۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15803e {
    public static final C15803e metrica = new C15803e(0, false);
    public final boolean ad;
    public final int vip;

    public C15803e() {
        this.ad = false;
        this.vip = 0;
    }

    public C15803e(int i, boolean z) {
        this.ad = z;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15803e)) {
            return false;
        }
        C15803e c15803e = (C15803e) obj;
        return this.ad == c15803e.ad && this.vip == c15803e.vip;
    }

    public final int hashCode() {
        return ((this.ad ? 1231 : 1237) * 31) + this.vip;
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.ad + ", emojiSupportMatch=" + ((Object) C14591e.ad(this.vip)) + ')';
    }
}
