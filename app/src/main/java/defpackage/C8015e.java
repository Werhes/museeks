package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8015e {
    public final C2532e ad;
    public static final C0193e vip = new C0193e(Arrays.copyOf(new byte[]{42}, 1));
    public static final List metrica = Collections.singletonList("*");
    public static final C8015e license = new C8015e(new C2532e(4));

    public C8015e(C2532e c2532e) {
        this.ad = c2532e;
    }

    public static List vip(String str) {
        List m1868package = AbstractC5304e.m1868package(str, new char[]{'.'});
        return AbstractC7890e.billing(AbstractC13480e.m3570break(m1868package), BuildConfig.FLAVOR) ? AbstractC13480e.crashlytics(m1868package) : m1868package;
    }

    public final String ad(String str) {
        String str2;
        String str3;
        String str4;
        List list;
        int size;
        int size2;
        List vip2 = vip(IDN.toUnicode(str));
        C2532e c2532e = this.ad;
        AtomicBoolean atomicBoolean = (AtomicBoolean) c2532e.f6388e;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) c2532e.f6386e).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        c2532e.m920e();
                        break;
                    } finally {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    c2532e.f6384e = e;
                    if (z) {
                    }
                }
            }
        }
        if (((C0193e) c2532e.f6385e) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(c2532e.f6389e);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) c2532e.f6384e);
            throw illegalStateException;
        }
        int size3 = vip2.size();
        C0193e[] c0193eArr = new C0193e[size3];
        for (int i = 0; i < size3; i++) {
            String str5 = (String) vip2.get(i);
            C0193e c0193e = new C0193e(str5.getBytes(AbstractC5508e.ad));
            c0193e.f1410e = str5;
            c0193eArr[i] = c0193e;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                str2 = null;
                break;
            }
            C0193e c0193e2 = (C0193e) c2532e.f6385e;
            if (c0193e2 == null) {
                c0193e2 = null;
            }
            str2 = C7936e.metrica(c0193e2, c0193eArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            C0193e[] c0193eArr2 = (C0193e[]) c0193eArr.clone();
            int length = c0193eArr2.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                c0193eArr2[i3] = vip;
                C0193e c0193e3 = (C0193e) c2532e.f6385e;
                if (c0193e3 == null) {
                    c0193e3 = null;
                }
                str3 = C7936e.metrica(c0193e3, c0193eArr2, i3);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i4 = size3 - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                C0193e c0193e4 = (C0193e) c2532e.f6387e;
                if (c0193e4 == null) {
                    c0193e4 = null;
                }
                str4 = C7936e.metrica(c0193e4, c0193eArr, i5);
                if (str4 != null) {
                    break;
                }
            }
        }
        str4 = null;
        if (str4 != null) {
            list = AbstractC5304e.m1868package("!".concat(str4), new char[]{'.'});
        } else if (str2 == null && str3 == null) {
            list = metrica;
        } else {
            List list2 = C13664e.f27089e;
            List m1868package = str2 != null ? AbstractC5304e.m1868package(str2, new char[]{'.'}) : list2;
            if (str3 != null) {
                list2 = AbstractC5304e.m1868package(str3, new char[]{'.'});
            }
            list = m1868package.size() > list2.size() ? m1868package : list2;
        }
        if (vip2.size() == list.size() && ((String) list.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) list.get(0)).charAt(0) == '!') {
            size = vip2.size();
            size2 = list.size();
        } else {
            size = vip2.size();
            size2 = list.size() + 1;
        }
        return AbstractC7762e.smaato(AbstractC7762e.yandex(new C1356e(1, vip(str)), size - size2), ".");
    }
}
