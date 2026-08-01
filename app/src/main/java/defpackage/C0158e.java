package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0158e {
    public static final C7936e vip;
    public final String ad;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        vip = new C7936e(2);
    }

    public C0158e(String str) {
        this.ad = str;
    }

    public static C10233e ad(C0829e c0829e, FileChannel fileChannel) {
        C10233e c10233e = new C10233e(3);
        c10233e.vip = false;
        c10233e.metrica = false;
        c10233e.license = false;
        if (c0829e.f3214e.f28203e.longValue() < c0829e.f3220e.f21996e.longValue()) {
            c10233e.vip = true;
            if (Math.abs(c0829e.f3214e.f28202e.longValue() - c0829e.Signature()) <= 1) {
                c10233e.metrica = true;
                if (startapp(c0829e, fileChannel)) {
                    c10233e.license = true;
                    return c10233e;
                }
            }
        } else if (Math.abs(c0829e.f3220e.f21997e.longValue() - c0829e.f3214e.f28203e.longValue()) <= 1) {
            c10233e.metrica = true;
            if (adcel(c0829e, fileChannel)) {
                c10233e.license = true;
            }
        }
        return c10233e;
    }

    public static boolean adcel(C0829e c0829e, FileChannel fileChannel) {
        if (c0829e.f3214e.f28202e.longValue() != fileChannel.size()) {
            return (c0829e.f3214e.f28202e.longValue() & 1) != 0 && c0829e.f3214e.f28202e.longValue() + 1 == fileChannel.size();
        }
        return true;
    }

    public static void admob(FileChannel fileChannel, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        C12927e.license();
        remoteconfig(fileChannel, byteBuffer, byteBuffer.limit());
        subscription(fileChannel, byteBuffer2);
    }

    public static void mopub(FileChannel fileChannel) {
        int i = AbstractC3395e.vip;
        fileChannel.position(i);
        int i2 = AbstractC3395e.metrica;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        allocateDirect.putInt((((int) fileChannel.size()) - i) - i2);
        allocateDirect.flip();
        fileChannel.write(allocateDirect);
    }

    public static void remoteconfig(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        if (AbstractC1983e.yandex(fileChannel.position())) {
            fileChannel.write(ByteBuffer.allocateDirect(1));
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        HashMap hashMap = EnumC2113e.f5461e;
        allocate.put("LIST".getBytes(AbstractC4639e.ad));
        allocate.putInt((int) j);
        allocate.flip();
        fileChannel.write(allocate);
        fileChannel.write(byteBuffer);
        if (AbstractC1983e.yandex(j)) {
            fileChannel.write(ByteBuffer.allocateDirect(1));
        }
    }

    public static boolean startapp(C0829e c0829e, FileChannel fileChannel) {
        if (c0829e.f3220e.f21997e.longValue() != fileChannel.size()) {
            return (c0829e.f3220e.f21997e.longValue() & 1) != 0 && c0829e.f3220e.f21997e.longValue() + 1 == fileChannel.size();
        }
        return true;
    }

    public static void subscription(FileChannel fileChannel, ByteBuffer byteBuffer) {
        if (AbstractC1983e.yandex(fileChannel.position())) {
            fileChannel.write(ByteBuffer.allocateDirect(1));
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        HashMap hashMap = EnumC2113e.f5461e;
        allocate.put("id3 ".getBytes(AbstractC4639e.ad));
        allocate.putInt(byteBuffer.limit());
        allocate.flip();
        fileChannel.write(allocate);
        fileChannel.write(byteBuffer);
    }

    public static ByteBuffer vip(C0829e c0829e, C0829e c0829e2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            long longValue = !c0829e2.f3215e ? 0L : c0829e2.f3220e.f21997e.longValue() - c0829e2.f3220e.f21996e.longValue();
            if (longValue > 0 && (longValue & 1) != 0) {
                longValue++;
            }
            c0829e.f3220e.m2991abstract((int) longValue, byteArrayOutputStream);
            if ((byteArrayOutputStream.toByteArray().length & 1) != 0) {
                int length = byteArrayOutputStream.toByteArray().length + 1;
                byteArrayOutputStream = new ByteArrayOutputStream();
                c0829e.f3220e.m2991abstract(length, byteArrayOutputStream);
            }
            ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            wrap.rewind();
            return wrap;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final C18524e Signature(C0829e c0829e, FileChannel fileChannel) {
        fileChannel.position(c0829e.f3214e.f28203e.longValue());
        C18524e c18524e = new C18524e(ByteOrder.LITTLE_ENDIAN);
        c18524e.appmetrica(fileChannel);
        fileChannel.position(fileChannel.position() - 8);
        HashMap hashMap = EnumC2113e.f5461e;
        if ("LIST".equals((String) c18524e.f36317e)) {
            return c18524e;
        }
        throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.ad, " Unable to find List chunk at original location has file been modified externally"));
    }

    public final void advert(C0829e c0829e, FileChannel fileChannel, C0829e c0829e2) {
        boolean z = c0829e.purchase() instanceof C14267e;
        String str = this.ad;
        if (!z) {
            ByteBuffer vip2 = vip(c0829e, c0829e2);
            if (c0829e2.f3216e) {
                if (!AbstractC16127e.vip(c0829e2)) {
                    throw new Exception(AbstractC10257e.adcel(str, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
                }
                license(c0829e2, fileChannel);
                fileChannel.position(fileChannel.size());
                subscription(fileChannel, vip2);
                return;
            }
            if (c0829e2.f3217e) {
                C18524e Signature = Signature(c0829e2, fileChannel);
                if (adcel(c0829e2, fileChannel)) {
                    fileChannel.truncate(c0829e2.f3214e.f28203e.longValue());
                } else {
                    purchase(fileChannel, c0829e2, Signature);
                }
            }
            if (!c0829e2.f3215e) {
                fileChannel.position(fileChannel.size());
                subscription(fileChannel, vip2);
                return;
            }
            C18524e loadAd = loadAd(c0829e2, fileChannel);
            if (startapp(c0829e2, fileChannel)) {
                subscription(fileChannel, vip2);
                return;
            }
            appmetrica(fileChannel, c0829e2, loadAd);
            fileChannel.position(fileChannel.size());
            subscription(fileChannel, vip2);
            return;
        }
        ByteBuffer metrica = metrica(c0829e);
        long limit = metrica.limit();
        if (c0829e2.f3216e) {
            if (!AbstractC16127e.vip(c0829e2)) {
                throw new Exception(AbstractC10257e.adcel(str, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
            }
            license(c0829e2, fileChannel);
            fileChannel.position(fileChannel.size());
            remoteconfig(fileChannel, metrica, limit);
            return;
        }
        if (c0829e2.f3215e) {
            if (startapp(c0829e2, fileChannel)) {
                fileChannel.truncate(c0829e2.Signature());
            } else {
                appmetrica(fileChannel, c0829e2, loadAd(c0829e2, fileChannel));
            }
        }
        if (!c0829e2.f3217e) {
            fileChannel.position(fileChannel.size());
            remoteconfig(fileChannel, metrica, limit);
            return;
        }
        C18524e Signature2 = Signature(c0829e2, fileChannel);
        if (!adcel(c0829e2, fileChannel)) {
            purchase(fileChannel, c0829e2, Signature2);
            fileChannel.position(fileChannel.size());
            remoteconfig(fileChannel, metrica, metrica.limit());
            return;
        }
        C14267e c14267e = c0829e2.f3214e;
        long limit2 = metrica.limit();
        if (c14267e.pro() < limit2) {
            remoteconfig(fileChannel, metrica, limit2);
            return;
        }
        remoteconfig(fileChannel, metrica, c14267e.pro());
        if (c14267e.pro() > limit2) {
            fileChannel.write(ByteBuffer.allocateDirect((int) (c14267e.pro() - limit2)));
        }
    }

    public final void amazon(C0829e c0829e, FileChannel fileChannel, C0829e c0829e2) {
        ByteBuffer metrica = metrica(c0829e);
        ByteBuffer vip2 = vip(c0829e, c0829e2);
        boolean z = c0829e2.f3217e;
        String str = this.ad;
        if (z && c0829e2.f3215e) {
            if (c0829e2.f3216e) {
                if (!AbstractC16127e.vip(c0829e2)) {
                    throw new Exception(AbstractC10257e.adcel(str, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
                }
                license(c0829e2, fileChannel);
                fileChannel.position(fileChannel.size());
                admob(fileChannel, metrica, vip2);
                return;
            }
            C10233e ad = ad(c0829e2, fileChannel);
            if (!ad.metrica || !ad.license) {
                C18524e Signature = Signature(c0829e2, fileChannel);
                C18524e loadAd = loadAd(c0829e2, fileChannel);
                purchase(fileChannel, c0829e2, Signature);
                appmetrica(fileChannel, c0829e2, loadAd);
                fileChannel.position(fileChannel.size());
                admob(fileChannel, metrica, vip2);
                return;
            }
            if (ad.vip) {
                Signature(c0829e2, fileChannel);
                admob(fileChannel, metrica, vip2);
                fileChannel.truncate(fileChannel.position());
                return;
            } else {
                loadAd(c0829e2, fileChannel);
                admob(fileChannel, metrica, vip2);
                fileChannel.truncate(fileChannel.position());
                return;
            }
        }
        if (z && !c0829e2.f3215e) {
            if (c0829e2.f3216e) {
                if (!AbstractC16127e.vip(c0829e2)) {
                    throw new Exception(AbstractC10257e.adcel(str, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
                }
                license(c0829e2, fileChannel);
                fileChannel.position(fileChannel.size());
                admob(fileChannel, metrica, vip2);
                return;
            }
            C18524e Signature2 = Signature(c0829e2, fileChannel);
            if (adcel(c0829e2, fileChannel)) {
                admob(fileChannel, metrica, vip2);
                fileChannel.truncate(fileChannel.position());
                return;
            } else {
                purchase(fileChannel, c0829e2, Signature2);
                fileChannel.position(fileChannel.size());
                admob(fileChannel, metrica, vip2);
                return;
            }
        }
        if (!c0829e2.f3215e || z) {
            fileChannel.position(fileChannel.size());
            admob(fileChannel, metrica, vip2);
            return;
        }
        if (c0829e2.f3216e) {
            if (!AbstractC16127e.vip(c0829e2)) {
                throw new Exception(AbstractC10257e.adcel(str, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
            }
            license(c0829e2, fileChannel);
            fileChannel.position(fileChannel.size());
            admob(fileChannel, metrica, vip2);
            return;
        }
        C18524e loadAd2 = loadAd(c0829e2, fileChannel);
        if (startapp(c0829e2, fileChannel)) {
            admob(fileChannel, metrica, vip2);
            fileChannel.truncate(fileChannel.position());
        } else {
            appmetrica(fileChannel, c0829e2, loadAd2);
            fileChannel.position(fileChannel.size());
            admob(fileChannel, metrica, vip2);
        }
    }

    public final void appmetrica(FileChannel fileChannel, C0829e c0829e, C18524e c18524e) {
        billing(fileChannel, (int) c0829e.yandex(), ((int) c18524e.f36318e) + 8);
    }

    public final void billing(FileChannel fileChannel, int i, int i2) {
        fileChannel.position(i);
        ByteBuffer allocate = ByteBuffer.allocate((int) C12927e.license().admob);
        while (true) {
            if (fileChannel.read(allocate) < 0 && allocate.position() == 0) {
                long size = fileChannel.size() - i2;
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                vip.getClass();
                int i3 = C1724e.ad;
                fileChannel.truncate(size);
                return;
            }
            allocate.flip();
            long position = fileChannel.position();
            fileChannel.position((position - i2) - allocate.limit());
            fileChannel.write(allocate);
            fileChannel.position(position);
            allocate.compact();
        }
    }

    public final void license(C0829e c0829e, FileChannel fileChannel) {
        C15116e c15116e;
        long ad = AbstractC16127e.ad(c0829e);
        ArrayList arrayList = c0829e.f3218e;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                c15116e = null;
                break;
            } else {
                if (((C15116e) arrayList.get(i)).vip == ad) {
                    c15116e = (C15116e) arrayList.get(i - 1);
                    break;
                }
                i++;
            }
        }
        boolean yandex = AbstractC1983e.yandex(c15116e.vip + c15116e.metrica + 8);
        C7936e c7936e = vip;
        if (yandex) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            Long l = c0829e.f3214e.f28203e;
            c7936e.getClass();
            int i2 = C1724e.ad;
            fileChannel.truncate(c0829e.f3214e.f28203e.longValue());
            return;
        }
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c0829e.f3214e.f28203e.longValue();
        c7936e.getClass();
        int i3 = C1724e.ad;
        fileChannel.truncate(c0829e.f3214e.f28203e.longValue() - 1);
    }

    public final C18524e loadAd(C0829e c0829e, FileChannel fileChannel) {
        fileChannel.position(c0829e.Signature());
        C18524e c18524e = new C18524e(ByteOrder.LITTLE_ENDIAN);
        c18524e.appmetrica(fileChannel);
        fileChannel.position(fileChannel.position() - 8);
        HashMap hashMap = EnumC2113e.f5461e;
        if ("id3 ".equals((String) c18524e.f36317e)) {
            return c18524e;
        }
        throw new Exception(AbstractC1786e.signatures(new StringBuilder(), this.ad, " Unable to find ID3 chunk at original location has file been modified externally"));
    }

    public final ByteBuffer metrica(C0829e c0829e) {
        C7936e c7936e;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C14267e c14267e = c0829e.f3214e;
            ArrayList Signature = c14267e.Signature();
            Collections.sort(Signature, new C11797e(25));
            Iterator it = Signature.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c7936e = vip;
                if (!hasNext) {
                    break;
                }
                InterfaceC16681e interfaceC16681e = (InterfaceC16681e) ((InterfaceC3589e) it.next());
                EnumC12588e ad = EnumC12588e.ad(EnumC8271e.valueOf(interfaceC16681e.getId()));
                byteArrayOutputStream.write(ad.f25306e.getBytes(AbstractC4639e.ad));
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                interfaceC16681e.yandex();
                c7936e.getClass();
                int i = C1724e.ad;
                byte[] bytes = interfaceC16681e.yandex().getBytes(AbstractC4639e.metrica);
                byteArrayOutputStream.write(AbstractC1983e.purchase(bytes.length));
                byteArrayOutputStream.write(bytes);
                if (AbstractC1983e.yandex(bytes.length)) {
                    byteArrayOutputStream.write(0);
                }
                if (ad == EnumC12588e.TRACKNO) {
                    C12927e.license();
                }
            }
            Iterator it2 = c14267e.f28204e.iterator();
            while (it2.hasNext()) {
                InterfaceC16681e interfaceC16681e2 = (InterfaceC16681e) it2.next();
                byteArrayOutputStream.write(interfaceC16681e2.getId().getBytes(AbstractC4639e.ad));
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                interfaceC16681e2.getId();
                interfaceC16681e2.yandex();
                c7936e.getClass();
                int i2 = C1724e.ad;
                byte[] bytes2 = interfaceC16681e2.yandex().getBytes(AbstractC4639e.metrica);
                byteArrayOutputStream.write(AbstractC1983e.purchase(bytes2.length));
                byteArrayOutputStream.write(bytes2);
                if (AbstractC1983e.yandex(bytes2.length)) {
                    byteArrayOutputStream.write(0);
                }
            }
            ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            wrap.rewind();
            ByteBuffer allocate = ByteBuffer.allocate(AbstractC3395e.vip);
            HashMap hashMap = EnumC2113e.f5461e;
            allocate.put("INFO".getBytes(AbstractC4639e.ad));
            allocate.flip();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(allocate.limit() + wrap.limit());
            allocateDirect.put(allocate);
            allocateDirect.put(wrap);
            allocateDirect.flip();
            return allocateDirect;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void purchase(FileChannel fileChannel, C0829e c0829e, C18524e c18524e) {
        C14267e c14267e = c0829e.f3214e;
        billing(fileChannel, c14267e.f28202e.intValue(), ((int) c18524e.f36318e) + 8);
    }

    public final void smaato(C0829e c0829e, FileChannel fileChannel, C0829e c0829e2) {
        if (c0829e.purchase() instanceof C14267e) {
            if (c0829e2.f3215e) {
                amazon(c0829e, fileChannel, c0829e2);
                return;
            } else {
                advert(c0829e, fileChannel, c0829e2);
                return;
            }
        }
        if (c0829e2.f3217e) {
            amazon(c0829e, fileChannel, c0829e2);
        } else {
            advert(c0829e, fileChannel, c0829e2);
        }
    }

    public final C0829e yandex(FileChannel fileChannel) {
        String str = this.ad;
        try {
            return new C2321e(str).ad(fileChannel);
        } catch (C1110e unused) {
            throw new Exception("Failed to read file " + str);
        }
    }
}
