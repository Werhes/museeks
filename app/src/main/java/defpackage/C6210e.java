package defpackage;

/* renamed from: eؙؗؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6210e extends Cprotected {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Cprotected[] f12970e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f12971e;

    public C6210e(byte[] bArr, Cprotected[] cprotectedArr) {
        super(bArr);
        this.f12970e = cprotectedArr;
        this.f12971e = 1000;
    }

    public static byte[] crashlytics(Cprotected[] cprotectedArr) {
        int length = cprotectedArr.length;
        if (length == 0) {
            return Cprotected.f36447e;
        }
        if (length == 1) {
            return cprotectedArr[0].f36449e;
        }
        int i = 0;
        for (Cprotected cprotected : cprotectedArr) {
            i += cprotected.f36449e.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (Cprotected cprotected2 : cprotectedArr) {
            byte[] bArr2 = cprotected2.f36449e;
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        c7850e.m2343super(36, z);
        c7850e.m2341protected(128);
        Cprotected[] cprotectedArr = this.f12970e;
        if (cprotectedArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.f36449e;
                if (i >= bArr.length) {
                    break;
                }
                int min = Math.min(bArr.length - i, this.f12971e);
                c7850e.m2343super(4, true);
                c7850e.m2330abstract(min);
                c7850e.m2331break(bArr, i, min);
                i += min;
            }
        } else {
            c7850e.mo2340private(cprotectedArr);
        }
        c7850e.m2341protected(0);
        c7850e.m2341protected(0);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return true;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        int i = z ? 4 : 3;
        Cprotected[] cprotectedArr = this.f12970e;
        if (cprotectedArr != null) {
            for (Cprotected cprotected : cprotectedArr) {
                i += cprotected.remoteconfig(true);
            }
            return i;
        }
        byte[] bArr = this.f36449e;
        int length = bArr.length;
        int i2 = this.f12971e;
        int i3 = length / i2;
        int m2327goto = (C7850e.m2327goto(i2, true) * i3) + i;
        int length2 = bArr.length - (i3 * i2);
        return length2 > 0 ? C7850e.m2327goto(length2, true) + m2327goto : m2327goto;
    }
}
