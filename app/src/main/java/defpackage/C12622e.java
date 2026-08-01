package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٞؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12622e {
    public static final byte[] purchase = {0, 0, 1};
    public boolean ad;
    public byte[] appmetrica;
    public int license;
    public int metrica;
    public int vip;

    public final void ad(int i, int i2, byte[] bArr) {
        if (this.ad) {
            int i3 = i2 - i;
            byte[] bArr2 = this.appmetrica;
            int length = bArr2.length;
            int i4 = this.metrica + i3;
            if (length < i4) {
                this.appmetrica = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, this.appmetrica, this.metrica, i3);
            this.metrica += i3;
        }
    }
}
