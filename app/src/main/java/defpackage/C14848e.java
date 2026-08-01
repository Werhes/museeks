package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14848e {
    public final AtomicInteger ad = new AtomicInteger(0);
    public final C1386e license;
    public final C4956e metrica;
    public final C14461e vip;
    public static final Charset appmetrica = Charset.forName("UTF-8");
    public static final int purchase = 15;
    public static final C0109e billing = new Object();
    public static final C6575e yandex = new C6575e(5);
    public static final C11984e startapp = new C11984e(2);

    public C14848e(C14461e c14461e, C4956e c4956e, C1386e c1386e) {
        this.vip = c14461e;
        this.metrica = c4956e;
        this.license = c1386e;
    }

    public static void ad(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String appmetrica(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), appmetrica);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void purchase(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), appmetrica);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void license(AbstractC7796e abstractC7796e, String str, boolean z) {
        C14461e c14461e = this.vip;
        int i = this.metrica.mopub().ad.f11581e;
        billing.getClass();
        try {
            purchase(c14461e.yandex(str, AbstractC5087e.m1746extends("event", String.format(Locale.US, "%010d", Integer.valueOf(this.ad.getAndIncrement())), z ? "_" : BuildConfig.FLAVOR)), C0109e.ad.yandex(abstractC7796e));
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e);
        }
        C11984e c11984e = new C11984e(3);
        c14461e.getClass();
        File file = new File((File) c14461e.f28588e, str);
        file.mkdirs();
        List<File> pro = C14461e.pro(file.listFiles(c11984e));
        Collections.sort(pro, new C6575e(6));
        int size = pro.size();
        for (File file2 : pro) {
            if (size <= i) {
                return;
            }
            C14461e.subscription(file2);
            size--;
        }
    }

    public final NavigableSet metrica() {
        return new TreeSet(C14461e.pro(((File) this.vip.f28588e).list())).descendingSet();
    }

    public final ArrayList vip() {
        ArrayList arrayList = new ArrayList();
        C14461e c14461e = this.vip;
        arrayList.addAll(C14461e.pro(((File) c14461e.f28591e).listFiles()));
        arrayList.addAll(C14461e.pro(((File) c14461e.f28590e).listFiles()));
        C6575e c6575e = yandex;
        Collections.sort(arrayList, c6575e);
        List pro = C14461e.pro(((File) c14461e.f28585e).listFiles());
        Collections.sort(pro, c6575e);
        arrayList.addAll(pro);
        return arrayList;
    }
}
