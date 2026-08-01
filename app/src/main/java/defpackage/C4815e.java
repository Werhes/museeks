package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌِؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C4815e extends InputStream implements DataInput {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f10259e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public ByteOrder f10260e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f10261e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public byte[] f10262e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final DataInputStream f10263e;

    public C4815e(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public C4815e(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f10263e = dataInputStream;
        dataInputStream.mark(0);
        this.f10261e = 0;
        this.f10260e = byteOrder;
        this.f10259e = inputStream instanceof C4815e ? ((C4815e) inputStream).f10259e : -1;
    }

    public C4815e(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f10259e = bArr.length;
    }

    public final void ad(int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.f10263e;
            int skip = (int) dataInputStream.skip(i3);
            if (skip <= 0) {
                if (this.f10262e == null) {
                    this.f10262e = new byte[8192];
                }
                skip = dataInputStream.read(this.f10262e, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException(AbstractC1634e.smaato("Reached EOF while skipping ", i, " bytes."));
                }
            }
            i2 += skip;
        }
        this.f10261e += i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f10263e.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f10261e++;
        return this.f10263e.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.f10263e.read(bArr, i, i2);
        this.f10261e += read;
        return read;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f10261e++;
        return this.f10263e.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f10261e++;
        int read = this.f10263e.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f10261e += 2;
        return this.f10263e.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f10261e += bArr.length;
        this.f10263e.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.f10261e += i2;
        this.f10263e.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f10261e += 4;
        DataInputStream dataInputStream = this.f10263e;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10260e;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f10260e);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j;
        long j2;
        this.f10261e += 8;
        DataInputStream dataInputStream = this.f10263e;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10260e;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j2 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f10260e);
            }
            j = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j2 = read8;
        }
        return j + j2;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f10261e += 2;
        DataInputStream dataInputStream = this.f10263e;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10260e;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f10260e);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f10261e += 2;
        return this.f10263e.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f10261e++;
        return this.f10263e.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f10261e += 2;
        DataInputStream dataInputStream = this.f10263e;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10260e;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f10260e);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }
}
