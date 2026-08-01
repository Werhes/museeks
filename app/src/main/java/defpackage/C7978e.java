package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7978e implements InterfaceC14585e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC17475e f16156e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC14585e f16157e;

    public C7978e(InterfaceC14585e interfaceC14585e, List list) {
        this.f16157e = interfaceC14585e;
        this.f16156e = AbstractC17475e.remoteconfig(list);
    }

    @Override // defpackage.InterfaceC14585e
    public final long admob() {
        return this.f16157e.admob();
    }

    @Override // defpackage.InterfaceC14585e
    public final long license() {
        return this.f16157e.license();
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean loadAd(C6576e c6576e) {
        return this.f16157e.loadAd(c6576e);
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean subscription() {
        return this.f16157e.subscription();
    }

    @Override // defpackage.InterfaceC14585e
    public final void tapsense(long j) {
        this.f16157e.tapsense(j);
    }
}
