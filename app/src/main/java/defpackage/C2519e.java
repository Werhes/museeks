package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leِؔۘ;", "Leِٝؓ;", "Leٔۤۙ;", "haze_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: eِؔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C2519e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Function1 f6358e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C11371e f6359e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C4254e f6360e;

    public C2519e(C4254e c4254e, C11371e c11371e, Function1 function1) {
        this.f6360e = c4254e;
        this.f6359e = c11371e;
        this.f6358e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2519e)) {
            return false;
        }
        C2519e c2519e = (C2519e) obj;
        return AbstractC7890e.billing(this.f6360e, c2519e.f6360e) && AbstractC7890e.billing(this.f6359e, c2519e.f6359e) && AbstractC7890e.billing(this.f6358e, c2519e.f6358e);
    }

    public final int hashCode() {
        C4254e c4254e = this.f6360e;
        int hashCode = (this.f6359e.hashCode() + ((c4254e == null ? 0 : c4254e.hashCode()) * 31)) * 31;
        Function1 function1 = this.f6358e;
        return hashCode + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return "HazeEffectNodeElement(state=" + this.f6360e + ", style=" + this.f6359e + ", block=" + this.f6358e + ")";
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C15074e(this.f6360e, this.f6359e, this.f6358e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C15074e c15074e = (C15074e) abstractC13616e;
        c15074e.f29842e = this.f6360e;
        C11371e c11371e = c15074e.f29849e;
        C11371e c11371e2 = this.f6359e;
        if (!AbstractC7890e.billing(c11371e, c11371e2)) {
            c15074e.m3911e(c15074e.f29849e, c11371e2);
            c15074e.f29849e = c11371e2;
        }
        c15074e.f29844e = this.f6358e;
        c15074e.mo343for();
    }
}
