package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؒۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4594e {
    public final Context ad;
    public final C12787e adcel;
    public final C1386e advert;
    public C17707e amazon;
    public final C12894e appmetrica;
    public final C14461e billing;
    public final C10017e license;
    public final C17424e metrica;
    public final InterfaceC14746e mopub;
    public final C17960e purchase;
    public final C14461e smaato;
    public final C16911e startapp;
    public final C8331e vip;
    public final C15621e yandex;
    public static final C11984e subscription = new C11984e(1);
    public static final Charset remoteconfig = Charset.forName("UTF-8");
    public final C8988e loadAd = new C8988e();
    public final C8988e Signature = new C8988e();
    public final C8988e admob = new C8988e();

    public C4594e(Context context, C17960e c17960e, C8331e c8331e, C14461e c14461e, C17424e c17424e, C15621e c15621e, C10017e c10017e, C16911e c16911e, C14461e c14461e2, C12787e c12787e, InterfaceC14746e interfaceC14746e, C1386e c1386e, C12894e c12894e) {
        new AtomicBoolean(false);
        this.ad = context;
        this.purchase = c17960e;
        this.vip = c8331e;
        this.billing = c14461e;
        this.metrica = c17424e;
        this.yandex = c15621e;
        this.license = c10017e;
        this.startapp = c16911e;
        this.adcel = c12787e;
        this.mopub = interfaceC14746e;
        this.advert = c1386e;
        this.smaato = c14461e2;
        this.appmetrica = c12894e;
    }

    public static C0560e ad(C4594e c4594e) {
        C0560e metrica;
        c4594e.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : C14461e.pro(((File) c4594e.billing.f28586e).listFiles(subscription))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    metrica = AbstractC1749e.appmetrica(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    metrica = AbstractC1749e.metrica(new ScheduledThreadPoolExecutor(1), new CallableC5690e(c4594e, parseLong));
                }
                arrayList.add(metrica);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return AbstractC1749e.yandex(arrayList);
    }

    public final String appmetrica() {
        NavigableSet metrica = ((C14848e) this.smaato.f28587e).metrica();
        if (metrica.isEmpty()) {
            return null;
        }
        return (String) metrica.first();
    }

    public final void billing() {
        try {
            String purchase = purchase();
            if (purchase != null) {
                try {
                    this.license.metrica(purchase);
                } catch (IllegalArgumentException e) {
                    Context context = this.ad;
                    if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                        throw e;
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e2);
        }
    }

    public final boolean license(C4956e c4956e) {
        C12894e.smaato();
        C17707e c17707e = this.amazon;
        if (c17707e != null && c17707e.appmetrica.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            vip(true, c4956e, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, eُؓ۠] */
    /* JADX WARN: Type inference failed for: r1v17, types: [eَؚۚ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [eّۣٗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [eٗٙؗ, java.lang.Object] */
    public final void metrica(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String Signature = AbstractC17861e.Signature("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", Signature, null);
        }
        Locale locale = Locale.US;
        C17960e c17960e = this.purchase;
        C15621e c15621e = this.yandex;
        C7804e c7804e = new C7804e(c17960e.metrica, c15621e.purchase, c15621e.billing, c17960e.metrica().ad, AbstractC13501e.metrica(c15621e.license != null ? 4 : 1), c15621e.yandex);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        C17350e c17350e = new C17350e(AbstractC6494e.amazon());
        Context context = this.ad;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        EnumC14614e enumC14614e = EnumC14614e.f28836e;
        String str8 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str8)) {
            EnumC14614e enumC14614e2 = (EnumC14614e) EnumC14614e.f28835e.get(str8.toLowerCase(locale));
            if (enumC14614e2 != null) {
                enumC14614e = enumC14614e2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = enumC14614e.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long metrica = AbstractC6494e.metrica(context);
        boolean smaato = AbstractC6494e.smaato();
        int startapp = AbstractC6494e.startapp();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        this.adcel.license(str, currentTimeMillis, new C10579e(c7804e, c17350e, new C16995e(ordinal, availableProcessors, metrica, blockCount, smaato, startapp)));
        if (!bool.booleanValue() || str == null) {
            str2 = str7;
            str3 = str10;
            str4 = str11;
            str5 = str9;
            i = 4;
        } else {
            C10017e c10017e = this.license;
            synchronized (((String) c10017e.f19788e)) {
                c10017e.f19788e = str;
                str4 = str11;
                str5 = str9;
                str2 = str7;
                str3 = str10;
                i = 4;
                ((ExecutorC4614e) ((C12894e) c10017e.f19785e).f25750e).ad(new RunnableC6795e(c10017e, str, ((C0620e) ((AtomicMarkableReference) ((C5609e) c10017e.f19784e).f11962e).getReference()).ad(), ((C7417e) c10017e.f19790e).metrica(), 19));
            }
        }
        C16911e c16911e = this.startapp;
        ((InterfaceC5974e) c16911e.f33136e).vip();
        c16911e.f33136e = C16911e.f33134e;
        if (str != null) {
            c16911e.f33136e = new C9970e(((C14461e) c16911e.f33137e).yandex(str, "userlog"));
        }
        this.advert.vip(str);
        C14461e c14461e = this.smaato;
        C9601e c9601e = (C9601e) c14461e.f28589e;
        Charset charset = AbstractC7939e.ad;
        ?? obj = new Object();
        obj.ad = "20.0.4";
        C15621e c15621e2 = c9601e.metrica;
        String str12 = c15621e2.ad;
        if (str12 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        obj.vip = str12;
        C17960e c17960e2 = c9601e.vip;
        String str13 = c17960e2.metrica().ad;
        if (str13 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        obj.license = str13;
        obj.appmetrica = c17960e2.metrica().vip;
        obj.purchase = c17960e2.metrica().metrica;
        String str14 = c15621e2.purchase;
        if (str14 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        obj.yandex = str14;
        String str15 = c15621e2.billing;
        if (str15 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        obj.startapp = str15;
        obj.metrica = i;
        obj.smaato = (byte) (obj.smaato | 1);
        ?? obj2 = new Object();
        obj2.purchase = false;
        byte b = (byte) (obj2.smaato | 2);
        obj2.license = currentTimeMillis;
        obj2.smaato = (byte) (b | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        obj2.vip = str;
        String str16 = C9601e.billing;
        if (str16 == null) {
            throw new NullPointerException("Null generator");
        }
        obj2.ad = str16;
        String str17 = c17960e2.metrica;
        if (str17 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str18 = c17960e2.metrica().ad;
        C13391e c13391e = c15621e2.yandex;
        if (((C16911e) c13391e.f26644e) == null) {
            c13391e.f26644e = new C16911e(c13391e);
        }
        C16911e c16911e2 = (C16911e) c13391e.f26644e;
        String str19 = (String) c16911e2.f33137e;
        if (c16911e2 == null) {
            c13391e.f26644e = new C16911e(c13391e);
        }
        obj2.billing = new C9574e(str17, str14, str15, str18, str19, (String) ((C16911e) c13391e.f26644e).f33136e);
        ?? obj3 = new Object();
        obj3.ad = 3;
        obj3.appmetrica = (byte) (obj3.appmetrica | 1);
        if (str6 == null) {
            throw new NullPointerException("Null version");
        }
        obj3.vip = str6;
        if (str2 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        obj3.metrica = str2;
        obj3.license = AbstractC6494e.amazon();
        obj3.appmetrica = (byte) (obj3.appmetrica | 2);
        obj2.startapp = obj3.ad();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i2 = 7;
        if (!TextUtils.isEmpty(str8) && (num = (Integer) C9601e.purchase.get(str8.toLowerCase(locale))) != null) {
            i2 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long metrica2 = AbstractC6494e.metrica(c9601e.ad);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean smaato2 = AbstractC6494e.smaato();
        int startapp2 = AbstractC6494e.startapp();
        ?? obj4 = new Object();
        obj4.ad = i2;
        byte b2 = (byte) (obj4.adcel | 1);
        obj4.adcel = b2;
        if (str5 == null) {
            throw new NullPointerException("Null model");
        }
        obj4.vip = str5;
        obj4.metrica = availableProcessors2;
        obj4.license = metrica2;
        obj4.appmetrica = blockCount2;
        obj4.purchase = smaato2;
        obj4.billing = startapp2;
        obj4.adcel = (byte) (((byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        obj4.yandex = str20;
        String str21 = str4;
        if (str21 == null) {
            throw new NullPointerException("Null modelClass");
        }
        obj4.startapp = str21;
        obj2.adcel = obj4.ad();
        obj2.advert = 3;
        obj2.smaato = (byte) (obj2.smaato | 4);
        obj.adcel = obj2.ad();
        C0823e ad = obj.ad();
        C14461e c14461e2 = ((C14848e) c14461e.f28587e).vip;
        AbstractC9135e abstractC9135e = ad.mopub;
        if (abstractC9135e == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = ((C17924e) abstractC9135e).vip;
        try {
            C14848e.billing.getClass();
            C14848e.purchase(c14461e2.yandex(str22, "report"), C0109e.ad.yandex(ad));
            File yandex = c14461e2.yandex(str22, "start-time");
            long j = ((C17924e) abstractC9135e).license;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(yandex), C14848e.appmetrica);
            try {
                outputStreamWriter.write(BuildConfig.FLAVOR);
                yandex.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            String Signature2 = AbstractC17861e.Signature("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", Signature2, e);
            }
        }
    }

    public final String purchase() {
        InputStream resourceAsStream;
        Context context = this.ad;
        int adcel = AbstractC6494e.adcel(context, "com.google.firebase.crashlytics.version_control_info", "string");
        String string = adcel == 0 ? null : context.getResources().getString(adcel);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(remoteconfig), 0);
        }
        ClassLoader classLoader = C4594e.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = resourceAsStream.read(bArr);
                    if (read == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return encodeToString;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                resourceAsStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.Object, eًْؖ] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [int] */
    /* JADX WARN: Type inference failed for: r11v53, types: [java.lang.Object, eؘُۛ] */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.lang.Object, eًِٖ] */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, eًْؖ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip(boolean r32, defpackage.C4956e r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4594e.vip(boolean, eؗ٘ٔ, boolean):void");
    }

    public final void yandex(C0560e c0560e) {
        C0560e c0560e2;
        C0560e purchase;
        C8988e c8988e = this.loadAd;
        C14461e c14461e = ((C14848e) this.smaato.f28587e).vip;
        if (C14461e.pro(((File) c14461e.f28585e).listFiles()).isEmpty() && C14461e.pro(((File) c14461e.f28591e).listFiles()).isEmpty() && C14461e.pro(((File) c14461e.f28590e).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            c8988e.license(Boolean.FALSE);
            return;
        }
        C5438e c5438e = C5438e.f11671e;
        c5438e.signatures("Crash reports are available to be sent.");
        C8331e c8331e = this.vip;
        if (c8331e.ad()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            c8988e.license(Boolean.FALSE);
            purchase = AbstractC1749e.appmetrica(Boolean.TRUE);
        } else {
            c5438e.subscription("Automatic data collection is disabled.");
            c5438e.signatures("Notifying that unsent reports are available.");
            c8988e.license(Boolean.TRUE);
            synchronized (c8331e.f17055e) {
                c0560e2 = ((C8988e) c8331e.f17056e).ad;
            }
            C15802e c15802e = new C15802e(26);
            c0560e2.getClass();
            ExecutorC14432e executorC14432e = AbstractC10468e.ad;
            C0560e c0560e3 = new C0560e();
            c0560e2.vip.crashlytics(new C1173e(executorC14432e, c15802e, c0560e3));
            c0560e2.remoteconfig();
            c5438e.subscription("Waiting for send/deleteUnsentReports to be called.");
            purchase = AbstractC13671e.purchase(c0560e3, this.Signature.ad);
        }
        purchase.smaato((ExecutorC4614e) this.appmetrica.f25751e, new C13391e(this, c0560e));
    }
}
