package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۦٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14386e implements InterfaceC18191e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f28456e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f28457e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f28458e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f28459e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f28460e;

    @Override // defpackage.InterfaceC18191e
    public boolean ad(long j) {
        return true;
    }

    @Override // defpackage.InterfaceC18191e
    public void adcel() {
        C7765e c7765e = (C7765e) this.f28456e;
        c7765e.subscription.setValue(EnumC11891e.f23827e);
        if (this.f28457e) {
            c7765e.subscription();
        }
    }

    @Override // defpackage.InterfaceC18191e
    public boolean advert(long j, C16658e c16658e, int i) {
        C7765e c7765e = (C7765e) this.f28456e;
        C12476e metrica = c7765e.vip.metrica();
        if (!c7765e.adcel || metrica == null || c7765e.ad.license().f33322e.length() == 0) {
            return false;
        }
        this.f28457e = i >= 2;
        c7765e.subscription.setValue(EnumC11891e.f23824e);
        ((C5565e) this.f28459e).invoke();
        c7765e.isVip = -1;
        this.f28460e = -1;
        this.f28458e = j;
        this.f28460e = (int) (vip(j, c16658e, metrica, true) >> 32);
        return true;
    }

    @Override // defpackage.InterfaceC18191e
    public boolean amazon(long j) {
        C7765e c7765e = (C7765e) this.f28456e;
        C12476e metrica = c7765e.vip.metrica();
        if (!c7765e.adcel || metrica == null || c7765e.ad.license().f33322e.length() == 0) {
            return false;
        }
        this.f28457e = false;
        ((C5565e) this.f28459e).invoke();
        vip(j, C5107e.f10953e, metrica, false);
        return true;
    }

    @Override // defpackage.InterfaceC18191e
    public boolean smaato(long j, C16658e c16658e) {
        C7765e c7765e = (C7765e) this.f28456e;
        C7102e c7102e = c7765e.vip;
        C11388e c11388e = c7765e.ad;
        C12476e metrica = c7102e.metrica();
        if (!c7765e.adcel || metrica == null || c11388e.license().f33322e.length() == 0) {
            return false;
        }
        if (C12347e.metrica(c11388e.license().f33324e, vip(j, c16658e, metrica, false))) {
            return true;
        }
        this.f28457e = false;
        return true;
    }

    public long vip(long j, C16658e c16658e, C12476e c12476e, boolean z) {
        C7765e c7765e = (C7765e) this.f28456e;
        int length = c12476e.ad.ad.f20850e.length();
        int i = this.f28460e;
        if (i < 0 || i > length) {
            i = c7765e.vip.license(this.f28458e, false);
        }
        int i2 = i;
        long premium = c7765e.premium(c7765e.ad.license(), i2, c7765e.vip.license(j, false), false, c16658e, false, z, null);
        if (this.f28460e == -1 && !C12347e.license(premium)) {
            this.f28460e = (int) (premium >> 32);
        }
        if (C12347e.yandex(premium)) {
            premium = AbstractC9262e.metrica((int) (4294967295L & premium), (int) (premium >> 32));
        }
        c7765e.ad.adcel(premium);
        c7765e.inmobi(EnumC5022e.f10704e);
        return premium;
    }
}
