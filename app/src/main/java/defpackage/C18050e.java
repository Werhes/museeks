package defpackage;

/* renamed from: eٕ٘۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18050e implements InterfaceC6931e, InterfaceC0293e {

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final byte[] f35396e = AbstractC1433e.metrica("ParallelHash");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f35397e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f35398e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f35399e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C8986e f35400e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f35401e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final EnumC0300e f35402e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f35403e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f35404e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C8986e f35405e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final byte[] f35406e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f35407e;

    public C18050e(int i, int i2) {
        this.f35405e = new C8986e(f35396e, i, null);
        this.f35400e = new C8986e(new byte[0], i, new byte[0]);
        this.f35398e = i;
        this.f35397e = 128;
        this.f35403e = (i2 + 7) / 8;
        this.f35407e = new byte[128];
        this.f35406e = new byte[(i * 2) / 8];
        this.f35402e = EnumC0300e.f2305e;
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
        reset();
    }

    public C18050e(C18050e c18050e) {
        this.f35405e = new C8986e(c18050e.f35405e);
        this.f35400e = new C8986e(c18050e.f35400e);
        this.f35398e = c18050e.f35398e;
        this.f35397e = c18050e.f35397e;
        this.f35403e = c18050e.f35403e;
        this.f35407e = AbstractC12442e.license(c18050e.f35407e);
        this.f35406e = AbstractC12442e.license(c18050e.f35406e);
        this.f35402e = c18050e.f35402e;
        this.f35401e = c18050e.f35401e;
        this.f35404e = c18050e.f35404e;
        this.f35399e = c18050e.f35399e;
        AbstractC5336e.license(this);
        AbstractC9915e.ad();
    }

    public final void ad(int i) {
        int i2 = this.f35399e;
        C8986e c8986e = this.f35405e;
        if (i2 != 0) {
            C8986e c8986e2 = this.f35400e;
            c8986e2.purchase(0, i2, this.f35407e);
            byte[] bArr = this.f35406e;
            c8986e2.metrica(0, bArr.length, bArr);
            c8986e.purchase(0, bArr.length, bArr);
            this.f35404e++;
            this.f35399e = 0;
        }
        byte[] yandex = AbstractC6232e.yandex(this.f35404e);
        byte[] yandex2 = AbstractC6232e.yandex(i * 8);
        c8986e.purchase(0, yandex.length, yandex);
        c8986e.purchase(0, yandex2.length, yandex2);
        this.f35401e = false;
    }

    @Override // defpackage.InterfaceC0293e
    public final int doFinal(byte[] bArr, int i) {
        boolean z = this.f35401e;
        int i2 = this.f35403e;
        if (z) {
            ad(i2);
        }
        int metrica = this.f35405e.metrica(i, i2, bArr);
        reset();
        return metrica;
    }

    @Override // defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "ParallelHash" + this.f35405e.getAlgorithmName().substring(6);
    }

    @Override // defpackage.InterfaceC1196e
    public final int getByteLength() {
        return this.f35405e.getByteLength();
    }

    @Override // defpackage.InterfaceC0293e
    public final int getDigestSize() {
        return this.f35403e;
    }

    @Override // defpackage.InterfaceC6931e
    public final int metrica(int i, int i2, byte[] bArr) {
        if (this.f35401e) {
            ad(this.f35403e);
        }
        int metrica = this.f35405e.metrica(0, i2, bArr);
        reset();
        return metrica;
    }

    @Override // defpackage.InterfaceC0293e
    public final void reset() {
        C8986e c8986e = this.f35405e;
        c8986e.reset();
        AbstractC12442e.metrica(this.f35407e);
        byte[] purchase = AbstractC6232e.purchase(this.f35397e);
        c8986e.purchase(0, purchase.length, purchase);
        this.f35404e = 0;
        this.f35399e = 0;
        this.f35401e = true;
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        int i = this.f35399e;
        int i2 = i + 1;
        this.f35399e = i2;
        byte[] bArr = this.f35407e;
        bArr[i] = b;
        if (i2 == bArr.length) {
            C8986e c8986e = this.f35400e;
            c8986e.purchase(0, i2, bArr);
            byte[] bArr2 = this.f35406e;
            c8986e.metrica(0, bArr2.length, bArr2);
            this.f35405e.purchase(0, bArr2.length, bArr2);
            this.f35404e++;
            this.f35399e = 0;
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2;
        int i4;
        int max = Math.max(0, i2);
        int i5 = this.f35399e;
        C8986e c8986e = this.f35405e;
        byte[] bArr3 = this.f35406e;
        C8986e c8986e2 = this.f35400e;
        if (i5 != 0) {
            i3 = 0;
            while (true) {
                bArr2 = this.f35407e;
                if (i3 >= max || (i4 = this.f35399e) == bArr2.length) {
                    break;
                }
                this.f35399e = i4 + 1;
                bArr2[i4] = bArr[i3 + i];
                i3++;
            }
            int i6 = this.f35399e;
            if (i6 == bArr2.length) {
                c8986e2.purchase(0, i6, bArr2);
                c8986e2.metrica(0, bArr3.length, bArr3);
                c8986e.purchase(0, bArr3.length, bArr3);
                this.f35404e++;
                this.f35399e = 0;
            }
        } else {
            i3 = 0;
        }
        if (i3 < max) {
            while (true) {
                int i7 = max - i3;
                int i8 = this.f35397e;
                if (i7 < i8) {
                    break;
                }
                c8986e2.purchase(i + i3, i8, bArr);
                c8986e2.metrica(0, bArr3.length, bArr3);
                c8986e.purchase(0, bArr3.length, bArr3);
                this.f35404e++;
                i3 += i8;
            }
        }
        while (i3 < max) {
            update(bArr[i3 + i]);
            i3++;
        }
    }
}
