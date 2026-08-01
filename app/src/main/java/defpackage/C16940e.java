package defpackage;

/* renamed from: eُٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16940e extends isPro {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final isPro[] f33175e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f33176e;

    public C16940e(int i, byte[] bArr) {
        super(i, bArr);
        this.f33175e = null;
        this.f33176e = 1000;
    }

    public C16940e(isPro[] isproArr) {
        super(m4229goto(isproArr));
        this.f33175e = isproArr;
        this.f33176e = 1000;
    }

    /* renamed from: goto, reason: not valid java name */
    public static byte[] m4229goto(isPro[] isproArr) {
        int length = isproArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return isproArr[0].f36413e;
        }
        int i = length - 1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            byte[] bArr = isproArr[i3].f36413e;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            i2 += bArr.length - 1;
        }
        byte[] bArr2 = isproArr[i].f36413e;
        byte b = bArr2[0];
        byte[] bArr3 = new byte[i2 + bArr2.length];
        bArr3[0] = b;
        int i4 = 1;
        for (isPro ispro : isproArr) {
            byte[] bArr4 = ispro.f36413e;
            int length2 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i4, length2);
            i4 += length2;
        }
        return bArr3;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        boolean admob = admob();
        byte[] bArr = this.f36413e;
        if (!admob) {
            int length = bArr.length;
            c7850e.m2343super(3, z);
            c7850e.m2330abstract(length);
            c7850e.m2331break(bArr, 0, length);
            return;
        }
        c7850e.m2343super(35, z);
        c7850e.m2341protected(128);
        isPro[] isproArr = this.f33175e;
        if (isproArr != null) {
            c7850e.mo2340private(isproArr);
        } else if (bArr.length >= 2) {
            byte b = bArr[0];
            int length2 = bArr.length;
            int i = length2 - 1;
            int i2 = this.f33176e;
            int i3 = i2 - 1;
            while (i > i3) {
                c7850e.m2341protected(3);
                c7850e.m2330abstract(i2);
                c7850e.m2341protected(0);
                c7850e.m2331break(bArr, length2 - i, i3);
                i -= i3;
            }
            c7850e.m2341protected(3);
            c7850e.m2330abstract(i + 1);
            c7850e.m2341protected(b);
            c7850e.m2331break(bArr, length2 - i, i);
        }
        c7850e.m2341protected(0);
        c7850e.m2341protected(0);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return this.f33175e != null || this.f36413e.length > this.f33176e;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        boolean admob = admob();
        byte[] bArr = this.f36413e;
        if (!admob) {
            return C7850e.m2327goto(bArr.length, z);
        }
        int i = z ? 4 : 3;
        isPro[] isproArr = this.f33175e;
        if (isproArr != null) {
            for (isPro ispro : isproArr) {
                i += ispro.remoteconfig(true);
            }
            return i;
        }
        if (bArr.length < 2) {
            return i;
        }
        int length = bArr.length - 2;
        int i2 = this.f33176e;
        int i3 = i2 - 1;
        int i4 = length / i3;
        return C7850e.m2327goto(bArr.length - (i3 * i4), true) + (C7850e.m2327goto(i2, true) * i4) + i;
    }
}
