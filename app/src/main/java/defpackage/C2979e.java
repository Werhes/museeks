package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؔۥؕ;", "Leِٝؓ;", "Leٌٍؚ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؔۥؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2979e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function2 f7014e;

    public C2979e(Function2 function2) {
        this.f7014e = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2979e) {
            return this.f7014e == ((C2979e) obj).f7014e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7014e.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٍؚ, eؙؒؐ, java.lang.Object, eْۤۡ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eٟؗۡ, eْۤۡ, eٖۣٜ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC6126e = new AbstractC6126e();
        abstractC6126e.f17407e = this.f7014e;
        C0609e c0609e = new C0609e(2, abstractC6126e);
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f32553e = c0609e;
        abstractC6126e.m2050e(abstractC13616e);
        return abstractC6126e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C8584e) abstractC13616e).f17407e = this.f7014e;
    }
}
