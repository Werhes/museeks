package defpackage;

import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eّٙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12567e {
    public static final C0384e Companion = new Object();
    public final C4010e ad;

    public C12567e(int i, C4010e c4010e) {
        if (1 == (i & 1)) {
            this.ad = c4010e;
        } else {
            AbstractC5756e.billing(i, 1, C8491e.vip);
            throw null;
        }
    }

    public C12567e(C17788e c17788e) {
        int[] iArr = AbstractC17794e.ad;
        byte[] bArr = c17788e.f34872e;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2 += 3) {
            int i3 = ((bArr[i2] & 255) << 16) & 16777215;
            int i4 = i2 + 1;
            if (i4 < bArr.length) {
                i3 |= (bArr[i4] & 255) << 8;
            } else {
                i++;
            }
            int i5 = i2 + 2;
            if (i5 < bArr.length) {
                i3 |= bArr[i5] & 255;
            } else {
                i++;
            }
            int i6 = 4 - i;
            for (int i7 = 0; i7 < i6; i7++) {
                arrayList.add(Byte.valueOf((byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((16515072 & i3) >> 18)));
                i3 <<= 6;
            }
        }
        for (int i8 = 0; i8 < i; i8++) {
            arrayList.add((byte) 61);
        }
        this.ad = new C4010e(AbstractC6507e.mopub(AbstractC13480e.m3585finally(arrayList)), AbstractC1660e.m671interface(new byte[]{c17788e.f34873e}, BuildConfig.FLAVOR, C8082e.f16402e, 30));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12567e) && AbstractC7890e.billing(this.ad, ((C12567e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "BsonValueJson(data=" + this.ad + ')';
    }
}
