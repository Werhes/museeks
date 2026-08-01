package defpackage;

import java.io.OutputStream;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1884e extends AbstractC6732e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f5019e = 0;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f5020e;

    public C1884e(byte[] bArr) {
        this.f5020e = bArr;
    }

    @Override // defpackage.AbstractC6732e
    public final int Signature(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f5020e[i4];
        }
        return i;
    }

    @Override // defpackage.AbstractC6732e
    public final int adcel() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // defpackage.AbstractC6732e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int admob(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r10 = r10 + r9
            byte[] r0 = r7.f5020e
            if (r8 == 0) goto L95
            if (r9 < r10) goto L8
            return r8
        L8:
            byte r1 = (byte) r8
            r2 = -32
            r3 = -1
            r4 = -65
            if (r1 >= r2) goto L1f
            r8 = -62
            if (r1 < r8) goto L94
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r4) goto L1c
            goto L94
        L1c:
            r9 = r8
            goto L95
        L1f:
            r5 = -16
            if (r1 >= r5) goto L4c
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L37
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r8 < r10) goto L34
            int r8 = defpackage.AbstractC6537e.license(r1, r9)
            return r8
        L34:
            r6 = r9
            r9 = r8
            r8 = r6
        L37:
            if (r8 > r4) goto L94
            r5 = -96
            if (r1 != r2) goto L3f
            if (r8 < r5) goto L94
        L3f:
            r2 = -19
            if (r1 != r2) goto L45
            if (r8 >= r5) goto L94
        L45:
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r4) goto L1c
            goto L94
        L4c:
            int r2 = r8 >> 8
            int r2 = ~r2
            byte r2 = (byte) r2
            if (r2 != 0) goto L5f
            int r8 = r9 + 1
            r2 = r0[r9]
            if (r8 < r10) goto L5d
            int r8 = defpackage.AbstractC6537e.license(r1, r2)
            return r8
        L5d:
            r9 = 0
            goto L65
        L5f:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r9
            r9 = r8
            r8 = r6
        L65:
            if (r9 != 0) goto L81
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r9 < r10) goto L7e
            r9 = -12
            if (r1 > r9) goto L7d
            if (r2 > r4) goto L7d
            if (r8 <= r4) goto L76
            goto L7d
        L76:
            int r9 = r2 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            return r8
        L7d:
            return r3
        L7e:
            r6 = r9
            r9 = r8
            r8 = r6
        L81:
            if (r2 > r4) goto L94
            int r1 = r1 << 28
            int r2 = r2 + 112
            int r2 = r2 + r1
            int r1 = r2 >> 30
            if (r1 != 0) goto L94
            if (r9 > r4) goto L94
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r8 <= r4) goto L95
        L94:
            return r3
        L95:
            int r8 = defpackage.AbstractC6537e.purchase(r9, r10, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1884e.admob(int, int, int):int");
    }

    @Override // defpackage.AbstractC6732e
    public final boolean advert() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6732e) || size() != ((AbstractC6732e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C1884e) {
            return inmobi((C1884e) obj, 0, size());
        }
        if (obj instanceof C1152e) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(AbstractC1786e.signatures(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    public final int hashCode() {
        int i = this.f5019e;
        if (i == 0) {
            int size = size();
            i = Signature(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f5019e = i;
        }
        return i;
    }

    public final boolean inmobi(C1884e c1884e, int i, int i2) {
        byte[] bArr = c1884e.f5020e;
        int length = bArr.length;
        byte[] bArr2 = this.f5020e;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 <= bArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                if (bArr2[i3] != bArr[i]) {
                    return false;
                }
                i3++;
                i++;
            }
            return true;
        }
        int length3 = c1884e.f5020e.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new IllegalArgumentException(AbstractC8647e.isPro(length3, ", ", sb2));
    }

    @Override // defpackage.AbstractC6732e
    public final void isVip(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.f5020e, i, i2);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C1952e(this);
    }

    @Override // defpackage.AbstractC6732e
    public final String remoteconfig() {
        byte[] bArr = this.f5020e;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // defpackage.AbstractC6732e
    public int size() {
        return this.f5020e.length;
    }

    @Override // defpackage.AbstractC6732e
    public final boolean smaato() {
        byte[] bArr = this.f5020e;
        return AbstractC6537e.purchase(0, bArr.length, bArr) == 0;
    }

    @Override // defpackage.AbstractC6732e
    public void startapp(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.f5020e, i, bArr, i2, i3);
    }

    @Override // defpackage.AbstractC6732e
    public final int subscription() {
        return this.f5019e;
    }
}
