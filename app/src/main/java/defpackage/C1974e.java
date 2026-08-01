package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٞؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1974e extends OutputStream {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final byte[] f5179e = new byte[0];

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f5180e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f5181e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f5184e = 128;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f5182e = new ArrayList();

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public byte[] f5183e = new byte[128];

    public final void ad(int i) {
        this.f5182e.add(new C1884e(this.f5183e));
        int length = this.f5181e + this.f5183e.length;
        this.f5181e = length;
        this.f5183e = new byte[Math.max(this.f5184e, Math.max(i, length >>> 1))];
        this.f5180e = 0;
    }

    public final void license() {
        int i = this.f5180e;
        byte[] bArr = this.f5183e;
        int length = bArr.length;
        ArrayList arrayList = this.f5182e;
        if (i >= length) {
            arrayList.add(new C1884e(this.f5183e));
            this.f5183e = f5179e;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new C1884e(bArr2));
        }
        this.f5181e += this.f5180e;
        this.f5180e = 0;
    }

    public final synchronized AbstractC6732e purchase() {
        ArrayList arrayList;
        license();
        arrayList = this.f5182e;
        if (!(arrayList != null)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((AbstractC6732e) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? AbstractC6732e.f13911e : AbstractC6732e.appmetrica(arrayList.iterator(), arrayList.size());
    }

    public final String toString() {
        int i;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.f5181e + this.f5180e;
        }
        return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        try {
            if (this.f5180e == this.f5183e.length) {
                ad(1);
            }
            byte[] bArr = this.f5183e;
            int i2 = this.f5180e;
            this.f5180e = i2 + 1;
            bArr[i2] = (byte) i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        try {
            byte[] bArr2 = this.f5183e;
            int length = bArr2.length;
            int i3 = this.f5180e;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f5180e += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                ad(i4);
                System.arraycopy(bArr, i + length2, this.f5183e, 0, i4);
                this.f5180e = i4;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
