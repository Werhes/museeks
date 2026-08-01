package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۘٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7404e extends InputStream {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f15168e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15169e;

    public /* synthetic */ C7404e(int i, Object obj) {
        this.f15169e = i;
        this.f15168e = obj;
    }

    public C7404e(C4734e c4734e, AbstractC3513e abstractC3513e) {
        this.f15169e = 6;
        this.f15168e = abstractC3513e;
    }

    public C7404e(RandomAccessFile randomAccessFile) {
        this.f15169e = 3;
        this.f15168e = randomAccessFile;
    }

    private final void ad() {
    }

    @Override // java.io.InputStream
    public int available() {
        switch (this.f15169e) {
            case 1:
                return (int) Math.min(((C16151e) this.f15168e).f31731e, Alert.DURATION_SHOW_INDEFINITELY);
            case 2:
                return ((C7404e) this.f15168e).available();
            case 3:
            default:
                return super.available();
            case 4:
                C13197e c13197e = (C13197e) this.f15168e;
                if (c13197e.f26203e) {
                    throw new IOException("closed");
                }
                return (int) Math.min(c13197e.f26204e.f31731e, Alert.DURATION_SHOW_INDEFINITELY);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f15169e) {
            case 0:
                AbstractC2223e.ad((InterfaceC13033e) this.f15168e);
                return;
            case 1:
                return;
            case 2:
                super.close();
                ((C7404e) this.f15168e).close();
                return;
            case 3:
            default:
                super.close();
                return;
            case 4:
                ((C13197e) this.f15168e).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.f15169e) {
            case 0:
                InterfaceC13033e interfaceC13033e = (InterfaceC13033e) this.f15168e;
                if (!interfaceC13033e.yandex()) {
                    if (interfaceC13033e.billing().yandex()) {
                        AbstractC5336e.yandex(C2693e.f6576e, new C15238e(interfaceC13033e, null, 9));
                    }
                    if (!interfaceC13033e.yandex()) {
                        return interfaceC13033e.billing().readByte() & 255;
                    }
                }
                return -1;
            case 1:
                C16151e c16151e = (C16151e) this.f15168e;
                if (c16151e.f31731e > 0) {
                    return c16151e.readByte() & 255;
                }
                return -1;
            case 2:
                return ((C7404e) this.f15168e).read();
            case 3:
                return ((RandomAccessFile) this.f15168e).read();
            case 4:
                C13197e c13197e = (C13197e) this.f15168e;
                C16151e c16151e2 = c13197e.f26204e;
                if (c13197e.f26203e) {
                    throw new IOException("closed");
                }
                if (c16151e2.f31731e == 0 && c13197e.f26205e.signatures(c16151e2, 8192L) == -1) {
                    return -1;
                }
                return c16151e2.readByte() & 255;
            case 5:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((AbstractC3513e) this.f15168e).firebase(0, 1, bArr2) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.f15169e) {
            case 0:
                InterfaceC13033e interfaceC13033e = (InterfaceC13033e) this.f15168e;
                if (!interfaceC13033e.yandex()) {
                    if (interfaceC13033e.billing().yandex()) {
                        AbstractC5336e.yandex(C2693e.f6576e, new C15238e(interfaceC13033e, null, 9));
                    }
                    C12402e billing = interfaceC13033e.billing();
                    billing.getClass();
                    int mo1230e = interfaceC13033e.billing().mo1230e(i, Math.min((int) billing.f24832e, i2) + i, bArr);
                    if (mo1230e >= 0) {
                        return mo1230e;
                    }
                    if (!interfaceC13033e.yandex()) {
                        return 0;
                    }
                }
                return -1;
            case 1:
                return ((C16151e) this.f15168e).read(bArr, i, i2);
            case 2:
                return ((C7404e) this.f15168e).read(bArr, i, i2);
            case 3:
                return ((RandomAccessFile) this.f15168e).read(bArr, i, i2);
            case 4:
                C13197e c13197e = (C13197e) this.f15168e;
                C16151e c16151e = c13197e.f26204e;
                if (c13197e.f26203e) {
                    throw new IOException("closed");
                }
                AbstractC7844e.startapp(bArr.length, i, i2);
                if (c16151e.f31731e == 0 && c13197e.f26205e.signatures(c16151e, 8192L) == -1) {
                    return -1;
                }
                return c16151e.read(bArr, i, i2);
            case 5:
                C4734e c4734e = (C4734e) this.f15168e;
                try {
                    int inflate = ((Inflater) c4734e.f10118e).inflate(bArr, i, i2);
                    if (inflate > 0) {
                        return inflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (((Inflater) c4734e.f10118e).getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = ((Inflater) c4734e.f10118e).getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((AbstractC3513e) this.f15168e).firebase(i, i2, bArr);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.f15169e) {
            case 3:
                RandomAccessFile randomAccessFile = (RandomAccessFile) this.f15168e;
                if (j < 0) {
                    throw new IllegalArgumentException("invalid negative value");
                }
                while (j > 2147483647L) {
                    randomAccessFile.skipBytes(Alert.DURATION_SHOW_INDEFINITELY);
                    j -= 2147483647L;
                }
                return randomAccessFile.skipBytes((int) j);
            case 6:
                if (j <= 0) {
                    return 0L;
                }
                int i = j > 2147483647L ? Alert.DURATION_SHOW_INDEFINITELY : (int) j;
                ((AbstractC3513e) this.f15168e).mo625class(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        switch (this.f15169e) {
            case 1:
                return ((C16151e) this.f15168e) + ".inputStream()";
            case 4:
                return ((C13197e) this.f15168e) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) {
        switch (this.f15169e) {
            case 4:
                C13197e c13197e = (C13197e) this.f15168e;
                C16151e c16151e = c13197e.f26204e;
                if (c13197e.f26203e) {
                    throw new IOException("closed");
                }
                long j = 0;
                long j2 = 0;
                while (true) {
                    if (c16151e.f31731e == j && c13197e.f26205e.signatures(c16151e, 8192L) == -1) {
                        return j2;
                    }
                    long j3 = c16151e.f31731e;
                    j2 += j3;
                    AbstractC7844e.startapp(j3, 0L, j3);
                    C16592e c16592e = c16151e.f31732e;
                    while (j3 > j) {
                        int min = (int) Math.min(j3, c16592e.metrica - c16592e.vip);
                        outputStream.write(c16592e.ad, c16592e.vip, min);
                        int i = c16592e.vip + min;
                        c16592e.vip = i;
                        long j4 = min;
                        c16151e.f31731e -= j4;
                        j3 -= j4;
                        if (i == c16592e.metrica) {
                            C16592e ad = c16592e.ad();
                            c16151e.f31732e = ad;
                            AbstractC11279e.ad(c16592e);
                            c16592e = ad;
                        }
                        j = 0;
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }
}
