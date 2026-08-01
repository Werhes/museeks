package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Leؚؑٗ;", "T", "Leِٝؓ;", "Leًُ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* renamed from: eؚؑٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6850e<T> extends AbstractC11865e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function2 f14101e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14995e f14102e;

    public C6850e(C14995e c14995e, Function2 function2) {
        this.f14102e = c14995e;
        this.f14101e = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6850e)) {
            return false;
        }
        C6850e c6850e = (C6850e) obj;
        return AbstractC7890e.billing(this.f14102e, c6850e.f14102e) && this.f14101e == c6850e.f14101e;
    }

    public final int hashCode() {
        return EnumC17426e.f34145e.hashCode() + ((this.f14101e.hashCode() + (this.f14102e.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eًُ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f15906e = this.f14102e;
        abstractC13616e.f15907e = this.f14101e;
        abstractC13616e.f15905e = EnumC17426e.f34145e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C7857e c7857e = (C7857e) abstractC13616e;
        c7857e.f15906e = this.f14102e;
        c7857e.f15907e = this.f14101e;
        c7857e.f15905e = EnumC17426e.f34145e;
    }
}
