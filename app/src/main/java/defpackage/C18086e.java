package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۢۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18086e extends AbstractC10226e implements InterfaceC12198e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C6557e f35473e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0460e f35474e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC16232e f35475e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f35476e;

    public C18086e(AbstractC16232e abstractC16232e, C0460e c0460e, boolean z, C6557e c6557e) {
        this.f35475e = abstractC16232e;
        this.f35474e = c0460e;
        this.f35476e = z;
        this.f35473e = c6557e;
    }

    @Override // defpackage.AbstractC1186e
    public final boolean Signature() {
        return this.f35476e;
    }

    @Override // defpackage.AbstractC1186e
    /* renamed from: admob */
    public final AbstractC1186e signatures(C13520e c13520e) {
        return new C18086e(this.f35475e.license(c13520e), this.f35474e, this.f35476e, this.f35473e);
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: applovin */
    public final AbstractC10226e isVip(C6557e c6557e) {
        return new C18086e(this.f35475e, this.f35474e, this.f35476e, c6557e);
    }

    @Override // defpackage.AbstractC1186e
    /* renamed from: eؗٔٓ */
    public final InterfaceC8528e mo483e() {
        return C18139e.ad(1, true, new String[0]);
    }

    @Override // defpackage.AbstractC10226e
    /* renamed from: isPro */
    public final AbstractC10226e pro(boolean z) {
        if (z == this.f35476e) {
            return this;
        }
        return new C18086e(this.f35475e, this.f35474e, z, this.f35473e);
    }

    @Override // defpackage.AbstractC1186e
    public final InterfaceC5021e loadAd() {
        return this.f35474e;
    }

    @Override // defpackage.AbstractC1186e
    public final List mopub() {
        return C13664e.f27089e;
    }

    @Override // defpackage.AbstractC10226e, defpackage.AbstractC15728e
    public final AbstractC15728e pro(boolean z) {
        if (z == this.f35476e) {
            return this;
        }
        return new C18086e(this.f35475e, this.f35474e, z, this.f35473e);
    }

    @Override // defpackage.AbstractC15728e
    public final AbstractC15728e signatures(C13520e c13520e) {
        return new C18086e(this.f35475e.license(c13520e), this.f35474e, this.f35476e, this.f35473e);
    }

    @Override // defpackage.AbstractC1186e
    public final C6557e smaato() {
        return this.f35473e;
    }

    @Override // defpackage.AbstractC10226e
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f35475e);
        sb.append(')');
        sb.append(this.f35476e ? "?" : BuildConfig.FLAVOR);
        return sb.toString();
    }
}
