package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۛۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12751e {
    public static final C2443e ad = new C2443e("NO_OWNER", 2);

    public static C17651e ad() {
        return new C17651e(false);
    }

    public static final InterfaceC7227e adcel(InterfaceC0861e interfaceC0861e) {
        Object obj;
        if (interfaceC0861e instanceof InterfaceC7227e) {
            return (InterfaceC7227e) interfaceC0861e;
        }
        if (!(interfaceC0861e instanceof InterfaceC12635e)) {
            throw new Error("Cannot calculate JVM erasure for type: " + interfaceC0861e);
        }
        List upperBounds = ((InterfaceC12635e) interfaceC0861e).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC0861e isVip = ((InterfaceC13984e) next).isVip();
            C8404e c8404e = isVip instanceof C8404e ? (C8404e) isVip : null;
            if (c8404e != null && c8404e.m2423case() != EnumC7649e.f15527e && c8404e.m2423case() != EnumC7649e.f15534e) {
                obj = next;
                break;
            }
        }
        InterfaceC13984e interfaceC13984e = (InterfaceC13984e) obj;
        if (interfaceC13984e == null) {
            interfaceC13984e = (InterfaceC13984e) AbstractC13480e.m3604this(upperBounds);
        }
        return interfaceC13984e != null ? mopub(interfaceC13984e) : AbstractC3820e.ad.vip(Object.class);
    }

    public static int appmetrica(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void billing(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static int license(int i, byte[] bArr) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f8, code lost:
    
        if ((r18[r5] & 192) == 128) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008e, code lost:
    
        if ((r18[r5] & 192) == 128) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String metrica(int r16, int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12751e.metrica(int, int, byte[]):java.lang.String");
    }

    public static final InterfaceC7227e mopub(InterfaceC13984e interfaceC13984e) {
        InterfaceC7227e adcel;
        InterfaceC0861e isVip = interfaceC13984e.isVip();
        if (isVip != null && (adcel = adcel(isVip)) != null) {
            return adcel;
        }
        throw new Error("Cannot calculate JVM erasure for type: " + interfaceC13984e);
    }

    public static void purchase(int i, byte[] bArr, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = appmetrica(i2 * 4, bArr);
        }
    }

    public static void startapp(int i, long j, byte[] bArr) {
        billing((int) j, i, bArr);
        int i2 = (int) (j >>> 32);
        bArr[i + 4] = (byte) i2;
        bArr[i + 5] = (byte) (i2 >>> 8);
        bArr[i + 6] = (byte) (i2 >>> 16);
    }

    public static final void vip(InterfaceC7189e interfaceC7189e, int i, C2892e c2892e, C13770e c13770e, int i2, int i3) {
        int i4;
        int i5;
        c13770e.m3671package(-1208072102);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (c13770e.purchase(interfaceC7189e) ? 4 : 2) | i2;
        }
        int i7 = i4 | 48;
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 = i4 | 432;
        } else {
            i5 = (c13770e.license(i) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | i7;
        }
        if ((i5 & 1171) == 1170 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            if (i6 != 0) {
                interfaceC7189e = C17043e.ad;
            }
            if (i8 != 0) {
                i = 0;
            }
            c13770e.m3672private(1849434622);
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = C16726e.f32783e;
                c13770e.m3682throws(m3681throw);
            }
            c13770e.Signature(false);
            Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw);
            c13770e.m3672private(-683746039);
            c13770e.m3672private(-548224868);
            if (!(c13770e.ad instanceof C9626e)) {
                AbstractC5546e.purchase();
                throw null;
            }
            c13770e.m3677super();
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, interfaceC7189e, new C17706e(16));
            AbstractC2270e.yandex(c13770e, new C13692e(i), new C17706e(17));
            AbstractC2270e.yandex(c13770e, new C2782e(0), new C17706e(18));
            c2892e.invoke(C2670e.ad, c13770e, 54);
            c13770e.Signature(true);
            c13770e.Signature(false);
            c13770e.Signature(false);
        }
        InterfaceC7189e interfaceC7189e2 = interfaceC7189e;
        int i9 = i;
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2640e(interfaceC7189e2, i9, c2892e, i2, i3);
        }
    }

    public static void yandex(int i, byte[] bArr, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            billing(iArr[i2], i2 * 4, bArr);
        }
    }
}
