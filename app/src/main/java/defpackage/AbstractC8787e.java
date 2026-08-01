package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8787e {
    public static final int[] ad = {Alert.DURATION_SHOW_INDEFINITELY, -1, -1, -1, -1};
    public static final int[] vip = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    public static final int[] metrica = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static final void ad(C2892e c2892e, C13770e c13770e, int i) {
        c13770e.m3671package(-709502251);
        byte b = 0;
        if (c13770e.m3673protected(i & 1, (i & 3) != 2)) {
            C15492e c15492e = AbstractC5991e.ad;
            InterfaceC5039e interfaceC5039e = (InterfaceC5039e) c13770e.adcel(c15492e);
            C10304e metrica2 = AbstractC6437e.metrica(c13770e);
            Object[] objArr = {interfaceC5039e};
            C11883e c11883e = new C11883e(new C8436e(b, 26), new C9041e(interfaceC5039e, metrica2, 28), 15);
            boolean yandex = c13770e.yandex(interfaceC5039e) | c13770e.yandex(metrica2);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C5625e(interfaceC5039e, metrica2, 25);
                c13770e.m3682throws(m3681throw);
            }
            C6017e c6017e = (C6017e) AbstractC10510e.appmetrica(objArr, c11883e, (Function0) m3681throw, c13770e, 0);
            AbstractC1101e.ad(c15492e.ad(c6017e), AbstractC16653e.license(-412824043, new C17785e(c2892e, c6017e, 16), c13770e), c13770e, 56);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7099e(c2892e, i, 8);
        }
    }

    public static void adcel(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        AbstractC15077e.signatures(iArr, iArr3);
        while (true) {
            billing(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC15077e.signatures(iArr2, iArr3);
            }
        }
    }

    public static InterfaceC2268e advert(Object obj) {
        if (obj == null) {
            return InterfaceC2268e.f5758e;
        }
        if (obj instanceof String) {
            return new C15547e((String) obj);
        }
        if (obj instanceof Double) {
            return new C6020e((Double) obj);
        }
        if (obj instanceof Long) {
            return new C6020e(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C6020e(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C14898e((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C5273e c5273e = new C5273e();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c5273e.isVip(c5273e.Signature(), advert(it.next()));
            }
            return c5273e;
        }
        C18357e c18357e = new C18357e();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            InterfaceC2268e advert = advert(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                c18357e.adcel((String) obj2, advert);
            }
        }
        return c18357e;
    }

    public static final Object appmetrica(C18382e c18382e, InterfaceC5372e interfaceC5372e, String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("HexBinary string must be even length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int purchase = AbstractC5190e.purchase(str.charAt(i));
            int i2 = i + 1;
            int purchase2 = AbstractC5190e.purchase(str.charAt(i2));
            if (purchase == -1 || purchase2 == -1) {
                throw new IllegalArgumentException(("Invalid hex chars: " + str.charAt(i) + str.charAt(i2)).toString());
            }
            bArr[i / 2] = (byte) ((purchase << 4) + purchase2);
        }
        return c18382e.vip(interfaceC5372e, bArr);
    }

    public static void billing(int[] iArr, int[] iArr2) {
        long j = iArr[5] & 4294967295L;
        long j2 = iArr[6] & 4294967295L;
        long j3 = iArr[7] & 4294967295L;
        long j4 = iArr[8] & 4294967295L;
        long j5 = iArr[9] & 4294967295L;
        long j6 = (iArr[0] & 4294967295L) + j + (j << 31);
        iArr2[0] = (int) j6;
        long j7 = (iArr[1] & 4294967295L) + j2 + (j2 << 31) + (j6 >>> 32);
        iArr2[1] = (int) j7;
        long j8 = (iArr[2] & 4294967295L) + j3 + (j3 << 31) + (j7 >>> 32);
        iArr2[2] = (int) j8;
        long j9 = (iArr[3] & 4294967295L) + j4 + (j4 << 31) + (j8 >>> 32);
        iArr2[3] = (int) j9;
        long j10 = (4294967295L & iArr[4]) + j5 + (j5 << 31) + (j9 >>> 32);
        iArr2[4] = (int) j10;
        yandex(iArr2, (int) (j10 >>> 32));
    }

    public static final C11980e license(C11980e c11980e, InterfaceC2460e interfaceC2460e) {
        return interfaceC2460e.isEmpty() ? c11980e : new C11980e((C17241e) c11980e.f23950e, (InterfaceC10383e) c11980e.f23949e, AbstractC18039e.appmetrica(3, new C12056e(c11980e, interfaceC2460e, 9)));
    }

    public static C11980e metrica(C11980e c11980e, InterfaceC17815e interfaceC17815e, C17070e c17070e, int i) {
        if ((i & 2) != 0) {
            c17070e = null;
        }
        return vip(c11980e, interfaceC17815e, c17070e, 0, AbstractC18039e.appmetrica(3, new C12056e(c11980e, interfaceC17815e, 8)));
    }

    public static void mopub(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC15077e.tapsense(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - (4294967295L & (-2147483647));
            iArr3[0] = (int) j;
            if ((j >> 32) == 0) {
                return;
            }
            AbstractC12797e.yandex(5, 1, iArr3);
        }
    }

    public static void purchase(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[10];
        AbstractC15077e.remoteconfig(iArr, iArr2, iArr4);
        billing(iArr4, iArr3);
    }

    public static InterfaceC2268e smaato(C7298e c7298e) {
        if (c7298e == null) {
            return InterfaceC2268e.f5755e;
        }
        int subs = c7298e.subs() - 1;
        if (subs == 1) {
            return c7298e.isVip() ? new C15547e(c7298e.inmobi()) : InterfaceC2268e.f5754e;
        }
        if (subs == 2) {
            return c7298e.ads() ? new C6020e(Double.valueOf(c7298e.premium())) : new C6020e(null);
        }
        if (subs == 3) {
            return c7298e.isPro() ? new C14898e(Boolean.valueOf(c7298e.applovin())) : new C14898e(null);
        }
        if (subs != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List signatures = c7298e.signatures();
        ArrayList arrayList = new ArrayList();
        Iterator it = signatures.iterator();
        while (it.hasNext()) {
            arrayList.add(smaato((C7298e) it.next()));
        }
        return new C5094e(c7298e.tapsense(), arrayList);
    }

    public static void startapp(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[10];
        AbstractC15077e.signatures(iArr, iArr3);
        billing(iArr3, iArr2);
    }

    public static final C11980e vip(C11980e c11980e, InterfaceC7573e interfaceC7573e, InterfaceC3761e interfaceC3761e, int i, InterfaceC3477e interfaceC3477e) {
        return new C11980e((C17241e) c11980e.f23950e, interfaceC3761e != null ? new C10379e(c11980e, interfaceC7573e, interfaceC3761e, i) : (InterfaceC10383e) c11980e.f23949e, interfaceC3477e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (((r6 >>> 32) != 0 ? defpackage.AbstractC12797e.isVip(5, 2, r10) : 0) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void yandex(int[] r10, int r11) {
        /*
            r0 = 5
            r1 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r11 == 0) goto L35
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r11
            long r6 = r6 & r4
            long r6 = r6 * r2
            r11 = 0
            r2 = r10[r11]
            long r2 = (long) r2
            long r2 = r2 & r4
            long r6 = r6 + r2
            int r2 = (int) r6
            r10[r11] = r2
            r2 = 32
            long r6 = r6 >>> r2
            r3 = 1
            r8 = r10[r3]
            long r8 = (long) r8
            long r4 = r4 & r8
            long r6 = r6 + r4
            int r4 = (int) r6
            r10[r3] = r4
            long r2 = r6 >>> r2
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L2e
            goto L33
        L2e:
            r11 = 2
            int r11 = defpackage.AbstractC12797e.isVip(r0, r11, r10)
        L33:
            if (r11 != 0) goto L43
        L35:
            r11 = 4
            r11 = r10[r11]
            r2 = -1
            if (r11 != r2) goto L46
            int[] r11 = defpackage.AbstractC8787e.ad
            boolean r11 = defpackage.AbstractC15077e.Signature(r10, r11)
            if (r11 == 0) goto L46
        L43:
            defpackage.AbstractC12797e.billing(r0, r1, r10)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8787e.yandex(int[], int):void");
    }
}
