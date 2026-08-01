package defpackage;

import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8689e extends AbstractC5904e implements InterfaceC16292e {

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final SocketChannel f17531e;

    public C8689e(SocketChannel socketChannel, C4510e c4510e) {
        super(c4510e);
        this.f17531e = socketChannel;
        if (socketChannel.isBlocking()) {
            throw new IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
    }

    @Override // defpackage.InterfaceC18519e
    public final SelectableChannel adcel() {
        return this.f17531e;
    }

    /* renamed from: break, reason: not valid java name */
    public final AbstractC10075e m2464break() {
        boolean z = AbstractC0070e.ad;
        SocketChannel socketChannel = this.f17531e;
        SocketAddress localAddress = z ? socketChannel.getLocalAddress() : socketChannel.socket().getLocalSocketAddress();
        if (localAddress != null) {
            return AbstractC17113e.license(localAddress);
        }
        throw new IllegalStateException("Channel is not yet bound");
    }

    /* renamed from: implements, reason: not valid java name */
    public final AbstractC10075e m2465implements() {
        boolean z = AbstractC0070e.ad;
        SocketChannel socketChannel = this.f17531e;
        SocketAddress remoteAddress = z ? socketChannel.getRemoteAddress() : socketChannel.socket().getRemoteSocketAddress();
        if (remoteAddress != null) {
            return AbstractC17113e.license(remoteAddress);
        }
        throw new IllegalStateException("Channel is not yet connected");
    }
}
