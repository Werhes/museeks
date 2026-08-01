package defpackage;

/* renamed from: eؓۗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2040e implements InterfaceC1196e, InterfaceC0554e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f5316e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f5317e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long f5318e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EnumC0300e f5319e;

    public AbstractC2040e(EnumC0300e enumC0300e) {
        this.f5317e = new byte[4];
        this.f5319e = enumC0300e;
        this.f5316e = 0;
    }

    public AbstractC2040e(AbstractC2040e abstractC2040e) {
        this.f5317e = new byte[4];
        this.f5319e = abstractC2040e.f5319e;
        license(abstractC2040e);
    }

    public final void appmetrica() {
        long j = this.f5318e << 3;
        byte b = Byte.MIN_VALUE;
        while (true) {
            update(b);
            if (this.f5316e == 0) {
                billing(j);
                purchase();
                return;
            }
            b = 0;
        }
    }

    public abstract void billing(long j);

    @Override // defpackage.InterfaceC1196e
    public final int getByteLength() {
        return 64;
    }

    public final void license(AbstractC2040e abstractC2040e) {
        byte[] bArr = abstractC2040e.f5317e;
        System.arraycopy(bArr, 0, this.f5317e, 0, bArr.length);
        this.f5316e = abstractC2040e.f5316e;
        this.f5318e = abstractC2040e.f5318e;
    }

    public abstract void purchase();

    @Override // defpackage.InterfaceC0293e
    public void reset() {
        this.f5318e = 0L;
        this.f5316e = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.f5317e;
            if (i >= bArr.length) {
                return;
            }
            bArr[i] = 0;
            i++;
        }
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte b) {
        int i = this.f5316e;
        int i2 = i + 1;
        this.f5316e = i2;
        byte[] bArr = this.f5317e;
        bArr[i] = b;
        if (i2 == bArr.length) {
            yandex(0, bArr);
            this.f5316e = 0;
        }
        this.f5318e++;
    }

    @Override // defpackage.InterfaceC0293e
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int max = Math.max(0, i2);
        int i4 = this.f5316e;
        byte[] bArr2 = this.f5317e;
        if (i4 != 0) {
            int i5 = 0;
            while (true) {
                if (i5 >= max) {
                    i3 = i5;
                    break;
                }
                int i6 = this.f5316e;
                int i7 = i6 + 1;
                this.f5316e = i7;
                int i8 = i5 + 1;
                bArr2[i6] = bArr[i5 + i];
                if (i7 == 4) {
                    yandex(0, bArr2);
                    this.f5316e = 0;
                    i3 = i8;
                    break;
                }
                i5 = i8;
            }
        }
        int i9 = max - 3;
        while (i3 < i9) {
            yandex(i + i3, bArr);
            i3 += 4;
        }
        while (i3 < max) {
            int i10 = this.f5316e;
            this.f5316e = i10 + 1;
            bArr2[i10] = bArr[i3 + i];
            i3++;
        }
        this.f5318e += max;
    }

    public abstract void yandex(int i, byte[] bArr);
}
