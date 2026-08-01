package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٔ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14991e implements Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f29719e = AtomicReferenceFieldUpdater.newUpdater(C14991e.class, Object.class, "eؘٙؓ");

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile Object f29720e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f29721e;

    public /* synthetic */ C14991e(String str, byte[] bArr) {
        this.f29721e = str;
        this.f29720e = bArr;
    }

    public final /* synthetic */ void ad(byte[] bArr) {
        byte[][] bArr2;
        int i = 0;
        while (true) {
            Object obj = this.f29720e;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29719e;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bArr2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f29721e.compareTo((String) obj);
    }
}
