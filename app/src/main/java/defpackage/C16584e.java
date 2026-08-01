package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Leٖۢۚ;", "T", "Leِٝؓ;", "Leٌٟ۠;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eٖۢۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16584e<T> extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final EnumC17426e f32534e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function2 f32535e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C14995e f32536e;

    public C16584e(C14995e c14995e, Function2 function2, EnumC17426e enumC17426e) {
        this.f32536e = c14995e;
        this.f32535e = function2;
        this.f32534e = enumC17426e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16584e)) {
            return false;
        }
        C16584e c16584e = (C16584e) obj;
        return AbstractC7890e.billing(this.f32536e, c16584e.f32536e) && this.f32535e == c16584e.f32535e && this.f32534e == c16584e.f32534e;
    }

    public final int hashCode() {
        return this.f32534e.hashCode() + ((this.f32535e.hashCode() + (this.f32536e.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٟ۠, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f18088e = this.f32536e;
        abstractC13616e.f18089e = this.f32535e;
        abstractC13616e.f18087e = this.f32534e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C9033e c9033e = (C9033e) abstractC13616e;
        C14995e c14995e = c9033e.f18088e;
        C14995e c14995e2 = this.f32536e;
        boolean billing = AbstractC7890e.billing(c14995e, c14995e2);
        c9033e.f18088e = c14995e2;
        c9033e.f18089e = this.f32535e;
        c9033e.f18087e = this.f32534e;
        if (billing) {
            return;
        }
        c9033e.f18086e = false;
        AbstractC1599e.purchase(c9033e);
    }
}
