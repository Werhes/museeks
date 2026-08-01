package defpackage;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٞٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1983e {
    public static final C7936e ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        ad = new C7936e(2);
    }

    public static void ad(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                FileChannel channel = fileInputStream.getChannel();
                FileChannel channel2 = fileOutputStream.getChannel();
                long size = channel.size();
                for (long j = 0; j < size; j += channel.transferTo(j, 1048576L, channel2)) {
                }
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static String adcel(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        return new String(bArr, AbstractC4639e.vip);
    }

    public static int advert(DataInputStream dataInputStream) {
        byte[] bArr = {0, 0, 0, 0};
        dataInputStream.readFully(bArr, 2, 2);
        return ByteBuffer.wrap(bArr).getInt();
    }

    public static boolean amazon(File file, File file2) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        file.getAbsolutePath();
        file2.getAbsolutePath();
        C7936e c7936e = ad;
        c7936e.getClass();
        int i = C1724e.ad;
        if (file2.exists()) {
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            return false;
        }
        if (file.renameTo(file2)) {
            return true;
        }
        try {
            ad(file, file2);
            if (file.delete()) {
                return true;
            }
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            file2.delete();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static byte[] appmetrica(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static String billing(ByteBuffer byteBuffer, int i, int i2, Charset charset) {
        byte[] bArr = new byte[i2];
        byteBuffer.position(byteBuffer.position() + i);
        byteBuffer.get(bArr);
        return new String(bArr, 0, i2, charset);
    }

    public static long license(ByteBuffer byteBuffer, int i, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < (i2 - i) + 1; i3++) {
            j += (byteBuffer.get(i + i3) & 255) << (i3 * 8);
        }
        return j;
    }

    public static int metrica(ByteBuffer byteBuffer, int i, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < (i2 - i) + 1; i3++) {
            j += (byteBuffer.get(i2 - i3) & 255) << (i3 * 8);
        }
        return (int) j;
    }

    public static String mopub(DataInput dataInput, int i) {
        byte[] bArr = new byte[i];
        dataInput.readFully(bArr);
        return new String(bArr, AbstractC4639e.ad);
    }

    public static byte[] purchase(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >>> 8) & 255), (byte) ((i >>> 16) & 255), (byte) (255 & (i >>> 24))};
    }

    public static long smaato(DataInput dataInput) {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        dataInput.readFully(bArr, 4, 4);
        return ByteBuffer.wrap(bArr).getLong();
    }

    public static ByteBuffer startapp(FileChannel fileChannel, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        fileChannel.read(allocateDirect);
        allocateDirect.position(0);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        return allocateDirect;
    }

    public static String vip(File file) {
        String appmetrica = AbstractC16425e.appmetrica(file.getPath());
        if (appmetrica.length() < 3) {
            if (appmetrica.length() == 1) {
                appmetrica = appmetrica.concat("000");
            } else if (appmetrica.length() == 1) {
                appmetrica = appmetrica.concat("00");
            } else if (appmetrica.length() == 2) {
                appmetrica = appmetrica.concat("0");
            }
        }
        return appmetrica.length() <= 20 ? appmetrica : appmetrica.substring(0, 20);
    }

    public static boolean yandex(long j) {
        return (j & 1) != 0;
    }
}
