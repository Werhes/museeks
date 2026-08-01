package defpackage;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؑؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0221e {
    public final String ad;
    public static final String vip = AbstractC6494e.Signature(UUID.randomUUID().toString() + System.currentTimeMillis());
    public static final AtomicLong metrica = new AtomicLong(0);

    public C0221e() {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte b = array[0];
        byte b2 = array[1];
        byte b3 = array[2];
        byte b4 = array[3];
        byte[] ad = ad(time % 1000);
        byte b5 = ad[0];
        byte b6 = ad[1];
        byte[] ad2 = ad(metrica.incrementAndGet());
        byte b7 = ad2[0];
        byte b8 = ad2[1];
        byte[] ad3 = ad(Integer.valueOf(Process.myPid()).shortValue());
        String advert = AbstractC6494e.advert(new byte[]{b, b2, b3, b4, b5, b6, b7, b8, ad3[0], ad3[1]});
        Locale locale = Locale.US;
        this.ad = String.format(locale, "%s%s%s%s", advert.substring(0, 12), advert.substring(12, 16), advert.subSequence(16, 20), vip.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] ad(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return this.ad;
    }
}
