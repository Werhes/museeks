package defpackage;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۤٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16614e extends AbstractC16225e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C7936e f32565e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final byte[] f32566e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final Pattern f32567e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f32565e = new C7936e(2);
        f32567e = Pattern.compile("\\x00");
        f32566e = new byte[]{84, 65, 71};
    }

    public final void signatures(RandomAccessFile randomAccessFile) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f32565e;
        c7936e.getClass();
        int i = C1724e.ad;
        FileChannel channel = randomAccessFile.getChannel();
        if (randomAccessFile.length() < 128) {
            throw new IOException("File not not appear large enough to contain a tag");
        }
        channel.position(randomAccessFile.length() - 128);
        ByteBuffer allocate = ByteBuffer.allocate(128);
        channel.read(allocate);
        allocate.rewind();
        byte[] bArr = new byte[3];
        allocate.get(bArr, 0, 3);
        if (!Arrays.equals(bArr, f32566e)) {
            c7936e.getClass();
            return;
        }
        try {
            c7936e.getClass();
            randomAccessFile.setLength(randomAccessFile.length() - 128);
        } catch (IOException unused) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
        }
    }
}
