package defpackage;

/* renamed from: eٌؘۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8986e extends C16253e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final byte[] f18040e = new byte[100];

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public byte[] f18041e;

    public C8986e(C8986e c8986e) {
        super(c8986e);
        this.f18041e = AbstractC12442e.license(c8986e.f18041e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8986e(byte[] bArr, int i, byte[] bArr2) {
        super(i, EnumC0300e.f2305e);
        C16253e.advert(i);
        if ((bArr == null || bArr.length == 0) && (bArr2 == null || bArr2.length == 0)) {
            this.f18041e = null;
        } else {
            this.f18041e = AbstractC12442e.mopub(AbstractC6232e.purchase(this.f11444e / 8), (bArr == null || bArr.length == 0) ? AbstractC6232e.purchase(0L) : AbstractC12442e.adcel(AbstractC6232e.purchase(bArr.length * 8), bArr), (bArr2 == null || bArr2.length == 0) ? AbstractC6232e.purchase(0L) : AbstractC12442e.adcel(AbstractC6232e.purchase(bArr2.length * 8), bArr2));
            amazon();
        }
    }

    @Override // defpackage.C16253e, defpackage.InterfaceC0554e
    public final InterfaceC0554e ad() {
        return new C8986e(this);
    }

    public final void amazon() {
        int i = this.f11444e / 8;
        byte[] bArr = this.f18041e;
        purchase(0, bArr.length, bArr);
        int length = this.f18041e.length % i;
        if (length == 0) {
            return;
        }
        int i2 = i - length;
        while (true) {
            byte[] bArr2 = f18040e;
            if (i2 <= 100) {
                purchase(0, i2, bArr2);
                return;
            } else {
                purchase(0, 100, bArr2);
                i2 -= 100;
            }
        }
    }

    @Override // defpackage.C16253e, defpackage.C5338e, defpackage.InterfaceC0293e
    public final String getAlgorithmName() {
        return "CSHAKE" + this.f11447e;
    }

    @Override // defpackage.C5338e, defpackage.InterfaceC0293e
    public final void reset() {
        super.reset();
        if (this.f18041e != null) {
            amazon();
        }
    }

    @Override // defpackage.C16253e
    public final int smaato(int i, int i2, byte[] bArr) {
        if (this.f18041e == null) {
            super.smaato(i, i2, bArr);
            return i2;
        }
        if (!this.f11446e) {
            billing(0, 2);
        }
        mopub(i, i2 * 8, bArr);
        return i2;
    }

    @Override // defpackage.C16253e, defpackage.InterfaceC0554e
    public final void vip(InterfaceC0554e interfaceC0554e) {
        C8986e c8986e = (C8986e) interfaceC0554e;
        yandex(c8986e);
        this.f18041e = AbstractC12442e.license(c8986e.f18041e);
    }
}
