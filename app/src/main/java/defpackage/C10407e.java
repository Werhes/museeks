package defpackage;

import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٝٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10407e extends AbstractC12898e implements InterfaceC0148e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C4510e f20566e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ServerSocketChannel f20567e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C6799e f20568e;

    public C10407e(ServerSocketChannel serverSocketChannel, C4510e c4510e) {
        this.f20567e = serverSocketChannel;
        this.f20566e = c4510e;
        if (serverSocketChannel.isBlocking()) {
            throw new IllegalArgumentException("Channel need to be configured as non-blocking.");
        }
        this.f20568e = AbstractC6629e.ad();
    }

    @Override // defpackage.AbstractC12898e, defpackage.InterfaceC1232e
    public final void ad() {
        try {
            close();
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.InterfaceC18519e
    public final SelectableChannel adcel() {
        return this.f20567e;
    }

    public final C8689e ads(SocketChannel socketChannel) {
        Signature(EnumC16368e.f32163e, false);
        socketChannel.configureBlocking(false);
        if (subs() instanceof C16123e) {
            if (AbstractC0070e.ad) {
                socketChannel.setOption((SocketOption<SocketOption>) StandardSocketOptions.TCP_NODELAY, (SocketOption) Boolean.TRUE);
            } else {
                socketChannel.socket().setTcpNoDelay(true);
            }
        }
        return new C8689e(socketChannel, this.f20566e);
    }

    @Override // defpackage.AbstractC12898e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C6799e c6799e = this.f20568e;
        C4510e c4510e = this.f20566e;
        try {
            try {
                this.f20567e.close();
                c4510e.crashlytics(this);
                c6799e.m2245e();
            } catch (Throwable th) {
                c4510e.crashlytics(this);
                throw th;
            }
        } catch (Throwable th2) {
            c6799e.m2244e(th2);
        }
    }

    @Override // defpackage.Ctransient
    /* renamed from: eُؚٕ */
    public final C6799e mo2773e() {
        return this.f20568e;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003f -> B:10:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isVip(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C2265e
            if (r0 == 0) goto L13
            r0 = r5
            eؓۨ٘ r0 = (defpackage.C2265e) r0
            int r1 = r0.f5752e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5752e = r1
            goto L18
        L13:
            eؓۨ٘ r0 = new eؓۨ٘
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f5751e
            int r1 = r0.f5752e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L42
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
        L30:
            eٍٖٝ r5 = defpackage.EnumC16368e.f32163e
            r4.Signature(r5, r2)
            r0.f5752e = r2
            eؖۦٟ r1 = r4.f20566e
            java.lang.Object r5 = r1.m1636protected(r4, r5, r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r5 != r1) goto L42
            return r1
        L42:
            java.nio.channels.ServerSocketChannel r5 = r4.f20567e
            java.nio.channels.SocketChannel r5 = r5.accept()
            if (r5 == 0) goto L30
            eٌٌٔ r5 = r4.ads(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10407e.isVip(eُؑ۠):java.lang.Object");
    }

    public final AbstractC10075e subs() {
        boolean z = AbstractC0070e.ad;
        ServerSocketChannel serverSocketChannel = this.f20567e;
        return AbstractC17113e.license(z ? serverSocketChannel.getLocalAddress() : serverSocketChannel.socket().getLocalSocketAddress());
    }
}
