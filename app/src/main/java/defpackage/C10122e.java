package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10122e implements InterfaceC14388e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public float f19991e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public float f19992e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public float f19993e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public float f19995e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public int f19996e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public long f19997e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public long f19998e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int f20000e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public InterfaceC16154e f20001e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f20002e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long f20003e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public float f20004e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public AbstractC14073e f20005e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public InterfaceC14388e f20006e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f20008e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f20009e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public float f20010e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public float f20011e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public EnumC7792e f20012e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public float f19999e = 1.0f;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public float f19994e = 1.0f;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public float f20007e = 1.0f;

    public C10122e() {
        long j = AbstractC9944e.ad;
        this.f20003e = j;
        this.f20008e = j;
        this.f19992e = 8.0f;
        this.f19997e = C13220e.vip;
        this.f20001e = AbstractC10432e.ad;
        this.f20000e = 0;
        this.f19998e = 9205357640488583168L;
        this.f20006e = AbstractC14410e.ad();
        this.f20012e = EnumC7792e.f15794e;
        this.f19996e = 3;
    }

    public final void Signature(long j) {
        if (C3618e.metrica(this.f20008e, j)) {
            return;
        }
        this.f20009e |= 128;
        this.f20008e = j;
    }

    public final void ad() {
        advert(1.0f);
        smaato(1.0f);
        metrica(1.0f);
        pro(0.0f);
        signatures(0.0f);
        amazon(0.0f);
        long j = AbstractC9944e.ad;
        license(j);
        Signature(j);
        billing(0.0f);
        startapp(0.0f);
        adcel(0.0f);
        if (this.f19992e != 8.0f) {
            this.f20009e |= 2048;
            this.f19992e = 8.0f;
        }
        admob(C13220e.vip);
        loadAd(AbstractC10432e.ad);
        appmetrica(false);
        if (this.f19996e != 3) {
            this.f20009e |= 524288;
            this.f19996e = 3;
        }
        purchase(0);
        this.f19998e = 9205357640488583168L;
        this.f20005e = null;
        this.f20009e = 0;
    }

    public final void adcel(float f) {
        if (this.f19993e == f) {
            return;
        }
        this.f20009e |= 1024;
        this.f19993e = f;
    }

    public final void admob(long j) {
        if (C13220e.ad(this.f19997e, j)) {
            return;
        }
        this.f20009e |= 4096;
        this.f19997e = j;
    }

    public final void advert(float f) {
        if (this.f19999e == f) {
            return;
        }
        this.f20009e |= 1;
        this.f19999e = f;
    }

    public final void amazon(float f) {
        if (this.f20010e == f) {
            return;
        }
        this.f20009e |= 32;
        this.f20010e = f;
    }

    public final void appmetrica(boolean z) {
        if (this.f20002e != z) {
            this.f20009e |= 16384;
            this.f20002e = z;
        }
    }

    public final void billing(float f) {
        if (this.f19995e == f) {
            return;
        }
        this.f20009e |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        this.f19995e = f;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return Math.round(mo495e(j));
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return AbstractC4653e.purchase(this, mo498new(f));
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final /* synthetic */ int mo493e(float f) {
        return AbstractC4653e.ad(this, f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final /* synthetic */ long mo494e(long j) {
        return AbstractC4653e.appmetrica(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final /* synthetic */ float mo495e(long j) {
        return AbstractC4653e.license(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return i / vip();
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ float firebase(long j) {
        return AbstractC4653e.vip(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return vip() * f;
    }

    public final void license(long j) {
        if (C3618e.metrica(this.f20003e, j)) {
            return;
        }
        this.f20009e |= 64;
        this.f20003e = j;
    }

    public final void loadAd(InterfaceC16154e interfaceC16154e) {
        if (AbstractC7890e.billing(this.f20001e, interfaceC16154e)) {
            return;
        }
        this.f20009e |= 8192;
        this.f20001e = interfaceC16154e;
    }

    public final void metrica(float f) {
        if (this.f20007e == f) {
            return;
        }
        this.f20009e |= 4;
        this.f20007e = f;
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return f / vip();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f20006e.mo499package();
    }

    public final void pro(float f) {
        if (this.f19991e == f) {
            return;
        }
        this.f20009e |= 8;
        this.f19991e = f;
    }

    public final void purchase(int i) {
        if (this.f20000e == i) {
            return;
        }
        this.f20009e |= 32768;
        this.f20000e = i;
    }

    public final void signatures(float f) {
        if (this.f20011e == f) {
            return;
        }
        this.f20009e |= 16;
        this.f20011e = f;
    }

    public final void smaato(float f) {
        if (this.f19994e == f) {
            return;
        }
        this.f20009e |= 2;
        this.f19994e = f;
    }

    public final void startapp(float f) {
        if (this.f20004e == f) {
            return;
        }
        this.f20009e |= AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
        this.f20004e = f;
    }

    @Override // defpackage.InterfaceC14388e
    public final /* synthetic */ long tapsense(long j) {
        return AbstractC4653e.metrica(j, this);
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f20006e.vip();
    }
}
