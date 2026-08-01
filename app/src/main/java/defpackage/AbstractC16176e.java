package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16176e {
    public static final C15768e ad = C15768e.ad(new byte[0]);

    public static final C15768e ad(int i) {
        return C15768e.ad(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final C15768e vip(int i) {
        return C15768e.ad(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
