package defpackage;

import java.security.SecureRandom;

/* renamed from: eٌۨۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9151e extends C1956e {
    @Override // defpackage.C1956e, defpackage.C13038e
    public final byte[] ad() {
        int i = this.vip;
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            this.ad.nextBytes(bArr);
            AbstractC7822e.metrica(bArr);
            i3++;
            if (i3 >= 20) {
                break;
            }
            int i4 = 0;
            while (true) {
                if (i4 < i) {
                    if (AbstractC7822e.vip(i4, bArr)) {
                        break;
                    }
                    i4 += 8;
                } else if (AbstractC7822e.ad(bArr)) {
                    break;
                }
            }
        }
        while (true) {
            if (i2 < i) {
                if (AbstractC7822e.vip(i2, bArr)) {
                    break;
                }
                i2 += 8;
            } else if (AbstractC7822e.ad(bArr)) {
                return bArr;
            }
        }
        throw new IllegalStateException("Unable to generate DES-EDE key");
    }

    @Override // defpackage.C1956e, defpackage.C13038e
    public final void vip(C13572e c13572e) {
        this.ad = (SecureRandom) c13572e.f26878e;
        int i = (c13572e.f26879e + 7) / 8;
        this.vip = i;
        if (i == 0 || i == 21) {
            this.vip = 24;
        } else if (i == 14) {
            this.vip = 16;
        } else if (i != 24 && i != 16) {
            throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
        }
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }
}
