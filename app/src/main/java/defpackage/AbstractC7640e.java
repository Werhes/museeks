package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.car.app.model.Alert;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؐۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7640e {
    public static final C11021e ad = new C11021e(19);
    public static C17149e vip;

    public static byte[] ad(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (i > Alert.DURATION_SHOW_INDEFINITELY - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i += bArr2.length;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            i2 += bArr4.length;
        }
        return bArr3;
    }

    public static final void appmetrica(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] billing(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return purchase(0, bArr.length, bArr, bArr2);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final C15274e license(C13770e c13770e) {
        View view = (View) c13770e.adcel(AbstractC2676e.purchase);
        Object m3681throw = c13770e.m3681throw();
        C5170e c5170e = C2987e.ad;
        if (m3681throw == c5170e) {
            m3681throw = AbstractC17861e.adcel(c13770e);
        }
        C15274e c15274e = (C15274e) m3681throw;
        boolean license = c13770e.license(6) | c13770e.yandex(view);
        Object m3681throw2 = c13770e.m3681throw();
        if (license || m3681throw2 == c5170e) {
            m3681throw2 = new C7195e(c15274e, view, null, 7);
            c13770e.m3682throws(m3681throw2);
        }
        AbstractC17680e.appmetrica(c15274e, 6, (Function2) m3681throw2, c13770e);
        return c15274e;
    }

    public static C0520e metrica(C0520e c0520e, String str, String str2, int i) {
        char charAt;
        char charAt2;
        Object obj;
        boolean z = (i & 4) != 0;
        if ((i & 8) != 0) {
            str2 = null;
        }
        if (!c0520e.f2666e) {
            String metrica = c0520e.metrica();
            if (AbstractC6507e.pro(metrica, str, false) && metrica.length() != str.length() && ('a' > (charAt = metrica.charAt(str.length())) || charAt >= '{')) {
                if (str2 != null) {
                    return C0520e.appmetrica(str2.concat(AbstractC5304e.m1852case(metrica, str)));
                }
                if (!z) {
                    return c0520e;
                }
                String m1852case = AbstractC5304e.m1852case(metrica, str);
                if (m1852case.length() != 0 && AbstractC6022e.billing(0, m1852case)) {
                    if (m1852case.length() != 1 && AbstractC6022e.billing(1, m1852case)) {
                        Iterator it = new C11241e(0, m1852case.length() - 1, 1).iterator();
                        while (true) {
                            C3296e c3296e = (C3296e) it;
                            if (!c3296e.f7452e) {
                                obj = null;
                                break;
                            }
                            obj = c3296e.next();
                            if (!AbstractC6022e.billing(((Number) obj).intValue(), m1852case)) {
                                break;
                            }
                        }
                        Integer num = (Integer) obj;
                        if (num != null) {
                            int intValue = num.intValue() - 1;
                            m1852case = AbstractC6022e.startapp(m1852case.substring(0, intValue)).concat(m1852case.substring(intValue));
                        } else {
                            m1852case = AbstractC6022e.startapp(m1852case);
                        }
                    } else if (m1852case.length() != 0 && 'A' <= (charAt2 = m1852case.charAt(0)) && charAt2 < '[') {
                        m1852case = Character.toLowerCase(charAt2) + m1852case.substring(1);
                    }
                }
                if (C0520e.purchase(m1852case)) {
                    return C0520e.appmetrica(m1852case);
                }
            }
        }
        return null;
    }

    public static final byte[] purchase(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (i2 < 0 || bArr.length - i2 < i || bArr2.length - i2 < 0) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr3[i3] = (byte) (bArr[i3 + i] ^ bArr2[i3]);
        }
        return bArr3;
    }

    public static final boolean vip(Context context) {
        return !(((AccessibilityManager) context.getSystemService(AccessibilityManager.class)) != null ? r1.isTouchExplorationEnabled() : false);
    }
}
