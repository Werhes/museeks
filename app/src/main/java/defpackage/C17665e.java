package defpackage;

/* renamed from: eٌَ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17665e implements InterfaceC11306e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f34622e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f34623e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f34625e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f34624e = null;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f34621e = null;

    public C17665e(int i) {
        this.f34622e = new C15742e(i);
        this.f34623e = i / 8;
    }

    public C17665e(C17359e c17359e) {
        this.f34622e = c17359e;
    }

    public void ad(int i, int i2, byte[] bArr) {
        int i3;
        byte[] bArr2 = (byte[]) this.f34624e;
        C17359e c17359e = (C17359e) this.f34622e;
        int i4 = this.f34623e;
        int i5 = 16 - i4;
        if (i4 <= 0 || i2 < i5) {
            i3 = i2;
            i5 = 0;
        } else {
            System.arraycopy(bArr, i, bArr2, i4, i5);
            C17359e.purchase(0, 16, bArr2, c17359e.license);
            c17359e.billing(c17359e.license);
            i3 = i2 - i5;
            this.f34623e = 0;
        }
        while (i3 >= 16) {
            C17359e.purchase(i + i5, 16, bArr, c17359e.license);
            c17359e.billing(c17359e.license);
            i5 += 16;
            i3 -= 16;
        }
        if (i3 > 0) {
            System.arraycopy(bArr, i + i5, bArr2, this.f34623e, i3);
            this.f34623e += i3;
        }
        this.f34625e += i2;
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        C15742e c15742e = (C15742e) this.f34622e;
        if (((byte[]) this.f34624e) == null) {
            throw new IllegalStateException("DSTU7564Mac not initialised");
        }
        if (bArr.length < this.f34623e) {
            throw new RuntimeException("Output buffer too short");
        }
        int i2 = c15742e.f30999e;
        long j = this.f34625e;
        int i3 = i2 - ((int) (j % i2));
        if (i3 < 13) {
            i3 += i2;
        }
        byte[] bArr2 = new byte[i3];
        bArr2[0] = Byte.MIN_VALUE;
        AbstractC3628e.subscription(i3 - 12, j * 8, bArr2);
        c15742e.update(bArr2, 0, i3);
        byte[] bArr3 = (byte[]) this.f34621e;
        c15742e.update(bArr3, 0, bArr3.length);
        this.f34625e = 0L;
        int doFinal = c15742e.doFinal(bArr, 0);
        reset();
        return doFinal;
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        return "DSTU7564Mac";
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return this.f34623e;
    }

    @Override // defpackage.InterfaceC11306e
    public void init(InterfaceC3894e interfaceC3894e) {
        C15742e c15742e = (C15742e) this.f34622e;
        this.f34624e = null;
        reset();
        if (!(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException("Bad parameter passed");
        }
        byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
        this.f34621e = new byte[bArr.length];
        int length = bArr.length;
        int i = c15742e.f30999e;
        int i2 = (((length + i) - 1) / i) * i;
        if (i2 - bArr.length < 13) {
            i2 += i;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = Byte.MIN_VALUE;
        AbstractC3628e.yandex(bArr.length * 8, i2 - 12, bArr2);
        this.f34624e = bArr2;
        int i3 = 0;
        while (true) {
            byte[] bArr3 = (byte[]) this.f34621e;
            if (i3 >= bArr3.length) {
                byte[] bArr4 = (byte[]) this.f34624e;
                c15742e.update(bArr4, 0, bArr4.length);
                return;
            } else {
                bArr3[i3] = (byte) (~bArr[i3]);
                i3++;
            }
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        this.f34625e = 0L;
        C15742e c15742e = (C15742e) this.f34622e;
        c15742e.reset();
        byte[] bArr = (byte[]) this.f34624e;
        if (bArr != null) {
            c15742e.update(bArr, 0, bArr.length);
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte b) {
        ((C15742e) this.f34622e).update(b);
        this.f34625e++;
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte[] bArr, int i, int i2) {
        if (bArr.length - i < i2) {
            throw new RuntimeException("Input buffer too short");
        }
        if (((byte[]) this.f34624e) == null) {
            throw new IllegalStateException("DSTU7564Mac not initialised");
        }
        ((C15742e) this.f34622e).update(bArr, i, i2);
        this.f34625e += i2;
    }
}
