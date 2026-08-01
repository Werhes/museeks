package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* renamed from: eٓؗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13798e implements InterfaceC11306e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f27345e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f27346e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f27347e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f27348e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f27349e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f27350e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f27351e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f27352e;

    public C13798e() {
        this.f27346e = null;
        this.f27349e = null;
        this.f27345e = null;
        this.f27352e = Collections.EMPTY_LIST;
        this.f27351e = null;
        this.f27350e = 0;
        this.f27347e = 0;
        this.f27348e = Bundle.EMPTY;
    }

    public C13798e(C0368e c0368e) {
        this.f27350e = 0;
        this.f27347e = -1;
        this.f27346e = null;
        this.f27349e = null;
        this.f27352e = null;
        this.f27351e = null;
        this.f27348e = null;
        this.f27345e = c0368e;
    }

    public C13798e(C5920e c5920e, int i, C0136e c0136e) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.f27345e = new C8011e(c5920e);
        this.f27352e = c0136e;
        this.f27347e = i / 8;
        this.f27346e = new byte[8];
        this.f27349e = new byte[8];
        this.f27350e = 0;
    }

    public C13798e(C13798e c13798e) {
        this.f27346e = (C18368e) c13798e.f27346e;
        this.f27349e = (C4820e) c13798e.f27349e;
        this.f27345e = (C3737e) c13798e.f27345e;
        this.f27352e = (List) c13798e.f27352e;
        this.f27351e = (CharSequence) c13798e.f27351e;
        this.f27350e = c13798e.f27350e;
        this.f27347e = c13798e.f27347e;
        this.f27348e = (Bundle) c13798e.f27348e;
    }

    public C13798e(C18368e c18368e, C4820e c4820e, C3737e c3737e, List list, CharSequence charSequence, int i, int i2, Bundle bundle) {
        this.f27346e = c18368e;
        this.f27349e = c4820e;
        this.f27345e = c3737e;
        list.getClass();
        this.f27352e = list;
        this.f27351e = charSequence;
        this.f27350e = i;
        this.f27347e = i2;
        this.f27348e = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // defpackage.InterfaceC11306e
    public int doFinal(byte[] bArr, int i) {
        int i2 = this.f27347e;
        byte[] bArr2 = (byte[]) this.f27349e;
        byte[] bArr3 = (byte[]) this.f27346e;
        C8011e c8011e = (C8011e) this.f27345e;
        int isPro = c8011e.f16252e.isPro();
        InterfaceC14454e interfaceC14454e = (InterfaceC14454e) this.f27352e;
        if (interfaceC14454e == null) {
            while (true) {
                int i3 = this.f27350e;
                if (i3 >= isPro) {
                    break;
                }
                bArr2[i3] = 0;
                this.f27350e = i3 + 1;
            }
        } else {
            if (this.f27350e == isPro) {
                c8011e.tapsense(0, 0, bArr2, bArr3);
                this.f27350e = 0;
            }
            interfaceC14454e.loadAd(this.f27350e, bArr2);
        }
        c8011e.tapsense(0, 0, bArr2, bArr3);
        C5920e c5920e = new C5920e();
        c5920e.init(false, (C14915e) this.f27351e);
        c5920e.tapsense(0, 0, bArr3, bArr3);
        c5920e.init(true, (C14915e) this.f27348e);
        c5920e.tapsense(0, 0, bArr3, bArr3);
        System.arraycopy(bArr3, 0, bArr, 0, i2);
        reset();
        return i2;
    }

    @Override // defpackage.InterfaceC11306e
    public String getAlgorithmName() {
        return "ISO9797Alg3";
    }

    @Override // defpackage.InterfaceC11306e
    public int getMacSize() {
        return this.f27347e;
    }

    @Override // defpackage.InterfaceC11306e
    public void init(InterfaceC3894e interfaceC3894e) {
        C14915e c14915e;
        C8011e c8011e = (C8011e) this.f27345e;
        reset();
        boolean z = interfaceC3894e instanceof C14915e;
        if (!z && !(interfaceC3894e instanceof C11494e)) {
            throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
        }
        byte[] bArr = (z ? (C14915e) interfaceC3894e : (C14915e) ((C11494e) interfaceC3894e).f23094e).f29591e;
        if (bArr.length == 16) {
            c14915e = new C14915e(bArr, 0, 8);
            this.f27351e = new C14915e(bArr, 8, 8);
            this.f27348e = c14915e;
        } else {
            if (bArr.length != 24) {
                throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
            }
            c14915e = new C14915e(bArr, 0, 8);
            this.f27351e = new C14915e(bArr, 8, 8);
            this.f27348e = new C14915e(bArr, 16, 8);
        }
        if (interfaceC3894e instanceof C11494e) {
            c8011e.init(true, new C11494e(c14915e, ((C11494e) interfaceC3894e).f23095e));
        } else {
            c8011e.init(true, c14915e);
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f27349e;
            if (i >= bArr.length) {
                this.f27350e = 0;
                ((C8011e) this.f27345e).reset();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte b) {
        int i = this.f27350e;
        byte[] bArr = (byte[]) this.f27349e;
        if (i == bArr.length) {
            ((C8011e) this.f27345e).tapsense(0, 0, bArr, (byte[]) this.f27346e);
            this.f27350e = 0;
        }
        int i2 = this.f27350e;
        this.f27350e = i2 + 1;
        bArr[i2] = b;
    }

    @Override // defpackage.InterfaceC11306e
    public void update(byte[] bArr, int i, int i2) {
        byte[] bArr2 = (byte[]) this.f27346e;
        byte[] bArr3 = (byte[]) this.f27349e;
        C8011e c8011e = (C8011e) this.f27345e;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int isPro = c8011e.f16252e.isPro();
        int i3 = this.f27350e;
        int i4 = isPro - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, bArr3, i3, i4);
            c8011e.tapsense(0, 0, bArr3, bArr2);
            this.f27350e = 0;
            i2 -= i4;
            i += i4;
            while (i2 > isPro) {
                c8011e.tapsense(i, 0, bArr, bArr2);
                i2 -= isPro;
                i += isPro;
            }
        }
        System.arraycopy(bArr, i, bArr3, this.f27350e, i2);
        this.f27350e += i2;
    }
}
