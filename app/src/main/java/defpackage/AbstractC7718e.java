package defpackage;

import java.io.IOException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7718e implements InterfaceC10218e {
    protected int memoizedHashCode;

    public abstract int ad(InterfaceC11115e interfaceC11115e);

    public final byte[] appmetrica() {
        try {
            int ad = ((AbstractC3405e) this).ad(null);
            byte[] bArr = new byte[ad];
            Logger logger = AbstractC13258e.yandex;
            C8460e c8460e = new C8460e(ad, bArr);
            ((AbstractC3405e) this).isPro(c8460e);
            if (c8460e.premium() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(metrica("byte array"), e);
        }
    }

    public abstract AbstractC4490e license();

    public final String metrica(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public final C2096e purchase() {
        try {
            int ad = ((AbstractC3405e) this).ad(null);
            C2096e c2096e = AbstractC10498e.f20717e;
            byte[] bArr = new byte[ad];
            Logger logger = AbstractC13258e.yandex;
            C8460e c8460e = new C8460e(ad, bArr);
            ((AbstractC3405e) this).isPro(c8460e);
            if (c8460e.premium() == 0) {
                return new C2096e(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(metrica("ByteString"), e);
        }
    }
}
