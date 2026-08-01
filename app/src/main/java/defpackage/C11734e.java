package defpackage;

import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11734e {
    public static final byte[] appmetrica = {0, 0, 1};
    public int ad;
    public Serializable license;
    public boolean metrica;
    public int vip;

    public Size ad(InterfaceC13842e interfaceC13842e) {
        int mo1768else = interfaceC13842e.mo1768else(0);
        Size mo1772throw = interfaceC13842e.mo1772throw();
        int i = this.vip;
        int i2 = this.ad;
        if (mo1772throw != null) {
            int vip = AbstractC3425e.vip(AbstractC3425e.billing(mo1768else), i2, 1 == i);
            if (vip == 90 || vip == 270) {
                return new Size(mo1772throw.getHeight(), mo1772throw.getWidth());
            }
        }
        return mo1772throw;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], java.io.Serializable] */
    public void vip(int i, int i2, byte[] bArr) {
        if (this.metrica) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.license;
            int length = bArr2.length;
            int i4 = this.ad + i3;
            if (length < i4) {
                this.license = Arrays.copyOf(bArr2, i4 * 2);
            }
            System.arraycopy(bArr, i, (byte[]) this.license, this.ad, i3);
            this.ad += i3;
        }
    }
}
