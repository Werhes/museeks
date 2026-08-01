package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٓٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14031e {
    public final Matcher ad;
    public C15942e license;
    public final C4468e metrica = new C4468e(0, this);
    public final CharSequence vip;

    public C14031e(Matcher matcher, CharSequence charSequence) {
        this.ad = matcher;
        this.vip = charSequence;
    }

    public final List ad() {
        if (this.license == null) {
            this.license = new C15942e(0, this);
        }
        return this.license;
    }

    public final C14031e metrica() {
        Matcher matcher = this.ad;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.vip;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        if (matcher2.find(end)) {
            return new C14031e(matcher2, charSequence);
        }
        return null;
    }

    public final C15926e vip() {
        Matcher matcher = this.ad;
        return AbstractC3062e.admob(matcher.start(), matcher.end());
    }
}
