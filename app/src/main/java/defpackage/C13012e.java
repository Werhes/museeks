package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leْؓۤ;", "Leِٝؓ;", "Leٜؓؐ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eْؓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13012e extends AbstractC11865e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C10663e f25934e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC14906e f25935e;

    public C13012e(InterfaceC14906e interfaceC14906e, C10663e c10663e) {
        this.f25935e = interfaceC14906e;
        this.f25934e = c10663e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13012e)) {
            return false;
        }
        C13012e c13012e = (C13012e) obj;
        return AbstractC7890e.billing(c13012e.f25935e, this.f25935e) && AbstractC7890e.billing(c13012e.f25934e, this.f25934e);
    }

    public final int hashCode() {
        int hashCode = this.f25935e.hashCode() * 31;
        C10663e c10663e = this.f25934e;
        return hashCode + (c10663e != null ? c10663e.hashCode() : 0);
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C1507e(this.f25935e, this.f25934e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C1507e c1507e = (C1507e) abstractC13616e;
        c1507e.f4373e = this.f25935e;
        C10663e c10663e = c1507e.f4374e;
        if (c10663e.ad == c1507e) {
            c10663e.ad = null;
        }
        C10663e c10663e2 = this.f25934e;
        if (c10663e2 == null) {
            c1507e.f4374e = new C10663e();
        } else if (!c10663e2.equals(c10663e)) {
            c1507e.f4374e = c10663e2;
        }
        if (c1507e.f27016e) {
            C10663e c10663e3 = c1507e.f4374e;
            c10663e3.ad = c1507e;
            c10663e3.vip = null;
            c1507e.f4372e = null;
            c10663e3.metrica = new C17073e(12, c1507e);
            c10663e3.license = c1507e.m3623e();
        }
    }
}
