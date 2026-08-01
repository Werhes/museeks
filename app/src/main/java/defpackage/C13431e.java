package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13431e implements Closeable {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Logger f26695e = Logger.getLogger(C13431e.class.getName());

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C12434e f26696e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f26697e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f26698e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C12434e f26699e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final RandomAccessFile f26700e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f26701e;

    public C13431e(File file) {
        byte[] bArr = new byte[16];
        this.f26701e = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    m3558protected(i, iArr[i2], bArr2);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f26700e = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int isVip = isVip(0, bArr);
        this.f26698e = isVip;
        if (isVip > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f26698e + ", Actual length: " + randomAccessFile2.length());
        }
        this.f26697e = isVip(4, bArr);
        int isVip2 = isVip(8, bArr);
        int isVip3 = isVip(12, bArr);
        this.f26699e = Signature(isVip2);
        this.f26696e = Signature(isVip3);
    }

    public static int isVip(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: protected, reason: not valid java name */
    public static void m3558protected(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public final C12434e Signature(int i) {
        if (i == 0) {
            return C12434e.f24872e;
        }
        RandomAccessFile randomAccessFile = this.f26700e;
        randomAccessFile.seek(i);
        return new C12434e(i, randomAccessFile.readInt(), 0);
    }

    public final void ad(byte[] bArr) {
        int m3560goto;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    purchase(length);
                    boolean loadAd = loadAd();
                    if (loadAd) {
                        m3560goto = 16;
                    } else {
                        C12434e c12434e = this.f26696e;
                        m3560goto = m3560goto(c12434e.f24874e + 4 + c12434e.f24873e);
                    }
                    C12434e c12434e2 = new C12434e(m3560goto, length, 0);
                    m3558protected(0, length, this.f26701e);
                    subs(m3560goto, 4, this.f26701e);
                    subs(m3560goto + 4, length, bArr);
                    m3559extends(this.f26698e, this.f26697e + 1, loadAd ? m3560goto : this.f26699e.f24874e, m3560goto);
                    this.f26696e = c12434e2;
                    this.f26697e++;
                    if (loadAd) {
                        this.f26699e = c12434e2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void ads(int i, int i2, int i3, byte[] bArr) {
        int m3560goto = m3560goto(i);
        int i4 = m3560goto + i3;
        int i5 = this.f26698e;
        RandomAccessFile randomAccessFile = this.f26700e;
        if (i4 <= i5) {
            randomAccessFile.seek(m3560goto);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - m3560goto;
        randomAccessFile.seek(m3560goto);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final synchronized void advert(InterfaceC9250e interfaceC9250e) {
        int i = this.f26699e.f24874e;
        for (int i2 = 0; i2 < this.f26697e; i2++) {
            C12434e Signature = Signature(i);
            interfaceC9250e.vip(new C16756e(this, Signature), Signature.f24873e);
            i = m3560goto(Signature.f24874e + 4 + Signature.f24873e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f26700e.close();
    }

    public final int crashlytics() {
        if (this.f26697e == 0) {
            return 16;
        }
        C12434e c12434e = this.f26696e;
        int i = c12434e.f24874e;
        int i2 = this.f26699e.f24874e;
        return i >= i2 ? (i - i2) + 4 + c12434e.f24873e + 16 : (((i + 4) + c12434e.f24873e) + this.f26698e) - i2;
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m3559extends(int i, int i2, int i3, int i4) {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f26701e;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.f26700e;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                m3558protected(i6, iArr[i5], bArr);
                i6 += 4;
                i5++;
            }
        }
    }

    /* renamed from: goto, reason: not valid java name */
    public final int m3560goto(int i) {
        int i2 = this.f26698e;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final synchronized void inmobi() {
        try {
            if (loadAd()) {
                throw new NoSuchElementException();
            }
            if (this.f26697e == 1) {
                license();
            } else {
                C12434e c12434e = this.f26699e;
                int m3560goto = m3560goto(c12434e.f24874e + 4 + c12434e.f24873e);
                ads(m3560goto, 0, 4, this.f26701e);
                int isVip = isVip(0, this.f26701e);
                m3559extends(this.f26698e, this.f26697e - 1, m3560goto, this.f26696e.f24874e);
                this.f26697e--;
                this.f26699e = new C12434e(m3560goto, isVip, 0);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void license() {
        m3559extends(4096, 0, 0, 0);
        this.f26697e = 0;
        C12434e c12434e = C12434e.f24872e;
        this.f26699e = c12434e;
        this.f26696e = c12434e;
        if (this.f26698e > 4096) {
            RandomAccessFile randomAccessFile = this.f26700e;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f26698e = 4096;
    }

    public final synchronized boolean loadAd() {
        return this.f26697e == 0;
    }

    public final void purchase(int i) {
        int i2 = i + 4;
        int crashlytics = this.f26698e - crashlytics();
        if (crashlytics >= i2) {
            return;
        }
        int i3 = this.f26698e;
        do {
            crashlytics += i3;
            i3 <<= 1;
        } while (crashlytics < i2);
        RandomAccessFile randomAccessFile = this.f26700e;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        C12434e c12434e = this.f26696e;
        int m3560goto = m3560goto(c12434e.f24874e + 4 + c12434e.f24873e);
        if (m3560goto < this.f26699e.f24874e) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f26698e);
            long j = m3560goto - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f26696e.f24874e;
        int i5 = this.f26699e.f24874e;
        if (i4 < i5) {
            int i6 = (this.f26698e + i4) - 16;
            m3559extends(i3, this.f26697e, i5, i6);
            this.f26696e = new C12434e(i6, this.f26696e.f24873e, 0);
        } else {
            m3559extends(i3, this.f26697e, i5, i4);
        }
        this.f26698e = i3;
    }

    public final void subs(int i, int i2, byte[] bArr) {
        int m3560goto = m3560goto(i);
        int i3 = m3560goto + i2;
        int i4 = this.f26698e;
        RandomAccessFile randomAccessFile = this.f26700e;
        if (i3 <= i4) {
            randomAccessFile.seek(m3560goto);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - m3560goto;
        randomAccessFile.seek(m3560goto);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C13431e.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.f26698e);
        sb.append(", size=");
        sb.append(this.f26697e);
        sb.append(", first=");
        sb.append(this.f26699e);
        sb.append(", last=");
        sb.append(this.f26696e);
        sb.append(", element lengths=[");
        try {
            advert(new C16722e((Object) sb, 8, false));
        } catch (IOException e) {
            f26695e.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
