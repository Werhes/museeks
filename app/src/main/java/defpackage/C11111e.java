package defpackage;

/* renamed from: eُٛۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11111e extends Cinterface {
    @Override // defpackage.Cinterface, defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2337implements(24, z, m3028while());
    }

    @Override // defpackage.Cinterface, defpackage.Cdefault
    public final Cdefault ads() {
        return this;
    }

    @Override // defpackage.Cdefault
    public final Cdefault premium() {
        return this;
    }

    @Override // defpackage.Cinterface, defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(m3028while().length, z);
    }

    /* renamed from: while, reason: not valid java name */
    public final byte[] m3028while() {
        byte[] bArr = this.f36408e;
        if (bArr[bArr.length - 1] == 90) {
            if (!m4601this()) {
                byte[] bArr2 = new byte[bArr.length + 4];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length - 1);
                System.arraycopy(AbstractC1433e.metrica("0000Z"), 0, bArr2, bArr.length - 1, 5);
                return bArr2;
            }
            if (!m4600native()) {
                byte[] bArr3 = new byte[bArr.length + 2];
                System.arraycopy(bArr, 0, bArr3, 0, bArr.length - 1);
                System.arraycopy(AbstractC1433e.metrica("00Z"), 0, bArr3, bArr.length - 1, 3);
                return bArr3;
            }
            if (m4598goto()) {
                int length = bArr.length - 2;
                while (length > 0 && bArr[length] == 48) {
                    length--;
                }
                if (bArr[length] == 46) {
                    byte[] bArr4 = new byte[length + 1];
                    System.arraycopy(bArr, 0, bArr4, 0, length);
                    bArr4[length] = 90;
                    return bArr4;
                }
                byte[] bArr5 = new byte[length + 2];
                int i = length + 1;
                System.arraycopy(bArr, 0, bArr5, 0, i);
                bArr5[i] = 90;
                return bArr5;
            }
        }
        return bArr;
    }
}
