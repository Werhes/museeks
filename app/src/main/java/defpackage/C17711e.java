package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leّ٘ۥ;", "Leِٝؓ;", "Leؕؑؒ;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eّ٘ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17711e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C18351e f34709e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C15037e f34710e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C15037e f34711e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C9703e f34712e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C15037e f34713e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13119e f34714e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Function0 f34715e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C2128e f34716e;

    public C17711e(C13119e c13119e, C15037e c15037e, C15037e c15037e2, C15037e c15037e3, C18351e c18351e, C2128e c2128e, Function0 function0, C9703e c9703e) {
        this.f34714e = c13119e;
        this.f34711e = c15037e;
        this.f34710e = c15037e2;
        this.f34713e = c15037e3;
        this.f34709e = c18351e;
        this.f34716e = c2128e;
        this.f34715e = function0;
        this.f34712e = c9703e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17711e)) {
            return false;
        }
        C17711e c17711e = (C17711e) obj;
        return AbstractC7890e.billing(c17711e.f34714e, this.f34714e) && AbstractC7890e.billing(c17711e.f34711e, this.f34711e) && AbstractC7890e.billing(c17711e.f34710e, this.f34710e) && AbstractC7890e.billing(c17711e.f34713e, this.f34713e) && AbstractC7890e.billing(c17711e.f34709e, this.f34709e) && AbstractC7890e.billing(c17711e.f34716e, this.f34716e) && c17711e.f34715e == this.f34715e && AbstractC7890e.billing(c17711e.f34712e, this.f34712e);
    }

    public final int hashCode() {
        int hashCode = this.f34714e.hashCode() * 31;
        C15037e c15037e = this.f34711e;
        int hashCode2 = (hashCode + (c15037e != null ? c15037e.hashCode() : 0)) * 31;
        C15037e c15037e2 = this.f34710e;
        int hashCode3 = (hashCode2 + (c15037e2 != null ? c15037e2.hashCode() : 0)) * 31;
        C15037e c15037e3 = this.f34713e;
        return this.f34712e.hashCode() + ((this.f34715e.hashCode() + ((this.f34716e.ad.hashCode() + ((this.f34709e.ad.hashCode() + ((hashCode3 + (c15037e3 != null ? c15037e3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C3059e(this.f34714e, this.f34711e, this.f34710e, this.f34713e, this.f34709e, this.f34716e, this.f34715e, this.f34712e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C3059e c3059e = (C3059e) abstractC13616e;
        c3059e.f7116e = this.f34714e;
        c3059e.f7115e = this.f34711e;
        c3059e.f7114e = this.f34710e;
        c3059e.f7121e = this.f34713e;
        c3059e.f7124e = this.f34709e;
        c3059e.f7113e = this.f34716e;
        c3059e.f7120e = this.f34715e;
        c3059e.f7122e = this.f34712e;
    }
}
