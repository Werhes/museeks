package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۘٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12696e {
    public static final C2892e ad = new C2892e(-2072597251, false, new C9012e(4));

    public static final int ad(String str) {
        int m1865interface;
        char c = File.separatorChar;
        int m1865interface2 = AbstractC5304e.m1865interface(str, c, 0, 4);
        if (m1865interface2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c || (m1865interface = AbstractC5304e.m1865interface(str, c, 2, 4)) < 0) {
                return 1;
            }
            int m1865interface3 = AbstractC5304e.m1865interface(str, c, m1865interface + 1, 4);
            return m1865interface3 >= 0 ? m1865interface3 + 1 : str.length();
        }
        if (m1865interface2 > 0 && str.charAt(m1865interface2 - 1) == ':') {
            return m1865interface2 + 1;
        }
        if (m1865interface2 == -1 && AbstractC5304e.premium(str, ':')) {
            return str.length();
        }
        return 0;
    }

    public static final int adcel(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        int i = config == null ? -1 : AbstractC5511e.ad[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("RenderScript Toolkit. Only ARGB_8888 and ALPHA_8 Bitmap are supported.");
    }

    public static ArrayList appmetrica(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            try {
                byte b = asReadOnlyBuffer.get();
                int i = (b >> 3) & 15;
                if (((b >> 2) & 1) != 0) {
                    asReadOnlyBuffer.get();
                }
                if (((b >> 1) & 1) != 0) {
                    remaining = 0;
                    for (int i2 = 0; i2 < 8; i2++) {
                        byte b2 = asReadOnlyBuffer.get();
                        remaining |= (b2 & Byte.MAX_VALUE) << (i2 * 7);
                        if ((b2 & 128) == 0) {
                            break;
                        }
                    }
                } else {
                    remaining = asReadOnlyBuffer.remaining();
                }
                if (asReadOnlyBuffer.position() + remaining > asReadOnlyBuffer.limit()) {
                    break;
                }
                ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
                duplicate.limit(asReadOnlyBuffer.position() + remaining);
                arrayList.add(new C17569e(i, duplicate));
                asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    public static final C1960e billing(File file) {
        List list;
        String path = file.getPath();
        int ad2 = ad(path);
        String substring = path.substring(0, ad2);
        String substring2 = path.substring(ad2);
        if (substring2.length() == 0) {
            list = C13664e.f27089e;
        } else {
            List m1868package = AbstractC5304e.m1868package(substring2, new char[]{File.separatorChar});
            ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(m1868package, 10));
            Iterator it = m1868package.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new C1960e(new File(substring), list);
    }

    public static C13594e license() {
        return new C13594e(0);
    }

    public static final C2802e metrica(Function1 function1) {
        C17400e c17400e = new C17400e();
        function1.invoke(c17400e);
        return new C2802e(c17400e);
    }

    public static C13540e purchase(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new C13540e(f, f2, obj);
    }

    public static void startapp(String str, Bitmap bitmap) {
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888 && bitmap.getConfig() != Bitmap.Config.ALPHA_8) {
            throw new IllegalArgumentException(("RenderScript Toolkit. " + str + " supports only ARGB_8888 and ALPHA_8 bitmaps. " + bitmap.getConfig() + " provided.").toString());
        }
        if (adcel(bitmap) * bitmap.getWidth() == bitmap.getRowBytes()) {
            return;
        }
        int rowBytes = bitmap.getRowBytes();
        int width = bitmap.getWidth();
        int adcel = adcel(bitmap);
        StringBuilder smaato = AbstractC10257e.smaato("RenderScript Toolkit ", str, ". Only bitmaps with rowSize equal to the width * vectorSize are currently supported. Provided were rowBytes=", rowBytes, ", width={");
        smaato.append(width);
        smaato.append(", and vectorSize=");
        smaato.append(adcel);
        smaato.append(".");
        throw new IllegalArgumentException(smaato.toString().toString());
    }

    public static C5043e vip(InterfaceC18133e interfaceC18133e, int i, long j, int i2) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            j = 0;
        }
        return new C5043e(interfaceC18133e, i, j);
    }

    public static C12870e yandex(int i, int i2, InterfaceC17838e interfaceC17838e) {
        if ((i2 & 1) != 0) {
            i = 300;
        }
        int i3 = (i2 & 2) != 0 ? 0 : 90;
        if ((i2 & 4) != 0) {
            interfaceC17838e = AbstractC5616e.ad;
        }
        return new C12870e(i, i3, interfaceC17838e);
    }
}
