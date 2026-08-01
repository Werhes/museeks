package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10703e extends AbstractC10226e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC8528e f21086e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final List f21087e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC5021e f21088e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f21089e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Function1 f21090e;

    public C10703e(InterfaceC5021e interfaceC5021e, List list, boolean z, InterfaceC8528e interfaceC8528e, Function1 function1) {
        this.f21088e = interfaceC5021e;
        this.f21087e = list;
        this.f21089e = z;
        this.f21086e = interfaceC8528e;
        this.f21090e = function1;
        if (!(interfaceC8528e instanceof C9866e) || (interfaceC8528e instanceof C7886e)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + interfaceC8528e + '\n' + interfaceC5021e);
    }

    @Override // defpackage.AbstractC1186e
    public final boolean Signature() {
        return this.f21089e;
    }

    @Override // defpackage.AbstractC1186e
    /* renamed from: admob */
    public final AbstractC1186e signatures(C13520e c13520e) {
        AbstractC10226e abstractC10226e = (AbstractC10226e) this.f21090e.invoke(c13520e);
        return abstractC10226e == null ? this : abstractC10226e;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: applovin */
    public final AbstractC10226e isVip(C6557e c6557e) {
        return c6557e.isEmpty() ? this : new C13369e(this, c6557e);
    }

    @Override // defpackage.AbstractC1186e
    /* renamed from: eؗٔٓ */
    public final InterfaceC8528e mo483e() {
        return this.f21086e;
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: isPro */
    public final AbstractC10226e pro(boolean z) {
        return z == this.f21089e ? this : z ? new C6118e(this, 1) : new C6118e(this, 0);
    }

    @Override // defpackage.AbstractC1186e
    public final InterfaceC5021e loadAd() {
        return this.f21088e;
    }

    @Override // defpackage.AbstractC1186e
    public final List mopub() {
        return this.f21087e;
    }

    @Override // defpackage.AbstractC15728e
    public final AbstractC15728e signatures(C13520e c13520e) {
        AbstractC10226e abstractC10226e = (AbstractC10226e) this.f21090e.invoke(c13520e);
        return abstractC10226e == null ? this : abstractC10226e;
    }

    @Override // defpackage.AbstractC1186e
    public final C6557e smaato() {
        C6557e.f13492e.getClass();
        return C6557e.f13491e;
    }
}
