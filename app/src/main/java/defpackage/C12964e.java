package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leْؑٚ;", "Leِٝؓ;", "Leَۧۡ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eْؑٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C12964e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C15860e f25829e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C7911e f25830e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4367e f25831e;

    public C12964e(C4367e c4367e, C7911e c7911e, C15860e c15860e) {
        this.f25831e = c4367e;
        this.f25830e = c7911e;
        this.f25829e = c15860e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12964e)) {
            return false;
        }
        C12964e c12964e = (C12964e) obj;
        return AbstractC7890e.billing(this.f25831e, c12964e.f25831e) && AbstractC7890e.billing(this.f25830e, c12964e.f25830e) && AbstractC7890e.billing(this.f25829e, c12964e.f25829e);
    }

    public final int hashCode() {
        return this.f25829e.hashCode() + ((this.f25830e.hashCode() + (this.f25831e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f25831e + ", legacyTextFieldState=" + this.f25830e + ", textFieldSelectionManager=" + this.f25829e + ')';
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C10689e(this.f25831e, this.f25830e, this.f25829e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C10689e c10689e = (C10689e) abstractC13616e;
        if (c10689e.f27016e) {
            c10689e.f21054e.license();
            c10689e.f21054e.mopub(c10689e);
        }
        C4367e c4367e = this.f25831e;
        c10689e.f21054e = c4367e;
        if (c10689e.f27016e) {
            if (c4367e.ad != null) {
                AbstractC8889e.metrica("Expected textInputModifierNode to be null");
            }
            c4367e.ad = c10689e;
        }
        c10689e.f21055e = this.f25830e;
        c10689e.f21053e = this.f25829e;
    }
}
