package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٝٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14852e implements InterfaceC14239e, InterfaceC1145e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public InterfaceC1145e f29393e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f29394e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC14239e f29395e;

    public C14852e(InterfaceC14239e interfaceC14239e, long j) {
        this.f29395e = interfaceC14239e;
        this.f29394e = j;
    }

    @Override // defpackage.InterfaceC1145e
    public final void ad(InterfaceC14239e interfaceC14239e) {
        InterfaceC1145e interfaceC1145e = this.f29393e;
        interfaceC1145e.getClass();
        interfaceC1145e.ad(this);
    }

    @Override // defpackage.InterfaceC14585e
    public final long admob() {
        long admob = this.f29395e.admob();
        if (admob == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return admob + this.f29394e;
    }

    @Override // defpackage.InterfaceC14239e
    public final long advert() {
        long advert = this.f29395e.advert();
        if (advert == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return advert + this.f29394e;
    }

    @Override // defpackage.InterfaceC14239e
    public final C12931e amazon() {
        return this.f29395e.amazon();
    }

    @Override // defpackage.InterfaceC14239e
    public final long appmetrica(long j, C1198e c1198e) {
        long j2 = this.f29394e;
        return this.f29395e.appmetrica(j - j2, c1198e) + j2;
    }

    @Override // defpackage.InterfaceC14239e
    public final void billing() {
        this.f29395e.billing();
    }

    @Override // defpackage.InterfaceC14585e
    public final long license() {
        long license = this.f29395e.license();
        if (license == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return license + this.f29394e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eُؖۥ, java.lang.Object] */
    @Override // defpackage.InterfaceC14585e
    public final boolean loadAd(C6576e c6576e) {
        ?? obj = new Object();
        long j = c6576e.ad;
        obj.vip = c6576e.vip;
        obj.metrica = c6576e.metrica;
        obj.ad = j - this.f29394e;
        return this.f29395e.loadAd(new C6576e(obj));
    }

    @Override // defpackage.InterfaceC14239e
    public final long metrica(InterfaceC17119e[] interfaceC17119eArr, boolean[] zArr, InterfaceC4543e[] interfaceC4543eArr, boolean[] zArr2, long j) {
        InterfaceC4543e[] interfaceC4543eArr2 = new InterfaceC4543e[interfaceC4543eArr.length];
        int i = 0;
        while (true) {
            InterfaceC4543e interfaceC4543e = null;
            if (i >= interfaceC4543eArr.length) {
                break;
            }
            C7690e c7690e = (C7690e) interfaceC4543eArr[i];
            if (c7690e != null) {
                interfaceC4543e = c7690e.f15615e;
            }
            interfaceC4543eArr2[i] = interfaceC4543e;
            i++;
        }
        InterfaceC14239e interfaceC14239e = this.f29395e;
        long j2 = this.f29394e;
        long metrica = interfaceC14239e.metrica(interfaceC17119eArr, zArr, interfaceC4543eArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < interfaceC4543eArr.length; i2++) {
            InterfaceC4543e interfaceC4543e2 = interfaceC4543eArr2[i2];
            if (interfaceC4543e2 == null) {
                interfaceC4543eArr[i2] = null;
            } else {
                InterfaceC4543e interfaceC4543e3 = interfaceC4543eArr[i2];
                if (interfaceC4543e3 == null || ((C7690e) interfaceC4543e3).f15615e != interfaceC4543e2) {
                    interfaceC4543eArr[i2] = new C7690e(interfaceC4543e2, j2);
                }
            }
        }
        return metrica + j2;
    }

    @Override // defpackage.InterfaceC13344e
    public final void mopub(InterfaceC14585e interfaceC14585e) {
        InterfaceC1145e interfaceC1145e = this.f29393e;
        interfaceC1145e.getClass();
        interfaceC1145e.mopub(this);
    }

    @Override // defpackage.InterfaceC14239e
    public final void smaato(InterfaceC1145e interfaceC1145e, long j) {
        this.f29393e = interfaceC1145e;
        this.f29395e.smaato(this, j - this.f29394e);
    }

    @Override // defpackage.InterfaceC14239e
    public final void startapp(long j) {
        this.f29395e.startapp(j - this.f29394e);
    }

    @Override // defpackage.InterfaceC14585e
    public final boolean subscription() {
        return this.f29395e.subscription();
    }

    @Override // defpackage.InterfaceC14585e
    public final void tapsense(long j) {
        this.f29395e.tapsense(j - this.f29394e);
    }

    @Override // defpackage.InterfaceC14239e
    public final long yandex(long j) {
        long j2 = this.f29394e;
        return this.f29395e.yandex(j - j2) + j2;
    }
}
