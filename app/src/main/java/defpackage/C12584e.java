package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12584e extends AbstractC15896e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f25291e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f25292e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f25293e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public MulticastSocket f25294e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Uri f25295e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public InetAddress f25296e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public DatagramSocket f25297e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final DatagramPacket f25298e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f25299e;

    public C12584e() {
        super(true);
        this.f25291e = 8000;
        byte[] bArr = new byte[2000];
        this.f25299e = bArr;
        this.f25298e = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        this.f25295e = null;
        MulticastSocket multicastSocket = this.f25294e;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f25296e;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f25294e = null;
        }
        DatagramSocket datagramSocket = this.f25297e;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f25297e = null;
        }
        this.f25296e = null;
        this.f25292e = 0;
        if (this.f25293e) {
            this.f25293e = false;
            Signature();
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        return this.f25295e;
    }

    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        Uri uri = c2435e.ad;
        this.f25295e = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f25295e.getPort();
        admob();
        try {
            this.f25296e = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f25296e, port);
            if (this.f25296e.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f25294e = multicastSocket;
                multicastSocket.joinGroup(this.f25296e);
                this.f25297e = this.f25294e;
            } else {
                this.f25297e = new DatagramSocket(inetSocketAddress);
            }
            this.f25297e.setSoTimeout(this.f25291e);
            this.f25293e = true;
            subscription(c2435e);
            return -1L;
        } catch (IOException e) {
            throw new C18297e(e, 2001);
        } catch (SecurityException e2) {
            throw new C18297e(e2, 2006);
        }
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f25292e;
        DatagramPacket datagramPacket = this.f25298e;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.f25297e;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f25292e = length;
                mopub(length);
            } catch (SocketTimeoutException e) {
                throw new C18297e(e, 2002);
            } catch (IOException e2) {
                throw new C18297e(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.f25292e;
        int min = Math.min(i4, i2);
        System.arraycopy(this.f25299e, length2 - i4, bArr, i, min);
        this.f25292e -= min;
        return min;
    }
}
