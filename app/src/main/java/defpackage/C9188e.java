package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leًٍؒ;", "Leِٝؓ;", "Leٖۨٙ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eًٍؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9188e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Function1 f18360e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC7185e f18361e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Function1 f18362e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5780e f18363e;

    /* JADX WARN: Multi-variable type inference failed */
    public C9188e(C5780e c5780e, Function1 function1, Function1 function12, Function1 function13) {
        this.f18363e = c5780e;
        this.f18361e = (AbstractC7185e) function1;
        this.f18360e = function12;
        this.f18362e = function13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9188e)) {
            return false;
        }
        C9188e c9188e = (C9188e) obj;
        return this.f18363e == c9188e.f18363e && this.f18361e == c9188e.f18361e && this.f18360e == c9188e.f18360e && this.f18362e == c9188e.f18362e;
    }

    public final int hashCode() {
        int hashCode = (this.f18361e.hashCode() + (this.f18363e.hashCode() * 31)) * 31;
        Function1 function1 = this.f18360e;
        return this.f18362e.hashCode() + ((hashCode + (function1 != null ? function1.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [eؚٖؓ, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new C16679e(this.f18363e, this.f18361e, this.f18360e, this.f18362e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C16679e c16679e = (C16679e) abstractC13616e;
        c16679e.f32724e.ad = null;
        C5780e c5780e = this.f18363e;
        c16679e.f32724e = c5780e;
        c5780e.ad = c16679e;
        c5780e.vip = c16679e.f27016e ? 3 : 2;
        c16679e.f32723e = this.f18361e;
        c16679e.f32726e = this.f18360e;
        c16679e.f32728e = this.f18362e;
    }
}
