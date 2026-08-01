package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16059e {
    public static final byte[] adcel;
    public static final C7936e billing;
    public static final byte[] startapp;
    public static final int yandex;
    public boolean ad;
    public int appmetrica;
    public boolean license;
    public int metrica;
    public C2443e purchase;
    public boolean vip;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        billing = new C7936e(2);
        yandex = Math.max(Math.max(Math.max(Math.max(4, 4), 4), 4), 9);
        startapp = new byte[]{88, 105, 110, 103};
        adcel = new byte[]{73, 110, 102, 111};
    }

    public static C16151e ad(C16151e c16151e, C8053e c8053e) {
        if (c8053e.vip == 3) {
            if (c8053e.billing == 3) {
                c16151e.skip(21L);
            } else {
                c16151e.skip(36L);
            }
        } else if (c8053e.billing == 3) {
            c16151e.skip(13L);
        } else {
            c16151e.skip(21L);
        }
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = c16151e.Signature(i);
        }
        if (!Arrays.equals(bArr, startapp) && !Arrays.equals(bArr, adcel)) {
            return null;
        }
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        billing.getClass();
        int i2 = C1724e.ad;
        return c16151e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚٖۗ, java.lang.Object] */
    public static C16059e vip(C16151e c16151e) {
        C7936e c7936e;
        int i;
        ?? obj = new Object();
        obj.ad = false;
        obj.vip = false;
        obj.metrica = -1;
        obj.license = false;
        obj.appmetrica = -1;
        int i2 = yandex;
        byte[] bArr = new byte[i2];
        c16151e.read(bArr, 0, 4);
        byte[] bArr2 = startapp;
        int length = bArr2.length;
        if (length > i2 || length > bArr2.length) {
            StringBuilder premium = AbstractC4653e.premium("a:", i2, " b:");
            premium.append(bArr2.length);
            premium.append(" length:");
            premium.append(length);
            throw new ArrayIndexOutOfBoundsException(premium.toString());
        }
        int i3 = 0;
        while (true) {
            c7936e = billing;
            if (i3 >= length) {
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                c7936e.getClass();
                int i4 = C1724e.ad;
                obj.ad = true;
                break;
            }
            if (bArr[i3] != bArr2[i3]) {
                break;
            }
            i3++;
        }
        Arrays.fill(bArr, (byte) 0);
        c16151e.read(bArr, 0, 4);
        byte b = bArr[3];
        boolean z = (b & 1) != 0;
        boolean z2 = (b & 2) != 0;
        if (z) {
            obj.metrica = c16151e.readInt();
            obj.vip = true;
            i = 12;
        } else {
            i = 8;
        }
        if (z2) {
            obj.appmetrica = c16151e.readInt();
            obj.license = true;
            i += 4;
        }
        if (c16151e.f31731e >= 156) {
            try {
                c16151e.skip(120 - i);
                obj.purchase = C2443e.vip(c16151e, bArr);
                return obj;
            } catch (EOFException unused) {
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i5 = C1724e.ad;
            }
        }
        return obj;
    }

    public final String toString() {
        return "xingheader vbr:" + this.ad + " frameCountEnabled:" + this.vip + " frameCount:" + this.metrica + " audioSizeEnabled:" + this.license + " audioFileSize:" + this.appmetrica;
    }
}
