package defpackage;

import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2835e {
    public static WeakReference startapp;
    public static final C2892e ad = new C2892e(-35213891, false, new C8898e(3));
    public static final C2892e vip = new C2892e(-92360419, false, new C8898e(4));
    public static final C2892e metrica = new C2892e(-1979104442, false, new C8898e(5));
    public static final C2892e license = new C2892e(824577643, false, new C8898e(6));
    public static final C2892e appmetrica = new C2892e(2116377326, false, new C8898e(7));
    public static final C2892e purchase = new C2892e(1115321455, false, new C8898e(8));
    public static final C2892e billing = new C2892e(-1955982025, false, new C14123e(28));
    public static final C2892e yandex = new C2892e(1413791982, false, new C14123e(29));

    public static final long ad(long j, long j2, float f) {
        return C15765e.vip(f, (float) 0) ? j : AbstractC6532e.billing(C3618e.vip(((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f, j), j2);
    }

    public static void metrica(int i, ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + Math.min(byteBuffer.remaining(), i));
    }

    public static final boolean vip(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }
}
