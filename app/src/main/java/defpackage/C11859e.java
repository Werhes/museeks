package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11859e {
    public static final C7936e vip;
    public C16035e ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        vip = new C7936e(2);
    }

    public static int ad(C18464e c18464e) {
        Iterator it = ((ArrayList) c18464e.f36190e).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C13956e) it.next()).ad();
        }
        Iterator it2 = ((ArrayList) c18464e.f36189e).iterator();
        while (it2.hasNext()) {
            i += ((C13956e) it2.next()).ad();
        }
        Iterator it3 = ((ArrayList) c18464e.f36194e).iterator();
        while (it3.hasNext()) {
            i += ((C13956e) it3.next()).ad();
        }
        Iterator it4 = ((ArrayList) c18464e.f36192e).iterator();
        while (it4.hasNext()) {
            i += ((C13956e) it4.next()).ad();
        }
        return i;
    }

    public static void appmetrica(FileChannel fileChannel, C18464e c18464e) {
        fileChannel.write(ByteBuffer.wrap(((C13956e) c18464e.f36191e).ad.metrica()));
        fileChannel.write(((C13956e) c18464e.f36191e).vip.vip());
        Iterator it = ((ArrayList) c18464e.f36190e).iterator();
        while (it.hasNext()) {
            C13956e c13956e = (C13956e) it.next();
            fileChannel.write(ByteBuffer.wrap(c13956e.ad.metrica()));
            fileChannel.write(c13956e.vip.vip());
        }
        Iterator it2 = ((ArrayList) c18464e.f36189e).iterator();
        while (it2.hasNext()) {
            C13956e c13956e2 = (C13956e) it2.next();
            fileChannel.write(ByteBuffer.wrap(c13956e2.ad.metrica()));
            fileChannel.write(c13956e2.vip.vip());
        }
        Iterator it3 = ((ArrayList) c18464e.f36194e).iterator();
        while (it3.hasNext()) {
            C13956e c13956e3 = (C13956e) it3.next();
            fileChannel.write(ByteBuffer.wrap(c13956e3.ad.metrica()));
            fileChannel.write(c13956e3.vip.vip());
        }
    }

    public static int vip(C18464e c18464e) {
        Iterator it = ((ArrayList) c18464e.f36190e).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C13956e) it.next()).ad();
        }
        Iterator it2 = ((ArrayList) c18464e.f36189e).iterator();
        while (it2.hasNext()) {
            i += ((C13956e) it2.next()).ad();
        }
        Iterator it3 = ((ArrayList) c18464e.f36194e).iterator();
        while (it3.hasNext()) {
            i += ((C13956e) it3.next()).ad();
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void license(InterfaceC1425e interfaceC1425e, FileChannel fileChannel, String str) {
        String str2;
        IOException iOException;
        C18464e c18464e;
        C8563e c8563e;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        C16035e c16035e = this.ad;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = vip;
        c7936e.getClass();
        int i = C1724e.ad;
        try {
            objArr3 = 0;
            objArr2 = 0;
            objArr = 0;
            c18464e = new C18464e(11, false);
            c18464e.f36192e = new ArrayList(1);
            c18464e.f36190e = new ArrayList(1);
            c18464e.f36189e = new ArrayList(1);
            c18464e.f36194e = new ArrayList(1);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            str2 = " ";
            sb.append(" ");
            c8563e = new C8563e(fileChannel, sb.toString());
        } catch (IOException e) {
            e = e;
            str2 = str;
        }
        try {
            try {
                c8563e.ad();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            C0381e license = C0381e.license(fileChannel);
                            int i2 = license.vip;
                            EnumC17116e enumC17116e = (EnumC17116e) license.appmetrica;
                            if (enumC17116e != null) {
                                int i3 = 20;
                                switch (enumC17116e) {
                                    case STREAMINFO:
                                        c18464e.f36191e = new C13956e(license, new C0776e(license, fileChannel));
                                        break;
                                    case PADDING:
                                    case VORBIS_COMMENT:
                                    case PICTURE:
                                        fileChannel.position(fileChannel.position() + i2);
                                        C5401e c5401e = new C5401e((byte) 0, 8);
                                        c5401e.f11581e = i2;
                                        ((ArrayList) c18464e.f36192e).add(new C13956e(license, c5401e));
                                        break;
                                    case APPLICATION:
                                        C7850e c7850e = new C7850e(18, (boolean) (objArr3 == true ? 1 : 0));
                                        ByteBuffer allocate = ByteBuffer.allocate(i2);
                                        c7850e.f15896e = allocate;
                                        fileChannel.read(allocate);
                                        allocate.flip();
                                        ((ArrayList) c18464e.f36190e).add(new C13956e(license, c7850e));
                                        break;
                                    case SEEKTABLE:
                                        C6325e c6325e = new C6325e((char) (objArr2 == true ? 1 : 0), i3);
                                        ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                                        c6325e.f13170e = allocate2;
                                        fileChannel.read(allocate2);
                                        allocate2.flip();
                                        ((ArrayList) c18464e.f36189e).add(new C13956e(license, c6325e));
                                        break;
                                    case CUESHEET:
                                        C6594e c6594e = new C6594e(i3, (boolean) (objArr == true ? 1 : 0));
                                        ByteBuffer allocate3 = ByteBuffer.allocate(i2);
                                        c6594e.f13613e = allocate3;
                                        fileChannel.read(allocate3);
                                        allocate3.flip();
                                        ((ArrayList) c18464e.f36194e).add(new C13956e(license, c6594e));
                                        break;
                                    default:
                                        fileChannel.position(fileChannel.position() + i2);
                                        break;
                                }
                            }
                            z = license.metrica;
                        } catch (C1110e e2) {
                            throw new Exception(e2.getMessage());
                        }
                    } catch (IOException e3) {
                        iOException = e3;
                        str2 = str;
                        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                        iOException.getMessage();
                        c7936e.getClass();
                        int i4 = C1724e.ad;
                        throw new Exception(AbstractC8703e.admob(iOException, AbstractC8703e.isPro(str2, ":")));
                    }
                }
                int ad = ad(c18464e);
                int limit = c16035e.adcel(interfaceC1425e, 0).limit() + vip(c18464e);
                fileChannel.position(c8563e.metrica);
                EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i5 = C1724e.ad;
                if (ad != limit && ad <= limit + 4) {
                    c7936e.getClass();
                    metrica(str, interfaceC1425e, fileChannel, c18464e, c8563e, limit + 4000, ad);
                } else {
                    c7936e.getClass();
                    fileChannel.position(c8563e.metrica + 4);
                    appmetrica(fileChannel, c18464e);
                    fileChannel.write(c16035e.adcel(interfaceC1425e, ad - limit));
                }
            } catch (C1110e e4) {
                throw new Exception(e4.getMessage());
            }
        } catch (IOException e5) {
            e = e5;
            iOException = e;
            EnumC1005e[] enumC1005eArr22 = EnumC1005e.f3456e;
            iOException.getMessage();
            c7936e.getClass();
            int i42 = C1724e.ad;
            throw new Exception(AbstractC8703e.admob(iOException, AbstractC8703e.isPro(str2, ":")));
        }
    }

    public final void metrica(String str, InterfaceC1425e interfaceC1425e, FileChannel fileChannel, C18464e c18464e, C8563e c8563e, int i, int i2) {
        long size = fileChannel.size();
        long j = c8563e.metrica + 42 + i2;
        int i3 = i - i2;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        vip.getClass();
        int i4 = C1724e.ad;
        int i5 = (int) C12927e.license().admob;
        if (i5 >= i3) {
            i3 = i5;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        fileChannel.position(j);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3);
        fileChannel.read(allocateDirect);
        allocateDirect.flip();
        linkedBlockingQueue.add(allocateDirect);
        long position = fileChannel.position();
        fileChannel.position(c8563e.metrica + 4);
        appmetrica(fileChannel, c18464e);
        fileChannel.write(this.ad.adcel(interfaceC1425e, 4000));
        long position2 = fileChannel.position();
        fileChannel.position(position);
        while (fileChannel.position() < size) {
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i3);
            fileChannel.read(allocateDirect2);
            long position3 = fileChannel.position();
            allocateDirect2.flip();
            linkedBlockingQueue.add(allocateDirect2);
            fileChannel.position(position2);
            fileChannel.write((ByteBuffer) linkedBlockingQueue.remove());
            position2 = fileChannel.position();
            fileChannel.position(position3);
        }
        fileChannel.position(position2);
        fileChannel.write((ByteBuffer) linkedBlockingQueue.remove());
    }
}
