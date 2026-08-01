package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15345e extends AbstractC9288e {
    public static final int startapp = Float.floatToIntBits(Float.NaN);

    public static void amazon(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == startapp) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.AbstractC9288e
    public final C10348e ad(C10348e c10348e) {
        int i = c10348e.metrica;
        if (AbstractC9413e.m2573while(i) || i == 2) {
            return i != 4 ? new C10348e(c10348e.ad, c10348e.vip, 4) : C10348e.appmetrica;
        }
        throw new C6721e(c10348e);
    }

    @Override // defpackage.InterfaceC9018e
    public final void adcel(ByteBuffer byteBuffer) {
        ByteBuffer appmetrica;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.vip.metrica;
        if (i2 == 2) {
            appmetrica = appmetrica(i * 2);
            while (position < limit) {
                amazon(((byteBuffer.get(position) & 255) << 16) | ((byteBuffer.get(position + 1) & 255) << 24), appmetrica);
                position += 2;
            }
        } else if (i2 == 1342177280) {
            appmetrica = appmetrica((i / 3) * 4);
            while (position < limit) {
                amazon(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), appmetrica);
                position += 3;
            }
        } else if (i2 == 1610612736) {
            appmetrica = appmetrica(i);
            while (position < limit) {
                amazon((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), appmetrica);
                position += 4;
            }
        } else if (i2 == 1879048192) {
            appmetrica = appmetrica(i / 2);
            while (position < limit) {
                appmetrica.putFloat((float) byteBuffer.getDouble(position));
                position += 8;
            }
        } else if (i2 == 21) {
            appmetrica = appmetrica((i / 3) * 4);
            while (position < limit) {
                amazon(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), appmetrica);
                position += 3;
            }
        } else {
            if (i2 != 22) {
                throw new IllegalStateException();
            }
            appmetrica = appmetrica(i);
            while (position < limit) {
                amazon((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), appmetrica);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        appmetrica.flip();
    }
}
