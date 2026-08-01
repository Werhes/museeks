package defpackage;

import java.nio.channels.ServerSocketChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0070e {
    public static final boolean ad;

    static {
        boolean z;
        try {
            Class.forName("java.net.StandardSocketOptions");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        ad = z;
    }

    public static final void ad(ServerSocketChannel serverSocketChannel, C11272e c11272e) {
    }
}
