package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۡؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4426e extends SSLSocketFactory {
    public final /* synthetic */ C4159e ad;

    public C4426e(C4159e c4159e) {
        this.ad = c4159e;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return this.ad.metrica().vip().createSocket();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return this.ad.metrica().vip().createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return this.ad.metrica().vip().createSocket(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return this.ad.metrica().vip().createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return this.ad.metrica().vip().createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return this.ad.metrica().vip().createSocket(socket, str, i, z);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.ad.metrica().vip().getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.ad.metrica().vip().getSupportedCipherSuites();
    }
}
