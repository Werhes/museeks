package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9500e implements InterfaceC14239e, InterfaceC1145e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC14239e f18844e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC16970e f18845e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f18846e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long f18847e = -9223372036854775807L;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AbstractC3317e f18848e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C18208e f18849e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f18850e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public InterfaceC1145e f18851e;

    public C9500e(C18208e c18208e, InterfaceC16970e interfaceC16970e, long j) {
        this.f18849e = c18208e;
        this.f18845e = interfaceC16970e;
        this.f18846e = j;
    }

    @Override // defpackage.InterfaceC1145e
    public final void ad(InterfaceC14239e interfaceC14239e) {
        InterfaceC1145e interfaceC1145e = this.f18851e;
        String str = AbstractC9413e.ad;
        interfaceC1145e.ad(this);
    }

    @Override // defpackage.InterfaceC14585e
    public final long admob() {
        InterfaceC14239e interfaceC14239e = this.f18844e;
        String str = AbstractC9413e.ad;
        return interfaceC14239e.admob();
    }

    @Override // defpackage.InterfaceC14239e
    public final long advert() {
        InterfaceC14239e interfaceC14239e = this.f18844e;
        String str = AbstractC9413e.ad;
        return interfaceC14239e.advert();
    }

    @Override // defpackage.InterfaceC14239e
    public final C12931e amazon() {
        InterfaceC14239e interfaceC14239e = this.f18844e;
        String str = AbstractC9413e.ad;
        return interfaceC14239e.amazon();
    }

    @Override // defpackage.InterfaceC14239e
    public final long appmetrica(long j, C1198e c1198e) {
        InterfaceC14239e interfaceC14239e = this.f18844e;
        String str = AbstractC9413e.ad;
        return interfaceC14239e.appmetrica(j, c1198e);
    }

    @Override // defpackage.InterfaceC14239e
    public final void billing() {
        try {
            InterfaceC14239e interfaceC14239e = this.f18844e;
            if (interfaceC14239e != null) {
                interfaceC14239e.billing();
                return;
            }
            AbstractC3317e abstractC3317e = this.f18848e;
            if (abstractC3317e != null) {
                abstractC3317e.adcel();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // defpackage.InterfaceC14585e
    public final long license() {
        InterfaceC14239e interfaceC14239e = this.f18844e;
        String str = AbstractC9413e.ad;
        return interfaceC14239e.license();
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean loadAd(C6576e c6576e) {
        InterfaceC14239e interfaceC14239e = this.f18844e;
        return interfaceC14239e != null && interfaceC14239e.loadAd(c6576e);
    }

    @Override // defpackage.InterfaceC14239e
    public final long metrica(InterfaceC17119e[] interfaceC17119eArr, boolean[] zArr, InterfaceC4543e[] interfaceC4543eArr, boolean[] zArr2, long j) {
        long j2 = this.f18847e;
        long j3 = (j2 == -9223372036854775807L || j != this.f18846e) ? j : j2;
        this.f18847e = -9223372036854775807L;
        InterfaceC14239e interfaceC14239e = this.f18844e;
        String str = AbstractC9413e.ad;
        return interfaceC14239e.metrica(interfaceC17119eArr, zArr, interfaceC4543eArr, zArr2, j3);
    }

    @Override // defpackage.InterfaceC13344e
    public final void mopub(InterfaceC14585e interfaceC14585e) {
        InterfaceC1145e interfaceC1145e = this.f18851e;
        String str = AbstractC9413e.ad;
        interfaceC1145e.mopub(this);
    }

    @Override // defpackage.InterfaceC14239e
    public final void smaato(InterfaceC1145e interfaceC1145e, long j) {
        this.f18851e = interfaceC1145e;
        InterfaceC14239e interfaceC14239e = this.f18844e;
        if (interfaceC14239e != null) {
            long j2 = this.f18847e;
            if (j2 == -9223372036854775807L) {
                j2 = this.f18846e;
            }
            interfaceC14239e.smaato(this, j2);
        }
    }

    @Override // defpackage.InterfaceC14239e
    public final void startapp(long j) {
        InterfaceC14239e interfaceC14239e = this.f18844e;
        String str = AbstractC9413e.ad;
        interfaceC14239e.startapp(j);
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean subscription() {
        InterfaceC14239e interfaceC14239e = this.f18844e;
        return interfaceC14239e != null && interfaceC14239e.subscription();
    }

    @Override // defpackage.InterfaceC14585e
    public final void tapsense(long j) {
        InterfaceC14239e interfaceC14239e = this.f18844e;
        String str = AbstractC9413e.ad;
        interfaceC14239e.tapsense(j);
    }

    public final void vip(C18208e c18208e) {
        long j = this.f18847e;
        if (j == -9223372036854775807L) {
            j = this.f18846e;
        }
        AbstractC3317e abstractC3317e = this.f18848e;
        abstractC3317e.getClass();
        InterfaceC14239e vip = abstractC3317e.vip(c18208e, this.f18845e, j);
        this.f18844e = vip;
        if (this.f18851e != null) {
            vip.smaato(this, j);
        }
    }

    @Override // defpackage.InterfaceC14239e
    public final long yandex(long j) {
        InterfaceC14239e interfaceC14239e = this.f18844e;
        String str = AbstractC9413e.ad;
        return interfaceC14239e.yandex(j);
    }
}
