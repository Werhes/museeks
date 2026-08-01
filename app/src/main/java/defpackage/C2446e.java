package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2446e implements InterfaceC17000e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC17000e f6256e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f6254e = 0;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f6253e = -1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f6255e = -1;

    public C2446e(C9770e c9770e) {
        this.f6256e = c9770e;
    }

    public final void ad() {
        int i = this.f6254e;
        if (i == 0) {
            return;
        }
        InterfaceC17000e interfaceC17000e = this.f6256e;
        if (i == 1) {
            interfaceC17000e.appmetrica(this.f6253e, this.f6255e);
        } else if (i == 2) {
            interfaceC17000e.billing(this.f6253e, this.f6255e);
        } else if (i == 3) {
            interfaceC17000e.startapp(this.f6253e, this.f6255e);
        }
        this.f6254e = 0;
    }

    @Override // defpackage.InterfaceC17000e
    public final void appmetrica(int i, int i2) {
        int i3;
        if (this.f6254e == 1 && i >= (i3 = this.f6253e)) {
            int i4 = this.f6255e;
            if (i <= i3 + i4) {
                this.f6255e = i4 + i2;
                this.f6253e = Math.min(i, i3);
                return;
            }
        }
        ad();
        this.f6253e = i;
        this.f6255e = i2;
        this.f6254e = 1;
    }

    @Override // defpackage.InterfaceC17000e
    public final void billing(int i, int i2) {
        int i3;
        if (this.f6254e == 2 && (i3 = this.f6253e) >= i && i3 <= i + i2) {
            this.f6255e += i2;
            this.f6253e = i;
        } else {
            ad();
            this.f6253e = i;
            this.f6255e = i2;
            this.f6254e = 2;
        }
    }

    @Override // defpackage.InterfaceC17000e
    public final void metrica(int i, int i2) {
        ad();
        this.f6256e.metrica(i, i2);
    }

    @Override // defpackage.InterfaceC17000e
    public final void startapp(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f6254e == 3 && i <= (i4 = this.f6255e + (i3 = this.f6253e)) && (i5 = i + i2) >= i3) {
            this.f6253e = Math.min(i, i3);
            this.f6255e = Math.max(i4, i5) - this.f6253e;
        } else {
            ad();
            this.f6253e = i;
            this.f6255e = i2;
            this.f6254e = 3;
        }
    }
}
