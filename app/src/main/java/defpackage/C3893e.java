package defpackage;

/* renamed from: eٖؖؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3893e extends AbstractC7629e {
    public final int Signature;
    public final C7952e admob;
    public final Csuper advert;
    public final Object amazon;
    public final byte[] loadAd;
    public final C10398e mopub;
    public InterfaceC0554e pro;
    public InterfaceC0554e remoteconfig;
    public final byte[] smaato;
    public final byte[] subscription;

    /* JADX WARN: Type inference failed for: r2v10, types: [eَؑٓ, java.lang.Object] */
    public C3893e(int i, int i2, int i3, int i4, int i5) {
        super(i, i2, i3, i4, i5);
        int i6;
        this.admob = new C7952e();
        this.subscription = new byte[32];
        if (i == 16) {
            this.amazon = new C7952e();
            this.mopub = new C10398e(new C7952e());
            this.advert = new Csuper(new C7952e());
            i6 = 64;
        } else {
            this.amazon = new C15708e();
            this.mopub = new C10398e(new C15708e());
            this.advert = new Csuper(new C15708e());
            i6 = 128;
        }
        this.Signature = i6;
        this.smaato = new byte[this.mopub.f20548e];
        this.loadAd = new byte[this.amazon.getDigestSize()];
    }

    public static byte[] yandex(C13935e c13935e) {
        byte[] bArr = new byte[22];
        byte[] bArr2 = (byte[]) c13935e.f27641e;
        System.arraycopy(bArr2, 3, bArr, 0, 1);
        System.arraycopy(bArr2, 8, bArr, 1, 8);
        System.arraycopy(bArr2, 19, bArr, 9, 1);
        System.arraycopy(bArr2, 20, bArr, 10, 12);
        return bArr;
    }

    @Override // defpackage.AbstractC7629e
    public final byte[] ad(C13935e c13935e, byte[] bArr, byte[] bArr2) {
        byte[] yandex = yandex(c13935e);
        InterfaceC0554e interfaceC0554e = this.pro;
        C7952e c7952e = this.admob;
        c7952e.vip(interfaceC0554e);
        c7952e.update(yandex, 0, 22);
        c7952e.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.subscription;
        c7952e.doFinal(bArr3, 0);
        return AbstractC12442e.admob(0, this.ad, bArr3);
    }

    @Override // defpackage.AbstractC7629e
    public final byte[] appmetrica(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C14915e c14915e = new C14915e(bArr, 0, bArr.length);
        C10398e c10398e = this.mopub;
        c10398e.init(c14915e);
        c10398e.update(bArr2, 0, bArr2.length);
        if (bArr3 != null) {
            c10398e.update(bArr3, 0, bArr3.length);
        }
        c10398e.update(bArr4, 0, bArr4.length);
        byte[] bArr5 = this.smaato;
        c10398e.doFinal(bArr5, 0);
        return AbstractC12442e.admob(0, this.ad, bArr5);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eَؑٓ, java.lang.Object] */
    @Override // defpackage.AbstractC7629e
    public final void billing(byte[] bArr) {
        int i = this.Signature;
        byte[] bArr2 = new byte[i];
        int length = bArr.length;
        ?? r3 = this.amazon;
        r3.update(bArr, 0, length);
        r3.update(bArr2, 0, i - this.ad);
        this.remoteconfig = ((InterfaceC0554e) r3).ad();
        r3.reset();
        int length2 = bArr.length;
        C7952e c7952e = this.admob;
        c7952e.update(bArr, 0, length2);
        c7952e.update(bArr2, 0, 64 - bArr.length);
        this.pro = c7952e.ad();
        c7952e.reset();
    }

    @Override // defpackage.AbstractC7629e
    public final byte[] license(C13935e c13935e, byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        InterfaceC0554e interfaceC0554e = this.pro;
        C7952e c7952e = this.admob;
        c7952e.vip(interfaceC0554e);
        c7952e.update(yandex(c13935e), 0, 22);
        c7952e.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.subscription;
        c7952e.doFinal(bArr3, 0);
        return AbstractC12442e.admob(0, length, bArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [eَؑٓ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, eؙِۘ, eؚٓؖ] */
    @Override // defpackage.AbstractC7629e
    public final C15475e metrica(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        int i = ((this.billing * this.yandex) + 7) / 8;
        int i2 = this.purchase;
        int i3 = this.startapp;
        int i4 = i3 / i2;
        int i5 = i3 - i4;
        int i6 = (i4 + 7) / 8;
        int i7 = (i5 + 7) / 8;
        int i8 = i + i6 + i7;
        byte[] bArr6 = new byte[i8];
        ?? r14 = this.amazon;
        byte[] bArr7 = new byte[r14.getDigestSize()];
        r14.update(bArr, 0, bArr.length);
        r14.update(bArr2, 0, bArr2.length);
        r14.update(bArr3, 0, bArr3.length);
        if (bArr4 != null) {
            r14.update(bArr4, 0, bArr4.length);
        }
        r14.update(bArr5, 0, bArr5.length);
        r14.doFinal(bArr7, 0);
        byte[] mopub = AbstractC12442e.mopub(bArr, bArr2, bArr7);
        byte[] bArr8 = new byte[i8];
        int length = mopub.length;
        ?? obj = new Object();
        byte[] bArr9 = new byte[length];
        obj.ad = bArr9;
        System.arraycopy(mopub, 0, bArr9, 0, length);
        Csuper csuper = this.advert;
        csuper.init(obj);
        csuper.generateBytes(bArr8, 0, i8);
        AbstractC4340e.startapp(bArr6, i8, bArr8);
        byte[] bArr10 = new byte[8];
        System.arraycopy(bArr8, i, bArr10, 8 - i7, i7);
        long license = AbstractC3628e.license(0, bArr10) & ((-1) >>> (64 - i5));
        byte[] bArr11 = new byte[4];
        System.arraycopy(bArr8, i7 + i, bArr11, 4 - i6, i6);
        return new C15475e(AbstractC3628e.metrica(0, bArr11) & ((-1) >>> (32 - i4)), license, AbstractC12442e.admob(0, i, bArr8));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [eَؑٓ, java.lang.Object] */
    @Override // defpackage.AbstractC7629e
    public final byte[] purchase(C13935e c13935e, byte[] bArr, byte[] bArr2) {
        byte[] yandex = yandex(c13935e);
        ?? r4 = this.amazon;
        ((InterfaceC0554e) r4).vip(this.remoteconfig);
        r4.update(yandex, 0, 22);
        r4.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.loadAd;
        r4.doFinal(bArr3, 0);
        return AbstractC12442e.admob(0, this.ad, bArr3);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [eَؑٓ, java.lang.Object] */
    @Override // defpackage.AbstractC7629e
    public final byte[] vip(C13935e c13935e, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] yandex = yandex(c13935e);
        ?? r4 = this.amazon;
        ((InterfaceC0554e) r4).vip(this.remoteconfig);
        r4.update(yandex, 0, 22);
        r4.update(bArr2, 0, bArr2.length);
        r4.update(bArr3, 0, bArr3.length);
        byte[] bArr4 = this.loadAd;
        r4.doFinal(bArr4, 0);
        return AbstractC12442e.admob(0, this.ad, bArr4);
    }
}
