package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٝۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11141e {
    public static final C7936e ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        ad = new C7936e(2);
    }

    public static ByteBuffer ad(C12671e c12671e, C12671e c12671e2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            long longValue = !c12671e2.f25400e ? 0L : c12671e2.f25402e.f21997e.longValue() - c12671e2.f25402e.f21996e.longValue();
            if (longValue > 0 && (longValue & 1) != 0) {
                longValue++;
            }
            c12671e.f25402e.m2991abstract((int) longValue, byteArrayOutputStream);
            if ((byteArrayOutputStream.toByteArray().length & 1) != 0) {
                int length = byteArrayOutputStream.toByteArray().length + 1;
                byteArrayOutputStream = new ByteArrayOutputStream();
                c12671e.f25402e.m2991abstract(length, byteArrayOutputStream);
            }
            ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            wrap.rewind();
            return wrap;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean appmetrica(C12671e c12671e, FileChannel fileChannel) {
        if (c12671e.f25402e.f21997e.longValue() != fileChannel.size()) {
            return AbstractC1983e.yandex(c12671e.f25402e.f21997e.longValue()) && c12671e.f25402e.f21997e.longValue() + 1 == fileChannel.size();
        }
        return true;
    }

    public static C18524e billing(FileChannel fileChannel, C12671e c12671e, String str) {
        fileChannel.position(c12671e.purchase());
        C18524e c18524e = new C18524e(ByteOrder.BIG_ENDIAN);
        c18524e.appmetrica(fileChannel);
        fileChannel.position(fileChannel.position() - 8);
        EnumC13453e enumC13453e = EnumC13453e.TAG;
        if ("ID3 ".equals((String) c18524e.f36317e)) {
            return c18524e;
        }
        StringBuilder isPro = AbstractC8703e.isPro(str, " Unable to find ID3 chunk at expected location:");
        isPro.append(c12671e.purchase());
        throw new Exception(isPro.toString());
    }

    public static C12671e license(FileChannel fileChannel, String str) {
        try {
            return C8353e.appmetrica(fileChannel, str);
        } catch (C1110e unused) {
            throw new Exception(AbstractC10257e.adcel(str, " Failed to read file"));
        }
    }

    public static void metrica(FileChannel fileChannel, C12671e c12671e, C18524e c18524e, String str) {
        int i = (int) c18524e.f36318e;
        int i2 = i + 8;
        long j = i2;
        if (AbstractC1983e.yandex(j) && c12671e.purchase() + j < fileChannel.size()) {
            i2 = i + 9;
        }
        long j2 = i2;
        long size = fileChannel.size() - j2;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        c12671e.purchase();
        C7936e c7936e = ad;
        c7936e.getClass();
        int i3 = C1724e.ad;
        fileChannel.position(c12671e.purchase() + j2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) C12927e.license().admob);
        while (true) {
            if (fileChannel.read(allocateDirect) < 0 && allocateDirect.position() == 0) {
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i4 = C1724e.ad;
                fileChannel.truncate(size);
                return;
            }
            allocateDirect.flip();
            long position = fileChannel.position();
            fileChannel.position((position - j2) - allocateDirect.limit());
            fileChannel.write(allocateDirect);
            fileChannel.position(position);
            allocateDirect.compact();
        }
    }

    public static void purchase(FileChannel fileChannel) {
        int i = AbstractC3395e.vip;
        fileChannel.position(i);
        int i2 = AbstractC3395e.metrica;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
        allocateDirect.order(ByteOrder.BIG_ENDIAN);
        allocateDirect.putInt((((int) fileChannel.size()) - i) - i2);
        allocateDirect.flip();
        fileChannel.write(allocateDirect);
    }

    public static void vip(FileChannel fileChannel, C12671e c12671e, String str) {
        C15116e c15116e;
        int i = 0;
        while (true) {
            ArrayList arrayList = c12671e.f25403e;
            if (i >= arrayList.size()) {
                c15116e = null;
                break;
            } else {
                if (((C15116e) arrayList.get(i)).vip == c12671e.purchase()) {
                    c15116e = (C15116e) arrayList.get(i - 1);
                    break;
                }
                i++;
            }
        }
        C7936e c7936e = ad;
        if (c15116e == null) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
        } else {
            if (AbstractC1983e.yandex(c15116e.vip + c15116e.metrica + 8)) {
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                c12671e.purchase();
                c7936e.getClass();
                int i3 = C1724e.ad;
                fileChannel.truncate(c12671e.purchase());
                return;
            }
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c12671e.purchase();
            c7936e.getClass();
            int i4 = C1724e.ad;
            fileChannel.truncate(c12671e.purchase() - 1);
        }
    }

    public static void yandex(FileChannel fileChannel, ByteBuffer byteBuffer) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        EnumC13453e enumC13453e = EnumC13453e.TAG;
        long limit = byteBuffer.limit();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(byteOrder);
        allocate.put("ID3 ".getBytes(AbstractC4639e.ad));
        allocate.putInt((int) limit);
        allocate.flip();
        fileChannel.write(allocate);
        fileChannel.write(byteBuffer);
        if (AbstractC1983e.yandex(byteBuffer.limit())) {
            fileChannel.write(ByteBuffer.allocateDirect(1));
        }
    }
}
