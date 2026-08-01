package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leًٓۗ;", "Leِٝؓ;", "Leُٗٔ;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eًٓۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7926e extends AbstractC11865e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function1 f16053e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function1 f16054e;

    public C7926e(Function1 function1, Function1 function12) {
        this.f16054e = function1;
        this.f16053e = function12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7926e)) {
            return false;
        }
        C7926e c7926e = (C7926e) obj;
        return this.f16054e == c7926e.f16054e && this.f16053e == c7926e.f16053e;
    }

    public final int hashCode() {
        Function1 function1 = this.f16054e;
        int hashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.f16053e;
        return hashCode + (function12 != null ? function12.hashCode() : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eُٗٔ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f21872e = this.f16054e;
        abstractC13616e.f21873e = this.f16053e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C11041e c11041e = (C11041e) abstractC13616e;
        c11041e.f21872e = this.f16054e;
        c11041e.f21873e = this.f16053e;
    }
}
