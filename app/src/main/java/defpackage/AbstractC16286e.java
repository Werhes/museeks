package defpackage;

import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16286e {
    public static final TimeZone ad = DesugarTimeZone.getTimeZone("GMT");
    public static final String vip = AbstractC5304e.m1853catch(AbstractC5304e.m1852case(C1343e.class.getName(), "okhttp3."), "Client");

    public static final boolean ad(C15718e c15718e, C15718e c15718e2) {
        return AbstractC7890e.billing(c15718e.license, c15718e2.license) && c15718e.appmetrica == c15718e2.appmetrica && AbstractC7890e.billing(c15718e.ad, c15718e2.ad);
    }

    public static final List adcel(List list) {
        return list.isEmpty() ? C13664e.f27089e : list.size() == 1 ? Collections.singletonList(list.get(0)) : DesugarCollections.unmodifiableList(Arrays.asList(list.toArray()));
    }

    public static final long appmetrica(C11058e c11058e) {
        String appmetrica = c11058e.f21946e.appmetrica("Content-Length");
        if (appmetrica == null) {
            return -1L;
        }
        byte[] bArr = AbstractC10220e.ad;
        try {
            return Long.parseLong(appmetrica);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [eِٖۢ, java.lang.Object] */
    public static final boolean billing(InterfaceC2537e interfaceC2537e, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long nanoTime = System.nanoTime();
        long metrica = interfaceC2537e.startapp().appmetrica() ? interfaceC2537e.startapp().metrica() - nanoTime : Long.MAX_VALUE;
        interfaceC2537e.startapp().license(Math.min(metrica, timeUnit.toNanos(i)) + nanoTime);
        try {
            ?? obj = new Object();
            while (interfaceC2537e.signatures(obj, 8192L) != -1) {
                obj.ad();
            }
            if (metrica == Long.MAX_VALUE) {
                interfaceC2537e.startapp().ad();
                return true;
            }
            interfaceC2537e.startapp().license(nanoTime + metrica);
            return true;
        } catch (InterruptedIOException unused) {
            if (metrica == Long.MAX_VALUE) {
                interfaceC2537e.startapp().ad();
                return false;
            }
            interfaceC2537e.startapp().license(nanoTime + metrica);
            return false;
        } catch (Throwable th) {
            if (metrica == Long.MAX_VALUE) {
                interfaceC2537e.startapp().ad();
            } else {
                interfaceC2537e.startapp().license(nanoTime + metrica);
            }
            throw th;
        }
    }

    public static final String license(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final void metrica(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!AbstractC7890e.billing(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final List mopub(Object[] objArr) {
        return (objArr == null || objArr.length == 0) ? C13664e.f27089e : objArr.length == 1 ? Collections.singletonList(objArr[0]) : DesugarCollections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static final Charset purchase(InterfaceC4895e interfaceC4895e, Charset charset) {
        int mo1690while = interfaceC4895e.mo1690while(AbstractC10220e.vip);
        if (mo1690while == -1) {
            return charset;
        }
        if (mo1690while == 0) {
            return AbstractC5508e.ad;
        }
        if (mo1690while == 1) {
            return AbstractC5508e.vip;
        }
        if (mo1690while == 2) {
            Charset charset2 = AbstractC5508e.ad;
            Charset charset3 = AbstractC5508e.appmetrica;
            if (charset3 != null) {
                return charset3;
            }
            Charset forName = Charset.forName("UTF-32LE");
            AbstractC5508e.appmetrica = forName;
            return forName;
        }
        if (mo1690while == 3) {
            return AbstractC5508e.metrica;
        }
        if (mo1690while != 4) {
            throw new AssertionError();
        }
        Charset charset4 = AbstractC5508e.ad;
        Charset charset5 = AbstractC5508e.purchase;
        if (charset5 != null) {
            return charset5;
        }
        Charset forName2 = Charset.forName("UTF-32BE");
        AbstractC5508e.purchase = forName2;
        return forName2;
    }

    public static final String startapp(C15718e c15718e, boolean z) {
        int i = c15718e.appmetrica;
        String str = c15718e.license;
        if (AbstractC5304e.inmobi(str, ":", false)) {
            str = AbstractC17861e.advert(']', "[", str);
        }
        if (!z) {
            String str2 = c15718e.ad;
            if (i == (str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1)) {
                return str;
            }
        }
        return str + ':' + i;
    }

    public static final int vip(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout".concat(" too small").toString());
    }

    public static final C15793e yandex(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4861e c4861e = (C4861e) it.next();
            C0193e c0193e = c4861e.ad;
            C0193e c0193e2 = c4861e.vip;
            String remoteconfig = c0193e.remoteconfig();
            String remoteconfig2 = c0193e2.remoteconfig();
            arrayList.add(remoteconfig);
            arrayList.add(AbstractC5304e.m1855const(remoteconfig2).toString());
        }
        return new C15793e((String[]) arrayList.toArray(new String[0]));
    }
}
