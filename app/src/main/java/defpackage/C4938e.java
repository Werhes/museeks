package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4938e {
    public static final int vip = AbstractC18394e.ad;
    public final BinderC7421e ad;

    public C4938e(byte[] bArr) {
        C13304e Signature = AbstractC17475e.Signature();
        int length = bArr.length;
        int i = vip;
        int billing = AbstractC9413e.billing(length, i);
        for (int i2 = 0; i2 < billing; i2++) {
            Bundle bundle = new Bundle();
            int i3 = i2 * i;
            bundle.putByteArray("bytes", Arrays.copyOfRange(bArr, i3, Math.min(i3 + i, bArr.length)));
            Signature.metrica(bundle);
        }
        this.ad = new BinderC7421e(Signature.billing());
    }

    public static byte[] ad(Bundle bundle) {
        IBinder binder = bundle.getBinder(C18080e.billing);
        if (binder != null) {
            try {
                AbstractC17475e ad = BinderC7421e.ad(binder);
                if (ad.isEmpty()) {
                    return AbstractC9413e.vip;
                }
                byte[] byteArray = ((Bundle) AbstractC4306e.appmetrica(ad)).getByteArray("bytes");
                if (byteArray != null) {
                    int size = ad.size() - 1;
                    int i = vip;
                    int i2 = size * i;
                    byte[] bArr = new byte[byteArray.length + i2];
                    System.arraycopy(byteArray, 0, bArr, i2, byteArray.length);
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] byteArray2 = ((Bundle) ad.get(i3)).getByteArray("bytes");
                        if (byteArray2 != null && byteArray2.length == i) {
                            System.arraycopy(byteArray2, 0, bArr, i3 * i, i);
                        }
                    }
                    return bArr;
                }
            } catch (RuntimeException e) {
                AbstractC2803e.amazon("BundleableByteArray", "Failed to read byte array from bundle list retriever", e);
                return null;
            }
        }
        return null;
    }
}
