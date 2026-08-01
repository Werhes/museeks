package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؚٔؕ;", "Leِٝؓ;", "Leّٟۥ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؚٔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7152e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f14636e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f14637e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC17220e f14638e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f14639e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15274e f14640e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Function0 f14641e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C11796e f14642e;

    public C7152e(C15274e c15274e, InterfaceC17220e interfaceC17220e, boolean z, boolean z2, String str, C11796e c11796e, Function0 function0) {
        this.f14640e = c15274e;
        this.f14638e = interfaceC17220e;
        this.f14637e = z;
        this.f14639e = z2;
        this.f14636e = str;
        this.f14642e = c11796e;
        this.f14641e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7152e.class != obj.getClass()) {
            return false;
        }
        C7152e c7152e = (C7152e) obj;
        return AbstractC7890e.billing(this.f14640e, c7152e.f14640e) && AbstractC7890e.billing(this.f14638e, c7152e.f14638e) && this.f14637e == c7152e.f14637e && this.f14639e == c7152e.f14639e && AbstractC7890e.billing(this.f14636e, c7152e.f14636e) && AbstractC7890e.billing(this.f14642e, c7152e.f14642e) && this.f14641e == c7152e.f14641e;
    }

    public final int hashCode() {
        C15274e c15274e = this.f14640e;
        int hashCode = (c15274e != null ? c15274e.hashCode() : 0) * 31;
        InterfaceC17220e interfaceC17220e = this.f14638e;
        int hashCode2 = (((((hashCode + (interfaceC17220e != null ? interfaceC17220e.hashCode() : 0)) * 31) + (this.f14637e ? 1231 : 1237)) * 31) + (this.f14639e ? 1231 : 1237)) * 31;
        String str = this.f14636e;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C11796e c11796e = this.f14642e;
        return this.f14641e.hashCode() + ((hashCode3 + (c11796e != null ? c11796e.ad : 0)) * 31);
    }

    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        return new AbstractC6102e(this.f14640e, this.f14638e, this.f14637e, this.f14639e, this.f14636e, this.f14642e, this.f14641e);
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        ((C12655e) abstractC13616e).m2032e(this.f14640e, this.f14638e, this.f14637e, this.f14639e, this.f14636e, this.f14642e, this.f14641e);
    }
}
