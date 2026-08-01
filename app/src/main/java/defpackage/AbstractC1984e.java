package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٞٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1984e implements InterfaceC2227e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f5192e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f5193e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5194e;

    public AbstractC1984e() {
        this.f5194e = 1;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    public AbstractC1984e(InterfaceC9543e interfaceC9543e) {
        this.f5194e = 0;
        this.f5192e = interfaceC9543e;
        this.f5193e = true;
    }

    public AbstractC1984e(String str, boolean z) {
        this.f5194e = 2;
        this.f5192e = str;
        this.f5193e = z;
    }

    public static void ad(int[] iArr) {
        int pro = pro(iArr[0], 13);
        int pro2 = pro(iArr[2], 3);
        int i = (iArr[1] ^ pro) ^ pro2;
        int i2 = (iArr[3] ^ pro2) ^ (pro << 3);
        iArr[1] = pro(i, 1);
        int pro3 = pro(i2, 7);
        iArr[3] = pro3;
        iArr[0] = pro((pro ^ iArr[1]) ^ pro3, 5);
        iArr[2] = pro((iArr[3] ^ pro2) ^ (iArr[1] << 7), 22);
    }

    public static void adcel(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i2 ^ i4;
        int i6 = ~i5;
        int i7 = i ^ i3;
        int i8 = i3 ^ i5;
        int i9 = (i2 & i8) ^ i7;
        iArr[0] = i9;
        int i10 = (((i | i6) ^ i4) | i7) ^ i5;
        iArr[3] = i10;
        int i11 = ~i8;
        int i12 = i10 | i9;
        iArr[1] = i11 ^ i12;
        iArr[2] = (i12 ^ i7) ^ (i4 & i11);
    }

    public static void admob(int[] iArr) {
        int signatures = (signatures(iArr[2], 22) ^ iArr[3]) ^ (iArr[1] << 7);
        int signatures2 = signatures(iArr[0], 5) ^ iArr[1];
        int i = iArr[3];
        int i2 = signatures2 ^ i;
        int signatures3 = signatures(i, 7);
        int signatures4 = signatures(iArr[1], 1);
        iArr[3] = (signatures3 ^ signatures) ^ (i2 << 3);
        iArr[1] = (signatures4 ^ i2) ^ signatures;
        iArr[2] = signatures(signatures, 3);
        iArr[0] = signatures(i2, 13);
    }

    public static void ads(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i ^ i2;
        int i6 = i & i3;
        int i7 = i | i4;
        int i8 = i3 ^ i4;
        int i9 = i6 | (i5 & i7);
        int i10 = i8 ^ i9;
        iArr[2] = i10;
        int i11 = (i7 ^ i2) ^ i9;
        int i12 = i5 ^ (i8 & i11);
        iArr[0] = i12;
        int i13 = i12 & i10;
        iArr[1] = i11 ^ i13;
        iArr[3] = (i2 | i4) ^ (i8 ^ i13);
    }

    public static void advert(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i2 ^ ((i3 | i4) & i);
        int i6 = i3 ^ (i & i5);
        int i7 = i4 ^ i6;
        iArr[1] = i7;
        int i8 = ~i;
        int i9 = (i6 & i7) ^ i5;
        iArr[3] = i9;
        int i10 = i4 ^ (i7 | i8);
        iArr[0] = i9 ^ i10;
        iArr[2] = (i8 ^ i7) ^ (i5 & i10);
    }

    public static void amazon(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i3 ^ i6;
        int i8 = (i3 | i5) ^ i4;
        iArr[1] = i7 ^ i8;
        int i9 = i6 ^ (i7 & i8);
        int i10 = i8 ^ (i2 | i9);
        iArr[3] = i10;
        int i11 = i2 | i10;
        iArr[0] = i9 ^ i11;
        iArr[2] = (i4 & i5) ^ (i11 ^ i7);
    }

    public static void applovin(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = ~i;
        int i6 = i2 ^ i4;
        int i7 = (i3 & i5) ^ i6;
        iArr[0] = i7;
        int i8 = i3 ^ i5;
        int i9 = i2 & (i3 ^ i7);
        int i10 = i8 ^ i9;
        iArr[3] = i10;
        int i11 = i ^ ((i9 | i4) & (i7 | i8));
        iArr[2] = i11;
        iArr[1] = (i11 ^ (i4 | i5)) ^ (i6 ^ i10);
    }

    public static void crashlytics(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = ~i;
        int i6 = i ^ i4;
        int i7 = i2 ^ i6;
        int i8 = i3 ^ (i5 | i6);
        int i9 = i2 ^ i8;
        iArr[1] = i9;
        int i10 = (i6 | i9) ^ i4;
        int i11 = (i8 & i10) ^ i7;
        iArr[2] = i11;
        int i12 = i10 ^ i8;
        iArr[0] = i11 ^ i12;
        iArr[3] = (i12 & i7) ^ (~i8);
    }

    public static void firebase(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i2 ^ i3;
        int i6 = (i3 & i5) ^ i4;
        int i7 = i ^ i6;
        int i8 = i2 ^ ((i4 | i5) & i7);
        iArr[1] = i8;
        int i9 = (i & i7) ^ i5;
        iArr[3] = i9;
        int i10 = (i8 | i6) ^ i7;
        int i11 = i6 ^ (i9 & i10);
        iArr[2] = i11;
        iArr[0] = (i9 & i11) ^ (~i10);
    }

    public static void inmobi(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = (~i) ^ i2;
        int i6 = (i | i5) ^ i3;
        int i7 = i4 ^ i6;
        iArr[2] = i7;
        int i8 = i2 ^ (i4 | i5);
        int i9 = i7 ^ i5;
        int i10 = (i6 & i8) ^ i9;
        iArr[3] = i10;
        int i11 = i8 ^ i6;
        iArr[1] = i10 ^ i11;
        iArr[0] = i6 ^ (i11 & i9);
    }

    public static void isVip(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i ^ i4;
        int i6 = i3 ^ i5;
        int i7 = i2 ^ i6;
        int i8 = (i4 & i) ^ i7;
        iArr[3] = i8;
        int i9 = i ^ (i2 & i5);
        iArr[2] = (i3 | i9) ^ i7;
        int i10 = (i6 ^ i9) & i8;
        iArr[1] = (~i6) ^ i10;
        iArr[0] = (~i9) ^ i10;
    }

    public static void loadAd(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = (i & i2) | i3;
        int i6 = (i | i2) & i4;
        int i7 = i5 ^ i6;
        iArr[3] = i7;
        int i8 = i2 ^ i6;
        int i9 = ((i7 ^ (~i4)) | i8) ^ i;
        iArr[1] = i9;
        int i10 = (i8 ^ i3) ^ (i4 | i9);
        iArr[0] = i10;
        iArr[2] = ((i & i7) ^ i10) ^ (i5 ^ i9);
    }

    public static void mopub(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i | i2;
        int i6 = i2 ^ i3;
        int i7 = i ^ (i2 & i6);
        int i8 = i3 ^ i7;
        int i9 = i4 | i7;
        int i10 = i6 ^ i9;
        iArr[0] = i10;
        int i11 = (i9 | i6) ^ i4;
        iArr[2] = i8 ^ i11;
        int i12 = i5 ^ i11;
        int i13 = i7 ^ (i10 & i12);
        iArr[3] = i13;
        iArr[1] = i13 ^ (i12 ^ i10);
    }

    public static void premium(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i ^ i4;
        int i6 = i3 ^ (i4 & i5);
        int i7 = i2 | i6;
        iArr[3] = i5 ^ i7;
        int i8 = ~i2;
        int i9 = (i5 | i8) ^ i6;
        iArr[0] = i9;
        int i10 = i8 ^ i5;
        int i11 = (i7 & i10) ^ (i9 & i);
        iArr[2] = i11;
        iArr[1] = (i ^ i6) ^ (i10 & i11);
    }

    public static int pro(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static int signatures(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    public static void smaato(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = ~i3;
        int i6 = (i2 & i5) ^ i4;
        int i7 = i & i6;
        int i8 = (i2 ^ i5) ^ i7;
        iArr[3] = i8;
        int i9 = i8 | i2;
        iArr[1] = i6 ^ (i & i9);
        int i10 = i4 | i;
        iArr[0] = (i5 ^ i9) ^ i10;
        iArr[2] = ((i ^ i3) | i7) ^ (i2 & i10);
    }

    public static void startapp(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = i4 ^ i2;
        int i6 = i ^ (i2 & i5);
        int i7 = i5 ^ i6;
        int i8 = i3 ^ i7;
        iArr[3] = i8;
        int i9 = i2 ^ (i5 & i6);
        int i10 = i6 ^ (i8 | i9);
        iArr[1] = i10;
        int i11 = ~i10;
        int i12 = i9 ^ i8;
        iArr[0] = i11 ^ i12;
        iArr[2] = (i11 | i12) ^ i7;
    }

    public static void subs(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = ~i;
        int i6 = i ^ i2;
        int i7 = i ^ i4;
        int i8 = (i3 ^ i5) ^ (i6 | i7);
        iArr[0] = i8;
        int i9 = i4 & i8;
        int i10 = (i6 ^ i8) ^ i9;
        iArr[1] = i10;
        int i11 = i7 ^ (i8 | i5);
        iArr[2] = (i6 | i9) ^ i11;
        iArr[3] = (i11 & i10) ^ (i2 ^ i9);
    }

    public static void yandex(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = ~i;
        int i6 = i2 ^ i;
        int i7 = (i5 | i6) ^ i4;
        int i8 = i3 ^ i7;
        int i9 = i6 ^ i8;
        iArr[2] = i9;
        int i10 = (i6 & i4) ^ i5;
        int i11 = (i9 & i10) ^ i7;
        iArr[1] = i11;
        int i12 = (i & i7) ^ (i11 | i8);
        iArr[3] = i12;
        iArr[0] = i12 ^ (i10 ^ i8);
    }

    public abstract Object Signature(Object obj);

    public void appmetrica(InterfaceC14666e interfaceC14666e, LongPointerWrapper longPointerWrapper) {
        Object license;
        InterfaceC9543e interfaceC9543e = (InterfaceC9543e) this.f5192e;
        if (interfaceC14666e == null) {
            license = license();
        } else if (this.f5193e) {
            this.f5193e = false;
            license = Signature(interfaceC14666e);
        } else {
            if (longPointerWrapper == null) {
                throw new RuntimeException("We should never receive change callbacks for non-null (deleted) entities without an actual change object");
            }
            license = mo740class(interfaceC14666e, longPointerWrapper);
        }
        if (license != null) {
            Object amazon = ((C2448e) interfaceC9543e).f6257e.amazon(license);
            CancellationException cancellationException = ((amazon instanceof C14395e) || !(amazon instanceof C8870e)) ? null : new CancellationException("Cannot deliver object notifications. Increase dispatcher processing resources or buffer the flow with buffer(...)");
            if (cancellationException != null) {
                AbstractC9743e.license(interfaceC9543e, cancellationException);
            }
        }
        if (interfaceC14666e == null) {
            ((C2448e) interfaceC9543e).startapp(null);
        }
    }

    public String billing() {
        return (String) this.f5192e;
    }

    /* renamed from: class, reason: not valid java name */
    public abstract Object mo740class(Object obj, NativePointer nativePointer);

    @Override // defpackage.InterfaceC2227e
    public String getAlgorithmName() {
        return "Serpent";
    }

    @Override // defpackage.InterfaceC2227e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        if (!(interfaceC3894e instanceof C14915e)) {
            throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + interfaceC3894e.getClass().getName());
        }
        this.f5193e = z;
        this.f5192e = subscription(((C14915e) interfaceC3894e).f29591e);
        if (interfaceC3894e instanceof EnumC0300e) {
            throw new IllegalArgumentException("params should not be CryptoServicePurpose");
        }
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC2227e
    public int isPro() {
        return 16;
    }

    public abstract Object license();

    public abstract void metrica(int i, int i2, byte[] bArr, byte[] bArr2);

    public abstract void purchase(int i, int i2, byte[] bArr, byte[] bArr2);

    public AbstractC1984e remoteconfig() {
        return this;
    }

    @Override // defpackage.InterfaceC2227e
    public void reset() {
    }

    public abstract int[] subscription(byte[] bArr);

    @Override // defpackage.InterfaceC2227e
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (((int[]) this.f5192e) == null) {
            throw new IllegalStateException(getAlgorithmName().concat(" not initialised"));
        }
        if (i + 16 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        if (this.f5193e) {
            purchase(i, i2, bArr, bArr2);
            return 16;
        }
        metrica(i, i2, bArr, bArr2);
        return 16;
    }

    public String toString() {
        switch (this.f5194e) {
            case 2:
                return billing();
            default:
                return super.toString();
        }
    }

    public Integer vip(AbstractC1984e abstractC1984e) {
        C1239e c1239e = AbstractC2716e.ad;
        if (this == abstractC1984e) {
            return 0;
        }
        C1239e c1239e2 = AbstractC2716e.ad;
        Integer num = (Integer) c1239e2.get(this);
        Integer num2 = (Integer) c1239e2.get(abstractC1984e);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }
}
