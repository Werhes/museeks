package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11040e {
    public final int ad;
    public final byte[] license;
    public final long metrica;
    public final int vip;

    public C11040e(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }

    public C11040e(long j, byte[] bArr, int i, int i2) {
        this.ad = i;
        this.vip = i2;
        this.metrica = j;
        this.license = bArr;
    }

    public static C11040e ad(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(C0490e.f2563protected);
        return new C11040e(2, bytes.length, bytes);
    }

    public static C11040e license(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0490e.f2558class[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i2 : iArr) {
            wrap.putShort((short) i2);
        }
        return new C11040e(3, iArr.length, wrap.array());
    }

    public static C11040e metrica(C8742e[] c8742eArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0490e.f2558class[5] * c8742eArr.length]);
        wrap.order(byteOrder);
        for (C8742e c8742e : c8742eArr) {
            wrap.putInt((int) c8742e.ad);
            wrap.putInt((int) c8742e.vip);
        }
        return new C11040e(5, c8742eArr.length, wrap.array());
    }

    public static C11040e vip(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C0490e.f2558class[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j2 : jArr) {
            wrap.putInt((int) j2);
        }
        return new C11040e(4, jArr.length, wrap.array());
    }

    public final double appmetrica(ByteOrder byteOrder) {
        Object yandex = yandex(byteOrder);
        if (yandex == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (yandex instanceof String) {
            return Double.parseDouble((String) yandex);
        }
        if (yandex instanceof long[]) {
            if (((long[]) yandex).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (yandex instanceof int[]) {
            if (((int[]) yandex).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (yandex instanceof double[]) {
            double[] dArr = (double[]) yandex;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(yandex instanceof C8742e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C8742e[] c8742eArr = (C8742e[]) yandex;
        if (c8742eArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C8742e c8742e = c8742eArr[0];
        return c8742e.ad / c8742e.vip;
    }

    public final String billing(ByteOrder byteOrder) {
        Object yandex = yandex(byteOrder);
        if (yandex == null) {
            return null;
        }
        if (yandex instanceof String) {
            return (String) yandex;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (yandex instanceof long[]) {
            long[] jArr = (long[]) yandex;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (yandex instanceof int[]) {
            int[] iArr = (int[]) yandex;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (yandex instanceof double[]) {
            double[] dArr = (double[]) yandex;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(yandex instanceof C8742e[])) {
            return null;
        }
        C8742e[] c8742eArr = (C8742e[]) yandex;
        while (i < c8742eArr.length) {
            sb.append(c8742eArr[i].ad);
            sb.append('/');
            sb.append(c8742eArr[i].vip);
            i++;
            if (i != c8742eArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final int purchase(ByteOrder byteOrder) {
        Object yandex = yandex(byteOrder);
        if (yandex == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (yandex instanceof String) {
            return Integer.parseInt((String) yandex);
        }
        if (yandex instanceof long[]) {
            long[] jArr = (long[]) yandex;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(yandex instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) yandex;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C0490e.firebase[this.ad]);
        sb.append(", data length:");
        return AbstractC17861e.smaato(this.license.length, ")", sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:100:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
    /* JADX WARN: Type inference failed for: r14v25, types: [eٌؚٗ[]] */
    /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
    /* JADX WARN: Type inference failed for: r14v28, types: [eٌؚٗ[]] */
    /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable yandex(java.nio.ByteOrder r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11040e.yandex(java.nio.ByteOrder):java.io.Serializable");
    }
}
