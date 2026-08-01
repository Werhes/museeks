package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leَْۤ;", "Leِٝؓ;", "Leُؓۜ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eَْۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10240e extends AbstractC11865e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function1 f20250e;

    public C10240e(Function1 function1, C2046e c2046e) {
        this.f20250e = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C10240e c10240e = obj instanceof C10240e ? (C10240e) obj : null;
        return c10240e != null && this.f20250e == c10240e.f20250e;
    }

    public final int hashCode() {
        return (this.f20250e.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.f20250e + ", rtlAware=true)";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eُؓۜ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f21184e = this.f20250e;
        abstractC13616e.f21185e = true;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C10762e c10762e = (C10762e) abstractC13616e;
        Function1 function1 = c10762e.f21184e;
        Function1 function12 = this.f20250e;
        if (function1 != function12 || !c10762e.f21185e) {
            AbstractC5851e.mopub(c10762e).m3716new(false);
        }
        c10762e.f21184e = function12;
        c10762e.f21185e = true;
    }
}
