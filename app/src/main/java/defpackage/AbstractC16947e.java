package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16947e {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:10:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object ad(defpackage.C14718e r6, defpackage.AbstractC9049e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C17567e
            if (r0 == 0) goto L13
            r0 = r7
            eً٘ؗ r0 = (defpackage.C17567e) r0
            int r1 = r0.f34413e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34413e = r1
            goto L18
        L13:
            eً٘ؗ r0 = new eً٘ؗ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34411e
            int r1 = r0.f34413e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eِٔٔ r6 = r0.f34412e
            defpackage.AbstractC2003e.purchase(r7)
            goto L3f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.AbstractC2003e.purchase(r7)
        L32:
            r0.f34412e = r6
            r0.f34413e = r2
            java.lang.Object r7 = defpackage.AbstractC10257e.vip(r6, r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r7 != r1) goto L3f
            return r1
        L3f:
            eؔٓؔ r7 = (defpackage.C2561e) r7
            int r1 = r7.license
            java.lang.Object r7 = r7.ad
            r1 = r1 & 66
            if (r1 == 0) goto L32
            int r1 = r7.size()
            r3 = 0
            r4 = r3
        L4f:
            if (r4 >= r1) goto L61
            java.lang.Object r5 = r7.get(r4)
            eؘؔٞ r5 = (defpackage.C2401e) r5
            boolean r5 = defpackage.AbstractC17957e.vip(r5)
            if (r5 != 0) goto L5e
            goto L32
        L5e:
            int r4 = r4 + 1
            goto L4f
        L61:
            java.lang.Object r6 = r7.get(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16947e.ad(eِٔٔ, eٌۡۖ):java.lang.Object");
    }

    public static byte[] advert(int i, long j) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>>= 8;
        }
        return bArr;
    }

    public static byte[][] appmetrica(byte[][] bArr) {
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                }
            }
            byte[][] bArr3 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                byte[] bArr4 = new byte[bArr[i].length];
                bArr3[i] = bArr4;
                byte[] bArr5 = bArr[i];
                System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            }
            return bArr3;
        }
        throw new NullPointerException("in has null pointers");
    }

    public static Object billing(byte[] bArr, Class cls) {
        C5620e c5620e = new C5620e(cls, new ByteArrayInputStream(bArr));
        Object readObject = c5620e.readObject();
        if (c5620e.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        }
        if (cls.isInstance(readObject)) {
            return readObject;
        }
        throw new IOException("unexpected class found in ObjectInputStream");
    }

    public static byte[] license(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static long metrica(int i, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static void mopub(Metadata metadata) {
        String[] d1 = metadata.d1();
        if (d1.length == 0) {
            d1 = null;
        }
        if (d1 == null) {
            throw new IllegalArgumentException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null);
        }
        C6571e startapp = C13814e.startapp(d1, metadata.d2());
        C6746e c6746e = (C6746e) startapp.f13544e;
        C14882e c14882e = (C14882e) startapp.f13543e;
        boolean z = new C9400e(metadata.mv()).compareTo(new C9400e(1, 4, 0)) < 0;
        C11106e c11106e = new C11106e(12);
        C17221e c17221e = new C17221e(c14882e.f29484e);
        C5311e c5311e = C5311e.vip;
        C2254e c2254e = new C2254e(c6746e, c17221e, AbstractC2206e.vip(c14882e.f29481e), z, C13664e.f27089e, 16);
        AbstractC17673e.admob(c11106e, c14882e.f29482e, c14882e.f29477e, c14882e.f29485e, c2254e);
        Iterator it = ((List) c2254e.f5735e).iterator();
        while (it.hasNext()) {
            ((C9484e) ((InterfaceC14256e) it.next())).getClass();
            C6860e c6860e = (C6860e) ((InterfaceC8554e) C14155e.appmetrica((ArrayList) c11106e.f22006e, C6860e.vip));
            Iterator it2 = ((List) c14882e.mopub(AbstractC5745e.advert)).iterator();
            while (it2.hasNext()) {
                c6860e.ad.add(AbstractC17673e.smaato((C17485e) it2.next(), c2254e));
            }
            Integer num = (Integer) AbstractC0863e.appmetrica(c14882e, AbstractC5745e.mopub);
            if (num != null) {
                ((InterfaceC11824e) c2254e.f5736e).getString(num.intValue());
            }
        }
    }

    public static void purchase(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null) {
            throw new NullPointerException("src == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr[i + i2] = bArr2[i2];
        }
    }

    public static boolean startapp(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static final void vip(C4017e c4017e, float f, long j, float f2, float f3, C13121e c13121e, long j2) {
        float min = Math.min(c13121e.ad, c4017e.mo497instanceof(f2));
        float f4 = c13121e.ad;
        int i = (int) (j >> 32);
        float intBitsToFloat = (Float.intBitsToFloat(i) - min) - (min == f4 ? 0.0f : f4 / 4.0f);
        float intBitsToFloat2 = (Float.intBitsToFloat(i) * f) + f3;
        if (intBitsToFloat <= intBitsToFloat2) {
            min = Math.max(0.0f, min - (intBitsToFloat2 - intBitsToFloat));
            intBitsToFloat = intBitsToFloat2;
        }
        if (min > 0.0f) {
            if (c13121e.metrica == 1) {
                AbstractC4653e.mopub(c4017e, j2, min / 2.0f, (Float.floatToRawIntBits(intBitsToFloat + r1) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f) & 4294967295L), null, 120);
            } else {
                AbstractC4653e.subscription(c4017e, j2, (Float.floatToRawIntBits((Float.intBitsToFloat((int) (j & 4294967295L)) - min) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & 4294967295L), 0.0f, null, null, 0, 120);
            }
        }
    }

    public static byte[] yandex(int i, int i2, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = bArr[i + i3];
        }
        return bArr2;
    }

    public abstract Object adcel();
}
