package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8563e {
    public static final C7936e license;
    public final FileChannel ad;
    public int metrica;
    public final String vip;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        license = new C7936e(2);
    }

    public C8563e(FileChannel fileChannel, String str) {
        this.ad = fileChannel;
        this.vip = str;
    }

    public final void ad() {
        FileChannel fileChannel = this.ad;
        long size = fileChannel.size();
        String str = this.vip;
        if (size == 0) {
            throw new Exception(AbstractC17861e.Signature("Error: File empty ", str));
        }
        fileChannel.position(0L);
        C7936e c7936e = AbstractC1983e.ad;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
        fileChannel.read(allocateDirect);
        allocateDirect.position(0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        allocateDirect.order(byteOrder);
        if (AbstractC1983e.adcel(allocateDirect).equals("fLaC")) {
            this.metrica = 0;
            return;
        }
        fileChannel.position(0L);
        byte[] bArr = AbstractC11095e.f21993e;
        long position = fileChannel.position();
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(3);
        fileChannel.read(allocateDirect2);
        allocateDirect2.position(0);
        allocateDirect2.order(byteOrder);
        fileChannel.position(position);
        byte[] bArr2 = new byte[3];
        allocateDirect2.get(bArr2);
        if (new String(bArr2, AbstractC4639e.vip).equals("ID3")) {
            ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(4);
            fileChannel.position(fileChannel.position() + 6);
            fileChannel.read(allocateDirect3);
            allocateDirect3.flip();
            fileChannel.position(AbstractC8294e.vip(allocateDirect3) + 10);
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            fileChannel.position();
            license.getClass();
            int i = C1724e.ad;
            ByteBuffer allocateDirect4 = ByteBuffer.allocateDirect(4);
            fileChannel.read(allocateDirect4);
            allocateDirect4.position(0);
            allocateDirect4.order(byteOrder);
            if (AbstractC1983e.adcel(allocateDirect4).equals("fLaC")) {
                this.metrica = (int) (fileChannel.position() - 4);
                return;
            }
        }
        throw new Exception(AbstractC10257e.adcel(str, "Flac Header not found, not a flac file"));
    }
}
