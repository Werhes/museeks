package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12214e {
    public final /* synthetic */ int ad = 1;
    public long[] metrica;
    public int vip;

    public /* synthetic */ C12214e() {
    }

    public C12214e(int i) {
        this.metrica = new long[i];
    }

    public final void ad(long j) {
        switch (this.ad) {
            case 0:
                int i = this.vip;
                long[] jArr = this.metrica;
                if (i == jArr.length) {
                    this.metrica = Arrays.copyOf(jArr, i * 2);
                }
                long[] jArr2 = this.metrica;
                int i2 = this.vip;
                this.vip = i2 + 1;
                jArr2[i2] = j;
                return;
            default:
                if (metrica(j)) {
                    return;
                }
                int i3 = this.vip;
                long[] jArr3 = this.metrica;
                if (i3 >= jArr3.length) {
                    jArr3 = Arrays.copyOf(jArr3, Math.max(i3 + 1, jArr3.length * 2));
                    this.metrica = jArr3;
                }
                jArr3[i3] = j;
                if (i3 >= this.vip) {
                    this.vip = i3 + 1;
                    return;
                }
                return;
        }
    }

    public void appmetrica(long j) {
        int i = this.vip;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.metrica[i2]) {
                int i3 = this.vip - 1;
                while (i2 < i3) {
                    long[] jArr = this.metrica;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.vip--;
                return;
            }
            i2++;
        }
    }

    public long license(int i) {
        if (i >= 0 && i < this.vip) {
            return this.metrica[i];
        }
        StringBuilder premium = AbstractC4653e.premium("Invalid index ", i, ", size is ");
        premium.append(this.vip);
        throw new IndexOutOfBoundsException(premium.toString());
    }

    public boolean metrica(long j) {
        int i = this.vip;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.metrica[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void vip(long[] jArr) {
        int length = this.vip + jArr.length;
        long[] jArr2 = this.metrica;
        if (length > jArr2.length) {
            this.metrica = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.metrica, this.vip, jArr.length);
        this.vip = length;
    }
}
