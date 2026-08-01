package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leۣٜؑ;", "Leِٝؓ;", "Leٍۢ٘;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eۣٜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC6512e f2924e;

    public C0657e(InterfaceC6512e interfaceC6512e) {
        this.f2924e = interfaceC6512e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0657e) || !AbstractC7890e.billing(((C0657e) obj).f2924e, this.f2924e)) {
            return false;
        }
        C10156e c10156e = C5438e.f11676e;
        return c10156e.equals(c10156e);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(-1.0f) * 31) + (this.f2924e.hashCode() * 31)) * 31;
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C9839e(this.f2924e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C9839e) abstractC13616e).f19430e = this.f2924e;
    }
}
