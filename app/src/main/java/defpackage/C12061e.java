package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leِۣۢ;", "Leِٝؓ;", "Leؑؔۦ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eِۣۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12061e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C8513e f24169e;

    public C12061e(C8513e c8513e) {
        this.f24169e = c8513e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12061e) {
            return this.f24169e == ((C12061e) obj).f24169e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24169e.hashCode();
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C0078e(this.f24169e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C0078e c0078e = (C0078e) abstractC13616e;
        C8513e c8513e = this.f24169e;
        c0078e.f1243e = c8513e;
        if (c0078e.f27016e) {
            c8513e.invoke(c0078e.f1244e);
        }
    }
}
