package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: eؙۢۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6740e extends AbstractC9027e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C6325e f13936e;

    public C6740e(int i, byte[] bArr) {
        super(false);
        byte[] bArr2 = new byte[57];
        System.arraycopy(bArr, i, bArr2, 0, 57);
        C6325e c6325e = null;
        if ((bArr2[56] & Byte.MAX_VALUE) == 0) {
            int appmetrica = AbstractC12751e.appmetrica(52, bArr2);
            int[] iArr = AbstractC3995e.vip;
            int i2 = iArr[13] ^ appmetrica;
            int i3 = 12;
            while (true) {
                if (i3 > 0) {
                    int appmetrica2 = AbstractC12751e.appmetrica(i3 * 4, bArr2);
                    if (i2 == 0 && appmetrica2 + RecyclerView.UNDEFINED_DURATION > iArr[i3] + RecyclerView.UNDEFINED_DURATION) {
                        break;
                    }
                    appmetrica |= appmetrica2;
                    i2 |= iArr[i3] ^ appmetrica2;
                    i3--;
                } else {
                    int appmetrica3 = AbstractC12751e.appmetrica(0, bArr2);
                    if ((appmetrica != 0 || appmetrica3 + RecyclerView.UNDEFINED_DURATION > -2147483647) && (i2 != 0 || appmetrica3 + RecyclerView.UNDEFINED_DURATION < iArr[0] - (-2147483647))) {
                        C18540e c18540e = new C18540e(17);
                        if (AbstractC3995e.ad(bArr2, false, c18540e)) {
                            int[] iArr2 = new int[32];
                            AbstractC14410e.appmetrica(0, 0, (int[]) c18540e.f36383e, iArr2);
                            AbstractC14410e.appmetrica(0, 16, (int[]) c18540e.f36382e, iArr2);
                            c6325e = new C6325e(11, iArr2);
                        }
                    }
                }
            }
        }
        if (c6325e == null) {
            throw new IllegalArgumentException("invalid public key");
        }
        this.f13936e = c6325e;
    }

    public C6740e(C6325e c6325e) {
        super(false);
        this.f13936e = c6325e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6740e(byte[] bArr) {
        this(0, bArr);
        if (bArr.length != 57) {
            throw new IllegalArgumentException("'buf' must have length 57");
        }
    }
}
