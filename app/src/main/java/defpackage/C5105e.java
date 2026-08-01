package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5105e extends AbstractC9288e {
    public int[] adcel;
    public int[] startapp;

    @Override // defpackage.AbstractC9288e
    public final C10348e ad(C10348e c10348e) {
        int i = c10348e.metrica;
        int[] iArr = this.startapp;
        if (iArr == null) {
            return C10348e.appmetrica;
        }
        int i2 = c10348e.vip;
        if (!AbstractC9413e.m2572try(i)) {
            throw new C6721e(c10348e);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new C6721e("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", c10348e);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new C10348e(c10348e.ad, iArr.length, i) : C10348e.appmetrica;
    }

    @Override // defpackage.InterfaceC9018e
    public final void adcel(ByteBuffer byteBuffer) {
        int[] iArr = this.adcel;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer appmetrica = appmetrica(((limit - position) / this.vip.license) * this.metrica.license);
        while (position < limit) {
            for (int i : iArr) {
                int tapsense = (AbstractC9413e.tapsense(this.vip.metrica) * i) + position;
                int i2 = this.vip.metrica;
                if (i2 != 2) {
                    if (i2 == 3) {
                        appmetrica.put(byteBuffer.get(tapsense));
                    } else if (i2 != 4) {
                        if (i2 != 21) {
                            if (i2 != 22) {
                                if (i2 != 268435456) {
                                    if (i2 != 1342177280) {
                                        if (i2 != 1610612736) {
                                            if (i2 != 1879048192) {
                                                throw new IllegalStateException("Unexpected encoding: " + this.vip.metrica);
                                            }
                                            appmetrica.putDouble(byteBuffer.getDouble(tapsense));
                                        }
                                    }
                                }
                            }
                            appmetrica.putInt(byteBuffer.getInt(tapsense));
                        }
                        ByteOrder order = byteBuffer.order();
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        byte b = byteBuffer.get(order == byteOrder ? tapsense : tapsense + 2);
                        byte b2 = byteBuffer.get(tapsense + 1);
                        if (byteBuffer.order() == byteOrder) {
                            tapsense += 2;
                        }
                        int i3 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(tapsense) << 8) & 65280)) >> 8;
                        AbstractC2301e.startapp((i3 & (-16777216)) == 0 || (i3 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: %s", Integer.toHexString(i3));
                        AbstractC2301e.billing(appmetrica.remaining() >= 3);
                        appmetrica.put((byte) (appmetrica.order() == byteOrder ? (i3 & 16711680) >> 16 : i3 & 255)).put((byte) ((i3 & 65280) >> 8)).put((byte) (appmetrica.order() == byteOrder ? i3 & 255 : (i3 & 16711680) >> 16));
                    } else {
                        appmetrica.putFloat(byteBuffer.getFloat(tapsense));
                    }
                }
                appmetrica.putShort(byteBuffer.getShort(tapsense));
            }
            position += this.vip.license;
        }
        byteBuffer.position(limit);
        appmetrica.flip();
    }

    @Override // defpackage.AbstractC9288e
    public final void license() {
        this.adcel = null;
        this.startapp = null;
    }

    @Override // defpackage.AbstractC9288e
    public final void vip() {
        this.adcel = this.startapp;
    }
}
