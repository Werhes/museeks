package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: eٖؗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5249e extends AbstractC9027e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C7850e f11320e;

    public C5249e(int i, byte[] bArr) {
        super(false);
        boolean z;
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, i, bArr2, 0, 32);
        int appmetrica = AbstractC12751e.appmetrica(28, bArr2) & Alert.DURATION_SHOW_INDEFINITELY;
        int[] iArr = AbstractC6286e.ad;
        int i2 = iArr[7] ^ appmetrica;
        int[] iArr2 = AbstractC6286e.vip;
        int i3 = iArr2[7] ^ appmetrica;
        int[] iArr3 = AbstractC6286e.metrica;
        int i4 = iArr3[7] ^ appmetrica;
        for (int i5 = 6; i5 > 0; i5--) {
            int appmetrica2 = AbstractC12751e.appmetrica(i5 * 4, bArr2);
            appmetrica |= appmetrica2;
            i2 |= iArr[i5] ^ appmetrica2;
            i3 |= iArr2[i5] ^ appmetrica2;
            i4 |= appmetrica2 ^ iArr3[i5];
        }
        int appmetrica3 = AbstractC12751e.appmetrica(0, bArr2);
        if ((appmetrica != 0 || appmetrica3 + RecyclerView.UNDEFINED_DURATION > -2147483647) && (i2 != 0 || RecyclerView.UNDEFINED_DURATION + appmetrica3 < iArr[0] - (-2147483647))) {
            z = (((iArr2[0] ^ appmetrica3) | i3) != 0) & (((iArr3[0] ^ appmetrica3) | i4) != 0);
        } else {
            z = false;
        }
        C7850e c7850e = null;
        if (z) {
            C0085e c0085e = new C0085e();
            if (AbstractC6286e.ad(bArr2, false, c0085e)) {
                int[] iArr4 = new int[20];
                AbstractC13482e.amazon(0, 0, c0085e.ad, iArr4);
                AbstractC13482e.amazon(0, 10, c0085e.vip, iArr4);
                c7850e = new C7850e(9, iArr4);
            }
        }
        if (c7850e == null) {
            throw new IllegalArgumentException("invalid public key");
        }
        this.f11320e = c7850e;
    }

    public C5249e(C7850e c7850e) {
        super(false);
        this.f11320e = c7850e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5249e(byte[] bArr) {
        this(0, bArr);
        if (bArr.length != 32) {
            throw new IllegalArgumentException("'buf' must have length 32");
        }
    }

    public final byte[] getEncoded() {
        byte[] bArr = new byte[32];
        AbstractC6286e.metrica(this.f11320e, bArr, 0);
        return bArr;
    }
}
